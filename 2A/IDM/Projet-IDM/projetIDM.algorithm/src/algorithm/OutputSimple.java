/**
 */
package algorithm;

import table.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.OutputSimple#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getOutputSimple()
 * @model
 * @generated
 */
public interface OutputSimple extends Output {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link table.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see table.Type
	 * @see #setType(Type)
	 * @see algorithm.AlgorithmPackage#getOutputSimple_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link algorithm.OutputSimple#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see table.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // OutputSimple
