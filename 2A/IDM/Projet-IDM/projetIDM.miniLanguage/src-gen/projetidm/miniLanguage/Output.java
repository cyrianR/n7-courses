/**
 */
package projetidm.miniLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.Output#getInput <em>Input</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Output#getType <em>Type</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Output#getName <em>Name</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Output#getOperationBinaire <em>Operation Binaire</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Output#getOperationUnaire <em>Operation Unaire</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Output#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link projetidm.miniLanguage.Input}.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Input#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput_Input()
	 * @see projetidm.miniLanguage.Input#getOutput
	 * @model opposite="output" required="true"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link projetidm.miniLanguage.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see projetidm.miniLanguage.Type
	 * @see #setType(Type)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Output#getType <em>Type</em>}' attribute.
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
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Output#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Binaire</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.OperationBinaire#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Binaire</em>' container reference.
	 * @see #setOperationBinaire(OperationBinaire)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput_OperationBinaire()
	 * @see projetidm.miniLanguage.OperationBinaire#getOutput
	 * @model opposite="output" transient="false"
	 * @generated
	 */
	OperationBinaire getOperationBinaire();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Output#getOperationBinaire <em>Operation Binaire</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Binaire</em>' container reference.
	 * @see #getOperationBinaire()
	 * @generated
	 */
	void setOperationBinaire(OperationBinaire value);

	/**
	 * Returns the value of the '<em><b>Operation Unaire</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.OperationUnaire#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Unaire</em>' container reference.
	 * @see #setOperationUnaire(OperationUnaire)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput_OperationUnaire()
	 * @see projetidm.miniLanguage.OperationUnaire#getOutput
	 * @model opposite="output" transient="false"
	 * @generated
	 */
	OperationUnaire getOperationUnaire();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Output#getOperationUnaire <em>Operation Unaire</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Unaire</em>' container reference.
	 * @see #getOperationUnaire()
	 * @generated
	 */
	void setOperationUnaire(OperationUnaire value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Parameter#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' container reference.
	 * @see #setParameter(Parameter)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOutput_Parameter()
	 * @see projetidm.miniLanguage.Parameter#getOutput
	 * @model opposite="output" transient="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Output#getParameter <em>Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' container reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // Output
