package org.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.services.CsharpGrammarAccess;
import webApiInput.Atributo;
import webApiInput.CSharp;
import webApiInput.Clase;
import webApiInput.Constructor;
import webApiInput.EnumLiteral;
import webApiInput.List;
import webApiInput.Metodo;
import webApiInput.Parametro;
import webApiInput.Propiedad;
import webApiInput.PropiedadAtributo;
import webApiInput.WebApiInputPackage;

@SuppressWarnings("all")
public abstract class AbstractCsharpSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CsharpGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == WebApiInputPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case WebApiInputPackage.ATRIBUTO:
				if(context == grammarAccess.getAtributoRule()) {
					sequence_Atributo(context, (Atributo) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.CSHARP:
				if(context == grammarAccess.getCSharpRule()) {
					sequence_CSharp(context, (CSharp) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.CLASE:
				if(context == grammarAccess.getClaseRule() ||
				   context == grammarAccess.getTipoRule()) {
					sequence_Clase(context, (Clase) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.CONSTRUCTOR:
				if(context == grammarAccess.getConstructorRule()) {
					sequence_Constructor(context, (Constructor) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.ENUM:
				if(context == grammarAccess.getEnumRule() ||
				   context == grammarAccess.getTipoRule()) {
					sequence_Enum(context, (webApiInput.Enum) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.ENUM_LITERAL:
				if(context == grammarAccess.getEnumLiteralRule()) {
					sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.METODO:
				if(context == grammarAccess.getMetodoRule()) {
					sequence_Metodo(context, (Metodo) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.PARAMETRO:
				if(context == grammarAccess.getParametroRule()) {
					sequence_Parametro(context, (Parametro) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.PROPIEDAD:
				if(context == grammarAccess.getPropiedadRule()) {
					sequence_Propiedad(context, (Propiedad) semanticObject); 
					return; 
				}
				else break;
			case WebApiInputPackage.PROPIEDAD_ATRIBUTO:
				if(context == grammarAccess.getPropiedadAtributoRule()) {
					sequence_PropiedadAtributo(context, (PropiedadAtributo) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID ((propiedades+=PropiedadAtributo propiedades+=PropiedadAtributo*) | valor=STRING)?)
	 */
	protected void sequence_Atributo(EObject context, Atributo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (clases+=Clase*)
	 */
	protected void sequence_CSharp(EObject context, CSharp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         namespace=ExpressionString 
	 *         atributos+=Atributo* 
	 *         name=ID 
	 *         super=ID? 
	 *         texto=ExpressionString 
	 *         constructores+=Constructor* 
	 *         enums+=Enum* 
	 *         propiedades+=Propiedad* 
	 *         metodos+=Metodo*
	 *     )
	 */
	protected void sequence_Clase(EObject context, Clase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parametros+=Parametro parametros+=Parametro*)? texto=ExpressionString)
	 */
	protected void sequence_Constructor(EObject context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_EnumLiteral(EObject context, EnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (valores+=EnumLiteral valores+=EnumLiteral*)?)
	 */
	protected void sequence_Enum(EObject context, webApiInput.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     clase=[Clase|ID]
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, WebApiInputPackage.Literals.LIST__CLASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebApiInputPackage.Literals.LIST__CLASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListAccess().getClaseClaseIDTerminalRuleCall_2_0_1(), semanticObject.getClase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         atributos+=Atributo* 
	 *         (tipo=[Tipo|EString] | tipoPrimitivo=DATATYPES | lista+=List) 
	 *         name=ID 
	 *         (parametros+=Parametro parametros+=Parametro*)? 
	 *         texto=ExpressionString
	 *     )
	 */
	protected void sequence_Metodo(EObject context, Metodo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (atributos+=Atributo* (tipo=[Tipo|EString] | tipoPrimitivo=DATATYPES | lista+=List) name=ID)
	 */
	protected void sequence_Parametro(EObject context, Parametro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID valor=EString)
	 */
	protected void sequence_PropiedadAtributo(EObject context, PropiedadAtributo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (atributos+=Atributo* (tipo=[Tipo|EString] | tipoPrimitivo=DATATYPES | lista+=List) name=ID)
	 */
	protected void sequence_Propiedad(EObject context, Propiedad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
