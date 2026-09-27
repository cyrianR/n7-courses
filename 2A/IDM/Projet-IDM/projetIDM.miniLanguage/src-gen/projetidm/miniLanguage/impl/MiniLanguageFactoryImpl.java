/**
 */
package projetidm.miniLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projetidm.miniLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniLanguageFactoryImpl extends EFactoryImpl implements MiniLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiniLanguageFactory init() {
		try {
			MiniLanguageFactory theMiniLanguageFactory = (MiniLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(MiniLanguagePackage.eNS_URI);
			if (theMiniLanguageFactory != null) {
				return theMiniLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiniLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MiniLanguagePackage.MINI_LANGUAGE:
			return createMiniLanguage();
		case MiniLanguagePackage.INPUT:
			return createInput();
		case MiniLanguagePackage.OUTPUT:
			return createOutput();
		case MiniLanguagePackage.OPERATION_UNAIRE:
			return createOperationUnaire();
		case MiniLanguagePackage.OPERATION_BINAIRE:
			return createOperationBinaire();
		case MiniLanguagePackage.INTEGER_CONSTANT:
			return createIntegerConstant();
		case MiniLanguagePackage.FLOAT_CONSTANT:
			return createFloatConstant();
		case MiniLanguagePackage.STRING_CONSTANT:
			return createStringConstant();
		case MiniLanguagePackage.PARAMETER:
			return createParameter();
		case MiniLanguagePackage.RETURN:
			return createReturn();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MiniLanguagePackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		case MiniLanguagePackage.ENUM_OPERATION_UNAIRE:
			return createEnumOperationUnaireFromString(eDataType, initialValue);
		case MiniLanguagePackage.ENUM_OPERATION_BINAIRE:
			return createEnumOperationBinaireFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MiniLanguagePackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		case MiniLanguagePackage.ENUM_OPERATION_UNAIRE:
			return convertEnumOperationUnaireToString(eDataType, instanceValue);
		case MiniLanguagePackage.ENUM_OPERATION_BINAIRE:
			return convertEnumOperationBinaireToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiniLanguage createMiniLanguage() {
		MiniLanguageImpl miniLanguage = new MiniLanguageImpl();
		return miniLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationUnaire createOperationUnaire() {
		OperationUnaireImpl operationUnaire = new OperationUnaireImpl();
		return operationUnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBinaire createOperationBinaire() {
		OperationBinaireImpl operationBinaire = new OperationBinaireImpl();
		return operationBinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatConstant createFloatConstant() {
		FloatConstantImpl floatConstant = new FloatConstantImpl();
		return floatConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOperationUnaire createEnumOperationUnaireFromString(EDataType eDataType, String initialValue) {
		EnumOperationUnaire result = EnumOperationUnaire.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumOperationUnaireToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOperationBinaire createEnumOperationBinaireFromString(EDataType eDataType, String initialValue) {
		EnumOperationBinaire result = EnumOperationBinaire.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumOperationBinaireToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiniLanguagePackage getMiniLanguagePackage() {
		return (MiniLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiniLanguagePackage getPackage() {
		return MiniLanguagePackage.eINSTANCE;
	}

} //MiniLanguageFactoryImpl
