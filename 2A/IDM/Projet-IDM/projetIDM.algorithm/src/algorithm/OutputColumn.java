/**
 */
package algorithm;

import table.Column;
import table.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.OutputColumn#getType <em>Type</em>}</li>
 *   <li>{@link algorithm.OutputColumn#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getOutputColumn()
 * @model
 * @generated
 */
public interface OutputColumn extends Output {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link table.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see table.Type
	 * @see #setType(Type)
	 * @see algorithm.AlgorithmPackage#getOutputColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link algorithm.OutputColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see table.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see algorithm.AlgorithmPackage#getOutputColumn_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link algorithm.OutputColumn#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

} // OutputColumn
