/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalSQLParser;
import org.xtext.example.mydsl.services.SQLGrammarAccess;

public class SQLParser extends AbstractAntlrParser {

	@Inject
	private SQLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSQLParser createParser(XtextTokenStream stream) {
		return new InternalSQLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Database";
	}

	public SQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}