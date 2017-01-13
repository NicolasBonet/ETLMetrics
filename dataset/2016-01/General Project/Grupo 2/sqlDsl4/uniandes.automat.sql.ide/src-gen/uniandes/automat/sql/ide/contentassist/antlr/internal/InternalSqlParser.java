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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar(255)'", "'int'", "'CREATE'", "'TABLE'", "'('", "')'", "','", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'NOT NULL'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSql.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalSql.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSql.g:54:1: ( ruleModel EOF )
            // InternalSql.g:55:1: ruleModel EOF
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
    // InternalSql.g:62:1: ruleModel : ( ( rule__Model__DatabaseAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:66:2: ( ( ( rule__Model__DatabaseAssignment ) ) )
            // InternalSql.g:67:2: ( ( rule__Model__DatabaseAssignment ) )
            {
            // InternalSql.g:67:2: ( ( rule__Model__DatabaseAssignment ) )
            // InternalSql.g:68:3: ( rule__Model__DatabaseAssignment )
            {
             before(grammarAccess.getModelAccess().getDatabaseAssignment()); 
            // InternalSql.g:69:3: ( rule__Model__DatabaseAssignment )
            // InternalSql.g:69:4: rule__Model__DatabaseAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__DatabaseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDatabaseAssignment()); 

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


    // $ANTLR start "entryRuleDatabase"
    // InternalSql.g:78:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSql.g:79:1: ( ruleDatabase EOF )
            // InternalSql.g:80:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalSql.g:87:1: ruleDatabase : ( ( rule__Database__TablesAssignment )* ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:91:2: ( ( ( rule__Database__TablesAssignment )* ) )
            // InternalSql.g:92:2: ( ( rule__Database__TablesAssignment )* )
            {
            // InternalSql.g:92:2: ( ( rule__Database__TablesAssignment )* )
            // InternalSql.g:93:3: ( rule__Database__TablesAssignment )*
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment()); 
            // InternalSql.g:94:3: ( rule__Database__TablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql.g:94:4: rule__Database__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Database__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTablesAssignment()); 

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // InternalSql.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSql.g:104:1: ( ruleTable EOF )
            // InternalSql.g:105:1: ruleTable EOF
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
    // InternalSql.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSql.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSql.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalSql.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSql.g:119:3: ( rule__Table__Group__0 )
            // InternalSql.g:119:4: rule__Table__Group__0
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
    // InternalSql.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalSql.g:129:1: ( ruleColumn EOF )
            // InternalSql.g:130:1: ruleColumn EOF
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
    // InternalSql.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalSql.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalSql.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalSql.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalSql.g:144:3: ( rule__Column__Group__0 )
            // InternalSql.g:144:4: rule__Column__Group__0
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
    // InternalSql.g:153:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSql.g:154:1: ( rulePrimaryKey EOF )
            // InternalSql.g:155:1: rulePrimaryKey EOF
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
    // InternalSql.g:162:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:166:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSql.g:167:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSql.g:167:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSql.g:168:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSql.g:169:3: ( rule__PrimaryKey__Group__0 )
            // InternalSql.g:169:4: rule__PrimaryKey__Group__0
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
    // InternalSql.g:178:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSql.g:179:1: ( ruleForeignKey EOF )
            // InternalSql.g:180:1: ruleForeignKey EOF
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
    // InternalSql.g:187:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:191:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSql.g:192:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSql.g:192:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSql.g:193:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSql.g:194:3: ( rule__ForeignKey__Group__0 )
            // InternalSql.g:194:4: rule__ForeignKey__Group__0
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


    // $ANTLR start "ruleDataType"
    // InternalSql.g:203:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:207:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSql.g:208:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSql.g:208:2: ( ( rule__DataType__Alternatives ) )
            // InternalSql.g:209:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSql.g:210:3: ( rule__DataType__Alternatives )
            // InternalSql.g:210:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Table__FactsAlternatives_4_0"
    // InternalSql.g:218:1: rule__Table__FactsAlternatives_4_0 : ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__Table__FactsAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:222:1: ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 20:
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
                    // InternalSql.g:223:2: ( ruleColumn )
                    {
                    // InternalSql.g:223:2: ( ruleColumn )
                    // InternalSql.g:224:3: ruleColumn
                    {
                     before(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:229:2: ( rulePrimaryKey )
                    {
                    // InternalSql.g:229:2: ( rulePrimaryKey )
                    // InternalSql.g:230:3: rulePrimaryKey
                    {
                     before(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:235:2: ( ruleForeignKey )
                    {
                    // InternalSql.g:235:2: ( ruleForeignKey )
                    // InternalSql.g:236:3: ruleForeignKey
                    {
                     before(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_4_0_2()); 

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
    // $ANTLR end "rule__Table__FactsAlternatives_4_0"


    // $ANTLR start "rule__Table__FactsAlternatives_5_1_0"
    // InternalSql.g:245:1: rule__Table__FactsAlternatives_5_1_0 : ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__Table__FactsAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:249:1: ( ( ruleColumn ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // InternalSql.g:250:2: ( ruleColumn )
                    {
                    // InternalSql.g:250:2: ( ruleColumn )
                    // InternalSql.g:251:3: ruleColumn
                    {
                     before(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_5_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_5_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:256:2: ( rulePrimaryKey )
                    {
                    // InternalSql.g:256:2: ( rulePrimaryKey )
                    // InternalSql.g:257:3: rulePrimaryKey
                    {
                     before(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_5_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_5_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:262:2: ( ruleForeignKey )
                    {
                    // InternalSql.g:262:2: ( ruleForeignKey )
                    // InternalSql.g:263:3: ruleForeignKey
                    {
                     before(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_5_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_5_1_0_2()); 

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
    // $ANTLR end "rule__Table__FactsAlternatives_5_1_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSql.g:272:1: rule__DataType__Alternatives : ( ( ( 'varchar(255)' ) ) | ( ( 'int' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:276:1: ( ( ( 'varchar(255)' ) ) | ( ( 'int' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSql.g:277:2: ( ( 'varchar(255)' ) )
                    {
                    // InternalSql.g:277:2: ( ( 'varchar(255)' ) )
                    // InternalSql.g:278:3: ( 'varchar(255)' )
                    {
                     before(grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0()); 
                    // InternalSql.g:279:3: ( 'varchar(255)' )
                    // InternalSql.g:279:4: 'varchar(255)'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:283:2: ( ( 'int' ) )
                    {
                    // InternalSql.g:283:2: ( ( 'int' ) )
                    // InternalSql.g:284:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalSql.g:285:3: ( 'int' )
                    // InternalSql.g:285:4: 'int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSql.g:293:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:297:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSql.g:298:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSql.g:305:1: rule__Table__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:309:1: ( ( 'CREATE' ) )
            // InternalSql.g:310:1: ( 'CREATE' )
            {
            // InternalSql.g:310:1: ( 'CREATE' )
            // InternalSql.g:311:2: 'CREATE'
            {
             before(grammarAccess.getTableAccess().getCREATEKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSql.g:320:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:324:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSql.g:325:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSql.g:332:1: rule__Table__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:336:1: ( ( 'TABLE' ) )
            // InternalSql.g:337:1: ( 'TABLE' )
            {
            // InternalSql.g:337:1: ( 'TABLE' )
            // InternalSql.g:338:2: 'TABLE'
            {
             before(grammarAccess.getTableAccess().getTABLEKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSql.g:347:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:351:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSql.g:352:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSql.g:359:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:363:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalSql.g:364:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalSql.g:364:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalSql.g:365:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalSql.g:366:2: ( rule__Table__NameAssignment_2 )
            // InternalSql.g:366:3: rule__Table__NameAssignment_2
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
    // InternalSql.g:374:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:378:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSql.g:379:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSql.g:386:1: rule__Table__Group__3__Impl : ( '(' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:390:1: ( ( '(' ) )
            // InternalSql.g:391:1: ( '(' )
            {
            // InternalSql.g:391:1: ( '(' )
            // InternalSql.g:392:2: '('
            {
             before(grammarAccess.getTableAccess().getLeftParenthesisKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftParenthesisKeyword_3()); 

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
    // InternalSql.g:401:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:405:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSql.g:406:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSql.g:413:1: rule__Table__Group__4__Impl : ( ( rule__Table__FactsAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:417:1: ( ( ( rule__Table__FactsAssignment_4 ) ) )
            // InternalSql.g:418:1: ( ( rule__Table__FactsAssignment_4 ) )
            {
            // InternalSql.g:418:1: ( ( rule__Table__FactsAssignment_4 ) )
            // InternalSql.g:419:2: ( rule__Table__FactsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getFactsAssignment_4()); 
            // InternalSql.g:420:2: ( rule__Table__FactsAssignment_4 )
            // InternalSql.g:420:3: rule__Table__FactsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Table__FactsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getFactsAssignment_4()); 

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
    // InternalSql.g:428:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:432:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSql.g:433:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalSql.g:440:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:444:1: ( ( ( rule__Table__Group_5__0 )* ) )
            // InternalSql.g:445:1: ( ( rule__Table__Group_5__0 )* )
            {
            // InternalSql.g:445:1: ( ( rule__Table__Group_5__0 )* )
            // InternalSql.g:446:2: ( rule__Table__Group_5__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalSql.g:447:2: ( rule__Table__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSql.g:447:3: rule__Table__Group_5__0
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
    // InternalSql.g:455:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:459:1: ( rule__Table__Group__6__Impl )
            // InternalSql.g:460:2: rule__Table__Group__6__Impl
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
    // InternalSql.g:466:1: rule__Table__Group__6__Impl : ( ')' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:470:1: ( ( ')' ) )
            // InternalSql.g:471:1: ( ')' )
            {
            // InternalSql.g:471:1: ( ')' )
            // InternalSql.g:472:2: ')'
            {
             before(grammarAccess.getTableAccess().getRightParenthesisKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightParenthesisKeyword_6()); 

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
    // InternalSql.g:482:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:486:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalSql.g:487:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
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
    // InternalSql.g:494:1: rule__Table__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:498:1: ( ( ',' ) )
            // InternalSql.g:499:1: ( ',' )
            {
            // InternalSql.g:499:1: ( ',' )
            // InternalSql.g:500:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSql.g:509:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:513:1: ( rule__Table__Group_5__1__Impl )
            // InternalSql.g:514:2: rule__Table__Group_5__1__Impl
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
    // InternalSql.g:520:1: rule__Table__Group_5__1__Impl : ( ( rule__Table__FactsAssignment_5_1 ) ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:524:1: ( ( ( rule__Table__FactsAssignment_5_1 ) ) )
            // InternalSql.g:525:1: ( ( rule__Table__FactsAssignment_5_1 ) )
            {
            // InternalSql.g:525:1: ( ( rule__Table__FactsAssignment_5_1 ) )
            // InternalSql.g:526:2: ( rule__Table__FactsAssignment_5_1 )
            {
             before(grammarAccess.getTableAccess().getFactsAssignment_5_1()); 
            // InternalSql.g:527:2: ( rule__Table__FactsAssignment_5_1 )
            // InternalSql.g:527:3: rule__Table__FactsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__FactsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getFactsAssignment_5_1()); 

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
    // InternalSql.g:536:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:540:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSql.g:541:2: rule__Column__Group__0__Impl rule__Column__Group__1
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
    // InternalSql.g:548:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:552:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalSql.g:553:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalSql.g:553:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalSql.g:554:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalSql.g:555:2: ( rule__Column__NameAssignment_0 )
            // InternalSql.g:555:3: rule__Column__NameAssignment_0
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
    // InternalSql.g:563:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:567:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalSql.g:568:2: rule__Column__Group__1__Impl rule__Column__Group__2
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
    // InternalSql.g:575:1: rule__Column__Group__1__Impl : ( ( rule__Column__TypeAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:579:1: ( ( ( rule__Column__TypeAssignment_1 ) ) )
            // InternalSql.g:580:1: ( ( rule__Column__TypeAssignment_1 ) )
            {
            // InternalSql.g:580:1: ( ( rule__Column__TypeAssignment_1 ) )
            // InternalSql.g:581:2: ( rule__Column__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_1()); 
            // InternalSql.g:582:2: ( rule__Column__TypeAssignment_1 )
            // InternalSql.g:582:3: rule__Column__TypeAssignment_1
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
    // InternalSql.g:590:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:594:1: ( rule__Column__Group__2__Impl )
            // InternalSql.g:595:2: rule__Column__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__2__Impl();

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
    // InternalSql.g:601:1: rule__Column__Group__2__Impl : ( ( rule__Column__IsNotNullAssignment_2 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:605:1: ( ( ( rule__Column__IsNotNullAssignment_2 )? ) )
            // InternalSql.g:606:1: ( ( rule__Column__IsNotNullAssignment_2 )? )
            {
            // InternalSql.g:606:1: ( ( rule__Column__IsNotNullAssignment_2 )? )
            // InternalSql.g:607:2: ( rule__Column__IsNotNullAssignment_2 )?
            {
             before(grammarAccess.getColumnAccess().getIsNotNullAssignment_2()); 
            // InternalSql.g:608:2: ( rule__Column__IsNotNullAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSql.g:608:3: rule__Column__IsNotNullAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__IsNotNullAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getIsNotNullAssignment_2()); 

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


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalSql.g:617:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:621:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSql.g:622:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
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
    // InternalSql.g:629:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:633:1: ( ( 'PRIMARY' ) )
            // InternalSql.g:634:1: ( 'PRIMARY' )
            {
            // InternalSql.g:634:1: ( 'PRIMARY' )
            // InternalSql.g:635:2: 'PRIMARY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSql.g:644:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:648:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSql.g:649:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
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
    // InternalSql.g:656:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:660:1: ( ( 'KEY' ) )
            // InternalSql.g:661:1: ( 'KEY' )
            {
            // InternalSql.g:661:1: ( 'KEY' )
            // InternalSql.g:662:2: 'KEY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSql.g:671:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:675:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSql.g:676:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
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
    // InternalSql.g:683:1: rule__PrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:687:1: ( ( '(' ) )
            // InternalSql.g:688:1: ( '(' )
            {
            // InternalSql.g:688:1: ( '(' )
            // InternalSql.g:689:2: '('
            {
             before(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalSql.g:698:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:702:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSql.g:703:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
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
    // InternalSql.g:710:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:714:1: ( ( ( rule__PrimaryKey__ColAssignment_3 ) ) )
            // InternalSql.g:715:1: ( ( rule__PrimaryKey__ColAssignment_3 ) )
            {
            // InternalSql.g:715:1: ( ( rule__PrimaryKey__ColAssignment_3 ) )
            // InternalSql.g:716:2: ( rule__PrimaryKey__ColAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColAssignment_3()); 
            // InternalSql.g:717:2: ( rule__PrimaryKey__ColAssignment_3 )
            // InternalSql.g:717:3: rule__PrimaryKey__ColAssignment_3
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
    // InternalSql.g:725:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:729:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSql.g:730:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
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
    // InternalSql.g:737:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:741:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSql.g:742:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSql.g:742:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSql.g:743:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSql.g:744:2: ( rule__PrimaryKey__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSql.g:744:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSql.g:752:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:756:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSql.g:757:2: rule__PrimaryKey__Group__5__Impl
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
    // InternalSql.g:763:1: rule__PrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:767:1: ( ( ')' ) )
            // InternalSql.g:768:1: ( ')' )
            {
            // InternalSql.g:768:1: ( ')' )
            // InternalSql.g:769:2: ')'
            {
             before(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 

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
    // InternalSql.g:779:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:783:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSql.g:784:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
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
    // InternalSql.g:791:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:795:1: ( ( ',' ) )
            // InternalSql.g:796:1: ( ',' )
            {
            // InternalSql.g:796:1: ( ',' )
            // InternalSql.g:797:2: ','
            {
             before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSql.g:806:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:810:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSql.g:811:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSql.g:817:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:821:1: ( ( ( rule__PrimaryKey__ColAssignment_4_1 ) ) )
            // InternalSql.g:822:1: ( ( rule__PrimaryKey__ColAssignment_4_1 ) )
            {
            // InternalSql.g:822:1: ( ( rule__PrimaryKey__ColAssignment_4_1 ) )
            // InternalSql.g:823:2: ( rule__PrimaryKey__ColAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColAssignment_4_1()); 
            // InternalSql.g:824:2: ( rule__PrimaryKey__ColAssignment_4_1 )
            // InternalSql.g:824:3: rule__PrimaryKey__ColAssignment_4_1
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
    // InternalSql.g:833:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:837:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSql.g:838:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
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
    // InternalSql.g:845:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:849:1: ( ( 'FOREIGN' ) )
            // InternalSql.g:850:1: ( 'FOREIGN' )
            {
            // InternalSql.g:850:1: ( 'FOREIGN' )
            // InternalSql.g:851:2: 'FOREIGN'
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql.g:860:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:864:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSql.g:865:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
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
    // InternalSql.g:872:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:876:1: ( ( 'KEY' ) )
            // InternalSql.g:877:1: ( 'KEY' )
            {
            // InternalSql.g:877:1: ( 'KEY' )
            // InternalSql.g:878:2: 'KEY'
            {
             before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSql.g:887:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:891:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSql.g:892:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
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
    // InternalSql.g:899:1: rule__ForeignKey__Group__2__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:903:1: ( ( '(' ) )
            // InternalSql.g:904:1: ( '(' )
            {
            // InternalSql.g:904:1: ( '(' )
            // InternalSql.g:905:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalSql.g:914:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:918:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSql.g:919:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
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
    // InternalSql.g:926:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:930:1: ( ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) ) )
            // InternalSql.g:931:1: ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) )
            {
            // InternalSql.g:931:1: ( ( rule__ForeignKey__LocalColumnsAssignment_3 ) )
            // InternalSql.g:932:2: ( rule__ForeignKey__LocalColumnsAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_3()); 
            // InternalSql.g:933:2: ( rule__ForeignKey__LocalColumnsAssignment_3 )
            // InternalSql.g:933:3: rule__ForeignKey__LocalColumnsAssignment_3
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
    // InternalSql.g:941:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:945:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSql.g:946:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
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
    // InternalSql.g:953:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:957:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSql.g:958:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSql.g:958:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSql.g:959:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSql.g:960:2: ( rule__ForeignKey__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql.g:960:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSql.g:968:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:972:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSql.g:973:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
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
    // InternalSql.g:980:1: rule__ForeignKey__Group__5__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:984:1: ( ( ')' ) )
            // InternalSql.g:985:1: ( ')' )
            {
            // InternalSql.g:985:1: ( ')' )
            // InternalSql.g:986:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 

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
    // InternalSql.g:995:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:999:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSql.g:1000:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__ForeignKey__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__7();

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
    // InternalSql.g:1007:1: rule__ForeignKey__Group__6__Impl : ( 'REFERENCES' ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1011:1: ( ( 'REFERENCES' ) )
            // InternalSql.g:1012:1: ( 'REFERENCES' )
            {
            // InternalSql.g:1012:1: ( 'REFERENCES' )
            // InternalSql.g:1013:2: 'REFERENCES'
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 

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


    // $ANTLR start "rule__ForeignKey__Group__7"
    // InternalSql.g:1022:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1026:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSql.g:1027:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ForeignKey__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__8();

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
    // $ANTLR end "rule__ForeignKey__Group__7"


    // $ANTLR start "rule__ForeignKey__Group__7__Impl"
    // InternalSql.g:1034:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1038:1: ( ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) )
            // InternalSql.g:1039:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            {
            // InternalSql.g:1039:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            // InternalSql.g:1040:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
            // InternalSql.g:1041:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            // InternalSql.g:1041:3: rule__ForeignKey__ForeignTableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignTableAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 

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
    // $ANTLR end "rule__ForeignKey__Group__7__Impl"


    // $ANTLR start "rule__ForeignKey__Group__8"
    // InternalSql.g:1049:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1053:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSql.g:1054:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__ForeignKey__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__9();

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
    // $ANTLR end "rule__ForeignKey__Group__8"


    // $ANTLR start "rule__ForeignKey__Group__8__Impl"
    // InternalSql.g:1061:1: rule__ForeignKey__Group__8__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1065:1: ( ( '(' ) )
            // InternalSql.g:1066:1: ( '(' )
            {
            // InternalSql.g:1066:1: ( '(' )
            // InternalSql.g:1067:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__ForeignKey__Group__8__Impl"


    // $ANTLR start "rule__ForeignKey__Group__9"
    // InternalSql.g:1076:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1080:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSql.g:1081:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__ForeignKey__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__10();

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
    // $ANTLR end "rule__ForeignKey__Group__9"


    // $ANTLR start "rule__ForeignKey__Group__9__Impl"
    // InternalSql.g:1088:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1092:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) )
            // InternalSql.g:1093:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            {
            // InternalSql.g:1093:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            // InternalSql.g:1094:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
            // InternalSql.g:1095:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            // InternalSql.g:1095:3: rule__ForeignKey__ForeignColumnsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 

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
    // $ANTLR end "rule__ForeignKey__Group__9__Impl"


    // $ANTLR start "rule__ForeignKey__Group__10"
    // InternalSql.g:1103:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1107:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSql.g:1108:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__ForeignKey__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__11();

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
    // $ANTLR end "rule__ForeignKey__Group__10"


    // $ANTLR start "rule__ForeignKey__Group__10__Impl"
    // InternalSql.g:1115:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1119:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSql.g:1120:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSql.g:1120:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSql.g:1121:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSql.g:1122:2: ( rule__ForeignKey__Group_10__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql.g:1122:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getForeignKeyAccess().getGroup_10()); 

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
    // $ANTLR end "rule__ForeignKey__Group__10__Impl"


    // $ANTLR start "rule__ForeignKey__Group__11"
    // InternalSql.g:1130:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1134:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalSql.g:1135:2: rule__ForeignKey__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__11__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group__11"


    // $ANTLR start "rule__ForeignKey__Group__11__Impl"
    // InternalSql.g:1141:1: rule__ForeignKey__Group__11__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1145:1: ( ( ')' ) )
            // InternalSql.g:1146:1: ( ')' )
            {
            // InternalSql.g:1146:1: ( ')' )
            // InternalSql.g:1147:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__ForeignKey__Group__11__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__0"
    // InternalSql.g:1157:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1161:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSql.g:1162:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
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
    // InternalSql.g:1169:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1173:1: ( ( ',' ) )
            // InternalSql.g:1174:1: ( ',' )
            {
            // InternalSql.g:1174:1: ( ',' )
            // InternalSql.g:1175:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSql.g:1184:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1188:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSql.g:1189:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalSql.g:1195:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1199:1: ( ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) ) )
            // InternalSql.g:1200:1: ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) )
            {
            // InternalSql.g:1200:1: ( ( rule__ForeignKey__LocalColumnsAssignment_4_1 ) )
            // InternalSql.g:1201:2: ( rule__ForeignKey__LocalColumnsAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsAssignment_4_1()); 
            // InternalSql.g:1202:2: ( rule__ForeignKey__LocalColumnsAssignment_4_1 )
            // InternalSql.g:1202:3: rule__ForeignKey__LocalColumnsAssignment_4_1
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


    // $ANTLR start "rule__ForeignKey__Group_10__0"
    // InternalSql.g:1211:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1215:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSql.g:1216:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__ForeignKey__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_10__1();

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
    // $ANTLR end "rule__ForeignKey__Group_10__0"


    // $ANTLR start "rule__ForeignKey__Group_10__0__Impl"
    // InternalSql.g:1223:1: rule__ForeignKey__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1227:1: ( ( ',' ) )
            // InternalSql.g:1228:1: ( ',' )
            {
            // InternalSql.g:1228:1: ( ',' )
            // InternalSql.g:1229:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__ForeignKey__Group_10__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_10__1"
    // InternalSql.g:1238:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1242:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSql.g:1243:2: rule__ForeignKey__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_10__1__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group_10__1"


    // $ANTLR start "rule__ForeignKey__Group_10__1__Impl"
    // InternalSql.g:1249:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1253:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) )
            // InternalSql.g:1254:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            {
            // InternalSql.g:1254:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            // InternalSql.g:1255:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
            // InternalSql.g:1256:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            // InternalSql.g:1256:3: rule__ForeignKey__ForeignColumnsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignColumnsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 

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
    // $ANTLR end "rule__ForeignKey__Group_10__1__Impl"


    // $ANTLR start "rule__Model__DatabaseAssignment"
    // InternalSql.g:1265:1: rule__Model__DatabaseAssignment : ( ruleDatabase ) ;
    public final void rule__Model__DatabaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1269:1: ( ( ruleDatabase ) )
            // InternalSql.g:1270:2: ( ruleDatabase )
            {
            // InternalSql.g:1270:2: ( ruleDatabase )
            // InternalSql.g:1271:3: ruleDatabase
            {
             before(grammarAccess.getModelAccess().getDatabaseDatabaseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDatabaseDatabaseParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DatabaseAssignment"


    // $ANTLR start "rule__Database__TablesAssignment"
    // InternalSql.g:1280:1: rule__Database__TablesAssignment : ( ruleTable ) ;
    public final void rule__Database__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1284:1: ( ( ruleTable ) )
            // InternalSql.g:1285:2: ( ruleTable )
            {
            // InternalSql.g:1285:2: ( ruleTable )
            // InternalSql.g:1286:3: ruleTable
            {
             before(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_0()); 

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
    // $ANTLR end "rule__Database__TablesAssignment"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalSql.g:1295:1: rule__Table__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1299:1: ( ( RULE_ID ) )
            // InternalSql.g:1300:2: ( RULE_ID )
            {
            // InternalSql.g:1300:2: ( RULE_ID )
            // InternalSql.g:1301:3: RULE_ID
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


    // $ANTLR start "rule__Table__FactsAssignment_4"
    // InternalSql.g:1310:1: rule__Table__FactsAssignment_4 : ( ( rule__Table__FactsAlternatives_4_0 ) ) ;
    public final void rule__Table__FactsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1314:1: ( ( ( rule__Table__FactsAlternatives_4_0 ) ) )
            // InternalSql.g:1315:2: ( ( rule__Table__FactsAlternatives_4_0 ) )
            {
            // InternalSql.g:1315:2: ( ( rule__Table__FactsAlternatives_4_0 ) )
            // InternalSql.g:1316:3: ( rule__Table__FactsAlternatives_4_0 )
            {
             before(grammarAccess.getTableAccess().getFactsAlternatives_4_0()); 
            // InternalSql.g:1317:3: ( rule__Table__FactsAlternatives_4_0 )
            // InternalSql.g:1317:4: rule__Table__FactsAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__FactsAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getFactsAlternatives_4_0()); 

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
    // $ANTLR end "rule__Table__FactsAssignment_4"


    // $ANTLR start "rule__Table__FactsAssignment_5_1"
    // InternalSql.g:1325:1: rule__Table__FactsAssignment_5_1 : ( ( rule__Table__FactsAlternatives_5_1_0 ) ) ;
    public final void rule__Table__FactsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1329:1: ( ( ( rule__Table__FactsAlternatives_5_1_0 ) ) )
            // InternalSql.g:1330:2: ( ( rule__Table__FactsAlternatives_5_1_0 ) )
            {
            // InternalSql.g:1330:2: ( ( rule__Table__FactsAlternatives_5_1_0 ) )
            // InternalSql.g:1331:3: ( rule__Table__FactsAlternatives_5_1_0 )
            {
             before(grammarAccess.getTableAccess().getFactsAlternatives_5_1_0()); 
            // InternalSql.g:1332:3: ( rule__Table__FactsAlternatives_5_1_0 )
            // InternalSql.g:1332:4: rule__Table__FactsAlternatives_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__FactsAlternatives_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getFactsAlternatives_5_1_0()); 

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
    // $ANTLR end "rule__Table__FactsAssignment_5_1"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalSql.g:1340:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1344:1: ( ( RULE_ID ) )
            // InternalSql.g:1345:2: ( RULE_ID )
            {
            // InternalSql.g:1345:2: ( RULE_ID )
            // InternalSql.g:1346:3: RULE_ID
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
    // InternalSql.g:1355:1: rule__Column__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Column__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1359:1: ( ( ruleDataType ) )
            // InternalSql.g:1360:2: ( ruleDataType )
            {
            // InternalSql.g:1360:2: ( ruleDataType )
            // InternalSql.g:1361:3: ruleDataType
            {
             before(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0()); 

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


    // $ANTLR start "rule__Column__IsNotNullAssignment_2"
    // InternalSql.g:1370:1: rule__Column__IsNotNullAssignment_2 : ( ( 'NOT NULL' ) ) ;
    public final void rule__Column__IsNotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1374:1: ( ( ( 'NOT NULL' ) ) )
            // InternalSql.g:1375:2: ( ( 'NOT NULL' ) )
            {
            // InternalSql.g:1375:2: ( ( 'NOT NULL' ) )
            // InternalSql.g:1376:3: ( 'NOT NULL' )
            {
             before(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); 
            // InternalSql.g:1377:3: ( 'NOT NULL' )
            // InternalSql.g:1378:4: 'NOT NULL'
            {
             before(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); 

            }

             after(grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0()); 

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
    // $ANTLR end "rule__Column__IsNotNullAssignment_2"


    // $ANTLR start "rule__PrimaryKey__ColAssignment_3"
    // InternalSql.g:1389:1: rule__PrimaryKey__ColAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1393:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1394:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1394:2: ( ( RULE_ID ) )
            // InternalSql.g:1395:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0()); 
            // InternalSql.g:1396:3: ( RULE_ID )
            // InternalSql.g:1397:4: RULE_ID
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
    // InternalSql.g:1408:1: rule__PrimaryKey__ColAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1412:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1413:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1413:2: ( ( RULE_ID ) )
            // InternalSql.g:1414:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0()); 
            // InternalSql.g:1415:3: ( RULE_ID )
            // InternalSql.g:1416:4: RULE_ID
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
    // InternalSql.g:1427:1: rule__ForeignKey__LocalColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__LocalColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1431:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1432:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1432:2: ( ( RULE_ID ) )
            // InternalSql.g:1433:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0()); 
            // InternalSql.g:1434:3: ( RULE_ID )
            // InternalSql.g:1435:4: RULE_ID
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
    // InternalSql.g:1446:1: rule__ForeignKey__LocalColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__LocalColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1450:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1451:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1451:2: ( ( RULE_ID ) )
            // InternalSql.g:1452:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0()); 
            // InternalSql.g:1453:3: ( RULE_ID )
            // InternalSql.g:1454:4: RULE_ID
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


    // $ANTLR start "rule__ForeignKey__ForeignTableAssignment_7"
    // InternalSql.g:1465:1: rule__ForeignKey__ForeignTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1469:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1470:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1470:2: ( ( RULE_ID ) )
            // InternalSql.g:1471:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableCrossReference_7_0()); 
            // InternalSql.g:1472:3: ( RULE_ID )
            // InternalSql.g:1473:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignTableTableIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignTableTableCrossReference_7_0()); 

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
    // $ANTLR end "rule__ForeignKey__ForeignTableAssignment_7"


    // $ANTLR start "rule__ForeignKey__ForeignColumnsAssignment_9"
    // InternalSql.g:1484:1: rule__ForeignKey__ForeignColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1488:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1489:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1489:2: ( ( RULE_ID ) )
            // InternalSql.g:1490:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_9_0()); 
            // InternalSql.g:1491:3: ( RULE_ID )
            // InternalSql.g:1492:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_9_0()); 

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
    // $ANTLR end "rule__ForeignKey__ForeignColumnsAssignment_9"


    // $ANTLR start "rule__ForeignKey__ForeignColumnsAssignment_10_1"
    // InternalSql.g:1503:1: rule__ForeignKey__ForeignColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1507:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1508:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1508:2: ( ( RULE_ID ) )
            // InternalSql.g:1509:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_10_1_0()); 
            // InternalSql.g:1510:3: ( RULE_ID )
            // InternalSql.g:1511:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__ForeignKey__ForeignColumnsAssignment_10_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}