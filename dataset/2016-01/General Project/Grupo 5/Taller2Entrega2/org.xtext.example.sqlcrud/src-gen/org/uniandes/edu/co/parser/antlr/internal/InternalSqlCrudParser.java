package org.uniandes.edu.co.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uniandes.edu.co.services.SqlCrudGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlCrudParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_TABLA", "RULE_NOMBRE", "RULE_LPAR", "RULE_RPAR", "RULE_PK", "RULE_COMMA", "RULE_FK", "RULE_REFERENCES", "RULE_NOTNULL", "RULE_TIPOINT", "RULE_VARCH", "RULE_ENTERO", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'SMALLINT'", "'BIGINT'", "'BOOLEAN'", "'REAL'", "'FLOAT'", "'DATE'", "'TIMESTAMP'", "'MULTISET'", "'XML'", "'BINARY'", "'VARBINARY'"
    };
    public static final int RULE_NOMBRE=6;
    public static final int RULE_PK=9;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_CREATE=4;
    public static final int RULE_TIPOINT=14;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_REFERENCES=12;
    public static final int RULE_ID=17;
    public static final int RULE_COMMA=10;
    public static final int RULE_WS=22;
    public static final int RULE_TABLA=5;
    public static final int RULE_NOTNULL=13;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_FK=11;
    public static final int T__26=26;
    public static final int RULE_VARCH=15;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__24=24;
    public static final int RULE_RPAR=8;
    public static final int T__25=25;
    public static final int RULE_ENTERO=16;
    public static final int RULE_LPAR=7;

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

        public InternalSqlCrudParser(TokenStream input, SqlCrudGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Database";
       	}

       	@Override
       	protected SqlCrudGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDatabase"
    // InternalSqlCrud.g:64:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSqlCrud.g:64:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSqlCrud.g:65:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalSqlCrud.g:71:1: ruleDatabase returns [EObject current=null] : ( () ( (lv_tables_1_0= ruleTable ) )+ ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_1_0 = null;



        	enterRule();

        try {
            // InternalSqlCrud.g:77:2: ( ( () ( (lv_tables_1_0= ruleTable ) )+ ) )
            // InternalSqlCrud.g:78:2: ( () ( (lv_tables_1_0= ruleTable ) )+ )
            {
            // InternalSqlCrud.g:78:2: ( () ( (lv_tables_1_0= ruleTable ) )+ )
            // InternalSqlCrud.g:79:3: () ( (lv_tables_1_0= ruleTable ) )+
            {
            // InternalSqlCrud.g:79:3: ()
            // InternalSqlCrud.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatabaseAccess().getDatabaseAction_0(),
            					current);
            			

            }

            // InternalSqlCrud.g:86:3: ( (lv_tables_1_0= ruleTable ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_CREATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSqlCrud.g:87:4: (lv_tables_1_0= ruleTable )
            	    {
            	    // InternalSqlCrud.g:87:4: (lv_tables_1_0= ruleTable )
            	    // InternalSqlCrud.g:88:5: lv_tables_1_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tables_1_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_1_0,
            	    						"org.uniandes.edu.co.SqlCrud.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // InternalSqlCrud.g:109:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSqlCrud.g:109:46: (iv_ruleTable= ruleTable EOF )
            // InternalSqlCrud.g:110:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSqlCrud.g:116:1: ruleTable returns [EObject current=null] : (this_CREATE_0= RULE_CREATE otherlv_1= ' ' this_TABLA_2= RULE_TABLA otherlv_3= ' ' ( (lv_nombre_4_0= RULE_NOMBRE ) ) (otherlv_5= ' ' )? this_LPAR_6= RULE_LPAR ( (lv_columnas_7_0= ruleColumna ) )+ ( (lv_prkey_8_0= rulePrimaryKey ) ) ( (lv_forkeys_9_0= ruleForeignKey ) )* this_RPAR_10= RULE_RPAR (otherlv_11= ' ' )? ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_CREATE_0=null;
        Token otherlv_1=null;
        Token this_TABLA_2=null;
        Token otherlv_3=null;
        Token lv_nombre_4_0=null;
        Token otherlv_5=null;
        Token this_LPAR_6=null;
        Token this_RPAR_10=null;
        Token otherlv_11=null;
        EObject lv_columnas_7_0 = null;

        EObject lv_prkey_8_0 = null;

        EObject lv_forkeys_9_0 = null;



        	enterRule();

        try {
            // InternalSqlCrud.g:122:2: ( (this_CREATE_0= RULE_CREATE otherlv_1= ' ' this_TABLA_2= RULE_TABLA otherlv_3= ' ' ( (lv_nombre_4_0= RULE_NOMBRE ) ) (otherlv_5= ' ' )? this_LPAR_6= RULE_LPAR ( (lv_columnas_7_0= ruleColumna ) )+ ( (lv_prkey_8_0= rulePrimaryKey ) ) ( (lv_forkeys_9_0= ruleForeignKey ) )* this_RPAR_10= RULE_RPAR (otherlv_11= ' ' )? ) )
            // InternalSqlCrud.g:123:2: (this_CREATE_0= RULE_CREATE otherlv_1= ' ' this_TABLA_2= RULE_TABLA otherlv_3= ' ' ( (lv_nombre_4_0= RULE_NOMBRE ) ) (otherlv_5= ' ' )? this_LPAR_6= RULE_LPAR ( (lv_columnas_7_0= ruleColumna ) )+ ( (lv_prkey_8_0= rulePrimaryKey ) ) ( (lv_forkeys_9_0= ruleForeignKey ) )* this_RPAR_10= RULE_RPAR (otherlv_11= ' ' )? )
            {
            // InternalSqlCrud.g:123:2: (this_CREATE_0= RULE_CREATE otherlv_1= ' ' this_TABLA_2= RULE_TABLA otherlv_3= ' ' ( (lv_nombre_4_0= RULE_NOMBRE ) ) (otherlv_5= ' ' )? this_LPAR_6= RULE_LPAR ( (lv_columnas_7_0= ruleColumna ) )+ ( (lv_prkey_8_0= rulePrimaryKey ) ) ( (lv_forkeys_9_0= ruleForeignKey ) )* this_RPAR_10= RULE_RPAR (otherlv_11= ' ' )? )
            // InternalSqlCrud.g:124:3: this_CREATE_0= RULE_CREATE otherlv_1= ' ' this_TABLA_2= RULE_TABLA otherlv_3= ' ' ( (lv_nombre_4_0= RULE_NOMBRE ) ) (otherlv_5= ' ' )? this_LPAR_6= RULE_LPAR ( (lv_columnas_7_0= ruleColumna ) )+ ( (lv_prkey_8_0= rulePrimaryKey ) ) ( (lv_forkeys_9_0= ruleForeignKey ) )* this_RPAR_10= RULE_RPAR (otherlv_11= ' ' )?
            {
            this_CREATE_0=(Token)match(input,RULE_CREATE,FOLLOW_4); 

            			newLeafNode(this_CREATE_0, grammarAccess.getTableAccess().getCREATETerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getSpaceKeyword_1());
            		
            this_TABLA_2=(Token)match(input,RULE_TABLA,FOLLOW_4); 

            			newLeafNode(this_TABLA_2, grammarAccess.getTableAccess().getTABLATerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getSpaceKeyword_3());
            		
            // InternalSqlCrud.g:140:3: ( (lv_nombre_4_0= RULE_NOMBRE ) )
            // InternalSqlCrud.g:141:4: (lv_nombre_4_0= RULE_NOMBRE )
            {
            // InternalSqlCrud.g:141:4: (lv_nombre_4_0= RULE_NOMBRE )
            // InternalSqlCrud.g:142:5: lv_nombre_4_0= RULE_NOMBRE
            {
            lv_nombre_4_0=(Token)match(input,RULE_NOMBRE,FOLLOW_7); 

            					newLeafNode(lv_nombre_4_0, grammarAccess.getTableAccess().getNombreNOMBRETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_4_0,
            						"org.uniandes.edu.co.SqlCrud.NOMBRE");
            				

            }


            }

            // InternalSqlCrud.g:158:3: (otherlv_5= ' ' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlCrud.g:159:4: otherlv_5= ' '
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getSpaceKeyword_5());
                    			

                    }
                    break;

            }

            this_LPAR_6=(Token)match(input,RULE_LPAR,FOLLOW_6); 

            			newLeafNode(this_LPAR_6, grammarAccess.getTableAccess().getLPARTerminalRuleCall_6());
            		
            // InternalSqlCrud.g:168:3: ( (lv_columnas_7_0= ruleColumna ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NOMBRE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSqlCrud.g:169:4: (lv_columnas_7_0= ruleColumna )
            	    {
            	    // InternalSqlCrud.g:169:4: (lv_columnas_7_0= ruleColumna )
            	    // InternalSqlCrud.g:170:5: lv_columnas_7_0= ruleColumna
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnasColumnaParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_columnas_7_0=ruleColumna();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columnas",
            	    						lv_columnas_7_0,
            	    						"org.uniandes.edu.co.SqlCrud.Columna");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalSqlCrud.g:187:3: ( (lv_prkey_8_0= rulePrimaryKey ) )
            // InternalSqlCrud.g:188:4: (lv_prkey_8_0= rulePrimaryKey )
            {
            // InternalSqlCrud.g:188:4: (lv_prkey_8_0= rulePrimaryKey )
            // InternalSqlCrud.g:189:5: lv_prkey_8_0= rulePrimaryKey
            {

            					newCompositeNode(grammarAccess.getTableAccess().getPrkeyPrimaryKeyParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_prkey_8_0=rulePrimaryKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"prkey",
            						lv_prkey_8_0,
            						"org.uniandes.edu.co.SqlCrud.PrimaryKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlCrud.g:206:3: ( (lv_forkeys_9_0= ruleForeignKey ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSqlCrud.g:207:4: (lv_forkeys_9_0= ruleForeignKey )
            	    {
            	    // InternalSqlCrud.g:207:4: (lv_forkeys_9_0= ruleForeignKey )
            	    // InternalSqlCrud.g:208:5: lv_forkeys_9_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getForkeysForeignKeyParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_forkeys_9_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"forkeys",
            	    						lv_forkeys_9_0,
            	    						"org.uniandes.edu.co.SqlCrud.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RPAR_10=(Token)match(input,RULE_RPAR,FOLLOW_11); 

            			newLeafNode(this_RPAR_10, grammarAccess.getTableAccess().getRPARTerminalRuleCall_10());
            		
            // InternalSqlCrud.g:229:3: (otherlv_11= ' ' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSqlCrud.g:230:4: otherlv_11= ' '
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getTableAccess().getSpaceKeyword_11());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalSqlCrud.g:239:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSqlCrud.g:239:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSqlCrud.g:240:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalSqlCrud.g:246:1: rulePrimaryKey returns [EObject current=null] : (this_PK_0= RULE_PK (otherlv_1= ' ' )? this_LPAR_2= RULE_LPAR ( (lv_cols_3_0= RULE_NOMBRE ) ) (this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) ) )* this_RPAR_7= RULE_RPAR ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token this_PK_0=null;
        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token lv_cols_3_0=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token lv_cols_6_0=null;
        Token this_RPAR_7=null;


        	enterRule();

        try {
            // InternalSqlCrud.g:252:2: ( (this_PK_0= RULE_PK (otherlv_1= ' ' )? this_LPAR_2= RULE_LPAR ( (lv_cols_3_0= RULE_NOMBRE ) ) (this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) ) )* this_RPAR_7= RULE_RPAR ) )
            // InternalSqlCrud.g:253:2: (this_PK_0= RULE_PK (otherlv_1= ' ' )? this_LPAR_2= RULE_LPAR ( (lv_cols_3_0= RULE_NOMBRE ) ) (this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) ) )* this_RPAR_7= RULE_RPAR )
            {
            // InternalSqlCrud.g:253:2: (this_PK_0= RULE_PK (otherlv_1= ' ' )? this_LPAR_2= RULE_LPAR ( (lv_cols_3_0= RULE_NOMBRE ) ) (this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) ) )* this_RPAR_7= RULE_RPAR )
            // InternalSqlCrud.g:254:3: this_PK_0= RULE_PK (otherlv_1= ' ' )? this_LPAR_2= RULE_LPAR ( (lv_cols_3_0= RULE_NOMBRE ) ) (this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) ) )* this_RPAR_7= RULE_RPAR
            {
            this_PK_0=(Token)match(input,RULE_PK,FOLLOW_7); 

            			newLeafNode(this_PK_0, grammarAccess.getPrimaryKeyAccess().getPKTerminalRuleCall_0());
            		
            // InternalSqlCrud.g:258:3: (otherlv_1= ' ' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSqlCrud.g:259:4: otherlv_1= ' '
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getSpaceKeyword_1());
                    			

                    }
                    break;

            }

            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_6); 

            			newLeafNode(this_LPAR_2, grammarAccess.getPrimaryKeyAccess().getLPARTerminalRuleCall_2());
            		
            // InternalSqlCrud.g:268:3: ( (lv_cols_3_0= RULE_NOMBRE ) )
            // InternalSqlCrud.g:269:4: (lv_cols_3_0= RULE_NOMBRE )
            {
            // InternalSqlCrud.g:269:4: (lv_cols_3_0= RULE_NOMBRE )
            // InternalSqlCrud.g:270:5: lv_cols_3_0= RULE_NOMBRE
            {
            lv_cols_3_0=(Token)match(input,RULE_NOMBRE,FOLLOW_10); 

            					newLeafNode(lv_cols_3_0, grammarAccess.getPrimaryKeyAccess().getColsNOMBRETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            					addWithLastConsumed(
            						current,
            						"cols",
            						lv_cols_3_0,
            						"org.uniandes.edu.co.SqlCrud.NOMBRE");
            				

            }


            }

            // InternalSqlCrud.g:286:3: (this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqlCrud.g:287:4: this_COMMA_4= RULE_COMMA (otherlv_5= ' ' )? ( (lv_cols_6_0= RULE_NOMBRE ) )
            	    {
            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            	    				newLeafNode(this_COMMA_4, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    			
            	    // InternalSqlCrud.g:291:4: (otherlv_5= ' ' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==24) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalSqlCrud.g:292:5: otherlv_5= ' '
            	            {
            	            otherlv_5=(Token)match(input,24,FOLLOW_6); 

            	            					newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getSpaceKeyword_4_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlCrud.g:297:4: ( (lv_cols_6_0= RULE_NOMBRE ) )
            	    // InternalSqlCrud.g:298:5: (lv_cols_6_0= RULE_NOMBRE )
            	    {
            	    // InternalSqlCrud.g:298:5: (lv_cols_6_0= RULE_NOMBRE )
            	    // InternalSqlCrud.g:299:6: lv_cols_6_0= RULE_NOMBRE
            	    {
            	    lv_cols_6_0=(Token)match(input,RULE_NOMBRE,FOLLOW_10); 

            	    						newLeafNode(lv_cols_6_0, grammarAccess.getPrimaryKeyAccess().getColsNOMBRETerminalRuleCall_4_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"cols",
            	    							lv_cols_6_0,
            	    							"org.uniandes.edu.co.SqlCrud.NOMBRE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_RPAR_7=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_7, grammarAccess.getPrimaryKeyAccess().getRPARTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalSqlCrud.g:324:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSqlCrud.g:324:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSqlCrud.g:325:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalSqlCrud.g:331:1: ruleForeignKey returns [EObject current=null] : (this_COMMA_0= RULE_COMMA (otherlv_1= ' ' )? this_FK_2= RULE_FK (otherlv_3= ' ' )? this_LPAR_4= RULE_LPAR (otherlv_5= ' ' )? ( (lv_column_6_0= RULE_NOMBRE ) ) this_RPAR_7= RULE_RPAR (otherlv_8= ' ' )? this_REFERENCES_9= RULE_REFERENCES otherlv_10= ' ' ( (lv_referencetab_11_0= RULE_NOMBRE ) ) (otherlv_12= ' ' )? this_LPAR_13= RULE_LPAR (otherlv_14= ' ' )? ( (lv_referencecol_15_0= RULE_NOMBRE ) ) this_RPAR_16= RULE_RPAR (otherlv_17= ' ' )? ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_0=null;
        Token otherlv_1=null;
        Token this_FK_2=null;
        Token otherlv_3=null;
        Token this_LPAR_4=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;
        Token this_RPAR_7=null;
        Token otherlv_8=null;
        Token this_REFERENCES_9=null;
        Token otherlv_10=null;
        Token lv_referencetab_11_0=null;
        Token otherlv_12=null;
        Token this_LPAR_13=null;
        Token otherlv_14=null;
        Token lv_referencecol_15_0=null;
        Token this_RPAR_16=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalSqlCrud.g:337:2: ( (this_COMMA_0= RULE_COMMA (otherlv_1= ' ' )? this_FK_2= RULE_FK (otherlv_3= ' ' )? this_LPAR_4= RULE_LPAR (otherlv_5= ' ' )? ( (lv_column_6_0= RULE_NOMBRE ) ) this_RPAR_7= RULE_RPAR (otherlv_8= ' ' )? this_REFERENCES_9= RULE_REFERENCES otherlv_10= ' ' ( (lv_referencetab_11_0= RULE_NOMBRE ) ) (otherlv_12= ' ' )? this_LPAR_13= RULE_LPAR (otherlv_14= ' ' )? ( (lv_referencecol_15_0= RULE_NOMBRE ) ) this_RPAR_16= RULE_RPAR (otherlv_17= ' ' )? ) )
            // InternalSqlCrud.g:338:2: (this_COMMA_0= RULE_COMMA (otherlv_1= ' ' )? this_FK_2= RULE_FK (otherlv_3= ' ' )? this_LPAR_4= RULE_LPAR (otherlv_5= ' ' )? ( (lv_column_6_0= RULE_NOMBRE ) ) this_RPAR_7= RULE_RPAR (otherlv_8= ' ' )? this_REFERENCES_9= RULE_REFERENCES otherlv_10= ' ' ( (lv_referencetab_11_0= RULE_NOMBRE ) ) (otherlv_12= ' ' )? this_LPAR_13= RULE_LPAR (otherlv_14= ' ' )? ( (lv_referencecol_15_0= RULE_NOMBRE ) ) this_RPAR_16= RULE_RPAR (otherlv_17= ' ' )? )
            {
            // InternalSqlCrud.g:338:2: (this_COMMA_0= RULE_COMMA (otherlv_1= ' ' )? this_FK_2= RULE_FK (otherlv_3= ' ' )? this_LPAR_4= RULE_LPAR (otherlv_5= ' ' )? ( (lv_column_6_0= RULE_NOMBRE ) ) this_RPAR_7= RULE_RPAR (otherlv_8= ' ' )? this_REFERENCES_9= RULE_REFERENCES otherlv_10= ' ' ( (lv_referencetab_11_0= RULE_NOMBRE ) ) (otherlv_12= ' ' )? this_LPAR_13= RULE_LPAR (otherlv_14= ' ' )? ( (lv_referencecol_15_0= RULE_NOMBRE ) ) this_RPAR_16= RULE_RPAR (otherlv_17= ' ' )? )
            // InternalSqlCrud.g:339:3: this_COMMA_0= RULE_COMMA (otherlv_1= ' ' )? this_FK_2= RULE_FK (otherlv_3= ' ' )? this_LPAR_4= RULE_LPAR (otherlv_5= ' ' )? ( (lv_column_6_0= RULE_NOMBRE ) ) this_RPAR_7= RULE_RPAR (otherlv_8= ' ' )? this_REFERENCES_9= RULE_REFERENCES otherlv_10= ' ' ( (lv_referencetab_11_0= RULE_NOMBRE ) ) (otherlv_12= ' ' )? this_LPAR_13= RULE_LPAR (otherlv_14= ' ' )? ( (lv_referencecol_15_0= RULE_NOMBRE ) ) this_RPAR_16= RULE_RPAR (otherlv_17= ' ' )?
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_0, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_0());
            		
            // InternalSqlCrud.g:343:3: (otherlv_1= ' ' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSqlCrud.g:344:4: otherlv_1= ' '
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getSpaceKeyword_1());
                    			

                    }
                    break;

            }

            this_FK_2=(Token)match(input,RULE_FK,FOLLOW_7); 

            			newLeafNode(this_FK_2, grammarAccess.getForeignKeyAccess().getFKTerminalRuleCall_2());
            		
            // InternalSqlCrud.g:353:3: (otherlv_3= ' ' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlCrud.g:354:4: otherlv_3= ' '
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getSpaceKeyword_3());
                    			

                    }
                    break;

            }

            this_LPAR_4=(Token)match(input,RULE_LPAR,FOLLOW_12); 

            			newLeafNode(this_LPAR_4, grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_4());
            		
            // InternalSqlCrud.g:363:3: (otherlv_5= ' ' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSqlCrud.g:364:4: otherlv_5= ' '
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getSpaceKeyword_5());
                    			

                    }
                    break;

            }

            // InternalSqlCrud.g:369:3: ( (lv_column_6_0= RULE_NOMBRE ) )
            // InternalSqlCrud.g:370:4: (lv_column_6_0= RULE_NOMBRE )
            {
            // InternalSqlCrud.g:370:4: (lv_column_6_0= RULE_NOMBRE )
            // InternalSqlCrud.g:371:5: lv_column_6_0= RULE_NOMBRE
            {
            lv_column_6_0=(Token)match(input,RULE_NOMBRE,FOLLOW_15); 

            					newLeafNode(lv_column_6_0, grammarAccess.getForeignKeyAccess().getColumnNOMBRETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_6_0,
            						"org.uniandes.edu.co.SqlCrud.NOMBRE");
            				

            }


            }

            this_RPAR_7=(Token)match(input,RULE_RPAR,FOLLOW_16); 

            			newLeafNode(this_RPAR_7, grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_7());
            		
            // InternalSqlCrud.g:391:3: (otherlv_8= ' ' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlCrud.g:392:4: otherlv_8= ' '
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getSpaceKeyword_8());
                    			

                    }
                    break;

            }

            this_REFERENCES_9=(Token)match(input,RULE_REFERENCES,FOLLOW_4); 

            			newLeafNode(this_REFERENCES_9, grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getSpaceKeyword_10());
            		
            // InternalSqlCrud.g:405:3: ( (lv_referencetab_11_0= RULE_NOMBRE ) )
            // InternalSqlCrud.g:406:4: (lv_referencetab_11_0= RULE_NOMBRE )
            {
            // InternalSqlCrud.g:406:4: (lv_referencetab_11_0= RULE_NOMBRE )
            // InternalSqlCrud.g:407:5: lv_referencetab_11_0= RULE_NOMBRE
            {
            lv_referencetab_11_0=(Token)match(input,RULE_NOMBRE,FOLLOW_7); 

            					newLeafNode(lv_referencetab_11_0, grammarAccess.getForeignKeyAccess().getReferencetabNOMBRETerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referencetab",
            						lv_referencetab_11_0,
            						"org.uniandes.edu.co.SqlCrud.NOMBRE");
            				

            }


            }

            // InternalSqlCrud.g:423:3: (otherlv_12= ' ' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSqlCrud.g:424:4: otherlv_12= ' '
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getSpaceKeyword_12());
                    			

                    }
                    break;

            }

            this_LPAR_13=(Token)match(input,RULE_LPAR,FOLLOW_12); 

            			newLeafNode(this_LPAR_13, grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_13());
            		
            // InternalSqlCrud.g:433:3: (otherlv_14= ' ' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSqlCrud.g:434:4: otherlv_14= ' '
                    {
                    otherlv_14=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getForeignKeyAccess().getSpaceKeyword_14());
                    			

                    }
                    break;

            }

            // InternalSqlCrud.g:439:3: ( (lv_referencecol_15_0= RULE_NOMBRE ) )
            // InternalSqlCrud.g:440:4: (lv_referencecol_15_0= RULE_NOMBRE )
            {
            // InternalSqlCrud.g:440:4: (lv_referencecol_15_0= RULE_NOMBRE )
            // InternalSqlCrud.g:441:5: lv_referencecol_15_0= RULE_NOMBRE
            {
            lv_referencecol_15_0=(Token)match(input,RULE_NOMBRE,FOLLOW_15); 

            					newLeafNode(lv_referencecol_15_0, grammarAccess.getForeignKeyAccess().getReferencecolNOMBRETerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referencecol",
            						lv_referencecol_15_0,
            						"org.uniandes.edu.co.SqlCrud.NOMBRE");
            				

            }


            }

            this_RPAR_16=(Token)match(input,RULE_RPAR,FOLLOW_11); 

            			newLeafNode(this_RPAR_16, grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_16());
            		
            // InternalSqlCrud.g:461:3: (otherlv_17= ' ' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlCrud.g:462:4: otherlv_17= ' '
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getForeignKeyAccess().getSpaceKeyword_17());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleColumna"
    // InternalSqlCrud.g:471:1: entryRuleColumna returns [EObject current=null] : iv_ruleColumna= ruleColumna EOF ;
    public final EObject entryRuleColumna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumna = null;


        try {
            // InternalSqlCrud.g:471:48: (iv_ruleColumna= ruleColumna EOF )
            // InternalSqlCrud.g:472:2: iv_ruleColumna= ruleColumna EOF
            {
             newCompositeNode(grammarAccess.getColumnaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumna=ruleColumna();

            state._fsp--;

             current =iv_ruleColumna; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumna"


    // $ANTLR start "ruleColumna"
    // InternalSqlCrud.g:478:1: ruleColumna returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_NOMBRE ) ) otherlv_1= ' ' ( (lv_tipo_2_0= ruleColumnTipoEnum ) ) (otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) ) )? this_COMMA_5= RULE_COMMA ) ;
    public final EObject ruleColumna() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_notnullable_4_0=null;
        Token this_COMMA_5=null;
        EObject lv_tipo_2_0 = null;



        	enterRule();

        try {
            // InternalSqlCrud.g:484:2: ( ( ( (lv_nombre_0_0= RULE_NOMBRE ) ) otherlv_1= ' ' ( (lv_tipo_2_0= ruleColumnTipoEnum ) ) (otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) ) )? this_COMMA_5= RULE_COMMA ) )
            // InternalSqlCrud.g:485:2: ( ( (lv_nombre_0_0= RULE_NOMBRE ) ) otherlv_1= ' ' ( (lv_tipo_2_0= ruleColumnTipoEnum ) ) (otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) ) )? this_COMMA_5= RULE_COMMA )
            {
            // InternalSqlCrud.g:485:2: ( ( (lv_nombre_0_0= RULE_NOMBRE ) ) otherlv_1= ' ' ( (lv_tipo_2_0= ruleColumnTipoEnum ) ) (otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) ) )? this_COMMA_5= RULE_COMMA )
            // InternalSqlCrud.g:486:3: ( (lv_nombre_0_0= RULE_NOMBRE ) ) otherlv_1= ' ' ( (lv_tipo_2_0= ruleColumnTipoEnum ) ) (otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) ) )? this_COMMA_5= RULE_COMMA
            {
            // InternalSqlCrud.g:486:3: ( (lv_nombre_0_0= RULE_NOMBRE ) )
            // InternalSqlCrud.g:487:4: (lv_nombre_0_0= RULE_NOMBRE )
            {
            // InternalSqlCrud.g:487:4: (lv_nombre_0_0= RULE_NOMBRE )
            // InternalSqlCrud.g:488:5: lv_nombre_0_0= RULE_NOMBRE
            {
            lv_nombre_0_0=(Token)match(input,RULE_NOMBRE,FOLLOW_4); 

            					newLeafNode(lv_nombre_0_0, grammarAccess.getColumnaAccess().getNombreNOMBRETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_0_0,
            						"org.uniandes.edu.co.SqlCrud.NOMBRE");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnaAccess().getSpaceKeyword_1());
            		
            // InternalSqlCrud.g:508:3: ( (lv_tipo_2_0= ruleColumnTipoEnum ) )
            // InternalSqlCrud.g:509:4: (lv_tipo_2_0= ruleColumnTipoEnum )
            {
            // InternalSqlCrud.g:509:4: (lv_tipo_2_0= ruleColumnTipoEnum )
            // InternalSqlCrud.g:510:5: lv_tipo_2_0= ruleColumnTipoEnum
            {

            					newCompositeNode(grammarAccess.getColumnaAccess().getTipoColumnTipoEnumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_tipo_2_0=ruleColumnTipoEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnaRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_2_0,
            						"org.uniandes.edu.co.SqlCrud.ColumnTipoEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlCrud.g:527:3: (otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSqlCrud.g:528:4: otherlv_3= ' ' ( (lv_notnullable_4_0= RULE_NOTNULL ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnaAccess().getSpaceKeyword_3_0());
                    			
                    // InternalSqlCrud.g:532:4: ( (lv_notnullable_4_0= RULE_NOTNULL ) )
                    // InternalSqlCrud.g:533:5: (lv_notnullable_4_0= RULE_NOTNULL )
                    {
                    // InternalSqlCrud.g:533:5: (lv_notnullable_4_0= RULE_NOTNULL )
                    // InternalSqlCrud.g:534:6: lv_notnullable_4_0= RULE_NOTNULL
                    {
                    lv_notnullable_4_0=(Token)match(input,RULE_NOTNULL,FOLLOW_21); 

                    						newLeafNode(lv_notnullable_4_0, grammarAccess.getColumnaAccess().getNotnullableNOTNULLTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"notnullable",
                    							lv_notnullable_4_0,
                    							"org.uniandes.edu.co.SqlCrud.NOTNULL");
                    					

                    }


                    }


                    }
                    break;

            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_2); 

            			newLeafNode(this_COMMA_5, grammarAccess.getColumnaAccess().getCOMMATerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumna"


    // $ANTLR start "entryRuleColumnTipoEnum"
    // InternalSqlCrud.g:559:1: entryRuleColumnTipoEnum returns [EObject current=null] : iv_ruleColumnTipoEnum= ruleColumnTipoEnum EOF ;
    public final EObject entryRuleColumnTipoEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTipoEnum = null;


        try {
            // InternalSqlCrud.g:559:55: (iv_ruleColumnTipoEnum= ruleColumnTipoEnum EOF )
            // InternalSqlCrud.g:560:2: iv_ruleColumnTipoEnum= ruleColumnTipoEnum EOF
            {
             newCompositeNode(grammarAccess.getColumnTipoEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnTipoEnum=ruleColumnTipoEnum();

            state._fsp--;

             current =iv_ruleColumnTipoEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnTipoEnum"


    // $ANTLR start "ruleColumnTipoEnum"
    // InternalSqlCrud.g:566:1: ruleColumnTipoEnum returns [EObject current=null] : ( ( (lv_intt_0_0= RULE_TIPOINT ) ) | ( (lv_varchart_1_0= ruleVarchar ) ) | ( (lv_smallintt_2_0= 'SMALLINT' ) ) | ( (lv_bigintt_3_0= 'BIGINT' ) ) | ( (lv_booleant_4_0= 'BOOLEAN' ) ) | ( (lv_realt_5_0= 'REAL' ) ) | ( (lv_floatt_6_0= 'FLOAT' ) ) | ( (lv_binaryt_7_0= ruleBinary ) ) | ( (lv_varbinaryt_8_0= ruleVarBinary ) ) | ( (lv_datet_9_0= 'DATE' ) ) | ( (lv_timestampt_10_0= 'TIMESTAMP' ) ) | ( (lv_multisett_11_0= 'MULTISET' ) ) | ( (lv_xmlt_12_0= 'XML' ) ) ) ;
    public final EObject ruleColumnTipoEnum() throws RecognitionException {
        EObject current = null;

        Token lv_intt_0_0=null;
        Token lv_smallintt_2_0=null;
        Token lv_bigintt_3_0=null;
        Token lv_booleant_4_0=null;
        Token lv_realt_5_0=null;
        Token lv_floatt_6_0=null;
        Token lv_datet_9_0=null;
        Token lv_timestampt_10_0=null;
        Token lv_multisett_11_0=null;
        Token lv_xmlt_12_0=null;
        EObject lv_varchart_1_0 = null;

        EObject lv_binaryt_7_0 = null;

        EObject lv_varbinaryt_8_0 = null;



        	enterRule();

        try {
            // InternalSqlCrud.g:572:2: ( ( ( (lv_intt_0_0= RULE_TIPOINT ) ) | ( (lv_varchart_1_0= ruleVarchar ) ) | ( (lv_smallintt_2_0= 'SMALLINT' ) ) | ( (lv_bigintt_3_0= 'BIGINT' ) ) | ( (lv_booleant_4_0= 'BOOLEAN' ) ) | ( (lv_realt_5_0= 'REAL' ) ) | ( (lv_floatt_6_0= 'FLOAT' ) ) | ( (lv_binaryt_7_0= ruleBinary ) ) | ( (lv_varbinaryt_8_0= ruleVarBinary ) ) | ( (lv_datet_9_0= 'DATE' ) ) | ( (lv_timestampt_10_0= 'TIMESTAMP' ) ) | ( (lv_multisett_11_0= 'MULTISET' ) ) | ( (lv_xmlt_12_0= 'XML' ) ) ) )
            // InternalSqlCrud.g:573:2: ( ( (lv_intt_0_0= RULE_TIPOINT ) ) | ( (lv_varchart_1_0= ruleVarchar ) ) | ( (lv_smallintt_2_0= 'SMALLINT' ) ) | ( (lv_bigintt_3_0= 'BIGINT' ) ) | ( (lv_booleant_4_0= 'BOOLEAN' ) ) | ( (lv_realt_5_0= 'REAL' ) ) | ( (lv_floatt_6_0= 'FLOAT' ) ) | ( (lv_binaryt_7_0= ruleBinary ) ) | ( (lv_varbinaryt_8_0= ruleVarBinary ) ) | ( (lv_datet_9_0= 'DATE' ) ) | ( (lv_timestampt_10_0= 'TIMESTAMP' ) ) | ( (lv_multisett_11_0= 'MULTISET' ) ) | ( (lv_xmlt_12_0= 'XML' ) ) )
            {
            // InternalSqlCrud.g:573:2: ( ( (lv_intt_0_0= RULE_TIPOINT ) ) | ( (lv_varchart_1_0= ruleVarchar ) ) | ( (lv_smallintt_2_0= 'SMALLINT' ) ) | ( (lv_bigintt_3_0= 'BIGINT' ) ) | ( (lv_booleant_4_0= 'BOOLEAN' ) ) | ( (lv_realt_5_0= 'REAL' ) ) | ( (lv_floatt_6_0= 'FLOAT' ) ) | ( (lv_binaryt_7_0= ruleBinary ) ) | ( (lv_varbinaryt_8_0= ruleVarBinary ) ) | ( (lv_datet_9_0= 'DATE' ) ) | ( (lv_timestampt_10_0= 'TIMESTAMP' ) ) | ( (lv_multisett_11_0= 'MULTISET' ) ) | ( (lv_xmlt_12_0= 'XML' ) ) )
            int alt17=13;
            switch ( input.LA(1) ) {
            case RULE_TIPOINT:
                {
                alt17=1;
                }
                break;
            case RULE_VARCH:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            case 26:
                {
                alt17=4;
                }
                break;
            case 27:
                {
                alt17=5;
                }
                break;
            case 28:
                {
                alt17=6;
                }
                break;
            case 29:
                {
                alt17=7;
                }
                break;
            case 34:
                {
                alt17=8;
                }
                break;
            case 35:
                {
                alt17=9;
                }
                break;
            case 30:
                {
                alt17=10;
                }
                break;
            case 31:
                {
                alt17=11;
                }
                break;
            case 32:
                {
                alt17=12;
                }
                break;
            case 33:
                {
                alt17=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSqlCrud.g:574:3: ( (lv_intt_0_0= RULE_TIPOINT ) )
                    {
                    // InternalSqlCrud.g:574:3: ( (lv_intt_0_0= RULE_TIPOINT ) )
                    // InternalSqlCrud.g:575:4: (lv_intt_0_0= RULE_TIPOINT )
                    {
                    // InternalSqlCrud.g:575:4: (lv_intt_0_0= RULE_TIPOINT )
                    // InternalSqlCrud.g:576:5: lv_intt_0_0= RULE_TIPOINT
                    {
                    lv_intt_0_0=(Token)match(input,RULE_TIPOINT,FOLLOW_2); 

                    					newLeafNode(lv_intt_0_0, grammarAccess.getColumnTipoEnumAccess().getInttTIPOINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intt",
                    						lv_intt_0_0,
                    						"org.uniandes.edu.co.SqlCrud.TIPOINT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlCrud.g:593:3: ( (lv_varchart_1_0= ruleVarchar ) )
                    {
                    // InternalSqlCrud.g:593:3: ( (lv_varchart_1_0= ruleVarchar ) )
                    // InternalSqlCrud.g:594:4: (lv_varchart_1_0= ruleVarchar )
                    {
                    // InternalSqlCrud.g:594:4: (lv_varchart_1_0= ruleVarchar )
                    // InternalSqlCrud.g:595:5: lv_varchart_1_0= ruleVarchar
                    {

                    					newCompositeNode(grammarAccess.getColumnTipoEnumAccess().getVarchartVarcharParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_varchart_1_0=ruleVarchar();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					set(
                    						current,
                    						"varchart",
                    						lv_varchart_1_0,
                    						"org.uniandes.edu.co.SqlCrud.Varchar");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSqlCrud.g:613:3: ( (lv_smallintt_2_0= 'SMALLINT' ) )
                    {
                    // InternalSqlCrud.g:613:3: ( (lv_smallintt_2_0= 'SMALLINT' ) )
                    // InternalSqlCrud.g:614:4: (lv_smallintt_2_0= 'SMALLINT' )
                    {
                    // InternalSqlCrud.g:614:4: (lv_smallintt_2_0= 'SMALLINT' )
                    // InternalSqlCrud.g:615:5: lv_smallintt_2_0= 'SMALLINT'
                    {
                    lv_smallintt_2_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_smallintt_2_0, grammarAccess.getColumnTipoEnumAccess().getSmallinttSMALLINTKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "smallintt", lv_smallintt_2_0, "SMALLINT");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSqlCrud.g:628:3: ( (lv_bigintt_3_0= 'BIGINT' ) )
                    {
                    // InternalSqlCrud.g:628:3: ( (lv_bigintt_3_0= 'BIGINT' ) )
                    // InternalSqlCrud.g:629:4: (lv_bigintt_3_0= 'BIGINT' )
                    {
                    // InternalSqlCrud.g:629:4: (lv_bigintt_3_0= 'BIGINT' )
                    // InternalSqlCrud.g:630:5: lv_bigintt_3_0= 'BIGINT'
                    {
                    lv_bigintt_3_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_bigintt_3_0, grammarAccess.getColumnTipoEnumAccess().getBiginttBIGINTKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "bigintt", lv_bigintt_3_0, "BIGINT");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSqlCrud.g:643:3: ( (lv_booleant_4_0= 'BOOLEAN' ) )
                    {
                    // InternalSqlCrud.g:643:3: ( (lv_booleant_4_0= 'BOOLEAN' ) )
                    // InternalSqlCrud.g:644:4: (lv_booleant_4_0= 'BOOLEAN' )
                    {
                    // InternalSqlCrud.g:644:4: (lv_booleant_4_0= 'BOOLEAN' )
                    // InternalSqlCrud.g:645:5: lv_booleant_4_0= 'BOOLEAN'
                    {
                    lv_booleant_4_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_booleant_4_0, grammarAccess.getColumnTipoEnumAccess().getBooleantBOOLEANKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "booleant", lv_booleant_4_0, "BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSqlCrud.g:658:3: ( (lv_realt_5_0= 'REAL' ) )
                    {
                    // InternalSqlCrud.g:658:3: ( (lv_realt_5_0= 'REAL' ) )
                    // InternalSqlCrud.g:659:4: (lv_realt_5_0= 'REAL' )
                    {
                    // InternalSqlCrud.g:659:4: (lv_realt_5_0= 'REAL' )
                    // InternalSqlCrud.g:660:5: lv_realt_5_0= 'REAL'
                    {
                    lv_realt_5_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_realt_5_0, grammarAccess.getColumnTipoEnumAccess().getRealtREALKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "realt", lv_realt_5_0, "REAL");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSqlCrud.g:673:3: ( (lv_floatt_6_0= 'FLOAT' ) )
                    {
                    // InternalSqlCrud.g:673:3: ( (lv_floatt_6_0= 'FLOAT' ) )
                    // InternalSqlCrud.g:674:4: (lv_floatt_6_0= 'FLOAT' )
                    {
                    // InternalSqlCrud.g:674:4: (lv_floatt_6_0= 'FLOAT' )
                    // InternalSqlCrud.g:675:5: lv_floatt_6_0= 'FLOAT'
                    {
                    lv_floatt_6_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_floatt_6_0, grammarAccess.getColumnTipoEnumAccess().getFloattFLOATKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "floatt", lv_floatt_6_0, "FLOAT");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalSqlCrud.g:688:3: ( (lv_binaryt_7_0= ruleBinary ) )
                    {
                    // InternalSqlCrud.g:688:3: ( (lv_binaryt_7_0= ruleBinary ) )
                    // InternalSqlCrud.g:689:4: (lv_binaryt_7_0= ruleBinary )
                    {
                    // InternalSqlCrud.g:689:4: (lv_binaryt_7_0= ruleBinary )
                    // InternalSqlCrud.g:690:5: lv_binaryt_7_0= ruleBinary
                    {

                    					newCompositeNode(grammarAccess.getColumnTipoEnumAccess().getBinarytBinaryParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_binaryt_7_0=ruleBinary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					set(
                    						current,
                    						"binaryt",
                    						lv_binaryt_7_0,
                    						"org.uniandes.edu.co.SqlCrud.Binary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalSqlCrud.g:708:3: ( (lv_varbinaryt_8_0= ruleVarBinary ) )
                    {
                    // InternalSqlCrud.g:708:3: ( (lv_varbinaryt_8_0= ruleVarBinary ) )
                    // InternalSqlCrud.g:709:4: (lv_varbinaryt_8_0= ruleVarBinary )
                    {
                    // InternalSqlCrud.g:709:4: (lv_varbinaryt_8_0= ruleVarBinary )
                    // InternalSqlCrud.g:710:5: lv_varbinaryt_8_0= ruleVarBinary
                    {

                    					newCompositeNode(grammarAccess.getColumnTipoEnumAccess().getVarbinarytVarBinaryParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_varbinaryt_8_0=ruleVarBinary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					set(
                    						current,
                    						"varbinaryt",
                    						lv_varbinaryt_8_0,
                    						"org.uniandes.edu.co.SqlCrud.VarBinary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalSqlCrud.g:728:3: ( (lv_datet_9_0= 'DATE' ) )
                    {
                    // InternalSqlCrud.g:728:3: ( (lv_datet_9_0= 'DATE' ) )
                    // InternalSqlCrud.g:729:4: (lv_datet_9_0= 'DATE' )
                    {
                    // InternalSqlCrud.g:729:4: (lv_datet_9_0= 'DATE' )
                    // InternalSqlCrud.g:730:5: lv_datet_9_0= 'DATE'
                    {
                    lv_datet_9_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_datet_9_0, grammarAccess.getColumnTipoEnumAccess().getDatetDATEKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "datet", lv_datet_9_0, "DATE");
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalSqlCrud.g:743:3: ( (lv_timestampt_10_0= 'TIMESTAMP' ) )
                    {
                    // InternalSqlCrud.g:743:3: ( (lv_timestampt_10_0= 'TIMESTAMP' ) )
                    // InternalSqlCrud.g:744:4: (lv_timestampt_10_0= 'TIMESTAMP' )
                    {
                    // InternalSqlCrud.g:744:4: (lv_timestampt_10_0= 'TIMESTAMP' )
                    // InternalSqlCrud.g:745:5: lv_timestampt_10_0= 'TIMESTAMP'
                    {
                    lv_timestampt_10_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_timestampt_10_0, grammarAccess.getColumnTipoEnumAccess().getTimestamptTIMESTAMPKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "timestampt", lv_timestampt_10_0, "TIMESTAMP");
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalSqlCrud.g:758:3: ( (lv_multisett_11_0= 'MULTISET' ) )
                    {
                    // InternalSqlCrud.g:758:3: ( (lv_multisett_11_0= 'MULTISET' ) )
                    // InternalSqlCrud.g:759:4: (lv_multisett_11_0= 'MULTISET' )
                    {
                    // InternalSqlCrud.g:759:4: (lv_multisett_11_0= 'MULTISET' )
                    // InternalSqlCrud.g:760:5: lv_multisett_11_0= 'MULTISET'
                    {
                    lv_multisett_11_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_multisett_11_0, grammarAccess.getColumnTipoEnumAccess().getMultisettMULTISETKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "multisett", lv_multisett_11_0, "MULTISET");
                    				

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalSqlCrud.g:773:3: ( (lv_xmlt_12_0= 'XML' ) )
                    {
                    // InternalSqlCrud.g:773:3: ( (lv_xmlt_12_0= 'XML' ) )
                    // InternalSqlCrud.g:774:4: (lv_xmlt_12_0= 'XML' )
                    {
                    // InternalSqlCrud.g:774:4: (lv_xmlt_12_0= 'XML' )
                    // InternalSqlCrud.g:775:5: lv_xmlt_12_0= 'XML'
                    {
                    lv_xmlt_12_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_xmlt_12_0, grammarAccess.getColumnTipoEnumAccess().getXmltXMLKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnTipoEnumRule());
                    					}
                    					setWithLastConsumed(current, "xmlt", lv_xmlt_12_0, "XML");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnTipoEnum"


    // $ANTLR start "entryRuleVarchar"
    // InternalSqlCrud.g:791:1: entryRuleVarchar returns [EObject current=null] : iv_ruleVarchar= ruleVarchar EOF ;
    public final EObject entryRuleVarchar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarchar = null;


        try {
            // InternalSqlCrud.g:791:48: (iv_ruleVarchar= ruleVarchar EOF )
            // InternalSqlCrud.g:792:2: iv_ruleVarchar= ruleVarchar EOF
            {
             newCompositeNode(grammarAccess.getVarcharRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarchar=ruleVarchar();

            state._fsp--;

             current =iv_ruleVarchar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarchar"


    // $ANTLR start "ruleVarchar"
    // InternalSqlCrud.g:798:1: ruleVarchar returns [EObject current=null] : (this_VARCH_0= RULE_VARCH this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject ruleVarchar() throws RecognitionException {
        EObject current = null;

        Token this_VARCH_0=null;
        Token this_LPAR_1=null;
        Token lv_max_2_0=null;
        Token this_RPAR_3=null;


        	enterRule();

        try {
            // InternalSqlCrud.g:804:2: ( (this_VARCH_0= RULE_VARCH this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR ) )
            // InternalSqlCrud.g:805:2: (this_VARCH_0= RULE_VARCH this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR )
            {
            // InternalSqlCrud.g:805:2: (this_VARCH_0= RULE_VARCH this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR )
            // InternalSqlCrud.g:806:3: this_VARCH_0= RULE_VARCH this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR
            {
            this_VARCH_0=(Token)match(input,RULE_VARCH,FOLLOW_8); 

            			newLeafNode(this_VARCH_0, grammarAccess.getVarcharAccess().getVARCHTerminalRuleCall_0());
            		
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_22); 

            			newLeafNode(this_LPAR_1, grammarAccess.getVarcharAccess().getLPARTerminalRuleCall_1());
            		
            // InternalSqlCrud.g:814:3: ( (lv_max_2_0= RULE_ENTERO ) )
            // InternalSqlCrud.g:815:4: (lv_max_2_0= RULE_ENTERO )
            {
            // InternalSqlCrud.g:815:4: (lv_max_2_0= RULE_ENTERO )
            // InternalSqlCrud.g:816:5: lv_max_2_0= RULE_ENTERO
            {
            lv_max_2_0=(Token)match(input,RULE_ENTERO,FOLLOW_15); 

            					newLeafNode(lv_max_2_0, grammarAccess.getVarcharAccess().getMaxENTEROTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarcharRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_2_0,
            						"org.uniandes.edu.co.SqlCrud.ENTERO");
            				

            }


            }

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_3, grammarAccess.getVarcharAccess().getRPARTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarchar"


    // $ANTLR start "entryRuleBinary"
    // InternalSqlCrud.g:840:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalSqlCrud.g:840:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalSqlCrud.g:841:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalSqlCrud.g:847:1: ruleBinary returns [EObject current=null] : (otherlv_0= 'BINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAR_1=null;
        Token lv_max_2_0=null;
        Token this_RPAR_3=null;


        	enterRule();

        try {
            // InternalSqlCrud.g:853:2: ( (otherlv_0= 'BINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR ) )
            // InternalSqlCrud.g:854:2: (otherlv_0= 'BINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR )
            {
            // InternalSqlCrud.g:854:2: (otherlv_0= 'BINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR )
            // InternalSqlCrud.g:855:3: otherlv_0= 'BINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryAccess().getBINARYKeyword_0());
            		
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_22); 

            			newLeafNode(this_LPAR_1, grammarAccess.getBinaryAccess().getLPARTerminalRuleCall_1());
            		
            // InternalSqlCrud.g:863:3: ( (lv_max_2_0= RULE_ENTERO ) )
            // InternalSqlCrud.g:864:4: (lv_max_2_0= RULE_ENTERO )
            {
            // InternalSqlCrud.g:864:4: (lv_max_2_0= RULE_ENTERO )
            // InternalSqlCrud.g:865:5: lv_max_2_0= RULE_ENTERO
            {
            lv_max_2_0=(Token)match(input,RULE_ENTERO,FOLLOW_15); 

            					newLeafNode(lv_max_2_0, grammarAccess.getBinaryAccess().getMaxENTEROTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_2_0,
            						"org.uniandes.edu.co.SqlCrud.ENTERO");
            				

            }


            }

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_3, grammarAccess.getBinaryAccess().getRPARTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleVarBinary"
    // InternalSqlCrud.g:889:1: entryRuleVarBinary returns [EObject current=null] : iv_ruleVarBinary= ruleVarBinary EOF ;
    public final EObject entryRuleVarBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinary = null;


        try {
            // InternalSqlCrud.g:889:50: (iv_ruleVarBinary= ruleVarBinary EOF )
            // InternalSqlCrud.g:890:2: iv_ruleVarBinary= ruleVarBinary EOF
            {
             newCompositeNode(grammarAccess.getVarBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinary=ruleVarBinary();

            state._fsp--;

             current =iv_ruleVarBinary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarBinary"


    // $ANTLR start "ruleVarBinary"
    // InternalSqlCrud.g:896:1: ruleVarBinary returns [EObject current=null] : (otherlv_0= 'VARBINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject ruleVarBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAR_1=null;
        Token lv_max_2_0=null;
        Token this_RPAR_3=null;


        	enterRule();

        try {
            // InternalSqlCrud.g:902:2: ( (otherlv_0= 'VARBINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR ) )
            // InternalSqlCrud.g:903:2: (otherlv_0= 'VARBINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR )
            {
            // InternalSqlCrud.g:903:2: (otherlv_0= 'VARBINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR )
            // InternalSqlCrud.g:904:3: otherlv_0= 'VARBINARY' this_LPAR_1= RULE_LPAR ( (lv_max_2_0= RULE_ENTERO ) ) this_RPAR_3= RULE_RPAR
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBinaryAccess().getVARBINARYKeyword_0());
            		
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_22); 

            			newLeafNode(this_LPAR_1, grammarAccess.getVarBinaryAccess().getLPARTerminalRuleCall_1());
            		
            // InternalSqlCrud.g:912:3: ( (lv_max_2_0= RULE_ENTERO ) )
            // InternalSqlCrud.g:913:4: (lv_max_2_0= RULE_ENTERO )
            {
            // InternalSqlCrud.g:913:4: (lv_max_2_0= RULE_ENTERO )
            // InternalSqlCrud.g:914:5: lv_max_2_0= RULE_ENTERO
            {
            lv_max_2_0=(Token)match(input,RULE_ENTERO,FOLLOW_15); 

            					newLeafNode(lv_max_2_0, grammarAccess.getVarBinaryAccess().getMaxENTEROTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBinaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_2_0,
            						"org.uniandes.edu.co.SqlCrud.ENTERO");
            				

            }


            }

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_3, grammarAccess.getVarBinaryAccess().getRPARTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarBinary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FFE00C000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});

}