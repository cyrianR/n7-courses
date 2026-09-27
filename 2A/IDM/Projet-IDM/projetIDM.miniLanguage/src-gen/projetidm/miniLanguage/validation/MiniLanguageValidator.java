package projetidm.miniLanguage.validation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import projetidm.miniLanguage.Constant;
import projetidm.miniLanguage.EnumOperationBinaire;
import projetidm.miniLanguage.EnumOperationUnaire;
import projetidm.miniLanguage.Input;
import projetidm.miniLanguage.MiniLanguage;
import projetidm.miniLanguage.MiniLanguageElement;
import projetidm.miniLanguage.OperationBinaire;
import projetidm.miniLanguage.OperationUnaire;
import projetidm.miniLanguage.Output;
import projetidm.miniLanguage.Parameter;
import projetidm.miniLanguage.Return;
import projetidm.miniLanguage.Type;
import projetidm.miniLanguage.MiniLanguagePackage;
import projetidm.miniLanguage.util.MiniLanguageSwitch;

public class MiniLanguageValidator extends MiniLanguageSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Opérations unaires valides selon leur types d'entrée et de sortie
	 */
	private static final Map<EnumOperationUnaire, Type[][]> operationsUnairesValides = new HashMap<EnumOperationUnaire, Type[][]>(); 
	
	/**
	 * Opérations binaires valides selon leur types d'entrée et de sortie
	 */
	private static final Map<EnumOperationBinaire, Type[][]> operationsBinairesValides = new HashMap<EnumOperationBinaire, Type[][]>(); 
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public MiniLanguageValidator() {
		
		// enregistrer les duos de types possibles pour chaque operation unaire (une entrée et une sortie)
		Type[][] sumUnaireTypes = {{Type.STRCOL, Type.STR},{Type.INTCOL, Type.INT}, {Type.FLTCOL, Type.FLT}};
		Type[][] productUnaireTypes = {{Type.INTCOL, Type.INT}, {Type.FLTCOL, Type.FLT}};
		Type[][] minimumUnaireTypes = {{Type.INTCOL, Type.INT}, {Type.FLTCOL, Type.FLT}};
		Type[][] maximumUnaireTypes = {{Type.INTCOL, Type.INT}, {Type.FLTCOL, Type.FLT}};
		Type[][] oppositeUnaireTypes = {{Type.INTCOL, Type.INTCOL}, {Type.FLTCOL, Type.FLTCOL},{Type.INT, Type.INT}, {Type.FLT, Type.FLT}};
		Type[][] cosinusUnaireTypes = {{Type.INTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.FLTCOL},{Type.INT, Type.FLT}, {Type.FLT, Type.FLT}};
		Type[][] sinusUnaireTypes = {{Type.INTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.FLTCOL},{Type.INT, Type.FLT}, {Type.FLT, Type.FLT}};
		Type[][] sqrtUnaireTypes = {{Type.INTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.FLTCOL},{Type.INT, Type.FLT}, {Type.FLT, Type.FLT}};
		Type[][] exponentialUnaireTypes = {{Type.INTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.FLTCOL},{Type.INT, Type.FLT}, {Type.FLT, Type.FLT}};
		operationsUnairesValides.put(EnumOperationUnaire.SUM, sumUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.PRODUCT, productUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.MINIMUM, minimumUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.MAXIMUM, maximumUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.OPPOSITE, oppositeUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.COSINUS, cosinusUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.SINUS, sinusUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.SQRT, sqrtUnaireTypes);
		operationsUnairesValides.put(EnumOperationUnaire.EXPONENTIAL, exponentialUnaireTypes);
		
		// enregistrer les trios de types possibles pour chaque operation binaire (deux entrées et une sortie)
		Type[][] sumBinaireTypes = {{Type.STRCOL, Type.STRCOL, Type.STRCOL}, {Type.INTCOL, Type.INTCOL, Type.INTCOL}, {Type.FLTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.STRCOL, Type.STR, Type.STRCOL}, {Type.INTCOL, Type.INT, Type.INTCOL}, {Type.FLTCOL, Type.FLT, Type.FLTCOL},
				{Type.STR, Type.STRCOL, Type.STRCOL}, {Type.INT, Type.INTCOL, Type.INTCOL}, {Type.FLT, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.INTCOL, Type.FLTCOL},
				{Type.INT, Type.FLTCOL, Type.FLTCOL}, {Type.FLT, Type.INTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLT, Type.INTCOL}, {Type.FLTCOL, Type.INT, Type.FLTCOL},
				{Type.INT, Type.INT, Type.INT}, {Type.FLT, Type.FLT, Type.FLT},
				{Type.FLT, Type.INT, Type.FLT}, {Type.INT, Type.FLT, Type.FLT}};
		Type[][] productBinaireTypes = {{Type.INTCOL, Type.INTCOL, Type.INTCOL}, {Type.FLTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.INT, Type.INTCOL}, {Type.FLTCOL, Type.FLT, Type.FLTCOL},
				{Type.INT, Type.INTCOL, Type.INTCOL}, {Type.FLT, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.INTCOL, Type.FLTCOL},
				{Type.INT, Type.FLTCOL, Type.FLTCOL}, {Type.FLT, Type.INTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLT, Type.FLTCOL}, {Type.FLTCOL, Type.INT, Type.FLTCOL},
				{Type.INT, Type.INT, Type.INT}, {Type.FLT, Type.FLT, Type.FLT},
				{Type.FLT, Type.INT, Type.FLT}, {Type.INT, Type.FLT, Type.FLT}};
		Type[][] minimumBinaireTypes = {{Type.INTCOL, Type.INT, Type.INTCOL}, {Type.FLTCOL, Type.FLT, Type.FLTCOL},
				{Type.INT, Type.INTCOL, Type.INTCOL}, {Type.FLT, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.INTCOL, Type.INTCOL}, {Type.FLTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLT, Type.FLTCOL}, {Type.FLTCOL, Type.INT, Type.FLTCOL},
				{Type.INT, Type.FLTCOL, Type.FLTCOL}, {Type.FLT, Type.INTCOL, Type.FLTCOL},
				{Type.FLTCOL, Type.INTCOL, Type.FLTCOL}, {Type.INTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INT, Type.INT, Type.INT}, {Type.FLT, Type.FLT, Type.FLT},
				{Type.FLT, Type.INT, Type.FLT}, {Type.INT, Type.FLT, Type.FLT}};
		Type[][] maximumBinaireTypes = {{Type.INTCOL, Type.INT, Type.INTCOL}, {Type.FLTCOL, Type.FLT, Type.FLTCOL},
				{Type.INT, Type.INTCOL, Type.INTCOL}, {Type.FLT, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.INTCOL, Type.INTCOL}, {Type.FLTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLT, Type.FLTCOL}, {Type.FLTCOL, Type.INT, Type.FLTCOL},
				{Type.INT, Type.FLTCOL, Type.FLTCOL}, {Type.FLT, Type.INTCOL, Type.FLTCOL},
				{Type.FLTCOL, Type.INTCOL, Type.FLTCOL}, {Type.INTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INT, Type.INT, Type.INT}, {Type.FLT, Type.FLT, Type.FLT},
				{Type.FLT, Type.INT, Type.FLT}, {Type.INT, Type.FLT, Type.FLT}};
		Type[][] divisionBinaireTypes = {{Type.INTCOL, Type.INT, Type.FLTCOL}, {Type.FLTCOL, Type.FLT, Type.FLTCOL},
				{Type.INT, Type.INTCOL, Type.FLTCOL}, {Type.FLT, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.INTCOL, Type.FLTCOL}, {Type.FLTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INTCOL, Type.FLT, Type.FLTCOL}, {Type.FLTCOL, Type.INT, Type.FLTCOL},
				{Type.INT, Type.FLTCOL, Type.FLTCOL}, {Type.FLT, Type.INTCOL, Type.FLTCOL},
				{Type.FLTCOL, Type.INTCOL, Type.FLTCOL}, {Type.INTCOL, Type.FLTCOL, Type.FLTCOL},
				{Type.INT, Type.INT, Type.FLT}, {Type.FLT, Type.FLT, Type.FLT},
				{Type.FLT, Type.INT, Type.FLT}, {Type.INT, Type.FLT, Type.FLT}};
		operationsBinairesValides.put(EnumOperationBinaire.SUM, sumBinaireTypes);
		operationsBinairesValides.put(EnumOperationBinaire.PRODUCT, productBinaireTypes);
		operationsBinairesValides.put(EnumOperationBinaire.MINIMUM, minimumBinaireTypes);
		operationsBinairesValides.put(EnumOperationBinaire.MAXIMUM, maximumBinaireTypes);
		operationsBinairesValides.put(EnumOperationBinaire.DIVISION, divisionBinaireTypes);
		
	}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un MiniLanguage.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseMiniLanguage(MiniLanguage object) {
		// Contraintes sur MiniLanguage
		
		// il y a exactement un retour dans un MiniLanguage
		this.result.recordIfFailed(
				object.getMiniLanguageElement().stream()
				.filter(e -> e.eClass().getClassifierID() == MiniLanguagePackage.RETURN)
				.count() == 1,
				object,
				"Il n'y a pas exactement un retour dans le miniLanguage");
		
		// Visite
		for (MiniLanguageElement e : object.getMiniLanguageElement()) {
			this.doSwitch(e);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un MiniLanguageElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseMiniLanguageElement(MiniLanguageElement object) {
		// contraintes de MiniLanguageElement
		
		
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une OperationBinaire.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOperationBinaire(OperationBinaire object) {
		// Contraintes sur OperationBinaire
		
		boolean hasFirstInput = object.getInput().get(0) != null;
		boolean hasSecondInput = object.getInput().get(1) != null;
		boolean hasOutput = object.getOutput() != null;
		boolean typesValides = false;
		
		if (hasFirstInput && hasSecondInput && hasOutput) {
			for (Type[] tripletType : operationsBinairesValides.get(object.getOperation())) {
				if (tripletType[0] == object.getInput().get(0).getType() &&
						tripletType[1] == object.getInput().get(1).getType() &&
						tripletType[2] == object.getOutput().getType()) {
					typesValides = true;
					break;
				}
			}
		}
		
		// une opération unaire a deux inputs
		this.result.recordIfFailed(hasFirstInput && hasSecondInput, object, "L'opération " + object.getOperation().getName() + " n'a pas deux entrées.");
		
		// une opération unaire a un output
		this.result.recordIfFailed(hasOutput, object, "L'opération " + object.getOperation().getName() + " n'a pas de sortie.");
		
		// une opération unaire doit avoir des types d'entrée et de sortie conformes à l'opération en question
		this.result.recordIfFailed(typesValides,
				object,
				"L'opération " + object.getOperation().getName() + " possédant les types d'entrés " +
				object.getInput().get(0).getName() + " et " + object.getInput().get(1).getName() + " et le type de sortie " +
				object.getOutput().getType().getName() + " n'existe pas.");
				
		// les deux entrées d'une opération binaire doivent être reliées à des sorties du même type
		this.result.recordIfFailed(object.getInput().get(0).getType() == object.getInput().get(0).getOutput().getType() &&
				object.getInput().get(1).getType() == object.getInput().get(1).getOutput().getType(),
				object,
				"L'opération binaire " + object.getOperation().getName() + " possède une entrée dont le type ne correspond pas au type de la sortie associée.");
		
		// la sortie d'une opération binaire doit être reliée à des entrées du même type
		this.result.recordIfFailed(object.getOutput().getInput().stream().allMatch(i -> (i.getType() == object.getOutput().getType())),
				object,
				"L'opération binaire " + object.getOperation().getName() + " possède une sortie dont le type ne correspond pas au type d'une des entrées associées.");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une OperationUnaire.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOperationUnaire(OperationUnaire object) {
		// Contraintes sur OperationUnaire
		
		boolean hasInput = object.getInput() != null;
		boolean hasOutput = object.getOutput() != null;
		boolean typesValides = false;
		
		if (hasInput && hasOutput) {
			for (Type[] coupleType : operationsUnairesValides.get(object.getOperation())) {
				if (coupleType[0] == object.getInput().getType() && coupleType[1] == object.getOutput().getType()) {
					typesValides = true;
					break;
				}
			}
		}
		
		// une opération unaire a un input
		this.result.recordIfFailed(hasInput, object, "L'opération " + object.getOperation().getName() + " n'a pas d'entrée.");
		
		// une opération unaire a un output
		this.result.recordIfFailed(hasOutput, object, "L'opération " + object.getOperation().getName() + " n'a pas de sortie.");
		
		// une opération unaire doit avoir des types d'entrée et de sortie conformes à l'opération en question
		this.result.recordIfFailed(typesValides,
				object,
				"L'opération " + object.getOperation().getName() + " possédant le type d'entré " +
				object.getInput().getType().getName() + " et le type de sortie " +
				object.getOutput().getType().getName() + " n'existe pas.");
		
		// la sortie d'une opération unaire doit être reliée à des entrées du même type
		this.result.recordIfFailed(object.getOutput().getInput().stream().allMatch(i -> (i.getType() == object.getOutput().getType())),
				object,
				"L'opération unaire " + object.getOperation().getName() + " possède une sortie dont le type ne correspond pas au type d'une des entrées associées.");
		
		// l'entrée d'une opération unaire doit être reliée à une sortie du même type
		this.result.recordIfFailed(object.getInput().getType() == object.getInput().getOutput().getType(),
				object,
				"L'opération unaire " + object.getOperation().getName() + " possède une entrée dont le type ne correspond pas au type de la sortie associée.");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Constant.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseConstant(Constant object) {
		// contraintes sur constante
		
		// une constante doit avoir une sortie qui est de type STR, INT ou FLT
		this.result.recordIfFailed(
				object.getOutput().getType() == Type.FLT ||
				object.getOutput().getType() == Type.INT ||
				object.getOutput().getType() == Type.STR,
				object,
				"");
		
		// la sortie d'une constante doit être reliée à des entrées du même type
		this.result.recordIfFailed(object.getOutput().getInput().stream().allMatch(i -> (i.getType() == object.getOutput().getType())),
				object,
				"Une constante possède une sortie dont le type ne correspond pas au type d'une des entrées associées.");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Parameter.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseParameter(Parameter object) {
		// contraintes sur Parameter
		
		// le nom du parametre doit exister et ne pas être vide
		this.result.recordIfFailed(
				object.getName() != null || !object.getName().isBlank() || !object.getName().isEmpty(), 
				object, 
				"Le nom du parametre n'existe pas ou est vide");
				
		// respect des conventions java pour le nom d'un parametre
		this.result.recordIfFailed(
				object.getName() != null || object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du parametre ne respecte pas les conventions Java");
		
		// la sortie d'un parametre doit être reliée à des entrées du même type
		this.result.recordIfFailed(object.getOutput().getInput().stream().allMatch(i -> (i.getType() == object.getOutput().getType())),
				object,
				"Le parametre " + object.getName() + " possède une sortie dont le type ne correspond pas au type d'une des entrées associées.");
				
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Return.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseReturn(Return object) {
		// contraintes sur Return
		
		// le nom du retour doit exister et ne pas être vide
		this.result.recordIfFailed(
				object.getName() != null || !object.getName().isBlank() || !object.getName().isEmpty(), 
				object, 
				"Le nom du retour n'existe pas ou est vide");
		
		// respect des conventions java pour le nom d'un retour
		this.result.recordIfFailed(
				object.getName() != null || object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du retour ne respecte pas les conventions Java");
		
		// l'entrée d'un retour doit être reliée à une sortie du même type
		this.result.recordIfFailed(object.getInput().getType() == object.getInput().getOutput().getType(),
				object,
				"Le retour " + object.getName() + " possède une sortie dont le type ne correspond pas au type de l'entrée associée.");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un Output.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOutput(Output object) {
		// contraintes sur Output
		
		EObject[] containers = {object.getParameter(),object.getOperationBinaire(),object.getOperationUnaire()};
		
		// une sortie ne doit être contenue que par un seul élément du mini language
		this.result.recordIfFailed(
				Arrays.asList(containers).stream().filter(e -> e != null).count() == 1,
				object,
				"Une sortie ne doit être contenue que par un seul élément du mini language.");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un Input.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseInput(Input object) {
		// contraintes sur Input
		
		EObject[] containers = {object.getReturn(),object.getOperationBinaire(),object.getOperationUnaire()};
		
		// une entrée ne doit être contenue que par un seul élément du mini language
		this.result.recordIfFailed(
				Arrays.asList(containers).stream().filter(e -> e != null).count() == 1,
				object,
				"Une entrée ne doit être contenue que par un seul élément du mini language.");
		
		return null;
	}

	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}