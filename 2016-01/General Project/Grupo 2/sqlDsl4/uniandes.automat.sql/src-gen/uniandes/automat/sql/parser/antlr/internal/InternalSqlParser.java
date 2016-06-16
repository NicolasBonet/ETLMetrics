package uniandes.automat.sql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uniandes.automat.sql.services.SqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "'TABLE'", "'('", "','", "')'", "'NOT NULL'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'varchar(255)'", "'int'"
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

        public InternalSqlParser(TokenStream input, SqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSql.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSql.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSql.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalSql.g:72:1: ruleModel returns [EObject current=null] : ( (lv_database_0_0= ruleDatabase ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_database_0_0 = null;



        	enterRule();

        try {
            // InternalSql.g:78:2: ( ( (lv_database_0_0= ruleDatabase ) ) )
            // InternalSql.g:79:2: ( (lv_database_0_0= ruleDatabase ) )
            {
            // InternalSql.g:79:2: ( (lv_database_0_0= ruleDatabase ) )
            // InternalSql.g:80:3: (lv_database_0_0= ruleDatabase )
            {
            // InternalSql.g:80:3: (lv_database_0_0= ruleDatabase )
            // InternalSql.g:81:4: lv_database_0_0= ruleDatabase
            {

            				newCompositeNode(grammarAccess.getModelAccess().getDatabaseDatabaseParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_database_0_0=ruleDatabase();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"database",
            					lv_database_0_0,
            					"uniandes.automat.sql.Sql.Database");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDatabase"
    // InternalSql.g:101:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSql.g:101:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSql.g:102:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSql.g:108:1: ruleDatabase returns [EObject current=null] : ( (lv_tables_0_0= ruleTable ) )* ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql.g:114:2: ( ( (lv_tables_0_0= ruleTable ) )* )
            // InternalSql.g:115:2: ( (lv_tables_0_0= ruleTable ) )*
            {
            // InternalSql.g:115:2: ( (lv_tables_0_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql.g:116:3: (lv_tables_0_0= ruleTable )
            	    {
            	    // InternalSql.g:116:3: (lv_tables_0_0= ruleTable )
            	    // InternalSql.g:117:4: lv_tables_0_0= ruleTable
            	    {

            	    				newCompositeNode(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_tables_0_0=ruleTable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tables",
            	    					lv_tables_0_0,
            	    					"uniandes.automat.sql.Sql.Table");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // InternalSql.g:137:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSql.g:137:46: (iv_ruleTable= ruleTable EOF )
            // InternalSql.g:138:2: iv_ruleTable= ruleTable EOF
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
    // InternalSql.g:144:1: ruleTable returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_facts_4_1 = null;

        EObject lv_facts_4_2 = null;

        EObject lv_facts_4_3 = null;

        EObject lv_facts_6_1 = null;

        EObject lv_facts_6_2 = null;

        EObject lv_facts_6_3 = null;



        	enterRule();

        try {
            // InternalSql.g:150:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) )
            // InternalSql.g:151:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            {
            // InternalSql.g:151:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            // InternalSql.g:152:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) ) ) (otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTABLEKeyword_1());
            		
            // InternalSql.g:160:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql.g:161:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql.g:161:4: (lv_name_2_0= RULE_ID )
            // InternalSql.g:162:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSql.g:182:3: ( ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) ) )
            // InternalSql.g:183:4: ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) )
            {
            // InternalSql.g:183:4: ( (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey ) )
            // InternalSql.g:184:5: (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey )
            {
            // InternalSql.g:184:5: (lv_facts_4_1= ruleColumn | lv_facts_4_2= rulePrimaryKey | lv_facts_4_3= ruleForeignKey )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // InternalSql.g:185:6: lv_facts_4_1= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_facts_4_1=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"facts",
                    							lv_facts_4_1,
                    							"uniandes.automat.sql.Sql.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSql.g:201:6: lv_facts_4_2= rulePrimaryKey
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_facts_4_2=rulePrimaryKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"facts",
                    							lv_facts_4_2,
                    							"uniandes.automat.sql.Sql.PrimaryKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalSql.g:217:6: lv_facts_4_3= ruleForeignKey
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_4_0_2());
                    					
                    pushFollow(FOLLOW_8);
                    lv_facts_4_3=ruleForeignKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"facts",
                    							lv_facts_4_3,
                    							"uniandes.automat.sql.Sql.ForeignKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalSql.g:235:3: (otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSql.g:236:4: otherlv_5= ',' ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSql.g:240:4: ( ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) ) )
            	    // InternalSql.g:241:5: ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) )
            	    {
            	    // InternalSql.g:241:5: ( (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey ) )
            	    // InternalSql.g:242:6: (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey )
            	    {
            	    // InternalSql.g:242:6: (lv_facts_6_1= ruleColumn | lv_facts_6_2= rulePrimaryKey | lv_facts_6_3= ruleForeignKey )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 19:
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
            	            // InternalSql.g:243:7: lv_facts_6_1= ruleColumn
            	            {

            	            							newCompositeNode(grammarAccess.getTableAccess().getFactsColumnParserRuleCall_5_1_0_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_facts_6_1=ruleColumn();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"facts",
            	            								lv_facts_6_1,
            	            								"uniandes.automat.sql.Sql.Column");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql.g:259:7: lv_facts_6_2= rulePrimaryKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableAccess().getFactsPrimaryKeyParserRuleCall_5_1_0_1());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_facts_6_2=rulePrimaryKey();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"facts",
            	            								lv_facts_6_2,
            	            								"uniandes.automat.sql.Sql.PrimaryKey");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalSql.g:275:7: lv_facts_6_3= ruleForeignKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableAccess().getFactsForeignKeyParserRuleCall_5_1_0_2());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_facts_6_3=ruleForeignKey();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"facts",
            	            								lv_facts_6_3,
            	            								"uniandes.automat.sql.Sql.ForeignKey");
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTableAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalSql.g:302:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSql.g:302:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSql.g:303:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSql.g:309:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isNotNull_2_0= 'NOT NULL' ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isNotNull_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:315:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isNotNull_2_0= 'NOT NULL' ) )? ) )
            // InternalSql.g:316:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isNotNull_2_0= 'NOT NULL' ) )? )
            {
            // InternalSql.g:316:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isNotNull_2_0= 'NOT NULL' ) )? )
            // InternalSql.g:317:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isNotNull_2_0= 'NOT NULL' ) )?
            {
            // InternalSql.g:317:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql.g:318:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSql.g:318:4: (lv_name_0_0= RULE_ID )
            // InternalSql.g:319:5: lv_name_0_0= RULE_ID
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

            // InternalSql.g:335:3: ( (lv_type_1_0= ruleDataType ) )
            // InternalSql.g:336:4: (lv_type_1_0= ruleDataType )
            {
            // InternalSql.g:336:4: (lv_type_1_0= ruleDataType )
            // InternalSql.g:337:5: lv_type_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_1_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"uniandes.automat.sql.Sql.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:354:3: ( (lv_isNotNull_2_0= 'NOT NULL' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSql.g:355:4: (lv_isNotNull_2_0= 'NOT NULL' )
                    {
                    // InternalSql.g:355:4: (lv_isNotNull_2_0= 'NOT NULL' )
                    // InternalSql.g:356:5: lv_isNotNull_2_0= 'NOT NULL'
                    {
                    lv_isNotNull_2_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_isNotNull_2_0, grammarAccess.getColumnAccess().getIsNotNullNOTNULLKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(current, "isNotNull", true, "NOT NULL");
                    				

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
    // InternalSql.g:372:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSql.g:372:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSql.g:373:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalSql.g:379:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSql.g:385:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalSql.g:386:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalSql.g:386:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalSql.g:387:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql.g:399:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql.g:400:4: (otherlv_3= RULE_ID )
            {
            // InternalSql.g:400:4: (otherlv_3= RULE_ID )
            // InternalSql.g:401:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0());
            				

            }


            }

            // InternalSql.g:412:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSql.g:413:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql.g:417:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql.g:418:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql.g:418:5: (otherlv_5= RULE_ID )
            	    // InternalSql.g:419:6: otherlv_5= RULE_ID
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalSql.g:439:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSql.g:439:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSql.g:440:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSql.g:446:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalSql.g:452:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) )
            // InternalSql.g:453:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            {
            // InternalSql.g:453:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            // InternalSql.g:454:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql.g:466:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql.g:467:4: (otherlv_3= RULE_ID )
            {
            // InternalSql.g:467:4: (otherlv_3= RULE_ID )
            // InternalSql.g:468:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0());
            				

            }


            }

            // InternalSql.g:479:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSql.g:480:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql.g:484:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql.g:485:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql.g:485:5: (otherlv_5= RULE_ID )
            	    // InternalSql.g:486:6: otherlv_5= RULE_ID
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6());
            		
            // InternalSql.g:506:3: ( (otherlv_8= RULE_ID ) )
            // InternalSql.g:507:4: (otherlv_8= RULE_ID )
            {
            // InternalSql.g:507:4: (otherlv_8= RULE_ID )
            // InternalSql.g:508:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getForeignTableTableCrossReference_7_0());
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSql.g:523:3: ( (otherlv_10= RULE_ID ) )
            // InternalSql.g:524:4: (otherlv_10= RULE_ID )
            {
            // InternalSql.g:524:4: (otherlv_10= RULE_ID )
            // InternalSql.g:525:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_9_0());
            				

            }


            }

            // InternalSql.g:536:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql.g:537:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_11, grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSql.g:541:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSql.g:542:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSql.g:542:5: (otherlv_12= RULE_ID )
            	    // InternalSql.g:543:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getForeignColumnsColumnCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11());
            		

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


    // $ANTLR start "ruleDataType"
    // InternalSql.g:563:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'int' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSql.g:569:2: ( ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'int' ) ) )
            // InternalSql.g:570:2: ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'int' ) )
            {
            // InternalSql.g:570:2: ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'int' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSql.g:571:3: (enumLiteral_0= 'varchar(255)' )
                    {
                    // InternalSql.g:571:3: (enumLiteral_0= 'varchar(255)' )
                    // InternalSql.g:572:4: enumLiteral_0= 'varchar(255)'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:579:3: (enumLiteral_1= 'int' )
                    {
                    // InternalSql.g:579:3: (enumLiteral_1= 'int' )
                    // InternalSql.g:580:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}