/*
 * generated by Xtext 2.9.1
 */
grammar InternalGenSql;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package co.edu.uniandes.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package co.edu.uniandes.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.services.GenSqlGrammarAccess;

}
@parser::members {
	private GenSqlGrammarAccess grammarAccess;

	public void setGrammarAccess(GenSqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDataBase
entryRuleDataBase
:
{ before(grammarAccess.getDataBaseRule()); }
	 ruleDataBase
{ after(grammarAccess.getDataBaseRule()); } 
	 EOF 
;

// Rule DataBase
ruleDataBase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataBaseAccess().getGroup()); }
		(rule__DataBase__Group__0)
		{ after(grammarAccess.getDataBaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTable
entryRuleTable
:
{ before(grammarAccess.getTableRule()); }
	 ruleTable
{ after(grammarAccess.getTableRule()); } 
	 EOF 
;

// Rule Table
ruleTable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTableAccess().getGroup()); }
		(rule__Table__Group__0)
		{ after(grammarAccess.getTableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleColumn
entryRuleColumn
:
{ before(grammarAccess.getColumnRule()); }
	 ruleColumn
{ after(grammarAccess.getColumnRule()); } 
	 EOF 
;

// Rule Column
ruleColumn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getColumnAccess().getGroup()); }
		(rule__Column__Group__0)
		{ after(grammarAccess.getColumnAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimaryKey
entryRulePrimaryKey
:
{ before(grammarAccess.getPrimaryKeyRule()); }
	 rulePrimaryKey
{ after(grammarAccess.getPrimaryKeyRule()); } 
	 EOF 
;

// Rule PrimaryKey
rulePrimaryKey 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getGroup()); }
		(rule__PrimaryKey__Group__0)
		{ after(grammarAccess.getPrimaryKeyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForeignKey
entryRuleForeignKey
:
{ before(grammarAccess.getForeignKeyRule()); }
	 ruleForeignKey
{ after(grammarAccess.getForeignKeyRule()); } 
	 EOF 
;

// Rule ForeignKey
ruleForeignKey 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getForeignKeyAccess().getGroup()); }
		(rule__ForeignKey__Group__0)
		{ after(grammarAccess.getForeignKeyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Alternatives_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_0()); }
		RULE_SEMICOLON
		{ after(grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_0()); }
	)
	|
	(
		{ before(grammarAccess.getTableAccess().getFINTerminalRuleCall_8_1()); }
		RULE_FIN
		{ after(grammarAccess.getTableAccess().getFINTerminalRuleCall_8_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataBase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataBase__Group__0__Impl
	rule__DataBase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataBase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataBaseAccess().getDataBaseAction_0()); }
	()
	{ after(grammarAccess.getDataBaseAccess().getDataBaseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataBase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataBase__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataBase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); }
		(rule__DataBase__TablesAssignment_1)
		{ after(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); }
		(rule__DataBase__TablesAssignment_1)*
		{ after(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Table__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__0__Impl
	rule__Table__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getCREATETerminalRuleCall_0()); }
	RULE_CREATE
	{ after(grammarAccess.getTableAccess().getCREATETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__1__Impl
	rule__Table__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getCTABLETerminalRuleCall_1()); }
	RULE_CTABLE
	{ after(grammarAccess.getTableAccess().getCTABLETerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__2__Impl
	rule__Table__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getNameAssignment_2()); }
	(rule__Table__NameAssignment_2)
	{ after(grammarAccess.getTableAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__3__Impl
	rule__Table__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getLPARENTTerminalRuleCall_3()); }
	RULE_LPARENT
	{ after(grammarAccess.getTableAccess().getLPARENTTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__4__Impl
	rule__Table__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTableAccess().getColumnsAssignment_4()); }
		(rule__Table__ColumnsAssignment_4)
		{ after(grammarAccess.getTableAccess().getColumnsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getTableAccess().getColumnsAssignment_4()); }
		(rule__Table__ColumnsAssignment_4)*
		{ after(grammarAccess.getTableAccess().getColumnsAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__5__Impl
	rule__Table__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getPrimarykeyAssignment_5()); }
	(rule__Table__PrimarykeyAssignment_5)
	{ after(grammarAccess.getTableAccess().getPrimarykeyAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__6__Impl
	rule__Table__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getForeignkeysAssignment_6()); }
	(rule__Table__ForeignkeysAssignment_6)*
	{ after(grammarAccess.getTableAccess().getForeignkeysAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__7__Impl
	rule__Table__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getRPARENTTerminalRuleCall_7()); }
	RULE_RPARENT
	{ after(grammarAccess.getTableAccess().getRPARENTTerminalRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getAlternatives_8()); }
	(rule__Table__Alternatives_8)?
	{ after(grammarAccess.getTableAccess().getAlternatives_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Column__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__0__Impl
	rule__Column__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getNameAssignment_0()); }
	(rule__Column__NameAssignment_0)
	{ after(grammarAccess.getColumnAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__1__Impl
	rule__Column__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getSQLTypeAssignment_1()); }
	(rule__Column__SQLTypeAssignment_1)?
	{ after(grammarAccess.getColumnAccess().getSQLTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__2__Impl
	rule__Column__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getLongitudAssignment_2()); }
	(rule__Column__LongitudAssignment_2)?
	{ after(grammarAccess.getColumnAccess().getLongitudAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__3__Impl
	rule__Column__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getGroup_3()); }
	(rule__Column__Group_3__0)?
	{ after(grammarAccess.getColumnAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_4()); }
	(RULE_COMMA)?
	{ after(grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Column__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_3__0__Impl
	rule__Column__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getNOTTerminalRuleCall_3_0()); }
	RULE_NOT
	{ after(grammarAccess.getColumnAccess().getNOTTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3_1()); }
	RULE_NULL
	{ after(grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryKey__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__0__Impl
	rule__PrimaryKey__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0()); }
	RULE_PRIMARY
	{ after(grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__1__Impl
	rule__PrimaryKey__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1()); }
	RULE_KEY
	{ after(grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__2__Impl
	rule__PrimaryKey__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getLPARENTTerminalRuleCall_2()); }
	RULE_LPARENT
	{ after(grammarAccess.getPrimaryKeyAccess().getLPARENTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__3__Impl
	rule__PrimaryKey__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_3()); }
	(rule__PrimaryKey__ColumnsAssignment_3)
	{ after(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__4__Impl
	rule__PrimaryKey__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); }
	(rule__PrimaryKey__Group_4__0)*
	{ after(grammarAccess.getPrimaryKeyAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__5__Impl
	rule__PrimaryKey__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getRPARENTTerminalRuleCall_5()); }
	RULE_RPARENT
	{ after(grammarAccess.getPrimaryKeyAccess().getRPARENTTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6()); }
	(RULE_COMMA)?
	{ after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryKey__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group_4__0__Impl
	rule__PrimaryKey__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); }
		(RULE_COMMA)
		{ after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); }
	)
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); }
		(RULE_COMMA)*
		{ after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryKey__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_4_1()); }
	(rule__PrimaryKey__ColumnsAssignment_4_1)
	{ after(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForeignKey__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__0__Impl
	rule__ForeignKey__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0()); }
	RULE_FOREIGN
	{ after(grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__1__Impl
	rule__ForeignKey__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1()); }
	RULE_KEY
	{ after(grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__2__Impl
	rule__ForeignKey__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_2()); }
	RULE_LPARENT
	{ after(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__3__Impl
	rule__ForeignKey__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getColumnsAssignment_3()); }
	(rule__ForeignKey__ColumnsAssignment_3)
	{ after(grammarAccess.getForeignKeyAccess().getColumnsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__4__Impl
	rule__ForeignKey__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getGroup_4()); }
	(rule__ForeignKey__Group_4__0)*
	{ after(grammarAccess.getForeignKeyAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__5__Impl
	rule__ForeignKey__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_5()); }
	RULE_RPARENT
	{ after(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__6__Impl
	rule__ForeignKey__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6()); }
	RULE_REFERENCES
	{ after(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__7__Impl
	rule__ForeignKey__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getTableRefAssignment_7()); }
	(rule__ForeignKey__TableRefAssignment_7)
	{ after(grammarAccess.getForeignKeyAccess().getTableRefAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__8__Impl
	rule__ForeignKey__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_8()); }
	RULE_LPARENT
	{ after(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__9__Impl
	rule__ForeignKey__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_9()); }
	(rule__ForeignKey__ColumnsRefAssignment_9)
	{ after(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__10__Impl
	rule__ForeignKey__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getGroup_10()); }
	(rule__ForeignKey__Group_10__0)*
	{ after(grammarAccess.getForeignKeyAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__11__Impl
	rule__ForeignKey__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_11()); }
	RULE_RPARENT
	{ after(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12()); }
	(RULE_COMMA)?
	{ after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForeignKey__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group_4__0__Impl
	rule__ForeignKey__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); }
		(RULE_COMMA)
		{ after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); }
	)
	(
		{ before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); }
		(RULE_COMMA)*
		{ after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getColumnsAssignment_4_1()); }
	(rule__ForeignKey__ColumnsAssignment_4_1)
	{ after(grammarAccess.getForeignKeyAccess().getColumnsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForeignKey__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group_10__0__Impl
	rule__ForeignKey__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); }
		(RULE_COMMA)
		{ after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); }
	)
	(
		{ before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); }
		(RULE_COMMA)*
		{ after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForeignKey__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_10_1()); }
	(rule__ForeignKey__ColumnsRefAssignment_10_1)
	{ after(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataBase__TablesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_1_0()); }
		ruleTable
		{ after(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__ColumnsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0()); }
		ruleColumn
		{ after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__PrimarykeyAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getPrimarykeyPrimaryKeyParserRuleCall_5_0()); }
		rulePrimaryKey
		{ after(grammarAccess.getTableAccess().getPrimarykeyPrimaryKeyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__ForeignkeysAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0()); }
		ruleForeignKey
		{ after(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__SQLTypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getSQLTypeTIPOTerminalRuleCall_1_0()); }
		RULE_TIPO
		{ after(grammarAccess.getColumnAccess().getSQLTypeTIPOTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__LongitudAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getLongitudLONGITUDTerminalRuleCall_2_0()); }
		RULE_LONGITUD
		{ after(grammarAccess.getColumnAccess().getLongitudLONGITUDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__ColumnsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0()); }
		(
			{ before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__ColumnsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ColumnsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ColumnsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__TableRefAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getTableRefTableCrossReference_7_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getTableRefTableIDTerminalRuleCall_7_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getTableRefTableIDTerminalRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getTableRefTableCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ColumnsRefAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_9_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_9_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ColumnsRefAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_10_1_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_10_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_10_1_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_LONGITUD : RULE_LPARENT RULE_NUMBER RULE_RPARENT;

RULE_CREATE : 'CREATE';

RULE_CTABLE : 'TABLE';

RULE_LPARENT : '(';

RULE_RPARENT : ')';

RULE_SEMICOLON : ';';

RULE_COMMA : ',';

RULE_FOREIGN : 'FOREIGN';

RULE_PRIMARY : 'PRIMARY';

RULE_KEY : 'KEY';

RULE_NULL : 'NULL';

RULE_NOT : 'NOT';

RULE_REFERENCES : 'REFERENCES';

RULE_TIPO : ('varchar'|'int'|'String'|'boolean'|'date'|'number');

RULE_ID : ('a'..'z'|'A'..'Z') ('0'..'9'|'A'..'Z'|'a'..'z')*;

fragment RULE_NUMBER : ('0'..'9')*;

RULE_FIN : EOF;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
