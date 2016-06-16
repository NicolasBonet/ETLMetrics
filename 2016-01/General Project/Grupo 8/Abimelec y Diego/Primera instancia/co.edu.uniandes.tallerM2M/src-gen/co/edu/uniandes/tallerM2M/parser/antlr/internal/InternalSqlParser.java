package co.edu.uniandes.tallerM2M.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.tallerM2M.services.SqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TCREATE", "RULE_TTABLE", "RULE_ID", "RULE_PARENTESISA", "RULE_PARENTESISB", "RULE_VVARCHAR", "RULE_VINT", "RULE_VVARCHAR255", "RULE_COMA", "RULE_TPRIMARY", "RULE_TKEY", "RULE_TFOREIGN", "RULE_TREFERENCES", "RULE_TCOLUMNAS", "RULE_TNOT", "RULE_TNULL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "' NOT NULL'"
    };
    public static final int RULE_COMA=12;
    public static final int RULE_TPRIMARY=13;
    public static final int RULE_TCOLUMNAS=17;
    public static final int RULE_STRING=21;
    public static final int RULE_SL_COMMENT=23;
    public static final int RULE_TFOREIGN=15;
    public static final int RULE_TTABLE=5;
    public static final int EOF=-1;
    public static final int RULE_TNULL=19;
    public static final int RULE_TCREATE=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=24;
    public static final int RULE_TKEY=14;
    public static final int RULE_VVARCHAR255=11;
    public static final int RULE_TNOT=18;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_PARENTESISA=7;
    public static final int RULE_PARENTESISB=8;
    public static final int RULE_TREFERENCES=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_VINT=10;
    public static final int RULE_INT=20;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_VVARCHAR=9;

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

        public InternalSqlParser(TokenStream input, SqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Database";
       	}

       	@Override
       	protected SqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDatabase"
    // InternalSql.g:64:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSql.g:64:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSql.g:65:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSql.g:71:1: ruleDatabase returns [EObject current=null] : ( () ( (lv_tablas_1_0= ruleTabla ) )+ ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject lv_tablas_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:77:2: ( ( () ( (lv_tablas_1_0= ruleTabla ) )+ ) )
            // InternalSql.g:78:2: ( () ( (lv_tablas_1_0= ruleTabla ) )+ )
            {
            // InternalSql.g:78:2: ( () ( (lv_tablas_1_0= ruleTabla ) )+ )
            // InternalSql.g:79:3: () ( (lv_tablas_1_0= ruleTabla ) )+
            {
            // InternalSql.g:79:3: ()
            // InternalSql.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatabaseAccess().getDatabaseAction_0(),
            					current);
            			

            }

            // InternalSql.g:86:3: ( (lv_tablas_1_0= ruleTabla ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TCREATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql.g:87:4: (lv_tablas_1_0= ruleTabla )
            	    {
            	    // InternalSql.g:87:4: (lv_tablas_1_0= ruleTabla )
            	    // InternalSql.g:88:5: lv_tablas_1_0= ruleTabla
            	    {

            	    					newCompositeNode(grammarAccess.getDatabaseAccess().getTablasTablaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tablas_1_0=ruleTabla();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tablas",
            	    						lv_tablas_1_0,
            	    						"co.edu.uniandes.tallerM2M.Sql.Tabla");
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


    // $ANTLR start "entryRuleTabla"
    // InternalSql.g:109:1: entryRuleTabla returns [EObject current=null] : iv_ruleTabla= ruleTabla EOF ;
    public final EObject entryRuleTabla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabla = null;


        try {
            // InternalSql.g:109:46: (iv_ruleTabla= ruleTabla EOF )
            // InternalSql.g:110:2: iv_ruleTabla= ruleTabla EOF
            {
             newCompositeNode(grammarAccess.getTablaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTabla=ruleTabla();

            state._fsp--;

             current =iv_ruleTabla; 
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
    // $ANTLR end "entryRuleTabla"


    // $ANTLR start "ruleTabla"
    // InternalSql.g:116:1: ruleTabla returns [EObject current=null] : (this_TCREATE_0= RULE_TCREATE otherlv_1= ' ' this_TTABLE_2= RULE_TTABLE otherlv_3= ' ' ( (lv_name_4_0= RULE_ID ) ) this_PARENTESISA_5= RULE_PARENTESISA ( (lv_columnas_6_0= ruleColumna ) )+ ( (lv_primarys_7_0= rulePrimary ) )+ ( (lv_foreigns_8_0= ruleForeingKey ) )* this_PARENTESISB_9= RULE_PARENTESISB ) ;
    public final EObject ruleTabla() throws RecognitionException {
        EObject current = null;

        Token this_TCREATE_0=null;
        Token otherlv_1=null;
        Token this_TTABLE_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_PARENTESISA_5=null;
        Token this_PARENTESISB_9=null;
        EObject lv_columnas_6_0 = null;

        EObject lv_primarys_7_0 = null;

        EObject lv_foreigns_8_0 = null;



        	enterRule();

        try {
            // InternalSql.g:122:2: ( (this_TCREATE_0= RULE_TCREATE otherlv_1= ' ' this_TTABLE_2= RULE_TTABLE otherlv_3= ' ' ( (lv_name_4_0= RULE_ID ) ) this_PARENTESISA_5= RULE_PARENTESISA ( (lv_columnas_6_0= ruleColumna ) )+ ( (lv_primarys_7_0= rulePrimary ) )+ ( (lv_foreigns_8_0= ruleForeingKey ) )* this_PARENTESISB_9= RULE_PARENTESISB ) )
            // InternalSql.g:123:2: (this_TCREATE_0= RULE_TCREATE otherlv_1= ' ' this_TTABLE_2= RULE_TTABLE otherlv_3= ' ' ( (lv_name_4_0= RULE_ID ) ) this_PARENTESISA_5= RULE_PARENTESISA ( (lv_columnas_6_0= ruleColumna ) )+ ( (lv_primarys_7_0= rulePrimary ) )+ ( (lv_foreigns_8_0= ruleForeingKey ) )* this_PARENTESISB_9= RULE_PARENTESISB )
            {
            // InternalSql.g:123:2: (this_TCREATE_0= RULE_TCREATE otherlv_1= ' ' this_TTABLE_2= RULE_TTABLE otherlv_3= ' ' ( (lv_name_4_0= RULE_ID ) ) this_PARENTESISA_5= RULE_PARENTESISA ( (lv_columnas_6_0= ruleColumna ) )+ ( (lv_primarys_7_0= rulePrimary ) )+ ( (lv_foreigns_8_0= ruleForeingKey ) )* this_PARENTESISB_9= RULE_PARENTESISB )
            // InternalSql.g:124:3: this_TCREATE_0= RULE_TCREATE otherlv_1= ' ' this_TTABLE_2= RULE_TTABLE otherlv_3= ' ' ( (lv_name_4_0= RULE_ID ) ) this_PARENTESISA_5= RULE_PARENTESISA ( (lv_columnas_6_0= ruleColumna ) )+ ( (lv_primarys_7_0= rulePrimary ) )+ ( (lv_foreigns_8_0= ruleForeingKey ) )* this_PARENTESISB_9= RULE_PARENTESISB
            {
            this_TCREATE_0=(Token)match(input,RULE_TCREATE,FOLLOW_4); 

            			newLeafNode(this_TCREATE_0, grammarAccess.getTablaAccess().getTCREATETerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTablaAccess().getSpaceKeyword_1());
            		
            this_TTABLE_2=(Token)match(input,RULE_TTABLE,FOLLOW_4); 

            			newLeafNode(this_TTABLE_2, grammarAccess.getTablaAccess().getTTABLETerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTablaAccess().getSpaceKeyword_3());
            		
            // InternalSql.g:140:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSql.g:141:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSql.g:141:4: (lv_name_4_0= RULE_ID )
            // InternalSql.g:142:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getTablaAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTablaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_PARENTESISA_5=(Token)match(input,RULE_PARENTESISA,FOLLOW_6); 

            			newLeafNode(this_PARENTESISA_5, grammarAccess.getTablaAccess().getPARENTESISATerminalRuleCall_5());
            		
            // InternalSql.g:162:3: ( (lv_columnas_6_0= ruleColumna ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql.g:163:4: (lv_columnas_6_0= ruleColumna )
            	    {
            	    // InternalSql.g:163:4: (lv_columnas_6_0= ruleColumna )
            	    // InternalSql.g:164:5: lv_columnas_6_0= ruleColumna
            	    {

            	    					newCompositeNode(grammarAccess.getTablaAccess().getColumnasColumnaParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_columnas_6_0=ruleColumna();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTablaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columnas",
            	    						lv_columnas_6_0,
            	    						"co.edu.uniandes.tallerM2M.Sql.Columna");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalSql.g:181:3: ( (lv_primarys_7_0= rulePrimary ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TPRIMARY) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSql.g:182:4: (lv_primarys_7_0= rulePrimary )
            	    {
            	    // InternalSql.g:182:4: (lv_primarys_7_0= rulePrimary )
            	    // InternalSql.g:183:5: lv_primarys_7_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getTablaAccess().getPrimarysPrimaryParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_primarys_7_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTablaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primarys",
            	    						lv_primarys_7_0,
            	    						"co.edu.uniandes.tallerM2M.Sql.Primary");
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

            // InternalSql.g:200:3: ( (lv_foreigns_8_0= ruleForeingKey ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TFOREIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSql.g:201:4: (lv_foreigns_8_0= ruleForeingKey )
            	    {
            	    // InternalSql.g:201:4: (lv_foreigns_8_0= ruleForeingKey )
            	    // InternalSql.g:202:5: lv_foreigns_8_0= ruleForeingKey
            	    {

            	    					newCompositeNode(grammarAccess.getTablaAccess().getForeignsForeingKeyParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_foreigns_8_0=ruleForeingKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTablaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foreigns",
            	    						lv_foreigns_8_0,
            	    						"co.edu.uniandes.tallerM2M.Sql.ForeingKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_PARENTESISB_9=(Token)match(input,RULE_PARENTESISB,FOLLOW_2); 

            			newLeafNode(this_PARENTESISB_9, grammarAccess.getTablaAccess().getPARENTESISBTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleTabla"


    // $ANTLR start "entryRuleColumna"
    // InternalSql.g:227:1: entryRuleColumna returns [EObject current=null] : iv_ruleColumna= ruleColumna EOF ;
    public final EObject entryRuleColumna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumna = null;


        try {
            // InternalSql.g:227:48: (iv_ruleColumna= ruleColumna EOF )
            // InternalSql.g:228:2: iv_ruleColumna= ruleColumna EOF
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
    // InternalSql.g:234:1: ruleColumna returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' ' ( ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) ) ) ( (lv_notNull_3_0= ' NOT NULL' ) )? (this_COMA_4= RULE_COMA )* ) ;
    public final EObject ruleColumna() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_tipo_2_1=null;
        Token lv_tipo_2_2=null;
        Token lv_tipo_2_3=null;
        Token lv_notNull_3_0=null;
        Token this_COMA_4=null;


        	enterRule();

        try {
            // InternalSql.g:240:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' ' ( ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) ) ) ( (lv_notNull_3_0= ' NOT NULL' ) )? (this_COMA_4= RULE_COMA )* ) )
            // InternalSql.g:241:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' ' ( ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) ) ) ( (lv_notNull_3_0= ' NOT NULL' ) )? (this_COMA_4= RULE_COMA )* )
            {
            // InternalSql.g:241:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' ' ( ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) ) ) ( (lv_notNull_3_0= ' NOT NULL' ) )? (this_COMA_4= RULE_COMA )* )
            // InternalSql.g:242:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' ' ( ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) ) ) ( (lv_notNull_3_0= ' NOT NULL' ) )? (this_COMA_4= RULE_COMA )*
            {
            // InternalSql.g:242:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql.g:243:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSql.g:243:4: (lv_name_0_0= RULE_ID )
            // InternalSql.g:244:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColumnaAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnaAccess().getSpaceKeyword_1());
            		
            // InternalSql.g:264:3: ( ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) ) )
            // InternalSql.g:265:4: ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) )
            {
            // InternalSql.g:265:4: ( (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 ) )
            // InternalSql.g:266:5: (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 )
            {
            // InternalSql.g:266:5: (lv_tipo_2_1= RULE_VVARCHAR | lv_tipo_2_2= RULE_VINT | lv_tipo_2_3= RULE_VVARCHAR255 )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_VVARCHAR:
                {
                alt5=1;
                }
                break;
            case RULE_VINT:
                {
                alt5=2;
                }
                break;
            case RULE_VVARCHAR255:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSql.g:267:6: lv_tipo_2_1= RULE_VVARCHAR
                    {
                    lv_tipo_2_1=(Token)match(input,RULE_VVARCHAR,FOLLOW_12); 

                    						newLeafNode(lv_tipo_2_1, grammarAccess.getColumnaAccess().getTipoVVARCHARTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tipo",
                    							lv_tipo_2_1,
                    							"co.edu.uniandes.tallerM2M.Sql.VVARCHAR");
                    					

                    }
                    break;
                case 2 :
                    // InternalSql.g:282:6: lv_tipo_2_2= RULE_VINT
                    {
                    lv_tipo_2_2=(Token)match(input,RULE_VINT,FOLLOW_12); 

                    						newLeafNode(lv_tipo_2_2, grammarAccess.getColumnaAccess().getTipoVINTTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tipo",
                    							lv_tipo_2_2,
                    							"co.edu.uniandes.tallerM2M.Sql.VINT");
                    					

                    }
                    break;
                case 3 :
                    // InternalSql.g:297:6: lv_tipo_2_3= RULE_VVARCHAR255
                    {
                    lv_tipo_2_3=(Token)match(input,RULE_VVARCHAR255,FOLLOW_12); 

                    						newLeafNode(lv_tipo_2_3, grammarAccess.getColumnaAccess().getTipoVVARCHAR255TerminalRuleCall_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tipo",
                    							lv_tipo_2_3,
                    							"co.edu.uniandes.tallerM2M.Sql.VVARCHAR255");
                    					

                    }
                    break;

            }


            }


            }

            // InternalSql.g:314:3: ( (lv_notNull_3_0= ' NOT NULL' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSql.g:315:4: (lv_notNull_3_0= ' NOT NULL' )
                    {
                    // InternalSql.g:315:4: (lv_notNull_3_0= ' NOT NULL' )
                    // InternalSql.g:316:5: lv_notNull_3_0= ' NOT NULL'
                    {
                    lv_notNull_3_0=(Token)match(input,27,FOLLOW_13); 

                    					newLeafNode(lv_notNull_3_0, grammarAccess.getColumnaAccess().getNotNullNOTNULLKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnaRule());
                    					}
                    					setWithLastConsumed(current, "notNull", lv_notNull_3_0, " NOT NULL");
                    				

                    }


                    }
                    break;

            }

            // InternalSql.g:328:3: (this_COMA_4= RULE_COMA )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSql.g:329:4: this_COMA_4= RULE_COMA
            	    {
            	    this_COMA_4=(Token)match(input,RULE_COMA,FOLLOW_13); 

            	    				newLeafNode(this_COMA_4, grammarAccess.getColumnaAccess().getCOMATerminalRuleCall_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
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
    // $ANTLR end "ruleColumna"


    // $ANTLR start "entryRulePrimary"
    // InternalSql.g:338:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSql.g:338:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSql.g:339:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSql.g:345:1: rulePrimary returns [EObject current=null] : (this_TPRIMARY_0= RULE_TPRIMARY otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (otherlv_5= RULE_ID ) ) (this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) ) )* this_PARENTESISB_9= RULE_PARENTESISB (this_COMA_10= RULE_COMA )* ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token this_TPRIMARY_0=null;
        Token otherlv_1=null;
        Token this_TKEY_2=null;
        Token otherlv_3=null;
        Token this_PARENTESISA_4=null;
        Token otherlv_5=null;
        Token this_COMA_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_PARENTESISB_9=null;
        Token this_COMA_10=null;


        	enterRule();

        try {
            // InternalSql.g:351:2: ( (this_TPRIMARY_0= RULE_TPRIMARY otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (otherlv_5= RULE_ID ) ) (this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) ) )* this_PARENTESISB_9= RULE_PARENTESISB (this_COMA_10= RULE_COMA )* ) )
            // InternalSql.g:352:2: (this_TPRIMARY_0= RULE_TPRIMARY otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (otherlv_5= RULE_ID ) ) (this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) ) )* this_PARENTESISB_9= RULE_PARENTESISB (this_COMA_10= RULE_COMA )* )
            {
            // InternalSql.g:352:2: (this_TPRIMARY_0= RULE_TPRIMARY otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (otherlv_5= RULE_ID ) ) (this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) ) )* this_PARENTESISB_9= RULE_PARENTESISB (this_COMA_10= RULE_COMA )* )
            // InternalSql.g:353:3: this_TPRIMARY_0= RULE_TPRIMARY otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (otherlv_5= RULE_ID ) ) (this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) ) )* this_PARENTESISB_9= RULE_PARENTESISB (this_COMA_10= RULE_COMA )*
            {
            this_TPRIMARY_0=(Token)match(input,RULE_TPRIMARY,FOLLOW_4); 

            			newLeafNode(this_TPRIMARY_0, grammarAccess.getPrimaryAccess().getTPRIMARYTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getSpaceKeyword_1());
            		
            this_TKEY_2=(Token)match(input,RULE_TKEY,FOLLOW_4); 

            			newLeafNode(this_TKEY_2, grammarAccess.getPrimaryAccess().getTKEYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getSpaceKeyword_3());
            		
            this_PARENTESISA_4=(Token)match(input,RULE_PARENTESISA,FOLLOW_6); 

            			newLeafNode(this_PARENTESISA_4, grammarAccess.getPrimaryAccess().getPARENTESISATerminalRuleCall_4());
            		
            // InternalSql.g:373:3: ( (otherlv_5= RULE_ID ) )
            // InternalSql.g:374:4: (otherlv_5= RULE_ID )
            {
            // InternalSql.g:374:4: (otherlv_5= RULE_ID )
            // InternalSql.g:375:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getColumnColumnaCrossReference_5_0());
            				

            }


            }

            // InternalSql.g:386:3: (this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql.g:387:4: this_COMA_6= RULE_COMA otherlv_7= ' ' ( (otherlv_8= RULE_ID ) )
            	    {
            	    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_4); 

            	    				newLeafNode(this_COMA_6, grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_6_0());
            	    			
            	    otherlv_7=(Token)match(input,26,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getSpaceKeyword_6_1());
            	    			
            	    // InternalSql.g:395:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalSql.g:396:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalSql.g:396:5: (otherlv_8= RULE_ID )
            	    // InternalSql.g:397:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getColumnColumnaCrossReference_6_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_PARENTESISB_9=(Token)match(input,RULE_PARENTESISB,FOLLOW_13); 

            			newLeafNode(this_PARENTESISB_9, grammarAccess.getPrimaryAccess().getPARENTESISBTerminalRuleCall_7());
            		
            // InternalSql.g:413:3: (this_COMA_10= RULE_COMA )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql.g:414:4: this_COMA_10= RULE_COMA
            	    {
            	    this_COMA_10=(Token)match(input,RULE_COMA,FOLLOW_13); 

            	    				newLeafNode(this_COMA_10, grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_8());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleForeingKey"
    // InternalSql.g:423:1: entryRuleForeingKey returns [EObject current=null] : iv_ruleForeingKey= ruleForeingKey EOF ;
    public final EObject entryRuleForeingKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeingKey = null;


        try {
            // InternalSql.g:423:51: (iv_ruleForeingKey= ruleForeingKey EOF )
            // InternalSql.g:424:2: iv_ruleForeingKey= ruleForeingKey EOF
            {
             newCompositeNode(grammarAccess.getForeingKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeingKey=ruleForeingKey();

            state._fsp--;

             current =iv_ruleForeingKey; 
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
    // $ANTLR end "entryRuleForeingKey"


    // $ANTLR start "ruleForeingKey"
    // InternalSql.g:430:1: ruleForeingKey returns [EObject current=null] : (this_TFOREIGN_0= RULE_TFOREIGN otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (lv_name_5_0= RULE_ID ) ) this_PARENTESISB_6= RULE_PARENTESISB otherlv_7= ' ' this_TREFERENCES_8= RULE_TREFERENCES otherlv_9= ' ' ( (otherlv_10= RULE_ID ) ) this_PARENTESISA_11= RULE_PARENTESISA ( (otherlv_12= RULE_ID ) ) this_PARENTESISB_13= RULE_PARENTESISB (this_COMA_14= RULE_COMA )* ) ;
    public final EObject ruleForeingKey() throws RecognitionException {
        EObject current = null;

        Token this_TFOREIGN_0=null;
        Token otherlv_1=null;
        Token this_TKEY_2=null;
        Token otherlv_3=null;
        Token this_PARENTESISA_4=null;
        Token lv_name_5_0=null;
        Token this_PARENTESISB_6=null;
        Token otherlv_7=null;
        Token this_TREFERENCES_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_PARENTESISA_11=null;
        Token otherlv_12=null;
        Token this_PARENTESISB_13=null;
        Token this_COMA_14=null;


        	enterRule();

        try {
            // InternalSql.g:436:2: ( (this_TFOREIGN_0= RULE_TFOREIGN otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (lv_name_5_0= RULE_ID ) ) this_PARENTESISB_6= RULE_PARENTESISB otherlv_7= ' ' this_TREFERENCES_8= RULE_TREFERENCES otherlv_9= ' ' ( (otherlv_10= RULE_ID ) ) this_PARENTESISA_11= RULE_PARENTESISA ( (otherlv_12= RULE_ID ) ) this_PARENTESISB_13= RULE_PARENTESISB (this_COMA_14= RULE_COMA )* ) )
            // InternalSql.g:437:2: (this_TFOREIGN_0= RULE_TFOREIGN otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (lv_name_5_0= RULE_ID ) ) this_PARENTESISB_6= RULE_PARENTESISB otherlv_7= ' ' this_TREFERENCES_8= RULE_TREFERENCES otherlv_9= ' ' ( (otherlv_10= RULE_ID ) ) this_PARENTESISA_11= RULE_PARENTESISA ( (otherlv_12= RULE_ID ) ) this_PARENTESISB_13= RULE_PARENTESISB (this_COMA_14= RULE_COMA )* )
            {
            // InternalSql.g:437:2: (this_TFOREIGN_0= RULE_TFOREIGN otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (lv_name_5_0= RULE_ID ) ) this_PARENTESISB_6= RULE_PARENTESISB otherlv_7= ' ' this_TREFERENCES_8= RULE_TREFERENCES otherlv_9= ' ' ( (otherlv_10= RULE_ID ) ) this_PARENTESISA_11= RULE_PARENTESISA ( (otherlv_12= RULE_ID ) ) this_PARENTESISB_13= RULE_PARENTESISB (this_COMA_14= RULE_COMA )* )
            // InternalSql.g:438:3: this_TFOREIGN_0= RULE_TFOREIGN otherlv_1= ' ' this_TKEY_2= RULE_TKEY otherlv_3= ' ' this_PARENTESISA_4= RULE_PARENTESISA ( (lv_name_5_0= RULE_ID ) ) this_PARENTESISB_6= RULE_PARENTESISB otherlv_7= ' ' this_TREFERENCES_8= RULE_TREFERENCES otherlv_9= ' ' ( (otherlv_10= RULE_ID ) ) this_PARENTESISA_11= RULE_PARENTESISA ( (otherlv_12= RULE_ID ) ) this_PARENTESISB_13= RULE_PARENTESISB (this_COMA_14= RULE_COMA )*
            {
            this_TFOREIGN_0=(Token)match(input,RULE_TFOREIGN,FOLLOW_4); 

            			newLeafNode(this_TFOREIGN_0, grammarAccess.getForeingKeyAccess().getTFOREIGNTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getForeingKeyAccess().getSpaceKeyword_1());
            		
            this_TKEY_2=(Token)match(input,RULE_TKEY,FOLLOW_4); 

            			newLeafNode(this_TKEY_2, grammarAccess.getForeingKeyAccess().getTKEYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getForeingKeyAccess().getSpaceKeyword_3());
            		
            this_PARENTESISA_4=(Token)match(input,RULE_PARENTESISA,FOLLOW_6); 

            			newLeafNode(this_PARENTESISA_4, grammarAccess.getForeingKeyAccess().getPARENTESISATerminalRuleCall_4());
            		
            // InternalSql.g:458:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalSql.g:459:4: (lv_name_5_0= RULE_ID )
            {
            // InternalSql.g:459:4: (lv_name_5_0= RULE_ID )
            // InternalSql.g:460:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_5_0, grammarAccess.getForeingKeyAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeingKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_PARENTESISB_6=(Token)match(input,RULE_PARENTESISB,FOLLOW_4); 

            			newLeafNode(this_PARENTESISB_6, grammarAccess.getForeingKeyAccess().getPARENTESISBTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getForeingKeyAccess().getSpaceKeyword_7());
            		
            this_TREFERENCES_8=(Token)match(input,RULE_TREFERENCES,FOLLOW_4); 

            			newLeafNode(this_TREFERENCES_8, grammarAccess.getForeingKeyAccess().getTREFERENCESTerminalRuleCall_8());
            		
            otherlv_9=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getForeingKeyAccess().getSpaceKeyword_9());
            		
            // InternalSql.g:492:3: ( (otherlv_10= RULE_ID ) )
            // InternalSql.g:493:4: (otherlv_10= RULE_ID )
            {
            // InternalSql.g:493:4: (otherlv_10= RULE_ID )
            // InternalSql.g:494:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeingKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_10, grammarAccess.getForeingKeyAccess().getReferenceTableTablaCrossReference_10_0());
            				

            }


            }

            this_PARENTESISA_11=(Token)match(input,RULE_PARENTESISA,FOLLOW_6); 

            			newLeafNode(this_PARENTESISA_11, grammarAccess.getForeingKeyAccess().getPARENTESISATerminalRuleCall_11());
            		
            // InternalSql.g:509:3: ( (otherlv_12= RULE_ID ) )
            // InternalSql.g:510:4: (otherlv_12= RULE_ID )
            {
            // InternalSql.g:510:4: (otherlv_12= RULE_ID )
            // InternalSql.g:511:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeingKeyRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_12, grammarAccess.getForeingKeyAccess().getReferenceColumnColumnaCrossReference_12_0());
            				

            }


            }

            this_PARENTESISB_13=(Token)match(input,RULE_PARENTESISB,FOLLOW_13); 

            			newLeafNode(this_PARENTESISB_13, grammarAccess.getForeingKeyAccess().getPARENTESISBTerminalRuleCall_13());
            		
            // InternalSql.g:526:3: (this_COMA_14= RULE_COMA )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql.g:527:4: this_COMA_14= RULE_COMA
            	    {
            	    this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_13); 

            	    				newLeafNode(this_COMA_14, grammarAccess.getForeingKeyAccess().getCOMATerminalRuleCall_14());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
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
    // $ANTLR end "ruleForeingKey"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});

}