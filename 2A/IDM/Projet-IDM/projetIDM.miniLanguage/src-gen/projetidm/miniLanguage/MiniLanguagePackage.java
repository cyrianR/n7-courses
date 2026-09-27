/**
 */
package projetidm.miniLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projetidm.miniLanguage.MiniLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface MiniLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "miniLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/miniLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "miniLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniLanguagePackage eINSTANCE = projetidm.miniLanguage.impl.MiniLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.MiniLanguageImpl <em>Mini Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.MiniLanguageImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getMiniLanguage()
	 * @generated
	 */
	int MINI_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Mini Language Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Mini Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_LANGUAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mini Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.MiniLanguageElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.MiniLanguageElementImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getMiniLanguageElement()
	 * @generated
	 */
	int MINI_LANGUAGE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_LANGUAGE_ELEMENT__MINILANGUAGE = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_LANGUAGE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_LANGUAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.InputImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Return</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__RETURN = 3;

	/**
	 * The feature id for the '<em><b>Operation Binaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPERATION_BINAIRE = 4;

	/**
	 * The feature id for the '<em><b>Operation Unaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPERATION_UNAIRE = 5;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.OutputImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Operation Binaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OPERATION_BINAIRE = 3;

	/**
	 * The feature id for the '<em><b>Operation Unaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OPERATION_UNAIRE = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PARAMETER = 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.OperationUnaireImpl <em>Operation Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.OperationUnaireImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getOperationUnaire()
	 * @generated
	 */
	int OPERATION_UNAIRE = 4;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__MINILANGUAGE = MINI_LANGUAGE_ELEMENT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__OUTPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__INPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__OPERATION = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE_FEATURE_COUNT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE_OPERATION_COUNT = MINI_LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.OperationBinaireImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getOperationBinaire()
	 * @generated
	 */
	int OPERATION_BINAIRE = 5;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__MINILANGUAGE = MINI_LANGUAGE_ELEMENT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__OUTPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__INPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__OPERATION = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_FEATURE_COUNT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_OPERATION_COUNT = MINI_LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.ConstantImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__MINILANGUAGE = MINI_LANGUAGE_ELEMENT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__OUTPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = MINI_LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.IntegerConstantImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 7;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__MINILANGUAGE = CONSTANT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__OUTPUT = CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.FloatConstantImpl <em>Float Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.FloatConstantImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getFloatConstant()
	 * @generated
	 */
	int FLOAT_CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT__MINILANGUAGE = CONSTANT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT__OUTPUT = CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.StringConstantImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__MINILANGUAGE = CONSTANT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__OUTPUT = CONSTANT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.ParameterImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MINILANGUAGE = MINI_LANGUAGE_ELEMENT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OUTPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = MINI_LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.impl.ReturnImpl
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 11;

	/**
	 * The feature id for the '<em><b>Minilanguage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__MINILANGUAGE = MINI_LANGUAGE_ELEMENT__MINILANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NAME = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__INPUT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = MINI_LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = MINI_LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.Type
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 12;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.EnumOperationUnaire <em>Enum Operation Unaire</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.EnumOperationUnaire
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getEnumOperationUnaire()
	 * @generated
	 */
	int ENUM_OPERATION_UNAIRE = 13;

	/**
	 * The meta object id for the '{@link projetidm.miniLanguage.EnumOperationBinaire <em>Enum Operation Binaire</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetidm.miniLanguage.EnumOperationBinaire
	 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getEnumOperationBinaire()
	 * @generated
	 */
	int ENUM_OPERATION_BINAIRE = 14;

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.MiniLanguage <em>Mini Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mini Language</em>'.
	 * @see projetidm.miniLanguage.MiniLanguage
	 * @generated
	 */
	EClass getMiniLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link projetidm.miniLanguage.MiniLanguage#getMiniLanguageElement <em>Mini Language Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mini Language Element</em>'.
	 * @see projetidm.miniLanguage.MiniLanguage#getMiniLanguageElement()
	 * @see #getMiniLanguage()
	 * @generated
	 */
	EReference getMiniLanguage_MiniLanguageElement();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.MiniLanguageElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see projetidm.miniLanguage.MiniLanguageElement
	 * @generated
	 */
	EClass getMiniLanguageElement();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.MiniLanguageElement#getMinilanguage <em>Minilanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Minilanguage</em>'.
	 * @see projetidm.miniLanguage.MiniLanguageElement#getMinilanguage()
	 * @see #getMiniLanguageElement()
	 * @generated
	 */
	EReference getMiniLanguageElement_Minilanguage();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see projetidm.miniLanguage.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link projetidm.miniLanguage.Input#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see projetidm.miniLanguage.Input#getOutput()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Output();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projetidm.miniLanguage.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetidm.miniLanguage.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.Input#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Return</em>'.
	 * @see projetidm.miniLanguage.Input#getReturn()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Return();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.Input#getOperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Binaire</em>'.
	 * @see projetidm.miniLanguage.Input#getOperationBinaire()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_OperationBinaire();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.Input#getOperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Unaire</em>'.
	 * @see projetidm.miniLanguage.Input#getOperationUnaire()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_OperationUnaire();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see projetidm.miniLanguage.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference list '{@link projetidm.miniLanguage.Output#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see projetidm.miniLanguage.Output#getInput()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Input();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projetidm.miniLanguage.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetidm.miniLanguage.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.Output#getOperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Binaire</em>'.
	 * @see projetidm.miniLanguage.Output#getOperationBinaire()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_OperationBinaire();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.Output#getOperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Unaire</em>'.
	 * @see projetidm.miniLanguage.Output#getOperationUnaire()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_OperationUnaire();

	/**
	 * Returns the meta object for the container reference '{@link projetidm.miniLanguage.Output#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parameter</em>'.
	 * @see projetidm.miniLanguage.Output#getParameter()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Parameter();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.OperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Unaire</em>'.
	 * @see projetidm.miniLanguage.OperationUnaire
	 * @generated
	 */
	EClass getOperationUnaire();

	/**
	 * Returns the meta object for the containment reference '{@link projetidm.miniLanguage.OperationUnaire#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see projetidm.miniLanguage.OperationUnaire#getOutput()
	 * @see #getOperationUnaire()
	 * @generated
	 */
	EReference getOperationUnaire_Output();

	/**
	 * Returns the meta object for the containment reference '{@link projetidm.miniLanguage.OperationUnaire#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see projetidm.miniLanguage.OperationUnaire#getInput()
	 * @see #getOperationUnaire()
	 * @generated
	 */
	EReference getOperationUnaire_Input();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.OperationUnaire#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see projetidm.miniLanguage.OperationUnaire#getOperation()
	 * @see #getOperationUnaire()
	 * @generated
	 */
	EAttribute getOperationUnaire_Operation();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.OperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Binaire</em>'.
	 * @see projetidm.miniLanguage.OperationBinaire
	 * @generated
	 */
	EClass getOperationBinaire();

	/**
	 * Returns the meta object for the containment reference '{@link projetidm.miniLanguage.OperationBinaire#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see projetidm.miniLanguage.OperationBinaire#getOutput()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EReference getOperationBinaire_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link projetidm.miniLanguage.OperationBinaire#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see projetidm.miniLanguage.OperationBinaire#getInput()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EReference getOperationBinaire_Input();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.OperationBinaire#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see projetidm.miniLanguage.OperationBinaire#getOperation()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EAttribute getOperationBinaire_Operation();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see projetidm.miniLanguage.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the containment reference '{@link projetidm.miniLanguage.Constant#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see projetidm.miniLanguage.Constant#getOutput()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Output();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see projetidm.miniLanguage.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetidm.miniLanguage.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.FloatConstant <em>Float Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Constant</em>'.
	 * @see projetidm.miniLanguage.FloatConstant
	 * @generated
	 */
	EClass getFloatConstant();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.FloatConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetidm.miniLanguage.FloatConstant#getValue()
	 * @see #getFloatConstant()
	 * @generated
	 */
	EAttribute getFloatConstant_Value();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see projetidm.miniLanguage.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetidm.miniLanguage.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see projetidm.miniLanguage.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetidm.miniLanguage.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link projetidm.miniLanguage.Parameter#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see projetidm.miniLanguage.Parameter#getOutput()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Output();

	/**
	 * Returns the meta object for class '{@link projetidm.miniLanguage.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see projetidm.miniLanguage.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link projetidm.miniLanguage.Return#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetidm.miniLanguage.Return#getName()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Name();

	/**
	 * Returns the meta object for the containment reference '{@link projetidm.miniLanguage.Return#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see projetidm.miniLanguage.Return#getInput()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Input();

	/**
	 * Returns the meta object for enum '{@link projetidm.miniLanguage.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see projetidm.miniLanguage.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link projetidm.miniLanguage.EnumOperationUnaire <em>Enum Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Operation Unaire</em>'.
	 * @see projetidm.miniLanguage.EnumOperationUnaire
	 * @generated
	 */
	EEnum getEnumOperationUnaire();

	/**
	 * Returns the meta object for enum '{@link projetidm.miniLanguage.EnumOperationBinaire <em>Enum Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Operation Binaire</em>'.
	 * @see projetidm.miniLanguage.EnumOperationBinaire
	 * @generated
	 */
	EEnum getEnumOperationBinaire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiniLanguageFactory getMiniLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.MiniLanguageImpl <em>Mini Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.MiniLanguageImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getMiniLanguage()
		 * @generated
		 */
		EClass MINI_LANGUAGE = eINSTANCE.getMiniLanguage();

		/**
		 * The meta object literal for the '<em><b>Mini Language Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT = eINSTANCE.getMiniLanguage_MiniLanguageElement();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.MiniLanguageElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.MiniLanguageElementImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getMiniLanguageElement()
		 * @generated
		 */
		EClass MINI_LANGUAGE_ELEMENT = eINSTANCE.getMiniLanguageElement();

		/**
		 * The meta object literal for the '<em><b>Minilanguage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_LANGUAGE_ELEMENT__MINILANGUAGE = eINSTANCE.getMiniLanguageElement_Minilanguage();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.InputImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OUTPUT = eINSTANCE.getInput_Output();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__RETURN = eINSTANCE.getInput_Return();

		/**
		 * The meta object literal for the '<em><b>Operation Binaire</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OPERATION_BINAIRE = eINSTANCE.getInput_OperationBinaire();

		/**
		 * The meta object literal for the '<em><b>Operation Unaire</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OPERATION_UNAIRE = eINSTANCE.getInput_OperationUnaire();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.OutputImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__INPUT = eINSTANCE.getOutput_Input();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Operation Binaire</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OPERATION_BINAIRE = eINSTANCE.getOutput_OperationBinaire();

		/**
		 * The meta object literal for the '<em><b>Operation Unaire</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OPERATION_UNAIRE = eINSTANCE.getOutput_OperationUnaire();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__PARAMETER = eINSTANCE.getOutput_Parameter();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.OperationUnaireImpl <em>Operation Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.OperationUnaireImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getOperationUnaire()
		 * @generated
		 */
		EClass OPERATION_UNAIRE = eINSTANCE.getOperationUnaire();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_UNAIRE__OUTPUT = eINSTANCE.getOperationUnaire_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_UNAIRE__INPUT = eINSTANCE.getOperationUnaire_Input();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_UNAIRE__OPERATION = eINSTANCE.getOperationUnaire_Operation();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.OperationBinaireImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getOperationBinaire()
		 * @generated
		 */
		EClass OPERATION_BINAIRE = eINSTANCE.getOperationBinaire();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINAIRE__OUTPUT = eINSTANCE.getOperationBinaire_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINAIRE__INPUT = eINSTANCE.getOperationBinaire_Input();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_BINAIRE__OPERATION = eINSTANCE.getOperationBinaire_Operation();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.ConstantImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__OUTPUT = eINSTANCE.getConstant_Output();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.IntegerConstantImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.FloatConstantImpl <em>Float Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.FloatConstantImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getFloatConstant()
		 * @generated
		 */
		EClass FLOAT_CONSTANT = eINSTANCE.getFloatConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_CONSTANT__VALUE = eINSTANCE.getFloatConstant_Value();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.StringConstantImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.ParameterImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OUTPUT = eINSTANCE.getParameter_Output();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.impl.ReturnImpl
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__NAME = eINSTANCE.getReturn_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__INPUT = eINSTANCE.getReturn_Input();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.Type
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.EnumOperationUnaire <em>Enum Operation Unaire</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.EnumOperationUnaire
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getEnumOperationUnaire()
		 * @generated
		 */
		EEnum ENUM_OPERATION_UNAIRE = eINSTANCE.getEnumOperationUnaire();

		/**
		 * The meta object literal for the '{@link projetidm.miniLanguage.EnumOperationBinaire <em>Enum Operation Binaire</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetidm.miniLanguage.EnumOperationBinaire
		 * @see projetidm.miniLanguage.impl.MiniLanguagePackageImpl#getEnumOperationBinaire()
		 * @generated
		 */
		EEnum ENUM_OPERATION_BINAIRE = eINSTANCE.getEnumOperationBinaire();

	}

} //MiniLanguagePackage
