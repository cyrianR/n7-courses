/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Family Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.RessourceFamilyElement#getName <em>Name</em>}</li>
 *   <li>{@link algorithm.RessourceFamilyElement#getRessources <em>Ressources</em>}</li>
 *   <li>{@link algorithm.RessourceFamilyElement#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getRessourceFamilyElement()
 * @model
 * @generated
 */
public interface RessourceFamilyElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see algorithm.AlgorithmPackage#getRessourceFamilyElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link algorithm.RessourceFamilyElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ressources</b></em>' reference list.
	 * The list contents are of type {@link algorithm.Ressource}.
	 * It is bidirectional and its opposite is '{@link algorithm.Ressource#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getRessourceFamilyElement_Ressources()
	 * @see algorithm.Ressource#getRessourcefamilyelements
	 * @model opposite="ressourcefamilyelements"
	 * @generated
	 */
	EList<Ressource> getRessources();

	/**
	 * Returns the value of the '<em><b>Catalogue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Catalogue#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogue</em>' container reference.
	 * @see #setCatalogue(Catalogue)
	 * @see algorithm.AlgorithmPackage#getRessourceFamilyElement_Catalogue()
	 * @see algorithm.Catalogue#getRessourcefamilyelements
	 * @model opposite="ressourcefamilyelements" required="true" transient="false"
	 * @generated
	 */
	Catalogue getCatalogue();

	/**
	 * Sets the value of the '{@link algorithm.RessourceFamilyElement#getCatalogue <em>Catalogue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue</em>' container reference.
	 * @see #getCatalogue()
	 * @generated
	 */
	void setCatalogue(Catalogue value);

} // RessourceFamilyElement
