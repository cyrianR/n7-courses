/**
 */
package projetidm.miniLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.Constant#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getConstant()
 * @model abstract="true"
 * @generated
 */
public interface Constant extends MiniLanguageElement {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getConstant_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Constant#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // Constant
