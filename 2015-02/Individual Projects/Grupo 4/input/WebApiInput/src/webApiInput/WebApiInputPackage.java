/**
 */
package webApiInput;

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
 * @see webApiInput.WebApiInputFactory
 * @model kind="package"
 * @generated
 */
public interface WebApiInputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webApiInput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webApiInput";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webApiInput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebApiInputPackage eINSTANCE = webApiInput.impl.WebApiInputPackageImpl.init();

	/**
	 * The meta object id for the '{@link webApiInput.impl.CSharpImpl <em>CSharp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.CSharpImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getCSharp()
	 * @generated
	 */
	int CSHARP = 0;

	/**
	 * The feature id for the '<em><b>Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP__CLASES = 0;

	/**
	 * The number of structural features of the '<em>CSharp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CSharp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.ObjectImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TEXTO = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.EnumImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TEXTO = OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALORES = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.EnumLiteralImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__TEXTO = OBJECT__TEXTO;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.AttributesObjectImpl <em>Attributes Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.AttributesObjectImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getAttributesObject()
	 * @generated
	 */
	int ATTRIBUTES_OBJECT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OBJECT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OBJECT__TEXTO = OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OBJECT__ATRIBUTOS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attributes Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attributes Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.ClaseImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NAME = ATTRIBUTES_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__TEXTO = ATTRIBUTES_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ATRIBUTOS = ATTRIBUTES_OBJECT__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__PROPIEDADES = ATTRIBUTES_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__METODOS = ATTRIBUTES_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ENUMS = ATTRIBUTES_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NAMESPACE = ATTRIBUTES_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__SUPER = ATTRIBUTES_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constructores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__CONSTRUCTORES = ATTRIBUTES_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = ATTRIBUTES_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_OPERATION_COUNT = ATTRIBUTES_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.TypedObjectImpl <em>Typed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.TypedObjectImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getTypedObject()
	 * @generated
	 */
	int TYPED_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__NAME = ATTRIBUTES_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__TEXTO = ATTRIBUTES_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__ATRIBUTOS = ATTRIBUTES_OBJECT__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__TIPO_PRIMITIVO = ATTRIBUTES_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__TIPO = ATTRIBUTES_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lista</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__LISTA = ATTRIBUTES_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Typed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT_FEATURE_COUNT = ATTRIBUTES_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Typed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT_OPERATION_COUNT = ATTRIBUTES_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.PropiedadImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getPropiedad()
	 * @generated
	 */
	int PROPIEDAD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__NAME = TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__TEXTO = TYPED_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__ATRIBUTOS = TYPED_OBJECT__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__TIPO_PRIMITIVO = TYPED_OBJECT__TIPO_PRIMITIVO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__TIPO = TYPED_OBJECT__TIPO;

	/**
	 * The feature id for the '<em><b>Lista</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__LISTA = TYPED_OBJECT__LISTA;

	/**
	 * The number of structural features of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_FEATURE_COUNT = TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_OPERATION_COUNT = TYPED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.ValueObjectImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__TEXTO = OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__VALOR = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.AtributoImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TEXTO = VALUE_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__VALOR = VALUE_OBJECT__VALOR;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__PROPIEDADES = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.MetodoImpl <em>Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.MetodoImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getMetodo()
	 * @generated
	 */
	int METODO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__NAME = TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__TEXTO = TYPED_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__ATRIBUTOS = TYPED_OBJECT__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__TIPO_PRIMITIVO = TYPED_OBJECT__TIPO_PRIMITIVO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__TIPO = TYPED_OBJECT__TIPO;

	/**
	 * The feature id for the '<em><b>Lista</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__LISTA = TYPED_OBJECT__LISTA;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__PARAMETROS = TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_FEATURE_COUNT = TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_OPERATION_COUNT = TYPED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.ParametroImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NAME = TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TEXTO = TYPED_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__ATRIBUTOS = TYPED_OBJECT__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TIPO_PRIMITIVO = TYPED_OBJECT__TIPO_PRIMITIVO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TIPO = TYPED_OBJECT__TIPO;

	/**
	 * The feature id for the '<em><b>Lista</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__LISTA = TYPED_OBJECT__LISTA;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = TYPED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.PropiedadAtributoImpl <em>Propiedad Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.PropiedadAtributoImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getPropiedadAtributo()
	 * @generated
	 */
	int PROPIEDAD_ATRIBUTO = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_ATRIBUTO__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_ATRIBUTO__TEXTO = VALUE_OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_ATRIBUTO__VALOR = VALUE_OBJECT__VALOR;

	/**
	 * The number of structural features of the '<em>Propiedad Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_ATRIBUTO_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propiedad Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_ATRIBUTO_OPERATION_COUNT = VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.ListImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getList()
	 * @generated
	 */
	int LIST = 13;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CLASE = 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.TipoImpl <em>Tipo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.TipoImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getTipo()
	 * @generated
	 */
	int TIPO = 14;

	/**
	 * The number of structural features of the '<em>Tipo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tipo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApiInput.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApiInput.impl.ConstructorImpl
	 * @see webApiInput.impl.WebApiInputPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TEXTO = OBJECT__TEXTO;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETROS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link webApiInput.CSharp <em>CSharp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp</em>'.
	 * @see webApiInput.CSharp
	 * @generated
	 */
	EClass getCSharp();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.CSharp#getClases <em>Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clases</em>'.
	 * @see webApiInput.CSharp#getClases()
	 * @see #getCSharp()
	 * @generated
	 */
	EReference getCSharp_Clases();

	/**
	 * Returns the meta object for class '{@link webApiInput.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see webApiInput.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Enum#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valores</em>'.
	 * @see webApiInput.Enum#getValores()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Valores();

	/**
	 * Returns the meta object for class '{@link webApiInput.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see webApiInput.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for class '{@link webApiInput.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see webApiInput.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link webApiInput.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webApiInput.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link webApiInput.Object#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see webApiInput.Object#getTexto()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Texto();

	/**
	 * Returns the meta object for class '{@link webApiInput.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see webApiInput.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Clase#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see webApiInput.Clase#getPropiedades()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Propiedades();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Clase#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see webApiInput.Clase#getMetodos()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Metodos();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Clase#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see webApiInput.Clase#getEnums()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Enums();

	/**
	 * Returns the meta object for the attribute '{@link webApiInput.Clase#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see webApiInput.Clase#getNamespace()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link webApiInput.Clase#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super</em>'.
	 * @see webApiInput.Clase#getSuper()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_Super();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Clase#getConstructores <em>Constructores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructores</em>'.
	 * @see webApiInput.Clase#getConstructores()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Constructores();

	/**
	 * Returns the meta object for class '{@link webApiInput.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad</em>'.
	 * @see webApiInput.Propiedad
	 * @generated
	 */
	EClass getPropiedad();

	/**
	 * Returns the meta object for class '{@link webApiInput.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see webApiInput.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Atributo#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see webApiInput.Atributo#getPropiedades()
	 * @see #getAtributo()
	 * @generated
	 */
	EReference getAtributo_Propiedades();

	/**
	 * Returns the meta object for class '{@link webApiInput.Metodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metodo</em>'.
	 * @see webApiInput.Metodo
	 * @generated
	 */
	EClass getMetodo();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Metodo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see webApiInput.Metodo#getParametros()
	 * @see #getMetodo()
	 * @generated
	 */
	EReference getMetodo_Parametros();

	/**
	 * Returns the meta object for class '{@link webApiInput.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see webApiInput.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for class '{@link webApiInput.PropiedadAtributo <em>Propiedad Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad Atributo</em>'.
	 * @see webApiInput.PropiedadAtributo
	 * @generated
	 */
	EClass getPropiedadAtributo();

	/**
	 * Returns the meta object for class '{@link webApiInput.TypedObject <em>Typed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Object</em>'.
	 * @see webApiInput.TypedObject
	 * @generated
	 */
	EClass getTypedObject();

	/**
	 * Returns the meta object for the attribute '{@link webApiInput.TypedObject#getTipoPrimitivo <em>Tipo Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Primitivo</em>'.
	 * @see webApiInput.TypedObject#getTipoPrimitivo()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_TipoPrimitivo();

	/**
	 * Returns the meta object for the reference '{@link webApiInput.TypedObject#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo</em>'.
	 * @see webApiInput.TypedObject#getTipo()
	 * @see #getTypedObject()
	 * @generated
	 */
	EReference getTypedObject_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.TypedObject#getLista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista</em>'.
	 * @see webApiInput.TypedObject#getLista()
	 * @see #getTypedObject()
	 * @generated
	 */
	EReference getTypedObject_Lista();

	/**
	 * Returns the meta object for class '{@link webApiInput.AttributesObject <em>Attributes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes Object</em>'.
	 * @see webApiInput.AttributesObject
	 * @generated
	 */
	EClass getAttributesObject();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.AttributesObject#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see webApiInput.AttributesObject#getAtributos()
	 * @see #getAttributesObject()
	 * @generated
	 */
	EReference getAttributesObject_Atributos();

	/**
	 * Returns the meta object for class '{@link webApiInput.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see webApiInput.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the attribute '{@link webApiInput.ValueObject#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see webApiInput.ValueObject#getValor()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Valor();

	/**
	 * Returns the meta object for class '{@link webApiInput.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see webApiInput.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the reference '{@link webApiInput.List#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clase</em>'.
	 * @see webApiInput.List#getClase()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Clase();

	/**
	 * Returns the meta object for class '{@link webApiInput.Tipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo</em>'.
	 * @see webApiInput.Tipo
	 * @generated
	 */
	EClass getTipo();

	/**
	 * Returns the meta object for class '{@link webApiInput.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see webApiInput.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link webApiInput.Constructor#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see webApiInput.Constructor#getParametros()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Parametros();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebApiInputFactory getWebApiInputFactory();

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
		 * The meta object literal for the '{@link webApiInput.impl.CSharpImpl <em>CSharp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.CSharpImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getCSharp()
		 * @generated
		 */
		EClass CSHARP = eINSTANCE.getCSharp();

		/**
		 * The meta object literal for the '<em><b>Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP__CLASES = eINSTANCE.getCSharp_Clases();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.EnumImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__VALORES = eINSTANCE.getEnum_Valores();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.EnumLiteralImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.ObjectImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__TEXTO = eINSTANCE.getObject_Texto();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.ClaseImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__PROPIEDADES = eINSTANCE.getClase_Propiedades();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__METODOS = eINSTANCE.getClase_Metodos();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__ENUMS = eINSTANCE.getClase_Enums();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__NAMESPACE = eINSTANCE.getClase_Namespace();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__SUPER = eINSTANCE.getClase_Super();

		/**
		 * The meta object literal for the '<em><b>Constructores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__CONSTRUCTORES = eINSTANCE.getClase_Constructores();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.PropiedadImpl <em>Propiedad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.PropiedadImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getPropiedad()
		 * @generated
		 */
		EClass PROPIEDAD = eINSTANCE.getPropiedad();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.AtributoImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO__PROPIEDADES = eINSTANCE.getAtributo_Propiedades();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.MetodoImpl <em>Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.MetodoImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getMetodo()
		 * @generated
		 */
		EClass METODO = eINSTANCE.getMetodo();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODO__PARAMETROS = eINSTANCE.getMetodo_Parametros();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.ParametroImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getParametro()
		 * @generated
		 */
		EClass PARAMETRO = eINSTANCE.getParametro();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.PropiedadAtributoImpl <em>Propiedad Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.PropiedadAtributoImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getPropiedadAtributo()
		 * @generated
		 */
		EClass PROPIEDAD_ATRIBUTO = eINSTANCE.getPropiedadAtributo();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.TypedObjectImpl <em>Typed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.TypedObjectImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getTypedObject()
		 * @generated
		 */
		EClass TYPED_OBJECT = eINSTANCE.getTypedObject();

		/**
		 * The meta object literal for the '<em><b>Tipo Primitivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__TIPO_PRIMITIVO = eINSTANCE.getTypedObject_TipoPrimitivo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_OBJECT__TIPO = eINSTANCE.getTypedObject_Tipo();

		/**
		 * The meta object literal for the '<em><b>Lista</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_OBJECT__LISTA = eINSTANCE.getTypedObject_Lista();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.AttributesObjectImpl <em>Attributes Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.AttributesObjectImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getAttributesObject()
		 * @generated
		 */
		EClass ATTRIBUTES_OBJECT = eINSTANCE.getAttributesObject();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES_OBJECT__ATRIBUTOS = eINSTANCE.getAttributesObject_Atributos();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.ValueObjectImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__VALOR = eINSTANCE.getValueObject_Valor();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.ListImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__CLASE = eINSTANCE.getList_Clase();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.TipoImpl <em>Tipo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.TipoImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getTipo()
		 * @generated
		 */
		EClass TIPO = eINSTANCE.getTipo();

		/**
		 * The meta object literal for the '{@link webApiInput.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApiInput.impl.ConstructorImpl
		 * @see webApiInput.impl.WebApiInputPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__PARAMETROS = eINSTANCE.getConstructor_Parametros();

	}

} //WebApiInputPackage
