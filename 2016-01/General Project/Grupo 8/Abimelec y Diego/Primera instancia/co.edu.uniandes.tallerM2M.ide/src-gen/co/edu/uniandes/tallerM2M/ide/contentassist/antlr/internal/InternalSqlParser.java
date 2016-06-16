package co.edu.uniandes.tallerM2M.ide.contentassist.antlr.internal;

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
import co.edu.uniandes.tallerM2M.services.SqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VVARCHAR", "RULE_VINT", "RULE_VVARCHAR255", "RULE_TCREATE", "RULE_TTABLE", "RULE_PARENTESISA", "RULE_PARENTESISB", "RULE_COMA", "RULE_TPRIMARY", "RULE_TKEY", "RULE_TFOREIGN", "RULE_TREFERENCES", "RULE_ID", "RULE_TCOLUMNAS", "RULE_TNOT", "RULE_TNULL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "' NOT NULL'"
    };
    public static final int RULE_COMA=11;
    public static final int RULE_TPRIMARY=12;
    public static final int RULE_TCOLUMNAS=17;
    public static final int RULE_STRING=21;
    public static final int RULE_SL_COMMENT=23;
    public static final int RULE_TFOREIGN=14;
    public static final int RULE_TTABLE=8;
    public static final int EOF=-1;
    public static final int RULE_TNULL=19;
    public static final int RULE_TCREATE=7;
    public static final int RULE_ID=16;
    public static final int RULE_WS=24;
    public static final int RULE_TKEY=13;
    public static final int RULE_VVARCHAR255=6;
    public static final int RULE_TNOT=18;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_PARENTESISA=9;
    public static final int RULE_PARENTESISB=10;
    public static final int RULE_TREFERENCES=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_VINT=5;
    public static final int RULE_INT=20;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_VVARCHAR=4;

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



    // $ANTLR start "entryRuleDatabase"
    // InternalSql.g:53:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSql.g:54:1: ( ruleDatabase EOF )
            // InternalSql.g:55:1: ruleDatabase EOF
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
    // InternalSql.g:62:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:66:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalSql.g:67:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalSql.g:67:2: ( ( rule__Database__Group__0 ) )
            // InternalSql.g:68:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalSql.g:69:3: ( rule__Database__Group__0 )
            // InternalSql.g:69:4: rule__Database__Group__0
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


    // $ANTLR start "entryRuleTabla"
    // InternalSql.g:78:1: entryRuleTabla : ruleTabla EOF ;
    public final void entryRuleTabla() throws RecognitionException {
        try {
            // InternalSql.g:79:1: ( ruleTabla EOF )
            // InternalSql.g:80:1: ruleTabla EOF
            {
             before(grammarAccess.getTablaRule()); 
            pushFollow(FOLLOW_1);
            ruleTabla();

            state._fsp--;

             after(grammarAccess.getTablaRule()); 
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
    // $ANTLR end "entryRuleTabla"


    // $ANTLR start "ruleTabla"
    // InternalSql.g:87:1: ruleTabla : ( ( rule__Tabla__Group__0 ) ) ;
    public final void ruleTabla() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:91:2: ( ( ( rule__Tabla__Group__0 ) ) )
            // InternalSql.g:92:2: ( ( rule__Tabla__Group__0 ) )
            {
            // InternalSql.g:92:2: ( ( rule__Tabla__Group__0 ) )
            // InternalSql.g:93:3: ( rule__Tabla__Group__0 )
            {
             before(grammarAccess.getTablaAccess().getGroup()); 
            // InternalSql.g:94:3: ( rule__Tabla__Group__0 )
            // InternalSql.g:94:4: rule__Tabla__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tabla__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTablaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabla"


    // $ANTLR start "entryRuleColumna"
    // InternalSql.g:103:1: entryRuleColumna : ruleColumna EOF ;
    public final void entryRuleColumna() throws RecognitionException {
        try {
            // InternalSql.g:104:1: ( ruleColumna EOF )
            // InternalSql.g:105:1: ruleColumna EOF
            {
             before(grammarAccess.getColumnaRule()); 
            pushFollow(FOLLOW_1);
            ruleColumna();

            state._fsp--;

             after(grammarAccess.getColumnaRule()); 
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
    // $ANTLR end "entryRuleColumna"


    // $ANTLR start "ruleColumna"
    // InternalSql.g:112:1: ruleColumna : ( ( rule__Columna__Group__0 ) ) ;
    public final void ruleColumna() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:116:2: ( ( ( rule__Columna__Group__0 ) ) )
            // InternalSql.g:117:2: ( ( rule__Columna__Group__0 ) )
            {
            // InternalSql.g:117:2: ( ( rule__Columna__Group__0 ) )
            // InternalSql.g:118:3: ( rule__Columna__Group__0 )
            {
             before(grammarAccess.getColumnaAccess().getGroup()); 
            // InternalSql.g:119:3: ( rule__Columna__Group__0 )
            // InternalSql.g:119:4: rule__Columna__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Columna__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumna"


    // $ANTLR start "entryRulePrimary"
    // InternalSql.g:128:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSql.g:129:1: ( rulePrimary EOF )
            // InternalSql.g:130:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSql.g:137:1: rulePrimary : ( ( rule__Primary__Group__0 ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:141:2: ( ( ( rule__Primary__Group__0 ) ) )
            // InternalSql.g:142:2: ( ( rule__Primary__Group__0 ) )
            {
            // InternalSql.g:142:2: ( ( rule__Primary__Group__0 ) )
            // InternalSql.g:143:3: ( rule__Primary__Group__0 )
            {
             before(grammarAccess.getPrimaryAccess().getGroup()); 
            // InternalSql.g:144:3: ( rule__Primary__Group__0 )
            // InternalSql.g:144:4: rule__Primary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleForeingKey"
    // InternalSql.g:153:1: entryRuleForeingKey : ruleForeingKey EOF ;
    public final void entryRuleForeingKey() throws RecognitionException {
        try {
            // InternalSql.g:154:1: ( ruleForeingKey EOF )
            // InternalSql.g:155:1: ruleForeingKey EOF
            {
             before(grammarAccess.getForeingKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleForeingKey();

            state._fsp--;

             after(grammarAccess.getForeingKeyRule()); 
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
    // $ANTLR end "entryRuleForeingKey"


    // $ANTLR start "ruleForeingKey"
    // InternalSql.g:162:1: ruleForeingKey : ( ( rule__ForeingKey__Group__0 ) ) ;
    public final void ruleForeingKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:166:2: ( ( ( rule__ForeingKey__Group__0 ) ) )
            // InternalSql.g:167:2: ( ( rule__ForeingKey__Group__0 ) )
            {
            // InternalSql.g:167:2: ( ( rule__ForeingKey__Group__0 ) )
            // InternalSql.g:168:3: ( rule__ForeingKey__Group__0 )
            {
             before(grammarAccess.getForeingKeyAccess().getGroup()); 
            // InternalSql.g:169:3: ( rule__ForeingKey__Group__0 )
            // InternalSql.g:169:4: rule__ForeingKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForeingKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeingKey"


    // $ANTLR start "rule__Columna__TipoAlternatives_2_0"
    // InternalSql.g:177:1: rule__Columna__TipoAlternatives_2_0 : ( ( RULE_VVARCHAR ) | ( RULE_VINT ) | ( RULE_VVARCHAR255 ) );
    public final void rule__Columna__TipoAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:181:1: ( ( RULE_VVARCHAR ) | ( RULE_VINT ) | ( RULE_VVARCHAR255 ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_VVARCHAR:
                {
                alt1=1;
                }
                break;
            case RULE_VINT:
                {
                alt1=2;
                }
                break;
            case RULE_VVARCHAR255:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSql.g:182:2: ( RULE_VVARCHAR )
                    {
                    // InternalSql.g:182:2: ( RULE_VVARCHAR )
                    // InternalSql.g:183:3: RULE_VVARCHAR
                    {
                     before(grammarAccess.getColumnaAccess().getTipoVVARCHARTerminalRuleCall_2_0_0()); 
                    match(input,RULE_VVARCHAR,FOLLOW_2); 
                     after(grammarAccess.getColumnaAccess().getTipoVVARCHARTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:188:2: ( RULE_VINT )
                    {
                    // InternalSql.g:188:2: ( RULE_VINT )
                    // InternalSql.g:189:3: RULE_VINT
                    {
                     before(grammarAccess.getColumnaAccess().getTipoVINTTerminalRuleCall_2_0_1()); 
                    match(input,RULE_VINT,FOLLOW_2); 
                     after(grammarAccess.getColumnaAccess().getTipoVINTTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:194:2: ( RULE_VVARCHAR255 )
                    {
                    // InternalSql.g:194:2: ( RULE_VVARCHAR255 )
                    // InternalSql.g:195:3: RULE_VVARCHAR255
                    {
                     before(grammarAccess.getColumnaAccess().getTipoVVARCHAR255TerminalRuleCall_2_0_2()); 
                    match(input,RULE_VVARCHAR255,FOLLOW_2); 
                     after(grammarAccess.getColumnaAccess().getTipoVVARCHAR255TerminalRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__Columna__TipoAlternatives_2_0"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSql.g:204:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:208:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSql.g:209:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSql.g:216:1: rule__Database__Group__0__Impl : ( () ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:220:1: ( ( () ) )
            // InternalSql.g:221:1: ( () )
            {
            // InternalSql.g:221:1: ( () )
            // InternalSql.g:222:2: ()
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 
            // InternalSql.g:223:2: ()
            // InternalSql.g:223:3: 
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
    // InternalSql.g:231:1: rule__Database__Group__1 : rule__Database__Group__1__Impl ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:235:1: ( rule__Database__Group__1__Impl )
            // InternalSql.g:236:2: rule__Database__Group__1__Impl
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
    // InternalSql.g:242:1: rule__Database__Group__1__Impl : ( ( ( rule__Database__TablasAssignment_1 ) ) ( ( rule__Database__TablasAssignment_1 )* ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:246:1: ( ( ( ( rule__Database__TablasAssignment_1 ) ) ( ( rule__Database__TablasAssignment_1 )* ) ) )
            // InternalSql.g:247:1: ( ( ( rule__Database__TablasAssignment_1 ) ) ( ( rule__Database__TablasAssignment_1 )* ) )
            {
            // InternalSql.g:247:1: ( ( ( rule__Database__TablasAssignment_1 ) ) ( ( rule__Database__TablasAssignment_1 )* ) )
            // InternalSql.g:248:2: ( ( rule__Database__TablasAssignment_1 ) ) ( ( rule__Database__TablasAssignment_1 )* )
            {
            // InternalSql.g:248:2: ( ( rule__Database__TablasAssignment_1 ) )
            // InternalSql.g:249:3: ( rule__Database__TablasAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getTablasAssignment_1()); 
            // InternalSql.g:250:3: ( rule__Database__TablasAssignment_1 )
            // InternalSql.g:250:4: rule__Database__TablasAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Database__TablasAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getTablasAssignment_1()); 

            }

            // InternalSql.g:253:2: ( ( rule__Database__TablasAssignment_1 )* )
            // InternalSql.g:254:3: ( rule__Database__TablasAssignment_1 )*
            {
             before(grammarAccess.getDatabaseAccess().getTablasAssignment_1()); 
            // InternalSql.g:255:3: ( rule__Database__TablasAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_TCREATE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql.g:255:4: rule__Database__TablasAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Database__TablasAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTablasAssignment_1()); 

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
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Tabla__Group__0"
    // InternalSql.g:265:1: rule__Tabla__Group__0 : rule__Tabla__Group__0__Impl rule__Tabla__Group__1 ;
    public final void rule__Tabla__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:269:1: ( rule__Tabla__Group__0__Impl rule__Tabla__Group__1 )
            // InternalSql.g:270:2: rule__Tabla__Group__0__Impl rule__Tabla__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Tabla__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__1();

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
    // $ANTLR end "rule__Tabla__Group__0"


    // $ANTLR start "rule__Tabla__Group__0__Impl"
    // InternalSql.g:277:1: rule__Tabla__Group__0__Impl : ( RULE_TCREATE ) ;
    public final void rule__Tabla__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:281:1: ( ( RULE_TCREATE ) )
            // InternalSql.g:282:1: ( RULE_TCREATE )
            {
            // InternalSql.g:282:1: ( RULE_TCREATE )
            // InternalSql.g:283:2: RULE_TCREATE
            {
             before(grammarAccess.getTablaAccess().getTCREATETerminalRuleCall_0()); 
            match(input,RULE_TCREATE,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getTCREATETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__0__Impl"


    // $ANTLR start "rule__Tabla__Group__1"
    // InternalSql.g:292:1: rule__Tabla__Group__1 : rule__Tabla__Group__1__Impl rule__Tabla__Group__2 ;
    public final void rule__Tabla__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:296:1: ( rule__Tabla__Group__1__Impl rule__Tabla__Group__2 )
            // InternalSql.g:297:2: rule__Tabla__Group__1__Impl rule__Tabla__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Tabla__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__2();

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
    // $ANTLR end "rule__Tabla__Group__1"


    // $ANTLR start "rule__Tabla__Group__1__Impl"
    // InternalSql.g:304:1: rule__Tabla__Group__1__Impl : ( ' ' ) ;
    public final void rule__Tabla__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:308:1: ( ( ' ' ) )
            // InternalSql.g:309:1: ( ' ' )
            {
            // InternalSql.g:309:1: ( ' ' )
            // InternalSql.g:310:2: ' '
            {
             before(grammarAccess.getTablaAccess().getSpaceKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__1__Impl"


    // $ANTLR start "rule__Tabla__Group__2"
    // InternalSql.g:319:1: rule__Tabla__Group__2 : rule__Tabla__Group__2__Impl rule__Tabla__Group__3 ;
    public final void rule__Tabla__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:323:1: ( rule__Tabla__Group__2__Impl rule__Tabla__Group__3 )
            // InternalSql.g:324:2: rule__Tabla__Group__2__Impl rule__Tabla__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tabla__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__3();

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
    // $ANTLR end "rule__Tabla__Group__2"


    // $ANTLR start "rule__Tabla__Group__2__Impl"
    // InternalSql.g:331:1: rule__Tabla__Group__2__Impl : ( RULE_TTABLE ) ;
    public final void rule__Tabla__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:335:1: ( ( RULE_TTABLE ) )
            // InternalSql.g:336:1: ( RULE_TTABLE )
            {
            // InternalSql.g:336:1: ( RULE_TTABLE )
            // InternalSql.g:337:2: RULE_TTABLE
            {
             before(grammarAccess.getTablaAccess().getTTABLETerminalRuleCall_2()); 
            match(input,RULE_TTABLE,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getTTABLETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__2__Impl"


    // $ANTLR start "rule__Tabla__Group__3"
    // InternalSql.g:346:1: rule__Tabla__Group__3 : rule__Tabla__Group__3__Impl rule__Tabla__Group__4 ;
    public final void rule__Tabla__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:350:1: ( rule__Tabla__Group__3__Impl rule__Tabla__Group__4 )
            // InternalSql.g:351:2: rule__Tabla__Group__3__Impl rule__Tabla__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Tabla__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__4();

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
    // $ANTLR end "rule__Tabla__Group__3"


    // $ANTLR start "rule__Tabla__Group__3__Impl"
    // InternalSql.g:358:1: rule__Tabla__Group__3__Impl : ( ' ' ) ;
    public final void rule__Tabla__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:362:1: ( ( ' ' ) )
            // InternalSql.g:363:1: ( ' ' )
            {
            // InternalSql.g:363:1: ( ' ' )
            // InternalSql.g:364:2: ' '
            {
             before(grammarAccess.getTablaAccess().getSpaceKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getSpaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__3__Impl"


    // $ANTLR start "rule__Tabla__Group__4"
    // InternalSql.g:373:1: rule__Tabla__Group__4 : rule__Tabla__Group__4__Impl rule__Tabla__Group__5 ;
    public final void rule__Tabla__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:377:1: ( rule__Tabla__Group__4__Impl rule__Tabla__Group__5 )
            // InternalSql.g:378:2: rule__Tabla__Group__4__Impl rule__Tabla__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Tabla__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__5();

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
    // $ANTLR end "rule__Tabla__Group__4"


    // $ANTLR start "rule__Tabla__Group__4__Impl"
    // InternalSql.g:385:1: rule__Tabla__Group__4__Impl : ( ( rule__Tabla__NameAssignment_4 ) ) ;
    public final void rule__Tabla__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:389:1: ( ( ( rule__Tabla__NameAssignment_4 ) ) )
            // InternalSql.g:390:1: ( ( rule__Tabla__NameAssignment_4 ) )
            {
            // InternalSql.g:390:1: ( ( rule__Tabla__NameAssignment_4 ) )
            // InternalSql.g:391:2: ( rule__Tabla__NameAssignment_4 )
            {
             before(grammarAccess.getTablaAccess().getNameAssignment_4()); 
            // InternalSql.g:392:2: ( rule__Tabla__NameAssignment_4 )
            // InternalSql.g:392:3: rule__Tabla__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tabla__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTablaAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__4__Impl"


    // $ANTLR start "rule__Tabla__Group__5"
    // InternalSql.g:400:1: rule__Tabla__Group__5 : rule__Tabla__Group__5__Impl rule__Tabla__Group__6 ;
    public final void rule__Tabla__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:404:1: ( rule__Tabla__Group__5__Impl rule__Tabla__Group__6 )
            // InternalSql.g:405:2: rule__Tabla__Group__5__Impl rule__Tabla__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Tabla__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__6();

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
    // $ANTLR end "rule__Tabla__Group__5"


    // $ANTLR start "rule__Tabla__Group__5__Impl"
    // InternalSql.g:412:1: rule__Tabla__Group__5__Impl : ( RULE_PARENTESISA ) ;
    public final void rule__Tabla__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:416:1: ( ( RULE_PARENTESISA ) )
            // InternalSql.g:417:1: ( RULE_PARENTESISA )
            {
            // InternalSql.g:417:1: ( RULE_PARENTESISA )
            // InternalSql.g:418:2: RULE_PARENTESISA
            {
             before(grammarAccess.getTablaAccess().getPARENTESISATerminalRuleCall_5()); 
            match(input,RULE_PARENTESISA,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getPARENTESISATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__5__Impl"


    // $ANTLR start "rule__Tabla__Group__6"
    // InternalSql.g:427:1: rule__Tabla__Group__6 : rule__Tabla__Group__6__Impl rule__Tabla__Group__7 ;
    public final void rule__Tabla__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:431:1: ( rule__Tabla__Group__6__Impl rule__Tabla__Group__7 )
            // InternalSql.g:432:2: rule__Tabla__Group__6__Impl rule__Tabla__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Tabla__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__7();

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
    // $ANTLR end "rule__Tabla__Group__6"


    // $ANTLR start "rule__Tabla__Group__6__Impl"
    // InternalSql.g:439:1: rule__Tabla__Group__6__Impl : ( ( ( rule__Tabla__ColumnasAssignment_6 ) ) ( ( rule__Tabla__ColumnasAssignment_6 )* ) ) ;
    public final void rule__Tabla__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:443:1: ( ( ( ( rule__Tabla__ColumnasAssignment_6 ) ) ( ( rule__Tabla__ColumnasAssignment_6 )* ) ) )
            // InternalSql.g:444:1: ( ( ( rule__Tabla__ColumnasAssignment_6 ) ) ( ( rule__Tabla__ColumnasAssignment_6 )* ) )
            {
            // InternalSql.g:444:1: ( ( ( rule__Tabla__ColumnasAssignment_6 ) ) ( ( rule__Tabla__ColumnasAssignment_6 )* ) )
            // InternalSql.g:445:2: ( ( rule__Tabla__ColumnasAssignment_6 ) ) ( ( rule__Tabla__ColumnasAssignment_6 )* )
            {
            // InternalSql.g:445:2: ( ( rule__Tabla__ColumnasAssignment_6 ) )
            // InternalSql.g:446:3: ( rule__Tabla__ColumnasAssignment_6 )
            {
             before(grammarAccess.getTablaAccess().getColumnasAssignment_6()); 
            // InternalSql.g:447:3: ( rule__Tabla__ColumnasAssignment_6 )
            // InternalSql.g:447:4: rule__Tabla__ColumnasAssignment_6
            {
            pushFollow(FOLLOW_10);
            rule__Tabla__ColumnasAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTablaAccess().getColumnasAssignment_6()); 

            }

            // InternalSql.g:450:2: ( ( rule__Tabla__ColumnasAssignment_6 )* )
            // InternalSql.g:451:3: ( rule__Tabla__ColumnasAssignment_6 )*
            {
             before(grammarAccess.getTablaAccess().getColumnasAssignment_6()); 
            // InternalSql.g:452:3: ( rule__Tabla__ColumnasAssignment_6 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSql.g:452:4: rule__Tabla__ColumnasAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tabla__ColumnasAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTablaAccess().getColumnasAssignment_6()); 

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
    // $ANTLR end "rule__Tabla__Group__6__Impl"


    // $ANTLR start "rule__Tabla__Group__7"
    // InternalSql.g:461:1: rule__Tabla__Group__7 : rule__Tabla__Group__7__Impl rule__Tabla__Group__8 ;
    public final void rule__Tabla__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:465:1: ( rule__Tabla__Group__7__Impl rule__Tabla__Group__8 )
            // InternalSql.g:466:2: rule__Tabla__Group__7__Impl rule__Tabla__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Tabla__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__8();

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
    // $ANTLR end "rule__Tabla__Group__7"


    // $ANTLR start "rule__Tabla__Group__7__Impl"
    // InternalSql.g:473:1: rule__Tabla__Group__7__Impl : ( ( ( rule__Tabla__PrimarysAssignment_7 ) ) ( ( rule__Tabla__PrimarysAssignment_7 )* ) ) ;
    public final void rule__Tabla__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:477:1: ( ( ( ( rule__Tabla__PrimarysAssignment_7 ) ) ( ( rule__Tabla__PrimarysAssignment_7 )* ) ) )
            // InternalSql.g:478:1: ( ( ( rule__Tabla__PrimarysAssignment_7 ) ) ( ( rule__Tabla__PrimarysAssignment_7 )* ) )
            {
            // InternalSql.g:478:1: ( ( ( rule__Tabla__PrimarysAssignment_7 ) ) ( ( rule__Tabla__PrimarysAssignment_7 )* ) )
            // InternalSql.g:479:2: ( ( rule__Tabla__PrimarysAssignment_7 ) ) ( ( rule__Tabla__PrimarysAssignment_7 )* )
            {
            // InternalSql.g:479:2: ( ( rule__Tabla__PrimarysAssignment_7 ) )
            // InternalSql.g:480:3: ( rule__Tabla__PrimarysAssignment_7 )
            {
             before(grammarAccess.getTablaAccess().getPrimarysAssignment_7()); 
            // InternalSql.g:481:3: ( rule__Tabla__PrimarysAssignment_7 )
            // InternalSql.g:481:4: rule__Tabla__PrimarysAssignment_7
            {
            pushFollow(FOLLOW_12);
            rule__Tabla__PrimarysAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTablaAccess().getPrimarysAssignment_7()); 

            }

            // InternalSql.g:484:2: ( ( rule__Tabla__PrimarysAssignment_7 )* )
            // InternalSql.g:485:3: ( rule__Tabla__PrimarysAssignment_7 )*
            {
             before(grammarAccess.getTablaAccess().getPrimarysAssignment_7()); 
            // InternalSql.g:486:3: ( rule__Tabla__PrimarysAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TPRIMARY) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSql.g:486:4: rule__Tabla__PrimarysAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tabla__PrimarysAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTablaAccess().getPrimarysAssignment_7()); 

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
    // $ANTLR end "rule__Tabla__Group__7__Impl"


    // $ANTLR start "rule__Tabla__Group__8"
    // InternalSql.g:495:1: rule__Tabla__Group__8 : rule__Tabla__Group__8__Impl rule__Tabla__Group__9 ;
    public final void rule__Tabla__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:499:1: ( rule__Tabla__Group__8__Impl rule__Tabla__Group__9 )
            // InternalSql.g:500:2: rule__Tabla__Group__8__Impl rule__Tabla__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Tabla__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tabla__Group__9();

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
    // $ANTLR end "rule__Tabla__Group__8"


    // $ANTLR start "rule__Tabla__Group__8__Impl"
    // InternalSql.g:507:1: rule__Tabla__Group__8__Impl : ( ( rule__Tabla__ForeignsAssignment_8 )* ) ;
    public final void rule__Tabla__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:511:1: ( ( ( rule__Tabla__ForeignsAssignment_8 )* ) )
            // InternalSql.g:512:1: ( ( rule__Tabla__ForeignsAssignment_8 )* )
            {
            // InternalSql.g:512:1: ( ( rule__Tabla__ForeignsAssignment_8 )* )
            // InternalSql.g:513:2: ( rule__Tabla__ForeignsAssignment_8 )*
            {
             before(grammarAccess.getTablaAccess().getForeignsAssignment_8()); 
            // InternalSql.g:514:2: ( rule__Tabla__ForeignsAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TFOREIGN) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSql.g:514:3: rule__Tabla__ForeignsAssignment_8
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tabla__ForeignsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTablaAccess().getForeignsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__8__Impl"


    // $ANTLR start "rule__Tabla__Group__9"
    // InternalSql.g:522:1: rule__Tabla__Group__9 : rule__Tabla__Group__9__Impl ;
    public final void rule__Tabla__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:526:1: ( rule__Tabla__Group__9__Impl )
            // InternalSql.g:527:2: rule__Tabla__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tabla__Group__9__Impl();

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
    // $ANTLR end "rule__Tabla__Group__9"


    // $ANTLR start "rule__Tabla__Group__9__Impl"
    // InternalSql.g:533:1: rule__Tabla__Group__9__Impl : ( RULE_PARENTESISB ) ;
    public final void rule__Tabla__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:537:1: ( ( RULE_PARENTESISB ) )
            // InternalSql.g:538:1: ( RULE_PARENTESISB )
            {
            // InternalSql.g:538:1: ( RULE_PARENTESISB )
            // InternalSql.g:539:2: RULE_PARENTESISB
            {
             before(grammarAccess.getTablaAccess().getPARENTESISBTerminalRuleCall_9()); 
            match(input,RULE_PARENTESISB,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getPARENTESISBTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__Group__9__Impl"


    // $ANTLR start "rule__Columna__Group__0"
    // InternalSql.g:549:1: rule__Columna__Group__0 : rule__Columna__Group__0__Impl rule__Columna__Group__1 ;
    public final void rule__Columna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:553:1: ( rule__Columna__Group__0__Impl rule__Columna__Group__1 )
            // InternalSql.g:554:2: rule__Columna__Group__0__Impl rule__Columna__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Columna__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Columna__Group__1();

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
    // $ANTLR end "rule__Columna__Group__0"


    // $ANTLR start "rule__Columna__Group__0__Impl"
    // InternalSql.g:561:1: rule__Columna__Group__0__Impl : ( ( rule__Columna__NameAssignment_0 ) ) ;
    public final void rule__Columna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:565:1: ( ( ( rule__Columna__NameAssignment_0 ) ) )
            // InternalSql.g:566:1: ( ( rule__Columna__NameAssignment_0 ) )
            {
            // InternalSql.g:566:1: ( ( rule__Columna__NameAssignment_0 ) )
            // InternalSql.g:567:2: ( rule__Columna__NameAssignment_0 )
            {
             before(grammarAccess.getColumnaAccess().getNameAssignment_0()); 
            // InternalSql.g:568:2: ( rule__Columna__NameAssignment_0 )
            // InternalSql.g:568:3: rule__Columna__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Columna__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group__0__Impl"


    // $ANTLR start "rule__Columna__Group__1"
    // InternalSql.g:576:1: rule__Columna__Group__1 : rule__Columna__Group__1__Impl rule__Columna__Group__2 ;
    public final void rule__Columna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:580:1: ( rule__Columna__Group__1__Impl rule__Columna__Group__2 )
            // InternalSql.g:581:2: rule__Columna__Group__1__Impl rule__Columna__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Columna__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Columna__Group__2();

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
    // $ANTLR end "rule__Columna__Group__1"


    // $ANTLR start "rule__Columna__Group__1__Impl"
    // InternalSql.g:588:1: rule__Columna__Group__1__Impl : ( ' ' ) ;
    public final void rule__Columna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:592:1: ( ( ' ' ) )
            // InternalSql.g:593:1: ( ' ' )
            {
            // InternalSql.g:593:1: ( ' ' )
            // InternalSql.g:594:2: ' '
            {
             before(grammarAccess.getColumnaAccess().getSpaceKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group__1__Impl"


    // $ANTLR start "rule__Columna__Group__2"
    // InternalSql.g:603:1: rule__Columna__Group__2 : rule__Columna__Group__2__Impl rule__Columna__Group__3 ;
    public final void rule__Columna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:607:1: ( rule__Columna__Group__2__Impl rule__Columna__Group__3 )
            // InternalSql.g:608:2: rule__Columna__Group__2__Impl rule__Columna__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Columna__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Columna__Group__3();

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
    // $ANTLR end "rule__Columna__Group__2"


    // $ANTLR start "rule__Columna__Group__2__Impl"
    // InternalSql.g:615:1: rule__Columna__Group__2__Impl : ( ( rule__Columna__TipoAssignment_2 ) ) ;
    public final void rule__Columna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:619:1: ( ( ( rule__Columna__TipoAssignment_2 ) ) )
            // InternalSql.g:620:1: ( ( rule__Columna__TipoAssignment_2 ) )
            {
            // InternalSql.g:620:1: ( ( rule__Columna__TipoAssignment_2 ) )
            // InternalSql.g:621:2: ( rule__Columna__TipoAssignment_2 )
            {
             before(grammarAccess.getColumnaAccess().getTipoAssignment_2()); 
            // InternalSql.g:622:2: ( rule__Columna__TipoAssignment_2 )
            // InternalSql.g:622:3: rule__Columna__TipoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Columna__TipoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnaAccess().getTipoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group__2__Impl"


    // $ANTLR start "rule__Columna__Group__3"
    // InternalSql.g:630:1: rule__Columna__Group__3 : rule__Columna__Group__3__Impl rule__Columna__Group__4 ;
    public final void rule__Columna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:634:1: ( rule__Columna__Group__3__Impl rule__Columna__Group__4 )
            // InternalSql.g:635:2: rule__Columna__Group__3__Impl rule__Columna__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Columna__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Columna__Group__4();

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
    // $ANTLR end "rule__Columna__Group__3"


    // $ANTLR start "rule__Columna__Group__3__Impl"
    // InternalSql.g:642:1: rule__Columna__Group__3__Impl : ( ( rule__Columna__NotNullAssignment_3 )? ) ;
    public final void rule__Columna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:646:1: ( ( ( rule__Columna__NotNullAssignment_3 )? ) )
            // InternalSql.g:647:1: ( ( rule__Columna__NotNullAssignment_3 )? )
            {
            // InternalSql.g:647:1: ( ( rule__Columna__NotNullAssignment_3 )? )
            // InternalSql.g:648:2: ( rule__Columna__NotNullAssignment_3 )?
            {
             before(grammarAccess.getColumnaAccess().getNotNullAssignment_3()); 
            // InternalSql.g:649:2: ( rule__Columna__NotNullAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSql.g:649:3: rule__Columna__NotNullAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Columna__NotNullAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnaAccess().getNotNullAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group__3__Impl"


    // $ANTLR start "rule__Columna__Group__4"
    // InternalSql.g:657:1: rule__Columna__Group__4 : rule__Columna__Group__4__Impl ;
    public final void rule__Columna__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:661:1: ( rule__Columna__Group__4__Impl )
            // InternalSql.g:662:2: rule__Columna__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Columna__Group__4__Impl();

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
    // $ANTLR end "rule__Columna__Group__4"


    // $ANTLR start "rule__Columna__Group__4__Impl"
    // InternalSql.g:668:1: rule__Columna__Group__4__Impl : ( ( RULE_COMA )* ) ;
    public final void rule__Columna__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:672:1: ( ( ( RULE_COMA )* ) )
            // InternalSql.g:673:1: ( ( RULE_COMA )* )
            {
            // InternalSql.g:673:1: ( ( RULE_COMA )* )
            // InternalSql.g:674:2: ( RULE_COMA )*
            {
             before(grammarAccess.getColumnaAccess().getCOMATerminalRuleCall_4()); 
            // InternalSql.g:675:2: ( RULE_COMA )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSql.g:675:3: RULE_COMA
            	    {
            	    match(input,RULE_COMA,FOLLOW_16); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getColumnaAccess().getCOMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group__4__Impl"


    // $ANTLR start "rule__Primary__Group__0"
    // InternalSql.g:684:1: rule__Primary__Group__0 : rule__Primary__Group__0__Impl rule__Primary__Group__1 ;
    public final void rule__Primary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:688:1: ( rule__Primary__Group__0__Impl rule__Primary__Group__1 )
            // InternalSql.g:689:2: rule__Primary__Group__0__Impl rule__Primary__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__1();

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
    // $ANTLR end "rule__Primary__Group__0"


    // $ANTLR start "rule__Primary__Group__0__Impl"
    // InternalSql.g:696:1: rule__Primary__Group__0__Impl : ( RULE_TPRIMARY ) ;
    public final void rule__Primary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:700:1: ( ( RULE_TPRIMARY ) )
            // InternalSql.g:701:1: ( RULE_TPRIMARY )
            {
            // InternalSql.g:701:1: ( RULE_TPRIMARY )
            // InternalSql.g:702:2: RULE_TPRIMARY
            {
             before(grammarAccess.getPrimaryAccess().getTPRIMARYTerminalRuleCall_0()); 
            match(input,RULE_TPRIMARY,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getTPRIMARYTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__0__Impl"


    // $ANTLR start "rule__Primary__Group__1"
    // InternalSql.g:711:1: rule__Primary__Group__1 : rule__Primary__Group__1__Impl rule__Primary__Group__2 ;
    public final void rule__Primary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:715:1: ( rule__Primary__Group__1__Impl rule__Primary__Group__2 )
            // InternalSql.g:716:2: rule__Primary__Group__1__Impl rule__Primary__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Primary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__2();

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
    // $ANTLR end "rule__Primary__Group__1"


    // $ANTLR start "rule__Primary__Group__1__Impl"
    // InternalSql.g:723:1: rule__Primary__Group__1__Impl : ( ' ' ) ;
    public final void rule__Primary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:727:1: ( ( ' ' ) )
            // InternalSql.g:728:1: ( ' ' )
            {
            // InternalSql.g:728:1: ( ' ' )
            // InternalSql.g:729:2: ' '
            {
             before(grammarAccess.getPrimaryAccess().getSpaceKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__1__Impl"


    // $ANTLR start "rule__Primary__Group__2"
    // InternalSql.g:738:1: rule__Primary__Group__2 : rule__Primary__Group__2__Impl rule__Primary__Group__3 ;
    public final void rule__Primary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:742:1: ( rule__Primary__Group__2__Impl rule__Primary__Group__3 )
            // InternalSql.g:743:2: rule__Primary__Group__2__Impl rule__Primary__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__3();

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
    // $ANTLR end "rule__Primary__Group__2"


    // $ANTLR start "rule__Primary__Group__2__Impl"
    // InternalSql.g:750:1: rule__Primary__Group__2__Impl : ( RULE_TKEY ) ;
    public final void rule__Primary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:754:1: ( ( RULE_TKEY ) )
            // InternalSql.g:755:1: ( RULE_TKEY )
            {
            // InternalSql.g:755:1: ( RULE_TKEY )
            // InternalSql.g:756:2: RULE_TKEY
            {
             before(grammarAccess.getPrimaryAccess().getTKEYTerminalRuleCall_2()); 
            match(input,RULE_TKEY,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getTKEYTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__2__Impl"


    // $ANTLR start "rule__Primary__Group__3"
    // InternalSql.g:765:1: rule__Primary__Group__3 : rule__Primary__Group__3__Impl rule__Primary__Group__4 ;
    public final void rule__Primary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:769:1: ( rule__Primary__Group__3__Impl rule__Primary__Group__4 )
            // InternalSql.g:770:2: rule__Primary__Group__3__Impl rule__Primary__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Primary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__4();

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
    // $ANTLR end "rule__Primary__Group__3"


    // $ANTLR start "rule__Primary__Group__3__Impl"
    // InternalSql.g:777:1: rule__Primary__Group__3__Impl : ( ' ' ) ;
    public final void rule__Primary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:781:1: ( ( ' ' ) )
            // InternalSql.g:782:1: ( ' ' )
            {
            // InternalSql.g:782:1: ( ' ' )
            // InternalSql.g:783:2: ' '
            {
             before(grammarAccess.getPrimaryAccess().getSpaceKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getSpaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__3__Impl"


    // $ANTLR start "rule__Primary__Group__4"
    // InternalSql.g:792:1: rule__Primary__Group__4 : rule__Primary__Group__4__Impl rule__Primary__Group__5 ;
    public final void rule__Primary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:796:1: ( rule__Primary__Group__4__Impl rule__Primary__Group__5 )
            // InternalSql.g:797:2: rule__Primary__Group__4__Impl rule__Primary__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Primary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__5();

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
    // $ANTLR end "rule__Primary__Group__4"


    // $ANTLR start "rule__Primary__Group__4__Impl"
    // InternalSql.g:804:1: rule__Primary__Group__4__Impl : ( RULE_PARENTESISA ) ;
    public final void rule__Primary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:808:1: ( ( RULE_PARENTESISA ) )
            // InternalSql.g:809:1: ( RULE_PARENTESISA )
            {
            // InternalSql.g:809:1: ( RULE_PARENTESISA )
            // InternalSql.g:810:2: RULE_PARENTESISA
            {
             before(grammarAccess.getPrimaryAccess().getPARENTESISATerminalRuleCall_4()); 
            match(input,RULE_PARENTESISA,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getPARENTESISATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__4__Impl"


    // $ANTLR start "rule__Primary__Group__5"
    // InternalSql.g:819:1: rule__Primary__Group__5 : rule__Primary__Group__5__Impl rule__Primary__Group__6 ;
    public final void rule__Primary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:823:1: ( rule__Primary__Group__5__Impl rule__Primary__Group__6 )
            // InternalSql.g:824:2: rule__Primary__Group__5__Impl rule__Primary__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__6();

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
    // $ANTLR end "rule__Primary__Group__5"


    // $ANTLR start "rule__Primary__Group__5__Impl"
    // InternalSql.g:831:1: rule__Primary__Group__5__Impl : ( ( rule__Primary__ColumnAssignment_5 ) ) ;
    public final void rule__Primary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:835:1: ( ( ( rule__Primary__ColumnAssignment_5 ) ) )
            // InternalSql.g:836:1: ( ( rule__Primary__ColumnAssignment_5 ) )
            {
            // InternalSql.g:836:1: ( ( rule__Primary__ColumnAssignment_5 ) )
            // InternalSql.g:837:2: ( rule__Primary__ColumnAssignment_5 )
            {
             before(grammarAccess.getPrimaryAccess().getColumnAssignment_5()); 
            // InternalSql.g:838:2: ( rule__Primary__ColumnAssignment_5 )
            // InternalSql.g:838:3: rule__Primary__ColumnAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ColumnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getColumnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__5__Impl"


    // $ANTLR start "rule__Primary__Group__6"
    // InternalSql.g:846:1: rule__Primary__Group__6 : rule__Primary__Group__6__Impl rule__Primary__Group__7 ;
    public final void rule__Primary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:850:1: ( rule__Primary__Group__6__Impl rule__Primary__Group__7 )
            // InternalSql.g:851:2: rule__Primary__Group__6__Impl rule__Primary__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__7();

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
    // $ANTLR end "rule__Primary__Group__6"


    // $ANTLR start "rule__Primary__Group__6__Impl"
    // InternalSql.g:858:1: rule__Primary__Group__6__Impl : ( ( rule__Primary__Group_6__0 )* ) ;
    public final void rule__Primary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:862:1: ( ( ( rule__Primary__Group_6__0 )* ) )
            // InternalSql.g:863:1: ( ( rule__Primary__Group_6__0 )* )
            {
            // InternalSql.g:863:1: ( ( rule__Primary__Group_6__0 )* )
            // InternalSql.g:864:2: ( rule__Primary__Group_6__0 )*
            {
             before(grammarAccess.getPrimaryAccess().getGroup_6()); 
            // InternalSql.g:865:2: ( rule__Primary__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql.g:865:3: rule__Primary__Group_6__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Primary__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPrimaryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__6__Impl"


    // $ANTLR start "rule__Primary__Group__7"
    // InternalSql.g:873:1: rule__Primary__Group__7 : rule__Primary__Group__7__Impl rule__Primary__Group__8 ;
    public final void rule__Primary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:877:1: ( rule__Primary__Group__7__Impl rule__Primary__Group__8 )
            // InternalSql.g:878:2: rule__Primary__Group__7__Impl rule__Primary__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Primary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group__8();

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
    // $ANTLR end "rule__Primary__Group__7"


    // $ANTLR start "rule__Primary__Group__7__Impl"
    // InternalSql.g:885:1: rule__Primary__Group__7__Impl : ( RULE_PARENTESISB ) ;
    public final void rule__Primary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:889:1: ( ( RULE_PARENTESISB ) )
            // InternalSql.g:890:1: ( RULE_PARENTESISB )
            {
            // InternalSql.g:890:1: ( RULE_PARENTESISB )
            // InternalSql.g:891:2: RULE_PARENTESISB
            {
             before(grammarAccess.getPrimaryAccess().getPARENTESISBTerminalRuleCall_7()); 
            match(input,RULE_PARENTESISB,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getPARENTESISBTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__7__Impl"


    // $ANTLR start "rule__Primary__Group__8"
    // InternalSql.g:900:1: rule__Primary__Group__8 : rule__Primary__Group__8__Impl ;
    public final void rule__Primary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:904:1: ( rule__Primary__Group__8__Impl )
            // InternalSql.g:905:2: rule__Primary__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group__8__Impl();

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
    // $ANTLR end "rule__Primary__Group__8"


    // $ANTLR start "rule__Primary__Group__8__Impl"
    // InternalSql.g:911:1: rule__Primary__Group__8__Impl : ( ( RULE_COMA )* ) ;
    public final void rule__Primary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:915:1: ( ( ( RULE_COMA )* ) )
            // InternalSql.g:916:1: ( ( RULE_COMA )* )
            {
            // InternalSql.g:916:1: ( ( RULE_COMA )* )
            // InternalSql.g:917:2: ( RULE_COMA )*
            {
             before(grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_8()); 
            // InternalSql.g:918:2: ( RULE_COMA )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql.g:918:3: RULE_COMA
            	    {
            	    match(input,RULE_COMA,FOLLOW_16); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group__8__Impl"


    // $ANTLR start "rule__Primary__Group_6__0"
    // InternalSql.g:927:1: rule__Primary__Group_6__0 : rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1 ;
    public final void rule__Primary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:931:1: ( rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1 )
            // InternalSql.g:932:2: rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__1();

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
    // $ANTLR end "rule__Primary__Group_6__0"


    // $ANTLR start "rule__Primary__Group_6__0__Impl"
    // InternalSql.g:939:1: rule__Primary__Group_6__0__Impl : ( RULE_COMA ) ;
    public final void rule__Primary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:943:1: ( ( RULE_COMA ) )
            // InternalSql.g:944:1: ( RULE_COMA )
            {
            // InternalSql.g:944:1: ( RULE_COMA )
            // InternalSql.g:945:2: RULE_COMA
            {
             before(grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_6_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__0__Impl"


    // $ANTLR start "rule__Primary__Group_6__1"
    // InternalSql.g:954:1: rule__Primary__Group_6__1 : rule__Primary__Group_6__1__Impl rule__Primary__Group_6__2 ;
    public final void rule__Primary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:958:1: ( rule__Primary__Group_6__1__Impl rule__Primary__Group_6__2 )
            // InternalSql.g:959:2: rule__Primary__Group_6__1__Impl rule__Primary__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__Primary__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__2();

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
    // $ANTLR end "rule__Primary__Group_6__1"


    // $ANTLR start "rule__Primary__Group_6__1__Impl"
    // InternalSql.g:966:1: rule__Primary__Group_6__1__Impl : ( ' ' ) ;
    public final void rule__Primary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:970:1: ( ( ' ' ) )
            // InternalSql.g:971:1: ( ' ' )
            {
            // InternalSql.g:971:1: ( ' ' )
            // InternalSql.g:972:2: ' '
            {
             before(grammarAccess.getPrimaryAccess().getSpaceKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getSpaceKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__1__Impl"


    // $ANTLR start "rule__Primary__Group_6__2"
    // InternalSql.g:981:1: rule__Primary__Group_6__2 : rule__Primary__Group_6__2__Impl ;
    public final void rule__Primary__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:985:1: ( rule__Primary__Group_6__2__Impl )
            // InternalSql.g:986:2: rule__Primary__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_6__2"


    // $ANTLR start "rule__Primary__Group_6__2__Impl"
    // InternalSql.g:992:1: rule__Primary__Group_6__2__Impl : ( ( rule__Primary__ColumnAssignment_6_2 ) ) ;
    public final void rule__Primary__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:996:1: ( ( ( rule__Primary__ColumnAssignment_6_2 ) ) )
            // InternalSql.g:997:1: ( ( rule__Primary__ColumnAssignment_6_2 ) )
            {
            // InternalSql.g:997:1: ( ( rule__Primary__ColumnAssignment_6_2 ) )
            // InternalSql.g:998:2: ( rule__Primary__ColumnAssignment_6_2 )
            {
             before(grammarAccess.getPrimaryAccess().getColumnAssignment_6_2()); 
            // InternalSql.g:999:2: ( rule__Primary__ColumnAssignment_6_2 )
            // InternalSql.g:999:3: rule__Primary__ColumnAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ColumnAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getColumnAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__2__Impl"


    // $ANTLR start "rule__ForeingKey__Group__0"
    // InternalSql.g:1008:1: rule__ForeingKey__Group__0 : rule__ForeingKey__Group__0__Impl rule__ForeingKey__Group__1 ;
    public final void rule__ForeingKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1012:1: ( rule__ForeingKey__Group__0__Impl rule__ForeingKey__Group__1 )
            // InternalSql.g:1013:2: rule__ForeingKey__Group__0__Impl rule__ForeingKey__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ForeingKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__1();

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
    // $ANTLR end "rule__ForeingKey__Group__0"


    // $ANTLR start "rule__ForeingKey__Group__0__Impl"
    // InternalSql.g:1020:1: rule__ForeingKey__Group__0__Impl : ( RULE_TFOREIGN ) ;
    public final void rule__ForeingKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1024:1: ( ( RULE_TFOREIGN ) )
            // InternalSql.g:1025:1: ( RULE_TFOREIGN )
            {
            // InternalSql.g:1025:1: ( RULE_TFOREIGN )
            // InternalSql.g:1026:2: RULE_TFOREIGN
            {
             before(grammarAccess.getForeingKeyAccess().getTFOREIGNTerminalRuleCall_0()); 
            match(input,RULE_TFOREIGN,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getTFOREIGNTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__0__Impl"


    // $ANTLR start "rule__ForeingKey__Group__1"
    // InternalSql.g:1035:1: rule__ForeingKey__Group__1 : rule__ForeingKey__Group__1__Impl rule__ForeingKey__Group__2 ;
    public final void rule__ForeingKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1039:1: ( rule__ForeingKey__Group__1__Impl rule__ForeingKey__Group__2 )
            // InternalSql.g:1040:2: rule__ForeingKey__Group__1__Impl rule__ForeingKey__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ForeingKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__2();

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
    // $ANTLR end "rule__ForeingKey__Group__1"


    // $ANTLR start "rule__ForeingKey__Group__1__Impl"
    // InternalSql.g:1047:1: rule__ForeingKey__Group__1__Impl : ( ' ' ) ;
    public final void rule__ForeingKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1051:1: ( ( ' ' ) )
            // InternalSql.g:1052:1: ( ' ' )
            {
            // InternalSql.g:1052:1: ( ' ' )
            // InternalSql.g:1053:2: ' '
            {
             before(grammarAccess.getForeingKeyAccess().getSpaceKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__1__Impl"


    // $ANTLR start "rule__ForeingKey__Group__2"
    // InternalSql.g:1062:1: rule__ForeingKey__Group__2 : rule__ForeingKey__Group__2__Impl rule__ForeingKey__Group__3 ;
    public final void rule__ForeingKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1066:1: ( rule__ForeingKey__Group__2__Impl rule__ForeingKey__Group__3 )
            // InternalSql.g:1067:2: rule__ForeingKey__Group__2__Impl rule__ForeingKey__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ForeingKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__3();

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
    // $ANTLR end "rule__ForeingKey__Group__2"


    // $ANTLR start "rule__ForeingKey__Group__2__Impl"
    // InternalSql.g:1074:1: rule__ForeingKey__Group__2__Impl : ( RULE_TKEY ) ;
    public final void rule__ForeingKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1078:1: ( ( RULE_TKEY ) )
            // InternalSql.g:1079:1: ( RULE_TKEY )
            {
            // InternalSql.g:1079:1: ( RULE_TKEY )
            // InternalSql.g:1080:2: RULE_TKEY
            {
             before(grammarAccess.getForeingKeyAccess().getTKEYTerminalRuleCall_2()); 
            match(input,RULE_TKEY,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getTKEYTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__2__Impl"


    // $ANTLR start "rule__ForeingKey__Group__3"
    // InternalSql.g:1089:1: rule__ForeingKey__Group__3 : rule__ForeingKey__Group__3__Impl rule__ForeingKey__Group__4 ;
    public final void rule__ForeingKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1093:1: ( rule__ForeingKey__Group__3__Impl rule__ForeingKey__Group__4 )
            // InternalSql.g:1094:2: rule__ForeingKey__Group__3__Impl rule__ForeingKey__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ForeingKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__4();

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
    // $ANTLR end "rule__ForeingKey__Group__3"


    // $ANTLR start "rule__ForeingKey__Group__3__Impl"
    // InternalSql.g:1101:1: rule__ForeingKey__Group__3__Impl : ( ' ' ) ;
    public final void rule__ForeingKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1105:1: ( ( ' ' ) )
            // InternalSql.g:1106:1: ( ' ' )
            {
            // InternalSql.g:1106:1: ( ' ' )
            // InternalSql.g:1107:2: ' '
            {
             before(grammarAccess.getForeingKeyAccess().getSpaceKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getSpaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__3__Impl"


    // $ANTLR start "rule__ForeingKey__Group__4"
    // InternalSql.g:1116:1: rule__ForeingKey__Group__4 : rule__ForeingKey__Group__4__Impl rule__ForeingKey__Group__5 ;
    public final void rule__ForeingKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1120:1: ( rule__ForeingKey__Group__4__Impl rule__ForeingKey__Group__5 )
            // InternalSql.g:1121:2: rule__ForeingKey__Group__4__Impl rule__ForeingKey__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ForeingKey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__5();

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
    // $ANTLR end "rule__ForeingKey__Group__4"


    // $ANTLR start "rule__ForeingKey__Group__4__Impl"
    // InternalSql.g:1128:1: rule__ForeingKey__Group__4__Impl : ( RULE_PARENTESISA ) ;
    public final void rule__ForeingKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1132:1: ( ( RULE_PARENTESISA ) )
            // InternalSql.g:1133:1: ( RULE_PARENTESISA )
            {
            // InternalSql.g:1133:1: ( RULE_PARENTESISA )
            // InternalSql.g:1134:2: RULE_PARENTESISA
            {
             before(grammarAccess.getForeingKeyAccess().getPARENTESISATerminalRuleCall_4()); 
            match(input,RULE_PARENTESISA,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getPARENTESISATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__4__Impl"


    // $ANTLR start "rule__ForeingKey__Group__5"
    // InternalSql.g:1143:1: rule__ForeingKey__Group__5 : rule__ForeingKey__Group__5__Impl rule__ForeingKey__Group__6 ;
    public final void rule__ForeingKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1147:1: ( rule__ForeingKey__Group__5__Impl rule__ForeingKey__Group__6 )
            // InternalSql.g:1148:2: rule__ForeingKey__Group__5__Impl rule__ForeingKey__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ForeingKey__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__6();

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
    // $ANTLR end "rule__ForeingKey__Group__5"


    // $ANTLR start "rule__ForeingKey__Group__5__Impl"
    // InternalSql.g:1155:1: rule__ForeingKey__Group__5__Impl : ( ( rule__ForeingKey__NameAssignment_5 ) ) ;
    public final void rule__ForeingKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1159:1: ( ( ( rule__ForeingKey__NameAssignment_5 ) ) )
            // InternalSql.g:1160:1: ( ( rule__ForeingKey__NameAssignment_5 ) )
            {
            // InternalSql.g:1160:1: ( ( rule__ForeingKey__NameAssignment_5 ) )
            // InternalSql.g:1161:2: ( rule__ForeingKey__NameAssignment_5 )
            {
             before(grammarAccess.getForeingKeyAccess().getNameAssignment_5()); 
            // InternalSql.g:1162:2: ( rule__ForeingKey__NameAssignment_5 )
            // InternalSql.g:1162:3: rule__ForeingKey__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForeingKey__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForeingKeyAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__5__Impl"


    // $ANTLR start "rule__ForeingKey__Group__6"
    // InternalSql.g:1170:1: rule__ForeingKey__Group__6 : rule__ForeingKey__Group__6__Impl rule__ForeingKey__Group__7 ;
    public final void rule__ForeingKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1174:1: ( rule__ForeingKey__Group__6__Impl rule__ForeingKey__Group__7 )
            // InternalSql.g:1175:2: rule__ForeingKey__Group__6__Impl rule__ForeingKey__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__ForeingKey__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__7();

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
    // $ANTLR end "rule__ForeingKey__Group__6"


    // $ANTLR start "rule__ForeingKey__Group__6__Impl"
    // InternalSql.g:1182:1: rule__ForeingKey__Group__6__Impl : ( RULE_PARENTESISB ) ;
    public final void rule__ForeingKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1186:1: ( ( RULE_PARENTESISB ) )
            // InternalSql.g:1187:1: ( RULE_PARENTESISB )
            {
            // InternalSql.g:1187:1: ( RULE_PARENTESISB )
            // InternalSql.g:1188:2: RULE_PARENTESISB
            {
             before(grammarAccess.getForeingKeyAccess().getPARENTESISBTerminalRuleCall_6()); 
            match(input,RULE_PARENTESISB,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getPARENTESISBTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__6__Impl"


    // $ANTLR start "rule__ForeingKey__Group__7"
    // InternalSql.g:1197:1: rule__ForeingKey__Group__7 : rule__ForeingKey__Group__7__Impl rule__ForeingKey__Group__8 ;
    public final void rule__ForeingKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1201:1: ( rule__ForeingKey__Group__7__Impl rule__ForeingKey__Group__8 )
            // InternalSql.g:1202:2: rule__ForeingKey__Group__7__Impl rule__ForeingKey__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ForeingKey__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__8();

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
    // $ANTLR end "rule__ForeingKey__Group__7"


    // $ANTLR start "rule__ForeingKey__Group__7__Impl"
    // InternalSql.g:1209:1: rule__ForeingKey__Group__7__Impl : ( ' ' ) ;
    public final void rule__ForeingKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1213:1: ( ( ' ' ) )
            // InternalSql.g:1214:1: ( ' ' )
            {
            // InternalSql.g:1214:1: ( ' ' )
            // InternalSql.g:1215:2: ' '
            {
             before(grammarAccess.getForeingKeyAccess().getSpaceKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getSpaceKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__7__Impl"


    // $ANTLR start "rule__ForeingKey__Group__8"
    // InternalSql.g:1224:1: rule__ForeingKey__Group__8 : rule__ForeingKey__Group__8__Impl rule__ForeingKey__Group__9 ;
    public final void rule__ForeingKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1228:1: ( rule__ForeingKey__Group__8__Impl rule__ForeingKey__Group__9 )
            // InternalSql.g:1229:2: rule__ForeingKey__Group__8__Impl rule__ForeingKey__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__ForeingKey__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__9();

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
    // $ANTLR end "rule__ForeingKey__Group__8"


    // $ANTLR start "rule__ForeingKey__Group__8__Impl"
    // InternalSql.g:1236:1: rule__ForeingKey__Group__8__Impl : ( RULE_TREFERENCES ) ;
    public final void rule__ForeingKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1240:1: ( ( RULE_TREFERENCES ) )
            // InternalSql.g:1241:1: ( RULE_TREFERENCES )
            {
            // InternalSql.g:1241:1: ( RULE_TREFERENCES )
            // InternalSql.g:1242:2: RULE_TREFERENCES
            {
             before(grammarAccess.getForeingKeyAccess().getTREFERENCESTerminalRuleCall_8()); 
            match(input,RULE_TREFERENCES,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getTREFERENCESTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__8__Impl"


    // $ANTLR start "rule__ForeingKey__Group__9"
    // InternalSql.g:1251:1: rule__ForeingKey__Group__9 : rule__ForeingKey__Group__9__Impl rule__ForeingKey__Group__10 ;
    public final void rule__ForeingKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1255:1: ( rule__ForeingKey__Group__9__Impl rule__ForeingKey__Group__10 )
            // InternalSql.g:1256:2: rule__ForeingKey__Group__9__Impl rule__ForeingKey__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__ForeingKey__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__10();

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
    // $ANTLR end "rule__ForeingKey__Group__9"


    // $ANTLR start "rule__ForeingKey__Group__9__Impl"
    // InternalSql.g:1263:1: rule__ForeingKey__Group__9__Impl : ( ' ' ) ;
    public final void rule__ForeingKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1267:1: ( ( ' ' ) )
            // InternalSql.g:1268:1: ( ' ' )
            {
            // InternalSql.g:1268:1: ( ' ' )
            // InternalSql.g:1269:2: ' '
            {
             before(grammarAccess.getForeingKeyAccess().getSpaceKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getSpaceKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__9__Impl"


    // $ANTLR start "rule__ForeingKey__Group__10"
    // InternalSql.g:1278:1: rule__ForeingKey__Group__10 : rule__ForeingKey__Group__10__Impl rule__ForeingKey__Group__11 ;
    public final void rule__ForeingKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1282:1: ( rule__ForeingKey__Group__10__Impl rule__ForeingKey__Group__11 )
            // InternalSql.g:1283:2: rule__ForeingKey__Group__10__Impl rule__ForeingKey__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__ForeingKey__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__11();

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
    // $ANTLR end "rule__ForeingKey__Group__10"


    // $ANTLR start "rule__ForeingKey__Group__10__Impl"
    // InternalSql.g:1290:1: rule__ForeingKey__Group__10__Impl : ( ( rule__ForeingKey__ReferenceTableAssignment_10 ) ) ;
    public final void rule__ForeingKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1294:1: ( ( ( rule__ForeingKey__ReferenceTableAssignment_10 ) ) )
            // InternalSql.g:1295:1: ( ( rule__ForeingKey__ReferenceTableAssignment_10 ) )
            {
            // InternalSql.g:1295:1: ( ( rule__ForeingKey__ReferenceTableAssignment_10 ) )
            // InternalSql.g:1296:2: ( rule__ForeingKey__ReferenceTableAssignment_10 )
            {
             before(grammarAccess.getForeingKeyAccess().getReferenceTableAssignment_10()); 
            // InternalSql.g:1297:2: ( rule__ForeingKey__ReferenceTableAssignment_10 )
            // InternalSql.g:1297:3: rule__ForeingKey__ReferenceTableAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ForeingKey__ReferenceTableAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getForeingKeyAccess().getReferenceTableAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__10__Impl"


    // $ANTLR start "rule__ForeingKey__Group__11"
    // InternalSql.g:1305:1: rule__ForeingKey__Group__11 : rule__ForeingKey__Group__11__Impl rule__ForeingKey__Group__12 ;
    public final void rule__ForeingKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1309:1: ( rule__ForeingKey__Group__11__Impl rule__ForeingKey__Group__12 )
            // InternalSql.g:1310:2: rule__ForeingKey__Group__11__Impl rule__ForeingKey__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__ForeingKey__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__12();

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
    // $ANTLR end "rule__ForeingKey__Group__11"


    // $ANTLR start "rule__ForeingKey__Group__11__Impl"
    // InternalSql.g:1317:1: rule__ForeingKey__Group__11__Impl : ( RULE_PARENTESISA ) ;
    public final void rule__ForeingKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1321:1: ( ( RULE_PARENTESISA ) )
            // InternalSql.g:1322:1: ( RULE_PARENTESISA )
            {
            // InternalSql.g:1322:1: ( RULE_PARENTESISA )
            // InternalSql.g:1323:2: RULE_PARENTESISA
            {
             before(grammarAccess.getForeingKeyAccess().getPARENTESISATerminalRuleCall_11()); 
            match(input,RULE_PARENTESISA,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getPARENTESISATerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__11__Impl"


    // $ANTLR start "rule__ForeingKey__Group__12"
    // InternalSql.g:1332:1: rule__ForeingKey__Group__12 : rule__ForeingKey__Group__12__Impl rule__ForeingKey__Group__13 ;
    public final void rule__ForeingKey__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1336:1: ( rule__ForeingKey__Group__12__Impl rule__ForeingKey__Group__13 )
            // InternalSql.g:1337:2: rule__ForeingKey__Group__12__Impl rule__ForeingKey__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__ForeingKey__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__13();

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
    // $ANTLR end "rule__ForeingKey__Group__12"


    // $ANTLR start "rule__ForeingKey__Group__12__Impl"
    // InternalSql.g:1344:1: rule__ForeingKey__Group__12__Impl : ( ( rule__ForeingKey__ReferenceColumnAssignment_12 ) ) ;
    public final void rule__ForeingKey__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1348:1: ( ( ( rule__ForeingKey__ReferenceColumnAssignment_12 ) ) )
            // InternalSql.g:1349:1: ( ( rule__ForeingKey__ReferenceColumnAssignment_12 ) )
            {
            // InternalSql.g:1349:1: ( ( rule__ForeingKey__ReferenceColumnAssignment_12 ) )
            // InternalSql.g:1350:2: ( rule__ForeingKey__ReferenceColumnAssignment_12 )
            {
             before(grammarAccess.getForeingKeyAccess().getReferenceColumnAssignment_12()); 
            // InternalSql.g:1351:2: ( rule__ForeingKey__ReferenceColumnAssignment_12 )
            // InternalSql.g:1351:3: rule__ForeingKey__ReferenceColumnAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ForeingKey__ReferenceColumnAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getForeingKeyAccess().getReferenceColumnAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__12__Impl"


    // $ANTLR start "rule__ForeingKey__Group__13"
    // InternalSql.g:1359:1: rule__ForeingKey__Group__13 : rule__ForeingKey__Group__13__Impl rule__ForeingKey__Group__14 ;
    public final void rule__ForeingKey__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1363:1: ( rule__ForeingKey__Group__13__Impl rule__ForeingKey__Group__14 )
            // InternalSql.g:1364:2: rule__ForeingKey__Group__13__Impl rule__ForeingKey__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__ForeingKey__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__14();

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
    // $ANTLR end "rule__ForeingKey__Group__13"


    // $ANTLR start "rule__ForeingKey__Group__13__Impl"
    // InternalSql.g:1371:1: rule__ForeingKey__Group__13__Impl : ( RULE_PARENTESISB ) ;
    public final void rule__ForeingKey__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1375:1: ( ( RULE_PARENTESISB ) )
            // InternalSql.g:1376:1: ( RULE_PARENTESISB )
            {
            // InternalSql.g:1376:1: ( RULE_PARENTESISB )
            // InternalSql.g:1377:2: RULE_PARENTESISB
            {
             before(grammarAccess.getForeingKeyAccess().getPARENTESISBTerminalRuleCall_13()); 
            match(input,RULE_PARENTESISB,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getPARENTESISBTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__13__Impl"


    // $ANTLR start "rule__ForeingKey__Group__14"
    // InternalSql.g:1386:1: rule__ForeingKey__Group__14 : rule__ForeingKey__Group__14__Impl ;
    public final void rule__ForeingKey__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1390:1: ( rule__ForeingKey__Group__14__Impl )
            // InternalSql.g:1391:2: rule__ForeingKey__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeingKey__Group__14__Impl();

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
    // $ANTLR end "rule__ForeingKey__Group__14"


    // $ANTLR start "rule__ForeingKey__Group__14__Impl"
    // InternalSql.g:1397:1: rule__ForeingKey__Group__14__Impl : ( ( RULE_COMA )* ) ;
    public final void rule__ForeingKey__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1401:1: ( ( ( RULE_COMA )* ) )
            // InternalSql.g:1402:1: ( ( RULE_COMA )* )
            {
            // InternalSql.g:1402:1: ( ( RULE_COMA )* )
            // InternalSql.g:1403:2: ( RULE_COMA )*
            {
             before(grammarAccess.getForeingKeyAccess().getCOMATerminalRuleCall_14()); 
            // InternalSql.g:1404:2: ( RULE_COMA )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql.g:1404:3: RULE_COMA
            	    {
            	    match(input,RULE_COMA,FOLLOW_16); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getForeingKeyAccess().getCOMATerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__Group__14__Impl"


    // $ANTLR start "rule__Database__TablasAssignment_1"
    // InternalSql.g:1413:1: rule__Database__TablasAssignment_1 : ( ruleTabla ) ;
    public final void rule__Database__TablasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1417:1: ( ( ruleTabla ) )
            // InternalSql.g:1418:2: ( ruleTabla )
            {
            // InternalSql.g:1418:2: ( ruleTabla )
            // InternalSql.g:1419:3: ruleTabla
            {
             before(grammarAccess.getDatabaseAccess().getTablasTablaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTabla();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getTablasTablaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__TablasAssignment_1"


    // $ANTLR start "rule__Tabla__NameAssignment_4"
    // InternalSql.g:1428:1: rule__Tabla__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Tabla__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1432:1: ( ( RULE_ID ) )
            // InternalSql.g:1433:2: ( RULE_ID )
            {
            // InternalSql.g:1433:2: ( RULE_ID )
            // InternalSql.g:1434:3: RULE_ID
            {
             before(grammarAccess.getTablaAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTablaAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__NameAssignment_4"


    // $ANTLR start "rule__Tabla__ColumnasAssignment_6"
    // InternalSql.g:1443:1: rule__Tabla__ColumnasAssignment_6 : ( ruleColumna ) ;
    public final void rule__Tabla__ColumnasAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1447:1: ( ( ruleColumna ) )
            // InternalSql.g:1448:2: ( ruleColumna )
            {
            // InternalSql.g:1448:2: ( ruleColumna )
            // InternalSql.g:1449:3: ruleColumna
            {
             before(grammarAccess.getTablaAccess().getColumnasColumnaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleColumna();

            state._fsp--;

             after(grammarAccess.getTablaAccess().getColumnasColumnaParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__ColumnasAssignment_6"


    // $ANTLR start "rule__Tabla__PrimarysAssignment_7"
    // InternalSql.g:1458:1: rule__Tabla__PrimarysAssignment_7 : ( rulePrimary ) ;
    public final void rule__Tabla__PrimarysAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1462:1: ( ( rulePrimary ) )
            // InternalSql.g:1463:2: ( rulePrimary )
            {
            // InternalSql.g:1463:2: ( rulePrimary )
            // InternalSql.g:1464:3: rulePrimary
            {
             before(grammarAccess.getTablaAccess().getPrimarysPrimaryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTablaAccess().getPrimarysPrimaryParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__PrimarysAssignment_7"


    // $ANTLR start "rule__Tabla__ForeignsAssignment_8"
    // InternalSql.g:1473:1: rule__Tabla__ForeignsAssignment_8 : ( ruleForeingKey ) ;
    public final void rule__Tabla__ForeignsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1477:1: ( ( ruleForeingKey ) )
            // InternalSql.g:1478:2: ( ruleForeingKey )
            {
            // InternalSql.g:1478:2: ( ruleForeingKey )
            // InternalSql.g:1479:3: ruleForeingKey
            {
             before(grammarAccess.getTablaAccess().getForeignsForeingKeyParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleForeingKey();

            state._fsp--;

             after(grammarAccess.getTablaAccess().getForeignsForeingKeyParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tabla__ForeignsAssignment_8"


    // $ANTLR start "rule__Columna__NameAssignment_0"
    // InternalSql.g:1488:1: rule__Columna__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Columna__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1492:1: ( ( RULE_ID ) )
            // InternalSql.g:1493:2: ( RULE_ID )
            {
            // InternalSql.g:1493:2: ( RULE_ID )
            // InternalSql.g:1494:3: RULE_ID
            {
             before(grammarAccess.getColumnaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__NameAssignment_0"


    // $ANTLR start "rule__Columna__TipoAssignment_2"
    // InternalSql.g:1503:1: rule__Columna__TipoAssignment_2 : ( ( rule__Columna__TipoAlternatives_2_0 ) ) ;
    public final void rule__Columna__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1507:1: ( ( ( rule__Columna__TipoAlternatives_2_0 ) ) )
            // InternalSql.g:1508:2: ( ( rule__Columna__TipoAlternatives_2_0 ) )
            {
            // InternalSql.g:1508:2: ( ( rule__Columna__TipoAlternatives_2_0 ) )
            // InternalSql.g:1509:3: ( rule__Columna__TipoAlternatives_2_0 )
            {
             before(grammarAccess.getColumnaAccess().getTipoAlternatives_2_0()); 
            // InternalSql.g:1510:3: ( rule__Columna__TipoAlternatives_2_0 )
            // InternalSql.g:1510:4: rule__Columna__TipoAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Columna__TipoAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnaAccess().getTipoAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__TipoAssignment_2"


    // $ANTLR start "rule__Columna__NotNullAssignment_3"
    // InternalSql.g:1518:1: rule__Columna__NotNullAssignment_3 : ( ( ' NOT NULL' ) ) ;
    public final void rule__Columna__NotNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1522:1: ( ( ( ' NOT NULL' ) ) )
            // InternalSql.g:1523:2: ( ( ' NOT NULL' ) )
            {
            // InternalSql.g:1523:2: ( ( ' NOT NULL' ) )
            // InternalSql.g:1524:3: ( ' NOT NULL' )
            {
             before(grammarAccess.getColumnaAccess().getNotNullNOTNULLKeyword_3_0()); 
            // InternalSql.g:1525:3: ( ' NOT NULL' )
            // InternalSql.g:1526:4: ' NOT NULL'
            {
             before(grammarAccess.getColumnaAccess().getNotNullNOTNULLKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getNotNullNOTNULLKeyword_3_0()); 

            }

             after(grammarAccess.getColumnaAccess().getNotNullNOTNULLKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__NotNullAssignment_3"


    // $ANTLR start "rule__Primary__ColumnAssignment_5"
    // InternalSql.g:1537:1: rule__Primary__ColumnAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1541:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1542:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1542:2: ( ( RULE_ID ) )
            // InternalSql.g:1543:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getColumnColumnaCrossReference_5_0()); 
            // InternalSql.g:1544:3: ( RULE_ID )
            // InternalSql.g:1545:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getColumnColumnaIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getColumnColumnaIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getColumnColumnaCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ColumnAssignment_5"


    // $ANTLR start "rule__Primary__ColumnAssignment_6_2"
    // InternalSql.g:1556:1: rule__Primary__ColumnAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__ColumnAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1560:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1561:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1561:2: ( ( RULE_ID ) )
            // InternalSql.g:1562:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getColumnColumnaCrossReference_6_2_0()); 
            // InternalSql.g:1563:3: ( RULE_ID )
            // InternalSql.g:1564:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getColumnColumnaIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getColumnColumnaIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getColumnColumnaCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ColumnAssignment_6_2"


    // $ANTLR start "rule__ForeingKey__NameAssignment_5"
    // InternalSql.g:1575:1: rule__ForeingKey__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__ForeingKey__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1579:1: ( ( RULE_ID ) )
            // InternalSql.g:1580:2: ( RULE_ID )
            {
            // InternalSql.g:1580:2: ( RULE_ID )
            // InternalSql.g:1581:3: RULE_ID
            {
             before(grammarAccess.getForeingKeyAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__NameAssignment_5"


    // $ANTLR start "rule__ForeingKey__ReferenceTableAssignment_10"
    // InternalSql.g:1590:1: rule__ForeingKey__ReferenceTableAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__ForeingKey__ReferenceTableAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1594:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1595:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1595:2: ( ( RULE_ID ) )
            // InternalSql.g:1596:3: ( RULE_ID )
            {
             before(grammarAccess.getForeingKeyAccess().getReferenceTableTablaCrossReference_10_0()); 
            // InternalSql.g:1597:3: ( RULE_ID )
            // InternalSql.g:1598:4: RULE_ID
            {
             before(grammarAccess.getForeingKeyAccess().getReferenceTableTablaIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getReferenceTableTablaIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getForeingKeyAccess().getReferenceTableTablaCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__ReferenceTableAssignment_10"


    // $ANTLR start "rule__ForeingKey__ReferenceColumnAssignment_12"
    // InternalSql.g:1609:1: rule__ForeingKey__ReferenceColumnAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__ForeingKey__ReferenceColumnAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1613:1: ( ( ( RULE_ID ) ) )
            // InternalSql.g:1614:2: ( ( RULE_ID ) )
            {
            // InternalSql.g:1614:2: ( ( RULE_ID ) )
            // InternalSql.g:1615:3: ( RULE_ID )
            {
             before(grammarAccess.getForeingKeyAccess().getReferenceColumnColumnaCrossReference_12_0()); 
            // InternalSql.g:1616:3: ( RULE_ID )
            // InternalSql.g:1617:4: RULE_ID
            {
             before(grammarAccess.getForeingKeyAccess().getReferenceColumnColumnaIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeingKeyAccess().getReferenceColumnColumnaIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getForeingKeyAccess().getReferenceColumnColumnaCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeingKey__ReferenceColumnAssignment_12"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});

}