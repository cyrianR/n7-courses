/**
 */
package algorithm.impl;

import algorithm.Algorithm;
import algorithm.AlgorithmPackage;
import algorithm.Ressource;
import algorithm.RessourceFamilyElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithm.impl.RessourceImpl#getRessourcefamilyelements <em>Ressourcefamilyelements</em>}</li>
 *   <li>{@link algorithm.impl.RessourceImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.impl.RessourceImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends MinimalEObjectImpl.Container implements Ressource {
	/**
	 * The cached value of the '{@link #getRessourcefamilyelements() <em>Ressourcefamilyelements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourcefamilyelements()
	 * @generated
	 * @ordered
	 */
	protected EList<RessourceFamilyElement> ressourcefamilyelements;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithm> algorithm;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmPackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RessourceFamilyElement> getRessourcefamilyelements() {
		if (ressourcefamilyelements == null) {
			ressourcefamilyelements = new EObjectWithInverseResolvingEList.ManyInverse<RessourceFamilyElement>(RessourceFamilyElement.class, this, AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS, AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES);
		}
		return ressourcefamilyelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithm> getAlgorithm() {
		if (algorithm == null) {
			algorithm = new EObjectWithInverseResolvingEList<Algorithm>(Algorithm.class, this, AlgorithmPackage.RESSOURCE__ALGORITHM, AlgorithmPackage.ALGORITHM__RESSOURCE);
		}
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.RESSOURCE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRessourcefamilyelements()).basicAdd(otherEnd, msgs);
			case AlgorithmPackage.RESSOURCE__ALGORITHM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlgorithm()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS:
				return ((InternalEList<?>)getRessourcefamilyelements()).basicRemove(otherEnd, msgs);
			case AlgorithmPackage.RESSOURCE__ALGORITHM:
				return ((InternalEList<?>)getAlgorithm()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS:
				return getRessourcefamilyelements();
			case AlgorithmPackage.RESSOURCE__ALGORITHM:
				return getAlgorithm();
			case AlgorithmPackage.RESSOURCE__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS:
				getRessourcefamilyelements().clear();
				getRessourcefamilyelements().addAll((Collection<? extends RessourceFamilyElement>)newValue);
				return;
			case AlgorithmPackage.RESSOURCE__ALGORITHM:
				getAlgorithm().clear();
				getAlgorithm().addAll((Collection<? extends Algorithm>)newValue);
				return;
			case AlgorithmPackage.RESSOURCE__PATH:
				setPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS:
				getRessourcefamilyelements().clear();
				return;
			case AlgorithmPackage.RESSOURCE__ALGORITHM:
				getAlgorithm().clear();
				return;
			case AlgorithmPackage.RESSOURCE__PATH:
				setPath(PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS:
				return ressourcefamilyelements != null && !ressourcefamilyelements.isEmpty();
			case AlgorithmPackage.RESSOURCE__ALGORITHM:
				return algorithm != null && !algorithm.isEmpty();
			case AlgorithmPackage.RESSOURCE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl
