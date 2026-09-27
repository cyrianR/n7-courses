/**
 */
package algorithm.impl;

import algorithm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmFactoryImpl extends EFactoryImpl implements AlgorithmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgorithmFactory init() {
		try {
			AlgorithmFactory theAlgorithmFactory = (AlgorithmFactory)EPackage.Registry.INSTANCE.getEFactory(AlgorithmPackage.eNS_URI);
			if (theAlgorithmFactory != null) {
				return theAlgorithmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgorithmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmFactoryImpl() {
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
			case AlgorithmPackage.ALGORITHM: return createAlgorithm();
			case AlgorithmPackage.INPUT: return createInput();
			case AlgorithmPackage.OUTPUT_COLUMN: return createOutputColumn();
			case AlgorithmPackage.DOCUMENTATION: return createDocumentation();
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT: return createRessourceFamilyElement();
			case AlgorithmPackage.CATALOGUE: return createCatalogue();
			case AlgorithmPackage.RESSOURCE: return createRessource();
			case AlgorithmPackage.OUTPUT_SIMPLE: return createOutputSimple();
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
	public Algorithm createAlgorithm() {
		AlgorithmImpl algorithm = new AlgorithmImpl();
		return algorithm;
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
	public OutputColumn createOutputColumn() {
		OutputColumnImpl outputColumn = new OutputColumnImpl();
		return outputColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RessourceFamilyElement createRessourceFamilyElement() {
		RessourceFamilyElementImpl ressourceFamilyElement = new RessourceFamilyElementImpl();
		return ressourceFamilyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressource createRessource() {
		RessourceImpl ressource = new RessourceImpl();
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputSimple createOutputSimple() {
		OutputSimpleImpl outputSimple = new OutputSimpleImpl();
		return outputSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmPackage getAlgorithmPackage() {
		return (AlgorithmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgorithmPackage getPackage() {
		return AlgorithmPackage.eINSTANCE;
	}

} //AlgorithmFactoryImpl
