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
import co.edu.uniandes.services.GrammarSqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarSqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LPAR", "RULE_RPAR", "RULE_INT", "RULE_ID", "RULE_NOTNULL", "RULE_CREATE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'varchar'", "'Double'", "'Float'", "'CREATE'", "'TABLE'", "','", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'"
    };
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_CREATE=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_NOTNULL=8;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_RPAR=5;
    public static final int T__25=25;
    public static final int RULE_LPAR=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGrammarSqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGrammarSqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGrammarSqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGrammarSql.g"; }


    	private GrammarSqlGrammarAccess grammarAccess;

    	public void setGrammarAccess(GrammarSqlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalGrammarSql.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGrammarSql.g:54:1: ( ruleModel EOF )
            // InternalGrammarSql.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGrammarSql.g:62:1: ruleModel : ( ( ( rule__Model__TablesAssignment ) ) ( ( rule__Model__TablesAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:66:2: ( ( ( ( rule__Model__TablesAssignment ) ) ( ( rule__Model__TablesAssignment )* ) ) )
            // InternalGrammarSql.g:67:2: ( ( ( rule__Model__TablesAssignment ) ) ( ( rule__Model__TablesAssignment )* ) )
            {
            // InternalGrammarSql.g:67:2: ( ( ( rule__Model__TablesAssignment ) ) ( ( rule__Model__TablesAssignment )* ) )
            // InternalGrammarSql.g:68:3: ( ( rule__Model__TablesAssignment ) ) ( ( rule__Model__TablesAssignment )* )
            {
            // InternalGrammarSql.g:68:3: ( ( rule__Model__TablesAssignment ) )
            // InternalGrammarSql.g:69:4: ( rule__Model__TablesAssignment )
            {
             before(grammarAccess.getModelAccess().getTablesAssignment()); 
            // InternalGrammarSql.g:70:4: ( rule__Model__TablesAssignment )
            // InternalGrammarSql.g:70:5: rule__Model__TablesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__TablesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTablesAssignment()); 

            }

            // InternalGrammarSql.g:73:3: ( ( rule__Model__TablesAssignment )* )
            // InternalGrammarSql.g:74:4: ( rule__Model__TablesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTablesAssignment()); 
            // InternalGrammarSql.g:75:4: ( rule__Model__TablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrammarSql.g:75:5: rule__Model__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTablesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTable"
    // InternalGrammarSql.g:85:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalGrammarSql.g:86:1: ( ruleTable EOF )
            // InternalGrammarSql.g:87:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalGrammarSql.g:94:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:98:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalGrammarSql.g:99:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalGrammarSql.g:99:2: ( ( rule__Table__Group__0 ) )
            // InternalGrammarSql.g:100:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalGrammarSql.g:101:3: ( rule__Table__Group__0 )
            // InternalGrammarSql.g:101:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalGrammarSql.g:110:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalGrammarSql.g:111:1: ( ruleColumn EOF )
            // InternalGrammarSql.g:112:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalGrammarSql.g:119:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:123:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalGrammarSql.g:124:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalGrammarSql.g:124:2: ( ( rule__Column__Group__0 ) )
            // InternalGrammarSql.g:125:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalGrammarSql.g:126:3: ( rule__Column__Group__0 )
            // InternalGrammarSql.g:126:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalGrammarSql.g:135:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalGrammarSql.g:136:1: ( rulePrimaryKey EOF )
            // InternalGrammarSql.g:137:1: rulePrimaryKey EOF
            {
             before(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getPrimaryKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalGrammarSql.g:144:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:148:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalGrammarSql.g:149:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalGrammarSql.g:149:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalGrammarSql.g:150:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalGrammarSql.g:151:3: ( rule__PrimaryKey__Group__0 )
            // InternalGrammarSql.g:151:4: rule__PrimaryKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalGrammarSql.g:160:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalGrammarSql.g:161:1: ( ruleForeignKey EOF )
            // InternalGrammarSql.g:162:1: ruleForeignKey EOF
            {
             before(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getForeignKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalGrammarSql.g:169:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:173:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalGrammarSql.g:174:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalGrammarSql.g:174:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalGrammarSql.g:175:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalGrammarSql.g:176:3: ( rule__ForeignKey__Group__0 )
            // InternalGrammarSql.g:176:4: rule__ForeignKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleReference"
    // InternalGrammarSql.g:185:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalGrammarSql.g:186:1: ( ruleReference EOF )
            // InternalGrammarSql.g:187:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalGrammarSql.g:194:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:198:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalGrammarSql.g:199:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalGrammarSql.g:199:2: ( ( rule__Reference__Group__0 ) )
            // InternalGrammarSql.g:200:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalGrammarSql.g:201:3: ( rule__Reference__Group__0 )
            // InternalGrammarSql.g:201:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleTamano"
    // InternalGrammarSql.g:210:1: entryRuleTamano : ruleTamano EOF ;
    public final void entryRuleTamano() throws RecognitionException {
        try {
            // InternalGrammarSql.g:211:1: ( ruleTamano EOF )
            // InternalGrammarSql.g:212:1: ruleTamano EOF
            {
             before(grammarAccess.getTamanoRule()); 
            pushFollow(FOLLOW_1);
            ruleTamano();

            state._fsp--;

             after(grammarAccess.getTamanoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTamano"


    // $ANTLR start "ruleTamano"
    // InternalGrammarSql.g:219:1: ruleTamano : ( ( rule__Tamano__Group__0 ) ) ;
    public final void ruleTamano() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:223:2: ( ( ( rule__Tamano__Group__0 ) ) )
            // InternalGrammarSql.g:224:2: ( ( rule__Tamano__Group__0 ) )
            {
            // InternalGrammarSql.g:224:2: ( ( rule__Tamano__Group__0 ) )
            // InternalGrammarSql.g:225:3: ( rule__Tamano__Group__0 )
            {
             before(grammarAccess.getTamanoAccess().getGroup()); 
            // InternalGrammarSql.g:226:3: ( rule__Tamano__Group__0 )
            // InternalGrammarSql.g:226:4: rule__Tamano__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tamano__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTamanoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamano"


    // $ANTLR start "rule__Table__ElementsAlternatives_4_0"
    // InternalGrammarSql.g:234:1: rule__Table__ElementsAlternatives_4_0 : ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__Table__ElementsAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:238:1: ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGrammarSql.g:239:2: ( ruleColumn )
                    {
                    // InternalGrammarSql.g:239:2: ( ruleColumn )
                    // InternalGrammarSql.g:240:3: ruleColumn
                    {
                     before(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammarSql.g:245:2: ( rulePrimaryKey )
                    {
                    // InternalGrammarSql.g:245:2: ( rulePrimaryKey )
                    // InternalGrammarSql.g:246:3: rulePrimaryKey
                    {
                     before(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrammarSql.g:251:2: ( ruleForeignKey )
                    {
                    // InternalGrammarSql.g:251:2: ( ruleForeignKey )
                    // InternalGrammarSql.g:252:3: ruleForeignKey
                    {
                     before(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_4_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ElementsAlternatives_4_0"


    // $ANTLR start "rule__Table__ElementsAlternatives_5_1_0"
    // InternalGrammarSql.g:261:1: rule__Table__ElementsAlternatives_5_1_0 : ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__Table__ElementsAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:265:1: ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGrammarSql.g:266:2: ( ruleColumn )
                    {
                    // InternalGrammarSql.g:266:2: ( ruleColumn )
                    // InternalGrammarSql.g:267:3: ruleColumn
                    {
                     before(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_5_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_5_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammarSql.g:272:2: ( rulePrimaryKey )
                    {
                    // InternalGrammarSql.g:272:2: ( rulePrimaryKey )
                    // InternalGrammarSql.g:273:3: rulePrimaryKey
                    {
                     before(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_5_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_5_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrammarSql.g:278:2: ( ruleForeignKey )
                    {
                    // InternalGrammarSql.g:278:2: ( ruleForeignKey )
                    // InternalGrammarSql.g:279:3: ruleForeignKey
                    {
                     before(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_5_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_5_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ElementsAlternatives_5_1_0"


    // $ANTLR start "rule__Column__TypeAlternatives_1_0"
    // InternalGrammarSql.g:288:1: rule__Column__TypeAlternatives_1_0 : ( ( 'int' ) | ( 'varchar' ) | ( 'Double' ) | ( 'Float' ) );
    public final void rule__Column__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:292:1: ( ( 'int' ) | ( 'varchar' ) | ( 'Double' ) | ( 'Float' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGrammarSql.g:293:2: ( 'int' )
                    {
                    // InternalGrammarSql.g:293:2: ( 'int' )
                    // InternalGrammarSql.g:294:3: 'int'
                    {
                     before(grammarAccess.getColumnAccess().getTypeIntKeyword_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getColumnAccess().getTypeIntKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammarSql.g:299:2: ( 'varchar' )
                    {
                    // InternalGrammarSql.g:299:2: ( 'varchar' )
                    // InternalGrammarSql.g:300:3: 'varchar'
                    {
                     before(grammarAccess.getColumnAccess().getTypeVarcharKeyword_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getColumnAccess().getTypeVarcharKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrammarSql.g:305:2: ( 'Double' )
                    {
                    // InternalGrammarSql.g:305:2: ( 'Double' )
                    // InternalGrammarSql.g:306:3: 'Double'
                    {
                     before(grammarAccess.getColumnAccess().getTypeDoubleKeyword_1_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getColumnAccess().getTypeDoubleKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGrammarSql.g:311:2: ( 'Float' )
                    {
                    // InternalGrammarSql.g:311:2: ( 'Float' )
                    // InternalGrammarSql.g:312:3: 'Float'
                    {
                     before(grammarAccess.getColumnAccess().getTypeFloatKeyword_1_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getColumnAccess().getTypeFloatKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAlternatives_1_0"


    // $ANTLR start "rule__Table__Group__0"
    // InternalGrammarSql.g:321:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:325:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalGrammarSql.g:326:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalGrammarSql.g:333:1: rule__Table__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:337:1: ( ( 'CREATE' ) )
            // InternalGrammarSql.g:338:1: ( 'CREATE' )
            {
            // InternalGrammarSql.g:338:1: ( 'CREATE' )
            // InternalGrammarSql.g:339:2: 'CREATE'
            {
             before(grammarAccess.getTableAccess().getCREATEKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCREATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalGrammarSql.g:348:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:352:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalGrammarSql.g:353:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalGrammarSql.g:360:1: rule__Table__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:364:1: ( ( 'TABLE' ) )
            // InternalGrammarSql.g:365:1: ( 'TABLE' )
            {
            // InternalGrammarSql.g:365:1: ( 'TABLE' )
            // InternalGrammarSql.g:366:2: 'TABLE'
            {
             before(grammarAccess.getTableAccess().getTABLEKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalGrammarSql.g:375:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:379:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalGrammarSql.g:380:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalGrammarSql.g:387:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:391:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalGrammarSql.g:392:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalGrammarSql.g:392:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalGrammarSql.g:393:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalGrammarSql.g:394:2: ( rule__Table__NameAssignment_2 )
            // InternalGrammarSql.g:394:3: rule__Table__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalGrammarSql.g:402:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:406:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalGrammarSql.g:407:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalGrammarSql.g:414:1: rule__Table__Group__3__Impl : ( RULE_LPAR ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:418:1: ( ( RULE_LPAR ) )
            // InternalGrammarSql.g:419:1: ( RULE_LPAR )
            {
            // InternalGrammarSql.g:419:1: ( RULE_LPAR )
            // InternalGrammarSql.g:420:2: RULE_LPAR
            {
             before(grammarAccess.getTableAccess().getLPARTerminalRuleCall_3()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLPARTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalGrammarSql.g:429:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:433:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalGrammarSql.g:434:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalGrammarSql.g:441:1: rule__Table__Group__4__Impl : ( ( rule__Table__ElementsAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:445:1: ( ( ( rule__Table__ElementsAssignment_4 ) ) )
            // InternalGrammarSql.g:446:1: ( ( rule__Table__ElementsAssignment_4 ) )
            {
            // InternalGrammarSql.g:446:1: ( ( rule__Table__ElementsAssignment_4 ) )
            // InternalGrammarSql.g:447:2: ( rule__Table__ElementsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getElementsAssignment_4()); 
            // InternalGrammarSql.g:448:2: ( rule__Table__ElementsAssignment_4 )
            // InternalGrammarSql.g:448:3: rule__Table__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Table__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalGrammarSql.g:456:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:460:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalGrammarSql.g:461:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalGrammarSql.g:468:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:472:1: ( ( ( rule__Table__Group_5__0 )* ) )
            // InternalGrammarSql.g:473:1: ( ( rule__Table__Group_5__0 )* )
            {
            // InternalGrammarSql.g:473:1: ( ( rule__Table__Group_5__0 )* )
            // InternalGrammarSql.g:474:2: ( rule__Table__Group_5__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalGrammarSql.g:475:2: ( rule__Table__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrammarSql.g:475:3: rule__Table__Group_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalGrammarSql.g:483:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:487:1: ( rule__Table__Group__6__Impl )
            // InternalGrammarSql.g:488:2: rule__Table__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalGrammarSql.g:494:1: rule__Table__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:498:1: ( ( RULE_RPAR ) )
            // InternalGrammarSql.g:499:1: ( RULE_RPAR )
            {
            // InternalGrammarSql.g:499:1: ( RULE_RPAR )
            // InternalGrammarSql.g:500:2: RULE_RPAR
            {
             before(grammarAccess.getTableAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRPARTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group_5__0"
    // InternalGrammarSql.g:510:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:514:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalGrammarSql.g:515:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__0"


    // $ANTLR start "rule__Table__Group_5__0__Impl"
    // InternalGrammarSql.g:522:1: rule__Table__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:526:1: ( ( ',' ) )
            // InternalGrammarSql.g:527:1: ( ',' )
            {
            // InternalGrammarSql.g:527:1: ( ',' )
            // InternalGrammarSql.g:528:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__0__Impl"


    // $ANTLR start "rule__Table__Group_5__1"
    // InternalGrammarSql.g:537:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:541:1: ( rule__Table__Group_5__1__Impl )
            // InternalGrammarSql.g:542:2: rule__Table__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__1"


    // $ANTLR start "rule__Table__Group_5__1__Impl"
    // InternalGrammarSql.g:548:1: rule__Table__Group_5__1__Impl : ( ( rule__Table__ElementsAssignment_5_1 ) ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:552:1: ( ( ( rule__Table__ElementsAssignment_5_1 ) ) )
            // InternalGrammarSql.g:553:1: ( ( rule__Table__ElementsAssignment_5_1 ) )
            {
            // InternalGrammarSql.g:553:1: ( ( rule__Table__ElementsAssignment_5_1 ) )
            // InternalGrammarSql.g:554:2: ( rule__Table__ElementsAssignment_5_1 )
            {
             before(grammarAccess.getTableAccess().getElementsAssignment_5_1()); 
            // InternalGrammarSql.g:555:2: ( rule__Table__ElementsAssignment_5_1 )
            // InternalGrammarSql.g:555:3: rule__Table__ElementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalGrammarSql.g:564:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:568:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalGrammarSql.g:569:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalGrammarSql.g:576:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:580:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalGrammarSql.g:581:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalGrammarSql.g:581:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalGrammarSql.g:582:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalGrammarSql.g:583:2: ( rule__Column__NameAssignment_0 )
            // InternalGrammarSql.g:583:3: rule__Column__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalGrammarSql.g:591:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:595:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalGrammarSql.g:596:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalGrammarSql.g:603:1: rule__Column__Group__1__Impl : ( ( rule__Column__TypeAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:607:1: ( ( ( rule__Column__TypeAssignment_1 ) ) )
            // InternalGrammarSql.g:608:1: ( ( rule__Column__TypeAssignment_1 ) )
            {
            // InternalGrammarSql.g:608:1: ( ( rule__Column__TypeAssignment_1 ) )
            // InternalGrammarSql.g:609:2: ( rule__Column__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_1()); 
            // InternalGrammarSql.g:610:2: ( rule__Column__TypeAssignment_1 )
            // InternalGrammarSql.g:610:3: rule__Column__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalGrammarSql.g:618:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:622:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalGrammarSql.g:623:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalGrammarSql.g:630:1: rule__Column__Group__2__Impl : ( ( ruleTamano )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:634:1: ( ( ( ruleTamano )? ) )
            // InternalGrammarSql.g:635:1: ( ( ruleTamano )? )
            {
            // InternalGrammarSql.g:635:1: ( ( ruleTamano )? )
            // InternalGrammarSql.g:636:2: ( ruleTamano )?
            {
             before(grammarAccess.getColumnAccess().getTamanoParserRuleCall_2()); 
            // InternalGrammarSql.g:637:2: ( ruleTamano )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LPAR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrammarSql.g:637:3: ruleTamano
                    {
                    pushFollow(FOLLOW_2);
                    ruleTamano();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getTamanoParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalGrammarSql.g:645:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:649:1: ( rule__Column__Group__3__Impl )
            // InternalGrammarSql.g:650:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalGrammarSql.g:656:1: rule__Column__Group__3__Impl : ( ( rule__Column__IsNotNullAssignment_3 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:660:1: ( ( ( rule__Column__IsNotNullAssignment_3 )? ) )
            // InternalGrammarSql.g:661:1: ( ( rule__Column__IsNotNullAssignment_3 )? )
            {
            // InternalGrammarSql.g:661:1: ( ( rule__Column__IsNotNullAssignment_3 )? )
            // InternalGrammarSql.g:662:2: ( rule__Column__IsNotNullAssignment_3 )?
            {
             before(grammarAccess.getColumnAccess().getIsNotNullAssignment_3()); 
            // InternalGrammarSql.g:663:2: ( rule__Column__IsNotNullAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NOTNULL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGrammarSql.g:663:3: rule__Column__IsNotNullAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__IsNotNullAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getIsNotNullAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalGrammarSql.g:672:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:676:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalGrammarSql.g:677:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__0"


    // $ANTLR start "rule__PrimaryKey__Group__0__Impl"
    // InternalGrammarSql.g:684:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:688:1: ( ( 'PRIMARY' ) )
            // InternalGrammarSql.g:689:1: ( 'PRIMARY' )
            {
            // InternalGrammarSql.g:689:1: ( 'PRIMARY' )
            // InternalGrammarSql.g:690:2: 'PRIMARY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__1"
    // InternalGrammarSql.g:699:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:703:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalGrammarSql.g:704:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PrimaryKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__1"


    // $ANTLR start "rule__PrimaryKey__Group__1__Impl"
    // InternalGrammarSql.g:711:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:715:1: ( ( 'KEY' ) )
            // InternalGrammarSql.g:716:1: ( 'KEY' )
            {
            // InternalGrammarSql.g:716:1: ( 'KEY' )
            // InternalGrammarSql.g:717:2: 'KEY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__1__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__2"
    // InternalGrammarSql.g:726:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:730:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalGrammarSql.g:731:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PrimaryKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__2"


    // $ANTLR start "rule__PrimaryKey__Group__2__Impl"
    // InternalGrammarSql.g:738:1: rule__PrimaryKey__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:742:1: ( ( RULE_LPAR ) )
            // InternalGrammarSql.g:743:1: ( RULE_LPAR )
            {
            // InternalGrammarSql.g:743:1: ( RULE_LPAR )
            // InternalGrammarSql.g:744:2: RULE_LPAR
            {
             before(grammarAccess.getPrimaryKeyAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__3"
    // InternalGrammarSql.g:753:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:757:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalGrammarSql.g:758:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__3"


    // $ANTLR start "rule__PrimaryKey__Group__3__Impl"
    // InternalGrammarSql.g:765:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:769:1: ( ( ( rule__PrimaryKey__ColAssignment_3 ) ) )
            // InternalGrammarSql.g:770:1: ( ( rule__PrimaryKey__ColAssignment_3 ) )
            {
            // InternalGrammarSql.g:770:1: ( ( rule__PrimaryKey__ColAssignment_3 ) )
            // InternalGrammarSql.g:771:2: ( rule__PrimaryKey__ColAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColAssignment_3()); 
            // InternalGrammarSql.g:772:2: ( rule__PrimaryKey__ColAssignment_3 )
            // InternalGrammarSql.g:772:3: rule__PrimaryKey__ColAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__3__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__4"
    // InternalGrammarSql.g:780:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:784:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalGrammarSql.g:785:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryKey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__4"


    // $ANTLR start "rule__PrimaryKey__Group__4__Impl"
    // InternalGrammarSql.g:792:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:796:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalGrammarSql.g:797:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalGrammarSql.g:797:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalGrammarSql.g:798:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalGrammarSql.g:799:2: ( rule__PrimaryKey__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrammarSql.g:799:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__4__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__5"
    // InternalGrammarSql.g:807:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:811:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalGrammarSql.g:812:2: rule__PrimaryKey__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__5"


    // $ANTLR start "rule__PrimaryKey__Group__5__Impl"
    // InternalGrammarSql.g:818:1: rule__PrimaryKey__Group__5__Impl : ( RULE_RPAR ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:822:1: ( ( RULE_RPAR ) )
            // InternalGrammarSql.g:823:1: ( RULE_RPAR )
            {
            // InternalGrammarSql.g:823:1: ( RULE_RPAR )
            // InternalGrammarSql.g:824:2: RULE_RPAR
            {
             before(grammarAccess.getPrimaryKeyAccess().getRPARTerminalRuleCall_5()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getRPARTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__5__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__0"
    // InternalGrammarSql.g:834:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:838:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalGrammarSql.g:839:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimaryKey__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__0"


    // $ANTLR start "rule__PrimaryKey__Group_4__0__Impl"
    // InternalGrammarSql.g:846:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:850:1: ( ( ',' ) )
            // InternalGrammarSql.g:851:1: ( ',' )
            {
            // InternalGrammarSql.g:851:1: ( ',' )
            // InternalGrammarSql.g:852:2: ','
            {
             before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__1"
    // InternalGrammarSql.g:861:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:865:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalGrammarSql.g:866:2: rule__PrimaryKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__1"


    // $ANTLR start "rule__PrimaryKey__Group_4__1__Impl"
    // InternalGrammarSql.g:872:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:876:1: ( ( ( rule__PrimaryKey__ColAssignment_4_1 ) ) )
            // InternalGrammarSql.g:877:1: ( ( rule__PrimaryKey__ColAssignment_4_1 ) )
            {
            // InternalGrammarSql.g:877:1: ( ( rule__PrimaryKey__ColAssignment_4_1 ) )
            // InternalGrammarSql.g:878:2: ( rule__PrimaryKey__ColAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColAssignment_4_1()); 
            // InternalGrammarSql.g:879:2: ( rule__PrimaryKey__ColAssignment_4_1 )
            // InternalGrammarSql.g:879:3: rule__PrimaryKey__ColAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // InternalGrammarSql.g:888:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:892:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalGrammarSql.g:893:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ForeignKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0"


    // $ANTLR start "rule__ForeignKey__Group__0__Impl"
    // InternalGrammarSql.g:900:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:904:1: ( ( 'FOREIGN' ) )
            // InternalGrammarSql.g:905:1: ( 'FOREIGN' )
            {
            // InternalGrammarSql.g:905:1: ( 'FOREIGN' )
            // InternalGrammarSql.g:906:2: 'FOREIGN'
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group__1"
    // InternalGrammarSql.g:915:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:919:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalGrammarSql.g:920:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ForeignKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1"


    // $ANTLR start "rule__ForeignKey__Group__1__Impl"
    // InternalGrammarSql.g:927:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:931:1: ( ( 'KEY' ) )
            // InternalGrammarSql.g:932:1: ( 'KEY' )
            {
            // InternalGrammarSql.g:932:1: ( 'KEY' )
            // InternalGrammarSql.g:933:2: 'KEY'
            {
             before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__2"
    // InternalGrammarSql.g:942:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:946:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalGrammarSql.g:947:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ForeignKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2"


    // $ANTLR start "rule__ForeignKey__Group__2__Impl"
    // InternalGrammarSql.g:954:1: rule__ForeignKey__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:958:1: ( ( RULE_LPAR ) )
            // InternalGrammarSql.g:959:1: ( RULE_LPAR )
            {
            // InternalGrammarSql.g:959:1: ( RULE_LPAR )
            // InternalGrammarSql.g:960:2: RULE_LPAR
            {
             before(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__3"
    // InternalGrammarSql.g:969:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:973:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalGrammarSql.g:974:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ForeignKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3"


    // $ANTLR start "rule__ForeignKey__Group__3__Impl"
    // InternalGrammarSql.g:981:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:985:1: ( ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) ) )
            // InternalGrammarSql.g:986:1: ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) )
            {
            // InternalGrammarSql.g:986:1: ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) )
            // InternalGrammarSql.g:987:2: ( rule__ForeignKey__LocalColumnsAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_3()); 
            // InternalGrammarSql.g:988:2: ( rule__ForeignKey__LocalColumnsAssignment_3 )
            // InternalGrammarSql.g:988:3: rule__ForeignKey__LocalColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__LocalColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3__Impl"


    // $ANTLR start "rule__ForeignKey__Group__4"
    // InternalGrammarSql.g:996:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1000:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalGrammarSql.g:1001:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ForeignKey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__4"


    // $ANTLR start "rule__ForeignKey__Group__4__Impl"
    // InternalGrammarSql.g:1008:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1012:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalGrammarSql.g:1013:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalGrammarSql.g:1013:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalGrammarSql.g:1014:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalGrammarSql.g:1015:2: ( rule__ForeignKey__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrammarSql.g:1015:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getForeignKeyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__4__Impl"


    // $ANTLR start "rule__ForeignKey__Group__5"
    // InternalGrammarSql.g:1023:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1027:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalGrammarSql.g:1028:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ForeignKey__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__5"


    // $ANTLR start "rule__ForeignKey__Group__5__Impl"
    // InternalGrammarSql.g:1035:1: rule__ForeignKey__Group__5__Impl : ( RULE_RPAR ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1039:1: ( ( RULE_RPAR ) )
            // InternalGrammarSql.g:1040:1: ( RULE_RPAR )
            {
            // InternalGrammarSql.g:1040:1: ( RULE_RPAR )
            // InternalGrammarSql.g:1041:2: RULE_RPAR
            {
             before(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_5()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__5__Impl"


    // $ANTLR start "rule__ForeignKey__Group__6"
    // InternalGrammarSql.g:1050:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1054:1: ( rule__ForeignKey__Group__6__Impl )
            // InternalGrammarSql.g:1055:2: rule__ForeignKey__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__6"


    // $ANTLR start "rule__ForeignKey__Group__6__Impl"
    // InternalGrammarSql.g:1061:1: rule__ForeignKey__Group__6__Impl : ( ( rule__ForeignKey__RefAssignment_6 ) ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1065:1: ( ( ( rule__ForeignKey__RefAssignment_6 ) ) )
            // InternalGrammarSql.g:1066:1: ( ( rule__ForeignKey__RefAssignment_6 ) )
            {
            // InternalGrammarSql.g:1066:1: ( ( rule__ForeignKey__RefAssignment_6 ) )
            // InternalGrammarSql.g:1067:2: ( rule__ForeignKey__RefAssignment_6 )
            {
             before(grammarAccess.getForeignKeyAccess().getRefAssignment_6()); 
            // InternalGrammarSql.g:1068:2: ( rule__ForeignKey__RefAssignment_6 )
            // InternalGrammarSql.g:1068:3: rule__ForeignKey__RefAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__RefAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getRefAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__6__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__0"
    // InternalGrammarSql.g:1077:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1081:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalGrammarSql.g:1082:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ForeignKey__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__0"


    // $ANTLR start "rule__ForeignKey__Group_4__0__Impl"
    // InternalGrammarSql.g:1089:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1093:1: ( ( ',' ) )
            // InternalGrammarSql.g:1094:1: ( ',' )
            {
            // InternalGrammarSql.g:1094:1: ( ',' )
            // InternalGrammarSql.g:1095:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__1"
    // InternalGrammarSql.g:1104:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1108:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalGrammarSql.g:1109:2: rule__ForeignKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__1"


    // $ANTLR start "rule__ForeignKey__Group_4__1__Impl"
    // InternalGrammarSql.g:1115:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1119:1: ( ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) ) )
            // InternalGrammarSql.g:1120:1: ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) )
            {
            // InternalGrammarSql.g:1120:1: ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) )
            // InternalGrammarSql.g:1121:2: ( rule__ForeignKey__LocalColumnsAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_4_1()); 
            // InternalGrammarSql.g:1122:2: ( rule__ForeignKey__LocalColumnsAssignment_4_1 )
            // InternalGrammarSql.g:1122:3: rule__ForeignKey__LocalColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__LocalColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalGrammarSql.g:1131:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1135:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalGrammarSql.g:1136:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalGrammarSql.g:1143:1: rule__Reference__Group__0__Impl : ( 'REFERENCES' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1147:1: ( ( 'REFERENCES' ) )
            // InternalGrammarSql.g:1148:1: ( 'REFERENCES' )
            {
            // InternalGrammarSql.g:1148:1: ( 'REFERENCES' )
            // InternalGrammarSql.g:1149:2: 'REFERENCES'
            {
             before(grammarAccess.getReferenceAccess().getREFERENCESKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getREFERENCESKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalGrammarSql.g:1158:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1162:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalGrammarSql.g:1163:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalGrammarSql.g:1170:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__FromTAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1174:1: ( ( ( rule__Reference__FromTAssignment_1 ) ) )
            // InternalGrammarSql.g:1175:1: ( ( rule__Reference__FromTAssignment_1 ) )
            {
            // InternalGrammarSql.g:1175:1: ( ( rule__Reference__FromTAssignment_1 ) )
            // InternalGrammarSql.g:1176:2: ( rule__Reference__FromTAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getFromTAssignment_1()); 
            // InternalGrammarSql.g:1177:2: ( rule__Reference__FromTAssignment_1 )
            // InternalGrammarSql.g:1177:3: rule__Reference__FromTAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__FromTAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getFromTAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalGrammarSql.g:1185:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1189:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalGrammarSql.g:1190:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalGrammarSql.g:1197:1: rule__Reference__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1201:1: ( ( RULE_LPAR ) )
            // InternalGrammarSql.g:1202:1: ( RULE_LPAR )
            {
            // InternalGrammarSql.g:1202:1: ( RULE_LPAR )
            // InternalGrammarSql.g:1203:2: RULE_LPAR
            {
             before(grammarAccess.getReferenceAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalGrammarSql.g:1212:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1216:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalGrammarSql.g:1217:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalGrammarSql.g:1224:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__FromCAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1228:1: ( ( ( rule__Reference__FromCAssignment_3 ) ) )
            // InternalGrammarSql.g:1229:1: ( ( rule__Reference__FromCAssignment_3 ) )
            {
            // InternalGrammarSql.g:1229:1: ( ( rule__Reference__FromCAssignment_3 ) )
            // InternalGrammarSql.g:1230:2: ( rule__Reference__FromCAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getFromCAssignment_3()); 
            // InternalGrammarSql.g:1231:2: ( rule__Reference__FromCAssignment_3 )
            // InternalGrammarSql.g:1231:3: rule__Reference__FromCAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__FromCAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getFromCAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalGrammarSql.g:1239:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1243:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalGrammarSql.g:1244:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalGrammarSql.g:1251:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )* ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1255:1: ( ( ( rule__Reference__Group_4__0 )* ) )
            // InternalGrammarSql.g:1256:1: ( ( rule__Reference__Group_4__0 )* )
            {
            // InternalGrammarSql.g:1256:1: ( ( rule__Reference__Group_4__0 )* )
            // InternalGrammarSql.g:1257:2: ( rule__Reference__Group_4__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // InternalGrammarSql.g:1258:2: ( rule__Reference__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrammarSql.g:1258:3: rule__Reference__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Reference__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // InternalGrammarSql.g:1266:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1270:1: ( rule__Reference__Group__5__Impl )
            // InternalGrammarSql.g:1271:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalGrammarSql.g:1277:1: rule__Reference__Group__5__Impl : ( RULE_RPAR ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1281:1: ( ( RULE_RPAR ) )
            // InternalGrammarSql.g:1282:1: ( RULE_RPAR )
            {
            // InternalGrammarSql.g:1282:1: ( RULE_RPAR )
            // InternalGrammarSql.g:1283:2: RULE_RPAR
            {
             before(grammarAccess.getReferenceAccess().getRPARTerminalRuleCall_5()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRPARTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // InternalGrammarSql.g:1293:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1297:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // InternalGrammarSql.g:1298:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // InternalGrammarSql.g:1305:1: rule__Reference__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1309:1: ( ( ',' ) )
            // InternalGrammarSql.g:1310:1: ( ',' )
            {
            // InternalGrammarSql.g:1310:1: ( ',' )
            // InternalGrammarSql.g:1311:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // InternalGrammarSql.g:1320:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1324:1: ( rule__Reference__Group_4__1__Impl )
            // InternalGrammarSql.g:1325:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // InternalGrammarSql.g:1331:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__FromCAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1335:1: ( ( ( rule__Reference__FromCAssignment_4_1 ) ) )
            // InternalGrammarSql.g:1336:1: ( ( rule__Reference__FromCAssignment_4_1 ) )
            {
            // InternalGrammarSql.g:1336:1: ( ( rule__Reference__FromCAssignment_4_1 ) )
            // InternalGrammarSql.g:1337:2: ( rule__Reference__FromCAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getFromCAssignment_4_1()); 
            // InternalGrammarSql.g:1338:2: ( rule__Reference__FromCAssignment_4_1 )
            // InternalGrammarSql.g:1338:3: rule__Reference__FromCAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__FromCAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getFromCAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Tamano__Group__0"
    // InternalGrammarSql.g:1347:1: rule__Tamano__Group__0 : rule__Tamano__Group__0__Impl rule__Tamano__Group__1 ;
    public final void rule__Tamano__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1351:1: ( rule__Tamano__Group__0__Impl rule__Tamano__Group__1 )
            // InternalGrammarSql.g:1352:2: rule__Tamano__Group__0__Impl rule__Tamano__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Tamano__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tamano__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tamano__Group__0"


    // $ANTLR start "rule__Tamano__Group__0__Impl"
    // InternalGrammarSql.g:1359:1: rule__Tamano__Group__0__Impl : ( RULE_LPAR ) ;
    public final void rule__Tamano__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1363:1: ( ( RULE_LPAR ) )
            // InternalGrammarSql.g:1364:1: ( RULE_LPAR )
            {
            // InternalGrammarSql.g:1364:1: ( RULE_LPAR )
            // InternalGrammarSql.g:1365:2: RULE_LPAR
            {
             before(grammarAccess.getTamanoAccess().getLPARTerminalRuleCall_0()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getTamanoAccess().getLPARTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tamano__Group__0__Impl"


    // $ANTLR start "rule__Tamano__Group__1"
    // InternalGrammarSql.g:1374:1: rule__Tamano__Group__1 : rule__Tamano__Group__1__Impl rule__Tamano__Group__2 ;
    public final void rule__Tamano__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1378:1: ( rule__Tamano__Group__1__Impl rule__Tamano__Group__2 )
            // InternalGrammarSql.g:1379:2: rule__Tamano__Group__1__Impl rule__Tamano__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tamano__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tamano__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tamano__Group__1"


    // $ANTLR start "rule__Tamano__Group__1__Impl"
    // InternalGrammarSql.g:1386:1: rule__Tamano__Group__1__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Tamano__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1390:1: ( ( ( RULE_INT )* ) )
            // InternalGrammarSql.g:1391:1: ( ( RULE_INT )* )
            {
            // InternalGrammarSql.g:1391:1: ( ( RULE_INT )* )
            // InternalGrammarSql.g:1392:2: ( RULE_INT )*
            {
             before(grammarAccess.getTamanoAccess().getINTTerminalRuleCall_1()); 
            // InternalGrammarSql.g:1393:2: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrammarSql.g:1393:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_15); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTamanoAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tamano__Group__1__Impl"


    // $ANTLR start "rule__Tamano__Group__2"
    // InternalGrammarSql.g:1401:1: rule__Tamano__Group__2 : rule__Tamano__Group__2__Impl ;
    public final void rule__Tamano__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1405:1: ( rule__Tamano__Group__2__Impl )
            // InternalGrammarSql.g:1406:2: rule__Tamano__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tamano__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tamano__Group__2"


    // $ANTLR start "rule__Tamano__Group__2__Impl"
    // InternalGrammarSql.g:1412:1: rule__Tamano__Group__2__Impl : ( RULE_RPAR ) ;
    public final void rule__Tamano__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1416:1: ( ( RULE_RPAR ) )
            // InternalGrammarSql.g:1417:1: ( RULE_RPAR )
            {
            // InternalGrammarSql.g:1417:1: ( RULE_RPAR )
            // InternalGrammarSql.g:1418:2: RULE_RPAR
            {
             before(grammarAccess.getTamanoAccess().getRPARTerminalRuleCall_2()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getTamanoAccess().getRPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tamano__Group__2__Impl"


    // $ANTLR start "rule__Model__TablesAssignment"
    // InternalGrammarSql.g:1428:1: rule__Model__TablesAssignment : ( ruleTable ) ;
    public final void rule__Model__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1432:1: ( ( ruleTable ) )
            // InternalGrammarSql.g:1433:2: ( ruleTable )
            {
            // InternalGrammarSql.g:1433:2: ( ruleTable )
            // InternalGrammarSql.g:1434:3: ruleTable
            {
             before(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TablesAssignment"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalGrammarSql.g:1443:1: rule__Table__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1447:1: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1448:2: ( RULE_ID )
            {
            // InternalGrammarSql.g:1448:2: ( RULE_ID )
            // InternalGrammarSql.g:1449:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_2"


    // $ANTLR start "rule__Table__ElementsAssignment_4"
    // InternalGrammarSql.g:1458:1: rule__Table__ElementsAssignment_4 : ( ( rule__Table__ElementsAlternatives_4_0 ) ) ;
    public final void rule__Table__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1462:1: ( ( ( rule__Table__ElementsAlternatives_4_0 ) ) )
            // InternalGrammarSql.g:1463:2: ( ( rule__Table__ElementsAlternatives_4_0 ) )
            {
            // InternalGrammarSql.g:1463:2: ( ( rule__Table__ElementsAlternatives_4_0 ) )
            // InternalGrammarSql.g:1464:3: ( rule__Table__ElementsAlternatives_4_0 )
            {
             before(grammarAccess.getTableAccess().getElementsAlternatives_4_0()); 
            // InternalGrammarSql.g:1465:3: ( rule__Table__ElementsAlternatives_4_0 )
            // InternalGrammarSql.g:1465:4: rule__Table__ElementsAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__ElementsAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getElementsAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ElementsAssignment_4"


    // $ANTLR start "rule__Table__ElementsAssignment_5_1"
    // InternalGrammarSql.g:1473:1: rule__Table__ElementsAssignment_5_1 : ( ( rule__Table__ElementsAlternatives_5_1_0 ) ) ;
    public final void rule__Table__ElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1477:1: ( ( ( rule__Table__ElementsAlternatives_5_1_0 ) ) )
            // InternalGrammarSql.g:1478:2: ( ( rule__Table__ElementsAlternatives_5_1_0 ) )
            {
            // InternalGrammarSql.g:1478:2: ( ( rule__Table__ElementsAlternatives_5_1_0 ) )
            // InternalGrammarSql.g:1479:3: ( rule__Table__ElementsAlternatives_5_1_0 )
            {
             before(grammarAccess.getTableAccess().getElementsAlternatives_5_1_0()); 
            // InternalGrammarSql.g:1480:3: ( rule__Table__ElementsAlternatives_5_1_0 )
            // InternalGrammarSql.g:1480:4: rule__Table__ElementsAlternatives_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__ElementsAlternatives_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getElementsAlternatives_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ElementsAssignment_5_1"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalGrammarSql.g:1488:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1492:1: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1493:2: ( RULE_ID )
            {
            // InternalGrammarSql.g:1493:2: ( RULE_ID )
            // InternalGrammarSql.g:1494:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_0"


    // $ANTLR start "rule__Column__TypeAssignment_1"
    // InternalGrammarSql.g:1503:1: rule__Column__TypeAssignment_1 : ( ( rule__Column__TypeAlternatives_1_0 ) ) ;
    public final void rule__Column__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1507:1: ( ( ( rule__Column__TypeAlternatives_1_0 ) ) )
            // InternalGrammarSql.g:1508:2: ( ( rule__Column__TypeAlternatives_1_0 ) )
            {
            // InternalGrammarSql.g:1508:2: ( ( rule__Column__TypeAlternatives_1_0 ) )
            // InternalGrammarSql.g:1509:3: ( rule__Column__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getColumnAccess().getTypeAlternatives_1_0()); 
            // InternalGrammarSql.g:1510:3: ( rule__Column__TypeAlternatives_1_0 )
            // InternalGrammarSql.g:1510:4: rule__Column__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_1"


    // $ANTLR start "rule__Column__IsNotNullAssignment_3"
    // InternalGrammarSql.g:1518:1: rule__Column__IsNotNullAssignment_3 : ( RULE_NOTNULL ) ;
    public final void rule__Column__IsNotNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1522:1: ( ( RULE_NOTNULL ) )
            // InternalGrammarSql.g:1523:2: ( RULE_NOTNULL )
            {
            // InternalGrammarSql.g:1523:2: ( RULE_NOTNULL )
            // InternalGrammarSql.g:1524:3: RULE_NOTNULL
            {
             before(grammarAccess.getColumnAccess().getIsNotNullNOTNULLTerminalRuleCall_3_0()); 
            match(input,RULE_NOTNULL,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getIsNotNullNOTNULLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__IsNotNullAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColAssignment_3"
    // InternalGrammarSql.g:1533:1: rule__PrimaryKey__ColAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1537:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1538:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1538:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1539:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0()); 
            // InternalGrammarSql.g:1540:3: ( RULE_ID )
            // InternalGrammarSql.g:1541:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__ColAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColAssignment_4_1"
    // InternalGrammarSql.g:1552:1: rule__PrimaryKey__ColAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1556:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1557:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1557:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1558:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0()); 
            // InternalGrammarSql.g:1559:3: ( RULE_ID )
            // InternalGrammarSql.g:1560:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__ColAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__LocalColumnsAssignment_3"
    // InternalGrammarSql.g:1571:1: rule__ForeignKey__LocalColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__LocalColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1575:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1576:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1576:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1577:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0()); 
            // InternalGrammarSql.g:1578:3: ( RULE_ID )
            // InternalGrammarSql.g:1579:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__LocalColumnsAssignment_3"


    // $ANTLR start "rule__ForeignKey__LocalColumnsAssignment_4_1"
    // InternalGrammarSql.g:1590:1: rule__ForeignKey__LocalColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__LocalColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1594:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1595:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1595:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1596:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0()); 
            // InternalGrammarSql.g:1597:3: ( RULE_ID )
            // InternalGrammarSql.g:1598:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__LocalColumnsAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__RefAssignment_6"
    // InternalGrammarSql.g:1609:1: rule__ForeignKey__RefAssignment_6 : ( ruleReference ) ;
    public final void rule__ForeignKey__RefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1613:1: ( ( ruleReference ) )
            // InternalGrammarSql.g:1614:2: ( ruleReference )
            {
            // InternalGrammarSql.g:1614:2: ( ruleReference )
            // InternalGrammarSql.g:1615:3: ruleReference
            {
             before(grammarAccess.getForeignKeyAccess().getRefReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getForeignKeyAccess().getRefReferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__RefAssignment_6"


    // $ANTLR start "rule__Reference__FromTAssignment_1"
    // InternalGrammarSql.g:1624:1: rule__Reference__FromTAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__FromTAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1628:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1629:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1629:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1630:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getFromTTableCrossReference_1_0()); 
            // InternalGrammarSql.g:1631:3: ( RULE_ID )
            // InternalGrammarSql.g:1632:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getFromTTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getFromTTableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getFromTTableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__FromTAssignment_1"


    // $ANTLR start "rule__Reference__FromCAssignment_3"
    // InternalGrammarSql.g:1643:1: rule__Reference__FromCAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__FromCAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1647:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1648:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1648:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1649:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getFromCColumnCrossReference_3_0()); 
            // InternalGrammarSql.g:1650:3: ( RULE_ID )
            // InternalGrammarSql.g:1651:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getFromCColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getFromCColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getFromCColumnCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__FromCAssignment_3"


    // $ANTLR start "rule__Reference__FromCAssignment_4_1"
    // InternalGrammarSql.g:1662:1: rule__Reference__FromCAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__FromCAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrammarSql.g:1666:1: ( ( ( RULE_ID ) ) )
            // InternalGrammarSql.g:1667:2: ( ( RULE_ID ) )
            {
            // InternalGrammarSql.g:1667:2: ( ( RULE_ID ) )
            // InternalGrammarSql.g:1668:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getFromCColumnCrossReference_4_1_0()); 
            // InternalGrammarSql.g:1669:3: ( RULE_ID )
            // InternalGrammarSql.g:1670:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getFromCColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getFromCColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getFromCColumnCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__FromCAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});

}