/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Ressource#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}</li>
 *   <li>{@link algorithm.Ressource#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.Ressource#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Ressourcefamilyelements</b></em>' reference list.
	 * The list contents are of type {@link algorithm.RessourceFamilyElement}.
	 * It is bidirectional and its opposite is '{@link algorithm.RessourceFamilyElement#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressourcefamilyelements</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getRessource_Ressourcefamilyelements()
	 * @see algorithm.RessourceFamilyElement#getRessources
	 * @model opposite="ressources"
	 * @generated
	 */
	EList<RessourceFamilyElement> getRessourcefamilyelements();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference list.
	 * The list contents are of type {@link algorithm.Algorithm}.
	 * It is bidirectional and its opposite is '{@link algorithm.Algorithm#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getRessource_Algorithm()
	 * @see algorithm.Algorithm#getRessource
	 * @model opposite="ressource" required="true"
	 * @generated
	 */
	EList<Algorithm> getAlgorithm();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see algorithm.AlgorithmPackage#getRessource_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link algorithm.Ressource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Ressource
