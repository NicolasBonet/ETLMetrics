package com.uniandes.config2sql.xtext.serializer;

import com.google.inject.Inject;
import com.uniandes.config2sql.xtext.services.ConfigGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ConfigSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ConfigGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ConfigGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMARule())
			return getCOMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTBRACKETRule())
			return getLEFTBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTPARENTESISRule())
			return getLEFTPARENTESISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERACONFIGRule())
			return getLITERACONFIGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERACONNECTIONRule())
			return getLITERACONNECTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALATTRIBUTENAMESRule())
			return getLITERALATTRIBUTENAMESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALFIELDSRule())
			return getLITERALFIELDSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALMERGEDFIELDSRule())
			return getLITERALMERGEDFIELDSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALPASSWORDRule())
			return getLITERALPASSWORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALTABLENAMERule())
			return getLITERALTABLENAMEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALURLRule())
			return getLITERALURLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERALUSERNAMERule())
			return getLITERALUSERNAMEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHTBRACKETRule())
			return getRIGHTBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHTPARENTESISRule())
			return getRIGHTPARENTESISToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COLON: ":";
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMA: ",";
	 */
	protected String getCOMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal LEFTBRACKET: "[";
	 */
	protected String getLEFTBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal LEFTPARENTESIS: "{";
	 */
	protected String getLEFTPARENTESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LITERACONFIG:
	 * "'config'";
	 */
	protected String getLITERACONFIGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'config\'";
	}
	
	/**
	 * terminal LITERACONNECTION:"'connection'";
	 */
	protected String getLITERACONNECTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'connection\'";
	}
	
	/**
	 * terminal LITERALATTRIBUTENAMES: "'attributeNames':";
	 */
	protected String getLITERALATTRIBUTENAMESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'attributeNames\':";
	}
	
	/**
	 * terminal LITERALFIELDS: "'fields':";
	 */
	protected String getLITERALFIELDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'fields\':";
	}
	
	/**
	 * terminal LITERALMERGEDFIELDS:
	 * "'mergeFields':";
	 */
	protected String getLITERALMERGEDFIELDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'mergeFields\':";
	}
	
	/**
	 * terminal LITERALPASSWORD: "'password':";
	 */
	protected String getLITERALPASSWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'password\':";
	}
	
	/**
	 * terminal LITERALTABLENAME: "'tableName':";
	 */
	protected String getLITERALTABLENAMEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'tableName\':";
	}
	
	/**
	 * terminal LITERALURL: "'url':";
	 */
	protected String getLITERALURLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'url\':";
	}
	
	/**
	 * terminal LITERALUSERNAME: "'username':";
	 */
	protected String getLITERALUSERNAMEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'username\':";
	}
	
	/**
	 * terminal RIGHTBRACKET: "]";
	 */
	protected String getRIGHTBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal RIGHTPARENTESIS: "}";
	 */
	protected String getRIGHTPARENTESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
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
