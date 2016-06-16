package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE_TABLE", "RULE_LPAR", "RULE_RPAR", "RULE_COMMA", "RULE_PRIMARY_KEY", "RULE_FOREIGN_KEY", "RULE_REFERENCES", "RULE_ID", "RULE_DATA_TYPE", "RULE_NOT_NULL", "RULE_MAX_LENGTH", "RULE_TINT", "RULE_TVARCHAR", "RULE_TCHARACTER", "RULE_TBINARY", "RULE_TBOOLEAN", "RULE_TVARBINARY", "RULE_TSMALLINT", "RULE_TBIGINT", "RULE_PRECISION", "RULE_TDECIMAL", "RULE_TNUMERIC", "RULE_TFLOAT", "RULE_TDATE", "RULE_TTIME", "RULE_TTIMESTAMP", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_TNUMERIC=25;
    public static final int RULE_TBOOLEAN=19;
    public static final int RULE_PRIMARY_KEY=8;
    public static final int RULE_TTIMESTAMP=29;
    public static final int RULE_STRING=31;
    public static final int RULE_TVARBINARY=20;
    public static final int RULE_DATA_TYPE=12;
    public static final int RULE_FOREIGN_KEY=9;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_CREATE_TABLE=4;
    public static final int RULE_TTIME=28;
    public static final int EOF=-1;
    public static final int RULE_NOT_NULL=13;
    public static final int RULE_TFLOAT=26;
    public static final int RULE_REFERENCES=10;
    public static final int RULE_ID=11;
    public static final int RULE_PRECISION=23;
    public static final int RULE_COMMA=7;
    public static final int RULE_MAX_LENGTH=14;
    public static final int RULE_TDECIMAL=24;
    public static final int RULE_WS=34;
    public static final int RULE_TCHARACTER=17;
    public static final int RULE_TBINARY=18;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_TBIGINT=22;
    public static final int RULE_INT=30;
    public static final int RULE_TINT=15;
    public static final int RULE_TSMALLINT=21;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_RPAR=6;
    public static final int RULE_LPAR=5;
    public static final int RULE_TDATE=27;
    public static final int RULE_TVARCHAR=16;

    // delegates
    // delegators


        public InternalSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSQL.g"; }


    	private SQLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SQLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDatabase"
    // InternalSQL.g:53:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSQL.g:54:1: ( ruleDatabase EOF )
            // InternalSQL.g:55:1: ruleDatabase EOF
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
    // InternalSQL.g:62:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:66:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalSQL.g:67:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalSQL.g:67:2: ( ( rule__Database__Group__0 ) )
            // InternalSQL.g:68:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalSQL.g:69:3: ( rule__Database__Group__0 )
            // InternalSQL.g:69:4: rule__Database__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

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
    // InternalSQL.g:78:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSQL.g:79:1: ( ruleTable EOF )
            // InternalSQL.g:80:1: ruleTable EOF
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
    // InternalSQL.g:87:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:91:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSQL.g:92:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSQL.g:92:2: ( ( rule__Table__Group__0 ) )
            // InternalSQL.g:93:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSQL.g:94:3: ( rule__Table__Group__0 )
            // InternalSQL.g:94:4: rule__Table__Group__0
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
    // InternalSQL.g:103:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalSQL.g:104:1: ( ruleColumn EOF )
            // InternalSQL.g:105:1: ruleColumn EOF
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
    // InternalSQL.g:112:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:116:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalSQL.g:117:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalSQL.g:117:2: ( ( rule__Column__Group__0 ) )
            // InternalSQL.g:118:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalSQL.g:119:3: ( rule__Column__Group__0 )
            // InternalSQL.g:119:4: rule__Column__Group__0
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
    // InternalSQL.g:128:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSQL.g:129:1: ( rulePrimaryKey EOF )
            // InternalSQL.g:130:1: rulePrimaryKey EOF
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
    // InternalSQL.g:137:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:141:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSQL.g:142:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSQL.g:142:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSQL.g:143:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSQL.g:144:3: ( rule__PrimaryKey__Group__0 )
            // InternalSQL.g:144:4: rule__PrimaryKey__Group__0
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
    // InternalSQL.g:153:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSQL.g:154:1: ( ruleForeignKey EOF )
            // InternalSQL.g:155:1: ruleForeignKey EOF
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
    // InternalSQL.g:162:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:166:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSQL.g:167:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSQL.g:167:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSQL.g:168:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSQL.g:169:3: ( rule__ForeignKey__Group__0 )
            // InternalSQL.g:169:4: rule__ForeignKey__Group__0
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


    // $ANTLR start "rule__Database__Group__0"
    // InternalSQL.g:177:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:181:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSQL.g:182:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__1();

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
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // InternalSQL.g:189:1: rule__Database__Group__0__Impl : ( () ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:193:1: ( ( () ) )
            // InternalSQL.g:194:1: ( () )
            {
            // InternalSQL.g:194:1: ( () )
            // InternalSQL.g:195:2: ()
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 
            // InternalSQL.g:196:2: ()
            // InternalSQL.g:196:3: 
            {
            }

             after(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // InternalSQL.g:204:1: rule__Database__Group__1 : rule__Database__Group__1__Impl ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:208:1: ( rule__Database__Group__1__Impl )
            // InternalSQL.g:209:2: rule__Database__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__1__Impl();

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
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // InternalSQL.g:215:1: rule__Database__Group__1__Impl : ( ( rule__Database__TablesAssignment_1 )* ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:219:1: ( ( ( rule__Database__TablesAssignment_1 )* ) )
            // InternalSQL.g:220:1: ( ( rule__Database__TablesAssignment_1 )* )
            {
            // InternalSQL.g:220:1: ( ( rule__Database__TablesAssignment_1 )* )
            // InternalSQL.g:221:2: ( rule__Database__TablesAssignment_1 )*
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment_1()); 
            // InternalSQL.g:222:2: ( rule__Database__TablesAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_CREATE_TABLE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:222:3: rule__Database__TablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Database__TablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTablesAssignment_1()); 

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
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSQL.g:231:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:235:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSQL.g:236:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSQL.g:243:1: rule__Table__Group__0__Impl : ( RULE_CREATE_TABLE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:247:1: ( ( RULE_CREATE_TABLE ) )
            // InternalSQL.g:248:1: ( RULE_CREATE_TABLE )
            {
            // InternalSQL.g:248:1: ( RULE_CREATE_TABLE )
            // InternalSQL.g:249:2: RULE_CREATE_TABLE
            {
             before(grammarAccess.getTableAccess().getCREATE_TABLETerminalRuleCall_0()); 
            match(input,RULE_CREATE_TABLE,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCREATE_TABLETerminalRuleCall_0()); 

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
    // InternalSQL.g:258:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:262:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSQL.g:263:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSQL.g:270:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:274:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSQL.g:275:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSQL.g:275:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSQL.g:276:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSQL.g:277:2: ( rule__Table__NameAssignment_1 )
            // InternalSQL.g:277:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

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
    // InternalSQL.g:285:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:289:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSQL.g:290:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSQL.g:297:1: rule__Table__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:301:1: ( ( RULE_LPAR ) )
            // InternalSQL.g:302:1: ( RULE_LPAR )
            {
            // InternalSQL.g:302:1: ( RULE_LPAR )
            // InternalSQL.g:303:2: RULE_LPAR
            {
             before(grammarAccess.getTableAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLPARTerminalRuleCall_2()); 

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
    // InternalSQL.g:312:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:316:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSQL.g:317:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSQL.g:324:1: rule__Table__Group__3__Impl : ( ( rule__Table__ColumnsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:328:1: ( ( ( rule__Table__ColumnsAssignment_3 ) ) )
            // InternalSQL.g:329:1: ( ( rule__Table__ColumnsAssignment_3 ) )
            {
            // InternalSQL.g:329:1: ( ( rule__Table__ColumnsAssignment_3 ) )
            // InternalSQL.g:330:2: ( rule__Table__ColumnsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3()); 
            // InternalSQL.g:331:2: ( rule__Table__ColumnsAssignment_3 )
            // InternalSQL.g:331:3: rule__Table__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_3()); 

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
    // InternalSQL.g:339:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:343:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSQL.g:344:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:351:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:355:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSQL.g:356:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSQL.g:356:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSQL.g:357:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSQL.g:358:2: ( rule__Table__Group_4__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalSQL.g:358:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_4()); 

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
    // InternalSQL.g:366:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:370:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSQL.g:371:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:378:1: rule__Table__Group__5__Impl : ( ( rule__Table__PrimaryKeyAssignment_5 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:382:1: ( ( ( rule__Table__PrimaryKeyAssignment_5 )? ) )
            // InternalSQL.g:383:1: ( ( rule__Table__PrimaryKeyAssignment_5 )? )
            {
            // InternalSQL.g:383:1: ( ( rule__Table__PrimaryKeyAssignment_5 )? )
            // InternalSQL.g:384:2: ( rule__Table__PrimaryKeyAssignment_5 )?
            {
             before(grammarAccess.getTableAccess().getPrimaryKeyAssignment_5()); 
            // InternalSQL.g:385:2: ( rule__Table__PrimaryKeyAssignment_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMMA) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_PRIMARY_KEY) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalSQL.g:385:3: rule__Table__PrimaryKeyAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__PrimaryKeyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getPrimaryKeyAssignment_5()); 

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
    // InternalSQL.g:393:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:397:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalSQL.g:398:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:405:1: rule__Table__Group__6__Impl : ( ( rule__Table__ForeignKeysAssignment_6 )* ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:409:1: ( ( ( rule__Table__ForeignKeysAssignment_6 )* ) )
            // InternalSQL.g:410:1: ( ( rule__Table__ForeignKeysAssignment_6 )* )
            {
            // InternalSQL.g:410:1: ( ( rule__Table__ForeignKeysAssignment_6 )* )
            // InternalSQL.g:411:2: ( rule__Table__ForeignKeysAssignment_6 )*
            {
             before(grammarAccess.getTableAccess().getForeignKeysAssignment_6()); 
            // InternalSQL.g:412:2: ( rule__Table__ForeignKeysAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSQL.g:412:3: rule__Table__ForeignKeysAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Table__ForeignKeysAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getForeignKeysAssignment_6()); 

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
    // InternalSQL.g:420:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:424:1: ( rule__Table__Group__7__Impl )
            // InternalSQL.g:425:2: rule__Table__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__7__Impl();

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
    // InternalSQL.g:431:1: rule__Table__Group__7__Impl : ( RULE_RPAR ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:435:1: ( ( RULE_RPAR ) )
            // InternalSQL.g:436:1: ( RULE_RPAR )
            {
            // InternalSQL.g:436:1: ( RULE_RPAR )
            // InternalSQL.g:437:2: RULE_RPAR
            {
             before(grammarAccess.getTableAccess().getRPARTerminalRuleCall_7()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRPARTerminalRuleCall_7()); 

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


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalSQL.g:447:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:451:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSQL.g:452:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

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
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalSQL.g:459:1: rule__Table__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:463:1: ( ( RULE_COMMA ) )
            // InternalSQL.g:464:1: ( RULE_COMMA )
            {
            // InternalSQL.g:464:1: ( RULE_COMMA )
            // InternalSQL.g:465:2: RULE_COMMA
            {
             before(grammarAccess.getTableAccess().getCOMMATerminalRuleCall_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCOMMATerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalSQL.g:474:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:478:1: ( rule__Table__Group_4__1__Impl )
            // InternalSQL.g:479:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

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
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalSQL.g:485:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__ColumnsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:489:1: ( ( ( rule__Table__ColumnsAssignment_4_1 ) ) )
            // InternalSQL.g:490:1: ( ( rule__Table__ColumnsAssignment_4_1 ) )
            {
            // InternalSQL.g:490:1: ( ( rule__Table__ColumnsAssignment_4_1 ) )
            // InternalSQL.g:491:2: ( rule__Table__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); 
            // InternalSQL.g:492:2: ( rule__Table__ColumnsAssignment_4_1 )
            // InternalSQL.g:492:3: rule__Table__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); 

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
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalSQL.g:501:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:505:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSQL.g:506:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSQL.g:513:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:517:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalSQL.g:518:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalSQL.g:518:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalSQL.g:519:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalSQL.g:520:2: ( rule__Column__NameAssignment_0 )
            // InternalSQL.g:520:3: rule__Column__NameAssignment_0
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
    // InternalSQL.g:528:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:532:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalSQL.g:533:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSQL.g:540:1: rule__Column__Group__1__Impl : ( ( rule__Column__DataTypeAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:544:1: ( ( ( rule__Column__DataTypeAssignment_1 ) ) )
            // InternalSQL.g:545:1: ( ( rule__Column__DataTypeAssignment_1 ) )
            {
            // InternalSQL.g:545:1: ( ( rule__Column__DataTypeAssignment_1 ) )
            // InternalSQL.g:546:2: ( rule__Column__DataTypeAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getDataTypeAssignment_1()); 
            // InternalSQL.g:547:2: ( rule__Column__DataTypeAssignment_1 )
            // InternalSQL.g:547:3: rule__Column__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__DataTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getDataTypeAssignment_1()); 

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
    // InternalSQL.g:555:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:559:1: ( rule__Column__Group__2__Impl )
            // InternalSQL.g:560:2: rule__Column__Group__2__Impl
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
    // InternalSQL.g:566:1: rule__Column__Group__2__Impl : ( ( rule__Column__NotNullAssignment_2 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:570:1: ( ( ( rule__Column__NotNullAssignment_2 )? ) )
            // InternalSQL.g:571:1: ( ( rule__Column__NotNullAssignment_2 )? )
            {
            // InternalSQL.g:571:1: ( ( rule__Column__NotNullAssignment_2 )? )
            // InternalSQL.g:572:2: ( rule__Column__NotNullAssignment_2 )?
            {
             before(grammarAccess.getColumnAccess().getNotNullAssignment_2()); 
            // InternalSQL.g:573:2: ( rule__Column__NotNullAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NOT_NULL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:573:3: rule__Column__NotNullAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__NotNullAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getNotNullAssignment_2()); 

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
    // InternalSQL.g:582:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:586:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSQL.g:587:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:594:1: rule__PrimaryKey__Group__0__Impl : ( RULE_COMMA ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:598:1: ( ( RULE_COMMA ) )
            // InternalSQL.g:599:1: ( RULE_COMMA )
            {
            // InternalSQL.g:599:1: ( RULE_COMMA )
            // InternalSQL.g:600:2: RULE_COMMA
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_0()); 

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
    // InternalSQL.g:609:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:613:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSQL.g:614:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
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
    // InternalSQL.g:621:1: rule__PrimaryKey__Group__1__Impl : ( RULE_PRIMARY_KEY ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:625:1: ( ( RULE_PRIMARY_KEY ) )
            // InternalSQL.g:626:1: ( RULE_PRIMARY_KEY )
            {
            // InternalSQL.g:626:1: ( RULE_PRIMARY_KEY )
            // InternalSQL.g:627:2: RULE_PRIMARY_KEY
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARY_KEYTerminalRuleCall_1()); 
            match(input,RULE_PRIMARY_KEY,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getPRIMARY_KEYTerminalRuleCall_1()); 

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
    // InternalSQL.g:636:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:640:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSQL.g:641:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
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
    // InternalSQL.g:648:1: rule__PrimaryKey__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:652:1: ( ( RULE_LPAR ) )
            // InternalSQL.g:653:1: ( RULE_LPAR )
            {
            // InternalSQL.g:653:1: ( RULE_LPAR )
            // InternalSQL.g:654:2: RULE_LPAR
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
    // InternalSQL.g:663:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:667:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSQL.g:668:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:675:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnsAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:679:1: ( ( ( rule__PrimaryKey__ColumnsAssignment_3 ) ) )
            // InternalSQL.g:680:1: ( ( rule__PrimaryKey__ColumnsAssignment_3 ) )
            {
            // InternalSQL.g:680:1: ( ( rule__PrimaryKey__ColumnsAssignment_3 ) )
            // InternalSQL.g:681:2: ( rule__PrimaryKey__ColumnsAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_3()); 
            // InternalSQL.g:682:2: ( rule__PrimaryKey__ColumnsAssignment_3 )
            // InternalSQL.g:682:3: rule__PrimaryKey__ColumnsAssignment_3
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
    // InternalSQL.g:690:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:694:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSQL.g:695:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:702:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:706:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSQL.g:707:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSQL.g:707:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSQL.g:708:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSQL.g:709:2: ( rule__PrimaryKey__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSQL.g:709:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSQL.g:717:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:721:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSQL.g:722:2: rule__PrimaryKey__Group__5__Impl
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
    // InternalSQL.g:728:1: rule__PrimaryKey__Group__5__Impl : ( RULE_RPAR ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:732:1: ( ( RULE_RPAR ) )
            // InternalSQL.g:733:1: ( RULE_RPAR )
            {
            // InternalSQL.g:733:1: ( RULE_RPAR )
            // InternalSQL.g:734:2: RULE_RPAR
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
    // InternalSQL.g:744:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:748:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSQL.g:749:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
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
    // InternalSQL.g:756:1: rule__PrimaryKey__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:760:1: ( ( RULE_COMMA ) )
            // InternalSQL.g:761:1: ( RULE_COMMA )
            {
            // InternalSQL.g:761:1: ( RULE_COMMA )
            // InternalSQL.g:762:2: RULE_COMMA
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 

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
    // InternalSQL.g:771:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:775:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSQL.g:776:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSQL.g:782:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:786:1: ( ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) ) )
            // InternalSQL.g:787:1: ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) )
            {
            // InternalSQL.g:787:1: ( ( rule__PrimaryKey__ColumnsAssignment_4_1 ) )
            // InternalSQL.g:788:2: ( rule__PrimaryKey__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsAssignment_4_1()); 
            // InternalSQL.g:789:2: ( rule__PrimaryKey__ColumnsAssignment_4_1 )
            // InternalSQL.g:789:3: rule__PrimaryKey__ColumnsAssignment_4_1
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
    // InternalSQL.g:798:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:802:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSQL.g:803:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
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
    // InternalSQL.g:810:1: rule__ForeignKey__Group__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:814:1: ( ( RULE_COMMA ) )
            // InternalSQL.g:815:1: ( RULE_COMMA )
            {
            // InternalSQL.g:815:1: ( RULE_COMMA )
            // InternalSQL.g:816:2: RULE_COMMA
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_0()); 

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
    // InternalSQL.g:825:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:829:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSQL.g:830:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
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
    // InternalSQL.g:837:1: rule__ForeignKey__Group__1__Impl : ( RULE_FOREIGN_KEY ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:841:1: ( ( RULE_FOREIGN_KEY ) )
            // InternalSQL.g:842:1: ( RULE_FOREIGN_KEY )
            {
            // InternalSQL.g:842:1: ( RULE_FOREIGN_KEY )
            // InternalSQL.g:843:2: RULE_FOREIGN_KEY
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGN_KEYTerminalRuleCall_1()); 
            match(input,RULE_FOREIGN_KEY,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getFOREIGN_KEYTerminalRuleCall_1()); 

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
    // InternalSQL.g:852:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:856:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSQL.g:857:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
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
    // InternalSQL.g:864:1: rule__ForeignKey__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:868:1: ( ( RULE_LPAR ) )
            // InternalSQL.g:869:1: ( RULE_LPAR )
            {
            // InternalSQL.g:869:1: ( RULE_LPAR )
            // InternalSQL.g:870:2: RULE_LPAR
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
    // InternalSQL.g:879:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:883:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSQL.g:884:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:891:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnsAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:895:1: ( ( ( rule__ForeignKey__ColumnsAssignment_3 ) ) )
            // InternalSQL.g:896:1: ( ( rule__ForeignKey__ColumnsAssignment_3 ) )
            {
            // InternalSQL.g:896:1: ( ( rule__ForeignKey__ColumnsAssignment_3 ) )
            // InternalSQL.g:897:2: ( rule__ForeignKey__ColumnsAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsAssignment_3()); 
            // InternalSQL.g:898:2: ( rule__ForeignKey__ColumnsAssignment_3 )
            // InternalSQL.g:898:3: rule__ForeignKey__ColumnsAssignment_3
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
    // InternalSQL.g:906:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:910:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSQL.g:911:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:918:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:922:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSQL.g:923:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSQL.g:923:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSQL.g:924:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSQL.g:925:2: ( rule__ForeignKey__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSQL.g:925:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSQL.g:933:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:937:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSQL.g:938:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
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
    // InternalSQL.g:945:1: rule__ForeignKey__Group__5__Impl : ( RULE_RPAR ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:949:1: ( ( RULE_RPAR ) )
            // InternalSQL.g:950:1: ( RULE_RPAR )
            {
            // InternalSQL.g:950:1: ( RULE_RPAR )
            // InternalSQL.g:951:2: RULE_RPAR
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
    // InternalSQL.g:960:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:964:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSQL.g:965:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
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
    // InternalSQL.g:972:1: rule__ForeignKey__Group__6__Impl : ( RULE_REFERENCES ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:976:1: ( ( RULE_REFERENCES ) )
            // InternalSQL.g:977:1: ( RULE_REFERENCES )
            {
            // InternalSQL.g:977:1: ( RULE_REFERENCES )
            // InternalSQL.g:978:2: RULE_REFERENCES
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
    // InternalSQL.g:987:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:991:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSQL.g:992:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
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
    // InternalSQL.g:999:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__RefTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1003:1: ( ( ( rule__ForeignKey__RefTableAssignment_7 ) ) )
            // InternalSQL.g:1004:1: ( ( rule__ForeignKey__RefTableAssignment_7 ) )
            {
            // InternalSQL.g:1004:1: ( ( rule__ForeignKey__RefTableAssignment_7 ) )
            // InternalSQL.g:1005:2: ( rule__ForeignKey__RefTableAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getRefTableAssignment_7()); 
            // InternalSQL.g:1006:2: ( rule__ForeignKey__RefTableAssignment_7 )
            // InternalSQL.g:1006:3: rule__ForeignKey__RefTableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__RefTableAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getRefTableAssignment_7()); 

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
    // InternalSQL.g:1014:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1018:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSQL.g:1019:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
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
    // InternalSQL.g:1026:1: rule__ForeignKey__Group__8__Impl : ( RULE_LPAR ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1030:1: ( ( RULE_LPAR ) )
            // InternalSQL.g:1031:1: ( RULE_LPAR )
            {
            // InternalSQL.g:1031:1: ( RULE_LPAR )
            // InternalSQL.g:1032:2: RULE_LPAR
            {
             before(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_8()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_8()); 

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
    // InternalSQL.g:1041:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1045:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSQL.g:1046:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:1053:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__RefColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1057:1: ( ( ( rule__ForeignKey__RefColumnsAssignment_9 ) ) )
            // InternalSQL.g:1058:1: ( ( rule__ForeignKey__RefColumnsAssignment_9 ) )
            {
            // InternalSQL.g:1058:1: ( ( rule__ForeignKey__RefColumnsAssignment_9 ) )
            // InternalSQL.g:1059:2: ( rule__ForeignKey__RefColumnsAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnsAssignment_9()); 
            // InternalSQL.g:1060:2: ( rule__ForeignKey__RefColumnsAssignment_9 )
            // InternalSQL.g:1060:3: rule__ForeignKey__RefColumnsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__RefColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getRefColumnsAssignment_9()); 

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
    // InternalSQL.g:1068:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1072:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSQL.g:1073:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_7);
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
    // InternalSQL.g:1080:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1084:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSQL.g:1085:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSQL.g:1085:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSQL.g:1086:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSQL.g:1087:2: ( rule__ForeignKey__Group_10__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSQL.g:1087:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSQL.g:1095:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1099:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalSQL.g:1100:2: rule__ForeignKey__Group__11__Impl
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
    // InternalSQL.g:1106:1: rule__ForeignKey__Group__11__Impl : ( RULE_RPAR ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1110:1: ( ( RULE_RPAR ) )
            // InternalSQL.g:1111:1: ( RULE_RPAR )
            {
            // InternalSQL.g:1111:1: ( RULE_RPAR )
            // InternalSQL.g:1112:2: RULE_RPAR
            {
             before(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_11()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_11()); 

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
    // InternalSQL.g:1122:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1126:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSQL.g:1127:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
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
    // InternalSQL.g:1134:1: rule__ForeignKey__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1138:1: ( ( RULE_COMMA ) )
            // InternalSQL.g:1139:1: ( RULE_COMMA )
            {
            // InternalSQL.g:1139:1: ( RULE_COMMA )
            // InternalSQL.g:1140:2: RULE_COMMA
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 

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
    // InternalSQL.g:1149:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1153:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSQL.g:1154:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalSQL.g:1160:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1164:1: ( ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) ) )
            // InternalSQL.g:1165:1: ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) )
            {
            // InternalSQL.g:1165:1: ( ( rule__ForeignKey__ColumnsAssignment_4_1 ) )
            // InternalSQL.g:1166:2: ( rule__ForeignKey__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsAssignment_4_1()); 
            // InternalSQL.g:1167:2: ( rule__ForeignKey__ColumnsAssignment_4_1 )
            // InternalSQL.g:1167:3: rule__ForeignKey__ColumnsAssignment_4_1
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
    // InternalSQL.g:1176:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1180:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSQL.g:1181:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
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
    // InternalSQL.g:1188:1: rule__ForeignKey__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1192:1: ( ( RULE_COMMA ) )
            // InternalSQL.g:1193:1: ( RULE_COMMA )
            {
            // InternalSQL.g:1193:1: ( RULE_COMMA )
            // InternalSQL.g:1194:2: RULE_COMMA
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 

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
    // InternalSQL.g:1203:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1207:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSQL.g:1208:2: rule__ForeignKey__Group_10__1__Impl
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
    // InternalSQL.g:1214:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__RefColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1218:1: ( ( ( rule__ForeignKey__RefColumnsAssignment_10_1 ) ) )
            // InternalSQL.g:1219:1: ( ( rule__ForeignKey__RefColumnsAssignment_10_1 ) )
            {
            // InternalSQL.g:1219:1: ( ( rule__ForeignKey__RefColumnsAssignment_10_1 ) )
            // InternalSQL.g:1220:2: ( rule__ForeignKey__RefColumnsAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnsAssignment_10_1()); 
            // InternalSQL.g:1221:2: ( rule__ForeignKey__RefColumnsAssignment_10_1 )
            // InternalSQL.g:1221:3: rule__ForeignKey__RefColumnsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__RefColumnsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getRefColumnsAssignment_10_1()); 

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


    // $ANTLR start "rule__Database__TablesAssignment_1"
    // InternalSQL.g:1230:1: rule__Database__TablesAssignment_1 : ( ruleTable ) ;
    public final void rule__Database__TablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1234:1: ( ( ruleTable ) )
            // InternalSQL.g:1235:2: ( ruleTable )
            {
            // InternalSQL.g:1235:2: ( ruleTable )
            // InternalSQL.g:1236:3: ruleTable
            {
             before(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Database__TablesAssignment_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalSQL.g:1245:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1249:1: ( ( RULE_ID ) )
            // InternalSQL.g:1250:2: ( RULE_ID )
            {
            // InternalSQL.g:1250:2: ( RULE_ID )
            // InternalSQL.g:1251:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_3"
    // InternalSQL.g:1260:1: rule__Table__ColumnsAssignment_3 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1264:1: ( ( ruleColumn ) )
            // InternalSQL.g:1265:2: ( ruleColumn )
            {
            // InternalSQL.g:1265:2: ( ruleColumn )
            // InternalSQL.g:1266:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_3"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_1"
    // InternalSQL.g:1275:1: rule__Table__ColumnsAssignment_4_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1279:1: ( ( ruleColumn ) )
            // InternalSQL.g:1280:2: ( ruleColumn )
            {
            // InternalSQL.g:1280:2: ( ruleColumn )
            // InternalSQL.g:1281:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_4_1"


    // $ANTLR start "rule__Table__PrimaryKeyAssignment_5"
    // InternalSQL.g:1290:1: rule__Table__PrimaryKeyAssignment_5 : ( rulePrimaryKey ) ;
    public final void rule__Table__PrimaryKeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1294:1: ( ( rulePrimaryKey ) )
            // InternalSQL.g:1295:2: ( rulePrimaryKey )
            {
            // InternalSQL.g:1295:2: ( rulePrimaryKey )
            // InternalSQL.g:1296:3: rulePrimaryKey
            {
             before(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Table__PrimaryKeyAssignment_5"


    // $ANTLR start "rule__Table__ForeignKeysAssignment_6"
    // InternalSQL.g:1305:1: rule__Table__ForeignKeysAssignment_6 : ( ruleForeignKey ) ;
    public final void rule__Table__ForeignKeysAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1309:1: ( ( ruleForeignKey ) )
            // InternalSQL.g:1310:2: ( ruleForeignKey )
            {
            // InternalSQL.g:1310:2: ( ruleForeignKey )
            // InternalSQL.g:1311:3: ruleForeignKey
            {
             before(grammarAccess.getTableAccess().getForeignKeysForeignKeyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getForeignKeysForeignKeyParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Table__ForeignKeysAssignment_6"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalSQL.g:1320:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1324:1: ( ( RULE_ID ) )
            // InternalSQL.g:1325:2: ( RULE_ID )
            {
            // InternalSQL.g:1325:2: ( RULE_ID )
            // InternalSQL.g:1326:3: RULE_ID
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


    // $ANTLR start "rule__Column__DataTypeAssignment_1"
    // InternalSQL.g:1335:1: rule__Column__DataTypeAssignment_1 : ( RULE_DATA_TYPE ) ;
    public final void rule__Column__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1339:1: ( ( RULE_DATA_TYPE ) )
            // InternalSQL.g:1340:2: ( RULE_DATA_TYPE )
            {
            // InternalSQL.g:1340:2: ( RULE_DATA_TYPE )
            // InternalSQL.g:1341:3: RULE_DATA_TYPE
            {
             before(grammarAccess.getColumnAccess().getDataTypeDATA_TYPETerminalRuleCall_1_0()); 
            match(input,RULE_DATA_TYPE,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getDataTypeDATA_TYPETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Column__DataTypeAssignment_1"


    // $ANTLR start "rule__Column__NotNullAssignment_2"
    // InternalSQL.g:1350:1: rule__Column__NotNullAssignment_2 : ( RULE_NOT_NULL ) ;
    public final void rule__Column__NotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1354:1: ( ( RULE_NOT_NULL ) )
            // InternalSQL.g:1355:2: ( RULE_NOT_NULL )
            {
            // InternalSQL.g:1355:2: ( RULE_NOT_NULL )
            // InternalSQL.g:1356:3: RULE_NOT_NULL
            {
             before(grammarAccess.getColumnAccess().getNotNullNOT_NULLTerminalRuleCall_2_0()); 
            match(input,RULE_NOT_NULL,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNotNullNOT_NULLTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Column__NotNullAssignment_2"


    // $ANTLR start "rule__PrimaryKey__ColumnsAssignment_3"
    // InternalSQL.g:1365:1: rule__PrimaryKey__ColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1369:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1370:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1370:2: ( ( RULE_ID ) )
            // InternalSQL.g:1371:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0()); 
            // InternalSQL.g:1372:3: ( RULE_ID )
            // InternalSQL.g:1373:4: RULE_ID
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
    // InternalSQL.g:1384:1: rule__PrimaryKey__ColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1388:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1389:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1389:2: ( ( RULE_ID ) )
            // InternalSQL.g:1390:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0()); 
            // InternalSQL.g:1391:3: ( RULE_ID )
            // InternalSQL.g:1392:4: RULE_ID
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
    // InternalSQL.g:1403:1: rule__ForeignKey__ColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1407:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1408:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1408:2: ( ( RULE_ID ) )
            // InternalSQL.g:1409:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0()); 
            // InternalSQL.g:1410:3: ( RULE_ID )
            // InternalSQL.g:1411:4: RULE_ID
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
    // InternalSQL.g:1422:1: rule__ForeignKey__ColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1426:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1427:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1427:2: ( ( RULE_ID ) )
            // InternalSQL.g:1428:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0()); 
            // InternalSQL.g:1429:3: ( RULE_ID )
            // InternalSQL.g:1430:4: RULE_ID
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


    // $ANTLR start "rule__ForeignKey__RefTableAssignment_7"
    // InternalSQL.g:1441:1: rule__ForeignKey__RefTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RefTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1445:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1446:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1446:2: ( ( RULE_ID ) )
            // InternalSQL.g:1447:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getRefTableTableCrossReference_7_0()); 
            // InternalSQL.g:1448:3: ( RULE_ID )
            // InternalSQL.g:1449:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getRefTableTableIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRefTableTableIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getRefTableTableCrossReference_7_0()); 

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
    // $ANTLR end "rule__ForeignKey__RefTableAssignment_7"


    // $ANTLR start "rule__ForeignKey__RefColumnsAssignment_9"
    // InternalSQL.g:1460:1: rule__ForeignKey__RefColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RefColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1464:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1465:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1465:2: ( ( RULE_ID ) )
            // InternalSQL.g:1466:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnsColumnCrossReference_9_0()); 
            // InternalSQL.g:1467:3: ( RULE_ID )
            // InternalSQL.g:1468:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnsColumnIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRefColumnsColumnIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getRefColumnsColumnCrossReference_9_0()); 

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
    // $ANTLR end "rule__ForeignKey__RefColumnsAssignment_9"


    // $ANTLR start "rule__ForeignKey__RefColumnsAssignment_10_1"
    // InternalSQL.g:1479:1: rule__ForeignKey__RefColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RefColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1483:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1484:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1484:2: ( ( RULE_ID ) )
            // InternalSQL.g:1485:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnsColumnCrossReference_10_1_0()); 
            // InternalSQL.g:1486:3: ( RULE_ID )
            // InternalSQL.g:1487:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnsColumnIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRefColumnsColumnIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getRefColumnsColumnCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__ForeignKey__RefColumnsAssignment_10_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});

}