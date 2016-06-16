/*
 * generated by Xtext 2.9.1
 */
grammar InternalSql;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uniandes.automat.sql.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uniandes.automat.sql.ide.contentassist.antlr.internal;

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
import uniandes.automat.sql.services.SqlGrammarAccess;

}
@parser::members {
	private SqlGrammarAccess grammarAccess;

	public void setGrammarAccess(SqlGrammarAccess grammarAccess) {
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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getDatabaseAssignment()); }
		(rule__Model__DatabaseAssignment)
		{ after(grammarAccess.getModelAccess().getDatabaseAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDatabase
entryRuleDatabase
:
{ before(grammarAccess.getDatabaseRule()); }
	 ruleDatabase
{ after(grammarAccess.getDatabaseRule()); } 
	 EOF 
;

// Rule Database
ruleDatabase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDatabaseAccess().getTablesAssignment()); }
		(rule__Database__TablesAssignment)*
		{ after(grammarAccess.getDatabaseAccess().getTablesAssignment()); }
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

// Rule DataType
ruleDataType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getAlternatives()); }
		(rule__DataType__Alternatives)
		{ after(grammarAccess.getDataTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__FactsAlternatives_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_4_0_0()); }
		ruleColumn
		{ after(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_4_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_4_0_1()); }
		rulePrimaryKey
		{ after(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_4_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_4_0_2()); }
		ruleForeignKey
		{ after(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_4_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__FactsAlternatives_5_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_5_1_0_0()); }
		ruleColumn
		{ after(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_5_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_5_1_0_1()); }
		rulePrimaryKey
		{ after(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_5_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_5_1_0_2()); }
		ruleForeignKey
		{ after(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_5_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0()); }
		('varchar(255)')
		{ after(grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); }
		('int')
		{ after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); }
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
	{ before(grammarAccess.getTableAccess().getCREATEKeyword_0()); }
	'CREATE'
	{ after(grammarAccess.getTableAccess().getCREATEKeyword_0()); }
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
	{ before(grammarAccess.getTableAccess().getTABLEKeyword_1()); }
	'TABLE'
	{ after(grammarAccess.getTableAccess().getTABLEKeyword_1()); }
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
	{ before(grammarAccess.getTableAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getTableAccess().getLeftParenthesisKeyword_3()); }
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
	{ before(grammarAccess.getTableAccess().getFactsAssignment_4()); }
	(rule__Table__FactsAssignment_4)
	{ after(grammarAccess.getTableAccess().getFactsAssignment_4()); }
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
	{ before(grammarAccess.getTableAccess().getGroup_5()); }
	(rule__Table__Group_5__0)*
	{ after(grammarAccess.getTableAccess().getGroup_5()); }
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
	{ before(grammarAccess.getTableAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getTableAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Table__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group_5__0__Impl
	rule__Table__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getTableAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getFactsAssignment_5_1()); }
	(rule__Table__FactsAssignment_5_1)
	{ after(grammarAccess.getTableAccess().getFactsAssignment_5_1()); }
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
	{ before(grammarAccess.getColumnAccess().getTypeAssignment_1()); }
	(rule__Column__TypeAssignment_1)
	{ after(grammarAccess.getColumnAccess().getTypeAssignment_1()); }
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
	{ before(grammarAccess.getColumnAccess().getIsNotNullAssignment_2()); }
	(rule__Column__IsNotNullAssignment_2)?
	{ after(grammarAccess.getColumnAccess().getIsNotNullAssignment_2()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); }
	'PRIMARY'
	{ after(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); }
	'KEY'
	{ after(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getColAssignment_3()); }
	(rule__PrimaryKey__ColAssignment_3)
	{ after(grammarAccess.getPrimaryKeyAccess().getColAssignment_3()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); }
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
	{ before(grammarAccess.getPrimaryKeyAccess().getColAssignment_4_1()); }
	(rule__PrimaryKey__ColAssignment_4_1)
	{ after(grammarAccess.getPrimaryKeyAccess().getColAssignment_4_1()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); }
	'FOREIGN'
	{ after(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); }
	'KEY'
	{ after(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_3()); }
	(rule__ForeignKey__LocalColumnsAssignment_3)
	{ after(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_3()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); }
	'REFERENCES'
	{ after(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); }
	(rule__ForeignKey__ForeignTableAssignment_7)
	{ after(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); }
	'('
	{ after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); }
	(rule__ForeignKey__ForeignColumnsAssignment_9)
	{ after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); }
	')'
	{ after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_4_1()); }
	(rule__ForeignKey__LocalColumnsAssignment_4_1)
	{ after(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_4_1()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); }
	','
	{ after(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); }
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
	{ before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); }
	(rule__ForeignKey__ForeignColumnsAssignment_10_1)
	{ after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__DatabaseAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getDatabaseDatabaseParserRuleCall_0()); }
		ruleDatabase
		{ after(grammarAccess.getModelAccess().getDatabaseDatabaseParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Database__TablesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_0()); }
		ruleTable
		{ after(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_0()); }
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

rule__Table__FactsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getFactsAlternatives_4_0()); }
		(rule__Table__FactsAlternatives_4_0)
		{ after(grammarAccess.getTableAccess().getFactsAlternatives_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__FactsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getFactsAlternatives_5_1_0()); }
		(rule__Table__FactsAlternatives_5_1_0)
		{ after(grammarAccess.getTableAccess().getFactsAlternatives_5_1_0()); }
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

rule__Column__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0()); }
		ruleDataType
		{ after(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__IsNotNullAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); }
		(
			{ before(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); }
			'NOT NULL'
			{ after(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); }
		)
		{ after(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__ColAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0()); }
		(
			{ before(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryKey__ColAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__LocalColumnsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__LocalColumnsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ForeignTableAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getForeignTableTableCrossReference_7_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getForeignTableTableIDTerminalRuleCall_7_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getForeignTableTableIDTerminalRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getForeignTableTableCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ForeignColumnsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_9_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_9_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_9_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForeignKey__ForeignColumnsAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_10_1_0()); }
		(
			{ before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_10_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_10_1_0_1()); }
		)
		{ after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
