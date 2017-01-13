package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.GrammarSqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LPAR", "RULE_RPAR", "RULE_NOTNULL", "RULE_INT", "RULE_CREATE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "'TABLE'", "','", "'int'", "'varchar'", "'Double'", "'Float'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_NOTNULL=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_RPAR=6;
    public static final int T__25=25;
    public static final int RULE_LPAR=5;
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

        public InternalGrammarSqlParser(TokenStream input, GrammarSqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GrammarSqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGrammarSql.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGrammarSql.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGrammarSql.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGrammarSql.g:71:1: ruleModel returns [EObject current=null] : ( (lv_tables_0_0= ruleTable ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalGrammarSql.g:77:2: ( ( (lv_tables_0_0= ruleTable ) )+ )
            // InternalGrammarSql.g:78:2: ( (lv_tables_0_0= ruleTable ) )+
            {
            // InternalGrammarSql.g:78:2: ( (lv_tables_0_0= ruleTable ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrammarSql.g:79:3: (lv_tables_0_0= ruleTable )
            	    {
            	    // InternalGrammarSql.g:79:3: (lv_tables_0_0= ruleTable )
            	    // InternalGrammarSql.g:80:4: lv_tables_0_0= ruleTable
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_tables_0_0=ruleTable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tables",
            	    					lv_tables_0_0,
            	    					"co.edu.uniandes.GrammarSql.Table");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTable"
    // InternalGrammarSql.g:100:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalGrammarSql.g:100:46: (iv_ruleTable= ruleTable EOF )
            // InternalGrammarSql.g:101:2: iv_ruleTable= ruleTable EOF
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
    // InternalGrammarSql.g:107:1: ruleTable returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) this_LPAR_3= RULE_LPAR ( ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) ) )* this_RPAR_7= RULE_RPAR ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_LPAR_3=null;
        Token otherlv_5=null;
        Token this_RPAR_7=null;
        EObject lv_elements_4_1 = null;

        EObject lv_elements_4_2 = null;

        EObject lv_elements_4_3 = null;

        EObject lv_elements_6_1 = null;

        EObject lv_elements_6_2 = null;

        EObject lv_elements_6_3 = null;



        	enterRule();

        try {
            // InternalGrammarSql.g:113:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) this_LPAR_3= RULE_LPAR ( ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) ) )* this_RPAR_7= RULE_RPAR ) )
            // InternalGrammarSql.g:114:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) this_LPAR_3= RULE_LPAR ( ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) ) )* this_RPAR_7= RULE_RPAR )
            {
            // InternalGrammarSql.g:114:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) this_LPAR_3= RULE_LPAR ( ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) ) )* this_RPAR_7= RULE_RPAR )
            // InternalGrammarSql.g:115:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) this_LPAR_3= RULE_LPAR ( ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) ) )* this_RPAR_7= RULE_RPAR
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTABLEKeyword_1());
            		
            // InternalGrammarSql.g:123:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGrammarSql.g:124:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGrammarSql.g:124:4: (lv_name_2_0= RULE_ID )
            // InternalGrammarSql.g:125:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_LPAR_3=(Token)match(input,RULE_LPAR,FOLLOW_7); 

            			newLeafNode(this_LPAR_3, grammarAccess.getTableAccess().getLPARTerminalRuleCall_3());
            		
            // InternalGrammarSql.g:145:3: ( ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) ) )
            // InternalGrammarSql.g:146:4: ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) )
            {
            // InternalGrammarSql.g:146:4: ( (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey ) )
            // InternalGrammarSql.g:147:5: (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey )
            {
            // InternalGrammarSql.g:147:5: (lv_elements_4_1= ruleColumn | lv_elements_4_2= rulePrimaryKey | lv_elements_4_3= ruleForeignKey )
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
                    // InternalGrammarSql.g:148:6: lv_elements_4_1= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_elements_4_1=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_4_1,
                    							"co.edu.uniandes.GrammarSql.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGrammarSql.g:164:6: lv_elements_4_2= rulePrimaryKey
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_elements_4_2=rulePrimaryKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_4_2,
                    							"co.edu.uniandes.GrammarSql.PrimaryKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalGrammarSql.g:180:6: lv_elements_4_3= ruleForeignKey
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_4_0_2());
                    					
                    pushFollow(FOLLOW_8);
                    lv_elements_4_3=ruleForeignKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_4_3,
                    							"co.edu.uniandes.GrammarSql.ForeignKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalGrammarSql.g:198:3: (otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGrammarSql.g:199:4: otherlv_5= ',' ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalGrammarSql.g:203:4: ( ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) ) )
            	    // InternalGrammarSql.g:204:5: ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) )
            	    {
            	    // InternalGrammarSql.g:204:5: ( (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey ) )
            	    // InternalGrammarSql.g:205:6: (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey )
            	    {
            	    // InternalGrammarSql.g:205:6: (lv_elements_6_1= ruleColumn | lv_elements_6_2= rulePrimaryKey | lv_elements_6_3= ruleForeignKey )
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
            	            // InternalGrammarSql.g:206:7: lv_elements_6_1= ruleColumn
            	            {

            	            							newCompositeNode(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_5_1_0_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_elements_6_1=ruleColumn();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"elements",
            	            								lv_elements_6_1,
            	            								"co.edu.uniandes.GrammarSql.Column");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGrammarSql.g:222:7: lv_elements_6_2= rulePrimaryKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_5_1_0_1());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_elements_6_2=rulePrimaryKey();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"elements",
            	            								lv_elements_6_2,
            	            								"co.edu.uniandes.GrammarSql.PrimaryKey");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalGrammarSql.g:238:7: lv_elements_6_3= ruleForeignKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_5_1_0_2());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_elements_6_3=ruleForeignKey();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"elements",
            	            								lv_elements_6_3,
            	            								"co.edu.uniandes.GrammarSql.ForeignKey");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RPAR_7=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_7, grammarAccess.getTableAccess().getRPARTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleColumn"
    // InternalGrammarSql.g:265:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalGrammarSql.g:265:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalGrammarSql.g:266:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalGrammarSql.g:272:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) ) ) ( ruleTamano )? ( (lv_isNotNull_3_0= RULE_NOTNULL ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_1_4=null;
        Token lv_isNotNull_3_0=null;


        	enterRule();

        try {
            // InternalGrammarSql.g:278:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) ) ) ( ruleTamano )? ( (lv_isNotNull_3_0= RULE_NOTNULL ) )? ) )
            // InternalGrammarSql.g:279:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) ) ) ( ruleTamano )? ( (lv_isNotNull_3_0= RULE_NOTNULL ) )? )
            {
            // InternalGrammarSql.g:279:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) ) ) ( ruleTamano )? ( (lv_isNotNull_3_0= RULE_NOTNULL ) )? )
            // InternalGrammarSql.g:280:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) ) ) ( ruleTamano )? ( (lv_isNotNull_3_0= RULE_NOTNULL ) )?
            {
            // InternalGrammarSql.g:280:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrammarSql.g:281:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrammarSql.g:281:4: (lv_name_0_0= RULE_ID )
            // InternalGrammarSql.g:282:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGrammarSql.g:298:3: ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) ) )
            // InternalGrammarSql.g:299:4: ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) )
            {
            // InternalGrammarSql.g:299:4: ( (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' ) )
            // InternalGrammarSql.g:300:5: (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' )
            {
            // InternalGrammarSql.g:300:5: (lv_type_1_1= 'int' | lv_type_1_2= 'varchar' | lv_type_1_3= 'Double' | lv_type_1_4= 'Float' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGrammarSql.g:301:6: lv_type_1_1= 'int'
                    {
                    lv_type_1_1=(Token)match(input,18,FOLLOW_10); 

                    						newLeafNode(lv_type_1_1, grammarAccess.getColumnAccess().getTypeIntKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGrammarSql.g:312:6: lv_type_1_2= 'varchar'
                    {
                    lv_type_1_2=(Token)match(input,19,FOLLOW_10); 

                    						newLeafNode(lv_type_1_2, grammarAccess.getColumnAccess().getTypeVarcharKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGrammarSql.g:323:6: lv_type_1_3= 'Double'
                    {
                    lv_type_1_3=(Token)match(input,20,FOLLOW_10); 

                    						newLeafNode(lv_type_1_3, grammarAccess.getColumnAccess().getTypeDoubleKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalGrammarSql.g:334:6: lv_type_1_4= 'Float'
                    {
                    lv_type_1_4=(Token)match(input,21,FOLLOW_10); 

                    						newLeafNode(lv_type_1_4, grammarAccess.getColumnAccess().getTypeFloatKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGrammarSql.g:347:3: ( ruleTamano )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LPAR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrammarSql.g:348:4: ruleTamano
                    {

                    				newCompositeNode(grammarAccess.getColumnAccess().getTamanoParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_11);
                    ruleTamano();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalGrammarSql.g:356:3: ( (lv_isNotNull_3_0= RULE_NOTNULL ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NOTNULL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGrammarSql.g:357:4: (lv_isNotNull_3_0= RULE_NOTNULL )
                    {
                    // InternalGrammarSql.g:357:4: (lv_isNotNull_3_0= RULE_NOTNULL )
                    // InternalGrammarSql.g:358:5: lv_isNotNull_3_0= RULE_NOTNULL
                    {
                    lv_isNotNull_3_0=(Token)match(input,RULE_NOTNULL,FOLLOW_2); 

                    					newLeafNode(lv_isNotNull_3_0, grammarAccess.getColumnAccess().getIsNotNullNOTNULLTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isNotNull",
                    						true,
                    						"co.edu.uniandes.GrammarSql.NOTNULL");
                    				

                    }


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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalGrammarSql.g:378:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalGrammarSql.g:378:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalGrammarSql.g:379:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalGrammarSql.g:385:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_RPAR_6=null;


        	enterRule();

        try {
            // InternalGrammarSql.g:391:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ) )
            // InternalGrammarSql.g:392:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR )
            {
            // InternalGrammarSql.g:392:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR )
            // InternalGrammarSql.g:393:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
            		
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_5); 

            			newLeafNode(this_LPAR_2, grammarAccess.getPrimaryKeyAccess().getLPARTerminalRuleCall_2());
            		
            // InternalGrammarSql.g:405:3: ( (otherlv_3= RULE_ID ) )
            // InternalGrammarSql.g:406:4: (otherlv_3= RULE_ID )
            {
            // InternalGrammarSql.g:406:4: (otherlv_3= RULE_ID )
            // InternalGrammarSql.g:407:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0());
            				

            }


            }

            // InternalGrammarSql.g:418:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrammarSql.g:419:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGrammarSql.g:423:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalGrammarSql.g:424:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGrammarSql.g:424:5: (otherlv_5= RULE_ID )
            	    // InternalGrammarSql.g:425:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_6, grammarAccess.getPrimaryKeyAccess().getRPARTerminalRuleCall_5());
            		

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
    // InternalGrammarSql.g:445:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalGrammarSql.g:445:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalGrammarSql.g:446:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalGrammarSql.g:452:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ( (lv_ref_7_0= ruleReference ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_RPAR_6=null;
        EObject lv_ref_7_0 = null;



        	enterRule();

        try {
            // InternalGrammarSql.g:458:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ( (lv_ref_7_0= ruleReference ) ) ) )
            // InternalGrammarSql.g:459:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ( (lv_ref_7_0= ruleReference ) ) )
            {
            // InternalGrammarSql.g:459:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ( (lv_ref_7_0= ruleReference ) ) )
            // InternalGrammarSql.g:460:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ( (lv_ref_7_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
            		
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_5); 

            			newLeafNode(this_LPAR_2, grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_2());
            		
            // InternalGrammarSql.g:472:3: ( (otherlv_3= RULE_ID ) )
            // InternalGrammarSql.g:473:4: (otherlv_3= RULE_ID )
            {
            // InternalGrammarSql.g:473:4: (otherlv_3= RULE_ID )
            // InternalGrammarSql.g:474:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0());
            				

            }


            }

            // InternalGrammarSql.g:485:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrammarSql.g:486:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGrammarSql.g:490:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalGrammarSql.g:491:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGrammarSql.g:491:5: (otherlv_5= RULE_ID )
            	    // InternalGrammarSql.g:492:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_13); 

            			newLeafNode(this_RPAR_6, grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_5());
            		
            // InternalGrammarSql.g:508:3: ( (lv_ref_7_0= ruleReference ) )
            // InternalGrammarSql.g:509:4: (lv_ref_7_0= ruleReference )
            {
            // InternalGrammarSql.g:509:4: (lv_ref_7_0= ruleReference )
            // InternalGrammarSql.g:510:5: lv_ref_7_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getRefReferenceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_7_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_7_0,
            						"co.edu.uniandes.GrammarSql.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


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


    // $ANTLR start "entryRuleReference"
    // InternalGrammarSql.g:531:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalGrammarSql.g:531:50: (iv_ruleReference= ruleReference EOF )
            // InternalGrammarSql.g:532:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalGrammarSql.g:538:1: ruleReference returns [EObject current=null] : (otherlv_0= 'REFERENCES' ( (otherlv_1= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_RPAR_6=null;


        	enterRule();

        try {
            // InternalGrammarSql.g:544:2: ( (otherlv_0= 'REFERENCES' ( (otherlv_1= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ) )
            // InternalGrammarSql.g:545:2: (otherlv_0= 'REFERENCES' ( (otherlv_1= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR )
            {
            // InternalGrammarSql.g:545:2: (otherlv_0= 'REFERENCES' ( (otherlv_1= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR )
            // InternalGrammarSql.g:546:3: otherlv_0= 'REFERENCES' ( (otherlv_1= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getREFERENCESKeyword_0());
            		
            // InternalGrammarSql.g:550:3: ( (otherlv_1= RULE_ID ) )
            // InternalGrammarSql.g:551:4: (otherlv_1= RULE_ID )
            {
            // InternalGrammarSql.g:551:4: (otherlv_1= RULE_ID )
            // InternalGrammarSql.g:552:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getFromTTableCrossReference_1_0());
            				

            }


            }

            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_5); 

            			newLeafNode(this_LPAR_2, grammarAccess.getReferenceAccess().getLPARTerminalRuleCall_2());
            		
            // InternalGrammarSql.g:567:3: ( (otherlv_3= RULE_ID ) )
            // InternalGrammarSql.g:568:4: (otherlv_3= RULE_ID )
            {
            // InternalGrammarSql.g:568:4: (otherlv_3= RULE_ID )
            // InternalGrammarSql.g:569:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getFromCColumnCrossReference_3_0());
            				

            }


            }

            // InternalGrammarSql.g:580:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrammarSql.g:581:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGrammarSql.g:585:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalGrammarSql.g:586:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGrammarSql.g:586:5: (otherlv_5= RULE_ID )
            	    // InternalGrammarSql.g:587:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReferenceRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getFromCColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_6, grammarAccess.getReferenceAccess().getRPARTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleTamano"
    // InternalGrammarSql.g:607:1: entryRuleTamano returns [String current=null] : iv_ruleTamano= ruleTamano EOF ;
    public final String entryRuleTamano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTamano = null;


        try {
            // InternalGrammarSql.g:607:46: (iv_ruleTamano= ruleTamano EOF )
            // InternalGrammarSql.g:608:2: iv_ruleTamano= ruleTamano EOF
            {
             newCompositeNode(grammarAccess.getTamanoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTamano=ruleTamano();

            state._fsp--;

             current =iv_ruleTamano.getText(); 
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
    // $ANTLR end "entryRuleTamano"


    // $ANTLR start "ruleTamano"
    // InternalGrammarSql.g:614:1: ruleTamano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LPAR_0= RULE_LPAR (this_INT_1= RULE_INT )* this_RPAR_2= RULE_RPAR ) ;
    public final AntlrDatatypeRuleToken ruleTamano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LPAR_0=null;
        Token this_INT_1=null;
        Token this_RPAR_2=null;


        	enterRule();

        try {
            // InternalGrammarSql.g:620:2: ( (this_LPAR_0= RULE_LPAR (this_INT_1= RULE_INT )* this_RPAR_2= RULE_RPAR ) )
            // InternalGrammarSql.g:621:2: (this_LPAR_0= RULE_LPAR (this_INT_1= RULE_INT )* this_RPAR_2= RULE_RPAR )
            {
            // InternalGrammarSql.g:621:2: (this_LPAR_0= RULE_LPAR (this_INT_1= RULE_INT )* this_RPAR_2= RULE_RPAR )
            // InternalGrammarSql.g:622:3: this_LPAR_0= RULE_LPAR (this_INT_1= RULE_INT )* this_RPAR_2= RULE_RPAR
            {
            this_LPAR_0=(Token)match(input,RULE_LPAR,FOLLOW_14); 

            			current.merge(this_LPAR_0);
            		

            			newLeafNode(this_LPAR_0, grammarAccess.getTamanoAccess().getLPARTerminalRuleCall_0());
            		
            // InternalGrammarSql.g:629:3: (this_INT_1= RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrammarSql.g:630:4: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_14); 

            	    				current.merge(this_INT_1);
            	    			

            	    				newLeafNode(this_INT_1, grammarAccess.getTamanoAccess().getINTTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_RPAR_2=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			current.merge(this_RPAR_2);
            		

            			newLeafNode(this_RPAR_2, grammarAccess.getTamanoAccess().getRPARTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleTamano"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000140L});

}