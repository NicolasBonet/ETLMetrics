/**
 */
package cobiw;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cobiw.CobiwFactory
 * @model kind="package"
 * @generated
 */
public interface CobiwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cobiw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cobiw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cobiw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CobiwPackage eINSTANCE = cobiw.impl.CobiwPackageImpl.init();

	/**
	 * The meta object id for the '{@link cobiw.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cobiw.impl.VariableImpl
	 * @see cobiw.impl.CobiwPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LONGITUD = 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PRECISION = 3;

	/**
	 * The feature id for the '<em><b>Es Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ES_OCCURS = 4;

	/**
	 * The feature id for the '<em><b>Es Llave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ES_LLAVE = 5;

	/**
	 * The feature id for the '<em><b>Conformada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONFORMADA = 6;

	/**
	 * The feature id for the '<em><b>Es Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ES_SALIDA = 7;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALOR = 8;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link cobiw.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cobiw.impl.JoinImpl
	 * @see cobiw.impl.CobiwPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 1;

	/**
	 * The feature id for the '<em><b>Nom Archivo Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NOM_ARCHIVO_SALIDA = 0;

	/**
	 * The feature id for the '<em><b>Referencia Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REFERENCIA_ORIGEN = 1;

	/**
	 * The feature id for the '<em><b>Referencia Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REFERENCIA_DESTINO = 2;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cobiw.impl.ProgramaImpl <em>Programa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cobiw.impl.ProgramaImpl
	 * @see cobiw.impl.CobiwPackageImpl#getPrograma()
	 * @generated
	 */
	int PROGRAMA = 2;

	/**
	 * The feature id for the '<em><b>Contiene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__CONTIENE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Usa</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__USA = 3;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__JOINS = 4;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__AUTOR = 5;

	/**
	 * The feature id for the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__TEAM = 6;

	/**
	 * The feature id for the '<em><b>Objetivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__OBJETIVO = 7;

	/**
	 * The feature id for the '<em><b>Numero Requerimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__NUMERO_REQUERIMIENTO = 8;

	/**
	 * The feature id for the '<em><b>Programa Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__PROGRAMA_ID = 9;

	/**
	 * The number of structural features of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link cobiw.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cobiw.impl.CopyImpl
	 * @see cobiw.impl.CobiwPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 3;

	/**
	 * The feature id for the '<em><b>Compuesto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__COMPUESTO = 0;

	/**
	 * The feature id for the '<em><b>Nombre Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__NOMBRE_ARCHIVO = 1;

	/**
	 * The feature id for the '<em><b>Es Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ES_ENTRADA = 2;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cobiw.TipoPrograma <em>Tipo Programa</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cobiw.TipoPrograma
	 * @see cobiw.impl.CobiwPackageImpl#getTipoPrograma()
	 * @generated
	 */
	int TIPO_PROGRAMA = 4;

	/**
	 * The meta object id for the '{@link cobiw.TipoVariable <em>Tipo Variable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cobiw.TipoVariable
	 * @see cobiw.impl.CobiwPackageImpl#getTipoVariable()
	 * @generated
	 */
	int TIPO_VARIABLE = 5;


	/**
	 * Returns the meta object for class '{@link cobiw.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see cobiw.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cobiw.Variable#getNombre()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see cobiw.Variable#getTipo()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#getLongitud <em>Longitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitud</em>'.
	 * @see cobiw.Variable#getLongitud()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Longitud();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see cobiw.Variable#getPrecision()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Precision();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#isEsOccurs <em>Es Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Occurs</em>'.
	 * @see cobiw.Variable#isEsOccurs()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_EsOccurs();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#isEsLlave <em>Es Llave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Llave</em>'.
	 * @see cobiw.Variable#isEsLlave()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_EsLlave();

	/**
	 * Returns the meta object for the containment reference list '{@link cobiw.Variable#getConformada <em>Conformada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conformada</em>'.
	 * @see cobiw.Variable#getConformada()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Conformada();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#getEsSalida <em>Es Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Salida</em>'.
	 * @see cobiw.Variable#getEsSalida()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_EsSalida();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Variable#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see cobiw.Variable#getValor()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Valor();

	/**
	 * Returns the meta object for class '{@link cobiw.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see cobiw.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Join#getNomArchivoSalida <em>Nom Archivo Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Archivo Salida</em>'.
	 * @see cobiw.Join#getNomArchivoSalida()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_NomArchivoSalida();

	/**
	 * Returns the meta object for the reference '{@link cobiw.Join#getReferenciaOrigen <em>Referencia Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia Origen</em>'.
	 * @see cobiw.Join#getReferenciaOrigen()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_ReferenciaOrigen();

	/**
	 * Returns the meta object for the reference '{@link cobiw.Join#getReferenciaDestino <em>Referencia Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia Destino</em>'.
	 * @see cobiw.Join#getReferenciaDestino()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_ReferenciaDestino();

	/**
	 * Returns the meta object for class '{@link cobiw.Programa <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programa</em>'.
	 * @see cobiw.Programa
	 * @generated
	 */
	EClass getPrograma();

	/**
	 * Returns the meta object for the containment reference list '{@link cobiw.Programa#getContiene <em>Contiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contiene</em>'.
	 * @see cobiw.Programa#getContiene()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Contiene();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see cobiw.Programa#getTipo()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cobiw.Programa#getNombre()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link cobiw.Programa#getUsa <em>Usa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usa</em>'.
	 * @see cobiw.Programa#getUsa()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Usa();

	/**
	 * Returns the meta object for the containment reference list '{@link cobiw.Programa#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joins</em>'.
	 * @see cobiw.Programa#getJoins()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Joins();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see cobiw.Programa#getAutor()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Autor();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team</em>'.
	 * @see cobiw.Programa#getTeam()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Team();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getObjetivo <em>Objetivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objetivo</em>'.
	 * @see cobiw.Programa#getObjetivo()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Objetivo();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getNumeroRequerimiento <em>Numero Requerimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Requerimiento</em>'.
	 * @see cobiw.Programa#getNumeroRequerimiento()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_NumeroRequerimiento();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Programa#getProgramaId <em>Programa Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programa Id</em>'.
	 * @see cobiw.Programa#getProgramaId()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_ProgramaId();

	/**
	 * Returns the meta object for class '{@link cobiw.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see cobiw.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the containment reference list '{@link cobiw.Copy#getCompuesto <em>Compuesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compuesto</em>'.
	 * @see cobiw.Copy#getCompuesto()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_Compuesto();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Copy#getNombreArchivo <em>Nombre Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Archivo</em>'.
	 * @see cobiw.Copy#getNombreArchivo()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_NombreArchivo();

	/**
	 * Returns the meta object for the attribute '{@link cobiw.Copy#isEsEntrada <em>Es Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Entrada</em>'.
	 * @see cobiw.Copy#isEsEntrada()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_EsEntrada();

	/**
	 * Returns the meta object for enum '{@link cobiw.TipoPrograma <em>Tipo Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Programa</em>'.
	 * @see cobiw.TipoPrograma
	 * @generated
	 */
	EEnum getTipoPrograma();

	/**
	 * Returns the meta object for enum '{@link cobiw.TipoVariable <em>Tipo Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Variable</em>'.
	 * @see cobiw.TipoVariable
	 * @generated
	 */
	EEnum getTipoVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CobiwFactory getCobiwFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cobiw.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cobiw.impl.VariableImpl
		 * @see cobiw.impl.CobiwPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NOMBRE = eINSTANCE.getVariable_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TIPO = eINSTANCE.getVariable_Tipo();

		/**
		 * The meta object literal for the '<em><b>Longitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LONGITUD = eINSTANCE.getVariable_Longitud();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__PRECISION = eINSTANCE.getVariable_Precision();

		/**
		 * The meta object literal for the '<em><b>Es Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ES_OCCURS = eINSTANCE.getVariable_EsOccurs();

		/**
		 * The meta object literal for the '<em><b>Es Llave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ES_LLAVE = eINSTANCE.getVariable_EsLlave();

		/**
		 * The meta object literal for the '<em><b>Conformada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CONFORMADA = eINSTANCE.getVariable_Conformada();

		/**
		 * The meta object literal for the '<em><b>Es Salida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ES_SALIDA = eINSTANCE.getVariable_EsSalida();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALOR = eINSTANCE.getVariable_Valor();

		/**
		 * The meta object literal for the '{@link cobiw.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cobiw.impl.JoinImpl
		 * @see cobiw.impl.CobiwPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Nom Archivo Salida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__NOM_ARCHIVO_SALIDA = eINSTANCE.getJoin_NomArchivoSalida();

		/**
		 * The meta object literal for the '<em><b>Referencia Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__REFERENCIA_ORIGEN = eINSTANCE.getJoin_ReferenciaOrigen();

		/**
		 * The meta object literal for the '<em><b>Referencia Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__REFERENCIA_DESTINO = eINSTANCE.getJoin_ReferenciaDestino();

		/**
		 * The meta object literal for the '{@link cobiw.impl.ProgramaImpl <em>Programa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cobiw.impl.ProgramaImpl
		 * @see cobiw.impl.CobiwPackageImpl#getPrograma()
		 * @generated
		 */
		EClass PROGRAMA = eINSTANCE.getPrograma();

		/**
		 * The meta object literal for the '<em><b>Contiene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__CONTIENE = eINSTANCE.getPrograma_Contiene();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__TIPO = eINSTANCE.getPrograma_Tipo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__NOMBRE = eINSTANCE.getPrograma_Nombre();

		/**
		 * The meta object literal for the '<em><b>Usa</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__USA = eINSTANCE.getPrograma_Usa();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__JOINS = eINSTANCE.getPrograma_Joins();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__AUTOR = eINSTANCE.getPrograma_Autor();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__TEAM = eINSTANCE.getPrograma_Team();

		/**
		 * The meta object literal for the '<em><b>Objetivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__OBJETIVO = eINSTANCE.getPrograma_Objetivo();

		/**
		 * The meta object literal for the '<em><b>Numero Requerimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__NUMERO_REQUERIMIENTO = eINSTANCE.getPrograma_NumeroRequerimiento();

		/**
		 * The meta object literal for the '<em><b>Programa Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__PROGRAMA_ID = eINSTANCE.getPrograma_ProgramaId();

		/**
		 * The meta object literal for the '{@link cobiw.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cobiw.impl.CopyImpl
		 * @see cobiw.impl.CobiwPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>Compuesto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__COMPUESTO = eINSTANCE.getCopy_Compuesto();

		/**
		 * The meta object literal for the '<em><b>Nombre Archivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__NOMBRE_ARCHIVO = eINSTANCE.getCopy_NombreArchivo();

		/**
		 * The meta object literal for the '<em><b>Es Entrada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__ES_ENTRADA = eINSTANCE.getCopy_EsEntrada();

		/**
		 * The meta object literal for the '{@link cobiw.TipoPrograma <em>Tipo Programa</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cobiw.TipoPrograma
		 * @see cobiw.impl.CobiwPackageImpl#getTipoPrograma()
		 * @generated
		 */
		EEnum TIPO_PROGRAMA = eINSTANCE.getTipoPrograma();

		/**
		 * The meta object literal for the '{@link cobiw.TipoVariable <em>Tipo Variable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cobiw.TipoVariable
		 * @see cobiw.impl.CobiwPackageImpl#getTipoVariable()
		 * @generated
		 */
		EEnum TIPO_VARIABLE = eINSTANCE.getTipoVariable();

	}

} //CobiwPackage
