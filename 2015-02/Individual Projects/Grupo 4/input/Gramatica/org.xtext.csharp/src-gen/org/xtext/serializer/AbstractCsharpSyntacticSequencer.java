package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.CsharpGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractCsharpSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CsharpGrammarAccess grammarAccess;
	protected AbstractElementAlias match_List_IEnumerableKeyword_0_1_or_ListKeyword_0_0;
	protected AbstractElementAlias match_Propiedad___GetKeyword_6_0_SemicolonKeyword_6_1__q;
	protected AbstractElementAlias match_Propiedad___SetKeyword_7_0_SemicolonKeyword_7_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CsharpGrammarAccess) access;
		match_List_IEnumerableKeyword_0_1_or_ListKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getListAccess().getIEnumerableKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getListAccess().getListKeyword_0_0()));
		match_Propiedad___GetKeyword_6_0_SemicolonKeyword_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPropiedadAccess().getGetKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getPropiedadAccess().getSemicolonKeyword_6_1()));
		match_Propiedad___SetKeyword_7_0_SemicolonKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPropiedadAccess().getSetKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getPropiedadAccess().getSemicolonKeyword_7_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_List_IEnumerableKeyword_0_1_or_ListKeyword_0_0.equals(syntax))
				emit_List_IEnumerableKeyword_0_1_or_ListKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Propiedad___GetKeyword_6_0_SemicolonKeyword_6_1__q.equals(syntax))
				emit_Propiedad___GetKeyword_6_0_SemicolonKeyword_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Propiedad___SetKeyword_7_0_SemicolonKeyword_7_1__q.equals(syntax))
				emit_Propiedad___SetKeyword_7_0_SemicolonKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'List' | 'IEnumerable'
	 */
	protected void emit_List_IEnumerableKeyword_0_1_or_ListKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('get' ';')?
	 */
	protected void emit_Propiedad___GetKeyword_6_0_SemicolonKeyword_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('set' ';')?
	 */
	protected void emit_Propiedad___SetKeyword_7_0_SemicolonKeyword_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
