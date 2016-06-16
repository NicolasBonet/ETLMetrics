package org.uniandes.xtext.ide.contentassist.antlr.internal;

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
import org.uniandes.xtext.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_CTABLE", "RULE_LPARENT", "RULE_RPARENT", "RULE_COMMA", "RULE_NUMBER", "RULE_PRIMARY", "RULE_KEY", "RULE_FOREIGN", "RULE_REFERENCES", "RULE_ID", "RULE_NOT_NULL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar'", "'int'", "'boolean'", "'date'", "'number'"
    };
    public static final int RULE_CTABLE=5;
    public static final int RULE_KEY=11;
    public static final int RULE_STRING=17;
    public static final int RULE_LPARENT=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CREATE=4;
    public static final int RULE_RPARENT=7;
    public static final int EOF=-1;
    public static final int RULE_NOT_NULL=15;
    public static final int RULE_REFERENCES=13;
    public static final int RULE_ID=14;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_NUMBER=9;
    public static final int RULE_PRIMARY=10;
    public static final int T__26=26;
    public static final int RULE_INT=16;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FOREIGN=12;

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



    // $ANTLR start "entryRuleDataBase"
    // InternalSQL.g:53:1: entryRuleDataBase : ruleDataBase EOF ;
    public final void entryRuleDataBase() throws RecognitionException {
        try {
            // InternalSQL.g:54:1: ( ruleDataBase EOF )
            // InternalSQL.g:55:1: ruleDataBase EOF
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
    // InternalSQL.g:62:1: ruleDataBase : ( ( rule__DataBase__Group__0 ) ) ;
    public final void ruleDataBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:66:2: ( ( ( rule__DataBase__Group__0 ) ) )
            // InternalSQL.g:67:2: ( ( rule__DataBase__Group__0 ) )
            {
            // InternalSQL.g:67:2: ( ( rule__DataBase__Group__0 ) )
            // InternalSQL.g:68:3: ( rule__DataBase__Group__0 )
            {
             before(grammarAccess.getDataBaseAccess().getGroup()); 
            // InternalSQL.g:69:3: ( rule__DataBase__Group__0 )
            // InternalSQL.g:69:4: rule__DataBase__Group__0
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


    // $ANTLR start "ruleDataType"
    // InternalSQL.g:178:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:182:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSQL.g:183:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSQL.g:183:2: ( ( rule__DataType__Alternatives ) )
            // InternalSQL.g:184:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSQL.g:185:3: ( rule__DataType__Alternatives )
            // InternalSQL.g:185:4: rule__DataType__Alternatives
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSQL.g:193:1: rule__DataType__Alternatives : ( ( ( 'varchar' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) | ( ( 'number' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:197:1: ( ( ( 'varchar' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) | ( ( 'number' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSQL.g:198:2: ( ( 'varchar' ) )
                    {
                    // InternalSQL.g:198:2: ( ( 'varchar' ) )
                    // InternalSQL.g:199:3: ( 'varchar' )
                    {
                     before(grammarAccess.getDataTypeAccess().getVarcharEnumLiteralDeclaration_0()); 
                    // InternalSQL.g:200:3: ( 'varchar' )
                    // InternalSQL.g:200:4: 'varchar'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getVarcharEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:204:2: ( ( 'int' ) )
                    {
                    // InternalSQL.g:204:2: ( ( 'int' ) )
                    // InternalSQL.g:205:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSQL.g:206:3: ( 'int' )
                    // InternalSQL.g:206:4: 'int'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:210:2: ( ( 'boolean' ) )
                    {
                    // InternalSQL.g:210:2: ( ( 'boolean' ) )
                    // InternalSQL.g:211:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalSQL.g:212:3: ( 'boolean' )
                    // InternalSQL.g:212:4: 'boolean'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:216:2: ( ( 'date' ) )
                    {
                    // InternalSQL.g:216:2: ( ( 'date' ) )
                    // InternalSQL.g:217:3: ( 'date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalSQL.g:218:3: ( 'date' )
                    // InternalSQL.g:218:4: 'date'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:222:2: ( ( 'number' ) )
                    {
                    // InternalSQL.g:222:2: ( ( 'number' ) )
                    // InternalSQL.g:223:3: ( 'number' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNumberEnumLiteralDeclaration_4()); 
                    // InternalSQL.g:224:3: ( 'number' )
                    // InternalSQL.g:224:4: 'number'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNumberEnumLiteralDeclaration_4()); 

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


    // $ANTLR start "rule__DataBase__Group__0"
    // InternalSQL.g:232:1: rule__DataBase__Group__0 : rule__DataBase__Group__0__Impl rule__DataBase__Group__1 ;
    public final void rule__DataBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:236:1: ( rule__DataBase__Group__0__Impl rule__DataBase__Group__1 )
            // InternalSQL.g:237:2: rule__DataBase__Group__0__Impl rule__DataBase__Group__1
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
    // InternalSQL.g:244:1: rule__DataBase__Group__0__Impl : ( () ) ;
    public final void rule__DataBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:248:1: ( ( () ) )
            // InternalSQL.g:249:1: ( () )
            {
            // InternalSQL.g:249:1: ( () )
            // InternalSQL.g:250:2: ()
            {
             before(grammarAccess.getDataBaseAccess().getDataBaseAction_0()); 
            // InternalSQL.g:251:2: ()
            // InternalSQL.g:251:3: 
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
    // InternalSQL.g:259:1: rule__DataBase__Group__1 : rule__DataBase__Group__1__Impl ;
    public final void rule__DataBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:263:1: ( rule__DataBase__Group__1__Impl )
            // InternalSQL.g:264:2: rule__DataBase__Group__1__Impl
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
    // InternalSQL.g:270:1: rule__DataBase__Group__1__Impl : ( ( ( rule__DataBase__TableAssignment_1 ) ) ( ( rule__DataBase__TableAssignment_1 )* ) ) ;
    public final void rule__DataBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:274:1: ( ( ( ( rule__DataBase__TableAssignment_1 ) ) ( ( rule__DataBase__TableAssignment_1 )* ) ) )
            // InternalSQL.g:275:1: ( ( ( rule__DataBase__TableAssignment_1 ) ) ( ( rule__DataBase__TableAssignment_1 )* ) )
            {
            // InternalSQL.g:275:1: ( ( ( rule__DataBase__TableAssignment_1 ) ) ( ( rule__DataBase__TableAssignment_1 )* ) )
            // InternalSQL.g:276:2: ( ( rule__DataBase__TableAssignment_1 ) ) ( ( rule__DataBase__TableAssignment_1 )* )
            {
            // InternalSQL.g:276:2: ( ( rule__DataBase__TableAssignment_1 ) )
            // InternalSQL.g:277:3: ( rule__DataBase__TableAssignment_1 )
            {
             before(grammarAccess.getDataBaseAccess().getTableAssignment_1()); 
            // InternalSQL.g:278:3: ( rule__DataBase__TableAssignment_1 )
            // InternalSQL.g:278:4: rule__DataBase__TableAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__DataBase__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataBaseAccess().getTableAssignment_1()); 

            }

            // InternalSQL.g:281:2: ( ( rule__DataBase__TableAssignment_1 )* )
            // InternalSQL.g:282:3: ( rule__DataBase__TableAssignment_1 )*
            {
             before(grammarAccess.getDataBaseAccess().getTableAssignment_1()); 
            // InternalSQL.g:283:3: ( rule__DataBase__TableAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_CREATE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSQL.g:283:4: rule__DataBase__TableAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataBase__TableAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDataBaseAccess().getTableAssignment_1()); 

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
    // InternalSQL.g:293:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:297:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSQL.g:298:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSQL.g:305:1: rule__Table__Group__0__Impl : ( RULE_CREATE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:309:1: ( ( RULE_CREATE ) )
            // InternalSQL.g:310:1: ( RULE_CREATE )
            {
            // InternalSQL.g:310:1: ( RULE_CREATE )
            // InternalSQL.g:311:2: RULE_CREATE
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
    // InternalSQL.g:320:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:324:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSQL.g:325:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSQL.g:332:1: rule__Table__Group__1__Impl : ( RULE_CTABLE ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:336:1: ( ( RULE_CTABLE ) )
            // InternalSQL.g:337:1: ( RULE_CTABLE )
            {
            // InternalSQL.g:337:1: ( RULE_CTABLE )
            // InternalSQL.g:338:2: RULE_CTABLE
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
    // InternalSQL.g:347:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:351:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSQL.g:352:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSQL.g:359:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:363:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalSQL.g:364:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalSQL.g:364:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalSQL.g:365:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalSQL.g:366:2: ( rule__Table__NameAssignment_2 )
            // InternalSQL.g:366:3: rule__Table__NameAssignment_2
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
    // InternalSQL.g:374:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:378:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSQL.g:379:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSQL.g:386:1: rule__Table__Group__3__Impl : ( RULE_LPARENT ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:390:1: ( ( RULE_LPARENT ) )
            // InternalSQL.g:391:1: ( RULE_LPARENT )
            {
            // InternalSQL.g:391:1: ( RULE_LPARENT )
            // InternalSQL.g:392:2: RULE_LPARENT
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
    // InternalSQL.g:401:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:405:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSQL.g:406:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSQL.g:413:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__ColumnAssignment_4 ) ) ( ( rule__Table__ColumnAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:417:1: ( ( ( ( rule__Table__ColumnAssignment_4 ) ) ( ( rule__Table__ColumnAssignment_4 )* ) ) )
            // InternalSQL.g:418:1: ( ( ( rule__Table__ColumnAssignment_4 ) ) ( ( rule__Table__ColumnAssignment_4 )* ) )
            {
            // InternalSQL.g:418:1: ( ( ( rule__Table__ColumnAssignment_4 ) ) ( ( rule__Table__ColumnAssignment_4 )* ) )
            // InternalSQL.g:419:2: ( ( rule__Table__ColumnAssignment_4 ) ) ( ( rule__Table__ColumnAssignment_4 )* )
            {
            // InternalSQL.g:419:2: ( ( rule__Table__ColumnAssignment_4 ) )
            // InternalSQL.g:420:3: ( rule__Table__ColumnAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getColumnAssignment_4()); 
            // InternalSQL.g:421:3: ( rule__Table__ColumnAssignment_4 )
            // InternalSQL.g:421:4: rule__Table__ColumnAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Table__ColumnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnAssignment_4()); 

            }

            // InternalSQL.g:424:2: ( ( rule__Table__ColumnAssignment_4 )* )
            // InternalSQL.g:425:3: ( rule__Table__ColumnAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getColumnAssignment_4()); 
            // InternalSQL.g:426:3: ( rule__Table__ColumnAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSQL.g:426:4: rule__Table__ColumnAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__ColumnAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getColumnAssignment_4()); 

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
    // InternalSQL.g:435:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:439:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSQL.g:440:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalSQL.g:447:1: rule__Table__Group__5__Impl : ( ( rule__Table__PrimarykeyAssignment_5 ) ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:451:1: ( ( ( rule__Table__PrimarykeyAssignment_5 ) ) )
            // InternalSQL.g:452:1: ( ( rule__Table__PrimarykeyAssignment_5 ) )
            {
            // InternalSQL.g:452:1: ( ( rule__Table__PrimarykeyAssignment_5 ) )
            // InternalSQL.g:453:2: ( rule__Table__PrimarykeyAssignment_5 )
            {
             before(grammarAccess.getTableAccess().getPrimarykeyAssignment_5()); 
            // InternalSQL.g:454:2: ( rule__Table__PrimarykeyAssignment_5 )
            // InternalSQL.g:454:3: rule__Table__PrimarykeyAssignment_5
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
    // InternalSQL.g:462:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:466:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalSQL.g:467:2: rule__Table__Group__6__Impl rule__Table__Group__7
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
    // InternalSQL.g:474:1: rule__Table__Group__6__Impl : ( ( rule__Table__ForeignkeyAssignment_6 )* ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:478:1: ( ( ( rule__Table__ForeignkeyAssignment_6 )* ) )
            // InternalSQL.g:479:1: ( ( rule__Table__ForeignkeyAssignment_6 )* )
            {
            // InternalSQL.g:479:1: ( ( rule__Table__ForeignkeyAssignment_6 )* )
            // InternalSQL.g:480:2: ( rule__Table__ForeignkeyAssignment_6 )*
            {
             before(grammarAccess.getTableAccess().getForeignkeyAssignment_6()); 
            // InternalSQL.g:481:2: ( rule__Table__ForeignkeyAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_FOREIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSQL.g:481:3: rule__Table__ForeignkeyAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Table__ForeignkeyAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getForeignkeyAssignment_6()); 

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
    // InternalSQL.g:489:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:493:1: ( rule__Table__Group__7__Impl )
            // InternalSQL.g:494:2: rule__Table__Group__7__Impl
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
    // InternalSQL.g:500:1: rule__Table__Group__7__Impl : ( RULE_RPARENT ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:504:1: ( ( RULE_RPARENT ) )
            // InternalSQL.g:505:1: ( RULE_RPARENT )
            {
            // InternalSQL.g:505:1: ( RULE_RPARENT )
            // InternalSQL.g:506:2: RULE_RPARENT
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


    // $ANTLR start "rule__Column__Group__0"
    // InternalSQL.g:516:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:520:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSQL.g:521:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSQL.g:528:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:532:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalSQL.g:533:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalSQL.g:533:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalSQL.g:534:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalSQL.g:535:2: ( rule__Column__NameAssignment_0 )
            // InternalSQL.g:535:3: rule__Column__NameAssignment_0
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
    // InternalSQL.g:543:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:547:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalSQL.g:548:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSQL.g:555:1: rule__Column__Group__1__Impl : ( ( rule__Column__Group_1__0 )? ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:559:1: ( ( ( rule__Column__Group_1__0 )? ) )
            // InternalSQL.g:560:1: ( ( rule__Column__Group_1__0 )? )
            {
            // InternalSQL.g:560:1: ( ( rule__Column__Group_1__0 )? )
            // InternalSQL.g:561:2: ( rule__Column__Group_1__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_1()); 
            // InternalSQL.g:562:2: ( rule__Column__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=22 && LA5_0<=26)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:562:3: rule__Column__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_1()); 

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
    // InternalSQL.g:570:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:574:1: ( rule__Column__Group__2__Impl )
            // InternalSQL.g:575:2: rule__Column__Group__2__Impl
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
    // InternalSQL.g:581:1: rule__Column__Group__2__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:585:1: ( ( ( RULE_COMMA )? ) )
            // InternalSQL.g:586:1: ( ( RULE_COMMA )? )
            {
            // InternalSQL.g:586:1: ( ( RULE_COMMA )? )
            // InternalSQL.g:587:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_2()); 
            // InternalSQL.g:588:2: ( RULE_COMMA )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQL.g:588:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_2()); 

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


    // $ANTLR start "rule__Column__Group_1__0"
    // InternalSQL.g:597:1: rule__Column__Group_1__0 : rule__Column__Group_1__0__Impl rule__Column__Group_1__1 ;
    public final void rule__Column__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:601:1: ( rule__Column__Group_1__0__Impl rule__Column__Group_1__1 )
            // InternalSQL.g:602:2: rule__Column__Group_1__0__Impl rule__Column__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_1__1();

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
    // $ANTLR end "rule__Column__Group_1__0"


    // $ANTLR start "rule__Column__Group_1__0__Impl"
    // InternalSQL.g:609:1: rule__Column__Group_1__0__Impl : ( ( rule__Column__TypeAssignment_1_0 ) ) ;
    public final void rule__Column__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:613:1: ( ( ( rule__Column__TypeAssignment_1_0 ) ) )
            // InternalSQL.g:614:1: ( ( rule__Column__TypeAssignment_1_0 ) )
            {
            // InternalSQL.g:614:1: ( ( rule__Column__TypeAssignment_1_0 ) )
            // InternalSQL.g:615:2: ( rule__Column__TypeAssignment_1_0 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_1_0()); 
            // InternalSQL.g:616:2: ( rule__Column__TypeAssignment_1_0 )
            // InternalSQL.g:616:3: rule__Column__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_1_0()); 

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
    // $ANTLR end "rule__Column__Group_1__0__Impl"


    // $ANTLR start "rule__Column__Group_1__1"
    // InternalSQL.g:624:1: rule__Column__Group_1__1 : rule__Column__Group_1__1__Impl rule__Column__Group_1__2 ;
    public final void rule__Column__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:628:1: ( rule__Column__Group_1__1__Impl rule__Column__Group_1__2 )
            // InternalSQL.g:629:2: rule__Column__Group_1__1__Impl rule__Column__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_1__2();

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
    // $ANTLR end "rule__Column__Group_1__1"


    // $ANTLR start "rule__Column__Group_1__1__Impl"
    // InternalSQL.g:636:1: rule__Column__Group_1__1__Impl : ( ( rule__Column__Group_1_1__0 )? ) ;
    public final void rule__Column__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:640:1: ( ( ( rule__Column__Group_1_1__0 )? ) )
            // InternalSQL.g:641:1: ( ( rule__Column__Group_1_1__0 )? )
            {
            // InternalSQL.g:641:1: ( ( rule__Column__Group_1_1__0 )? )
            // InternalSQL.g:642:2: ( rule__Column__Group_1_1__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_1_1()); 
            // InternalSQL.g:643:2: ( rule__Column__Group_1_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LPARENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:643:3: rule__Column__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Column__Group_1__1__Impl"


    // $ANTLR start "rule__Column__Group_1__2"
    // InternalSQL.g:651:1: rule__Column__Group_1__2 : rule__Column__Group_1__2__Impl ;
    public final void rule__Column__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:655:1: ( rule__Column__Group_1__2__Impl )
            // InternalSQL.g:656:2: rule__Column__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_1__2__Impl();

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
    // $ANTLR end "rule__Column__Group_1__2"


    // $ANTLR start "rule__Column__Group_1__2__Impl"
    // InternalSQL.g:662:1: rule__Column__Group_1__2__Impl : ( ( rule__Column__IsNullAssignment_1_2 )? ) ;
    public final void rule__Column__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:666:1: ( ( ( rule__Column__IsNullAssignment_1_2 )? ) )
            // InternalSQL.g:667:1: ( ( rule__Column__IsNullAssignment_1_2 )? )
            {
            // InternalSQL.g:667:1: ( ( rule__Column__IsNullAssignment_1_2 )? )
            // InternalSQL.g:668:2: ( rule__Column__IsNullAssignment_1_2 )?
            {
             before(grammarAccess.getColumnAccess().getIsNullAssignment_1_2()); 
            // InternalSQL.g:669:2: ( rule__Column__IsNullAssignment_1_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NOT_NULL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQL.g:669:3: rule__Column__IsNullAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__IsNullAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getIsNullAssignment_1_2()); 

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
    // $ANTLR end "rule__Column__Group_1__2__Impl"


    // $ANTLR start "rule__Column__Group_1_1__0"
    // InternalSQL.g:678:1: rule__Column__Group_1_1__0 : rule__Column__Group_1_1__0__Impl rule__Column__Group_1_1__1 ;
    public final void rule__Column__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:682:1: ( rule__Column__Group_1_1__0__Impl rule__Column__Group_1_1__1 )
            // InternalSQL.g:683:2: rule__Column__Group_1_1__0__Impl rule__Column__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Column__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_1_1__1();

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
    // $ANTLR end "rule__Column__Group_1_1__0"


    // $ANTLR start "rule__Column__Group_1_1__0__Impl"
    // InternalSQL.g:690:1: rule__Column__Group_1_1__0__Impl : ( RULE_LPARENT ) ;
    public final void rule__Column__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:694:1: ( ( RULE_LPARENT ) )
            // InternalSQL.g:695:1: ( RULE_LPARENT )
            {
            // InternalSQL.g:695:1: ( RULE_LPARENT )
            // InternalSQL.g:696:2: RULE_LPARENT
            {
             before(grammarAccess.getColumnAccess().getLPARENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_LPARENT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLPARENTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Column__Group_1_1__0__Impl"


    // $ANTLR start "rule__Column__Group_1_1__1"
    // InternalSQL.g:705:1: rule__Column__Group_1_1__1 : rule__Column__Group_1_1__1__Impl rule__Column__Group_1_1__2 ;
    public final void rule__Column__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:709:1: ( rule__Column__Group_1_1__1__Impl rule__Column__Group_1_1__2 )
            // InternalSQL.g:710:2: rule__Column__Group_1_1__1__Impl rule__Column__Group_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Column__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_1_1__2();

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
    // $ANTLR end "rule__Column__Group_1_1__1"


    // $ANTLR start "rule__Column__Group_1_1__1__Impl"
    // InternalSQL.g:717:1: rule__Column__Group_1_1__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__Column__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:721:1: ( ( RULE_NUMBER ) )
            // InternalSQL.g:722:1: ( RULE_NUMBER )
            {
            // InternalSQL.g:722:1: ( RULE_NUMBER )
            // InternalSQL.g:723:2: RULE_NUMBER
            {
             before(grammarAccess.getColumnAccess().getNUMBERTerminalRuleCall_1_1_1()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNUMBERTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__Column__Group_1_1__1__Impl"


    // $ANTLR start "rule__Column__Group_1_1__2"
    // InternalSQL.g:732:1: rule__Column__Group_1_1__2 : rule__Column__Group_1_1__2__Impl ;
    public final void rule__Column__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:736:1: ( rule__Column__Group_1_1__2__Impl )
            // InternalSQL.g:737:2: rule__Column__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Column__Group_1_1__2"


    // $ANTLR start "rule__Column__Group_1_1__2__Impl"
    // InternalSQL.g:743:1: rule__Column__Group_1_1__2__Impl : ( RULE_RPARENT ) ;
    public final void rule__Column__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:747:1: ( ( RULE_RPARENT ) )
            // InternalSQL.g:748:1: ( RULE_RPARENT )
            {
            // InternalSQL.g:748:1: ( RULE_RPARENT )
            // InternalSQL.g:749:2: RULE_RPARENT
            {
             before(grammarAccess.getColumnAccess().getRPARENTTerminalRuleCall_1_1_2()); 
            match(input,RULE_RPARENT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRPARENTTerminalRuleCall_1_1_2()); 

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
    // $ANTLR end "rule__Column__Group_1_1__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalSQL.g:759:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:763:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSQL.g:764:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSQL.g:771:1: rule__PrimaryKey__Group__0__Impl : ( RULE_PRIMARY ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:775:1: ( ( RULE_PRIMARY ) )
            // InternalSQL.g:776:1: ( RULE_PRIMARY )
            {
            // InternalSQL.g:776:1: ( RULE_PRIMARY )
            // InternalSQL.g:777:2: RULE_PRIMARY
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
    // InternalSQL.g:786:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:790:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSQL.g:791:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
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
    // InternalSQL.g:798:1: rule__PrimaryKey__Group__1__Impl : ( RULE_KEY ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:802:1: ( ( RULE_KEY ) )
            // InternalSQL.g:803:1: ( RULE_KEY )
            {
            // InternalSQL.g:803:1: ( RULE_KEY )
            // InternalSQL.g:804:2: RULE_KEY
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
    // InternalSQL.g:813:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:817:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSQL.g:818:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
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
    // InternalSQL.g:825:1: rule__PrimaryKey__Group__2__Impl : ( RULE_LPARENT ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:829:1: ( ( RULE_LPARENT ) )
            // InternalSQL.g:830:1: ( RULE_LPARENT )
            {
            // InternalSQL.g:830:1: ( RULE_LPARENT )
            // InternalSQL.g:831:2: RULE_LPARENT
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
    // InternalSQL.g:840:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:844:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSQL.g:845:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:852:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:856:1: ( ( ( rule__PrimaryKey__ColumnAssignment_3 ) ) )
            // InternalSQL.g:857:1: ( ( rule__PrimaryKey__ColumnAssignment_3 ) )
            {
            // InternalSQL.g:857:1: ( ( rule__PrimaryKey__ColumnAssignment_3 ) )
            // InternalSQL.g:858:2: ( rule__PrimaryKey__ColumnAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAssignment_3()); 
            // InternalSQL.g:859:2: ( rule__PrimaryKey__ColumnAssignment_3 )
            // InternalSQL.g:859:3: rule__PrimaryKey__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAssignment_3()); 

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
    // InternalSQL.g:867:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:871:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSQL.g:872:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:879:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:883:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSQL.g:884:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSQL.g:884:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSQL.g:885:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSQL.g:886:2: ( rule__PrimaryKey__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSQL.g:886:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSQL.g:894:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6 ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:898:1: ( rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6 )
            // InternalSQL.g:899:2: rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalSQL.g:906:1: rule__PrimaryKey__Group__5__Impl : ( RULE_RPARENT ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:910:1: ( ( RULE_RPARENT ) )
            // InternalSQL.g:911:1: ( RULE_RPARENT )
            {
            // InternalSQL.g:911:1: ( RULE_RPARENT )
            // InternalSQL.g:912:2: RULE_RPARENT
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
    // InternalSQL.g:921:1: rule__PrimaryKey__Group__6 : rule__PrimaryKey__Group__6__Impl ;
    public final void rule__PrimaryKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:925:1: ( rule__PrimaryKey__Group__6__Impl )
            // InternalSQL.g:926:2: rule__PrimaryKey__Group__6__Impl
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
    // InternalSQL.g:932:1: rule__PrimaryKey__Group__6__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__PrimaryKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:936:1: ( ( ( RULE_COMMA )? ) )
            // InternalSQL.g:937:1: ( ( RULE_COMMA )? )
            {
            // InternalSQL.g:937:1: ( ( RULE_COMMA )? )
            // InternalSQL.g:938:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6()); 
            // InternalSQL.g:939:2: ( RULE_COMMA )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMA) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:939:3: RULE_COMMA
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
    // InternalSQL.g:948:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:952:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSQL.g:953:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
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
    // InternalSQL.g:960:1: rule__PrimaryKey__Group_4__0__Impl : ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:964:1: ( ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) )
            // InternalSQL.g:965:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            {
            // InternalSQL.g:965:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            // InternalSQL.g:966:2: ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* )
            {
            // InternalSQL.g:966:2: ( ( RULE_COMMA ) )
            // InternalSQL.g:967:3: ( RULE_COMMA )
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalSQL.g:968:3: ( RULE_COMMA )
            // InternalSQL.g:968:4: RULE_COMMA
            {
            match(input,RULE_COMMA,FOLLOW_18); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 

            }

            // InternalSQL.g:971:2: ( ( RULE_COMMA )* )
            // InternalSQL.g:972:3: ( RULE_COMMA )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalSQL.g:973:3: ( RULE_COMMA )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSQL.g:973:4: RULE_COMMA
            	    {
            	    match(input,RULE_COMMA,FOLLOW_18); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSQL.g:982:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:986:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSQL.g:987:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSQL.g:993:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:997:1: ( ( ( rule__PrimaryKey__ColumnAssignment_4_1 ) ) )
            // InternalSQL.g:998:1: ( ( rule__PrimaryKey__ColumnAssignment_4_1 ) )
            {
            // InternalSQL.g:998:1: ( ( rule__PrimaryKey__ColumnAssignment_4_1 ) )
            // InternalSQL.g:999:2: ( rule__PrimaryKey__ColumnAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAssignment_4_1()); 
            // InternalSQL.g:1000:2: ( rule__PrimaryKey__ColumnAssignment_4_1 )
            // InternalSQL.g:1000:3: rule__PrimaryKey__ColumnAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAssignment_4_1()); 

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
    // InternalSQL.g:1009:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1013:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSQL.g:1014:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSQL.g:1021:1: rule__ForeignKey__Group__0__Impl : ( RULE_FOREIGN ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1025:1: ( ( RULE_FOREIGN ) )
            // InternalSQL.g:1026:1: ( RULE_FOREIGN )
            {
            // InternalSQL.g:1026:1: ( RULE_FOREIGN )
            // InternalSQL.g:1027:2: RULE_FOREIGN
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
    // InternalSQL.g:1036:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1040:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSQL.g:1041:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
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
    // InternalSQL.g:1048:1: rule__ForeignKey__Group__1__Impl : ( RULE_KEY ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1052:1: ( ( RULE_KEY ) )
            // InternalSQL.g:1053:1: ( RULE_KEY )
            {
            // InternalSQL.g:1053:1: ( RULE_KEY )
            // InternalSQL.g:1054:2: RULE_KEY
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
    // InternalSQL.g:1063:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1067:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSQL.g:1068:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
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
    // InternalSQL.g:1075:1: rule__ForeignKey__Group__2__Impl : ( RULE_LPARENT ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1079:1: ( ( RULE_LPARENT ) )
            // InternalSQL.g:1080:1: ( RULE_LPARENT )
            {
            // InternalSQL.g:1080:1: ( RULE_LPARENT )
            // InternalSQL.g:1081:2: RULE_LPARENT
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
    // InternalSQL.g:1090:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1094:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSQL.g:1095:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:1102:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1106:1: ( ( ( rule__ForeignKey__ColumnAssignment_3 ) ) )
            // InternalSQL.g:1107:1: ( ( rule__ForeignKey__ColumnAssignment_3 ) )
            {
            // InternalSQL.g:1107:1: ( ( rule__ForeignKey__ColumnAssignment_3 ) )
            // InternalSQL.g:1108:2: ( rule__ForeignKey__ColumnAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAssignment_3()); 
            // InternalSQL.g:1109:2: ( rule__ForeignKey__ColumnAssignment_3 )
            // InternalSQL.g:1109:3: rule__ForeignKey__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnAssignment_3()); 

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
    // InternalSQL.g:1117:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1121:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSQL.g:1122:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:1129:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1133:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSQL.g:1134:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSQL.g:1134:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSQL.g:1135:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSQL.g:1136:2: ( rule__ForeignKey__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSQL.g:1136:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSQL.g:1144:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1148:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSQL.g:1149:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalSQL.g:1156:1: rule__ForeignKey__Group__5__Impl : ( RULE_RPARENT ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1160:1: ( ( RULE_RPARENT ) )
            // InternalSQL.g:1161:1: ( RULE_RPARENT )
            {
            // InternalSQL.g:1161:1: ( RULE_RPARENT )
            // InternalSQL.g:1162:2: RULE_RPARENT
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
    // InternalSQL.g:1171:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1175:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSQL.g:1176:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
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
    // InternalSQL.g:1183:1: rule__ForeignKey__Group__6__Impl : ( RULE_REFERENCES ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1187:1: ( ( RULE_REFERENCES ) )
            // InternalSQL.g:1188:1: ( RULE_REFERENCES )
            {
            // InternalSQL.g:1188:1: ( RULE_REFERENCES )
            // InternalSQL.g:1189:2: RULE_REFERENCES
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
    // InternalSQL.g:1198:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1202:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSQL.g:1203:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
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
    // InternalSQL.g:1210:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__TableRefAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1214:1: ( ( ( rule__ForeignKey__TableRefAssignment_7 ) ) )
            // InternalSQL.g:1215:1: ( ( rule__ForeignKey__TableRefAssignment_7 ) )
            {
            // InternalSQL.g:1215:1: ( ( rule__ForeignKey__TableRefAssignment_7 ) )
            // InternalSQL.g:1216:2: ( rule__ForeignKey__TableRefAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getTableRefAssignment_7()); 
            // InternalSQL.g:1217:2: ( rule__ForeignKey__TableRefAssignment_7 )
            // InternalSQL.g:1217:3: rule__ForeignKey__TableRefAssignment_7
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
    // InternalSQL.g:1225:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1229:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSQL.g:1230:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
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
    // InternalSQL.g:1237:1: rule__ForeignKey__Group__8__Impl : ( RULE_LPARENT ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1241:1: ( ( RULE_LPARENT ) )
            // InternalSQL.g:1242:1: ( RULE_LPARENT )
            {
            // InternalSQL.g:1242:1: ( RULE_LPARENT )
            // InternalSQL.g:1243:2: RULE_LPARENT
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
    // InternalSQL.g:1252:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1256:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSQL.g:1257:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:1264:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1268:1: ( ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) ) )
            // InternalSQL.g:1269:1: ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) )
            {
            // InternalSQL.g:1269:1: ( ( rule__ForeignKey__ColumnsRefAssignment_9 ) )
            // InternalSQL.g:1270:2: ( rule__ForeignKey__ColumnsRefAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_9()); 
            // InternalSQL.g:1271:2: ( rule__ForeignKey__ColumnsRefAssignment_9 )
            // InternalSQL.g:1271:3: rule__ForeignKey__ColumnsRefAssignment_9
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
    // InternalSQL.g:1279:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1283:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSQL.g:1284:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:1291:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1295:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSQL.g:1296:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSQL.g:1296:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSQL.g:1297:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSQL.g:1298:2: ( rule__ForeignKey__Group_10__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSQL.g:1298:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSQL.g:1306:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12 ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1310:1: ( rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12 )
            // InternalSQL.g:1311:2: rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12
            {
            pushFollow(FOLLOW_19);
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
    // InternalSQL.g:1318:1: rule__ForeignKey__Group__11__Impl : ( RULE_RPARENT ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1322:1: ( ( RULE_RPARENT ) )
            // InternalSQL.g:1323:1: ( RULE_RPARENT )
            {
            // InternalSQL.g:1323:1: ( RULE_RPARENT )
            // InternalSQL.g:1324:2: RULE_RPARENT
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
    // InternalSQL.g:1333:1: rule__ForeignKey__Group__12 : rule__ForeignKey__Group__12__Impl ;
    public final void rule__ForeignKey__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1337:1: ( rule__ForeignKey__Group__12__Impl )
            // InternalSQL.g:1338:2: rule__ForeignKey__Group__12__Impl
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
    // InternalSQL.g:1344:1: rule__ForeignKey__Group__12__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__ForeignKey__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1348:1: ( ( ( RULE_COMMA )? ) )
            // InternalSQL.g:1349:1: ( ( RULE_COMMA )? )
            {
            // InternalSQL.g:1349:1: ( ( RULE_COMMA )? )
            // InternalSQL.g:1350:2: ( RULE_COMMA )?
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12()); 
            // InternalSQL.g:1351:2: ( RULE_COMMA )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMA) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSQL.g:1351:3: RULE_COMMA
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
    // InternalSQL.g:1360:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1364:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSQL.g:1365:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
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
    // InternalSQL.g:1372:1: rule__ForeignKey__Group_4__0__Impl : ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1376:1: ( ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) )
            // InternalSQL.g:1377:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            {
            // InternalSQL.g:1377:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            // InternalSQL.g:1378:2: ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* )
            {
            // InternalSQL.g:1378:2: ( ( RULE_COMMA ) )
            // InternalSQL.g:1379:3: ( RULE_COMMA )
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalSQL.g:1380:3: ( RULE_COMMA )
            // InternalSQL.g:1380:4: RULE_COMMA
            {
            match(input,RULE_COMMA,FOLLOW_18); 

            }

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 

            }

            // InternalSQL.g:1383:2: ( ( RULE_COMMA )* )
            // InternalSQL.g:1384:3: ( RULE_COMMA )*
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0()); 
            // InternalSQL.g:1385:3: ( RULE_COMMA )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSQL.g:1385:4: RULE_COMMA
            	    {
            	    match(input,RULE_COMMA,FOLLOW_18); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSQL.g:1394:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1398:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSQL.g:1399:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalSQL.g:1405:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1409:1: ( ( ( rule__ForeignKey__ColumnAssignment_4_1 ) ) )
            // InternalSQL.g:1410:1: ( ( rule__ForeignKey__ColumnAssignment_4_1 ) )
            {
            // InternalSQL.g:1410:1: ( ( rule__ForeignKey__ColumnAssignment_4_1 ) )
            // InternalSQL.g:1411:2: ( rule__ForeignKey__ColumnAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAssignment_4_1()); 
            // InternalSQL.g:1412:2: ( rule__ForeignKey__ColumnAssignment_4_1 )
            // InternalSQL.g:1412:3: rule__ForeignKey__ColumnAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnAssignment_4_1()); 

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
    // InternalSQL.g:1421:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1425:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSQL.g:1426:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
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
    // InternalSQL.g:1433:1: rule__ForeignKey__Group_10__0__Impl : ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1437:1: ( ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) ) )
            // InternalSQL.g:1438:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            {
            // InternalSQL.g:1438:1: ( ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* ) )
            // InternalSQL.g:1439:2: ( ( RULE_COMMA ) ) ( ( RULE_COMMA )* )
            {
            // InternalSQL.g:1439:2: ( ( RULE_COMMA ) )
            // InternalSQL.g:1440:3: ( RULE_COMMA )
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 
            // InternalSQL.g:1441:3: ( RULE_COMMA )
            // InternalSQL.g:1441:4: RULE_COMMA
            {
            match(input,RULE_COMMA,FOLLOW_18); 

            }

             after(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 

            }

            // InternalSQL.g:1444:2: ( ( RULE_COMMA )* )
            // InternalSQL.g:1445:3: ( RULE_COMMA )*
            {
             before(grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0()); 
            // InternalSQL.g:1446:3: ( RULE_COMMA )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSQL.g:1446:4: RULE_COMMA
            	    {
            	    match(input,RULE_COMMA,FOLLOW_18); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSQL.g:1455:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1459:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSQL.g:1460:2: rule__ForeignKey__Group_10__1__Impl
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
    // InternalSQL.g:1466:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1470:1: ( ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) ) )
            // InternalSQL.g:1471:1: ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) )
            {
            // InternalSQL.g:1471:1: ( ( rule__ForeignKey__ColumnsRefAssignment_10_1 ) )
            // InternalSQL.g:1472:2: ( rule__ForeignKey__ColumnsRefAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefAssignment_10_1()); 
            // InternalSQL.g:1473:2: ( rule__ForeignKey__ColumnsRefAssignment_10_1 )
            // InternalSQL.g:1473:3: rule__ForeignKey__ColumnsRefAssignment_10_1
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


    // $ANTLR start "rule__DataBase__TableAssignment_1"
    // InternalSQL.g:1482:1: rule__DataBase__TableAssignment_1 : ( ruleTable ) ;
    public final void rule__DataBase__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1486:1: ( ( ruleTable ) )
            // InternalSQL.g:1487:2: ( ruleTable )
            {
            // InternalSQL.g:1487:2: ( ruleTable )
            // InternalSQL.g:1488:3: ruleTable
            {
             before(grammarAccess.getDataBaseAccess().getTableTableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDataBaseAccess().getTableTableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataBase__TableAssignment_1"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalSQL.g:1497:1: rule__Table__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1501:1: ( ( RULE_ID ) )
            // InternalSQL.g:1502:2: ( RULE_ID )
            {
            // InternalSQL.g:1502:2: ( RULE_ID )
            // InternalSQL.g:1503:3: RULE_ID
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


    // $ANTLR start "rule__Table__ColumnAssignment_4"
    // InternalSQL.g:1512:1: rule__Table__ColumnAssignment_4 : ( ruleColumn ) ;
    public final void rule__Table__ColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1516:1: ( ( ruleColumn ) )
            // InternalSQL.g:1517:2: ( ruleColumn )
            {
            // InternalSQL.g:1517:2: ( ruleColumn )
            // InternalSQL.g:1518:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Table__ColumnAssignment_4"


    // $ANTLR start "rule__Table__PrimarykeyAssignment_5"
    // InternalSQL.g:1527:1: rule__Table__PrimarykeyAssignment_5 : ( rulePrimaryKey ) ;
    public final void rule__Table__PrimarykeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1531:1: ( ( rulePrimaryKey ) )
            // InternalSQL.g:1532:2: ( rulePrimaryKey )
            {
            // InternalSQL.g:1532:2: ( rulePrimaryKey )
            // InternalSQL.g:1533:3: rulePrimaryKey
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


    // $ANTLR start "rule__Table__ForeignkeyAssignment_6"
    // InternalSQL.g:1542:1: rule__Table__ForeignkeyAssignment_6 : ( ruleForeignKey ) ;
    public final void rule__Table__ForeignkeyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1546:1: ( ( ruleForeignKey ) )
            // InternalSQL.g:1547:2: ( ruleForeignKey )
            {
            // InternalSQL.g:1547:2: ( ruleForeignKey )
            // InternalSQL.g:1548:3: ruleForeignKey
            {
             before(grammarAccess.getTableAccess().getForeignkeyForeignKeyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getForeignkeyForeignKeyParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Table__ForeignkeyAssignment_6"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalSQL.g:1557:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1561:1: ( ( RULE_ID ) )
            // InternalSQL.g:1562:2: ( RULE_ID )
            {
            // InternalSQL.g:1562:2: ( RULE_ID )
            // InternalSQL.g:1563:3: RULE_ID
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


    // $ANTLR start "rule__Column__TypeAssignment_1_0"
    // InternalSQL.g:1572:1: rule__Column__TypeAssignment_1_0 : ( ruleDataType ) ;
    public final void rule__Column__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1576:1: ( ( ruleDataType ) )
            // InternalSQL.g:1577:2: ( ruleDataType )
            {
            // InternalSQL.g:1577:2: ( ruleDataType )
            // InternalSQL.g:1578:3: ruleDataType
            {
             before(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Column__TypeAssignment_1_0"


    // $ANTLR start "rule__Column__IsNullAssignment_1_2"
    // InternalSQL.g:1587:1: rule__Column__IsNullAssignment_1_2 : ( RULE_NOT_NULL ) ;
    public final void rule__Column__IsNullAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1591:1: ( ( RULE_NOT_NULL ) )
            // InternalSQL.g:1592:2: ( RULE_NOT_NULL )
            {
            // InternalSQL.g:1592:2: ( RULE_NOT_NULL )
            // InternalSQL.g:1593:3: RULE_NOT_NULL
            {
             before(grammarAccess.getColumnAccess().getIsNullNOT_NULLTerminalRuleCall_1_2_0()); 
            match(input,RULE_NOT_NULL,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getIsNullNOT_NULLTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Column__IsNullAssignment_1_2"


    // $ANTLR start "rule__PrimaryKey__ColumnAssignment_3"
    // InternalSQL.g:1602:1: rule__PrimaryKey__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1606:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1607:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1607:2: ( ( RULE_ID ) )
            // InternalSQL.g:1608:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnColumnCrossReference_3_0()); 
            // InternalSQL.g:1609:3: ( RULE_ID )
            // InternalSQL.g:1610:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnColumnCrossReference_3_0()); 

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
    // $ANTLR end "rule__PrimaryKey__ColumnAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColumnAssignment_4_1"
    // InternalSQL.g:1621:1: rule__PrimaryKey__ColumnAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1625:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1626:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1626:2: ( ( RULE_ID ) )
            // InternalSQL.g:1627:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnColumnCrossReference_4_1_0()); 
            // InternalSQL.g:1628:3: ( RULE_ID )
            // InternalSQL.g:1629:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnColumnCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__PrimaryKey__ColumnAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__ColumnAssignment_3"
    // InternalSQL.g:1640:1: rule__ForeignKey__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1644:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1645:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1645:2: ( ( RULE_ID ) )
            // InternalSQL.g:1646:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnColumnCrossReference_3_0()); 
            // InternalSQL.g:1647:3: ( RULE_ID )
            // InternalSQL.g:1648:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnColumnIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnColumnIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnColumnCrossReference_3_0()); 

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
    // $ANTLR end "rule__ForeignKey__ColumnAssignment_3"


    // $ANTLR start "rule__ForeignKey__ColumnAssignment_4_1"
    // InternalSQL.g:1659:1: rule__ForeignKey__ColumnAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1663:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1664:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1664:2: ( ( RULE_ID ) )
            // InternalSQL.g:1665:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnColumnCrossReference_4_1_0()); 
            // InternalSQL.g:1666:3: ( RULE_ID )
            // InternalSQL.g:1667:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnColumnIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnColumnIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnColumnCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__ForeignKey__ColumnAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__TableRefAssignment_7"
    // InternalSQL.g:1678:1: rule__ForeignKey__TableRefAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__TableRefAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1682:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1683:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1683:2: ( ( RULE_ID ) )
            // InternalSQL.g:1684:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getTableRefTableCrossReference_7_0()); 
            // InternalSQL.g:1685:3: ( RULE_ID )
            // InternalSQL.g:1686:4: RULE_ID
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
    // InternalSQL.g:1697:1: rule__ForeignKey__ColumnsRefAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsRefAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1701:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1702:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1702:2: ( ( RULE_ID ) )
            // InternalSQL.g:1703:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0()); 
            // InternalSQL.g:1704:3: ( RULE_ID )
            // InternalSQL.g:1705:4: RULE_ID
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
    // InternalSQL.g:1716:1: rule__ForeignKey__ColumnsRefAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnsRefAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1720:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1721:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1721:2: ( ( RULE_ID ) )
            // InternalSQL.g:1722:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_10_1_0()); 
            // InternalSQL.g:1723:3: ( RULE_ID )
            // InternalSQL.g:1724:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007C00100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});

}