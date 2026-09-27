/**
 */
package projetidm.miniLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projetidm.miniLanguage.Constant;
import projetidm.miniLanguage.EnumOperationBinaire;
import projetidm.miniLanguage.EnumOperationUnaire;
import projetidm.miniLanguage.FloatConstant;
import projetidm.miniLanguage.Input;
import projetidm.miniLanguage.IntegerConstant;
import projetidm.miniLanguage.MiniLanguage;
import projetidm.miniLanguage.MiniLanguageElement;
import projetidm.miniLanguage.MiniLanguageFactory;
import projetidm.miniLanguage.MiniLanguagePackage;
import projetidm.miniLanguage.OperationBinaire;
import projetidm.miniLanguage.OperationUnaire;
import projetidm.miniLanguage.Output;
import projetidm.miniLanguage.Parameter;
import projetidm.miniLanguage.Return;
import projetidm.miniLanguage.StringConstant;
import projetidm.miniLanguage.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniLanguagePackageImpl extends EPackageImpl implements MiniLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miniLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miniLanguageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOperationUnaireEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOperationBinaireEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projetidm.miniLanguage.MiniLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiniLanguagePackageImpl() {
		super(eNS_URI, MiniLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MiniLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MiniLanguagePackage init() {
		if (isInited)
			return (MiniLanguagePackage) EPackage.Registry.INSTANCE.getEPackage(MiniLanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMiniLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MiniLanguagePackageImpl theMiniLanguagePackage = registeredMiniLanguagePackage instanceof MiniLanguagePackageImpl
				? (MiniLanguagePackageImpl) registeredMiniLanguagePackage
				: new MiniLanguagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMiniLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theMiniLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMiniLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MiniLanguagePackage.eNS_URI, theMiniLanguagePackage);
		return theMiniLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMiniLanguage() {
		return miniLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMiniLanguage_MiniLanguageElement() {
		return (EReference) miniLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMiniLanguageElement() {
		return miniLanguageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMiniLanguageElement_Minilanguage() {
		return (EReference) miniLanguageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Output() {
		return (EReference) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Type() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Name() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Return() {
		return (EReference) inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_OperationBinaire() {
		return (EReference) inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_OperationUnaire() {
		return (EReference) inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Input() {
		return (EReference) outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Type() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Name() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_OperationBinaire() {
		return (EReference) outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_OperationUnaire() {
		return (EReference) outputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Parameter() {
		return (EReference) outputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationUnaire() {
		return operationUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationUnaire_Output() {
		return (EReference) operationUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationUnaire_Input() {
		return (EReference) operationUnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationUnaire_Operation() {
		return (EAttribute) operationUnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationBinaire() {
		return operationBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationBinaire_Output() {
		return (EReference) operationBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationBinaire_Input() {
		return (EReference) operationBinaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationBinaire_Operation() {
		return (EAttribute) operationBinaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstant_Output() {
		return (EReference) constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerConstant() {
		return integerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerConstant_Value() {
		return (EAttribute) integerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatConstant() {
		return floatConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatConstant_Value() {
		return (EAttribute) floatConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringConstant() {
		return stringConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringConstant_Value() {
		return (EAttribute) stringConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Output() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturn_Name() {
		return (EAttribute) returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturn_Input() {
		return (EReference) returnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumOperationUnaire() {
		return enumOperationUnaireEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumOperationBinaire() {
		return enumOperationBinaireEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiniLanguageFactory getMiniLanguageFactory() {
		return (MiniLanguageFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		miniLanguageEClass = createEClass(MINI_LANGUAGE);
		createEReference(miniLanguageEClass, MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT);

		miniLanguageElementEClass = createEClass(MINI_LANGUAGE_ELEMENT);
		createEReference(miniLanguageElementEClass, MINI_LANGUAGE_ELEMENT__MINILANGUAGE);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__OUTPUT);
		createEAttribute(inputEClass, INPUT__TYPE);
		createEAttribute(inputEClass, INPUT__NAME);
		createEReference(inputEClass, INPUT__RETURN);
		createEReference(inputEClass, INPUT__OPERATION_BINAIRE);
		createEReference(inputEClass, INPUT__OPERATION_UNAIRE);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__INPUT);
		createEAttribute(outputEClass, OUTPUT__TYPE);
		createEAttribute(outputEClass, OUTPUT__NAME);
		createEReference(outputEClass, OUTPUT__OPERATION_BINAIRE);
		createEReference(outputEClass, OUTPUT__OPERATION_UNAIRE);
		createEReference(outputEClass, OUTPUT__PARAMETER);

		operationUnaireEClass = createEClass(OPERATION_UNAIRE);
		createEReference(operationUnaireEClass, OPERATION_UNAIRE__OUTPUT);
		createEReference(operationUnaireEClass, OPERATION_UNAIRE__INPUT);
		createEAttribute(operationUnaireEClass, OPERATION_UNAIRE__OPERATION);

		operationBinaireEClass = createEClass(OPERATION_BINAIRE);
		createEReference(operationBinaireEClass, OPERATION_BINAIRE__OUTPUT);
		createEReference(operationBinaireEClass, OPERATION_BINAIRE__INPUT);
		createEAttribute(operationBinaireEClass, OPERATION_BINAIRE__OPERATION);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__OUTPUT);

		integerConstantEClass = createEClass(INTEGER_CONSTANT);
		createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);

		floatConstantEClass = createEClass(FLOAT_CONSTANT);
		createEAttribute(floatConstantEClass, FLOAT_CONSTANT__VALUE);

		stringConstantEClass = createEClass(STRING_CONSTANT);
		createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__OUTPUT);

		returnEClass = createEClass(RETURN);
		createEAttribute(returnEClass, RETURN__NAME);
		createEReference(returnEClass, RETURN__INPUT);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		enumOperationUnaireEEnum = createEEnum(ENUM_OPERATION_UNAIRE);
		enumOperationBinaireEEnum = createEEnum(ENUM_OPERATION_BINAIRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationUnaireEClass.getESuperTypes().add(this.getMiniLanguageElement());
		operationBinaireEClass.getESuperTypes().add(this.getMiniLanguageElement());
		constantEClass.getESuperTypes().add(this.getMiniLanguageElement());
		integerConstantEClass.getESuperTypes().add(this.getConstant());
		floatConstantEClass.getESuperTypes().add(this.getConstant());
		stringConstantEClass.getESuperTypes().add(this.getConstant());
		parameterEClass.getESuperTypes().add(this.getMiniLanguageElement());
		returnEClass.getESuperTypes().add(this.getMiniLanguageElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(miniLanguageEClass, MiniLanguage.class, "MiniLanguage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiniLanguage_MiniLanguageElement(), this.getMiniLanguageElement(),
				this.getMiniLanguageElement_Minilanguage(), "miniLanguageElement", null, 0, -1, MiniLanguage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miniLanguageElementEClass, MiniLanguageElement.class, "MiniLanguageElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiniLanguageElement_Minilanguage(), this.getMiniLanguage(),
				this.getMiniLanguage_MiniLanguageElement(), "minilanguage", null, 1, 1, MiniLanguageElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Output(), this.getOutput(), this.getOutput_Input(), "output", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Type(), this.getType(), "type", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Return(), this.getReturn(), this.getReturn_Input(), "return", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_OperationBinaire(), this.getOperationBinaire(), this.getOperationBinaire_Input(),
				"operationBinaire", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_OperationUnaire(), this.getOperationUnaire(), this.getOperationUnaire_Input(),
				"operationUnaire", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Input(), this.getInput(), this.getInput_Output(), "input", null, 1, -1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Type(), this.getType(), "type", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Output.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_OperationBinaire(), this.getOperationBinaire(), this.getOperationBinaire_Output(),
				"operationBinaire", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_OperationUnaire(), this.getOperationUnaire(), this.getOperationUnaire_Output(),
				"operationUnaire", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Parameter(), this.getParameter(), this.getParameter_Output(), "parameter", null, 0, 1,
				Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationUnaireEClass, OperationUnaire.class, "OperationUnaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationUnaire_Output(), this.getOutput(), this.getOutput_OperationUnaire(), "output", null,
				1, 1, OperationUnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationUnaire_Input(), this.getInput(), this.getInput_OperationUnaire(), "input", null, 1,
				1, OperationUnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationUnaire_Operation(), this.getEnumOperationUnaire(), "operation", null, 0, 1,
				OperationUnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(operationBinaireEClass, OperationBinaire.class, "OperationBinaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationBinaire_Output(), this.getOutput(), this.getOutput_OperationBinaire(), "output",
				null, 1, 1, OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationBinaire_Input(), this.getInput(), this.getInput_OperationBinaire(), "input", null, 2,
				2, OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationBinaire_Operation(), this.getEnumOperationBinaire(), "operation", null, 0, 1,
				OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_Output(), this.getOutput(), null, "output", null, 1, 1, Constant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatConstantEClass, FloatConstant.class, "FloatConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatConstant_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, FloatConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Output(), this.getOutput(), this.getOutput_Parameter(), "output", null, 1, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturn_Name(), ecorePackage.getEString(), "name", null, 1, 1, Return.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Input(), this.getInput(), this.getInput_Return(), "input", null, 1, 1, Return.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STR);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.FLT);
		addEEnumLiteral(typeEEnum, Type.STRCOL);
		addEEnumLiteral(typeEEnum, Type.INTCOL);
		addEEnumLiteral(typeEEnum, Type.FLTCOL);

		initEEnum(enumOperationUnaireEEnum, EnumOperationUnaire.class, "EnumOperationUnaire");
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.SUM);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.PRODUCT);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.MINIMUM);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.MAXIMUM);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.OPPOSITE);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.COSINUS);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.SINUS);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.SQRT);
		addEEnumLiteral(enumOperationUnaireEEnum, EnumOperationUnaire.EXPONENTIAL);

		initEEnum(enumOperationBinaireEEnum, EnumOperationBinaire.class, "EnumOperationBinaire");
		addEEnumLiteral(enumOperationBinaireEEnum, EnumOperationBinaire.SUM);
		addEEnumLiteral(enumOperationBinaireEEnum, EnumOperationBinaire.PRODUCT);
		addEEnumLiteral(enumOperationBinaireEEnum, EnumOperationBinaire.DIVISION);
		addEEnumLiteral(enumOperationBinaireEEnum, EnumOperationBinaire.MINIMUM);
		addEEnumLiteral(enumOperationBinaireEEnum, EnumOperationBinaire.MAXIMUM);

		// Create resource
		createResource(eNS_URI);
	}

} //MiniLanguagePackageImpl
