/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.ide.contentassist.antlr.internal.InternalSQLParser;
import org.xtext.example.services.SQLGrammarAccess;

public class SQLParser extends AbstractContentAssistParser {

	@Inject
	private SQLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSQLParser createParser() {
		InternalSQLParser result = new InternalSQLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getPrimaryKeyAccess().getGroup(), "rule__PrimaryKey__Group__0");
					put(grammarAccess.getPrimaryKeyAccess().getGroup_4(), "rule__PrimaryKey__Group_4__0");
					put(grammarAccess.getForeignKeyAccess().getGroup(), "rule__ForeignKey__Group__0");
					put(grammarAccess.getDataBaseAccess().getTablesAssignment(), "rule__DataBase__TablesAssignment");
					put(grammarAccess.getTableAccess().getNameAssignment_2(), "rule__Table__NameAssignment_2");
					put(grammarAccess.getTableAccess().getColumnsAssignment_4(), "rule__Table__ColumnsAssignment_4");
					put(grammarAccess.getTableAccess().getPrimaryKeyAssignment_5(), "rule__Table__PrimaryKeyAssignment_5");
					put(grammarAccess.getTableAccess().getForeignkeysAssignment_6(), "rule__Table__ForeignkeysAssignment_6");
					put(grammarAccess.getColumnAccess().getNameAssignment_0(), "rule__Column__NameAssignment_0");
					put(grammarAccess.getColumnAccess().getTypeAssignment_1(), "rule__Column__TypeAssignment_1");
					put(grammarAccess.getPrimaryKeyAccess().getNameAssignment_3(), "rule__PrimaryKey__NameAssignment_3");
					put(grammarAccess.getForeignKeyAccess().getNameAssignment_3(), "rule__ForeignKey__NameAssignment_3");
					put(grammarAccess.getForeignKeyAccess().getReftableAssignment_6(), "rule__ForeignKey__ReftableAssignment_6");
					put(grammarAccess.getForeignKeyAccess().getRefAssignment_8(), "rule__ForeignKey__RefAssignment_8");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSQLParser typedParser = (InternalSQLParser) parser;
			typedParser.entryRuleDataBase();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
