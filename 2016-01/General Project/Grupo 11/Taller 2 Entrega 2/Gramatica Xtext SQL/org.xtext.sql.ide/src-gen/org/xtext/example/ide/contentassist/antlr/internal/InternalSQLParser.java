package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_TABLA", "RULE_LPAREN", "RULE_RPAREN", "RULE_NOT", "RULE_NULL", "RULE_COMA", "RULE_PRIMARY", "RULE_KEY", "RULE_ID", "RULE_FOREIGN", "RULE_REFERENCES", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar(255)'", "'varchar'", "'int'", "'character'", "'boolean'", "'date'", "'time'", "'float'", "'decimal'", "'numeric'"
    };
    public static final int RULE_COMA=10;
    public static final int RULE_KEY=12;
    public static final int RULE_STRING=17;
    public static final int RULE_NOT=8;
    public static final int RULE_NULL=9;
    public static final int RULE_LPAREN=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CREATE=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_REFERENCES=15;
    public static final int RULE_ID=13;
    public static final int RULE_WS=20;
    public static final int RULE_TABLA=5;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_PRIMARY=11;
    public static final int RULE_RPAREN=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FOREIGN=14;

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
    // InternalSQL.g:62:1: ruleDataBase : ( ( ( rule__DataBase__TablesAssignment ) ) ( ( rule__DataBase__TablesAssignment )* ) ) ;
    public final void ruleDataBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:66:2: ( ( ( ( rule__DataBase__TablesAssignment ) ) ( ( rule__DataBase__TablesAssignment )* ) ) )
            // InternalSQL.g:67:2: ( ( ( rule__DataBase__TablesAssignment ) ) ( ( rule__DataBase__TablesAssignment )* ) )
            {
            // InternalSQL.g:67:2: ( ( ( rule__DataBase__TablesAssignment ) ) ( ( rule__DataBase__TablesAssignment )* ) )
            // InternalSQL.g:68:3: ( ( rule__DataBase__TablesAssignment ) ) ( ( rule__DataBase__TablesAssignment )* )
            {
            // InternalSQL.g:68:3: ( ( rule__DataBase__TablesAssignment ) )
            // InternalSQL.g:69:4: ( rule__DataBase__TablesAssignment )
            {
             before(grammarAccess.getDataBaseAccess().getTablesAssignment()); 
            // InternalSQL.g:70:4: ( rule__DataBase__TablesAssignment )
            // InternalSQL.g:70:5: rule__DataBase__TablesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__DataBase__TablesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataBaseAccess().getTablesAssignment()); 

            }

            // InternalSQL.g:73:3: ( ( rule__DataBase__TablesAssignment )* )
            // InternalSQL.g:74:4: ( rule__DataBase__TablesAssignment )*
            {
             before(grammarAccess.getDataBaseAccess().getTablesAssignment()); 
            // InternalSQL.g:75:4: ( rule__DataBase__TablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_CREATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:75:5: rule__DataBase__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DataBase__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDataBaseAccess().getTablesAssignment()); 

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
    // $ANTLR end "ruleDataBase"


    // $ANTLR start "entryRuleTable"
    // InternalSQL.g:85:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSQL.g:86:1: ( ruleTable EOF )
            // InternalSQL.g:87:1: ruleTable EOF
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
    // InternalSQL.g:94:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:98:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSQL.g:99:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSQL.g:99:2: ( ( rule__Table__Group__0 ) )
            // InternalSQL.g:100:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSQL.g:101:3: ( rule__Table__Group__0 )
            // InternalSQL.g:101:4: rule__Table__Group__0
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


    // $ANTLR start "entryRulecolumn"
    // InternalSQL.g:110:1: entryRulecolumn : rulecolumn EOF ;
    public final void entryRulecolumn() throws RecognitionException {
        try {
            // InternalSQL.g:111:1: ( rulecolumn EOF )
            // InternalSQL.g:112:1: rulecolumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            rulecolumn();

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
    // $ANTLR end "entryRulecolumn"


    // $ANTLR start "rulecolumn"
    // InternalSQL.g:119:1: rulecolumn : ( ( rule__Column__Group__0 ) ) ;
    public final void rulecolumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:123:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalSQL.g:124:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalSQL.g:124:2: ( ( rule__Column__Group__0 ) )
            // InternalSQL.g:125:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalSQL.g:126:3: ( rule__Column__Group__0 )
            // InternalSQL.g:126:4: rule__Column__Group__0
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
    // $ANTLR end "rulecolumn"


    // $ANTLR start "entryRuleprimaryKey"
    // InternalSQL.g:135:1: entryRuleprimaryKey : ruleprimaryKey EOF ;
    public final void entryRuleprimaryKey() throws RecognitionException {
        try {
            // InternalSQL.g:136:1: ( ruleprimaryKey EOF )
            // InternalSQL.g:137:1: ruleprimaryKey EOF
            {
             before(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleprimaryKey();

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
    // $ANTLR end "entryRuleprimaryKey"


    // $ANTLR start "ruleprimaryKey"
    // InternalSQL.g:144:1: ruleprimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void ruleprimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:148:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSQL.g:149:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSQL.g:149:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSQL.g:150:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSQL.g:151:3: ( rule__PrimaryKey__Group__0 )
            // InternalSQL.g:151:4: rule__PrimaryKey__Group__0
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
    // $ANTLR end "ruleprimaryKey"


    // $ANTLR start "entryRuleforeignKey"
    // InternalSQL.g:160:1: entryRuleforeignKey : ruleforeignKey EOF ;
    public final void entryRuleforeignKey() throws RecognitionException {
        try {
            // InternalSQL.g:161:1: ( ruleforeignKey EOF )
            // InternalSQL.g:162:1: ruleforeignKey EOF
            {
             before(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleforeignKey();

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
    // $ANTLR end "entryRuleforeignKey"


    // $ANTLR start "ruleforeignKey"
    // InternalSQL.g:169:1: ruleforeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleforeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:173:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSQL.g:174:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSQL.g:174:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSQL.g:175:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSQL.g:176:3: ( rule__ForeignKey__Group__0 )
            // InternalSQL.g:176:4: rule__ForeignKey__Group__0
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
    // $ANTLR end "ruleforeignKey"


    // $ANTLR start "ruleDataType"
    // InternalSQL.g:185:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:189:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSQL.g:190:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSQL.g:190:2: ( ( rule__DataType__Alternatives ) )
            // InternalSQL.g:191:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSQL.g:192:3: ( rule__DataType__Alternatives )
            // InternalSQL.g:192:4: rule__DataType__Alternatives
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
    // InternalSQL.g:200:1: rule__DataType__Alternatives : ( ( ( 'varchar(255)' ) ) | ( ( 'varchar' ) ) | ( ( 'int' ) ) | ( ( 'character' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'float' ) ) | ( ( 'decimal' ) ) | ( ( 'numeric' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:204:1: ( ( ( 'varchar(255)' ) ) | ( ( 'varchar' ) ) | ( ( 'int' ) ) | ( ( 'character' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'float' ) ) | ( ( 'decimal' ) ) | ( ( 'numeric' ) ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 27:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            case 30:
                {
                alt2=9;
                }
                break;
            case 31:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSQL.g:205:2: ( ( 'varchar(255)' ) )
                    {
                    // InternalSQL.g:205:2: ( ( 'varchar(255)' ) )
                    // InternalSQL.g:206:3: ( 'varchar(255)' )
                    {
                     before(grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0()); 
                    // InternalSQL.g:207:3: ( 'varchar(255)' )
                    // InternalSQL.g:207:4: 'varchar(255)'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:211:2: ( ( 'varchar' ) )
                    {
                    // InternalSQL.g:211:2: ( ( 'varchar' ) )
                    // InternalSQL.g:212:3: ( 'varchar' )
                    {
                     before(grammarAccess.getDataTypeAccess().getVARCHAREnumLiteralDeclaration_1()); 
                    // InternalSQL.g:213:3: ( 'varchar' )
                    // InternalSQL.g:213:4: 'varchar'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getVARCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:217:2: ( ( 'int' ) )
                    {
                    // InternalSQL.g:217:2: ( ( 'int' ) )
                    // InternalSQL.g:218:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2()); 
                    // InternalSQL.g:219:3: ( 'int' )
                    // InternalSQL.g:219:4: 'int'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:223:2: ( ( 'character' ) )
                    {
                    // InternalSQL.g:223:2: ( ( 'character' ) )
                    // InternalSQL.g:224:3: ( 'character' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_3()); 
                    // InternalSQL.g:225:3: ( 'character' )
                    // InternalSQL.g:225:4: 'character'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:229:2: ( ( 'boolean' ) )
                    {
                    // InternalSQL.g:229:2: ( ( 'boolean' ) )
                    // InternalSQL.g:230:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_4()); 
                    // InternalSQL.g:231:3: ( 'boolean' )
                    // InternalSQL.g:231:4: 'boolean'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSQL.g:235:2: ( ( 'date' ) )
                    {
                    // InternalSQL.g:235:2: ( ( 'date' ) )
                    // InternalSQL.g:236:3: ( 'date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_5()); 
                    // InternalSQL.g:237:3: ( 'date' )
                    // InternalSQL.g:237:4: 'date'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSQL.g:241:2: ( ( 'time' ) )
                    {
                    // InternalSQL.g:241:2: ( ( 'time' ) )
                    // InternalSQL.g:242:3: ( 'time' )
                    {
                     before(grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_6()); 
                    // InternalSQL.g:243:3: ( 'time' )
                    // InternalSQL.g:243:4: 'time'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSQL.g:247:2: ( ( 'float' ) )
                    {
                    // InternalSQL.g:247:2: ( ( 'float' ) )
                    // InternalSQL.g:248:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_7()); 
                    // InternalSQL.g:249:3: ( 'float' )
                    // InternalSQL.g:249:4: 'float'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSQL.g:253:2: ( ( 'decimal' ) )
                    {
                    // InternalSQL.g:253:2: ( ( 'decimal' ) )
                    // InternalSQL.g:254:3: ( 'decimal' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDECIMALEnumLiteralDeclaration_8()); 
                    // InternalSQL.g:255:3: ( 'decimal' )
                    // InternalSQL.g:255:4: 'decimal'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDECIMALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSQL.g:259:2: ( ( 'numeric' ) )
                    {
                    // InternalSQL.g:259:2: ( ( 'numeric' ) )
                    // InternalSQL.g:260:3: ( 'numeric' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_9()); 
                    // InternalSQL.g:261:3: ( 'numeric' )
                    // InternalSQL.g:261:4: 'numeric'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_9()); 

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
    // InternalSQL.g:269:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:273:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSQL.g:274:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSQL.g:281:1: rule__Table__Group__0__Impl : ( RULE_CREATE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:285:1: ( ( RULE_CREATE ) )
            // InternalSQL.g:286:1: ( RULE_CREATE )
            {
            // InternalSQL.g:286:1: ( RULE_CREATE )
            // InternalSQL.g:287:2: RULE_CREATE
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
    // InternalSQL.g:296:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:300:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSQL.g:301:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSQL.g:308:1: rule__Table__Group__1__Impl : ( RULE_TABLA ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:312:1: ( ( RULE_TABLA ) )
            // InternalSQL.g:313:1: ( RULE_TABLA )
            {
            // InternalSQL.g:313:1: ( RULE_TABLA )
            // InternalSQL.g:314:2: RULE_TABLA
            {
             before(grammarAccess.getTableAccess().getTABLATerminalRuleCall_1()); 
            match(input,RULE_TABLA,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTABLATerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalSQL.g:323:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:327:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSQL.g:328:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSQL.g:335:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:339:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalSQL.g:340:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalSQL.g:340:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalSQL.g:341:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalSQL.g:342:2: ( rule__Table__NameAssignment_2 )
            // InternalSQL.g:342:3: rule__Table__NameAssignment_2
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
    // InternalSQL.g:350:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:354:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSQL.g:355:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSQL.g:362:1: rule__Table__Group__3__Impl : ( RULE_LPAREN ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:366:1: ( ( RULE_LPAREN ) )
            // InternalSQL.g:367:1: ( RULE_LPAREN )
            {
            // InternalSQL.g:367:1: ( RULE_LPAREN )
            // InternalSQL.g:368:2: RULE_LPAREN
            {
             before(grammarAccess.getTableAccess().getLPARENTerminalRuleCall_3()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLPARENTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalSQL.g:377:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:381:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSQL.g:382:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSQL.g:389:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:393:1: ( ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) ) )
            // InternalSQL.g:394:1: ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) )
            {
            // InternalSQL.g:394:1: ( ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* ) )
            // InternalSQL.g:395:2: ( ( rule__Table__ColumnsAssignment_4 ) ) ( ( rule__Table__ColumnsAssignment_4 )* )
            {
            // InternalSQL.g:395:2: ( ( rule__Table__ColumnsAssignment_4 ) )
            // InternalSQL.g:396:3: ( rule__Table__ColumnsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4()); 
            // InternalSQL.g:397:3: ( rule__Table__ColumnsAssignment_4 )
            // InternalSQL.g:397:4: rule__Table__ColumnsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Table__ColumnsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4()); 

            }

            // InternalSQL.g:400:2: ( ( rule__Table__ColumnsAssignment_4 )* )
            // InternalSQL.g:401:3: ( rule__Table__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4()); 
            // InternalSQL.g:402:3: ( rule__Table__ColumnsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSQL.g:402:4: rule__Table__ColumnsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSQL.g:411:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:415:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSQL.g:416:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalSQL.g:423:1: rule__Table__Group__5__Impl : ( ( rule__Table__PrimaryKeyAssignment_5 ) ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:427:1: ( ( ( rule__Table__PrimaryKeyAssignment_5 ) ) )
            // InternalSQL.g:428:1: ( ( rule__Table__PrimaryKeyAssignment_5 ) )
            {
            // InternalSQL.g:428:1: ( ( rule__Table__PrimaryKeyAssignment_5 ) )
            // InternalSQL.g:429:2: ( rule__Table__PrimaryKeyAssignment_5 )
            {
             before(grammarAccess.getTableAccess().getPrimaryKeyAssignment_5()); 
            // InternalSQL.g:430:2: ( rule__Table__PrimaryKeyAssignment_5 )
            // InternalSQL.g:430:3: rule__Table__PrimaryKeyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Table__PrimaryKeyAssignment_5();

            state._fsp--;


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
    // InternalSQL.g:438:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:442:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalSQL.g:443:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalSQL.g:450:1: rule__Table__Group__6__Impl : ( ( rule__Table__ForeignkeysAssignment_6 )* ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:454:1: ( ( ( rule__Table__ForeignkeysAssignment_6 )* ) )
            // InternalSQL.g:455:1: ( ( rule__Table__ForeignkeysAssignment_6 )* )
            {
            // InternalSQL.g:455:1: ( ( rule__Table__ForeignkeysAssignment_6 )* )
            // InternalSQL.g:456:2: ( rule__Table__ForeignkeysAssignment_6 )*
            {
             before(grammarAccess.getTableAccess().getForeignkeysAssignment_6()); 
            // InternalSQL.g:457:2: ( rule__Table__ForeignkeysAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_FOREIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSQL.g:457:3: rule__Table__ForeignkeysAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalSQL.g:465:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:469:1: ( rule__Table__Group__7__Impl )
            // InternalSQL.g:470:2: rule__Table__Group__7__Impl
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
    // InternalSQL.g:476:1: rule__Table__Group__7__Impl : ( RULE_RPAREN ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:480:1: ( ( RULE_RPAREN ) )
            // InternalSQL.g:481:1: ( RULE_RPAREN )
            {
            // InternalSQL.g:481:1: ( RULE_RPAREN )
            // InternalSQL.g:482:2: RULE_RPAREN
            {
             before(grammarAccess.getTableAccess().getRPARENTerminalRuleCall_7()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRPARENTerminalRuleCall_7()); 

            }


            }

        }
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
    // InternalSQL.g:492:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:496:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSQL.g:497:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:504:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:508:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalSQL.g:509:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalSQL.g:509:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalSQL.g:510:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalSQL.g:511:2: ( rule__Column__NameAssignment_0 )
            // InternalSQL.g:511:3: rule__Column__NameAssignment_0
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
    // InternalSQL.g:519:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:523:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalSQL.g:524:2: rule__Column__Group__1__Impl rule__Column__Group__2
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
    // InternalSQL.g:531:1: rule__Column__Group__1__Impl : ( ( rule__Column__TypeAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:535:1: ( ( ( rule__Column__TypeAssignment_1 ) ) )
            // InternalSQL.g:536:1: ( ( rule__Column__TypeAssignment_1 ) )
            {
            // InternalSQL.g:536:1: ( ( rule__Column__TypeAssignment_1 ) )
            // InternalSQL.g:537:2: ( rule__Column__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_1()); 
            // InternalSQL.g:538:2: ( rule__Column__TypeAssignment_1 )
            // InternalSQL.g:538:3: rule__Column__TypeAssignment_1
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
    // InternalSQL.g:546:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:550:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalSQL.g:551:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSQL.g:558:1: rule__Column__Group__2__Impl : ( ( RULE_NOT )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:562:1: ( ( ( RULE_NOT )? ) )
            // InternalSQL.g:563:1: ( ( RULE_NOT )? )
            {
            // InternalSQL.g:563:1: ( ( RULE_NOT )? )
            // InternalSQL.g:564:2: ( RULE_NOT )?
            {
             before(grammarAccess.getColumnAccess().getNOTTerminalRuleCall_2()); 
            // InternalSQL.g:565:2: ( RULE_NOT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NOT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:565:3: RULE_NOT
                    {
                    match(input,RULE_NOT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getNOTTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalSQL.g:573:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:577:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalSQL.g:578:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSQL.g:585:1: rule__Column__Group__3__Impl : ( ( RULE_NULL )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:589:1: ( ( ( RULE_NULL )? ) )
            // InternalSQL.g:590:1: ( ( RULE_NULL )? )
            {
            // InternalSQL.g:590:1: ( ( RULE_NULL )? )
            // InternalSQL.g:591:2: ( RULE_NULL )?
            {
             before(grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3()); 
            // InternalSQL.g:592:2: ( RULE_NULL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NULL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQL.g:592:3: RULE_NULL
                    {
                    match(input,RULE_NULL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalSQL.g:600:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:604:1: ( rule__Column__Group__4__Impl )
            // InternalSQL.g:605:2: rule__Column__Group__4__Impl
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
    // InternalSQL.g:611:1: rule__Column__Group__4__Impl : ( ( RULE_COMA )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:615:1: ( ( ( RULE_COMA )? ) )
            // InternalSQL.g:616:1: ( ( RULE_COMA )? )
            {
            // InternalSQL.g:616:1: ( ( RULE_COMA )? )
            // InternalSQL.g:617:2: ( RULE_COMA )?
            {
             before(grammarAccess.getColumnAccess().getCOMATerminalRuleCall_4()); 
            // InternalSQL.g:618:2: ( RULE_COMA )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_COMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:618:3: RULE_COMA
                    {
                    match(input,RULE_COMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getCOMATerminalRuleCall_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalSQL.g:627:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:631:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSQL.g:632:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSQL.g:639:1: rule__PrimaryKey__Group__0__Impl : ( RULE_PRIMARY ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:643:1: ( ( RULE_PRIMARY ) )
            // InternalSQL.g:644:1: ( RULE_PRIMARY )
            {
            // InternalSQL.g:644:1: ( RULE_PRIMARY )
            // InternalSQL.g:645:2: RULE_PRIMARY
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
    // InternalSQL.g:654:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:658:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSQL.g:659:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
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
    // InternalSQL.g:666:1: rule__PrimaryKey__Group__1__Impl : ( RULE_KEY ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:670:1: ( ( RULE_KEY ) )
            // InternalSQL.g:671:1: ( RULE_KEY )
            {
            // InternalSQL.g:671:1: ( RULE_KEY )
            // InternalSQL.g:672:2: RULE_KEY
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
    // InternalSQL.g:681:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:685:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSQL.g:686:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
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
    // InternalSQL.g:693:1: rule__PrimaryKey__Group__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:697:1: ( ( RULE_LPAREN ) )
            // InternalSQL.g:698:1: ( RULE_LPAREN )
            {
            // InternalSQL.g:698:1: ( RULE_LPAREN )
            // InternalSQL.g:699:2: RULE_LPAREN
            {
             before(grammarAccess.getPrimaryKeyAccess().getLPARENTerminalRuleCall_2()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getLPARENTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalSQL.g:708:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:712:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSQL.g:713:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSQL.g:720:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__NameAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:724:1: ( ( ( rule__PrimaryKey__NameAssignment_3 ) ) )
            // InternalSQL.g:725:1: ( ( rule__PrimaryKey__NameAssignment_3 ) )
            {
            // InternalSQL.g:725:1: ( ( rule__PrimaryKey__NameAssignment_3 ) )
            // InternalSQL.g:726:2: ( rule__PrimaryKey__NameAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getNameAssignment_3()); 
            // InternalSQL.g:727:2: ( rule__PrimaryKey__NameAssignment_3 )
            // InternalSQL.g:727:3: rule__PrimaryKey__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSQL.g:735:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:739:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSQL.g:740:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalSQL.g:747:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:751:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSQL.g:752:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSQL.g:752:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSQL.g:753:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSQL.g:754:2: ( rule__PrimaryKey__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSQL.g:754:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalSQL.g:762:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6 ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:766:1: ( rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6 )
            // InternalSQL.g:767:2: rule__PrimaryKey__Group__5__Impl rule__PrimaryKey__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalSQL.g:774:1: rule__PrimaryKey__Group__5__Impl : ( RULE_RPAREN ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:778:1: ( ( RULE_RPAREN ) )
            // InternalSQL.g:779:1: ( RULE_RPAREN )
            {
            // InternalSQL.g:779:1: ( RULE_RPAREN )
            // InternalSQL.g:780:2: RULE_RPAREN
            {
             before(grammarAccess.getPrimaryKeyAccess().getRPARENTerminalRuleCall_5()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getRPARENTerminalRuleCall_5()); 

            }


            }

        }
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
    // InternalSQL.g:789:1: rule__PrimaryKey__Group__6 : rule__PrimaryKey__Group__6__Impl ;
    public final void rule__PrimaryKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:793:1: ( rule__PrimaryKey__Group__6__Impl )
            // InternalSQL.g:794:2: rule__PrimaryKey__Group__6__Impl
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
    // InternalSQL.g:800:1: rule__PrimaryKey__Group__6__Impl : ( ( RULE_COMA )? ) ;
    public final void rule__PrimaryKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:804:1: ( ( ( RULE_COMA )? ) )
            // InternalSQL.g:805:1: ( ( RULE_COMA )? )
            {
            // InternalSQL.g:805:1: ( ( RULE_COMA )? )
            // InternalSQL.g:806:2: ( RULE_COMA )?
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_6()); 
            // InternalSQL.g:807:2: ( RULE_COMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSQL.g:807:3: RULE_COMA
                    {
                    match(input,RULE_COMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalSQL.g:816:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:820:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSQL.g:821:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
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
    // InternalSQL.g:828:1: rule__PrimaryKey__Group_4__0__Impl : ( RULE_COMA ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:832:1: ( ( RULE_COMA ) )
            // InternalSQL.g:833:1: ( RULE_COMA )
            {
            // InternalSQL.g:833:1: ( RULE_COMA )
            // InternalSQL.g:834:2: RULE_COMA
            {
             before(grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_4_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalSQL.g:843:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:847:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSQL.g:848:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSQL.g:854:1: rule__PrimaryKey__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:858:1: ( ( RULE_ID ) )
            // InternalSQL.g:859:1: ( RULE_ID )
            {
            // InternalSQL.g:859:1: ( RULE_ID )
            // InternalSQL.g:860:2: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getIDTerminalRuleCall_4_1()); 

            }


            }

        }
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
    // InternalSQL.g:870:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:874:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSQL.g:875:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSQL.g:882:1: rule__ForeignKey__Group__0__Impl : ( RULE_FOREIGN ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:886:1: ( ( RULE_FOREIGN ) )
            // InternalSQL.g:887:1: ( RULE_FOREIGN )
            {
            // InternalSQL.g:887:1: ( RULE_FOREIGN )
            // InternalSQL.g:888:2: RULE_FOREIGN
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
    // InternalSQL.g:897:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:901:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSQL.g:902:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
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
    // InternalSQL.g:909:1: rule__ForeignKey__Group__1__Impl : ( RULE_KEY ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:913:1: ( ( RULE_KEY ) )
            // InternalSQL.g:914:1: ( RULE_KEY )
            {
            // InternalSQL.g:914:1: ( RULE_KEY )
            // InternalSQL.g:915:2: RULE_KEY
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
    // InternalSQL.g:924:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:928:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSQL.g:929:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
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
    // InternalSQL.g:936:1: rule__ForeignKey__Group__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:940:1: ( ( RULE_LPAREN ) )
            // InternalSQL.g:941:1: ( RULE_LPAREN )
            {
            // InternalSQL.g:941:1: ( RULE_LPAREN )
            // InternalSQL.g:942:2: RULE_LPAREN
            {
             before(grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_2()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalSQL.g:951:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:955:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSQL.g:956:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
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
    // InternalSQL.g:963:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__NameAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:967:1: ( ( ( rule__ForeignKey__NameAssignment_3 ) ) )
            // InternalSQL.g:968:1: ( ( rule__ForeignKey__NameAssignment_3 ) )
            {
            // InternalSQL.g:968:1: ( ( rule__ForeignKey__NameAssignment_3 ) )
            // InternalSQL.g:969:2: ( rule__ForeignKey__NameAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getNameAssignment_3()); 
            // InternalSQL.g:970:2: ( rule__ForeignKey__NameAssignment_3 )
            // InternalSQL.g:970:3: rule__ForeignKey__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSQL.g:978:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:982:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSQL.g:983:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSQL.g:990:1: rule__ForeignKey__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:994:1: ( ( RULE_RPAREN ) )
            // InternalSQL.g:995:1: ( RULE_RPAREN )
            {
            // InternalSQL.g:995:1: ( RULE_RPAREN )
            // InternalSQL.g:996:2: RULE_RPAREN
            {
             before(grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_4()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalSQL.g:1005:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1009:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSQL.g:1010:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalSQL.g:1017:1: rule__ForeignKey__Group__5__Impl : ( RULE_REFERENCES ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1021:1: ( ( RULE_REFERENCES ) )
            // InternalSQL.g:1022:1: ( RULE_REFERENCES )
            {
            // InternalSQL.g:1022:1: ( RULE_REFERENCES )
            // InternalSQL.g:1023:2: RULE_REFERENCES
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_5()); 
            match(input,RULE_REFERENCES,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_5()); 

            }


            }

        }
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
    // InternalSQL.g:1032:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1036:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSQL.g:1037:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
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
    // InternalSQL.g:1044:1: rule__ForeignKey__Group__6__Impl : ( ( rule__ForeignKey__ReftableAssignment_6 ) ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1048:1: ( ( ( rule__ForeignKey__ReftableAssignment_6 ) ) )
            // InternalSQL.g:1049:1: ( ( rule__ForeignKey__ReftableAssignment_6 ) )
            {
            // InternalSQL.g:1049:1: ( ( rule__ForeignKey__ReftableAssignment_6 ) )
            // InternalSQL.g:1050:2: ( rule__ForeignKey__ReftableAssignment_6 )
            {
             before(grammarAccess.getForeignKeyAccess().getReftableAssignment_6()); 
            // InternalSQL.g:1051:2: ( rule__ForeignKey__ReftableAssignment_6 )
            // InternalSQL.g:1051:3: rule__ForeignKey__ReftableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ReftableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getReftableAssignment_6()); 

            }


            }

        }
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
    // InternalSQL.g:1059:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1063:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSQL.g:1064:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_5);
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
    // InternalSQL.g:1071:1: rule__ForeignKey__Group__7__Impl : ( RULE_LPAREN ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1075:1: ( ( RULE_LPAREN ) )
            // InternalSQL.g:1076:1: ( RULE_LPAREN )
            {
            // InternalSQL.g:1076:1: ( RULE_LPAREN )
            // InternalSQL.g:1077:2: RULE_LPAREN
            {
             before(grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_7()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_7()); 

            }


            }

        }
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
    // InternalSQL.g:1086:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1090:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSQL.g:1091:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:1098:1: rule__ForeignKey__Group__8__Impl : ( ( rule__ForeignKey__RefAssignment_8 ) ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1102:1: ( ( ( rule__ForeignKey__RefAssignment_8 ) ) )
            // InternalSQL.g:1103:1: ( ( rule__ForeignKey__RefAssignment_8 ) )
            {
            // InternalSQL.g:1103:1: ( ( rule__ForeignKey__RefAssignment_8 ) )
            // InternalSQL.g:1104:2: ( rule__ForeignKey__RefAssignment_8 )
            {
             before(grammarAccess.getForeignKeyAccess().getRefAssignment_8()); 
            // InternalSQL.g:1105:2: ( rule__ForeignKey__RefAssignment_8 )
            // InternalSQL.g:1105:3: rule__ForeignKey__RefAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__RefAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getRefAssignment_8()); 

            }


            }

        }
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
    // InternalSQL.g:1113:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1117:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSQL.g:1118:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
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
    // InternalSQL.g:1125:1: rule__ForeignKey__Group__9__Impl : ( RULE_RPAREN ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1129:1: ( ( RULE_RPAREN ) )
            // InternalSQL.g:1130:1: ( RULE_RPAREN )
            {
            // InternalSQL.g:1130:1: ( RULE_RPAREN )
            // InternalSQL.g:1131:2: RULE_RPAREN
            {
             before(grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_9()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_9()); 

            }


            }

        }
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
    // InternalSQL.g:1140:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1144:1: ( rule__ForeignKey__Group__10__Impl )
            // InternalSQL.g:1145:2: rule__ForeignKey__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalSQL.g:1151:1: rule__ForeignKey__Group__10__Impl : ( ( RULE_COMA )? ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1155:1: ( ( ( RULE_COMA )? ) )
            // InternalSQL.g:1156:1: ( ( RULE_COMA )? )
            {
            // InternalSQL.g:1156:1: ( ( RULE_COMA )? )
            // InternalSQL.g:1157:2: ( RULE_COMA )?
            {
             before(grammarAccess.getForeignKeyAccess().getCOMATerminalRuleCall_10()); 
            // InternalSQL.g:1158:2: ( RULE_COMA )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMA) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:1158:3: RULE_COMA
                    {
                    match(input,RULE_COMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getForeignKeyAccess().getCOMATerminalRuleCall_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataBase__TablesAssignment"
    // InternalSQL.g:1167:1: rule__DataBase__TablesAssignment : ( ruleTable ) ;
    public final void rule__DataBase__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1171:1: ( ( ruleTable ) )
            // InternalSQL.g:1172:2: ( ruleTable )
            {
            // InternalSQL.g:1172:2: ( ruleTable )
            // InternalSQL.g:1173:3: ruleTable
            {
             before(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBase__TablesAssignment"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalSQL.g:1182:1: rule__Table__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1186:1: ( ( RULE_ID ) )
            // InternalSQL.g:1187:2: ( RULE_ID )
            {
            // InternalSQL.g:1187:2: ( RULE_ID )
            // InternalSQL.g:1188:3: RULE_ID
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
    // InternalSQL.g:1197:1: rule__Table__ColumnsAssignment_4 : ( rulecolumn ) ;
    public final void rule__Table__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1201:1: ( ( rulecolumn ) )
            // InternalSQL.g:1202:2: ( rulecolumn )
            {
            // InternalSQL.g:1202:2: ( rulecolumn )
            // InternalSQL.g:1203:3: rulecolumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulecolumn();

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


    // $ANTLR start "rule__Table__PrimaryKeyAssignment_5"
    // InternalSQL.g:1212:1: rule__Table__PrimaryKeyAssignment_5 : ( ruleprimaryKey ) ;
    public final void rule__Table__PrimaryKeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1216:1: ( ( ruleprimaryKey ) )
            // InternalSQL.g:1217:2: ( ruleprimaryKey )
            {
            // InternalSQL.g:1217:2: ( ruleprimaryKey )
            // InternalSQL.g:1218:3: ruleprimaryKey
            {
             before(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryKey();

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


    // $ANTLR start "rule__Table__ForeignkeysAssignment_6"
    // InternalSQL.g:1227:1: rule__Table__ForeignkeysAssignment_6 : ( ruleforeignKey ) ;
    public final void rule__Table__ForeignkeysAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1231:1: ( ( ruleforeignKey ) )
            // InternalSQL.g:1232:2: ( ruleforeignKey )
            {
            // InternalSQL.g:1232:2: ( ruleforeignKey )
            // InternalSQL.g:1233:3: ruleforeignKey
            {
             before(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleforeignKey();

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
    // InternalSQL.g:1242:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1246:1: ( ( RULE_ID ) )
            // InternalSQL.g:1247:2: ( RULE_ID )
            {
            // InternalSQL.g:1247:2: ( RULE_ID )
            // InternalSQL.g:1248:3: RULE_ID
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
    // InternalSQL.g:1257:1: rule__Column__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Column__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1261:1: ( ( ruleDataType ) )
            // InternalSQL.g:1262:2: ( ruleDataType )
            {
            // InternalSQL.g:1262:2: ( ruleDataType )
            // InternalSQL.g:1263:3: ruleDataType
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


    // $ANTLR start "rule__PrimaryKey__NameAssignment_3"
    // InternalSQL.g:1272:1: rule__PrimaryKey__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PrimaryKey__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1276:1: ( ( RULE_ID ) )
            // InternalSQL.g:1277:2: ( RULE_ID )
            {
            // InternalSQL.g:1277:2: ( RULE_ID )
            // InternalSQL.g:1278:3: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__NameAssignment_3"


    // $ANTLR start "rule__ForeignKey__NameAssignment_3"
    // InternalSQL.g:1287:1: rule__ForeignKey__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ForeignKey__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1291:1: ( ( RULE_ID ) )
            // InternalSQL.g:1292:2: ( RULE_ID )
            {
            // InternalSQL.g:1292:2: ( RULE_ID )
            // InternalSQL.g:1293:3: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__NameAssignment_3"


    // $ANTLR start "rule__ForeignKey__ReftableAssignment_6"
    // InternalSQL.g:1302:1: rule__ForeignKey__ReftableAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ReftableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1306:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1307:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1307:2: ( ( RULE_ID ) )
            // InternalSQL.g:1308:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getReftableTableCrossReference_6_0()); 
            // InternalSQL.g:1309:3: ( RULE_ID )
            // InternalSQL.g:1310:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getReftableTableIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getReftableTableIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getReftableTableCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ReftableAssignment_6"


    // $ANTLR start "rule__ForeignKey__RefAssignment_8"
    // InternalSQL.g:1321:1: rule__ForeignKey__RefAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1325:1: ( ( ( RULE_ID ) ) )
            // InternalSQL.g:1326:2: ( ( RULE_ID ) )
            {
            // InternalSQL.g:1326:2: ( ( RULE_ID ) )
            // InternalSQL.g:1327:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnCrossReference_8_0()); 
            // InternalSQL.g:1328:3: ( RULE_ID )
            // InternalSQL.g:1329:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getRefColumnIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRefColumnIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getRefColumnCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__RefAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000FFC00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});

}