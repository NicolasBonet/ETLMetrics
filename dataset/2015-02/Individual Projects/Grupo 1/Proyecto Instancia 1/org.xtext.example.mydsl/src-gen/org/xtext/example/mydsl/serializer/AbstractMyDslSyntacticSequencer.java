package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEQUALSRule())
			return getEQUALSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getGREATERRule())
			return getGREATERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLESSRule())
			return getLESSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQUESTIONRule())
			return getQUESTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSCHEMALOCATIONRule())
			return getSCHEMALOCATIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSLASHRule())
			return getSLASHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTMARKETPLACERule())
			return getTMARKETPLACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTPAGINASRule())
			return getTPAGINASToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTPROYECTOSRule())
			return getTPROYECTOSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTXMIRule())
			return getTXMIToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTXSIRule())
			return getTXSIToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal EQUALS: "=";
	 */
	protected String getEQUALSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal GREATER: ">";
	 */
	protected String getGREATERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal LESS: "<";
	 */
	protected String getLESSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal QUESTION: "?";
	 */
	protected String getQUESTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?";
	}
	
	/**
	 * terminal SCHEMALOCATION : "\"http://www.example.org/proyectos proyectos.ecore\"";
	 */
	protected String getSCHEMALOCATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"http://www.example.org/proyectos proyectos.ecore\"";
	}
	
	/**
	 * terminal SLASH: "/";
	 */
	protected String getSLASHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	/**
	 * terminal TMARKETPLACE: "proyectos:MarketPlace";
	 */
	protected String getTMARKETPLACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "proyectos:MarketPlace";
	}
	
	/**
	 * terminal TPAGINAS: "paginas";
	 */
	protected String getTPAGINASToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "paginas";
	}
	
	/**
	 * terminal TPROYECTOS : "\"http://www.example.org/proyectos\"";
	 */
	protected String getTPROYECTOSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"http://www.example.org/proyectos\"";
	}
	
	/**
	 * terminal TXMI : "\"http://www.omg.org/XMI\"";
	 */
	protected String getTXMIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"http://www.omg.org/XMI\"";
	}
	
	/**
	 * terminal TXSI : "\"http://www.w3.org/2001/XMLSchema-instance\"";
	 */
	protected String getTXSIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"http://www.w3.org/2001/XMLSchema-instance\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
