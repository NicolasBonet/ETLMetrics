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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenSqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_FIN", "RULE_CREATE", "RULE_CTABLE", "RULE_LPARENT", "RULE_RPARENT", "RULE_COMMA", "RULE_NOT", "RULE_NULL", "RULE_PRIMARY", "RULE_KEY", "RULE_FOREIGN", "RULE_REFERENCES", "RULE_ID", "RULE_TIPO", "RULE_LONGITUD", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_CTABLE=7;
    public static final int RULE_KEY=14;
    public static final int RULE_STRING=22;
    public static final int RULE_NOT=11;
    public static final int RULE_NULL=12;
    public static final int RULE_LONGITUD=19;
    public static final int RULE_LPARENT=8;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_CREATE=6;
    public static final int RULE_FIN=5;
    public static final int RULE_RPARENT=9;
    public static final int EOF=-1;
    public static final int RULE_REFERENCES=16;
    public static final int RULE_ID=17;
    public static final int RULE_COMMA=10;
    public static final int RULE_WS=25;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_NUMBER=20;
    public static final int RULE_PRIMARY=13;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SEMICOLON=4;
    public static final int RULE_FOREIGN=15;
    public static final int RULE_TIPO=18;

    // delegates
    // delegators


        public InternalGenSqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenSqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenSqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenSql.g"; }


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



    // $ANTLR start "entryRuleDataBase"
    // InternalGenSql.g:53:1: entryRuleDataBase : ruleDataBase EOF ;
    public final void entryRuleDataBase() throws RecognitionException {
        try {
            // InternalGenSql.g:54:1: ( ruleDataBase EOF )
            // InternalGenSql.g:55:1: ruleDataBase EOF
            {
             before(grammarAccess.getDataBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDataBase();

            state._fsp--;

             after(grammarAccess.getDataBaseRule()); 
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
    // $ANTLR end "entryRuleDataBase"


    // $ANTLR start "ruleDataBase"
    // InternalGenSql.g:62:1: ruleDataBase : ( ( rule__DataBase__Group__0 ) ) ;
    public final void ruleDataBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:66:2: ( ( ( rule__DataBase__Group__0 ) ) )
            // InternalGenSql.g:67:2: ( ( rule__DataBase__Group__0 ) )
            {
            // InternalGenSql.g:67:2: ( ( rule__DataBase__Group__0 ) )
            // InternalGenSql.g:68:3: ( rule__DataBase__Group__0 )
            {
             before(grammarAccess.getDataBaseAccess().getGroup()); 
            // InternalGenSql.g:69:3: ( rule__DataBase__Group__0 )
            // InternalGenSql.g:69:4: rule__DataBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataBaseAccess().getGroup()); 

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
    // $ANTLR end "ruleDataBase"


    // $ANTLR start "entryRuleTable"
    // InternalGenSql.g:78:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalGenSql.g:79:1: ( ruleTable EOF )
            // InternalGenSql.g:80:1: ruleTable EOF
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
    // InternalGenSql.g:87:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:91:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalGenSql.g:92:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalGenSql.g:92:2: ( ( rule__Table__Group__0 ) )
            // InternalGenSql.g:93:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalGenSql.g:94:3: ( rule__Table__Group__0 )
            // InternalGenSql.g:94:4: rule__Table__Group__0
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
    // InternalGenSql.g:103:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalGenSql.g:104:1: ( ruleColumn EOF )
            // InternalGenSql.g:105:1: ruleColumn EOF
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
    // InternalGenSql.g:112:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:116:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalGenSql.g:117:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalGenSql.g:117:2: ( ( rule__Column__Group__0 ) )
            // InternalGenSql.g:118:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalGenSql.g:119:3: ( rule__Column__Group__0 )
            // InternalGenSql.g:119:4: rule__Column__Group__0
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
    // InternalGenSql.g:128:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalGenSql.g:129:1: ( rulePrimaryKey EOF )
            // InternalGenSql.g:130:1: rulePrimaryKey EOF
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
    // InternalGenSql.g:137:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:141:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalGenSql.g:142:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalGenSql.g:142:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalGenSql.g:143:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalGenSql.g:144:3: ( rule__PrimaryKey__Group__0 )
            // InternalGenSql.g:144:4: rule__PrimaryKey__Group__0
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
    // InternalGenSql.g:153:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalGenSql.g:154:1: ( ruleForeignKey EOF )
            // InternalGenSql.g:155:1: ruleForeignKey EOF
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
    // InternalGenSql.g:162:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:166:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalGenSql.g:167:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalGenSql.g:167:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalGenSql.g:168:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalGenSql.g:169:3: ( rule__ForeignKey__Group__0 )
            // InternalGenSql.g:169:4: rule__ForeignKey__Group__0
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


    // $ANTLR start "rule__Table__Alternatives_8"
    // InternalGenSql.g:177:1: rule__Table__Alternatives_8 : ( ( RULE_SEMICOLON ) | ( RULE_FIN ) );
    public final void rule__Table__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:181:1: ( ( RULE_SEMICOLON ) | ( RULE_FIN ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SEMICOLON) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_FIN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGenSql.g:182:2: ( RULE_SEMICOLON )
                    {
                    // InternalGenSql.g:182:2: ( RULE_SEMICOLON )
                    // InternalGenSql.g:183:3: RULE_SEMICOLON
                    {
                     before(grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_0()); 
                    match(input,RULE_SEMICOLON,FOLLOW_2); 
                     after(grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenSql.g:188:2: ( RULE_FIN )
                    {
                    // InternalGenSql.g:188:2: ( RULE_FIN )
                    // InternalGenSql.g:189:3: RULE_FIN
                    {
                     before(grammarAccess.getTableAccess().getFINTerminalRuleCall_8_1()); 
                    match(input,RULE_FIN,FOLLOW_2); 
                     after(grammarAccess.getTableAccess().getFINTerminalRuleCall_8_1()); 

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
    // $ANTLR end "rule__Table__Alternatives_8"


    // $ANTLR start "rule__DataBase__Group__0"
    // InternalGenSql.g:198:1: rule__DataBase__Group__0 : rule__DataBase__Group__0__Impl rule__DataBase__Group__1 ;
    public final void rule__DataBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:202:1: ( rule__DataBase__Group__0__Impl rule__DataBase__Group__1 )
            // InternalGenSql.g:203:2: rule__DataBase__Group__0__Impl rule__DataBase__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataBase__Group__1();

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
    // $ANTLR end "rule__DataBase__Group__0"


    // $ANTLR start "rule__DataBase__Group__0__Impl"
    // InternalGenSql.g:210:1: rule__DataBase__Group__0__Impl : ( () ) ;
    public final void rule__DataBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:214:1: ( ( () ) )
            // InternalGenSql.g:215:1: ( () )
            {
            // InternalGenSql.g:215:1: ( () )
            // InternalGenSql.g:216:2: ()
            {
             before(grammarAccess.getDataBaseAccess().getDataBaseAction_0()); 
            // InternalGenSql.g:217:2: ()
            // InternalGenSql.g:217:3: 
            {
            }

             after(grammarAccess.getDataBaseAccess().getDataBaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBase__Group__0__Impl"


    // $ANTLR start "rule__DataBase__Group__1"
    // InternalGenSql.g:225:1: rule__DataBase__Group__1 : rule__DataBase__Group__1__Impl ;
    public final void rule__DataBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:229:1: ( rule__DataBase__Group__1__Impl )
            // InternalGenSql.g:230:2: rule__DataBase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataBase__Group__1__Impl();

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
    // $ANTLR end "rule__DataBase__Group__1"


    // $ANTLR start "rule__DataBase__Group__1__Impl"
    // InternalGenSql.g:236:1: rule__DataBase__Group__1__Impl : ( ( ( rule__DataBase__TablesAssignment_1 ) ) ( ( rule__DataBase__TablesAssignment_1 )* ) ) ;
    public final void rule__DataBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:240:1: ( ( ( ( rule__DataBase__TablesAssignment_1 ) ) ( ( rule__DataBase__TablesAssignment_1 )* ) ) )
            // InternalGenSql.g:241:1: ( ( ( rule__DataBase__TablesAssignment_1 ) ) ( ( rule__DataBase__TablesAssignment_1 )* ) )
            {
            // InternalGenSql.g:241:1: ( ( ( rule__DataBase__TablesAssignment_1 ) ) ( ( rule__DataBase__TablesAssignment_1 )* ) )
            // InternalGenSql.g:242:2: ( ( rule__DataBase__TablesAssignment_1 ) ) ( ( rule__DataBase__TablesAssignment_1 )* )
            {
            // InternalGenSql.g:242:2: ( ( rule__DataBase__TablesAssignment_1 ) )
            // InternalGenSql.g:243:3: ( rule__DataBase__TablesAssignment_1 )
            {
             before(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); 
            // InternalGenSql.g:244:3: ( rule__DataBase__TablesAssignment_1 )
            // InternalGenSql.g:244:4: rule__DataBase__TablesAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__DataBase__TablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); 

            }

            // InternalGenSql.g:247:2: ( ( rule__DataBase__TablesAssignment_1 )* )
            // InternalGenSql.g:248:3: ( rule__DataBase__TablesAssignment_1 )*
            {
             before(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); 
            // InternalGenSql.g:249:3: ( rule__DataBase__TablesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_CREATE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGenSql.g:249:4: rule__DataBase__TablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataBase__TablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDataBaseAccess().getTablesAssignment_1()); 

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
    // $ANTLR end "rule__DataBase__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalGenSql.g:259:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:263:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalGenSql.g:264:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGenSql.g:271:1: rule__Table__Group__0__Impl : ( RULE_CREATE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:275:1: ( ( RULE_CREATE ) )
            // InternalGenSql.g:276:1: ( RULE_CREATE )
            {
            // InternalGenSql.g:276:1: ( RULE_CREATE )
            // InternalGenSql.g:277:2: RULE_CREATE
            {
             before(grammarAccess.getTableAccess().getCREATETerminalRuleCall_0()); 
            match(input,RULE_CREATE,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCREATETerminalRuleCall_0()); 

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
    // InternalGenSql.g:286:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:290:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalGenSql.g:291:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:298:1: rule__Table__Group__1__Impl : ( RULE_CTABLE ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:302:1: ( ( RULE_CTABLE ) )
            // InternalGenSql.g:303:1: ( RULE_CTABLE )
            {
            // InternalGenSql.g:303:1: ( RULE_CTABLE )
            // InternalGenSql.g:304:2: RULE_CTABLE
            {
             before(grammarAccess.getTableAccess().getCTABLETerminalRuleCall_1()); 
            match(input,RULE_CTABLE,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCTABLETerminalRuleCall_1()); 

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
    // InternalGenSql.g:313:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:317:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalGenSql.g:318:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalGenSql.g:325:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:329:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalGenSql.g:330:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalGenSql.g:330:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalGenSql.g:331:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalGenSql.g:332:2: ( rule__Table__NameAssignment_2 )
            // InternalGenSql.g:332:3: rule__Table__NameAssignment_2
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
    // InternalGenSql.g:340:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:344:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalGenSql.g:345:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:352:1: rule__Table__Group__3__Impl : ( RULE_LPARENT ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:356:1: ( ( RULE_LPARENT ) )
            // InternalGenSql.g:357:1: ( RULE_LPARENT )
            {
            // InternalGenSql.g:357:1: ( RULE_LPARENT )
            // InternalGenSql.g:358:2: RULE_LPARENT
            {
             before(grammarAccess.getTableAccess().getLPARENTTerminalRuleCall_3()); 
            match(input,RULE_LPARENT,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLPARENTTerminalRuleCall_3()); 

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
    // InternalGenSql.g:367:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:371:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalGenSql.g:372:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalGenSql.g:379:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:383:1: ( ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) ) )
            // InternalGenSql.g:384:1: ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) )
            {
            // InternalGenSql.g:384:1: ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) )
            // InternalGenSql.g:385:2: ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* )
            {
            // InternalGenSql.g:385:2: ( ( rule__Table__ColumnsAssignment_4 ) )
            // InternalGenSql.g:386:3: ( rule__Table__ColumnsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4()); 
            // InternalGenSql.g:387:3: ( rule__Table__ColumnsAssignment_4 )
            // InternalGenSql.g:387:4: rule__Table__ColumnsAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Table__ColumnsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4()); 

            }

            // InternalGenSql.g:390:2: ( ( rule__Table__ColumnsAssignment_4 )* )
            // InternalGenSql.g:391:3: ( rule__Table__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4()); 
            // InternalGenSql.g:392:3: ( rule__Table__ColumnsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGenSql.g:392:4: rule__Table__ColumnsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__ColumnsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getColumnsAssignment_4()); 

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
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalGenSql.g:401:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:405:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalGenSql.g:406:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalGenSql.g:413:1: rule__Table__Group__5__Impl : ( ( rule__Table__PrimarykeyAssignment_5 ) ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:417:1: ( ( ( rule__Table__PrimarykeyAssignment_5 ) ) )
            // InternalGenSql.g:418:1: ( ( rule__Table__PrimarykeyAssignment_5 ) )
            {
            // InternalGenSql.g:418:1: ( ( rule__Table__PrimarykeyAssignment_5 ) )
            // InternalGenSql.g:419:2: ( rule__Table__PrimarykeyAssignment_5 )
            {
             before(grammarAccess.getTableAccess().getPrimarykeyAssignment_5()); 
            // InternalGenSql.g:420:2: ( rule__Table__PrimarykeyAssignment_5 )
            // InternalGenSql.g:420:3: rule__Table__PrimarykeyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Table__PrimarykeyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getPrimarykeyAssignment_5()); 

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
    // InternalGenSql.g:428:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:432:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalGenSql.g:433:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__7();

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
    // InternalGenSql.g:440:1: rule__Table__Group__6__Impl : ( ( rule__Table__ForeignkeysAssignment_6 )* ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:444:1: ( ( ( rule__Table__ForeignkeysAssignment_6 )* ) )
            // InternalGenSql.g:445:1: ( ( rule__Table__ForeignkeysAssignment_6 )* )
            {
            // InternalGenSql.g:445:1: ( ( rule__Table__ForeignkeysAssignment_6 )* )
            // InternalGenSql.g:446:2: ( rule__Table__ForeignkeysAssignment_6 )*
            {
             before(grammarAccess.getTableAccess().getForeignkeysAssignment_6()); 
            // InternalGenSql.g:447:2: ( rule__Table__ForeignkeysAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_FOREIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGenSql.g:447:3: rule__Table__ForeignkeysAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Table__ForeignkeysAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getForeignkeysAssignment_6()); 

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


    // $ANTLR start "rule__Table__Group__7"
    // InternalGenSql.g:455:1: rule__Table__Group__7 : rule__Table__Group__7__Impl rule__Table__Group__8 ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:459:1: ( rule__Table__Group__7__Impl rule__Table__Group__8 )
            // InternalGenSql.g:460:2: rule__Table__Group__7__Impl rule__Table__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Table__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__8();

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
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // InternalGenSql.g:467:1: rule__Table__Group__7__Impl : ( RULE_RPARENT ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:471:1: ( ( RULE_RPARENT ) )
            // InternalGenSql.g:472:1: ( RULE_RPARENT )
            {
            // InternalGenSql.g:472:1: ( RULE_RPARENT )
            // InternalGenSql.g:473:2: RULE_RPARENT
            {
             before(grammarAccess.getTableAccess().getRPARENTTerminalRuleCall_7()); 
            match(input,RULE_RPARENT,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRPARENTTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__8"
    // InternalGenSql.g:482:1: rule__Table__Group__8 : rule__Table__Group__8__Impl ;
    public final void rule__Table__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:486:1: ( rule__Table__Group__8__Impl )
            // InternalGenSql.g:487:2: rule__Table__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__8__Impl();

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
    // $ANTLR end "rule__Table__Group__8"


    // $ANTLR start "rule__Table__Group__8__Impl"
    // InternalGenSql.g:493:1: rule__Table__Group__8__Impl : ( ( rule__Table__Alternatives_8 )? ) ;
    public final void rule__Table__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:497:1: ( ( ( rule__Table__Alternatives_8 )? ) )
            // InternalGenSql.g:498:1: ( ( rule__Table__Alternatives_8 )? )
            {
            // InternalGenSql.g:498:1: ( ( rule__Table__Alternatives_8 )? )
            // InternalGenSql.g:499:2: ( rule__Table__Alternatives_8 )?
            {
             before(grammarAccess.getTableAccess().getAlternatives_8()); 
            // InternalGenSql.g:500:2: ( rule__Table__Alternatives_8 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SEMICOLON && LA5_0<=RULE_FIN)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenSql.g:500:3: rule__Table__Alternatives_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Alternatives_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getAlternatives_8()); 

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
    // $ANTLR end "rule__Table__Group__8__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalGenSql.g:509:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:513:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalGenSql.g:514:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGenSql.g:521:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:525:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalGenSql.g:526:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalGenSql.g:526:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalGenSql.g:527:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalGenSql.g:528:2: ( rule__Column__NameAssignment_0 )
            // InternalGenSql.g:528:3: rule__Column__NameAssignment_0
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
    // InternalGenSql.g:536:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:540:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalGenSql.g:541:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGenSql.g:548:1: rule__Column__Group__1__Impl : ( ( rule__Column__SQLTypeAssignment_1 )? ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:552:1: ( ( ( rule__Column__SQLTypeAssignment_1 )? ) )
            // InternalGenSql.g:553:1: ( ( rule__Column__SQLTypeAssignment_1 )? )
            {
            // InternalGenSql.g:553:1: ( ( rule__Column__SQLTypeAssignment_1 )? )
            // InternalGenSql.g:554:2: ( rule__Column__SQLTypeAssignment_1 )?
            {
             before(grammarAccess.getColumnAccess().getSQLTypeAssignment_1()); 
            // InternalGenSql.g:555:2: ( rule__Column__SQLTypeAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TIPO) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenSql.g:555:3: rule__Column__SQLTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__SQLTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getSQLTypeAssignment_1()); 

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
    // InternalGenSql.g:563:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:567:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalGenSql.g:568:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGenSql.g:575:1: rule__Column__Group__2__Impl : ( ( rule__Column__LongitudAssignment_2 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:579:1: ( ( ( rule__Column__LongitudAssignment_2 )? ) )
            // InternalGenSql.g:580:1: ( ( rule__Column__LongitudAssignment_2 )? )
            {
            // InternalGenSql.g:580:1: ( ( rule__Column__LongitudAssignment_2 )? )
            // InternalGenSql.g:581:2: ( rule__Column__LongitudAssignment_2 )?
            {
             before(grammarAccess.getColumnAccess().getLongitudAssignment_2()); 
            // InternalGenSql.g:582:2: ( rule__Column__LongitudAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LONGITUD) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenSql.g:582:3: rule__Column__LongitudAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__LongitudAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getLongitudAssignment_2()); 

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
    // InternalGenSql.g:590:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:594:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalGenSql.g:595:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

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
    // InternalGenSql.g:602:1: rule__Column__Group__3__Impl : ( ( rule__Column__Group_3__0 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:606:1: ( ( ( rule__Column__Group_3__0 )? ) )
            // InternalGenSql.g:607:1: ( ( rule__Column__Group_3__0 )? )
            {
            // InternalGenSql.g:607:1: ( ( rule__Column__Group_3__0 )? )
            // InternalGenSql.g:608:2: ( rule__Column__Group_3__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_3()); 
            // InternalGenSql.g:609:2: ( rule__Column__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NOT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGenSql.g:609:3: rule__Column__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Column__Group__4"
    // InternalGenSql.g:617:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:621:1: ( rule__Column__Group__4__Impl )
            // InternalGenSql.g:622:2: rule__Column__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__4__Impl();

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
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalGenSql.g:628:1: rule__Column__Group__4__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:632:1: ( ( ( RULE_COMMA )? ) )
            // InternalGenSql.g:633:1: ( ( RULE_COMMA )? )
            {
            // InternalGenSql.g:633:1: ( ( RULE_COMMA )? )
            // InternalGenSql.g:634:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_4()); 
            // InternalGenSql.g:635:2: ( RULE_COMMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGenSql.g:635:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group_3__0"
    // InternalGenSql.g:644:1: rule__Column__Group_3__0 : rule__Column__Group_3__0__Impl rule__Column__Group_3__1 ;
    public final void rule__Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:648:1: ( rule__Column__Group_3__0__Impl rule__Column__Group_3__1 )
            // InternalGenSql.g:649:2: rule__Column__Group_3__0__Impl rule__Column__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Column__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1();

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
    // $ANTLR end "rule__Column__Group_3__0"


    // $ANTLR start "rule__Column__Group_3__0__Impl"
    // InternalGenSql.g:656:1: rule__Column__Group_3__0__Impl : ( RULE_NOT ) ;
    public final void rule__Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:660:1: ( ( RULE_NOT ) )
            // InternalGenSql.g:661:1: ( RULE_NOT )
            {
            // InternalGenSql.g:661:1: ( RULE_NOT )
            // InternalGenSql.g:662:2: RULE_NOT
            {
             before(grammarAccess.getColumnAccess().getNOTTerminalRuleCall_3_0()); 
            match(input,RULE_NOT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNOTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Column__Group_3__0__Impl"


    // $ANTLR start "rule__Column__Group_3__1"
    // InternalGenSql.g:671:1: rule__Column__Group_3__1 : rule__Column__Group_3__1__Impl ;
    public final void rule__Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:675:1: ( rule__Column__Group_3__1__Impl )
            // InternalGenSql.g:676:2: rule__Column__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1__Impl();

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
    // $ANTLR end "rule__Column__Group_3__1"


    // $ANTLR start "rule__Column__Group_3__1__Impl"
    // InternalGenSql.g:682:1: rule__Column__Group_3__1__Impl : ( RULE_NULL ) ;
    public final void rule__Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:686:1: ( ( RULE_NULL ) )
            // InternalGenSql.g:687:1: ( RULE_NULL )
            {
            // InternalGenSql.g:687:1: ( RULE_NULL )
            // InternalGenSql.g:688:2: RULE_NULL
            {
             before(grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3_1()); 
            match(input,RULE_NULL,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__Column__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalGenSql.g:698:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:702:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalGenSql.g:703:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGenSql.g:710:1: rule__PrimaryKey__Group__0__Impl : ( RULE_PRIMARY ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:714:1: ( ( RULE_PRIMARY ) )
            // InternalGenSql.g:715:1: ( RULE_PRIMARY )
            {
            // InternalGenSql.g:715:1: ( RULE_PRIMARY )
            // InternalGenSql.g:716:2: RULE_PRIMARY
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0()); 
            match(input,RULE_PRIMARY,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0()); 

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
    // InternalGenSql.g:725:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:729:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalGenSql.g:730:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGenSql.g:737:1: rule__PrimaryKey__Group__1__Impl : ( RULE_KEY ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:741:1: ( ( RULE_KEY ) )
            // InternalGenSql.g:742:1: ( RULE_KEY )
            {
            // InternalGenSql.g:742:1: ( RULE_KEY )
            // InternalGenSql.g:743:2: RULE_KEY
            {
             before(grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1()); 
            match(input,RULE_KEY,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1()); 

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
    // InternalGenSql.g:752:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:756:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalGenSql.g:757:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:764:1: rule__PrimaryKey__Group__2__Impl : ( RULE_LPARENT ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:768:1: ( ( RULE_LPARENT ) )
            // InternalGenSql.g:769:1: ( RULE_LPARENT )
            {
            // InternalGenSql.g:769:1: ( RULE_LPARENT )
            // InternalGenSql.g:770:2: RULE_LPARENT
            {
             before(grammarAccess.getPrimaryKeyAccess().getLPARENTTerminalRuleCall_2()); 
            match(input,RULE_LPARENT,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getLPARENTTerminalRuleCall_2()); 

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
    // InternalGenSql.g:779:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:783:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalGenSql.g:784:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGenSql.g:791:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnsAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:795:1: ( ( ( rule__PrimaryKey__ColumnsAssignment_3 ) ) )
            // InternalGenSql.g:796:1: ( ( rule__PrimaryKey__ColumnsAssignment_3 ) )
            {
            // InternalGenSql.g:796:1: ( ( rule__PrimaryKey__ColumnsAssignment_3 ) )
            // InternalGenSql.g:797:2: ( rule__PrimaryKey__ColumnsAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_3()); 
            // InternalGenSql.g:798:2: ( rule__PrimaryKey__ColumnsAssignment_3 )
            // InternalGenSql.g:798:3: rule__PrimaryKey__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_3()); 

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
    // InternalGenSql.g:806:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:810:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalGenSql.g:811:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGenSql.g:818:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:822:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalGenSql.g:823:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalGenSql.g:823:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalGenSql.g:824:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalGenSql.g:825:2: ( rule__PrimaryKey__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGenSql.g:825:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGenSql.g:833:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6 ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:837:1: ( rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6 )
            // InternalGenSql.g:838:2: rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__PrimaryKey__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__6();

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
    // InternalGenSql.g:845:1: rule__PrimaryKey__Group__5__Impl : ( RULE_RPARENT ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:849:1: ( ( RULE_RPARENT ) )
            // InternalGenSql.g:850:1: ( RULE_RPARENT )
            {
            // InternalGenSql.g:850:1: ( RULE_RPARENT )
            // InternalGenSql.g:851:2: RULE_RPARENT
            {
             before(grammarAccess.getPrimaryKeyAccess().getRPARENTTerminalRuleCall_5()); 
            match(input,RULE_RPARENT,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getRPARENTTerminalRuleCall_5()); 

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


    // $ANTLR start "rule__PrimaryKey__Group__6"
    // InternalGenSql.g:860:1: rule__PrimaryKey__Group__6 : rule__PrimaryKey__Group__6__Impl ;
    public final void rule__PrimaryKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:864:1: ( rule__PrimaryKey__Group__6__Impl )
            // InternalGenSql.g:865:2: rule__PrimaryKey__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__6__Impl();

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
    // $ANTLR end "rule__PrimaryKey__Group__6"


    // $ANTLR start "rule__PrimaryKey__Group__6__Impl"
    // InternalGenSql.g:871:1: rule__PrimaryKey__Group__6__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__PrimaryKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:875:1: ( ( ( RULE_COMMA )? ) )
            // InternalGenSql.g:876:1: ( ( RULE_COMMA )? )
            {
            // InternalGenSql.g:876:1: ( ( RULE_COMMA )? )
            // InternalGenSql.g:877:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6()); 
            // InternalGenSql.g:878:2: ( RULE_COMMA )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMA) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGenSql.g:878:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6()); 

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
    // $ANTLR end "rule__PrimaryKey__Group__6__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__0"
    // InternalGenSql.g:887:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:891:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalGenSql.g:892:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:899:1: rule__PrimaryKey__Group_4__0__Impl : ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:903:1: ( ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) )
            // InternalGenSql.g:904:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            {
            // InternalGenSql.g:904:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            // InternalGenSql.g:905:2: ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* )
            {
            // InternalGenSql.g:905:2: ( ( RULE_COMMA ) )
            // InternalGenSql.g:906:3: ( RULE_COMMA )
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalGenSql.g:907:3: ( RULE_COMMA )
            // InternalGenSql.g:907:4: RULE_COMMA
            {
            match(input,RULE_COMMA,FOLLOW_17); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 

            }

            // InternalGenSql.g:910:2: ( ( RULE_COMMA )* )
            // InternalGenSql.g:911:3: ( RULE_COMMA )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalGenSql.g:912:3: ( RULE_COMMA )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGenSql.g:912:4: RULE_COMMA
            	    {
            	    match(input,RULE_COMMA,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__PrimaryKey__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__1"
    // InternalGenSql.g:921:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:925:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalGenSql.g:926:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalGenSql.g:932:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:936:1: ( ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) ) )
            // InternalGenSql.g:937:1: ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) )
            {
            // InternalGenSql.g:937:1: ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) )
            // InternalGenSql.g:938:2: ( rule__PrimaryKey__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_4_1()); 
            // InternalGenSql.g:939:2: ( rule__PrimaryKey__ColumnsAssignment_4_1 )
            // InternalGenSql.g:939:3: rule__PrimaryKey__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_4_1()); 

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
    // InternalGenSql.g:948:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:952:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalGenSql.g:953:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGenSql.g:960:1: rule__ForeignKey__Group__0__Impl : ( RULE_FOREIGN ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:964:1: ( ( RULE_FOREIGN ) )
            // InternalGenSql.g:965:1: ( RULE_FOREIGN )
            {
            // InternalGenSql.g:965:1: ( RULE_FOREIGN )
            // InternalGenSql.g:966:2: RULE_FOREIGN
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0()); 
            match(input,RULE_FOREIGN,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0()); 

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
    // InternalGenSql.g:975:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:979:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalGenSql.g:980:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGenSql.g:987:1: rule__ForeignKey__Group__1__Impl : ( RULE_KEY ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:991:1: ( ( RULE_KEY ) )
            // InternalGenSql.g:992:1: ( RULE_KEY )
            {
            // InternalGenSql.g:992:1: ( RULE_KEY )
            // InternalGenSql.g:993:2: RULE_KEY
            {
             before(grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1()); 
            match(input,RULE_KEY,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1()); 

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
    // InternalGenSql.g:1002:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1006:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalGenSql.g:1007:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:1014:1: rule__ForeignKey__Group__2__Impl : ( RULE_LPARENT ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1018:1: ( ( RULE_LPARENT ) )
            // InternalGenSql.g:1019:1: ( RULE_LPARENT )
            {
            // InternalGenSql.g:1019:1: ( RULE_LPARENT )
            // InternalGenSql.g:1020:2: RULE_LPARENT
            {
             before(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_2()); 
            match(input,RULE_LPARENT,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_2()); 

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
    // InternalGenSql.g:1029:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1033:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalGenSql.g:1034:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGenSql.g:1041:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnsAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1045:1: ( ( ( rule__ForeignKey__ColumnsAssignment_3 ) ) )
            // InternalGenSql.g:1046:1: ( ( rule__ForeignKey__ColumnsAssignment_3 ) )
            {
            // InternalGenSql.g:1046:1: ( ( rule__ForeignKey__ColumnsAssignment_3 ) )
            // InternalGenSql.g:1047:2: ( rule__ForeignKey__ColumnsAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsAssignment_3()); 
            // InternalGenSql.g:1048:2: ( rule__ForeignKey__ColumnsAssignment_3 )
            // InternalGenSql.g:1048:3: rule__ForeignKey__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnsAssignment_3()); 

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
    // InternalGenSql.g:1056:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1060:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalGenSql.g:1061:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGenSql.g:1068:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1072:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalGenSql.g:1073:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalGenSql.g:1073:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalGenSql.g:1074:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalGenSql.g:1075:2: ( rule__ForeignKey__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGenSql.g:1075:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGenSql.g:1083:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1087:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalGenSql.g:1088:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalGenSql.g:1095:1: rule__ForeignKey__Group__5__Impl : ( RULE_RPARENT ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1099:1: ( ( RULE_RPARENT ) )
            // InternalGenSql.g:1100:1: ( RULE_RPARENT )
            {
            // InternalGenSql.g:1100:1: ( RULE_RPARENT )
            // InternalGenSql.g:1101:2: RULE_RPARENT
            {
             before(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_5()); 
            match(input,RULE_RPARENT,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_5()); 

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
    // InternalGenSql.g:1110:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1114:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalGenSql.g:1115:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:1122:1: rule__ForeignKey__Group__6__Impl : ( RULE_REFERENCES ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1126:1: ( ( RULE_REFERENCES ) )
            // InternalGenSql.g:1127:1: ( RULE_REFERENCES )
            {
            // InternalGenSql.g:1127:1: ( RULE_REFERENCES )
            // InternalGenSql.g:1128:2: RULE_REFERENCES
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6()); 
            match(input,RULE_REFERENCES,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6()); 

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
    // InternalGenSql.g:1137:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1141:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalGenSql.g:1142:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalGenSql.g:1149:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__TableRefAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1153:1: ( ( ( rule__ForeignKey__TableRefAssignment_7 ) ) )
            // InternalGenSql.g:1154:1: ( ( rule__ForeignKey__TableRefAssignment_7 ) )
            {
            // InternalGenSql.g:1154:1: ( ( rule__ForeignKey__TableRefAssignment_7 ) )
            // InternalGenSql.g:1155:2: ( rule__ForeignKey__TableRefAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getTableRefAssignment_7()); 
            // InternalGenSql.g:1156:2: ( rule__ForeignKey__TableRefAssignment_7 )
            // InternalGenSql.g:1156:3: rule__ForeignKey__TableRefAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__TableRefAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getTableRefAssignment_7()); 

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
    // InternalGenSql.g:1164:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1168:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalGenSql.g:1169:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:1176:1: rule__ForeignKey__Group__8__Impl : ( RULE_LPARENT ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1180:1: ( ( RULE_LPARENT ) )
            // InternalGenSql.g:1181:1: ( RULE_LPARENT )
            {
            // InternalGenSql.g:1181:1: ( RULE_LPARENT )
            // InternalGenSql.g:1182:2: RULE_LPARENT
            {
             before(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_8()); 
            match(input,RULE_LPARENT,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_8()); 

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
    // InternalGenSql.g:1191:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1195:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalGenSql.g:1196:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalGenSql.g:1203:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1207:1: ( ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) ) )
            // InternalGenSql.g:1208:1: ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) )
            {
            // InternalGenSql.g:1208:1: ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) )
            // InternalGenSql.g:1209:2: ( rule__ForeignKey__ColumnsRefAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_9()); 
            // InternalGenSql.g:1210:2: ( rule__ForeignKey__ColumnsRefAssignment_9 )
            // InternalGenSql.g:1210:3: rule__ForeignKey__ColumnsRefAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnsRefAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_9()); 

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
    // InternalGenSql.g:1218:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1222:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalGenSql.g:1223:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_16);
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
    // InternalGenSql.g:1230:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1234:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalGenSql.g:1235:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalGenSql.g:1235:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalGenSql.g:1236:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalGenSql.g:1237:2: ( rule__ForeignKey__Group_10__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGenSql.g:1237:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGenSql.g:1245:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12 ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1249:1: ( rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12 )
            // InternalGenSql.g:1250:2: rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__ForeignKey__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__12();

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
    // InternalGenSql.g:1257:1: rule__ForeignKey__Group__11__Impl : ( RULE_RPARENT ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1261:1: ( ( RULE_RPARENT ) )
            // InternalGenSql.g:1262:1: ( RULE_RPARENT )
            {
            // InternalGenSql.g:1262:1: ( RULE_RPARENT )
            // InternalGenSql.g:1263:2: RULE_RPARENT
            {
             before(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_11()); 
            match(input,RULE_RPARENT,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_11()); 

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


    // $ANTLR start "rule__ForeignKey__Group__12"
    // InternalGenSql.g:1272:1: rule__ForeignKey__Group__12 : rule__ForeignKey__Group__12__Impl ;
    public final void rule__ForeignKey__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1276:1: ( rule__ForeignKey__Group__12__Impl )
            // InternalGenSql.g:1277:2: rule__ForeignKey__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__12__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group__12"


    // $ANTLR start "rule__ForeignKey__Group__12__Impl"
    // InternalGenSql.g:1283:1: rule__ForeignKey__Group__12__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__ForeignKey__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1287:1: ( ( ( RULE_COMMA )? ) )
            // InternalGenSql.g:1288:1: ( ( RULE_COMMA )? )
            {
            // InternalGenSql.g:1288:1: ( ( RULE_COMMA )? )
            // InternalGenSql.g:1289:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12()); 
            // InternalGenSql.g:1290:2: ( RULE_COMMA )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMA) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGenSql.g:1290:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12()); 

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
    // $ANTLR end "rule__ForeignKey__Group__12__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__0"
    // InternalGenSql.g:1299:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1303:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalGenSql.g:1304:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:1311:1: rule__ForeignKey__Group_4__0__Impl : ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1315:1: ( ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) )
            // InternalGenSql.g:1316:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            {
            // InternalGenSql.g:1316:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            // InternalGenSql.g:1317:2: ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* )
            {
            // InternalGenSql.g:1317:2: ( ( RULE_COMMA ) )
            // InternalGenSql.g:1318:3: ( RULE_COMMA )
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalGenSql.g:1319:3: ( RULE_COMMA )
            // InternalGenSql.g:1319:4: RULE_COMMA
            {
            match(input,RULE_COMMA,FOLLOW_17); 

            }

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 

            }

            // InternalGenSql.g:1322:2: ( ( RULE_COMMA )* )
            // InternalGenSql.g:1323:3: ( RULE_COMMA )*
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalGenSql.g:1324:3: ( RULE_COMMA )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGenSql.g:1324:4: RULE_COMMA
            	    {
            	    match(input,RULE_COMMA,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ForeignKey__Group_4__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__1"
    // InternalGenSql.g:1333:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1337:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalGenSql.g:1338:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalGenSql.g:1344:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1348:1: ( ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) ) )
            // InternalGenSql.g:1349:1: ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) )
            {
            // InternalGenSql.g:1349:1: ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) )
            // InternalGenSql.g:1350:2: ( rule__ForeignKey__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsAssignment_4_1()); 
            // InternalGenSql.g:1351:2: ( rule__ForeignKey__ColumnsAssignment_4_1 )
            // InternalGenSql.g:1351:3: rule__ForeignKey__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnsAssignment_4_1()); 

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
    // InternalGenSql.g:1360:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1364:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalGenSql.g:1365:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGenSql.g:1372:1: rule__ForeignKey__Group_10__0__Impl : ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1376:1: ( ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) )
            // InternalGenSql.g:1377:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            {
            // InternalGenSql.g:1377:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            // InternalGenSql.g:1378:2: ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* )
            {
            // InternalGenSql.g:1378:2: ( ( RULE_COMMA ) )
            // InternalGenSql.g:1379:3: ( RULE_COMMA )
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 
            // InternalGenSql.g:1380:3: ( RULE_COMMA )
            // InternalGenSql.g:1380:4: RULE_COMMA
            {
            match(input,RULE_COMMA,FOLLOW_17); 

            }

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 

            }

            // InternalGenSql.g:1383:2: ( ( RULE_COMMA )* )
            // InternalGenSql.g:1384:3: ( RULE_COMMA )*
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 
            // InternalGenSql.g:1385:3: ( RULE_COMMA )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGenSql.g:1385:4: RULE_COMMA
            	    {
            	    match(input,RULE_COMMA,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__ForeignKey__Group_10__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_10__1"
    // InternalGenSql.g:1394:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1398:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalGenSql.g:1399:2: rule__ForeignKey__Group_10__1__Impl
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
    // InternalGenSql.g:1405:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1409:1: ( ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) ) )
            // InternalGenSql.g:1410:1: ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) )
            {
            // InternalGenSql.g:1410:1: ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) )
            // InternalGenSql.g:1411:2: ( rule__ForeignKey__ColumnsRefAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_10_1()); 
            // InternalGenSql.g:1412:2: ( rule__ForeignKey__ColumnsRefAssignment_10_1 )
            // InternalGenSql.g:1412:3: rule__ForeignKey__ColumnsRefAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnsRefAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_10_1()); 

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


    // $ANTLR start "rule__DataBase__TablesAssignment_1"
    // InternalGenSql.g:1421:1: rule__DataBase__TablesAssignment_1 : ( ruleTable ) ;
    public final void rule__DataBase__TablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1425:1: ( ( ruleTable ) )
            // InternalGenSql.g:1426:2: ( ruleTable )
            {
            // InternalGenSql.g:1426:2: ( ruleTable )
            // InternalGenSql.g:1427:3: ruleTable
            {
             before(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataBase__TablesAssignment_1"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalGenSql.g:1436:1: rule__Table__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1440:1: ( ( RULE_ID ) )
            // InternalGenSql.g:1441:2: ( RULE_ID )
            {
            // InternalGenSql.g:1441:2: ( RULE_ID )
            // InternalGenSql.g:1442:3: RULE_ID
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


    // $ANTLR start "rule__Table__ColumnsAssignment_4"
    // InternalGenSql.g:1451:1: rule__Table__ColumnsAssignment_4 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1455:1: ( ( ruleColumn ) )
            // InternalGenSql.g:1456:2: ( ruleColumn )
            {
            // InternalGenSql.g:1456:2: ( ruleColumn )
            // InternalGenSql.g:1457:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_4"


    // $ANTLR start "rule__Table__PrimarykeyAssignment_5"
    // InternalGenSql.g:1466:1: rule__Table__PrimarykeyAssignment_5 : ( rulePrimaryKey ) ;
    public final void rule__Table__PrimarykeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1470:1: ( ( rulePrimaryKey ) )
            // InternalGenSql.g:1471:2: ( rulePrimaryKey )
            {
            // InternalGenSql.g:1471:2: ( rulePrimaryKey )
            // InternalGenSql.g:1472:3: rulePrimaryKey
            {
             before(grammarAccess.getTableAccess().getPrimarykeyPrimaryKeyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getPrimarykeyPrimaryKeyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Table__PrimarykeyAssignment_5"


    // $ANTLR start "rule__Table__ForeignkeysAssignment_6"
    // InternalGenSql.g:1481:1: rule__Table__ForeignkeysAssignment_6 : ( ruleForeignKey ) ;
    public final void rule__Table__ForeignkeysAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1485:1: ( ( ruleForeignKey ) )
            // InternalGenSql.g:1486:2: ( ruleForeignKey )
            {
            // InternalGenSql.g:1486:2: ( ruleForeignKey )
            // InternalGenSql.g:1487:3: ruleForeignKey
            {
             before(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Table__ForeignkeysAssignment_6"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalGenSql.g:1496:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1500:1: ( ( RULE_ID ) )
            // InternalGenSql.g:1501:2: ( RULE_ID )
            {
            // InternalGenSql.g:1501:2: ( RULE_ID )
            // InternalGenSql.g:1502:3: RULE_ID
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


    // $ANTLR start "rule__Column__SQLTypeAssignment_1"
    // InternalGenSql.g:1511:1: rule__Column__SQLTypeAssignment_1 : ( RULE_TIPO ) ;
    public final void rule__Column__SQLTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1515:1: ( ( RULE_TIPO ) )
            // InternalGenSql.g:1516:2: ( RULE_TIPO )
            {
            // InternalGenSql.g:1516:2: ( RULE_TIPO )
            // InternalGenSql.g:1517:3: RULE_TIPO
            {
             before(grammarAccess.getColumnAccess().getSQLTypeTIPOTerminalRuleCall_1_0()); 
            match(input,RULE_TIPO,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getSQLTypeTIPOTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Column__SQLTypeAssignment_1"


    // $ANTLR start "rule__Column__LongitudAssignment_2"
    // InternalGenSql.g:1526:1: rule__Column__LongitudAssignment_2 : ( RULE_LONGITUD ) ;
    public final void rule__Column__LongitudAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1530:1: ( ( RULE_LONGITUD ) )
            // InternalGenSql.g:1531:2: ( RULE_LONGITUD )
            {
            // InternalGenSql.g:1531:2: ( RULE_LONGITUD )
            // InternalGenSql.g:1532:3: RULE_LONGITUD
            {
             before(grammarAccess.getColumnAccess().getLongitudLONGITUDTerminalRuleCall_2_0()); 
            match(input,RULE_LONGITUD,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLongitudLONGITUDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Column__LongitudAssignment_2"


    // $ANTLR start "rule__PrimaryKey__ColumnsAssignment_3"
    // InternalGenSql.g:1541:1: rule__PrimaryKey__ColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1545:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1546:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1546:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1547:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0()); 
            // InternalGenSql.g:1548:3: ( RULE_ID )
            // InternalGenSql.g:1549:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0()); 

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
    // $ANTLR end "rule__PrimaryKey__ColumnsAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColumnsAssignment_4_1"
    // InternalGenSql.g:1560:1: rule__PrimaryKey__ColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1564:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1565:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1565:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1566:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0()); 
            // InternalGenSql.g:1567:3: ( RULE_ID )
            // InternalGenSql.g:1568:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__PrimaryKey__ColumnsAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__ColumnsAssignment_3"
    // InternalGenSql.g:1579:1: rule__ForeignKey__ColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1583:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1584:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1584:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1585:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0()); 
            // InternalGenSql.g:1586:3: ( RULE_ID )
            // InternalGenSql.g:1587:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0()); 

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
    // $ANTLR end "rule__ForeignKey__ColumnsAssignment_3"


    // $ANTLR start "rule__ForeignKey__ColumnsAssignment_4_1"
    // InternalGenSql.g:1598:1: rule__ForeignKey__ColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1602:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1603:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1603:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1604:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0()); 
            // InternalGenSql.g:1605:3: ( RULE_ID )
            // InternalGenSql.g:1606:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnsColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__ForeignKey__ColumnsAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__TableRefAssignment_7"
    // InternalGenSql.g:1617:1: rule__ForeignKey__TableRefAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__TableRefAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1621:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1622:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1622:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1623:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getTableRefTableCrossReference_7_0()); 
            // InternalGenSql.g:1624:3: ( RULE_ID )
            // InternalGenSql.g:1625:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getTableRefTableIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getTableRefTableIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getTableRefTableCrossReference_7_0()); 

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
    // $ANTLR end "rule__ForeignKey__TableRefAssignment_7"


    // $ANTLR start "rule__ForeignKey__ColumnsRefAssignment_9"
    // InternalGenSql.g:1636:1: rule__ForeignKey__ColumnsRefAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsRefAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1640:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1641:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1641:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1642:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0()); 
            // InternalGenSql.g:1643:3: ( RULE_ID )
            // InternalGenSql.g:1644:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0()); 

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
    // $ANTLR end "rule__ForeignKey__ColumnsRefAssignment_9"


    // $ANTLR start "rule__ForeignKey__ColumnsRefAssignment_10_1"
    // InternalGenSql.g:1655:1: rule__ForeignKey__ColumnsRefAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsRefAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenSql.g:1659:1: ( ( ( RULE_ID ) ) )
            // InternalGenSql.g:1660:2: ( ( RULE_ID ) )
            {
            // InternalGenSql.g:1660:2: ( ( RULE_ID ) )
            // InternalGenSql.g:1661:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_10_1_0()); 
            // InternalGenSql.g:1662:3: ( RULE_ID )
            // InternalGenSql.g:1663:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__ForeignKey__ColumnsRefAssignment_10_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});

}