/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GrammarSqlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.Model");
		private final Assignment cTablesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTablesTableParserRuleCall_0 = (RuleCall)cTablesAssignment.eContents().get(0);
		
		//Model:
		//	tables+=Table+;
		@Override public ParserRule getRule() { return rule; }
		
		//tables+=Table+
		public Assignment getTablesAssignment() { return cTablesAssignment; }
		
		//Table
		public RuleCall getTablesTableParserRuleCall_0() { return cTablesTableParserRuleCall_0; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.Table");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCREATEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTABLEKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cLPARTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Alternatives cElementsAlternatives_4_0 = (Alternatives)cElementsAssignment_4.eContents().get(0);
		private final RuleCall cElementsColumnParserRuleCall_4_0_0 = (RuleCall)cElementsAlternatives_4_0.eContents().get(0);
		private final RuleCall cElementsPrimaryKeyParserRuleCall_4_0_1 = (RuleCall)cElementsAlternatives_4_0.eContents().get(1);
		private final RuleCall cElementsForeignKeyParserRuleCall_4_0_2 = (RuleCall)cElementsAlternatives_4_0.eContents().get(2);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cElementsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Alternatives cElementsAlternatives_5_1_0 = (Alternatives)cElementsAssignment_5_1.eContents().get(0);
		private final RuleCall cElementsColumnParserRuleCall_5_1_0_0 = (RuleCall)cElementsAlternatives_5_1_0.eContents().get(0);
		private final RuleCall cElementsPrimaryKeyParserRuleCall_5_1_0_1 = (RuleCall)cElementsAlternatives_5_1_0.eContents().get(1);
		private final RuleCall cElementsForeignKeyParserRuleCall_5_1_0_2 = (RuleCall)cElementsAlternatives_5_1_0.eContents().get(2);
		private final RuleCall cRPARTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//Table:
		//	"CREATE" "TABLE" name=ID LPAR
		//	elements+=(Column | PrimaryKey | ForeignKey) ("," elements+=(Column | PrimaryKey | ForeignKey))*
		//	RPAR;
		@Override public ParserRule getRule() { return rule; }
		
		//"CREATE" "TABLE" name=ID LPAR elements+=(Column | PrimaryKey | ForeignKey) ("," elements+=(Column | PrimaryKey |
		//ForeignKey))* RPAR
		public Group getGroup() { return cGroup; }
		
		//"CREATE"
		public Keyword getCREATEKeyword_0() { return cCREATEKeyword_0; }
		
		//"TABLE"
		public Keyword getTABLEKeyword_1() { return cTABLEKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//LPAR
		public RuleCall getLPARTerminalRuleCall_3() { return cLPARTerminalRuleCall_3; }
		
		//elements+=(Column | PrimaryKey | ForeignKey)
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//(Column | PrimaryKey | ForeignKey)
		public Alternatives getElementsAlternatives_4_0() { return cElementsAlternatives_4_0; }
		
		//Column
		public RuleCall getElementsColumnParserRuleCall_4_0_0() { return cElementsColumnParserRuleCall_4_0_0; }
		
		//PrimaryKey
		public RuleCall getElementsPrimaryKeyParserRuleCall_4_0_1() { return cElementsPrimaryKeyParserRuleCall_4_0_1; }
		
		//ForeignKey
		public RuleCall getElementsForeignKeyParserRuleCall_4_0_2() { return cElementsForeignKeyParserRuleCall_4_0_2; }
		
		//("," elements+=(Column | PrimaryKey | ForeignKey))*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//elements+=(Column | PrimaryKey | ForeignKey)
		public Assignment getElementsAssignment_5_1() { return cElementsAssignment_5_1; }
		
		//(Column | PrimaryKey | ForeignKey)
		public Alternatives getElementsAlternatives_5_1_0() { return cElementsAlternatives_5_1_0; }
		
		//Column
		public RuleCall getElementsColumnParserRuleCall_5_1_0_0() { return cElementsColumnParserRuleCall_5_1_0_0; }
		
		//PrimaryKey
		public RuleCall getElementsPrimaryKeyParserRuleCall_5_1_0_1() { return cElementsPrimaryKeyParserRuleCall_5_1_0_1; }
		
		//ForeignKey
		public RuleCall getElementsForeignKeyParserRuleCall_5_1_0_2() { return cElementsForeignKeyParserRuleCall_5_1_0_2; }
		
		//RPAR
		public RuleCall getRPARTerminalRuleCall_6() { return cRPARTerminalRuleCall_6; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.Column");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cTypeAlternatives_1_0 = (Alternatives)cTypeAssignment_1.eContents().get(0);
		private final Keyword cTypeIntKeyword_1_0_0 = (Keyword)cTypeAlternatives_1_0.eContents().get(0);
		private final Keyword cTypeVarcharKeyword_1_0_1 = (Keyword)cTypeAlternatives_1_0.eContents().get(1);
		private final Keyword cTypeDoubleKeyword_1_0_2 = (Keyword)cTypeAlternatives_1_0.eContents().get(2);
		private final Keyword cTypeFloatKeyword_1_0_3 = (Keyword)cTypeAlternatives_1_0.eContents().get(3);
		private final RuleCall cTamanoParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cIsNotNullAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIsNotNullNOTNULLTerminalRuleCall_3_0 = (RuleCall)cIsNotNullAssignment_3.eContents().get(0);
		
		//Column:
		//	name=ID type=('int' | 'varchar' | 'Double' | 'Float') Tamano? isNotNull?=NOTNULL?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID type=('int' | 'varchar' | 'Double' | 'Float') Tamano? isNotNull?=NOTNULL?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//type=('int' | 'varchar' | 'Double' | 'Float')
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//('int' | 'varchar' | 'Double' | 'Float')
		public Alternatives getTypeAlternatives_1_0() { return cTypeAlternatives_1_0; }
		
		//'int'
		public Keyword getTypeIntKeyword_1_0_0() { return cTypeIntKeyword_1_0_0; }
		
		//'varchar'
		public Keyword getTypeVarcharKeyword_1_0_1() { return cTypeVarcharKeyword_1_0_1; }
		
		//'Double'
		public Keyword getTypeDoubleKeyword_1_0_2() { return cTypeDoubleKeyword_1_0_2; }
		
		//'Float'
		public Keyword getTypeFloatKeyword_1_0_3() { return cTypeFloatKeyword_1_0_3; }
		
		//Tamano?
		public RuleCall getTamanoParserRuleCall_2() { return cTamanoParserRuleCall_2; }
		
		//isNotNull?=NOTNULL?
		public Assignment getIsNotNullAssignment_3() { return cIsNotNullAssignment_3; }
		
		//NOTNULL
		public RuleCall getIsNotNullNOTNULLTerminalRuleCall_3_0() { return cIsNotNullNOTNULLTerminalRuleCall_3_0; }
	}
	public class PrimaryKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.PrimaryKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPRIMARYKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cKEYKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cLPARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cColAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cColColumnCrossReference_3_0 = (CrossReference)cColAssignment_3.eContents().get(0);
		private final RuleCall cColColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cColColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cColAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cColColumnCrossReference_4_1_0 = (CrossReference)cColAssignment_4_1.eContents().get(0);
		private final RuleCall cColColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cColColumnCrossReference_4_1_0.eContents().get(1);
		private final RuleCall cRPARTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//PrimaryKey:
		//	"PRIMARY" "KEY" LPAR
		//	col+=[Column] ("," col+=[Column])*
		//	RPAR;
		@Override public ParserRule getRule() { return rule; }
		
		//"PRIMARY" "KEY" LPAR col+=[Column] ("," col+=[Column])* RPAR
		public Group getGroup() { return cGroup; }
		
		//"PRIMARY"
		public Keyword getPRIMARYKeyword_0() { return cPRIMARYKeyword_0; }
		
		//"KEY"
		public Keyword getKEYKeyword_1() { return cKEYKeyword_1; }
		
		//LPAR
		public RuleCall getLPARTerminalRuleCall_2() { return cLPARTerminalRuleCall_2; }
		
		//col+=[Column]
		public Assignment getColAssignment_3() { return cColAssignment_3; }
		
		//[Column]
		public CrossReference getColColumnCrossReference_3_0() { return cColColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getColColumnIDTerminalRuleCall_3_0_1() { return cColColumnIDTerminalRuleCall_3_0_1; }
		
		//("," col+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//col+=[Column]
		public Assignment getColAssignment_4_1() { return cColAssignment_4_1; }
		
		//[Column]
		public CrossReference getColColumnCrossReference_4_1_0() { return cColColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getColColumnIDTerminalRuleCall_4_1_0_1() { return cColColumnIDTerminalRuleCall_4_1_0_1; }
		
		//RPAR
		public RuleCall getRPARTerminalRuleCall_5() { return cRPARTerminalRuleCall_5; }
	}
	public class ForeignKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.ForeignKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFOREIGNKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cKEYKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cLPARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cLocalColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cLocalColumnsColumnCrossReference_3_0 = (CrossReference)cLocalColumnsAssignment_3.eContents().get(0);
		private final RuleCall cLocalColumnsColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cLocalColumnsColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLocalColumnsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cLocalColumnsColumnCrossReference_4_1_0 = (CrossReference)cLocalColumnsAssignment_4_1.eContents().get(0);
		private final RuleCall cLocalColumnsColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cLocalColumnsColumnCrossReference_4_1_0.eContents().get(1);
		private final RuleCall cRPARTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cRefReferenceParserRuleCall_6_0 = (RuleCall)cRefAssignment_6.eContents().get(0);
		
		//ForeignKey:
		//	"FOREIGN" "KEY" LPAR
		//	localColumns+=[Column] ("," localColumns+=[Column])*
		//	RPAR
		//	ref=Reference;
		@Override public ParserRule getRule() { return rule; }
		
		//"FOREIGN" "KEY" LPAR localColumns+=[Column] ("," localColumns+=[Column])* RPAR ref=Reference
		public Group getGroup() { return cGroup; }
		
		//"FOREIGN"
		public Keyword getFOREIGNKeyword_0() { return cFOREIGNKeyword_0; }
		
		//"KEY"
		public Keyword getKEYKeyword_1() { return cKEYKeyword_1; }
		
		//LPAR
		public RuleCall getLPARTerminalRuleCall_2() { return cLPARTerminalRuleCall_2; }
		
		//localColumns+=[Column]
		public Assignment getLocalColumnsAssignment_3() { return cLocalColumnsAssignment_3; }
		
		//[Column]
		public CrossReference getLocalColumnsColumnCrossReference_3_0() { return cLocalColumnsColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getLocalColumnsColumnIDTerminalRuleCall_3_0_1() { return cLocalColumnsColumnIDTerminalRuleCall_3_0_1; }
		
		//("," localColumns+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//localColumns+=[Column]
		public Assignment getLocalColumnsAssignment_4_1() { return cLocalColumnsAssignment_4_1; }
		
		//[Column]
		public CrossReference getLocalColumnsColumnCrossReference_4_1_0() { return cLocalColumnsColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getLocalColumnsColumnIDTerminalRuleCall_4_1_0_1() { return cLocalColumnsColumnIDTerminalRuleCall_4_1_0_1; }
		
		//RPAR
		public RuleCall getRPARTerminalRuleCall_5() { return cRPARTerminalRuleCall_5; }
		
		//ref=Reference
		public Assignment getRefAssignment_6() { return cRefAssignment_6; }
		
		//Reference
		public RuleCall getRefReferenceParserRuleCall_6_0() { return cRefReferenceParserRuleCall_6_0; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cREFERENCESKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFromTAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cFromTTableCrossReference_1_0 = (CrossReference)cFromTAssignment_1.eContents().get(0);
		private final RuleCall cFromTTableIDTerminalRuleCall_1_0_1 = (RuleCall)cFromTTableCrossReference_1_0.eContents().get(1);
		private final RuleCall cLPARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cFromCAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromCColumnCrossReference_3_0 = (CrossReference)cFromCAssignment_3.eContents().get(0);
		private final RuleCall cFromCColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cFromCColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFromCAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cFromCColumnCrossReference_4_1_0 = (CrossReference)cFromCAssignment_4_1.eContents().get(0);
		private final RuleCall cFromCColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cFromCColumnCrossReference_4_1_0.eContents().get(1);
		private final RuleCall cRPARTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Reference:
		//	"REFERENCES" fromT+=[Table] LPAR
		//	fromC+=[Column] ("," fromC+=[Column])*
		//	RPAR;
		@Override public ParserRule getRule() { return rule; }
		
		//"REFERENCES" fromT+=[Table] LPAR fromC+=[Column] ("," fromC+=[Column])* RPAR
		public Group getGroup() { return cGroup; }
		
		//"REFERENCES"
		public Keyword getREFERENCESKeyword_0() { return cREFERENCESKeyword_0; }
		
		//fromT+=[Table]
		public Assignment getFromTAssignment_1() { return cFromTAssignment_1; }
		
		//[Table]
		public CrossReference getFromTTableCrossReference_1_0() { return cFromTTableCrossReference_1_0; }
		
		//ID
		public RuleCall getFromTTableIDTerminalRuleCall_1_0_1() { return cFromTTableIDTerminalRuleCall_1_0_1; }
		
		//LPAR
		public RuleCall getLPARTerminalRuleCall_2() { return cLPARTerminalRuleCall_2; }
		
		//fromC+=[Column]
		public Assignment getFromCAssignment_3() { return cFromCAssignment_3; }
		
		//[Column]
		public CrossReference getFromCColumnCrossReference_3_0() { return cFromCColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getFromCColumnIDTerminalRuleCall_3_0_1() { return cFromCColumnIDTerminalRuleCall_3_0_1; }
		
		//("," fromC+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//fromC+=[Column]
		public Assignment getFromCAssignment_4_1() { return cFromCAssignment_4_1; }
		
		//[Column]
		public CrossReference getFromCColumnCrossReference_4_1_0() { return cFromCColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getFromCColumnIDTerminalRuleCall_4_1_0_1() { return cFromCColumnIDTerminalRuleCall_4_1_0_1; }
		
		//RPAR
		public RuleCall getRPARTerminalRuleCall_5() { return cRPARTerminalRuleCall_5; }
	}
	public class TamanoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.Tamano");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLPARTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cRPARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Tamano:
		//	LPAR INT* RPAR;
		@Override public ParserRule getRule() { return rule; }
		
		//LPAR INT* RPAR
		public Group getGroup() { return cGroup; }
		
		//LPAR
		public RuleCall getLPARTerminalRuleCall_0() { return cLPARTerminalRuleCall_0; }
		
		//INT*
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//RPAR
		public RuleCall getRPARTerminalRuleCall_2() { return cRPARTerminalRuleCall_2; }
	}
	
	
	private final ModelElements pModel;
	private final TableElements pTable;
	private final ColumnElements pColumn;
	private final PrimaryKeyElements pPrimaryKey;
	private final ForeignKeyElements pForeignKey;
	private final ReferenceElements pReference;
	private final TamanoElements pTamano;
	private final TerminalRule tCREATE;
	private final TerminalRule tLPAR;
	private final TerminalRule tRPAR;
	private final TerminalRule tNOTNULL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GrammarSqlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pTable = new TableElements();
		this.pColumn = new ColumnElements();
		this.pPrimaryKey = new PrimaryKeyElements();
		this.pForeignKey = new ForeignKeyElements();
		this.pReference = new ReferenceElements();
		this.pTamano = new TamanoElements();
		this.tCREATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.CREATE");
		this.tLPAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.LPAR");
		this.tRPAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.RPAR");
		this.tNOTNULL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GrammarSql.NOTNULL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co.edu.uniandes.GrammarSql".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	tables+=Table+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Table:
	//	"CREATE" "TABLE" name=ID LPAR
	//	elements+=(Column | PrimaryKey | ForeignKey) ("," elements+=(Column | PrimaryKey | ForeignKey))*
	//	RPAR;
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	//Column:
	//	name=ID type=('int' | 'varchar' | 'Double' | 'Float') Tamano? isNotNull?=NOTNULL?;
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//PrimaryKey:
	//	"PRIMARY" "KEY" LPAR
	//	col+=[Column] ("," col+=[Column])*
	//	RPAR;
	public PrimaryKeyElements getPrimaryKeyAccess() {
		return pPrimaryKey;
	}
	
	public ParserRule getPrimaryKeyRule() {
		return getPrimaryKeyAccess().getRule();
	}
	
	//ForeignKey:
	//	"FOREIGN" "KEY" LPAR
	//	localColumns+=[Column] ("," localColumns+=[Column])*
	//	RPAR
	//	ref=Reference;
	public ForeignKeyElements getForeignKeyAccess() {
		return pForeignKey;
	}
	
	public ParserRule getForeignKeyRule() {
		return getForeignKeyAccess().getRule();
	}
	
	//Reference:
	//	"REFERENCES" fromT+=[Table] LPAR
	//	fromC+=[Column] ("," fromC+=[Column])*
	//	RPAR;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//Tamano:
	//	LPAR INT* RPAR;
	public TamanoElements getTamanoAccess() {
		return pTamano;
	}
	
	public ParserRule getTamanoRule() {
		return getTamanoAccess().getRule();
	}
	
	//terminal CREATE:
	//	"CREATE" "TABLE";
	public TerminalRule getCREATERule() {
		return tCREATE;
	}
	
	//terminal LPAR:
	//	"(";
	public TerminalRule getLPARRule() {
		return tLPAR;
	}
	
	//terminal RPAR:
	//	")";
	public TerminalRule getRPARRule() {
		return tRPAR;
	}
	
	//terminal NOTNULL:
	//	'NOT NULL';
	public TerminalRule getNOTNULLRule() {
		return tNOTNULL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
