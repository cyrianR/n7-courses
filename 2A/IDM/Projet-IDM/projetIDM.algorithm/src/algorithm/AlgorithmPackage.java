/**
 */
package algorithm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see algorithm.AlgorithmFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://algorithm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmPackage eINSTANCE = algorithm.impl.AlgorithmPackageImpl.init();

	/**
	 * The meta object id for the '{@link algorithm.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.AlgorithmImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__RESSOURCE = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__DOCUMENTATION = 4;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.InputImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.OutputImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ALGORITHM = 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.OutputColumnImpl <em>Output Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.OutputColumnImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getOutputColumn()
	 * @generated
	 */
	int OUTPUT_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COLUMN__ALGORITHM = OUTPUT__ALGORITHM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COLUMN__TYPE = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COLUMN__COLUMN = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COLUMN_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COLUMN_OPERATION_COUNT = OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.DocumentationImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.RessourceFamilyElementImpl <em>Ressource Family Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.RessourceFamilyElementImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getRessourceFamilyElement()
	 * @generated
	 */
	int RESSOURCE_FAMILY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FAMILY_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ressources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FAMILY_ELEMENT__RESSOURCES = 1;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FAMILY_ELEMENT__CATALOGUE = 2;

	/**
	 * The number of structural features of the '<em>Ressource Family Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FAMILY_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ressource Family Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FAMILY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.CatalogueImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ressourcefamilyelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__RESSOURCEFAMILYELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithm.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.RessourceImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 6;

	/**
	 * The feature id for the '<em><b>Ressourcefamilyelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__RESSOURCEFAMILYELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__PATH = 2;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link algorithm.impl.OutputSimpleImpl <em>Output Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.impl.OutputSimpleImpl
	 * @see algorithm.impl.AlgorithmPackageImpl#getOutputSimple()
	 * @generated
	 */
	int OUTPUT_SIMPLE = 8;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SIMPLE__ALGORITHM = OUTPUT__ALGORITHM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SIMPLE__TYPE = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SIMPLE_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SIMPLE_OPERATION_COUNT = OUTPUT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link algorithm.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see algorithm.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.Algorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see algorithm.Algorithm#getName()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithm.Algorithm#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see algorithm.Algorithm#getInput()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Input();

	/**
	 * Returns the meta object for the containment reference '{@link algorithm.Algorithm#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see algorithm.Algorithm#getOutput()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Output();

	/**
	 * Returns the meta object for the reference '{@link algorithm.Algorithm#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ressource</em>'.
	 * @see algorithm.Algorithm#getRessource()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Ressource();

	/**
	 * Returns the meta object for the containment reference '{@link algorithm.Algorithm#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see algorithm.Algorithm#getDocumentation()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Documentation();

	/**
	 * Returns the meta object for class '{@link algorithm.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see algorithm.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algorithm.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the container reference '{@link algorithm.Input#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithm</em>'.
	 * @see algorithm.Input#getAlgorithm()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Algorithm();

	/**
	 * Returns the meta object for the reference '{@link algorithm.Input#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see algorithm.Input#getColumn()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Column();

	/**
	 * Returns the meta object for class '{@link algorithm.OutputColumn <em>Output Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Column</em>'.
	 * @see algorithm.OutputColumn
	 * @generated
	 */
	EClass getOutputColumn();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.OutputColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algorithm.OutputColumn#getType()
	 * @see #getOutputColumn()
	 * @generated
	 */
	EAttribute getOutputColumn_Type();

	/**
	 * Returns the meta object for the reference '{@link algorithm.OutputColumn#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see algorithm.OutputColumn#getColumn()
	 * @see #getOutputColumn()
	 * @generated
	 */
	EReference getOutputColumn_Column();

	/**
	 * Returns the meta object for class '{@link algorithm.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see algorithm.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the container reference '{@link algorithm.Output#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithm</em>'.
	 * @see algorithm.Output#getAlgorithm()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Algorithm();

	/**
	 * Returns the meta object for class '{@link algorithm.OutputSimple <em>Output Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Simple</em>'.
	 * @see algorithm.OutputSimple
	 * @generated
	 */
	EClass getOutputSimple();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.OutputSimple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algorithm.OutputSimple#getType()
	 * @see #getOutputSimple()
	 * @generated
	 */
	EAttribute getOutputSimple_Type();

	/**
	 * Returns the meta object for class '{@link algorithm.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see algorithm.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the container reference '{@link algorithm.Documentation#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithm</em>'.
	 * @see algorithm.Documentation#getAlgorithm()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.Documentation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see algorithm.Documentation#getText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Text();

	/**
	 * Returns the meta object for class '{@link algorithm.RessourceFamilyElement <em>Ressource Family Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Family Element</em>'.
	 * @see algorithm.RessourceFamilyElement
	 * @generated
	 */
	EClass getRessourceFamilyElement();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.RessourceFamilyElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see algorithm.RessourceFamilyElement#getName()
	 * @see #getRessourceFamilyElement()
	 * @generated
	 */
	EAttribute getRessourceFamilyElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.RessourceFamilyElement#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ressources</em>'.
	 * @see algorithm.RessourceFamilyElement#getRessources()
	 * @see #getRessourceFamilyElement()
	 * @generated
	 */
	EReference getRessourceFamilyElement_Ressources();

	/**
	 * Returns the meta object for the container reference '{@link algorithm.RessourceFamilyElement#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Catalogue</em>'.
	 * @see algorithm.RessourceFamilyElement#getCatalogue()
	 * @see #getRessourceFamilyElement()
	 * @generated
	 */
	EReference getRessourceFamilyElement_Catalogue();

	/**
	 * Returns the meta object for class '{@link algorithm.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see algorithm.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.Catalogue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see algorithm.Catalogue#getName()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithm.Catalogue#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressourcefamilyelements</em>'.
	 * @see algorithm.Catalogue#getRessourcefamilyelements()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Ressourcefamilyelements();

	/**
	 * Returns the meta object for class '{@link algorithm.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see algorithm.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.Ressource#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ressourcefamilyelements</em>'.
	 * @see algorithm.Ressource#getRessourcefamilyelements()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Ressourcefamilyelements();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.Ressource#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Algorithm</em>'.
	 * @see algorithm.Ressource#getAlgorithm()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.Ressource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see algorithm.Ressource#getPath()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmFactory getAlgorithmFactory();

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
		 * The meta object literal for the '{@link algorithm.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.AlgorithmImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__NAME = eINSTANCE.getAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__INPUT = eINSTANCE.getAlgorithm_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__OUTPUT = eINSTANCE.getAlgorithm_Output();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__RESSOURCE = eINSTANCE.getAlgorithm_Ressource();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__DOCUMENTATION = eINSTANCE.getAlgorithm_Documentation();

		/**
		 * The meta object literal for the '{@link algorithm.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.InputImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__ALGORITHM = eINSTANCE.getInput_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__COLUMN = eINSTANCE.getInput_Column();

		/**
		 * The meta object literal for the '{@link algorithm.impl.OutputColumnImpl <em>Output Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.OutputColumnImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getOutputColumn()
		 * @generated
		 */
		EClass OUTPUT_COLUMN = eINSTANCE.getOutputColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_COLUMN__TYPE = eINSTANCE.getOutputColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_COLUMN__COLUMN = eINSTANCE.getOutputColumn_Column();

		/**
		 * The meta object literal for the '{@link algorithm.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.OutputImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ALGORITHM = eINSTANCE.getOutput_Algorithm();

		/**
		 * The meta object literal for the '{@link algorithm.impl.OutputSimpleImpl <em>Output Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.OutputSimpleImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getOutputSimple()
		 * @generated
		 */
		EClass OUTPUT_SIMPLE = eINSTANCE.getOutputSimple();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_SIMPLE__TYPE = eINSTANCE.getOutputSimple_Type();

		/**
		 * The meta object literal for the '{@link algorithm.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.DocumentationImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION__ALGORITHM = eINSTANCE.getDocumentation_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__TEXT = eINSTANCE.getDocumentation_Text();

		/**
		 * The meta object literal for the '{@link algorithm.impl.RessourceFamilyElementImpl <em>Ressource Family Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.RessourceFamilyElementImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getRessourceFamilyElement()
		 * @generated
		 */
		EClass RESSOURCE_FAMILY_ELEMENT = eINSTANCE.getRessourceFamilyElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE_FAMILY_ELEMENT__NAME = eINSTANCE.getRessourceFamilyElement_Name();

		/**
		 * The meta object literal for the '<em><b>Ressources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE_FAMILY_ELEMENT__RESSOURCES = eINSTANCE.getRessourceFamilyElement_Ressources();

		/**
		 * The meta object literal for the '<em><b>Catalogue</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE_FAMILY_ELEMENT__CATALOGUE = eINSTANCE.getRessourceFamilyElement_Catalogue();

		/**
		 * The meta object literal for the '{@link algorithm.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.CatalogueImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE__NAME = eINSTANCE.getCatalogue_Name();

		/**
		 * The meta object literal for the '<em><b>Ressourcefamilyelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__RESSOURCEFAMILYELEMENTS = eINSTANCE.getCatalogue_Ressourcefamilyelements();

		/**
		 * The meta object literal for the '{@link algorithm.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.impl.RessourceImpl
		 * @see algorithm.impl.AlgorithmPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Ressourcefamilyelements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__RESSOURCEFAMILYELEMENTS = eINSTANCE.getRessource_Ressourcefamilyelements();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__ALGORITHM = eINSTANCE.getRessource_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__PATH = eINSTANCE.getRessource_Path();

	}

} //AlgorithmPackage
