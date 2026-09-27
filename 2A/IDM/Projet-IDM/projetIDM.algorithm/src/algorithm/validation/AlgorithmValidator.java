package algorithm.validation;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import algorithm.Algorithm;
import algorithm.Catalogue;
import algorithm.Documentation;
import algorithm.Input;
import algorithm.Output;
import algorithm.OutputColumn;
import algorithm.OutputSimple;
import algorithm.Ressource;
import algorithm.RessourceFamilyElement;
import algorithm.util.AlgorithmSwitch;

public class AlgorithmValidator extends AlgorithmSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public AlgorithmValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		Iterator<EObject> resources = resource.getAllContents();
		
		while (resources.hasNext()) {
			this.doSwitch(resources.next());
		}
		
		return this.result;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un Algorithm.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseAlgorithm(Algorithm object) {
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'algorithme ne respecte pas les conventions Java");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un Catalogue.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseCatalogue(Catalogue object) {
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du catalogue ne respecte pas les conventions Java");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Documentation.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseDocumentation(Documentation object) {
		this.result.recordIfFailed(
				!(object.getText() == null || object.getText().isBlank()),
				object,
				"Le texte de la documentation ne doit pas être vide");
		
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
		this.result.recordIfFailed(
				(object.getType() == object.getColumn().getType()),
				object,
				"Le type réel de la colonne (" + object.getColumn().getType().toString() + ") et le type indiqué ("
				+ object.getType().toString() + ") sont différents");
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
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un OutputColumn.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOutputColumn(OutputColumn object) {
		this.result.recordIfFailed(
				(object.getType() == object.getColumn().getType()),
				object,
				"Le type réel de la colonne (" + object.getColumn().getType().toString() + ") et le type indiqué ("
				+ object.getType().toString() + ") sont différents");
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un OutputSimple.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseOutputSimple(OutputSimple object) {
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Ressource.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseRessource(Ressource object) {
		this.result.recordIfFailed(
				!(object.getPath() == null || object.getPath().isBlank()),
				object,
				"Le path de la ressource doit être indiqué");
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un RessourceFamilyElement.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseRessourceFamilyElement(RessourceFamilyElement object) {
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du ressourceFamilyElement ne respecte pas les conventions Java");
		
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