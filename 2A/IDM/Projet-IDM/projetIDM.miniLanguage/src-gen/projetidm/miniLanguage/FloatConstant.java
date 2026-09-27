/**
 */
package projetidm.miniLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.FloatConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getFloatConstant()
 * @model
 * @generated
 */
public interface FloatConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getFloatConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.FloatConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // FloatConstant
