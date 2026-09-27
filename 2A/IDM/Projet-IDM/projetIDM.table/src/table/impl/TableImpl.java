/**
 */
package table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import table.Column;
import table.ColumnID;
import table.Table;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link table.impl.TableImpl#getColumnelement <em>Columnelement</em>}</li>
 *   <li>{@link table.impl.TableImpl#getColumnid <em>Columnid</em>}</li>
 *   <li>{@link table.impl.TableImpl#getFichierSource <em>Fichier Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnelement() <em>Columnelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnelement()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columnelement;

	/**
	 * The cached value of the '{@link #getColumnid() <em>Columnid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnid()
	 * @generated
	 * @ordered
	 */
	protected ColumnID columnid;

	/**
	 * The default value of the '{@link #getFichierSource() <em>Fichier Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichierSource()
	 * @generated
	 * @ordered
	 */
	protected static final String FICHIER_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFichierSource() <em>Fichier Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichierSource()
	 * @generated
	 * @ordered
	 */
	protected String fichierSource = FICHIER_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumnelement() {
		if (columnelement == null) {
			columnelement = new EObjectContainmentWithInverseEList<Column>(Column.class, this, TablePackage.TABLE__COLUMNELEMENT, TablePackage.COLUMN__TABLE);
		}
		return columnelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnID getColumnid() {
		return columnid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnid(ColumnID newColumnid, NotificationChain msgs) {
		ColumnID oldColumnid = columnid;
		columnid = newColumnid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__COLUMNID, oldColumnid, newColumnid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnid(ColumnID newColumnid) {
		if (newColumnid != columnid) {
			NotificationChain msgs = null;
			if (columnid != null)
				msgs = ((InternalEObject)columnid).eInverseRemove(this, TablePackage.COLUMN_ID__TABLE, ColumnID.class, msgs);
			if (newColumnid != null)
				msgs = ((InternalEObject)newColumnid).eInverseAdd(this, TablePackage.COLUMN_ID__TABLE, ColumnID.class, msgs);
			msgs = basicSetColumnid(newColumnid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__COLUMNID, newColumnid, newColumnid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFichierSource() {
		return fichierSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFichierSource(String newFichierSource) {
		String oldFichierSource = fichierSource;
		fichierSource = newFichierSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__FICHIER_SOURCE, oldFichierSource, fichierSource));
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
			case TablePackage.TABLE__COLUMNELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumnelement()).basicAdd(otherEnd, msgs);
			case TablePackage.TABLE__COLUMNID:
				if (columnid != null)
					msgs = ((InternalEObject)columnid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE__COLUMNID, null, msgs);
				return basicSetColumnid((ColumnID)otherEnd, msgs);
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
			case TablePackage.TABLE__COLUMNELEMENT:
				return ((InternalEList<?>)getColumnelement()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE__COLUMNID:
				return basicSetColumnid(null, msgs);
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
			case TablePackage.TABLE__NAME:
				return getName();
			case TablePackage.TABLE__COLUMNELEMENT:
				return getColumnelement();
			case TablePackage.TABLE__COLUMNID:
				return getColumnid();
			case TablePackage.TABLE__FICHIER_SOURCE:
				return getFichierSource();
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
			case TablePackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case TablePackage.TABLE__COLUMNELEMENT:
				getColumnelement().clear();
				getColumnelement().addAll((Collection<? extends Column>)newValue);
				return;
			case TablePackage.TABLE__COLUMNID:
				setColumnid((ColumnID)newValue);
				return;
			case TablePackage.TABLE__FICHIER_SOURCE:
				setFichierSource((String)newValue);
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
			case TablePackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablePackage.TABLE__COLUMNELEMENT:
				getColumnelement().clear();
				return;
			case TablePackage.TABLE__COLUMNID:
				setColumnid((ColumnID)null);
				return;
			case TablePackage.TABLE__FICHIER_SOURCE:
				setFichierSource(FICHIER_SOURCE_EDEFAULT);
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
			case TablePackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablePackage.TABLE__COLUMNELEMENT:
				return columnelement != null && !columnelement.isEmpty();
			case TablePackage.TABLE__COLUMNID:
				return columnid != null;
			case TablePackage.TABLE__FICHIER_SOURCE:
				return FICHIER_SOURCE_EDEFAULT == null ? fichierSource != null : !FICHIER_SOURCE_EDEFAULT.equals(fichierSource);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fichierSource: ");
		result.append(fichierSource);
		result.append(')');
		return result.toString();
	}

} //TableImpl
