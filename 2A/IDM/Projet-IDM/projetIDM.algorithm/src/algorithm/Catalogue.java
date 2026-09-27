/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Catalogue#getName <em>Name</em>}</li>
 *   <li>{@link algorithm.Catalogue#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see algorithm.AlgorithmPackage#getCatalogue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link algorithm.Catalogue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ressourcefamilyelements</b></em>' containment reference list.
	 * The list contents are of type {@link algorithm.RessourceFamilyElement}.
	 * It is bidirectional and its opposite is '{@link algorithm.RessourceFamilyElement#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressourcefamilyelements</em>' containment reference list.
	 * @see algorithm.AlgorithmPackage#getCatalogue_Ressourcefamilyelements()
	 * @see algorithm.RessourceFamilyElement#getCatalogue
	 * @model opposite="catalogue" containment="true"
	 * @generated
	 */
	EList<RessourceFamilyElement> getRessourcefamilyelements();

} // Catalogue
