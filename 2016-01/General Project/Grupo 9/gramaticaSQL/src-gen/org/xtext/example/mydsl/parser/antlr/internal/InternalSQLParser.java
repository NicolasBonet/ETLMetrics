package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE_TABLE", "RULE_ID", "RULE_LPAR", "RULE_COMMA", "RULE_RPAR", "RULE_DATA_TYPE", "RULE_NOT_NULL", "RULE_PRIMARY_KEY", "RULE_FOREIGN_KEY", "RULE_REFERENCES", "RULE_MAX_LENGTH", "RULE_TINT", "RULE_TVARCHAR", "RULE_TCHARACTER", "RULE_TBINARY", "RULE_TBOOLEAN", "RULE_TVARBINARY", "RULE_TSMALLINT", "RULE_TBIGINT", "RULE_PRECISION", "RULE_TDECIMAL", "RULE_TNUMERIC", "RULE_TFLOAT", "RULE_TDATE", "RULE_TTIME", "RULE_TTIMESTAMP", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_TNUMERIC=25;
    public static final int RULE_TBOOLEAN=19;
    public static final int RULE_PRIMARY_KEY=11;
    public static final int RULE_TTIMESTAMP=29;
    public static final int RULE_STRING=31;
    public static final int RULE_TVARBINARY=20;
    public static final int RULE_DATA_TYPE=9;
    public static final int RULE_FOREIGN_KEY=12;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_CREATE_TABLE=4;
    public static final int RULE_TTIME=28;
    public static final int EOF=-1;
    public static final int RULE_NOT_NULL=10;
    public static final int RULE_TFLOAT=26;
    public static final int RULE_REFERENCES=13;
    public static final int RULE_ID=5;
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
    public static final int RULE_RPAR=8;
    public static final int RULE_LPAR=6;
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

        public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Database";
       	}

       	@Override
       	protected SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDatabase"
    // InternalSQL.g:64:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSQL.g:64:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSQL.g:65:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSQL.g:71:1: ruleDatabase returns [EObject current=null] : ( () ( (lv_tables_1_0= ruleTable ) )* ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:77:2: ( ( () ( (lv_tables_1_0= ruleTable ) )* ) )
            // InternalSQL.g:78:2: ( () ( (lv_tables_1_0= ruleTable ) )* )
            {
            // InternalSQL.g:78:2: ( () ( (lv_tables_1_0= ruleTable ) )* )
            // InternalSQL.g:79:3: () ( (lv_tables_1_0= ruleTable ) )*
            {
            // InternalSQL.g:79:3: ()
            // InternalSQL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatabaseAccess().getDatabaseAction_0(),
            					current);
            			

            }

            // InternalSQL.g:86:3: ( (lv_tables_1_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_CREATE_TABLE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:87:4: (lv_tables_1_0= ruleTable )
            	    {
            	    // InternalSQL.g:87:4: (lv_tables_1_0= ruleTable )
            	    // InternalSQL.g:88:5: lv_tables_1_0= ruleTable
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
            	    						"org.xtext.example.mydsl.SQL.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // InternalSQL.g:109:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSQL.g:109:46: (iv_ruleTable= ruleTable EOF )
            // InternalSQL.g:110:2: iv_ruleTable= ruleTable EOF
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
    // InternalSQL.g:116:1: ruleTable returns [EObject current=null] : (this_CREATE_TABLE_0= RULE_CREATE_TABLE ( (lv_name_1_0= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (lv_columns_3_0= ruleColumn ) ) (this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) ) )* ( (lv_primaryKey_6_0= rulePrimaryKey ) )? ( (lv_foreignKeys_7_0= ruleForeignKey ) )* this_RPAR_8= RULE_RPAR ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_CREATE_TABLE_0=null;
        Token lv_name_1_0=null;
        Token this_LPAR_2=null;
        Token this_COMMA_4=null;
        Token this_RPAR_8=null;
        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;

        EObject lv_primaryKey_6_0 = null;

        EObject lv_foreignKeys_7_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:122:2: ( (this_CREATE_TABLE_0= RULE_CREATE_TABLE ( (lv_name_1_0= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (lv_columns_3_0= ruleColumn ) ) (this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) ) )* ( (lv_primaryKey_6_0= rulePrimaryKey ) )? ( (lv_foreignKeys_7_0= ruleForeignKey ) )* this_RPAR_8= RULE_RPAR ) )
            // InternalSQL.g:123:2: (this_CREATE_TABLE_0= RULE_CREATE_TABLE ( (lv_name_1_0= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (lv_columns_3_0= ruleColumn ) ) (this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) ) )* ( (lv_primaryKey_6_0= rulePrimaryKey ) )? ( (lv_foreignKeys_7_0= ruleForeignKey ) )* this_RPAR_8= RULE_RPAR )
            {
            // InternalSQL.g:123:2: (this_CREATE_TABLE_0= RULE_CREATE_TABLE ( (lv_name_1_0= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (lv_columns_3_0= ruleColumn ) ) (this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) ) )* ( (lv_primaryKey_6_0= rulePrimaryKey ) )? ( (lv_foreignKeys_7_0= ruleForeignKey ) )* this_RPAR_8= RULE_RPAR )
            // InternalSQL.g:124:3: this_CREATE_TABLE_0= RULE_CREATE_TABLE ( (lv_name_1_0= RULE_ID ) ) this_LPAR_2= RULE_LPAR ( (lv_columns_3_0= ruleColumn ) ) (this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) ) )* ( (lv_primaryKey_6_0= rulePrimaryKey ) )? ( (lv_foreignKeys_7_0= ruleForeignKey ) )* this_RPAR_8= RULE_RPAR
            {
            this_CREATE_TABLE_0=(Token)match(input,RULE_CREATE_TABLE,FOLLOW_4); 

            			newLeafNode(this_CREATE_TABLE_0, grammarAccess.getTableAccess().getCREATE_TABLETerminalRuleCall_0());
            		
            // InternalSQL.g:128:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSQL.g:129:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSQL.g:129:4: (lv_name_1_0= RULE_ID )
            // InternalSQL.g:130:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_4); 

            			newLeafNode(this_LPAR_2, grammarAccess.getTableAccess().getLPARTerminalRuleCall_2());
            		
            // InternalSQL.g:150:3: ( (lv_columns_3_0= ruleColumn ) )
            // InternalSQL.g:151:4: (lv_columns_3_0= ruleColumn )
            {
            // InternalSQL.g:151:4: (lv_columns_3_0= ruleColumn )
            // InternalSQL.g:152:5: lv_columns_3_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_columns_3_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.xtext.example.mydsl.SQL.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:169:3: (this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) ) )*
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
            	    // InternalSQL.g:170:4: this_COMMA_4= RULE_COMMA ( (lv_columns_5_0= ruleColumn ) )
            	    {
            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    				newLeafNode(this_COMMA_4, grammarAccess.getTableAccess().getCOMMATerminalRuleCall_4_0());
            	    			
            	    // InternalSQL.g:174:4: ( (lv_columns_5_0= ruleColumn ) )
            	    // InternalSQL.g:175:5: (lv_columns_5_0= ruleColumn )
            	    {
            	    // InternalSQL.g:175:5: (lv_columns_5_0= ruleColumn )
            	    // InternalSQL.g:176:6: lv_columns_5_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_columns_5_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"org.xtext.example.mydsl.SQL.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSQL.g:194:3: ( (lv_primaryKey_6_0= rulePrimaryKey ) )?
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
                    // InternalSQL.g:195:4: (lv_primaryKey_6_0= rulePrimaryKey )
                    {
                    // InternalSQL.g:195:4: (lv_primaryKey_6_0= rulePrimaryKey )
                    // InternalSQL.g:196:5: lv_primaryKey_6_0= rulePrimaryKey
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_primaryKey_6_0=rulePrimaryKey();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"primaryKey",
                    						lv_primaryKey_6_0,
                    						"org.xtext.example.mydsl.SQL.PrimaryKey");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSQL.g:213:3: ( (lv_foreignKeys_7_0= ruleForeignKey ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSQL.g:214:4: (lv_foreignKeys_7_0= ruleForeignKey )
            	    {
            	    // InternalSQL.g:214:4: (lv_foreignKeys_7_0= ruleForeignKey )
            	    // InternalSQL.g:215:5: lv_foreignKeys_7_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getForeignKeysForeignKeyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_foreignKeys_7_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foreignKeys",
            	    						lv_foreignKeys_7_0,
            	    						"org.xtext.example.mydsl.SQL.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RPAR_8=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_8, grammarAccess.getTableAccess().getRPARTerminalRuleCall_7());
            		

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
    // InternalSQL.g:240:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSQL.g:240:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSQL.g:241:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSQL.g:247:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_DATA_TYPE ) ) ( (lv_notNull_2_0= RULE_NOT_NULL ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_dataType_1_0=null;
        Token lv_notNull_2_0=null;


        	enterRule();

        try {
            // InternalSQL.g:253:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_DATA_TYPE ) ) ( (lv_notNull_2_0= RULE_NOT_NULL ) )? ) )
            // InternalSQL.g:254:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_DATA_TYPE ) ) ( (lv_notNull_2_0= RULE_NOT_NULL ) )? )
            {
            // InternalSQL.g:254:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_DATA_TYPE ) ) ( (lv_notNull_2_0= RULE_NOT_NULL ) )? )
            // InternalSQL.g:255:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_DATA_TYPE ) ) ( (lv_notNull_2_0= RULE_NOT_NULL ) )?
            {
            // InternalSQL.g:255:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSQL.g:256:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSQL.g:256:4: (lv_name_0_0= RULE_ID )
            // InternalSQL.g:257:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalSQL.g:273:3: ( (lv_dataType_1_0= RULE_DATA_TYPE ) )
            // InternalSQL.g:274:4: (lv_dataType_1_0= RULE_DATA_TYPE )
            {
            // InternalSQL.g:274:4: (lv_dataType_1_0= RULE_DATA_TYPE )
            // InternalSQL.g:275:5: lv_dataType_1_0= RULE_DATA_TYPE
            {
            lv_dataType_1_0=(Token)match(input,RULE_DATA_TYPE,FOLLOW_8); 

            					newLeafNode(lv_dataType_1_0, grammarAccess.getColumnAccess().getDataTypeDATA_TYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataType",
            						lv_dataType_1_0,
            						"org.xtext.example.mydsl.SQL.DATA_TYPE");
            				

            }


            }

            // InternalSQL.g:291:3: ( (lv_notNull_2_0= RULE_NOT_NULL ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NOT_NULL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:292:4: (lv_notNull_2_0= RULE_NOT_NULL )
                    {
                    // InternalSQL.g:292:4: (lv_notNull_2_0= RULE_NOT_NULL )
                    // InternalSQL.g:293:5: lv_notNull_2_0= RULE_NOT_NULL
                    {
                    lv_notNull_2_0=(Token)match(input,RULE_NOT_NULL,FOLLOW_2); 

                    					newLeafNode(lv_notNull_2_0, grammarAccess.getColumnAccess().getNotNullNOT_NULLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"notNull",
                    						lv_notNull_2_0,
                    						"org.xtext.example.mydsl.SQL.NOT_NULL");
                    				

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
    // InternalSQL.g:313:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSQL.g:313:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSQL.g:314:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalSQL.g:320:1: rulePrimaryKey returns [EObject current=null] : (this_COMMA_0= RULE_COMMA this_PRIMARY_KEY_1= RULE_PRIMARY_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_0=null;
        Token this_PRIMARY_KEY_1=null;
        Token this_LPAR_2=null;
        Token otherlv_3=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_RPAR_6=null;


        	enterRule();

        try {
            // InternalSQL.g:326:2: ( (this_COMMA_0= RULE_COMMA this_PRIMARY_KEY_1= RULE_PRIMARY_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR ) )
            // InternalSQL.g:327:2: (this_COMMA_0= RULE_COMMA this_PRIMARY_KEY_1= RULE_PRIMARY_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR )
            {
            // InternalSQL.g:327:2: (this_COMMA_0= RULE_COMMA this_PRIMARY_KEY_1= RULE_PRIMARY_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR )
            // InternalSQL.g:328:3: this_COMMA_0= RULE_COMMA this_PRIMARY_KEY_1= RULE_PRIMARY_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            			newLeafNode(this_COMMA_0, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_0());
            		
            this_PRIMARY_KEY_1=(Token)match(input,RULE_PRIMARY_KEY,FOLLOW_5); 

            			newLeafNode(this_PRIMARY_KEY_1, grammarAccess.getPrimaryKeyAccess().getPRIMARY_KEYTerminalRuleCall_1());
            		
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_4); 

            			newLeafNode(this_LPAR_2, grammarAccess.getPrimaryKeyAccess().getLPARTerminalRuleCall_2());
            		
            // InternalSQL.g:340:3: ( (otherlv_3= RULE_ID ) )
            // InternalSQL.g:341:4: (otherlv_3= RULE_ID )
            {
            // InternalSQL.g:341:4: (otherlv_3= RULE_ID )
            // InternalSQL.g:342:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0());
            				

            }


            }

            // InternalSQL.g:353:3: (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSQL.g:354:4: this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) )
            	    {
            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    				newLeafNode(this_COMMA_4, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    			
            	    // InternalSQL.g:358:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSQL.g:359:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSQL.g:359:5: (otherlv_5= RULE_ID )
            	    // InternalSQL.g:360:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSQL.g:380:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSQL.g:380:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSQL.g:381:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSQL.g:387:1: ruleForeignKey returns [EObject current=null] : (this_COMMA_0= RULE_COMMA this_FOREIGN_KEY_1= RULE_FOREIGN_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPAR_9= RULE_LPAR ( (otherlv_10= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) ) )* this_RPAR_13= RULE_RPAR ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_0=null;
        Token this_FOREIGN_KEY_1=null;
        Token this_LPAR_2=null;
        Token otherlv_3=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_RPAR_6=null;
        Token this_REFERENCES_7=null;
        Token otherlv_8=null;
        Token this_LPAR_9=null;
        Token otherlv_10=null;
        Token this_COMMA_11=null;
        Token otherlv_12=null;
        Token this_RPAR_13=null;


        	enterRule();

        try {
            // InternalSQL.g:393:2: ( (this_COMMA_0= RULE_COMMA this_FOREIGN_KEY_1= RULE_FOREIGN_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPAR_9= RULE_LPAR ( (otherlv_10= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) ) )* this_RPAR_13= RULE_RPAR ) )
            // InternalSQL.g:394:2: (this_COMMA_0= RULE_COMMA this_FOREIGN_KEY_1= RULE_FOREIGN_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPAR_9= RULE_LPAR ( (otherlv_10= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) ) )* this_RPAR_13= RULE_RPAR )
            {
            // InternalSQL.g:394:2: (this_COMMA_0= RULE_COMMA this_FOREIGN_KEY_1= RULE_FOREIGN_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPAR_9= RULE_LPAR ( (otherlv_10= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) ) )* this_RPAR_13= RULE_RPAR )
            // InternalSQL.g:395:3: this_COMMA_0= RULE_COMMA this_FOREIGN_KEY_1= RULE_FOREIGN_KEY this_LPAR_2= RULE_LPAR ( (otherlv_3= RULE_ID ) ) (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )* this_RPAR_6= RULE_RPAR this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPAR_9= RULE_LPAR ( (otherlv_10= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) ) )* this_RPAR_13= RULE_RPAR
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_10); 

            			newLeafNode(this_COMMA_0, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_0());
            		
            this_FOREIGN_KEY_1=(Token)match(input,RULE_FOREIGN_KEY,FOLLOW_5); 

            			newLeafNode(this_FOREIGN_KEY_1, grammarAccess.getForeignKeyAccess().getFOREIGN_KEYTerminalRuleCall_1());
            		
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_4); 

            			newLeafNode(this_LPAR_2, grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_2());
            		
            // InternalSQL.g:407:3: ( (otherlv_3= RULE_ID ) )
            // InternalSQL.g:408:4: (otherlv_3= RULE_ID )
            {
            // InternalSQL.g:408:4: (otherlv_3= RULE_ID )
            // InternalSQL.g:409:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0());
            				

            }


            }

            // InternalSQL.g:420:3: (this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSQL.g:421:4: this_COMMA_4= RULE_COMMA ( (otherlv_5= RULE_ID ) )
            	    {
            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    				newLeafNode(this_COMMA_4, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    			
            	    // InternalSQL.g:425:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSQL.g:426:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSQL.g:426:5: (otherlv_5= RULE_ID )
            	    // InternalSQL.g:427:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_11); 

            			newLeafNode(this_RPAR_6, grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_5());
            		
            this_REFERENCES_7=(Token)match(input,RULE_REFERENCES,FOLLOW_4); 

            			newLeafNode(this_REFERENCES_7, grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6());
            		
            // InternalSQL.g:447:3: ( (otherlv_8= RULE_ID ) )
            // InternalSQL.g:448:4: (otherlv_8= RULE_ID )
            {
            // InternalSQL.g:448:4: (otherlv_8= RULE_ID )
            // InternalSQL.g:449:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getRefTableTableCrossReference_7_0());
            				

            }


            }

            this_LPAR_9=(Token)match(input,RULE_LPAR,FOLLOW_4); 

            			newLeafNode(this_LPAR_9, grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_8());
            		
            // InternalSQL.g:464:3: ( (otherlv_10= RULE_ID ) )
            // InternalSQL.g:465:4: (otherlv_10= RULE_ID )
            {
            // InternalSQL.g:465:4: (otherlv_10= RULE_ID )
            // InternalSQL.g:466:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getRefColumnsColumnCrossReference_9_0());
            				

            }


            }

            // InternalSQL.g:477:3: (this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSQL.g:478:4: this_COMMA_11= RULE_COMMA ( (otherlv_12= RULE_ID ) )
            	    {
            	    this_COMMA_11=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    				newLeafNode(this_COMMA_11, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalSQL.g:482:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSQL.g:483:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSQL.g:483:5: (otherlv_12= RULE_ID )
            	    // InternalSQL.g:484:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getRefColumnsColumnCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_RPAR_13=(Token)match(input,RULE_RPAR,FOLLOW_2); 

            			newLeafNode(this_RPAR_13, grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_11());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});

}