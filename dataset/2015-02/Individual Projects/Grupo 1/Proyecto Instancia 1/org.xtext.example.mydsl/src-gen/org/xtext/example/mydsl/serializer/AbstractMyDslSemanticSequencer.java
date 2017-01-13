package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import proyectos.Catalogo;
import proyectos.Contacto;
import proyectos.Mapa;
import proyectos.MarketPlace;
import proyectos.Promocion;
import proyectos.ProyectosPackage;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProyectosPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProyectosPackage.CATALOGO:
				if(context == grammarAccess.getCatalogoRule() ||
				   context == grammarAccess.getPaginaRule()) {
					sequence_Catalogo(context, (Catalogo) semanticObject); 
					return; 
				}
				else break;
			case ProyectosPackage.CONTACTO:
				if(context == grammarAccess.getContactoRule() ||
				   context == grammarAccess.getPaginaRule()) {
					sequence_Contacto(context, (Contacto) semanticObject); 
					return; 
				}
				else break;
			case ProyectosPackage.MAPA:
				if(context == grammarAccess.getMapaRule() ||
				   context == grammarAccess.getPaginaRule()) {
					sequence_Mapa(context, (Mapa) semanticObject); 
					return; 
				}
				else break;
			case ProyectosPackage.MARKET_PLACE:
				if(context == grammarAccess.getMarketPlaceRule()) {
					sequence_MarketPlace(context, (MarketPlace) semanticObject); 
					return; 
				}
				else break;
			case ProyectosPackage.PROMOCION:
				if(context == grammarAccess.getPaginaRule() ||
				   context == grammarAccess.getPromocionRule()) {
					sequence_Promocion(context, (Promocion) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (nombre=EString estilo=Estilo)
	 */
	protected void sequence_Catalogo(EObject context, Catalogo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_5_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getCatalogoAccess().getEstiloEstiloEnumRuleCall_8_0(), semanticObject.getEstilo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString estilo=Estilo)
	 */
	protected void sequence_Contacto(EObject context, Contacto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContactoAccess().getNombreEStringParserRuleCall_5_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getContactoAccess().getEstiloEstiloEnumRuleCall_8_0(), semanticObject.getEstilo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString estilo=Estilo)
	 */
	protected void sequence_Mapa(EObject context, Mapa semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMapaAccess().getNombreEStringParserRuleCall_5_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getMapaAccess().getEstiloEstiloEnumRuleCall_8_0(), semanticObject.getEstilo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString presentacion=TipoPresentacion paginas+=Pagina*)
	 */
	protected void sequence_MarketPlace(EObject context, MarketPlace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=EString estilo=Estilo)
	 */
	protected void sequence_Promocion(EObject context, Promocion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProyectosPackage.Literals.PAGINA__ESTILO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPromocionAccess().getNombreEStringParserRuleCall_5_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getPromocionAccess().getEstiloEstiloEnumRuleCall_8_0(), semanticObject.getEstilo());
		feeder.finish();
	}
}
