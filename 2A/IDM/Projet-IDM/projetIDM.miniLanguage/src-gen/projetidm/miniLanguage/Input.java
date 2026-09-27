/**
 */
package projetidm.miniLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.Input#getOutput <em>Output</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Input#getType <em>Type</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Input#getName <em>Name</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Input#getReturn <em>Return</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Input#getOperationBinaire <em>Operation Binaire</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Input#getOperationUnaire <em>Operation Unaire</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Output#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput_Output()
	 * @see projetidm.miniLanguage.Output#getInput
	 * @model opposite="input" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Input#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link projetidm.miniLanguage.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see projetidm.miniLanguage.Type
	 * @see #setType(Type)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see projetidm.miniLanguage.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Return#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' container reference.
	 * @see #setReturn(Return)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput_Return()
	 * @see projetidm.miniLanguage.Return#getInput
	 * @model opposite="input" transient="false"
	 * @generated
	 */
	Return getReturn();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Input#getReturn <em>Return</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' container reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Return value);

	/**
	 * Returns the value of the '<em><b>Operation Binaire</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.OperationBinaire#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Binaire</em>' container reference.
	 * @see #setOperationBinaire(OperationBinaire)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput_OperationBinaire()
	 * @see projetidm.miniLanguage.OperationBinaire#getInput
	 * @model opposite="input" transient="false"
	 * @generated
	 */
	OperationBinaire getOperationBinaire();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Input#getOperationBinaire <em>Operation Binaire</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Binaire</em>' container reference.
	 * @see #getOperationBinaire()
	 * @generated
	 */
	void setOperationBinaire(OperationBinaire value);

	/**
	 * Returns the value of the '<em><b>Operation Unaire</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.OperationUnaire#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Unaire</em>' container reference.
	 * @see #setOperationUnaire(OperationUnaire)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getInput_OperationUnaire()
	 * @see projetidm.miniLanguage.OperationUnaire#getInput
	 * @model opposite="input" transient="false"
	 * @generated
	 */
	OperationUnaire getOperationUnaire();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Input#getOperationUnaire <em>Operation Unaire</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Unaire</em>' container reference.
	 * @see #getOperationUnaire()
	 * @generated
	 */
	void setOperationUnaire(OperationUnaire value);

} // Input
