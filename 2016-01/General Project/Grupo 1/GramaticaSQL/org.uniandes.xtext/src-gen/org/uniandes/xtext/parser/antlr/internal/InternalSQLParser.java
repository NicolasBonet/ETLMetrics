package org.uniandes.xtext.parser.antlr.internal;

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
import org.uniandes.xtext.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_CTABLE", "RULE_ID", "RULE_LPARENT", "RULE_RPARENT", "RULE_NUMBER", "RULE_NOT_NULL", "RULE_COMMA", "RULE_PRIMARY", "RULE_KEY", "RULE_FOREIGN", "RULE_REFERENCES", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar'", "'int'", "'boolean'", "'date'", "'number'"
    };
    public static final int RULE_CTABLE=5;
    public static final int RULE_KEY=13;
    public static final int RULE_STRING=17;
    public static final int RULE_LPARENT=7;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CREATE=4;
    public static final int RULE_RPARENT=8;
    public static final int EOF=-1;
    public static final int RULE_NOT_NULL=10;
    public static final int RULE_REFERENCES=15;
    public static final int RULE_ID=6;
    public static final int RULE_COMMA=11;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_NUMBER=9;
    public static final int RULE_PRIMARY=12;
    public static final int T__26=26;
    public static final int RULE_INT=16;
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

        public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataBase";
       	}

       	@Override
       	protected SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataBase"
    // InternalSQL.g:65:1: entryRuleDataBase returns [EObject current=null] : iv_ruleDataBase= ruleDataBase EOF ;
    public final EObject entryRuleDataBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataBase = null;


        try {
            // InternalSQL.g:65:49: (iv_ruleDataBase= ruleDataBase EOF )
            // InternalSQL.g:66:2: iv_ruleDataBase= ruleDataBase EOF
            {
             newCompositeNode(grammarAccess.getDataBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataBase=ruleDataBase();

            state._fsp--;

             current =iv_ruleDataBase; 
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
    // $ANTLR end "entryRuleDataBase"


    // $ANTLR start "ruleDataBase"
    // InternalSQL.g:72:1: ruleDataBase returns [EObject current=null] : ( () ( (lv_table_1_0= ruleTable ) )+ ) ;
    public final EObject ruleDataBase() throws RecognitionException {
        EObject current = null;

        EObject lv_table_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:78:2: ( ( () ( (lv_table_1_0= ruleTable ) )+ ) )
            // InternalSQL.g:79:2: ( () ( (lv_table_1_0= ruleTable ) )+ )
            {
            // InternalSQL.g:79:2: ( () ( (lv_table_1_0= ruleTable ) )+ )
            // InternalSQL.g:80:3: () ( (lv_table_1_0= ruleTable ) )+
            {
            // InternalSQL.g:80:3: ()
            // InternalSQL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataBaseAccess().getDataBaseAction_0(),
            					current);
            			

            }

            // InternalSQL.g:87:3: ( (lv_table_1_0= ruleTable ) )+
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
            	    // InternalSQL.g:88:4: (lv_table_1_0= ruleTable )
            	    {
            	    // InternalSQL.g:88:4: (lv_table_1_0= ruleTable )
            	    // InternalSQL.g:89:5: lv_table_1_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getDataBaseAccess().getTableTableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_table_1_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataBaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"table",
            	    						lv_table_1_0,
            	    						"org.uniandes.xtext.SQL.Table");
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
    // $ANTLR end "ruleDataBase"


    // $ANTLR start "entryRuleTable"
    // InternalSQL.g:110:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSQL.g:110:46: (iv_ruleTable= ruleTable EOF )
            // InternalSQL.g:111:2: iv_ruleTable= ruleTable EOF
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
    // InternalSQL.g:117:1: ruleTable returns [EObject current=null] : (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_column_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkey_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_CREATE_0=null;
        Token this_CTABLE_1=null;
        Token lv_name_2_0=null;
        Token this_LPARENT_3=null;
        Token this_RPARENT_7=null;
        EObject lv_column_4_0 = null;

        EObject lv_primarykey_5_0 = null;

        EObject lv_foreignkey_6_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:123:2: ( (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_column_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkey_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT ) )
            // InternalSQL.g:124:2: (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_column_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkey_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT )
            {
            // InternalSQL.g:124:2: (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_column_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkey_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT )
            // InternalSQL.g:125:3: this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_column_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkey_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT
            {
            this_CREATE_0=(Token)match(input,RULE_CREATE,FOLLOW_4); 

            			newLeafNode(this_CREATE_0, grammarAccess.getTableAccess().getCREATETerminalRuleCall_0());
            		
            this_CTABLE_1=(Token)match(input,RULE_CTABLE,FOLLOW_5); 

            			newLeafNode(this_CTABLE_1, grammarAccess.getTableAccess().getCTABLETerminalRuleCall_1());
            		
            // InternalSQL.g:133:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSQL.g:134:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSQL.g:134:4: (lv_name_2_0= RULE_ID )
            // InternalSQL.g:135:5: lv_name_2_0= RULE_ID
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
            						"org.uniandes.xtext.SQL.ID");
            				

            }


            }

            this_LPARENT_3=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_3, grammarAccess.getTableAccess().getLPARENTTerminalRuleCall_3());
            		
            // InternalSQL.g:155:3: ( (lv_column_4_0= ruleColumn ) )+
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
            	    // InternalSQL.g:156:4: (lv_column_4_0= ruleColumn )
            	    {
            	    // InternalSQL.g:156:4: (lv_column_4_0= ruleColumn )
            	    // InternalSQL.g:157:5: lv_column_4_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_column_4_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"column",
            	    						lv_column_4_0,
            	    						"org.uniandes.xtext.SQL.Column");
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

            // InternalSQL.g:174:3: ( (lv_primarykey_5_0= rulePrimaryKey ) )
            // InternalSQL.g:175:4: (lv_primarykey_5_0= rulePrimaryKey )
            {
            // InternalSQL.g:175:4: (lv_primarykey_5_0= rulePrimaryKey )
            // InternalSQL.g:176:5: lv_primarykey_5_0= rulePrimaryKey
            {

            					newCompositeNode(grammarAccess.getTableAccess().getPrimarykeyPrimaryKeyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_primarykey_5_0=rulePrimaryKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"primarykey",
            						lv_primarykey_5_0,
            						"org.uniandes.xtext.SQL.PrimaryKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:193:3: ( (lv_foreignkey_6_0= ruleForeignKey ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_FOREIGN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSQL.g:194:4: (lv_foreignkey_6_0= ruleForeignKey )
            	    {
            	    // InternalSQL.g:194:4: (lv_foreignkey_6_0= ruleForeignKey )
            	    // InternalSQL.g:195:5: lv_foreignkey_6_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getForeignkeyForeignKeyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_foreignkey_6_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foreignkey",
            	    						lv_foreignkey_6_0,
            	    						"org.uniandes.xtext.SQL.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RPARENT_7=(Token)match(input,RULE_RPARENT,FOLLOW_2); 

            			newLeafNode(this_RPARENT_7, grammarAccess.getTableAccess().getRPARENTTerminalRuleCall_7());
            		

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
    // InternalSQL.g:220:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSQL.g:220:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSQL.g:221:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSQL.g:227:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )? )? (this_COMMA_6= RULE_COMMA )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LPARENT_2=null;
        Token this_NUMBER_3=null;
        Token this_RPARENT_4=null;
        Token lv_isNull_5_0=null;
        Token this_COMMA_6=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:233:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )? )? (this_COMMA_6= RULE_COMMA )? ) )
            // InternalSQL.g:234:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )? )? (this_COMMA_6= RULE_COMMA )? )
            {
            // InternalSQL.g:234:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )? )? (this_COMMA_6= RULE_COMMA )? )
            // InternalSQL.g:235:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )? )? (this_COMMA_6= RULE_COMMA )?
            {
            // InternalSQL.g:235:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSQL.g:236:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSQL.g:236:4: (lv_name_0_0= RULE_ID )
            // InternalSQL.g:237:5: lv_name_0_0= RULE_ID
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
            						"org.uniandes.xtext.SQL.ID");
            				

            }


            }

            // InternalSQL.g:253:3: ( ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=26)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQL.g:254:4: ( (lv_type_1_0= ruleDataType ) ) (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )? ( (lv_isNull_5_0= RULE_NOT_NULL ) )?
                    {
                    // InternalSQL.g:254:4: ( (lv_type_1_0= ruleDataType ) )
                    // InternalSQL.g:255:5: (lv_type_1_0= ruleDataType )
                    {
                    // InternalSQL.g:255:5: (lv_type_1_0= ruleDataType )
                    // InternalSQL.g:256:6: lv_type_1_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0_0());
                    					
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
                    							"org.uniandes.xtext.SQL.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSQL.g:273:4: (this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_LPARENT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSQL.g:274:5: this_LPARENT_2= RULE_LPARENT this_NUMBER_3= RULE_NUMBER this_RPARENT_4= RULE_RPARENT
                            {
                            this_LPARENT_2=(Token)match(input,RULE_LPARENT,FOLLOW_11); 

                            					newLeafNode(this_LPARENT_2, grammarAccess.getColumnAccess().getLPARENTTerminalRuleCall_1_1_0());
                            				
                            this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_12); 

                            					newLeafNode(this_NUMBER_3, grammarAccess.getColumnAccess().getNUMBERTerminalRuleCall_1_1_1());
                            				
                            this_RPARENT_4=(Token)match(input,RULE_RPARENT,FOLLOW_13); 

                            					newLeafNode(this_RPARENT_4, grammarAccess.getColumnAccess().getRPARENTTerminalRuleCall_1_1_2());
                            				

                            }
                            break;

                    }

                    // InternalSQL.g:287:4: ( (lv_isNull_5_0= RULE_NOT_NULL ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_NOT_NULL) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSQL.g:288:5: (lv_isNull_5_0= RULE_NOT_NULL )
                            {
                            // InternalSQL.g:288:5: (lv_isNull_5_0= RULE_NOT_NULL )
                            // InternalSQL.g:289:6: lv_isNull_5_0= RULE_NOT_NULL
                            {
                            lv_isNull_5_0=(Token)match(input,RULE_NOT_NULL,FOLLOW_14); 

                            						newLeafNode(lv_isNull_5_0, grammarAccess.getColumnAccess().getIsNullNOT_NULLTerminalRuleCall_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getColumnRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"isNull",
                            							true,
                            							"org.uniandes.xtext.SQL.NOT_NULL");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSQL.g:306:3: (this_COMMA_6= RULE_COMMA )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_COMMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:307:4: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_2); 

                    				newLeafNode(this_COMMA_6, grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_2());
                    			

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
    // InternalSQL.g:316:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSQL.g:316:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSQL.g:317:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalSQL.g:323:1: rulePrimaryKey returns [EObject current=null] : (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token this_PRIMARY_0=null;
        Token this_KEY_1=null;
        Token this_LPARENT_2=null;
        Token otherlv_3=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_RPARENT_6=null;
        Token this_COMMA_7=null;


        	enterRule();

        try {
            // InternalSQL.g:329:2: ( (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? ) )
            // InternalSQL.g:330:2: (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? )
            {
            // InternalSQL.g:330:2: (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? )
            // InternalSQL.g:331:3: this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )?
            {
            this_PRIMARY_0=(Token)match(input,RULE_PRIMARY,FOLLOW_15); 

            			newLeafNode(this_PRIMARY_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0());
            		
            this_KEY_1=(Token)match(input,RULE_KEY,FOLLOW_6); 

            			newLeafNode(this_KEY_1, grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1());
            		
            this_LPARENT_2=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_2, grammarAccess.getPrimaryKeyAccess().getLPARENTTerminalRuleCall_2());
            		
            // InternalSQL.g:343:3: ( (otherlv_3= RULE_ID ) )
            // InternalSQL.g:344:4: (otherlv_3= RULE_ID )
            {
            // InternalSQL.g:344:4: (otherlv_3= RULE_ID )
            // InternalSQL.g:345:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnColumnCrossReference_3_0());
            				

            }


            }

            // InternalSQL.g:356:3: ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSQL.g:357:4: (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalSQL.g:357:4: (this_COMMA_4= RULE_COMMA )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_COMMA) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalSQL.g:358:5: this_COMMA_4= RULE_COMMA
            	    	    {
            	    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            	    	    					newLeafNode(this_COMMA_4, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    // InternalSQL.g:363:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSQL.g:364:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSQL.g:364:5: (otherlv_5= RULE_ID )
            	    // InternalSQL.g:365:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_RPARENT_6=(Token)match(input,RULE_RPARENT,FOLLOW_14); 

            			newLeafNode(this_RPARENT_6, grammarAccess.getPrimaryKeyAccess().getRPARENTTerminalRuleCall_5());
            		
            // InternalSQL.g:381:3: (this_COMMA_7= RULE_COMMA )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMA) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:382:4: this_COMMA_7= RULE_COMMA
                    {
                    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_2); 

                    				newLeafNode(this_COMMA_7, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6());
                    			

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
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalSQL.g:391:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSQL.g:391:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSQL.g:392:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSQL.g:398:1: ruleForeignKey returns [EObject current=null] : (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token this_FOREIGN_0=null;
        Token this_KEY_1=null;
        Token this_LPARENT_2=null;
        Token otherlv_3=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_RPARENT_6=null;
        Token this_REFERENCES_7=null;
        Token otherlv_8=null;
        Token this_LPARENT_9=null;
        Token otherlv_10=null;
        Token this_COMMA_11=null;
        Token otherlv_12=null;
        Token this_RPARENT_13=null;
        Token this_COMMA_14=null;


        	enterRule();

        try {
            // InternalSQL.g:404:2: ( (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? ) )
            // InternalSQL.g:405:2: (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? )
            {
            // InternalSQL.g:405:2: (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? )
            // InternalSQL.g:406:3: this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )?
            {
            this_FOREIGN_0=(Token)match(input,RULE_FOREIGN,FOLLOW_15); 

            			newLeafNode(this_FOREIGN_0, grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0());
            		
            this_KEY_1=(Token)match(input,RULE_KEY,FOLLOW_6); 

            			newLeafNode(this_KEY_1, grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1());
            		
            this_LPARENT_2=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_2, grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_2());
            		
            // InternalSQL.g:418:3: ( (otherlv_3= RULE_ID ) )
            // InternalSQL.g:419:4: (otherlv_3= RULE_ID )
            {
            // InternalSQL.g:419:4: (otherlv_3= RULE_ID )
            // InternalSQL.g:420:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnColumnCrossReference_3_0());
            				

            }


            }

            // InternalSQL.g:431:3: ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSQL.g:432:4: (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalSQL.g:432:4: (this_COMMA_4= RULE_COMMA )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_COMMA) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalSQL.g:433:5: this_COMMA_4= RULE_COMMA
            	    	    {
            	    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            	    	    					newLeafNode(this_COMMA_4, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);

            	    // InternalSQL.g:438:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSQL.g:439:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSQL.g:439:5: (otherlv_5= RULE_ID )
            	    // InternalSQL.g:440:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_RPARENT_6=(Token)match(input,RULE_RPARENT,FOLLOW_18); 

            			newLeafNode(this_RPARENT_6, grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_5());
            		
            this_REFERENCES_7=(Token)match(input,RULE_REFERENCES,FOLLOW_5); 

            			newLeafNode(this_REFERENCES_7, grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6());
            		
            // InternalSQL.g:460:3: ( (otherlv_8= RULE_ID ) )
            // InternalSQL.g:461:4: (otherlv_8= RULE_ID )
            {
            // InternalSQL.g:461:4: (otherlv_8= RULE_ID )
            // InternalSQL.g:462:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getTableRefTableCrossReference_7_0());
            				

            }


            }

            this_LPARENT_9=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_9, grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_8());
            		
            // InternalSQL.g:477:3: ( (otherlv_10= RULE_ID ) )
            // InternalSQL.g:478:4: (otherlv_10= RULE_ID )
            {
            // InternalSQL.g:478:4: (otherlv_10= RULE_ID )
            // InternalSQL.g:479:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0());
            				

            }


            }

            // InternalSQL.g:490:3: ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSQL.g:491:4: (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) )
            	    {
            	    // InternalSQL.g:491:4: (this_COMMA_11= RULE_COMMA )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==RULE_COMMA) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalSQL.g:492:5: this_COMMA_11= RULE_COMMA
            	    	    {
            	    	    this_COMMA_11=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            	    	    					newLeafNode(this_COMMA_11, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);

            	    // InternalSQL.g:497:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSQL.g:498:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSQL.g:498:5: (otherlv_12= RULE_ID )
            	    // InternalSQL.g:499:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_RPARENT_13=(Token)match(input,RULE_RPARENT,FOLLOW_14); 

            			newLeafNode(this_RPARENT_13, grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_11());
            		
            // InternalSQL.g:515:3: (this_COMMA_14= RULE_COMMA )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMA) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSQL.g:516:4: this_COMMA_14= RULE_COMMA
                    {
                    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_2); 

                    				newLeafNode(this_COMMA_14, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12());
                    			

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


    // $ANTLR start "ruleDataType"
    // InternalSQL.g:525:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'number' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSQL.g:531:2: ( ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'number' ) ) )
            // InternalSQL.g:532:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'number' ) )
            {
            // InternalSQL.g:532:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'number' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 26:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSQL.g:533:3: (enumLiteral_0= 'varchar' )
                    {
                    // InternalSQL.g:533:3: (enumLiteral_0= 'varchar' )
                    // InternalSQL.g:534:4: enumLiteral_0= 'varchar'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getVarcharEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getVarcharEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:541:3: (enumLiteral_1= 'int' )
                    {
                    // InternalSQL.g:541:3: (enumLiteral_1= 'int' )
                    // InternalSQL.g:542:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:549:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalSQL.g:549:3: (enumLiteral_2= 'boolean' )
                    // InternalSQL.g:550:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:557:3: (enumLiteral_3= 'date' )
                    {
                    // InternalSQL.g:557:3: (enumLiteral_3= 'date' )
                    // InternalSQL.g:558:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:565:3: (enumLiteral_4= 'number' )
                    {
                    // InternalSQL.g:565:3: (enumLiteral_4= 'number' )
                    // InternalSQL.g:566:4: enumLiteral_4= 'number'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNumberEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getNumberEnumLiteralDeclaration_4());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007C00802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000C82L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});

}