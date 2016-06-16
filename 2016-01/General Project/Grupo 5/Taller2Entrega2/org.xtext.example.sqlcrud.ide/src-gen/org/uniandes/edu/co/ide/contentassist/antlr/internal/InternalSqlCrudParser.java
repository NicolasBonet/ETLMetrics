package org.uniandes.edu.co.ide.contentassist.antlr.internal;

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
import org.uniandes.edu.co.services.SqlCrudGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlCrudParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_TABLA", "RULE_LPAR", "RULE_RPAR", "RULE_PK", "RULE_COMMA", "RULE_FK", "RULE_REFERENCES", "RULE_VARCH", "RULE_NOMBRE", "RULE_NOTNULL", "RULE_TIPOINT", "RULE_ENTERO", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'BINARY'", "'VARBINARY'", "'SMALLINT'", "'BIGINT'", "'BOOLEAN'", "'REAL'", "'FLOAT'", "'DATE'", "'TIMESTAMP'", "'MULTISET'", "'XML'"
    };
    public static final int RULE_NOMBRE=13;
    public static final int RULE_PK=8;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_CREATE=4;
    public static final int RULE_TIPOINT=15;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_REFERENCES=11;
    public static final int RULE_ID=17;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=22;
    public static final int RULE_TABLA=5;
    public static final int RULE_NOTNULL=14;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_FK=10;
    public static final int T__26=26;
    public static final int RULE_VARCH=12;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__24=24;
    public static final int RULE_RPAR=7;
    public static final int T__25=25;
    public static final int RULE_ENTERO=16;
    public static final int RULE_LPAR=6;

    // delegates
    // delegators


        public InternalSqlCrudParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlCrudParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlCrudParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSqlCrud.g"; }


    	private SqlCrudGrammarAccess grammarAccess;

    	public void setGrammarAccess(SqlCrudGrammarAccess grammarAccess) {
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
    // InternalSqlCrud.g:53:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalSqlCrud.g:54:1: ( ruleDatabase EOF )
            // InternalSqlCrud.g:55:1: ruleDatabase EOF
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
    // InternalSqlCrud.g:62:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:66:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalSqlCrud.g:67:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalSqlCrud.g:67:2: ( ( rule__Database__Group__0 ) )
            // InternalSqlCrud.g:68:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalSqlCrud.g:69:3: ( rule__Database__Group__0 )
            // InternalSqlCrud.g:69:4: rule__Database__Group__0
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
    // InternalSqlCrud.g:78:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSqlCrud.g:79:1: ( ruleTable EOF )
            // InternalSqlCrud.g:80:1: ruleTable EOF
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
    // InternalSqlCrud.g:87:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:91:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSqlCrud.g:92:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSqlCrud.g:92:2: ( ( rule__Table__Group__0 ) )
            // InternalSqlCrud.g:93:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSqlCrud.g:94:3: ( rule__Table__Group__0 )
            // InternalSqlCrud.g:94:4: rule__Table__Group__0
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


    // $ANTLR start "entryRulePrimaryKey"
    // InternalSqlCrud.g:103:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSqlCrud.g:104:1: ( rulePrimaryKey EOF )
            // InternalSqlCrud.g:105:1: rulePrimaryKey EOF
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
    // InternalSqlCrud.g:112:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:116:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSqlCrud.g:117:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSqlCrud.g:117:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSqlCrud.g:118:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSqlCrud.g:119:3: ( rule__PrimaryKey__Group__0 )
            // InternalSqlCrud.g:119:4: rule__PrimaryKey__Group__0
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
    // InternalSqlCrud.g:128:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSqlCrud.g:129:1: ( ruleForeignKey EOF )
            // InternalSqlCrud.g:130:1: ruleForeignKey EOF
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
    // InternalSqlCrud.g:137:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:141:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSqlCrud.g:142:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSqlCrud.g:142:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSqlCrud.g:143:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSqlCrud.g:144:3: ( rule__ForeignKey__Group__0 )
            // InternalSqlCrud.g:144:4: rule__ForeignKey__Group__0
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


    // $ANTLR start "entryRuleColumna"
    // InternalSqlCrud.g:153:1: entryRuleColumna : ruleColumna EOF ;
    public final void entryRuleColumna() throws RecognitionException {
        try {
            // InternalSqlCrud.g:154:1: ( ruleColumna EOF )
            // InternalSqlCrud.g:155:1: ruleColumna EOF
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
    // InternalSqlCrud.g:162:1: ruleColumna : ( ( rule__Columna__Group__0 ) ) ;
    public final void ruleColumna() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:166:2: ( ( ( rule__Columna__Group__0 ) ) )
            // InternalSqlCrud.g:167:2: ( ( rule__Columna__Group__0 ) )
            {
            // InternalSqlCrud.g:167:2: ( ( rule__Columna__Group__0 ) )
            // InternalSqlCrud.g:168:3: ( rule__Columna__Group__0 )
            {
             before(grammarAccess.getColumnaAccess().getGroup()); 
            // InternalSqlCrud.g:169:3: ( rule__Columna__Group__0 )
            // InternalSqlCrud.g:169:4: rule__Columna__Group__0
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


    // $ANTLR start "entryRuleColumnTipoEnum"
    // InternalSqlCrud.g:178:1: entryRuleColumnTipoEnum : ruleColumnTipoEnum EOF ;
    public final void entryRuleColumnTipoEnum() throws RecognitionException {
        try {
            // InternalSqlCrud.g:179:1: ( ruleColumnTipoEnum EOF )
            // InternalSqlCrud.g:180:1: ruleColumnTipoEnum EOF
            {
             before(grammarAccess.getColumnTipoEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnTipoEnum();

            state._fsp--;

             after(grammarAccess.getColumnTipoEnumRule()); 
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
    // $ANTLR end "entryRuleColumnTipoEnum"


    // $ANTLR start "ruleColumnTipoEnum"
    // InternalSqlCrud.g:187:1: ruleColumnTipoEnum : ( ( rule__ColumnTipoEnum__Alternatives ) ) ;
    public final void ruleColumnTipoEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:191:2: ( ( ( rule__ColumnTipoEnum__Alternatives ) ) )
            // InternalSqlCrud.g:192:2: ( ( rule__ColumnTipoEnum__Alternatives ) )
            {
            // InternalSqlCrud.g:192:2: ( ( rule__ColumnTipoEnum__Alternatives ) )
            // InternalSqlCrud.g:193:3: ( rule__ColumnTipoEnum__Alternatives )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getAlternatives()); 
            // InternalSqlCrud.g:194:3: ( rule__ColumnTipoEnum__Alternatives )
            // InternalSqlCrud.g:194:4: rule__ColumnTipoEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnTipoEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnTipoEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnTipoEnum"


    // $ANTLR start "entryRuleVarchar"
    // InternalSqlCrud.g:203:1: entryRuleVarchar : ruleVarchar EOF ;
    public final void entryRuleVarchar() throws RecognitionException {
        try {
            // InternalSqlCrud.g:204:1: ( ruleVarchar EOF )
            // InternalSqlCrud.g:205:1: ruleVarchar EOF
            {
             before(grammarAccess.getVarcharRule()); 
            pushFollow(FOLLOW_1);
            ruleVarchar();

            state._fsp--;

             after(grammarAccess.getVarcharRule()); 
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
    // $ANTLR end "entryRuleVarchar"


    // $ANTLR start "ruleVarchar"
    // InternalSqlCrud.g:212:1: ruleVarchar : ( ( rule__Varchar__Group__0 ) ) ;
    public final void ruleVarchar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:216:2: ( ( ( rule__Varchar__Group__0 ) ) )
            // InternalSqlCrud.g:217:2: ( ( rule__Varchar__Group__0 ) )
            {
            // InternalSqlCrud.g:217:2: ( ( rule__Varchar__Group__0 ) )
            // InternalSqlCrud.g:218:3: ( rule__Varchar__Group__0 )
            {
             before(grammarAccess.getVarcharAccess().getGroup()); 
            // InternalSqlCrud.g:219:3: ( rule__Varchar__Group__0 )
            // InternalSqlCrud.g:219:4: rule__Varchar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Varchar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarcharAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarchar"


    // $ANTLR start "entryRuleBinary"
    // InternalSqlCrud.g:228:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalSqlCrud.g:229:1: ( ruleBinary EOF )
            // InternalSqlCrud.g:230:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalSqlCrud.g:237:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:241:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalSqlCrud.g:242:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalSqlCrud.g:242:2: ( ( rule__Binary__Group__0 ) )
            // InternalSqlCrud.g:243:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalSqlCrud.g:244:3: ( rule__Binary__Group__0 )
            // InternalSqlCrud.g:244:4: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleVarBinary"
    // InternalSqlCrud.g:253:1: entryRuleVarBinary : ruleVarBinary EOF ;
    public final void entryRuleVarBinary() throws RecognitionException {
        try {
            // InternalSqlCrud.g:254:1: ( ruleVarBinary EOF )
            // InternalSqlCrud.g:255:1: ruleVarBinary EOF
            {
             before(grammarAccess.getVarBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleVarBinary();

            state._fsp--;

             after(grammarAccess.getVarBinaryRule()); 
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
    // $ANTLR end "entryRuleVarBinary"


    // $ANTLR start "ruleVarBinary"
    // InternalSqlCrud.g:262:1: ruleVarBinary : ( ( rule__VarBinary__Group__0 ) ) ;
    public final void ruleVarBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:266:2: ( ( ( rule__VarBinary__Group__0 ) ) )
            // InternalSqlCrud.g:267:2: ( ( rule__VarBinary__Group__0 ) )
            {
            // InternalSqlCrud.g:267:2: ( ( rule__VarBinary__Group__0 ) )
            // InternalSqlCrud.g:268:3: ( rule__VarBinary__Group__0 )
            {
             before(grammarAccess.getVarBinaryAccess().getGroup()); 
            // InternalSqlCrud.g:269:3: ( rule__VarBinary__Group__0 )
            // InternalSqlCrud.g:269:4: rule__VarBinary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarBinary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarBinary"


    // $ANTLR start "rule__ColumnTipoEnum__Alternatives"
    // InternalSqlCrud.g:277:1: rule__ColumnTipoEnum__Alternatives : ( ( ( rule__ColumnTipoEnum__InttAssignment_0 ) ) | ( ( rule__ColumnTipoEnum__VarchartAssignment_1 ) ) | ( ( rule__ColumnTipoEnum__SmallinttAssignment_2 ) ) | ( ( rule__ColumnTipoEnum__BiginttAssignment_3 ) ) | ( ( rule__ColumnTipoEnum__BooleantAssignment_4 ) ) | ( ( rule__ColumnTipoEnum__RealtAssignment_5 ) ) | ( ( rule__ColumnTipoEnum__FloattAssignment_6 ) ) | ( ( rule__ColumnTipoEnum__BinarytAssignment_7 ) ) | ( ( rule__ColumnTipoEnum__VarbinarytAssignment_8 ) ) | ( ( rule__ColumnTipoEnum__DatetAssignment_9 ) ) | ( ( rule__ColumnTipoEnum__TimestamptAssignment_10 ) ) | ( ( rule__ColumnTipoEnum__MultisettAssignment_11 ) ) | ( ( rule__ColumnTipoEnum__XmltAssignment_12 ) ) );
    public final void rule__ColumnTipoEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:281:1: ( ( ( rule__ColumnTipoEnum__InttAssignment_0 ) ) | ( ( rule__ColumnTipoEnum__VarchartAssignment_1 ) ) | ( ( rule__ColumnTipoEnum__SmallinttAssignment_2 ) ) | ( ( rule__ColumnTipoEnum__BiginttAssignment_3 ) ) | ( ( rule__ColumnTipoEnum__BooleantAssignment_4 ) ) | ( ( rule__ColumnTipoEnum__RealtAssignment_5 ) ) | ( ( rule__ColumnTipoEnum__FloattAssignment_6 ) ) | ( ( rule__ColumnTipoEnum__BinarytAssignment_7 ) ) | ( ( rule__ColumnTipoEnum__VarbinarytAssignment_8 ) ) | ( ( rule__ColumnTipoEnum__DatetAssignment_9 ) ) | ( ( rule__ColumnTipoEnum__TimestamptAssignment_10 ) ) | ( ( rule__ColumnTipoEnum__MultisettAssignment_11 ) ) | ( ( rule__ColumnTipoEnum__XmltAssignment_12 ) ) )
            int alt1=13;
            switch ( input.LA(1) ) {
            case RULE_TIPOINT:
                {
                alt1=1;
                }
                break;
            case RULE_VARCH:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 29:
                {
                alt1=5;
                }
                break;
            case 30:
                {
                alt1=6;
                }
                break;
            case 31:
                {
                alt1=7;
                }
                break;
            case 25:
                {
                alt1=8;
                }
                break;
            case 26:
                {
                alt1=9;
                }
                break;
            case 32:
                {
                alt1=10;
                }
                break;
            case 33:
                {
                alt1=11;
                }
                break;
            case 34:
                {
                alt1=12;
                }
                break;
            case 35:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSqlCrud.g:282:2: ( ( rule__ColumnTipoEnum__InttAssignment_0 ) )
                    {
                    // InternalSqlCrud.g:282:2: ( ( rule__ColumnTipoEnum__InttAssignment_0 ) )
                    // InternalSqlCrud.g:283:3: ( rule__ColumnTipoEnum__InttAssignment_0 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getInttAssignment_0()); 
                    // InternalSqlCrud.g:284:3: ( rule__ColumnTipoEnum__InttAssignment_0 )
                    // InternalSqlCrud.g:284:4: rule__ColumnTipoEnum__InttAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__InttAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getInttAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlCrud.g:288:2: ( ( rule__ColumnTipoEnum__VarchartAssignment_1 ) )
                    {
                    // InternalSqlCrud.g:288:2: ( ( rule__ColumnTipoEnum__VarchartAssignment_1 ) )
                    // InternalSqlCrud.g:289:3: ( rule__ColumnTipoEnum__VarchartAssignment_1 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getVarchartAssignment_1()); 
                    // InternalSqlCrud.g:290:3: ( rule__ColumnTipoEnum__VarchartAssignment_1 )
                    // InternalSqlCrud.g:290:4: rule__ColumnTipoEnum__VarchartAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__VarchartAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getVarchartAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlCrud.g:294:2: ( ( rule__ColumnTipoEnum__SmallinttAssignment_2 ) )
                    {
                    // InternalSqlCrud.g:294:2: ( ( rule__ColumnTipoEnum__SmallinttAssignment_2 ) )
                    // InternalSqlCrud.g:295:3: ( rule__ColumnTipoEnum__SmallinttAssignment_2 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getSmallinttAssignment_2()); 
                    // InternalSqlCrud.g:296:3: ( rule__ColumnTipoEnum__SmallinttAssignment_2 )
                    // InternalSqlCrud.g:296:4: rule__ColumnTipoEnum__SmallinttAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__SmallinttAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getSmallinttAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlCrud.g:300:2: ( ( rule__ColumnTipoEnum__BiginttAssignment_3 ) )
                    {
                    // InternalSqlCrud.g:300:2: ( ( rule__ColumnTipoEnum__BiginttAssignment_3 ) )
                    // InternalSqlCrud.g:301:3: ( rule__ColumnTipoEnum__BiginttAssignment_3 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getBiginttAssignment_3()); 
                    // InternalSqlCrud.g:302:3: ( rule__ColumnTipoEnum__BiginttAssignment_3 )
                    // InternalSqlCrud.g:302:4: rule__ColumnTipoEnum__BiginttAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__BiginttAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getBiginttAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlCrud.g:306:2: ( ( rule__ColumnTipoEnum__BooleantAssignment_4 ) )
                    {
                    // InternalSqlCrud.g:306:2: ( ( rule__ColumnTipoEnum__BooleantAssignment_4 ) )
                    // InternalSqlCrud.g:307:3: ( rule__ColumnTipoEnum__BooleantAssignment_4 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getBooleantAssignment_4()); 
                    // InternalSqlCrud.g:308:3: ( rule__ColumnTipoEnum__BooleantAssignment_4 )
                    // InternalSqlCrud.g:308:4: rule__ColumnTipoEnum__BooleantAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__BooleantAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getBooleantAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSqlCrud.g:312:2: ( ( rule__ColumnTipoEnum__RealtAssignment_5 ) )
                    {
                    // InternalSqlCrud.g:312:2: ( ( rule__ColumnTipoEnum__RealtAssignment_5 ) )
                    // InternalSqlCrud.g:313:3: ( rule__ColumnTipoEnum__RealtAssignment_5 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getRealtAssignment_5()); 
                    // InternalSqlCrud.g:314:3: ( rule__ColumnTipoEnum__RealtAssignment_5 )
                    // InternalSqlCrud.g:314:4: rule__ColumnTipoEnum__RealtAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__RealtAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getRealtAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSqlCrud.g:318:2: ( ( rule__ColumnTipoEnum__FloattAssignment_6 ) )
                    {
                    // InternalSqlCrud.g:318:2: ( ( rule__ColumnTipoEnum__FloattAssignment_6 ) )
                    // InternalSqlCrud.g:319:3: ( rule__ColumnTipoEnum__FloattAssignment_6 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getFloattAssignment_6()); 
                    // InternalSqlCrud.g:320:3: ( rule__ColumnTipoEnum__FloattAssignment_6 )
                    // InternalSqlCrud.g:320:4: rule__ColumnTipoEnum__FloattAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__FloattAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getFloattAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSqlCrud.g:324:2: ( ( rule__ColumnTipoEnum__BinarytAssignment_7 ) )
                    {
                    // InternalSqlCrud.g:324:2: ( ( rule__ColumnTipoEnum__BinarytAssignment_7 ) )
                    // InternalSqlCrud.g:325:3: ( rule__ColumnTipoEnum__BinarytAssignment_7 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getBinarytAssignment_7()); 
                    // InternalSqlCrud.g:326:3: ( rule__ColumnTipoEnum__BinarytAssignment_7 )
                    // InternalSqlCrud.g:326:4: rule__ColumnTipoEnum__BinarytAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__BinarytAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getBinarytAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSqlCrud.g:330:2: ( ( rule__ColumnTipoEnum__VarbinarytAssignment_8 ) )
                    {
                    // InternalSqlCrud.g:330:2: ( ( rule__ColumnTipoEnum__VarbinarytAssignment_8 ) )
                    // InternalSqlCrud.g:331:3: ( rule__ColumnTipoEnum__VarbinarytAssignment_8 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getVarbinarytAssignment_8()); 
                    // InternalSqlCrud.g:332:3: ( rule__ColumnTipoEnum__VarbinarytAssignment_8 )
                    // InternalSqlCrud.g:332:4: rule__ColumnTipoEnum__VarbinarytAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__VarbinarytAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getVarbinarytAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSqlCrud.g:336:2: ( ( rule__ColumnTipoEnum__DatetAssignment_9 ) )
                    {
                    // InternalSqlCrud.g:336:2: ( ( rule__ColumnTipoEnum__DatetAssignment_9 ) )
                    // InternalSqlCrud.g:337:3: ( rule__ColumnTipoEnum__DatetAssignment_9 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getDatetAssignment_9()); 
                    // InternalSqlCrud.g:338:3: ( rule__ColumnTipoEnum__DatetAssignment_9 )
                    // InternalSqlCrud.g:338:4: rule__ColumnTipoEnum__DatetAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__DatetAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getDatetAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSqlCrud.g:342:2: ( ( rule__ColumnTipoEnum__TimestamptAssignment_10 ) )
                    {
                    // InternalSqlCrud.g:342:2: ( ( rule__ColumnTipoEnum__TimestamptAssignment_10 ) )
                    // InternalSqlCrud.g:343:3: ( rule__ColumnTipoEnum__TimestamptAssignment_10 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getTimestamptAssignment_10()); 
                    // InternalSqlCrud.g:344:3: ( rule__ColumnTipoEnum__TimestamptAssignment_10 )
                    // InternalSqlCrud.g:344:4: rule__ColumnTipoEnum__TimestamptAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__TimestamptAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getTimestamptAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSqlCrud.g:348:2: ( ( rule__ColumnTipoEnum__MultisettAssignment_11 ) )
                    {
                    // InternalSqlCrud.g:348:2: ( ( rule__ColumnTipoEnum__MultisettAssignment_11 ) )
                    // InternalSqlCrud.g:349:3: ( rule__ColumnTipoEnum__MultisettAssignment_11 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getMultisettAssignment_11()); 
                    // InternalSqlCrud.g:350:3: ( rule__ColumnTipoEnum__MultisettAssignment_11 )
                    // InternalSqlCrud.g:350:4: rule__ColumnTipoEnum__MultisettAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__MultisettAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getMultisettAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSqlCrud.g:354:2: ( ( rule__ColumnTipoEnum__XmltAssignment_12 ) )
                    {
                    // InternalSqlCrud.g:354:2: ( ( rule__ColumnTipoEnum__XmltAssignment_12 ) )
                    // InternalSqlCrud.g:355:3: ( rule__ColumnTipoEnum__XmltAssignment_12 )
                    {
                     before(grammarAccess.getColumnTipoEnumAccess().getXmltAssignment_12()); 
                    // InternalSqlCrud.g:356:3: ( rule__ColumnTipoEnum__XmltAssignment_12 )
                    // InternalSqlCrud.g:356:4: rule__ColumnTipoEnum__XmltAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnTipoEnum__XmltAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnTipoEnumAccess().getXmltAssignment_12()); 

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
    // $ANTLR end "rule__ColumnTipoEnum__Alternatives"


    // $ANTLR start "rule__Database__Group__0"
    // InternalSqlCrud.g:364:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:368:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalSqlCrud.g:369:2: rule__Database__Group__0__Impl rule__Database__Group__1
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
    // InternalSqlCrud.g:376:1: rule__Database__Group__0__Impl : ( () ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:380:1: ( ( () ) )
            // InternalSqlCrud.g:381:1: ( () )
            {
            // InternalSqlCrud.g:381:1: ( () )
            // InternalSqlCrud.g:382:2: ()
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 
            // InternalSqlCrud.g:383:2: ()
            // InternalSqlCrud.g:383:3: 
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
    // InternalSqlCrud.g:391:1: rule__Database__Group__1 : rule__Database__Group__1__Impl ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:395:1: ( rule__Database__Group__1__Impl )
            // InternalSqlCrud.g:396:2: rule__Database__Group__1__Impl
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
    // InternalSqlCrud.g:402:1: rule__Database__Group__1__Impl : ( ( ( rule__Database__TablesAssignment_1 ) ) ( ( rule__Database__TablesAssignment_1 )* ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:406:1: ( ( ( ( rule__Database__TablesAssignment_1 ) ) ( ( rule__Database__TablesAssignment_1 )* ) ) )
            // InternalSqlCrud.g:407:1: ( ( ( rule__Database__TablesAssignment_1 ) ) ( ( rule__Database__TablesAssignment_1 )* ) )
            {
            // InternalSqlCrud.g:407:1: ( ( ( rule__Database__TablesAssignment_1 ) ) ( ( rule__Database__TablesAssignment_1 )* ) )
            // InternalSqlCrud.g:408:2: ( ( rule__Database__TablesAssignment_1 ) ) ( ( rule__Database__TablesAssignment_1 )* )
            {
            // InternalSqlCrud.g:408:2: ( ( rule__Database__TablesAssignment_1 ) )
            // InternalSqlCrud.g:409:3: ( rule__Database__TablesAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment_1()); 
            // InternalSqlCrud.g:410:3: ( rule__Database__TablesAssignment_1 )
            // InternalSqlCrud.g:410:4: rule__Database__TablesAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Database__TablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getTablesAssignment_1()); 

            }

            // InternalSqlCrud.g:413:2: ( ( rule__Database__TablesAssignment_1 )* )
            // InternalSqlCrud.g:414:3: ( rule__Database__TablesAssignment_1 )*
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment_1()); 
            // InternalSqlCrud.g:415:3: ( rule__Database__TablesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_CREATE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSqlCrud.g:415:4: rule__Database__TablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Database__TablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTablesAssignment_1()); 

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


    // $ANTLR start "rule__Table__Group__0"
    // InternalSqlCrud.g:425:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:429:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSqlCrud.g:430:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSqlCrud.g:437:1: rule__Table__Group__0__Impl : ( RULE_CREATE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:441:1: ( ( RULE_CREATE ) )
            // InternalSqlCrud.g:442:1: ( RULE_CREATE )
            {
            // InternalSqlCrud.g:442:1: ( RULE_CREATE )
            // InternalSqlCrud.g:443:2: RULE_CREATE
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
    // InternalSqlCrud.g:452:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:456:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSqlCrud.g:457:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSqlCrud.g:464:1: rule__Table__Group__1__Impl : ( ' ' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:468:1: ( ( ' ' ) )
            // InternalSqlCrud.g:469:1: ( ' ' )
            {
            // InternalSqlCrud.g:469:1: ( ' ' )
            // InternalSqlCrud.g:470:2: ' '
            {
             before(grammarAccess.getTableAccess().getSpaceKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSpaceKeyword_1()); 

            }


            }

        }
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
    // InternalSqlCrud.g:479:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:483:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSqlCrud.g:484:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSqlCrud.g:491:1: rule__Table__Group__2__Impl : ( RULE_TABLA ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:495:1: ( ( RULE_TABLA ) )
            // InternalSqlCrud.g:496:1: ( RULE_TABLA )
            {
            // InternalSqlCrud.g:496:1: ( RULE_TABLA )
            // InternalSqlCrud.g:497:2: RULE_TABLA
            {
             before(grammarAccess.getTableAccess().getTABLATerminalRuleCall_2()); 
            match(input,RULE_TABLA,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTABLATerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalSqlCrud.g:506:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:510:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSqlCrud.g:511:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSqlCrud.g:518:1: rule__Table__Group__3__Impl : ( ' ' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:522:1: ( ( ' ' ) )
            // InternalSqlCrud.g:523:1: ( ' ' )
            {
            // InternalSqlCrud.g:523:1: ( ' ' )
            // InternalSqlCrud.g:524:2: ' '
            {
             before(grammarAccess.getTableAccess().getSpaceKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSpaceKeyword_3()); 

            }


            }

        }
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
    // InternalSqlCrud.g:533:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:537:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSqlCrud.g:538:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSqlCrud.g:545:1: rule__Table__Group__4__Impl : ( ( rule__Table__NombreAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:549:1: ( ( ( rule__Table__NombreAssignment_4 ) ) )
            // InternalSqlCrud.g:550:1: ( ( rule__Table__NombreAssignment_4 ) )
            {
            // InternalSqlCrud.g:550:1: ( ( rule__Table__NombreAssignment_4 ) )
            // InternalSqlCrud.g:551:2: ( rule__Table__NombreAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getNombreAssignment_4()); 
            // InternalSqlCrud.g:552:2: ( rule__Table__NombreAssignment_4 )
            // InternalSqlCrud.g:552:3: rule__Table__NombreAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Table__NombreAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNombreAssignment_4()); 

            }


            }

        }
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
    // InternalSqlCrud.g:560:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:564:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSqlCrud.g:565:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalSqlCrud.g:572:1: rule__Table__Group__5__Impl : ( ( ' ' )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:576:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:577:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:577:1: ( ( ' ' )? )
            // InternalSqlCrud.g:578:2: ( ' ' )?
            {
             before(grammarAccess.getTableAccess().getSpaceKeyword_5()); 
            // InternalSqlCrud.g:579:2: ( ' ' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSqlCrud.g:579:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getSpaceKeyword_5()); 

            }


            }

        }
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
    // InternalSqlCrud.g:587:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:591:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalSqlCrud.g:592:2: rule__Table__Group__6__Impl rule__Table__Group__7
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
    // InternalSqlCrud.g:599:1: rule__Table__Group__6__Impl : ( RULE_LPAR ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:603:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:604:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:604:1: ( RULE_LPAR )
            // InternalSqlCrud.g:605:2: RULE_LPAR
            {
             before(grammarAccess.getTableAccess().getLPARTerminalRuleCall_6()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLPARTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalSqlCrud.g:614:1: rule__Table__Group__7 : rule__Table__Group__7__Impl rule__Table__Group__8 ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:618:1: ( rule__Table__Group__7__Impl rule__Table__Group__8 )
            // InternalSqlCrud.g:619:2: rule__Table__Group__7__Impl rule__Table__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalSqlCrud.g:626:1: rule__Table__Group__7__Impl : ( ( ( rule__Table__ColumnasAssignment_7 ) ) ( ( rule__Table__ColumnasAssignment_7 )* ) ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:630:1: ( ( ( ( rule__Table__ColumnasAssignment_7 ) ) ( ( rule__Table__ColumnasAssignment_7 )* ) ) )
            // InternalSqlCrud.g:631:1: ( ( ( rule__Table__ColumnasAssignment_7 ) ) ( ( rule__Table__ColumnasAssignment_7 )* ) )
            {
            // InternalSqlCrud.g:631:1: ( ( ( rule__Table__ColumnasAssignment_7 ) ) ( ( rule__Table__ColumnasAssignment_7 )* ) )
            // InternalSqlCrud.g:632:2: ( ( rule__Table__ColumnasAssignment_7 ) ) ( ( rule__Table__ColumnasAssignment_7 )* )
            {
            // InternalSqlCrud.g:632:2: ( ( rule__Table__ColumnasAssignment_7 ) )
            // InternalSqlCrud.g:633:3: ( rule__Table__ColumnasAssignment_7 )
            {
             before(grammarAccess.getTableAccess().getColumnasAssignment_7()); 
            // InternalSqlCrud.g:634:3: ( rule__Table__ColumnasAssignment_7 )
            // InternalSqlCrud.g:634:4: rule__Table__ColumnasAssignment_7
            {
            pushFollow(FOLLOW_10);
            rule__Table__ColumnasAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnasAssignment_7()); 

            }

            // InternalSqlCrud.g:637:2: ( ( rule__Table__ColumnasAssignment_7 )* )
            // InternalSqlCrud.g:638:3: ( rule__Table__ColumnasAssignment_7 )*
            {
             before(grammarAccess.getTableAccess().getColumnasAssignment_7()); 
            // InternalSqlCrud.g:639:3: ( rule__Table__ColumnasAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NOMBRE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSqlCrud.g:639:4: rule__Table__ColumnasAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Table__ColumnasAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getColumnasAssignment_7()); 

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
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__8"
    // InternalSqlCrud.g:648:1: rule__Table__Group__8 : rule__Table__Group__8__Impl rule__Table__Group__9 ;
    public final void rule__Table__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:652:1: ( rule__Table__Group__8__Impl rule__Table__Group__9 )
            // InternalSqlCrud.g:653:2: rule__Table__Group__8__Impl rule__Table__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__9();

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
    // InternalSqlCrud.g:660:1: rule__Table__Group__8__Impl : ( ( rule__Table__PrkeyAssignment_8 ) ) ;
    public final void rule__Table__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:664:1: ( ( ( rule__Table__PrkeyAssignment_8 ) ) )
            // InternalSqlCrud.g:665:1: ( ( rule__Table__PrkeyAssignment_8 ) )
            {
            // InternalSqlCrud.g:665:1: ( ( rule__Table__PrkeyAssignment_8 ) )
            // InternalSqlCrud.g:666:2: ( rule__Table__PrkeyAssignment_8 )
            {
             before(grammarAccess.getTableAccess().getPrkeyAssignment_8()); 
            // InternalSqlCrud.g:667:2: ( rule__Table__PrkeyAssignment_8 )
            // InternalSqlCrud.g:667:3: rule__Table__PrkeyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Table__PrkeyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getPrkeyAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Table__Group__9"
    // InternalSqlCrud.g:675:1: rule__Table__Group__9 : rule__Table__Group__9__Impl rule__Table__Group__10 ;
    public final void rule__Table__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:679:1: ( rule__Table__Group__9__Impl rule__Table__Group__10 )
            // InternalSqlCrud.g:680:2: rule__Table__Group__9__Impl rule__Table__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__10();

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
    // $ANTLR end "rule__Table__Group__9"


    // $ANTLR start "rule__Table__Group__9__Impl"
    // InternalSqlCrud.g:687:1: rule__Table__Group__9__Impl : ( ( rule__Table__ForkeysAssignment_9 )* ) ;
    public final void rule__Table__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:691:1: ( ( ( rule__Table__ForkeysAssignment_9 )* ) )
            // InternalSqlCrud.g:692:1: ( ( rule__Table__ForkeysAssignment_9 )* )
            {
            // InternalSqlCrud.g:692:1: ( ( rule__Table__ForkeysAssignment_9 )* )
            // InternalSqlCrud.g:693:2: ( rule__Table__ForkeysAssignment_9 )*
            {
             before(grammarAccess.getTableAccess().getForkeysAssignment_9()); 
            // InternalSqlCrud.g:694:2: ( rule__Table__ForkeysAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSqlCrud.g:694:3: rule__Table__ForkeysAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__ForkeysAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getForkeysAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9__Impl"


    // $ANTLR start "rule__Table__Group__10"
    // InternalSqlCrud.g:702:1: rule__Table__Group__10 : rule__Table__Group__10__Impl rule__Table__Group__11 ;
    public final void rule__Table__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:706:1: ( rule__Table__Group__10__Impl rule__Table__Group__11 )
            // InternalSqlCrud.g:707:2: rule__Table__Group__10__Impl rule__Table__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__11();

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
    // $ANTLR end "rule__Table__Group__10"


    // $ANTLR start "rule__Table__Group__10__Impl"
    // InternalSqlCrud.g:714:1: rule__Table__Group__10__Impl : ( RULE_RPAR ) ;
    public final void rule__Table__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:718:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:719:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:719:1: ( RULE_RPAR )
            // InternalSqlCrud.g:720:2: RULE_RPAR
            {
             before(grammarAccess.getTableAccess().getRPARTerminalRuleCall_10()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRPARTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10__Impl"


    // $ANTLR start "rule__Table__Group__11"
    // InternalSqlCrud.g:729:1: rule__Table__Group__11 : rule__Table__Group__11__Impl ;
    public final void rule__Table__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:733:1: ( rule__Table__Group__11__Impl )
            // InternalSqlCrud.g:734:2: rule__Table__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__11__Impl();

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
    // $ANTLR end "rule__Table__Group__11"


    // $ANTLR start "rule__Table__Group__11__Impl"
    // InternalSqlCrud.g:740:1: rule__Table__Group__11__Impl : ( ( ' ' )? ) ;
    public final void rule__Table__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:744:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:745:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:745:1: ( ( ' ' )? )
            // InternalSqlCrud.g:746:2: ( ' ' )?
            {
             before(grammarAccess.getTableAccess().getSpaceKeyword_11()); 
            // InternalSqlCrud.g:747:2: ( ' ' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSqlCrud.g:747:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getSpaceKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__11__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalSqlCrud.g:756:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:760:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSqlCrud.g:761:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlCrud.g:768:1: rule__PrimaryKey__Group__0__Impl : ( RULE_PK ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:772:1: ( ( RULE_PK ) )
            // InternalSqlCrud.g:773:1: ( RULE_PK )
            {
            // InternalSqlCrud.g:773:1: ( RULE_PK )
            // InternalSqlCrud.g:774:2: RULE_PK
            {
             before(grammarAccess.getPrimaryKeyAccess().getPKTerminalRuleCall_0()); 
            match(input,RULE_PK,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getPKTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalSqlCrud.g:783:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:787:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSqlCrud.g:788:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlCrud.g:795:1: rule__PrimaryKey__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:799:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:800:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:800:1: ( ( ' ' )? )
            // InternalSqlCrud.g:801:2: ( ' ' )?
            {
             before(grammarAccess.getPrimaryKeyAccess().getSpaceKeyword_1()); 
            // InternalSqlCrud.g:802:2: ( ' ' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSqlCrud.g:802:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPrimaryKeyAccess().getSpaceKeyword_1()); 

            }


            }

        }
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
    // InternalSqlCrud.g:810:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:814:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSqlCrud.g:815:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSqlCrud.g:822:1: rule__PrimaryKey__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:826:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:827:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:827:1: ( RULE_LPAR )
            // InternalSqlCrud.g:828:2: RULE_LPAR
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
    // InternalSqlCrud.g:837:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:841:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSqlCrud.g:842:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSqlCrud.g:849:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColsAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:853:1: ( ( ( rule__PrimaryKey__ColsAssignment_3 ) ) )
            // InternalSqlCrud.g:854:1: ( ( rule__PrimaryKey__ColsAssignment_3 ) )
            {
            // InternalSqlCrud.g:854:1: ( ( rule__PrimaryKey__ColsAssignment_3 ) )
            // InternalSqlCrud.g:855:2: ( rule__PrimaryKey__ColsAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColsAssignment_3()); 
            // InternalSqlCrud.g:856:2: ( rule__PrimaryKey__ColsAssignment_3 )
            // InternalSqlCrud.g:856:3: rule__PrimaryKey__ColsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColsAssignment_3()); 

            }


            }

        }
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
    // InternalSqlCrud.g:864:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:868:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSqlCrud.g:869:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSqlCrud.g:876:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:880:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSqlCrud.g:881:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSqlCrud.g:881:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSqlCrud.g:882:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSqlCrud.g:883:2: ( rule__PrimaryKey__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqlCrud.g:883:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSqlCrud.g:891:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:895:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSqlCrud.g:896:2: rule__PrimaryKey__Group__5__Impl
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
    // InternalSqlCrud.g:902:1: rule__PrimaryKey__Group__5__Impl : ( RULE_RPAR ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:906:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:907:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:907:1: ( RULE_RPAR )
            // InternalSqlCrud.g:908:2: RULE_RPAR
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
    // InternalSqlCrud.g:918:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:922:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSqlCrud.g:923:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSqlCrud.g:930:1: rule__PrimaryKey__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:934:1: ( ( RULE_COMMA ) )
            // InternalSqlCrud.g:935:1: ( RULE_COMMA )
            {
            // InternalSqlCrud.g:935:1: ( RULE_COMMA )
            // InternalSqlCrud.g:936:2: RULE_COMMA
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
    // InternalSqlCrud.g:945:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl rule__PrimaryKey__Group_4__2 ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:949:1: ( rule__PrimaryKey__Group_4__1__Impl rule__PrimaryKey__Group_4__2 )
            // InternalSqlCrud.g:950:2: rule__PrimaryKey__Group_4__1__Impl rule__PrimaryKey__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__PrimaryKey__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__2();

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
    // InternalSqlCrud.g:957:1: rule__PrimaryKey__Group_4__1__Impl : ( ( ' ' )? ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:961:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:962:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:962:1: ( ( ' ' )? )
            // InternalSqlCrud.g:963:2: ( ' ' )?
            {
             before(grammarAccess.getPrimaryKeyAccess().getSpaceKeyword_4_1()); 
            // InternalSqlCrud.g:964:2: ( ' ' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSqlCrud.g:964:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPrimaryKeyAccess().getSpaceKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimaryKey__Group_4__2"
    // InternalSqlCrud.g:972:1: rule__PrimaryKey__Group_4__2 : rule__PrimaryKey__Group_4__2__Impl ;
    public final void rule__PrimaryKey__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:976:1: ( rule__PrimaryKey__Group_4__2__Impl )
            // InternalSqlCrud.g:977:2: rule__PrimaryKey__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__2__Impl();

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
    // $ANTLR end "rule__PrimaryKey__Group_4__2"


    // $ANTLR start "rule__PrimaryKey__Group_4__2__Impl"
    // InternalSqlCrud.g:983:1: rule__PrimaryKey__Group_4__2__Impl : ( ( rule__PrimaryKey__ColsAssignment_4_2 ) ) ;
    public final void rule__PrimaryKey__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:987:1: ( ( ( rule__PrimaryKey__ColsAssignment_4_2 ) ) )
            // InternalSqlCrud.g:988:1: ( ( rule__PrimaryKey__ColsAssignment_4_2 ) )
            {
            // InternalSqlCrud.g:988:1: ( ( rule__PrimaryKey__ColsAssignment_4_2 ) )
            // InternalSqlCrud.g:989:2: ( rule__PrimaryKey__ColsAssignment_4_2 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColsAssignment_4_2()); 
            // InternalSqlCrud.g:990:2: ( rule__PrimaryKey__ColsAssignment_4_2 )
            // InternalSqlCrud.g:990:3: rule__PrimaryKey__ColsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // InternalSqlCrud.g:999:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1003:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSqlCrud.g:1004:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSqlCrud.g:1011:1: rule__ForeignKey__Group__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1015:1: ( ( RULE_COMMA ) )
            // InternalSqlCrud.g:1016:1: ( RULE_COMMA )
            {
            // InternalSqlCrud.g:1016:1: ( RULE_COMMA )
            // InternalSqlCrud.g:1017:2: RULE_COMMA
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
    // InternalSqlCrud.g:1026:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1030:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSqlCrud.g:1031:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSqlCrud.g:1038:1: rule__ForeignKey__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1042:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1043:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1043:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1044:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_1()); 
            // InternalSqlCrud.g:1045:2: ( ' ' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlCrud.g:1045:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_1()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1053:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1057:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSqlCrud.g:1058:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlCrud.g:1065:1: rule__ForeignKey__Group__2__Impl : ( RULE_FK ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1069:1: ( ( RULE_FK ) )
            // InternalSqlCrud.g:1070:1: ( RULE_FK )
            {
            // InternalSqlCrud.g:1070:1: ( RULE_FK )
            // InternalSqlCrud.g:1071:2: RULE_FK
            {
             before(grammarAccess.getForeignKeyAccess().getFKTerminalRuleCall_2()); 
            match(input,RULE_FK,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getFKTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1080:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1084:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSqlCrud.g:1085:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
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
    // InternalSqlCrud.g:1092:1: rule__ForeignKey__Group__3__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1096:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1097:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1097:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1098:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_3()); 
            // InternalSqlCrud.g:1099:2: ( ' ' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSqlCrud.g:1099:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_3()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1107:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1111:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSqlCrud.g:1112:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSqlCrud.g:1119:1: rule__ForeignKey__Group__4__Impl : ( RULE_LPAR ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1123:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:1124:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:1124:1: ( RULE_LPAR )
            // InternalSqlCrud.g:1125:2: RULE_LPAR
            {
             before(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_4()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1134:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1138:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSqlCrud.g:1139:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
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
    // InternalSqlCrud.g:1146:1: rule__ForeignKey__Group__5__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1150:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1151:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1151:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1152:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_5()); 
            // InternalSqlCrud.g:1153:2: ( ' ' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlCrud.g:1153:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_5()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1161:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1165:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSqlCrud.g:1166:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalSqlCrud.g:1173:1: rule__ForeignKey__Group__6__Impl : ( ( rule__ForeignKey__ColumnAssignment_6 ) ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1177:1: ( ( ( rule__ForeignKey__ColumnAssignment_6 ) ) )
            // InternalSqlCrud.g:1178:1: ( ( rule__ForeignKey__ColumnAssignment_6 ) )
            {
            // InternalSqlCrud.g:1178:1: ( ( rule__ForeignKey__ColumnAssignment_6 ) )
            // InternalSqlCrud.g:1179:2: ( rule__ForeignKey__ColumnAssignment_6 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAssignment_6()); 
            // InternalSqlCrud.g:1180:2: ( rule__ForeignKey__ColumnAssignment_6 )
            // InternalSqlCrud.g:1180:3: rule__ForeignKey__ColumnAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnAssignment_6()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1188:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1192:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSqlCrud.g:1193:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalSqlCrud.g:1200:1: rule__ForeignKey__Group__7__Impl : ( RULE_RPAR ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1204:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:1205:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:1205:1: ( RULE_RPAR )
            // InternalSqlCrud.g:1206:2: RULE_RPAR
            {
             before(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_7()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_7()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1215:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1219:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSqlCrud.g:1220:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalSqlCrud.g:1227:1: rule__ForeignKey__Group__8__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1231:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1232:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1232:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1233:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_8()); 
            // InternalSqlCrud.g:1234:2: ( ' ' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSqlCrud.g:1234:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_8()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1242:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1246:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSqlCrud.g:1247:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_5);
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
    // InternalSqlCrud.g:1254:1: rule__ForeignKey__Group__9__Impl : ( RULE_REFERENCES ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1258:1: ( ( RULE_REFERENCES ) )
            // InternalSqlCrud.g:1259:1: ( RULE_REFERENCES )
            {
            // InternalSqlCrud.g:1259:1: ( RULE_REFERENCES )
            // InternalSqlCrud.g:1260:2: RULE_REFERENCES
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_9()); 
            match(input,RULE_REFERENCES,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_9()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1269:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1273:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSqlCrud.g:1274:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
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
    // InternalSqlCrud.g:1281:1: rule__ForeignKey__Group__10__Impl : ( ' ' ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1285:1: ( ( ' ' ) )
            // InternalSqlCrud.g:1286:1: ( ' ' )
            {
            // InternalSqlCrud.g:1286:1: ( ' ' )
            // InternalSqlCrud.g:1287:2: ' '
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_10()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1296:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12 ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1300:1: ( rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12 )
            // InternalSqlCrud.g:1301:2: rule__ForeignKey__Group__11__Impl rule__ForeignKey__Group__12
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlCrud.g:1308:1: rule__ForeignKey__Group__11__Impl : ( ( rule__ForeignKey__ReferencetabAssignment_11 ) ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1312:1: ( ( ( rule__ForeignKey__ReferencetabAssignment_11 ) ) )
            // InternalSqlCrud.g:1313:1: ( ( rule__ForeignKey__ReferencetabAssignment_11 ) )
            {
            // InternalSqlCrud.g:1313:1: ( ( rule__ForeignKey__ReferencetabAssignment_11 ) )
            // InternalSqlCrud.g:1314:2: ( rule__ForeignKey__ReferencetabAssignment_11 )
            {
             before(grammarAccess.getForeignKeyAccess().getReferencetabAssignment_11()); 
            // InternalSqlCrud.g:1315:2: ( rule__ForeignKey__ReferencetabAssignment_11 )
            // InternalSqlCrud.g:1315:3: rule__ForeignKey__ReferencetabAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ReferencetabAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getReferencetabAssignment_11()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1323:1: rule__ForeignKey__Group__12 : rule__ForeignKey__Group__12__Impl rule__ForeignKey__Group__13 ;
    public final void rule__ForeignKey__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1327:1: ( rule__ForeignKey__Group__12__Impl rule__ForeignKey__Group__13 )
            // InternalSqlCrud.g:1328:2: rule__ForeignKey__Group__12__Impl rule__ForeignKey__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__ForeignKey__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__13();

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
    // InternalSqlCrud.g:1335:1: rule__ForeignKey__Group__12__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1339:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1340:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1340:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1341:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_12()); 
            // InternalSqlCrud.g:1342:2: ( ' ' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSqlCrud.g:1342:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__ForeignKey__Group__13"
    // InternalSqlCrud.g:1350:1: rule__ForeignKey__Group__13 : rule__ForeignKey__Group__13__Impl rule__ForeignKey__Group__14 ;
    public final void rule__ForeignKey__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1354:1: ( rule__ForeignKey__Group__13__Impl rule__ForeignKey__Group__14 )
            // InternalSqlCrud.g:1355:2: rule__ForeignKey__Group__13__Impl rule__ForeignKey__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__ForeignKey__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__14();

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
    // $ANTLR end "rule__ForeignKey__Group__13"


    // $ANTLR start "rule__ForeignKey__Group__13__Impl"
    // InternalSqlCrud.g:1362:1: rule__ForeignKey__Group__13__Impl : ( RULE_LPAR ) ;
    public final void rule__ForeignKey__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1366:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:1367:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:1367:1: ( RULE_LPAR )
            // InternalSqlCrud.g:1368:2: RULE_LPAR
            {
             before(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_13()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__13__Impl"


    // $ANTLR start "rule__ForeignKey__Group__14"
    // InternalSqlCrud.g:1377:1: rule__ForeignKey__Group__14 : rule__ForeignKey__Group__14__Impl rule__ForeignKey__Group__15 ;
    public final void rule__ForeignKey__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1381:1: ( rule__ForeignKey__Group__14__Impl rule__ForeignKey__Group__15 )
            // InternalSqlCrud.g:1382:2: rule__ForeignKey__Group__14__Impl rule__ForeignKey__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__ForeignKey__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__15();

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
    // $ANTLR end "rule__ForeignKey__Group__14"


    // $ANTLR start "rule__ForeignKey__Group__14__Impl"
    // InternalSqlCrud.g:1389:1: rule__ForeignKey__Group__14__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1393:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1394:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1394:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1395:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_14()); 
            // InternalSqlCrud.g:1396:2: ( ' ' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlCrud.g:1396:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__14__Impl"


    // $ANTLR start "rule__ForeignKey__Group__15"
    // InternalSqlCrud.g:1404:1: rule__ForeignKey__Group__15 : rule__ForeignKey__Group__15__Impl rule__ForeignKey__Group__16 ;
    public final void rule__ForeignKey__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1408:1: ( rule__ForeignKey__Group__15__Impl rule__ForeignKey__Group__16 )
            // InternalSqlCrud.g:1409:2: rule__ForeignKey__Group__15__Impl rule__ForeignKey__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__ForeignKey__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__16();

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
    // $ANTLR end "rule__ForeignKey__Group__15"


    // $ANTLR start "rule__ForeignKey__Group__15__Impl"
    // InternalSqlCrud.g:1416:1: rule__ForeignKey__Group__15__Impl : ( ( rule__ForeignKey__ReferencecolAssignment_15 ) ) ;
    public final void rule__ForeignKey__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1420:1: ( ( ( rule__ForeignKey__ReferencecolAssignment_15 ) ) )
            // InternalSqlCrud.g:1421:1: ( ( rule__ForeignKey__ReferencecolAssignment_15 ) )
            {
            // InternalSqlCrud.g:1421:1: ( ( rule__ForeignKey__ReferencecolAssignment_15 ) )
            // InternalSqlCrud.g:1422:2: ( rule__ForeignKey__ReferencecolAssignment_15 )
            {
             before(grammarAccess.getForeignKeyAccess().getReferencecolAssignment_15()); 
            // InternalSqlCrud.g:1423:2: ( rule__ForeignKey__ReferencecolAssignment_15 )
            // InternalSqlCrud.g:1423:3: rule__ForeignKey__ReferencecolAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ReferencecolAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getReferencecolAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__15__Impl"


    // $ANTLR start "rule__ForeignKey__Group__16"
    // InternalSqlCrud.g:1431:1: rule__ForeignKey__Group__16 : rule__ForeignKey__Group__16__Impl rule__ForeignKey__Group__17 ;
    public final void rule__ForeignKey__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1435:1: ( rule__ForeignKey__Group__16__Impl rule__ForeignKey__Group__17 )
            // InternalSqlCrud.g:1436:2: rule__ForeignKey__Group__16__Impl rule__ForeignKey__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__ForeignKey__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__17();

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
    // $ANTLR end "rule__ForeignKey__Group__16"


    // $ANTLR start "rule__ForeignKey__Group__16__Impl"
    // InternalSqlCrud.g:1443:1: rule__ForeignKey__Group__16__Impl : ( RULE_RPAR ) ;
    public final void rule__ForeignKey__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1447:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:1448:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:1448:1: ( RULE_RPAR )
            // InternalSqlCrud.g:1449:2: RULE_RPAR
            {
             before(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_16()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__16__Impl"


    // $ANTLR start "rule__ForeignKey__Group__17"
    // InternalSqlCrud.g:1458:1: rule__ForeignKey__Group__17 : rule__ForeignKey__Group__17__Impl ;
    public final void rule__ForeignKey__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1462:1: ( rule__ForeignKey__Group__17__Impl )
            // InternalSqlCrud.g:1463:2: rule__ForeignKey__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__17__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group__17"


    // $ANTLR start "rule__ForeignKey__Group__17__Impl"
    // InternalSqlCrud.g:1469:1: rule__ForeignKey__Group__17__Impl : ( ( ' ' )? ) ;
    public final void rule__ForeignKey__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1473:1: ( ( ( ' ' )? ) )
            // InternalSqlCrud.g:1474:1: ( ( ' ' )? )
            {
            // InternalSqlCrud.g:1474:1: ( ( ' ' )? )
            // InternalSqlCrud.g:1475:2: ( ' ' )?
            {
             before(grammarAccess.getForeignKeyAccess().getSpaceKeyword_17()); 
            // InternalSqlCrud.g:1476:2: ( ' ' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSqlCrud.g:1476:3: ' '
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getSpaceKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__17__Impl"


    // $ANTLR start "rule__Columna__Group__0"
    // InternalSqlCrud.g:1485:1: rule__Columna__Group__0 : rule__Columna__Group__0__Impl rule__Columna__Group__1 ;
    public final void rule__Columna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1489:1: ( rule__Columna__Group__0__Impl rule__Columna__Group__1 )
            // InternalSqlCrud.g:1490:2: rule__Columna__Group__0__Impl rule__Columna__Group__1
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
    // InternalSqlCrud.g:1497:1: rule__Columna__Group__0__Impl : ( ( rule__Columna__NombreAssignment_0 ) ) ;
    public final void rule__Columna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1501:1: ( ( ( rule__Columna__NombreAssignment_0 ) ) )
            // InternalSqlCrud.g:1502:1: ( ( rule__Columna__NombreAssignment_0 ) )
            {
            // InternalSqlCrud.g:1502:1: ( ( rule__Columna__NombreAssignment_0 ) )
            // InternalSqlCrud.g:1503:2: ( rule__Columna__NombreAssignment_0 )
            {
             before(grammarAccess.getColumnaAccess().getNombreAssignment_0()); 
            // InternalSqlCrud.g:1504:2: ( rule__Columna__NombreAssignment_0 )
            // InternalSqlCrud.g:1504:3: rule__Columna__NombreAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Columna__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnaAccess().getNombreAssignment_0()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1512:1: rule__Columna__Group__1 : rule__Columna__Group__1__Impl rule__Columna__Group__2 ;
    public final void rule__Columna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1516:1: ( rule__Columna__Group__1__Impl rule__Columna__Group__2 )
            // InternalSqlCrud.g:1517:2: rule__Columna__Group__1__Impl rule__Columna__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSqlCrud.g:1524:1: rule__Columna__Group__1__Impl : ( ' ' ) ;
    public final void rule__Columna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1528:1: ( ( ' ' ) )
            // InternalSqlCrud.g:1529:1: ( ' ' )
            {
            // InternalSqlCrud.g:1529:1: ( ' ' )
            // InternalSqlCrud.g:1530:2: ' '
            {
             before(grammarAccess.getColumnaAccess().getSpaceKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSqlCrud.g:1539:1: rule__Columna__Group__2 : rule__Columna__Group__2__Impl rule__Columna__Group__3 ;
    public final void rule__Columna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1543:1: ( rule__Columna__Group__2__Impl rule__Columna__Group__3 )
            // InternalSqlCrud.g:1544:2: rule__Columna__Group__2__Impl rule__Columna__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSqlCrud.g:1551:1: rule__Columna__Group__2__Impl : ( ( rule__Columna__TipoAssignment_2 ) ) ;
    public final void rule__Columna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1555:1: ( ( ( rule__Columna__TipoAssignment_2 ) ) )
            // InternalSqlCrud.g:1556:1: ( ( rule__Columna__TipoAssignment_2 ) )
            {
            // InternalSqlCrud.g:1556:1: ( ( rule__Columna__TipoAssignment_2 ) )
            // InternalSqlCrud.g:1557:2: ( rule__Columna__TipoAssignment_2 )
            {
             before(grammarAccess.getColumnaAccess().getTipoAssignment_2()); 
            // InternalSqlCrud.g:1558:2: ( rule__Columna__TipoAssignment_2 )
            // InternalSqlCrud.g:1558:3: rule__Columna__TipoAssignment_2
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
    // InternalSqlCrud.g:1566:1: rule__Columna__Group__3 : rule__Columna__Group__3__Impl rule__Columna__Group__4 ;
    public final void rule__Columna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1570:1: ( rule__Columna__Group__3__Impl rule__Columna__Group__4 )
            // InternalSqlCrud.g:1571:2: rule__Columna__Group__3__Impl rule__Columna__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSqlCrud.g:1578:1: rule__Columna__Group__3__Impl : ( ( rule__Columna__Group_3__0 )? ) ;
    public final void rule__Columna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1582:1: ( ( ( rule__Columna__Group_3__0 )? ) )
            // InternalSqlCrud.g:1583:1: ( ( rule__Columna__Group_3__0 )? )
            {
            // InternalSqlCrud.g:1583:1: ( ( rule__Columna__Group_3__0 )? )
            // InternalSqlCrud.g:1584:2: ( rule__Columna__Group_3__0 )?
            {
             before(grammarAccess.getColumnaAccess().getGroup_3()); 
            // InternalSqlCrud.g:1585:2: ( rule__Columna__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSqlCrud.g:1585:3: rule__Columna__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Columna__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnaAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalSqlCrud.g:1593:1: rule__Columna__Group__4 : rule__Columna__Group__4__Impl ;
    public final void rule__Columna__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1597:1: ( rule__Columna__Group__4__Impl )
            // InternalSqlCrud.g:1598:2: rule__Columna__Group__4__Impl
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
    // InternalSqlCrud.g:1604:1: rule__Columna__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Columna__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1608:1: ( ( RULE_COMMA ) )
            // InternalSqlCrud.g:1609:1: ( RULE_COMMA )
            {
            // InternalSqlCrud.g:1609:1: ( RULE_COMMA )
            // InternalSqlCrud.g:1610:2: RULE_COMMA
            {
             before(grammarAccess.getColumnaAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Columna__Group_3__0"
    // InternalSqlCrud.g:1620:1: rule__Columna__Group_3__0 : rule__Columna__Group_3__0__Impl rule__Columna__Group_3__1 ;
    public final void rule__Columna__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1624:1: ( rule__Columna__Group_3__0__Impl rule__Columna__Group_3__1 )
            // InternalSqlCrud.g:1625:2: rule__Columna__Group_3__0__Impl rule__Columna__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Columna__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Columna__Group_3__1();

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
    // $ANTLR end "rule__Columna__Group_3__0"


    // $ANTLR start "rule__Columna__Group_3__0__Impl"
    // InternalSqlCrud.g:1632:1: rule__Columna__Group_3__0__Impl : ( ' ' ) ;
    public final void rule__Columna__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1636:1: ( ( ' ' ) )
            // InternalSqlCrud.g:1637:1: ( ' ' )
            {
            // InternalSqlCrud.g:1637:1: ( ' ' )
            // InternalSqlCrud.g:1638:2: ' '
            {
             before(grammarAccess.getColumnaAccess().getSpaceKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getSpaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group_3__0__Impl"


    // $ANTLR start "rule__Columna__Group_3__1"
    // InternalSqlCrud.g:1647:1: rule__Columna__Group_3__1 : rule__Columna__Group_3__1__Impl ;
    public final void rule__Columna__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1651:1: ( rule__Columna__Group_3__1__Impl )
            // InternalSqlCrud.g:1652:2: rule__Columna__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Columna__Group_3__1__Impl();

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
    // $ANTLR end "rule__Columna__Group_3__1"


    // $ANTLR start "rule__Columna__Group_3__1__Impl"
    // InternalSqlCrud.g:1658:1: rule__Columna__Group_3__1__Impl : ( ( rule__Columna__NotnullableAssignment_3_1 ) ) ;
    public final void rule__Columna__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1662:1: ( ( ( rule__Columna__NotnullableAssignment_3_1 ) ) )
            // InternalSqlCrud.g:1663:1: ( ( rule__Columna__NotnullableAssignment_3_1 ) )
            {
            // InternalSqlCrud.g:1663:1: ( ( rule__Columna__NotnullableAssignment_3_1 ) )
            // InternalSqlCrud.g:1664:2: ( rule__Columna__NotnullableAssignment_3_1 )
            {
             before(grammarAccess.getColumnaAccess().getNotnullableAssignment_3_1()); 
            // InternalSqlCrud.g:1665:2: ( rule__Columna__NotnullableAssignment_3_1 )
            // InternalSqlCrud.g:1665:3: rule__Columna__NotnullableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Columna__NotnullableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnaAccess().getNotnullableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__Group_3__1__Impl"


    // $ANTLR start "rule__Varchar__Group__0"
    // InternalSqlCrud.g:1674:1: rule__Varchar__Group__0 : rule__Varchar__Group__0__Impl rule__Varchar__Group__1 ;
    public final void rule__Varchar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1678:1: ( rule__Varchar__Group__0__Impl rule__Varchar__Group__1 )
            // InternalSqlCrud.g:1679:2: rule__Varchar__Group__0__Impl rule__Varchar__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Varchar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varchar__Group__1();

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
    // $ANTLR end "rule__Varchar__Group__0"


    // $ANTLR start "rule__Varchar__Group__0__Impl"
    // InternalSqlCrud.g:1686:1: rule__Varchar__Group__0__Impl : ( RULE_VARCH ) ;
    public final void rule__Varchar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1690:1: ( ( RULE_VARCH ) )
            // InternalSqlCrud.g:1691:1: ( RULE_VARCH )
            {
            // InternalSqlCrud.g:1691:1: ( RULE_VARCH )
            // InternalSqlCrud.g:1692:2: RULE_VARCH
            {
             before(grammarAccess.getVarcharAccess().getVARCHTerminalRuleCall_0()); 
            match(input,RULE_VARCH,FOLLOW_2); 
             after(grammarAccess.getVarcharAccess().getVARCHTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__0__Impl"


    // $ANTLR start "rule__Varchar__Group__1"
    // InternalSqlCrud.g:1701:1: rule__Varchar__Group__1 : rule__Varchar__Group__1__Impl rule__Varchar__Group__2 ;
    public final void rule__Varchar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1705:1: ( rule__Varchar__Group__1__Impl rule__Varchar__Group__2 )
            // InternalSqlCrud.g:1706:2: rule__Varchar__Group__1__Impl rule__Varchar__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Varchar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varchar__Group__2();

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
    // $ANTLR end "rule__Varchar__Group__1"


    // $ANTLR start "rule__Varchar__Group__1__Impl"
    // InternalSqlCrud.g:1713:1: rule__Varchar__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__Varchar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1717:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:1718:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:1718:1: ( RULE_LPAR )
            // InternalSqlCrud.g:1719:2: RULE_LPAR
            {
             before(grammarAccess.getVarcharAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getVarcharAccess().getLPARTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__1__Impl"


    // $ANTLR start "rule__Varchar__Group__2"
    // InternalSqlCrud.g:1728:1: rule__Varchar__Group__2 : rule__Varchar__Group__2__Impl rule__Varchar__Group__3 ;
    public final void rule__Varchar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1732:1: ( rule__Varchar__Group__2__Impl rule__Varchar__Group__3 )
            // InternalSqlCrud.g:1733:2: rule__Varchar__Group__2__Impl rule__Varchar__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Varchar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varchar__Group__3();

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
    // $ANTLR end "rule__Varchar__Group__2"


    // $ANTLR start "rule__Varchar__Group__2__Impl"
    // InternalSqlCrud.g:1740:1: rule__Varchar__Group__2__Impl : ( ( rule__Varchar__MaxAssignment_2 ) ) ;
    public final void rule__Varchar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1744:1: ( ( ( rule__Varchar__MaxAssignment_2 ) ) )
            // InternalSqlCrud.g:1745:1: ( ( rule__Varchar__MaxAssignment_2 ) )
            {
            // InternalSqlCrud.g:1745:1: ( ( rule__Varchar__MaxAssignment_2 ) )
            // InternalSqlCrud.g:1746:2: ( rule__Varchar__MaxAssignment_2 )
            {
             before(grammarAccess.getVarcharAccess().getMaxAssignment_2()); 
            // InternalSqlCrud.g:1747:2: ( rule__Varchar__MaxAssignment_2 )
            // InternalSqlCrud.g:1747:3: rule__Varchar__MaxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Varchar__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarcharAccess().getMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__2__Impl"


    // $ANTLR start "rule__Varchar__Group__3"
    // InternalSqlCrud.g:1755:1: rule__Varchar__Group__3 : rule__Varchar__Group__3__Impl ;
    public final void rule__Varchar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1759:1: ( rule__Varchar__Group__3__Impl )
            // InternalSqlCrud.g:1760:2: rule__Varchar__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Varchar__Group__3__Impl();

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
    // $ANTLR end "rule__Varchar__Group__3"


    // $ANTLR start "rule__Varchar__Group__3__Impl"
    // InternalSqlCrud.g:1766:1: rule__Varchar__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__Varchar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1770:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:1771:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:1771:1: ( RULE_RPAR )
            // InternalSqlCrud.g:1772:2: RULE_RPAR
            {
             before(grammarAccess.getVarcharAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getVarcharAccess().getRPARTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__3__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // InternalSqlCrud.g:1782:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1786:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalSqlCrud.g:1787:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__1();

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
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // InternalSqlCrud.g:1794:1: rule__Binary__Group__0__Impl : ( 'BINARY' ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1798:1: ( ( 'BINARY' ) )
            // InternalSqlCrud.g:1799:1: ( 'BINARY' )
            {
            // InternalSqlCrud.g:1799:1: ( 'BINARY' )
            // InternalSqlCrud.g:1800:2: 'BINARY'
            {
             before(grammarAccess.getBinaryAccess().getBINARYKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getBINARYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalSqlCrud.g:1809:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl rule__Binary__Group__2 ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1813:1: ( rule__Binary__Group__1__Impl rule__Binary__Group__2 )
            // InternalSqlCrud.g:1814:2: rule__Binary__Group__1__Impl rule__Binary__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Binary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__2();

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
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // InternalSqlCrud.g:1821:1: rule__Binary__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1825:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:1826:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:1826:1: ( RULE_LPAR )
            // InternalSqlCrud.g:1827:2: RULE_LPAR
            {
             before(grammarAccess.getBinaryAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getLPARTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__2"
    // InternalSqlCrud.g:1836:1: rule__Binary__Group__2 : rule__Binary__Group__2__Impl rule__Binary__Group__3 ;
    public final void rule__Binary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1840:1: ( rule__Binary__Group__2__Impl rule__Binary__Group__3 )
            // InternalSqlCrud.g:1841:2: rule__Binary__Group__2__Impl rule__Binary__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Binary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__3();

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
    // $ANTLR end "rule__Binary__Group__2"


    // $ANTLR start "rule__Binary__Group__2__Impl"
    // InternalSqlCrud.g:1848:1: rule__Binary__Group__2__Impl : ( ( rule__Binary__MaxAssignment_2 ) ) ;
    public final void rule__Binary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1852:1: ( ( ( rule__Binary__MaxAssignment_2 ) ) )
            // InternalSqlCrud.g:1853:1: ( ( rule__Binary__MaxAssignment_2 ) )
            {
            // InternalSqlCrud.g:1853:1: ( ( rule__Binary__MaxAssignment_2 ) )
            // InternalSqlCrud.g:1854:2: ( rule__Binary__MaxAssignment_2 )
            {
             before(grammarAccess.getBinaryAccess().getMaxAssignment_2()); 
            // InternalSqlCrud.g:1855:2: ( rule__Binary__MaxAssignment_2 )
            // InternalSqlCrud.g:1855:3: rule__Binary__MaxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binary__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__2__Impl"


    // $ANTLR start "rule__Binary__Group__3"
    // InternalSqlCrud.g:1863:1: rule__Binary__Group__3 : rule__Binary__Group__3__Impl ;
    public final void rule__Binary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1867:1: ( rule__Binary__Group__3__Impl )
            // InternalSqlCrud.g:1868:2: rule__Binary__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__3__Impl();

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
    // $ANTLR end "rule__Binary__Group__3"


    // $ANTLR start "rule__Binary__Group__3__Impl"
    // InternalSqlCrud.g:1874:1: rule__Binary__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__Binary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1878:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:1879:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:1879:1: ( RULE_RPAR )
            // InternalSqlCrud.g:1880:2: RULE_RPAR
            {
             before(grammarAccess.getBinaryAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getRPARTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__3__Impl"


    // $ANTLR start "rule__VarBinary__Group__0"
    // InternalSqlCrud.g:1890:1: rule__VarBinary__Group__0 : rule__VarBinary__Group__0__Impl rule__VarBinary__Group__1 ;
    public final void rule__VarBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1894:1: ( rule__VarBinary__Group__0__Impl rule__VarBinary__Group__1 )
            // InternalSqlCrud.g:1895:2: rule__VarBinary__Group__0__Impl rule__VarBinary__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__VarBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarBinary__Group__1();

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
    // $ANTLR end "rule__VarBinary__Group__0"


    // $ANTLR start "rule__VarBinary__Group__0__Impl"
    // InternalSqlCrud.g:1902:1: rule__VarBinary__Group__0__Impl : ( 'VARBINARY' ) ;
    public final void rule__VarBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1906:1: ( ( 'VARBINARY' ) )
            // InternalSqlCrud.g:1907:1: ( 'VARBINARY' )
            {
            // InternalSqlCrud.g:1907:1: ( 'VARBINARY' )
            // InternalSqlCrud.g:1908:2: 'VARBINARY'
            {
             before(grammarAccess.getVarBinaryAccess().getVARBINARYKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVarBinaryAccess().getVARBINARYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarBinary__Group__0__Impl"


    // $ANTLR start "rule__VarBinary__Group__1"
    // InternalSqlCrud.g:1917:1: rule__VarBinary__Group__1 : rule__VarBinary__Group__1__Impl rule__VarBinary__Group__2 ;
    public final void rule__VarBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1921:1: ( rule__VarBinary__Group__1__Impl rule__VarBinary__Group__2 )
            // InternalSqlCrud.g:1922:2: rule__VarBinary__Group__1__Impl rule__VarBinary__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__VarBinary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarBinary__Group__2();

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
    // $ANTLR end "rule__VarBinary__Group__1"


    // $ANTLR start "rule__VarBinary__Group__1__Impl"
    // InternalSqlCrud.g:1929:1: rule__VarBinary__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__VarBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1933:1: ( ( RULE_LPAR ) )
            // InternalSqlCrud.g:1934:1: ( RULE_LPAR )
            {
            // InternalSqlCrud.g:1934:1: ( RULE_LPAR )
            // InternalSqlCrud.g:1935:2: RULE_LPAR
            {
             before(grammarAccess.getVarBinaryAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_2); 
             after(grammarAccess.getVarBinaryAccess().getLPARTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarBinary__Group__1__Impl"


    // $ANTLR start "rule__VarBinary__Group__2"
    // InternalSqlCrud.g:1944:1: rule__VarBinary__Group__2 : rule__VarBinary__Group__2__Impl rule__VarBinary__Group__3 ;
    public final void rule__VarBinary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1948:1: ( rule__VarBinary__Group__2__Impl rule__VarBinary__Group__3 )
            // InternalSqlCrud.g:1949:2: rule__VarBinary__Group__2__Impl rule__VarBinary__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__VarBinary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarBinary__Group__3();

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
    // $ANTLR end "rule__VarBinary__Group__2"


    // $ANTLR start "rule__VarBinary__Group__2__Impl"
    // InternalSqlCrud.g:1956:1: rule__VarBinary__Group__2__Impl : ( ( rule__VarBinary__MaxAssignment_2 ) ) ;
    public final void rule__VarBinary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1960:1: ( ( ( rule__VarBinary__MaxAssignment_2 ) ) )
            // InternalSqlCrud.g:1961:1: ( ( rule__VarBinary__MaxAssignment_2 ) )
            {
            // InternalSqlCrud.g:1961:1: ( ( rule__VarBinary__MaxAssignment_2 ) )
            // InternalSqlCrud.g:1962:2: ( rule__VarBinary__MaxAssignment_2 )
            {
             before(grammarAccess.getVarBinaryAccess().getMaxAssignment_2()); 
            // InternalSqlCrud.g:1963:2: ( rule__VarBinary__MaxAssignment_2 )
            // InternalSqlCrud.g:1963:3: rule__VarBinary__MaxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarBinary__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarBinaryAccess().getMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarBinary__Group__2__Impl"


    // $ANTLR start "rule__VarBinary__Group__3"
    // InternalSqlCrud.g:1971:1: rule__VarBinary__Group__3 : rule__VarBinary__Group__3__Impl ;
    public final void rule__VarBinary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1975:1: ( rule__VarBinary__Group__3__Impl )
            // InternalSqlCrud.g:1976:2: rule__VarBinary__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarBinary__Group__3__Impl();

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
    // $ANTLR end "rule__VarBinary__Group__3"


    // $ANTLR start "rule__VarBinary__Group__3__Impl"
    // InternalSqlCrud.g:1982:1: rule__VarBinary__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__VarBinary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:1986:1: ( ( RULE_RPAR ) )
            // InternalSqlCrud.g:1987:1: ( RULE_RPAR )
            {
            // InternalSqlCrud.g:1987:1: ( RULE_RPAR )
            // InternalSqlCrud.g:1988:2: RULE_RPAR
            {
             before(grammarAccess.getVarBinaryAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_2); 
             after(grammarAccess.getVarBinaryAccess().getRPARTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarBinary__Group__3__Impl"


    // $ANTLR start "rule__Database__TablesAssignment_1"
    // InternalSqlCrud.g:1998:1: rule__Database__TablesAssignment_1 : ( ruleTable ) ;
    public final void rule__Database__TablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2002:1: ( ( ruleTable ) )
            // InternalSqlCrud.g:2003:2: ( ruleTable )
            {
            // InternalSqlCrud.g:2003:2: ( ruleTable )
            // InternalSqlCrud.g:2004:3: ruleTable
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


    // $ANTLR start "rule__Table__NombreAssignment_4"
    // InternalSqlCrud.g:2013:1: rule__Table__NombreAssignment_4 : ( RULE_NOMBRE ) ;
    public final void rule__Table__NombreAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2017:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2018:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2018:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2019:3: RULE_NOMBRE
            {
             before(grammarAccess.getTableAccess().getNombreNOMBRETerminalRuleCall_4_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNombreNOMBRETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NombreAssignment_4"


    // $ANTLR start "rule__Table__ColumnasAssignment_7"
    // InternalSqlCrud.g:2028:1: rule__Table__ColumnasAssignment_7 : ( ruleColumna ) ;
    public final void rule__Table__ColumnasAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2032:1: ( ( ruleColumna ) )
            // InternalSqlCrud.g:2033:2: ( ruleColumna )
            {
            // InternalSqlCrud.g:2033:2: ( ruleColumna )
            // InternalSqlCrud.g:2034:3: ruleColumna
            {
             before(grammarAccess.getTableAccess().getColumnasColumnaParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColumna();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnasColumnaParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnasAssignment_7"


    // $ANTLR start "rule__Table__PrkeyAssignment_8"
    // InternalSqlCrud.g:2043:1: rule__Table__PrkeyAssignment_8 : ( rulePrimaryKey ) ;
    public final void rule__Table__PrkeyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2047:1: ( ( rulePrimaryKey ) )
            // InternalSqlCrud.g:2048:2: ( rulePrimaryKey )
            {
            // InternalSqlCrud.g:2048:2: ( rulePrimaryKey )
            // InternalSqlCrud.g:2049:3: rulePrimaryKey
            {
             before(grammarAccess.getTableAccess().getPrkeyPrimaryKeyParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getPrkeyPrimaryKeyParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__PrkeyAssignment_8"


    // $ANTLR start "rule__Table__ForkeysAssignment_9"
    // InternalSqlCrud.g:2058:1: rule__Table__ForkeysAssignment_9 : ( ruleForeignKey ) ;
    public final void rule__Table__ForkeysAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2062:1: ( ( ruleForeignKey ) )
            // InternalSqlCrud.g:2063:2: ( ruleForeignKey )
            {
            // InternalSqlCrud.g:2063:2: ( ruleForeignKey )
            // InternalSqlCrud.g:2064:3: ruleForeignKey
            {
             before(grammarAccess.getTableAccess().getForkeysForeignKeyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getTableAccess().getForkeysForeignKeyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ForkeysAssignment_9"


    // $ANTLR start "rule__PrimaryKey__ColsAssignment_3"
    // InternalSqlCrud.g:2073:1: rule__PrimaryKey__ColsAssignment_3 : ( RULE_NOMBRE ) ;
    public final void rule__PrimaryKey__ColsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2077:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2078:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2078:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2079:3: RULE_NOMBRE
            {
             before(grammarAccess.getPrimaryKeyAccess().getColsNOMBRETerminalRuleCall_3_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColsNOMBRETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__ColsAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColsAssignment_4_2"
    // InternalSqlCrud.g:2088:1: rule__PrimaryKey__ColsAssignment_4_2 : ( RULE_NOMBRE ) ;
    public final void rule__PrimaryKey__ColsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2092:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2093:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2093:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2094:3: RULE_NOMBRE
            {
             before(grammarAccess.getPrimaryKeyAccess().getColsNOMBRETerminalRuleCall_4_2_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColsNOMBRETerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__ColsAssignment_4_2"


    // $ANTLR start "rule__ForeignKey__ColumnAssignment_6"
    // InternalSqlCrud.g:2103:1: rule__ForeignKey__ColumnAssignment_6 : ( RULE_NOMBRE ) ;
    public final void rule__ForeignKey__ColumnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2107:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2108:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2108:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2109:3: RULE_NOMBRE
            {
             before(grammarAccess.getForeignKeyAccess().getColumnNOMBRETerminalRuleCall_6_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnNOMBRETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ColumnAssignment_6"


    // $ANTLR start "rule__ForeignKey__ReferencetabAssignment_11"
    // InternalSqlCrud.g:2118:1: rule__ForeignKey__ReferencetabAssignment_11 : ( RULE_NOMBRE ) ;
    public final void rule__ForeignKey__ReferencetabAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2122:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2123:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2123:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2124:3: RULE_NOMBRE
            {
             before(grammarAccess.getForeignKeyAccess().getReferencetabNOMBRETerminalRuleCall_11_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getReferencetabNOMBRETerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ReferencetabAssignment_11"


    // $ANTLR start "rule__ForeignKey__ReferencecolAssignment_15"
    // InternalSqlCrud.g:2133:1: rule__ForeignKey__ReferencecolAssignment_15 : ( RULE_NOMBRE ) ;
    public final void rule__ForeignKey__ReferencecolAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2137:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2138:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2138:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2139:3: RULE_NOMBRE
            {
             before(grammarAccess.getForeignKeyAccess().getReferencecolNOMBRETerminalRuleCall_15_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getReferencecolNOMBRETerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ReferencecolAssignment_15"


    // $ANTLR start "rule__Columna__NombreAssignment_0"
    // InternalSqlCrud.g:2148:1: rule__Columna__NombreAssignment_0 : ( RULE_NOMBRE ) ;
    public final void rule__Columna__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2152:1: ( ( RULE_NOMBRE ) )
            // InternalSqlCrud.g:2153:2: ( RULE_NOMBRE )
            {
            // InternalSqlCrud.g:2153:2: ( RULE_NOMBRE )
            // InternalSqlCrud.g:2154:3: RULE_NOMBRE
            {
             before(grammarAccess.getColumnaAccess().getNombreNOMBRETerminalRuleCall_0_0()); 
            match(input,RULE_NOMBRE,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getNombreNOMBRETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__NombreAssignment_0"


    // $ANTLR start "rule__Columna__TipoAssignment_2"
    // InternalSqlCrud.g:2163:1: rule__Columna__TipoAssignment_2 : ( ruleColumnTipoEnum ) ;
    public final void rule__Columna__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2167:1: ( ( ruleColumnTipoEnum ) )
            // InternalSqlCrud.g:2168:2: ( ruleColumnTipoEnum )
            {
            // InternalSqlCrud.g:2168:2: ( ruleColumnTipoEnum )
            // InternalSqlCrud.g:2169:3: ruleColumnTipoEnum
            {
             before(grammarAccess.getColumnaAccess().getTipoColumnTipoEnumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnTipoEnum();

            state._fsp--;

             after(grammarAccess.getColumnaAccess().getTipoColumnTipoEnumParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Columna__NotnullableAssignment_3_1"
    // InternalSqlCrud.g:2178:1: rule__Columna__NotnullableAssignment_3_1 : ( RULE_NOTNULL ) ;
    public final void rule__Columna__NotnullableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2182:1: ( ( RULE_NOTNULL ) )
            // InternalSqlCrud.g:2183:2: ( RULE_NOTNULL )
            {
            // InternalSqlCrud.g:2183:2: ( RULE_NOTNULL )
            // InternalSqlCrud.g:2184:3: RULE_NOTNULL
            {
             before(grammarAccess.getColumnaAccess().getNotnullableNOTNULLTerminalRuleCall_3_1_0()); 
            match(input,RULE_NOTNULL,FOLLOW_2); 
             after(grammarAccess.getColumnaAccess().getNotnullableNOTNULLTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Columna__NotnullableAssignment_3_1"


    // $ANTLR start "rule__ColumnTipoEnum__InttAssignment_0"
    // InternalSqlCrud.g:2193:1: rule__ColumnTipoEnum__InttAssignment_0 : ( RULE_TIPOINT ) ;
    public final void rule__ColumnTipoEnum__InttAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2197:1: ( ( RULE_TIPOINT ) )
            // InternalSqlCrud.g:2198:2: ( RULE_TIPOINT )
            {
            // InternalSqlCrud.g:2198:2: ( RULE_TIPOINT )
            // InternalSqlCrud.g:2199:3: RULE_TIPOINT
            {
             before(grammarAccess.getColumnTipoEnumAccess().getInttTIPOINTTerminalRuleCall_0_0()); 
            match(input,RULE_TIPOINT,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getInttTIPOINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__InttAssignment_0"


    // $ANTLR start "rule__ColumnTipoEnum__VarchartAssignment_1"
    // InternalSqlCrud.g:2208:1: rule__ColumnTipoEnum__VarchartAssignment_1 : ( ruleVarchar ) ;
    public final void rule__ColumnTipoEnum__VarchartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2212:1: ( ( ruleVarchar ) )
            // InternalSqlCrud.g:2213:2: ( ruleVarchar )
            {
            // InternalSqlCrud.g:2213:2: ( ruleVarchar )
            // InternalSqlCrud.g:2214:3: ruleVarchar
            {
             before(grammarAccess.getColumnTipoEnumAccess().getVarchartVarcharParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarchar();

            state._fsp--;

             after(grammarAccess.getColumnTipoEnumAccess().getVarchartVarcharParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__VarchartAssignment_1"


    // $ANTLR start "rule__ColumnTipoEnum__SmallinttAssignment_2"
    // InternalSqlCrud.g:2223:1: rule__ColumnTipoEnum__SmallinttAssignment_2 : ( ( 'SMALLINT' ) ) ;
    public final void rule__ColumnTipoEnum__SmallinttAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2227:1: ( ( ( 'SMALLINT' ) ) )
            // InternalSqlCrud.g:2228:2: ( ( 'SMALLINT' ) )
            {
            // InternalSqlCrud.g:2228:2: ( ( 'SMALLINT' ) )
            // InternalSqlCrud.g:2229:3: ( 'SMALLINT' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getSmallinttSMALLINTKeyword_2_0()); 
            // InternalSqlCrud.g:2230:3: ( 'SMALLINT' )
            // InternalSqlCrud.g:2231:4: 'SMALLINT'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getSmallinttSMALLINTKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getSmallinttSMALLINTKeyword_2_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getSmallinttSMALLINTKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__SmallinttAssignment_2"


    // $ANTLR start "rule__ColumnTipoEnum__BiginttAssignment_3"
    // InternalSqlCrud.g:2242:1: rule__ColumnTipoEnum__BiginttAssignment_3 : ( ( 'BIGINT' ) ) ;
    public final void rule__ColumnTipoEnum__BiginttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2246:1: ( ( ( 'BIGINT' ) ) )
            // InternalSqlCrud.g:2247:2: ( ( 'BIGINT' ) )
            {
            // InternalSqlCrud.g:2247:2: ( ( 'BIGINT' ) )
            // InternalSqlCrud.g:2248:3: ( 'BIGINT' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getBiginttBIGINTKeyword_3_0()); 
            // InternalSqlCrud.g:2249:3: ( 'BIGINT' )
            // InternalSqlCrud.g:2250:4: 'BIGINT'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getBiginttBIGINTKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getBiginttBIGINTKeyword_3_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getBiginttBIGINTKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__BiginttAssignment_3"


    // $ANTLR start "rule__ColumnTipoEnum__BooleantAssignment_4"
    // InternalSqlCrud.g:2261:1: rule__ColumnTipoEnum__BooleantAssignment_4 : ( ( 'BOOLEAN' ) ) ;
    public final void rule__ColumnTipoEnum__BooleantAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2265:1: ( ( ( 'BOOLEAN' ) ) )
            // InternalSqlCrud.g:2266:2: ( ( 'BOOLEAN' ) )
            {
            // InternalSqlCrud.g:2266:2: ( ( 'BOOLEAN' ) )
            // InternalSqlCrud.g:2267:3: ( 'BOOLEAN' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getBooleantBOOLEANKeyword_4_0()); 
            // InternalSqlCrud.g:2268:3: ( 'BOOLEAN' )
            // InternalSqlCrud.g:2269:4: 'BOOLEAN'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getBooleantBOOLEANKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getBooleantBOOLEANKeyword_4_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getBooleantBOOLEANKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__BooleantAssignment_4"


    // $ANTLR start "rule__ColumnTipoEnum__RealtAssignment_5"
    // InternalSqlCrud.g:2280:1: rule__ColumnTipoEnum__RealtAssignment_5 : ( ( 'REAL' ) ) ;
    public final void rule__ColumnTipoEnum__RealtAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2284:1: ( ( ( 'REAL' ) ) )
            // InternalSqlCrud.g:2285:2: ( ( 'REAL' ) )
            {
            // InternalSqlCrud.g:2285:2: ( ( 'REAL' ) )
            // InternalSqlCrud.g:2286:3: ( 'REAL' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getRealtREALKeyword_5_0()); 
            // InternalSqlCrud.g:2287:3: ( 'REAL' )
            // InternalSqlCrud.g:2288:4: 'REAL'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getRealtREALKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getRealtREALKeyword_5_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getRealtREALKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__RealtAssignment_5"


    // $ANTLR start "rule__ColumnTipoEnum__FloattAssignment_6"
    // InternalSqlCrud.g:2299:1: rule__ColumnTipoEnum__FloattAssignment_6 : ( ( 'FLOAT' ) ) ;
    public final void rule__ColumnTipoEnum__FloattAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2303:1: ( ( ( 'FLOAT' ) ) )
            // InternalSqlCrud.g:2304:2: ( ( 'FLOAT' ) )
            {
            // InternalSqlCrud.g:2304:2: ( ( 'FLOAT' ) )
            // InternalSqlCrud.g:2305:3: ( 'FLOAT' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getFloattFLOATKeyword_6_0()); 
            // InternalSqlCrud.g:2306:3: ( 'FLOAT' )
            // InternalSqlCrud.g:2307:4: 'FLOAT'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getFloattFLOATKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getFloattFLOATKeyword_6_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getFloattFLOATKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__FloattAssignment_6"


    // $ANTLR start "rule__ColumnTipoEnum__BinarytAssignment_7"
    // InternalSqlCrud.g:2318:1: rule__ColumnTipoEnum__BinarytAssignment_7 : ( ruleBinary ) ;
    public final void rule__ColumnTipoEnum__BinarytAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2322:1: ( ( ruleBinary ) )
            // InternalSqlCrud.g:2323:2: ( ruleBinary )
            {
            // InternalSqlCrud.g:2323:2: ( ruleBinary )
            // InternalSqlCrud.g:2324:3: ruleBinary
            {
             before(grammarAccess.getColumnTipoEnumAccess().getBinarytBinaryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getColumnTipoEnumAccess().getBinarytBinaryParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__BinarytAssignment_7"


    // $ANTLR start "rule__ColumnTipoEnum__VarbinarytAssignment_8"
    // InternalSqlCrud.g:2333:1: rule__ColumnTipoEnum__VarbinarytAssignment_8 : ( ruleVarBinary ) ;
    public final void rule__ColumnTipoEnum__VarbinarytAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2337:1: ( ( ruleVarBinary ) )
            // InternalSqlCrud.g:2338:2: ( ruleVarBinary )
            {
            // InternalSqlCrud.g:2338:2: ( ruleVarBinary )
            // InternalSqlCrud.g:2339:3: ruleVarBinary
            {
             before(grammarAccess.getColumnTipoEnumAccess().getVarbinarytVarBinaryParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleVarBinary();

            state._fsp--;

             after(grammarAccess.getColumnTipoEnumAccess().getVarbinarytVarBinaryParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__VarbinarytAssignment_8"


    // $ANTLR start "rule__ColumnTipoEnum__DatetAssignment_9"
    // InternalSqlCrud.g:2348:1: rule__ColumnTipoEnum__DatetAssignment_9 : ( ( 'DATE' ) ) ;
    public final void rule__ColumnTipoEnum__DatetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2352:1: ( ( ( 'DATE' ) ) )
            // InternalSqlCrud.g:2353:2: ( ( 'DATE' ) )
            {
            // InternalSqlCrud.g:2353:2: ( ( 'DATE' ) )
            // InternalSqlCrud.g:2354:3: ( 'DATE' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getDatetDATEKeyword_9_0()); 
            // InternalSqlCrud.g:2355:3: ( 'DATE' )
            // InternalSqlCrud.g:2356:4: 'DATE'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getDatetDATEKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getDatetDATEKeyword_9_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getDatetDATEKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__DatetAssignment_9"


    // $ANTLR start "rule__ColumnTipoEnum__TimestamptAssignment_10"
    // InternalSqlCrud.g:2367:1: rule__ColumnTipoEnum__TimestamptAssignment_10 : ( ( 'TIMESTAMP' ) ) ;
    public final void rule__ColumnTipoEnum__TimestamptAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2371:1: ( ( ( 'TIMESTAMP' ) ) )
            // InternalSqlCrud.g:2372:2: ( ( 'TIMESTAMP' ) )
            {
            // InternalSqlCrud.g:2372:2: ( ( 'TIMESTAMP' ) )
            // InternalSqlCrud.g:2373:3: ( 'TIMESTAMP' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getTimestamptTIMESTAMPKeyword_10_0()); 
            // InternalSqlCrud.g:2374:3: ( 'TIMESTAMP' )
            // InternalSqlCrud.g:2375:4: 'TIMESTAMP'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getTimestamptTIMESTAMPKeyword_10_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getTimestamptTIMESTAMPKeyword_10_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getTimestamptTIMESTAMPKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__TimestamptAssignment_10"


    // $ANTLR start "rule__ColumnTipoEnum__MultisettAssignment_11"
    // InternalSqlCrud.g:2386:1: rule__ColumnTipoEnum__MultisettAssignment_11 : ( ( 'MULTISET' ) ) ;
    public final void rule__ColumnTipoEnum__MultisettAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2390:1: ( ( ( 'MULTISET' ) ) )
            // InternalSqlCrud.g:2391:2: ( ( 'MULTISET' ) )
            {
            // InternalSqlCrud.g:2391:2: ( ( 'MULTISET' ) )
            // InternalSqlCrud.g:2392:3: ( 'MULTISET' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getMultisettMULTISETKeyword_11_0()); 
            // InternalSqlCrud.g:2393:3: ( 'MULTISET' )
            // InternalSqlCrud.g:2394:4: 'MULTISET'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getMultisettMULTISETKeyword_11_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getMultisettMULTISETKeyword_11_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getMultisettMULTISETKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__MultisettAssignment_11"


    // $ANTLR start "rule__ColumnTipoEnum__XmltAssignment_12"
    // InternalSqlCrud.g:2405:1: rule__ColumnTipoEnum__XmltAssignment_12 : ( ( 'XML' ) ) ;
    public final void rule__ColumnTipoEnum__XmltAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2409:1: ( ( ( 'XML' ) ) )
            // InternalSqlCrud.g:2410:2: ( ( 'XML' ) )
            {
            // InternalSqlCrud.g:2410:2: ( ( 'XML' ) )
            // InternalSqlCrud.g:2411:3: ( 'XML' )
            {
             before(grammarAccess.getColumnTipoEnumAccess().getXmltXMLKeyword_12_0()); 
            // InternalSqlCrud.g:2412:3: ( 'XML' )
            // InternalSqlCrud.g:2413:4: 'XML'
            {
             before(grammarAccess.getColumnTipoEnumAccess().getXmltXMLKeyword_12_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColumnTipoEnumAccess().getXmltXMLKeyword_12_0()); 

            }

             after(grammarAccess.getColumnTipoEnumAccess().getXmltXMLKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTipoEnum__XmltAssignment_12"


    // $ANTLR start "rule__Varchar__MaxAssignment_2"
    // InternalSqlCrud.g:2424:1: rule__Varchar__MaxAssignment_2 : ( RULE_ENTERO ) ;
    public final void rule__Varchar__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2428:1: ( ( RULE_ENTERO ) )
            // InternalSqlCrud.g:2429:2: ( RULE_ENTERO )
            {
            // InternalSqlCrud.g:2429:2: ( RULE_ENTERO )
            // InternalSqlCrud.g:2430:3: RULE_ENTERO
            {
             before(grammarAccess.getVarcharAccess().getMaxENTEROTerminalRuleCall_2_0()); 
            match(input,RULE_ENTERO,FOLLOW_2); 
             after(grammarAccess.getVarcharAccess().getMaxENTEROTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__MaxAssignment_2"


    // $ANTLR start "rule__Binary__MaxAssignment_2"
    // InternalSqlCrud.g:2439:1: rule__Binary__MaxAssignment_2 : ( RULE_ENTERO ) ;
    public final void rule__Binary__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2443:1: ( ( RULE_ENTERO ) )
            // InternalSqlCrud.g:2444:2: ( RULE_ENTERO )
            {
            // InternalSqlCrud.g:2444:2: ( RULE_ENTERO )
            // InternalSqlCrud.g:2445:3: RULE_ENTERO
            {
             before(grammarAccess.getBinaryAccess().getMaxENTEROTerminalRuleCall_2_0()); 
            match(input,RULE_ENTERO,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getMaxENTEROTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__MaxAssignment_2"


    // $ANTLR start "rule__VarBinary__MaxAssignment_2"
    // InternalSqlCrud.g:2454:1: rule__VarBinary__MaxAssignment_2 : ( RULE_ENTERO ) ;
    public final void rule__VarBinary__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlCrud.g:2458:1: ( ( RULE_ENTERO ) )
            // InternalSqlCrud.g:2459:2: ( RULE_ENTERO )
            {
            // InternalSqlCrud.g:2459:2: ( RULE_ENTERO )
            // InternalSqlCrud.g:2460:3: RULE_ENTERO
            {
             before(grammarAccess.getVarBinaryAccess().getMaxENTEROTerminalRuleCall_2_0()); 
            match(input,RULE_ENTERO,FOLLOW_2); 
             after(grammarAccess.getVarBinaryAccess().getMaxENTEROTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarBinary__MaxAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000FFE009000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});

}