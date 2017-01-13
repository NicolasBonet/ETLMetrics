package org.xtext.example.parser.antlr.internal;

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
import org.xtext.example.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_TABLA", "RULE_ID", "RULE_LPAREN", "RULE_RPAREN", "RULE_NOT", "RULE_NULL", "RULE_COMA", "RULE_PRIMARY", "RULE_KEY", "RULE_FOREIGN", "RULE_REFERENCES", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar(255)'", "'varchar'", "'int'", "'character'", "'boolean'", "'date'", "'time'", "'float'", "'decimal'", "'numeric'"
    };
    public static final int RULE_COMA=11;
    public static final int RULE_KEY=13;
    public static final int RULE_STRING=17;
    public static final int RULE_NOT=9;
    public static final int RULE_NULL=10;
    public static final int RULE_LPAREN=7;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CREATE=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_REFERENCES=15;
    public static final int RULE_ID=6;
    public static final int RULE_WS=20;
    public static final int RULE_TABLA=5;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_PRIMARY=12;
    public static final int RULE_RPAREN=8;
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
    // InternalSQL.g:72:1: ruleDataBase returns [EObject current=null] : ( (lv_Tables_0_0= ruleTable ) )+ ;
    public final EObject ruleDataBase() throws RecognitionException {
        EObject current = null;

        EObject lv_Tables_0_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:78:2: ( ( (lv_Tables_0_0= ruleTable ) )+ )
            // InternalSQL.g:79:2: ( (lv_Tables_0_0= ruleTable ) )+
            {
            // InternalSQL.g:79:2: ( (lv_Tables_0_0= ruleTable ) )+
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
            	    // InternalSQL.g:80:3: (lv_Tables_0_0= ruleTable )
            	    {
            	    // InternalSQL.g:80:3: (lv_Tables_0_0= ruleTable )
            	    // InternalSQL.g:81:4: lv_Tables_0_0= ruleTable
            	    {

            	    				newCompositeNode(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Tables_0_0=ruleTable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDataBaseRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Tables",
            	    					lv_Tables_0_0,
            	    					"org.xtext.example.SQL.Table");
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
    // $ANTLR end "ruleDataBase"


    // $ANTLR start "entryRuleTable"
    // InternalSQL.g:101:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSQL.g:101:46: (iv_ruleTable= ruleTable EOF )
            // InternalSQL.g:102:2: iv_ruleTable= ruleTable EOF
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
    // InternalSQL.g:108:1: ruleTable returns [EObject current=null] : (this_CREATE_0= RULE_CREATE this_TABLA_1= RULE_TABLA ( (lv_name_2_0= RULE_ID ) ) this_LPAREN_3= RULE_LPAREN ( (lv_columns_4_0= rulecolumn ) )+ ( (lv_primaryKey_5_0= ruleprimaryKey ) ) ( (lv_foreignkeys_6_0= ruleforeignKey ) )* this_RPAREN_7= RULE_RPAREN ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_CREATE_0=null;
        Token this_TABLA_1=null;
        Token lv_name_2_0=null;
        Token this_LPAREN_3=null;
        Token this_RPAREN_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_primaryKey_5_0 = null;

        EObject lv_foreignkeys_6_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:114:2: ( (this_CREATE_0= RULE_CREATE this_TABLA_1= RULE_TABLA ( (lv_name_2_0= RULE_ID ) ) this_LPAREN_3= RULE_LPAREN ( (lv_columns_4_0= rulecolumn ) )+ ( (lv_primaryKey_5_0= ruleprimaryKey ) ) ( (lv_foreignkeys_6_0= ruleforeignKey ) )* this_RPAREN_7= RULE_RPAREN ) )
            // InternalSQL.g:115:2: (this_CREATE_0= RULE_CREATE this_TABLA_1= RULE_TABLA ( (lv_name_2_0= RULE_ID ) ) this_LPAREN_3= RULE_LPAREN ( (lv_columns_4_0= rulecolumn ) )+ ( (lv_primaryKey_5_0= ruleprimaryKey ) ) ( (lv_foreignkeys_6_0= ruleforeignKey ) )* this_RPAREN_7= RULE_RPAREN )
            {
            // InternalSQL.g:115:2: (this_CREATE_0= RULE_CREATE this_TABLA_1= RULE_TABLA ( (lv_name_2_0= RULE_ID ) ) this_LPAREN_3= RULE_LPAREN ( (lv_columns_4_0= rulecolumn ) )+ ( (lv_primaryKey_5_0= ruleprimaryKey ) ) ( (lv_foreignkeys_6_0= ruleforeignKey ) )* this_RPAREN_7= RULE_RPAREN )
            // InternalSQL.g:116:3: this_CREATE_0= RULE_CREATE this_TABLA_1= RULE_TABLA ( (lv_name_2_0= RULE_ID ) ) this_LPAREN_3= RULE_LPAREN ( (lv_columns_4_0= rulecolumn ) )+ ( (lv_primaryKey_5_0= ruleprimaryKey ) ) ( (lv_foreignkeys_6_0= ruleforeignKey ) )* this_RPAREN_7= RULE_RPAREN
            {
            this_CREATE_0=(Token)match(input,RULE_CREATE,FOLLOW_4); 

            			newLeafNode(this_CREATE_0, grammarAccess.getTableAccess().getCREATETerminalRuleCall_0());
            		
            this_TABLA_1=(Token)match(input,RULE_TABLA,FOLLOW_5); 

            			newLeafNode(this_TABLA_1, grammarAccess.getTableAccess().getTABLATerminalRuleCall_1());
            		
            // InternalSQL.g:124:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSQL.g:125:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSQL.g:125:4: (lv_name_2_0= RULE_ID )
            // InternalSQL.g:126:5: lv_name_2_0= RULE_ID
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
            						"org.xtext.example.SQL.ID");
            				

            }


            }

            this_LPAREN_3=(Token)match(input,RULE_LPAREN,FOLLOW_5); 

            			newLeafNode(this_LPAREN_3, grammarAccess.getTableAccess().getLPARENTerminalRuleCall_3());
            		
            // InternalSQL.g:146:3: ( (lv_columns_4_0= rulecolumn ) )+
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
            	    // InternalSQL.g:147:4: (lv_columns_4_0= rulecolumn )
            	    {
            	    // InternalSQL.g:147:4: (lv_columns_4_0= rulecolumn )
            	    // InternalSQL.g:148:5: lv_columns_4_0= rulecolumn
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_columns_4_0=rulecolumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_4_0,
            	    						"org.xtext.example.SQL.column");
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

            // InternalSQL.g:165:3: ( (lv_primaryKey_5_0= ruleprimaryKey ) )
            // InternalSQL.g:166:4: (lv_primaryKey_5_0= ruleprimaryKey )
            {
            // InternalSQL.g:166:4: (lv_primaryKey_5_0= ruleprimaryKey )
            // InternalSQL.g:167:5: lv_primaryKey_5_0= ruleprimaryKey
            {

            					newCompositeNode(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_primaryKey_5_0=ruleprimaryKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"primaryKey",
            						lv_primaryKey_5_0,
            						"org.xtext.example.SQL.primaryKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:184:3: ( (lv_foreignkeys_6_0= ruleforeignKey ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_FOREIGN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSQL.g:185:4: (lv_foreignkeys_6_0= ruleforeignKey )
            	    {
            	    // InternalSQL.g:185:4: (lv_foreignkeys_6_0= ruleforeignKey )
            	    // InternalSQL.g:186:5: lv_foreignkeys_6_0= ruleforeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_foreignkeys_6_0=ruleforeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foreignkeys",
            	    						lv_foreignkeys_6_0,
            	    						"org.xtext.example.SQL.foreignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RPAREN_7=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

            			newLeafNode(this_RPAREN_7, grammarAccess.getTableAccess().getRPARENTerminalRuleCall_7());
            		

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


    // $ANTLR start "entryRulecolumn"
    // InternalSQL.g:211:1: entryRulecolumn returns [EObject current=null] : iv_rulecolumn= rulecolumn EOF ;
    public final EObject entryRulecolumn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecolumn = null;


        try {
            // InternalSQL.g:211:47: (iv_rulecolumn= rulecolumn EOF )
            // InternalSQL.g:212:2: iv_rulecolumn= rulecolumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecolumn=rulecolumn();

            state._fsp--;

             current =iv_rulecolumn; 
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
    // $ANTLR end "entryRulecolumn"


    // $ANTLR start "rulecolumn"
    // InternalSQL.g:218:1: rulecolumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) (this_NOT_2= RULE_NOT )? (this_NULL_3= RULE_NULL )? (this_COMA_4= RULE_COMA )? ) ;
    public final EObject rulecolumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_NOT_2=null;
        Token this_NULL_3=null;
        Token this_COMA_4=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:224:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) (this_NOT_2= RULE_NOT )? (this_NULL_3= RULE_NULL )? (this_COMA_4= RULE_COMA )? ) )
            // InternalSQL.g:225:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) (this_NOT_2= RULE_NOT )? (this_NULL_3= RULE_NULL )? (this_COMA_4= RULE_COMA )? )
            {
            // InternalSQL.g:225:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) (this_NOT_2= RULE_NOT )? (this_NULL_3= RULE_NULL )? (this_COMA_4= RULE_COMA )? )
            // InternalSQL.g:226:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) (this_NOT_2= RULE_NOT )? (this_NULL_3= RULE_NULL )? (this_COMA_4= RULE_COMA )?
            {
            // InternalSQL.g:226:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSQL.g:227:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSQL.g:227:4: (lv_name_0_0= RULE_ID )
            // InternalSQL.g:228:5: lv_name_0_0= RULE_ID
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
            						"org.xtext.example.SQL.ID");
            				

            }


            }

            // InternalSQL.g:244:3: ( (lv_type_1_0= ruleDataType ) )
            // InternalSQL.g:245:4: (lv_type_1_0= ruleDataType )
            {
            // InternalSQL.g:245:4: (lv_type_1_0= ruleDataType )
            // InternalSQL.g:246:5: lv_type_1_0= ruleDataType
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
            						"org.xtext.example.SQL.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:263:3: (this_NOT_2= RULE_NOT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NOT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSQL.g:264:4: this_NOT_2= RULE_NOT
                    {
                    this_NOT_2=(Token)match(input,RULE_NOT,FOLLOW_11); 

                    				newLeafNode(this_NOT_2, grammarAccess.getColumnAccess().getNOTTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalSQL.g:269:3: (this_NULL_3= RULE_NULL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NULL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:270:4: this_NULL_3= RULE_NULL
                    {
                    this_NULL_3=(Token)match(input,RULE_NULL,FOLLOW_12); 

                    				newLeafNode(this_NULL_3, grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalSQL.g:275:3: (this_COMA_4= RULE_COMA )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQL.g:276:4: this_COMA_4= RULE_COMA
                    {
                    this_COMA_4=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_4, grammarAccess.getColumnAccess().getCOMATerminalRuleCall_4());
                    			

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
    // $ANTLR end "rulecolumn"


    // $ANTLR start "entryRuleprimaryKey"
    // InternalSQL.g:285:1: entryRuleprimaryKey returns [EObject current=null] : iv_ruleprimaryKey= ruleprimaryKey EOF ;
    public final EObject entryRuleprimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimaryKey = null;


        try {
            // InternalSQL.g:285:51: (iv_ruleprimaryKey= ruleprimaryKey EOF )
            // InternalSQL.g:286:2: iv_ruleprimaryKey= ruleprimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprimaryKey=ruleprimaryKey();

            state._fsp--;

             current =iv_ruleprimaryKey; 
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
    // $ANTLR end "entryRuleprimaryKey"


    // $ANTLR start "ruleprimaryKey"
    // InternalSQL.g:292:1: ruleprimaryKey returns [EObject current=null] : (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) (this_COMA_4= RULE_COMA this_ID_5= RULE_ID )* this_RPAREN_6= RULE_RPAREN (this_COMA_7= RULE_COMA )? ) ;
    public final EObject ruleprimaryKey() throws RecognitionException {
        EObject current = null;

        Token this_PRIMARY_0=null;
        Token this_KEY_1=null;
        Token this_LPAREN_2=null;
        Token lv_name_3_0=null;
        Token this_COMA_4=null;
        Token this_ID_5=null;
        Token this_RPAREN_6=null;
        Token this_COMA_7=null;


        	enterRule();

        try {
            // InternalSQL.g:298:2: ( (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) (this_COMA_4= RULE_COMA this_ID_5= RULE_ID )* this_RPAREN_6= RULE_RPAREN (this_COMA_7= RULE_COMA )? ) )
            // InternalSQL.g:299:2: (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) (this_COMA_4= RULE_COMA this_ID_5= RULE_ID )* this_RPAREN_6= RULE_RPAREN (this_COMA_7= RULE_COMA )? )
            {
            // InternalSQL.g:299:2: (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) (this_COMA_4= RULE_COMA this_ID_5= RULE_ID )* this_RPAREN_6= RULE_RPAREN (this_COMA_7= RULE_COMA )? )
            // InternalSQL.g:300:3: this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) (this_COMA_4= RULE_COMA this_ID_5= RULE_ID )* this_RPAREN_6= RULE_RPAREN (this_COMA_7= RULE_COMA )?
            {
            this_PRIMARY_0=(Token)match(input,RULE_PRIMARY,FOLLOW_13); 

            			newLeafNode(this_PRIMARY_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0());
            		
            this_KEY_1=(Token)match(input,RULE_KEY,FOLLOW_6); 

            			newLeafNode(this_KEY_1, grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1());
            		
            this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_5); 

            			newLeafNode(this_LPAREN_2, grammarAccess.getPrimaryKeyAccess().getLPARENTerminalRuleCall_2());
            		
            // InternalSQL.g:312:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSQL.g:313:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSQL.g:313:4: (lv_name_3_0= RULE_ID )
            // InternalSQL.g:314:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.SQL.ID");
            				

            }


            }

            // InternalSQL.g:330:3: (this_COMA_4= RULE_COMA this_ID_5= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSQL.g:331:4: this_COMA_4= RULE_COMA this_ID_5= RULE_ID
            	    {
            	    this_COMA_4=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_4, grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_4_0());
            	    			
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				newLeafNode(this_ID_5, grammarAccess.getPrimaryKeyAccess().getIDTerminalRuleCall_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_RPAREN_6=(Token)match(input,RULE_RPAREN,FOLLOW_12); 

            			newLeafNode(this_RPAREN_6, grammarAccess.getPrimaryKeyAccess().getRPARENTerminalRuleCall_5());
            		
            // InternalSQL.g:344:3: (this_COMA_7= RULE_COMA )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMA) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQL.g:345:4: this_COMA_7= RULE_COMA
                    {
                    this_COMA_7=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_7, grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_6());
                    			

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
    // $ANTLR end "ruleprimaryKey"


    // $ANTLR start "entryRuleforeignKey"
    // InternalSQL.g:354:1: entryRuleforeignKey returns [EObject current=null] : iv_ruleforeignKey= ruleforeignKey EOF ;
    public final EObject entryRuleforeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleforeignKey = null;


        try {
            // InternalSQL.g:354:51: (iv_ruleforeignKey= ruleforeignKey EOF )
            // InternalSQL.g:355:2: iv_ruleforeignKey= ruleforeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleforeignKey=ruleforeignKey();

            state._fsp--;

             current =iv_ruleforeignKey; 
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
    // $ANTLR end "entryRuleforeignKey"


    // $ANTLR start "ruleforeignKey"
    // InternalSQL.g:361:1: ruleforeignKey returns [EObject current=null] : (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN this_REFERENCES_5= RULE_REFERENCES ( (otherlv_6= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (otherlv_8= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN (this_COMA_10= RULE_COMA )? ) ;
    public final EObject ruleforeignKey() throws RecognitionException {
        EObject current = null;

        Token this_FOREIGN_0=null;
        Token this_KEY_1=null;
        Token this_LPAREN_2=null;
        Token lv_name_3_0=null;
        Token this_RPAREN_4=null;
        Token this_REFERENCES_5=null;
        Token otherlv_6=null;
        Token this_LPAREN_7=null;
        Token otherlv_8=null;
        Token this_RPAREN_9=null;
        Token this_COMA_10=null;


        	enterRule();

        try {
            // InternalSQL.g:367:2: ( (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN this_REFERENCES_5= RULE_REFERENCES ( (otherlv_6= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (otherlv_8= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN (this_COMA_10= RULE_COMA )? ) )
            // InternalSQL.g:368:2: (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN this_REFERENCES_5= RULE_REFERENCES ( (otherlv_6= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (otherlv_8= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN (this_COMA_10= RULE_COMA )? )
            {
            // InternalSQL.g:368:2: (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN this_REFERENCES_5= RULE_REFERENCES ( (otherlv_6= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (otherlv_8= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN (this_COMA_10= RULE_COMA )? )
            // InternalSQL.g:369:3: this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPAREN_2= RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN this_REFERENCES_5= RULE_REFERENCES ( (otherlv_6= RULE_ID ) ) this_LPAREN_7= RULE_LPAREN ( (otherlv_8= RULE_ID ) ) this_RPAREN_9= RULE_RPAREN (this_COMA_10= RULE_COMA )?
            {
            this_FOREIGN_0=(Token)match(input,RULE_FOREIGN,FOLLOW_13); 

            			newLeafNode(this_FOREIGN_0, grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0());
            		
            this_KEY_1=(Token)match(input,RULE_KEY,FOLLOW_6); 

            			newLeafNode(this_KEY_1, grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1());
            		
            this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_5); 

            			newLeafNode(this_LPAREN_2, grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_2());
            		
            // InternalSQL.g:381:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSQL.g:382:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSQL.g:382:4: (lv_name_3_0= RULE_ID )
            // InternalSQL.g:383:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_3_0, grammarAccess.getForeignKeyAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.SQL.ID");
            				

            }


            }

            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_16); 

            			newLeafNode(this_RPAREN_4, grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_4());
            		
            this_REFERENCES_5=(Token)match(input,RULE_REFERENCES,FOLLOW_5); 

            			newLeafNode(this_REFERENCES_5, grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_5());
            		
            // InternalSQL.g:407:3: ( (otherlv_6= RULE_ID ) )
            // InternalSQL.g:408:4: (otherlv_6= RULE_ID )
            {
            // InternalSQL.g:408:4: (otherlv_6= RULE_ID )
            // InternalSQL.g:409:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getReftableTableCrossReference_6_0());
            				

            }


            }

            this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_5); 

            			newLeafNode(this_LPAREN_7, grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_7());
            		
            // InternalSQL.g:424:3: ( (otherlv_8= RULE_ID ) )
            // InternalSQL.g:425:4: (otherlv_8= RULE_ID )
            {
            // InternalSQL.g:425:4: (otherlv_8= RULE_ID )
            // InternalSQL.g:426:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getRefColumnCrossReference_8_0());
            				

            }


            }

            this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_12); 

            			newLeafNode(this_RPAREN_9, grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_9());
            		
            // InternalSQL.g:441:3: (this_COMA_10= RULE_COMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSQL.g:442:4: this_COMA_10= RULE_COMA
                    {
                    this_COMA_10=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_10, grammarAccess.getForeignKeyAccess().getCOMATerminalRuleCall_10());
                    			

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
    // $ANTLR end "ruleforeignKey"


    // $ANTLR start "ruleDataType"
    // InternalSQL.g:451:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'varchar' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'character' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'date' ) | (enumLiteral_6= 'time' ) | (enumLiteral_7= 'float' ) | (enumLiteral_8= 'decimal' ) | (enumLiteral_9= 'numeric' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalSQL.g:457:2: ( ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'varchar' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'character' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'date' ) | (enumLiteral_6= 'time' ) | (enumLiteral_7= 'float' ) | (enumLiteral_8= 'decimal' ) | (enumLiteral_9= 'numeric' ) ) )
            // InternalSQL.g:458:2: ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'varchar' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'character' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'date' ) | (enumLiteral_6= 'time' ) | (enumLiteral_7= 'float' ) | (enumLiteral_8= 'decimal' ) | (enumLiteral_9= 'numeric' ) )
            {
            // InternalSQL.g:458:2: ( (enumLiteral_0= 'varchar(255)' ) | (enumLiteral_1= 'varchar' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'character' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'date' ) | (enumLiteral_6= 'time' ) | (enumLiteral_7= 'float' ) | (enumLiteral_8= 'decimal' ) | (enumLiteral_9= 'numeric' ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            case 26:
                {
                alt10=5;
                }
                break;
            case 27:
                {
                alt10=6;
                }
                break;
            case 28:
                {
                alt10=7;
                }
                break;
            case 29:
                {
                alt10=8;
                }
                break;
            case 30:
                {
                alt10=9;
                }
                break;
            case 31:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSQL.g:459:3: (enumLiteral_0= 'varchar(255)' )
                    {
                    // InternalSQL.g:459:3: (enumLiteral_0= 'varchar(255)' )
                    // InternalSQL.g:460:4: enumLiteral_0= 'varchar(255)'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:467:3: (enumLiteral_1= 'varchar' )
                    {
                    // InternalSQL.g:467:3: (enumLiteral_1= 'varchar' )
                    // InternalSQL.g:468:4: enumLiteral_1= 'varchar'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getVARCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getVARCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:475:3: (enumLiteral_2= 'int' )
                    {
                    // InternalSQL.g:475:3: (enumLiteral_2= 'int' )
                    // InternalSQL.g:476:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:483:3: (enumLiteral_3= 'character' )
                    {
                    // InternalSQL.g:483:3: (enumLiteral_3= 'character' )
                    // InternalSQL.g:484:4: enumLiteral_3= 'character'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:491:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalSQL.g:491:3: (enumLiteral_4= 'boolean' )
                    // InternalSQL.g:492:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSQL.g:499:3: (enumLiteral_5= 'date' )
                    {
                    // InternalSQL.g:499:3: (enumLiteral_5= 'date' )
                    // InternalSQL.g:500:4: enumLiteral_5= 'date'
                    {
                    enumLiteral_5=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSQL.g:507:3: (enumLiteral_6= 'time' )
                    {
                    // InternalSQL.g:507:3: (enumLiteral_6= 'time' )
                    // InternalSQL.g:508:4: enumLiteral_6= 'time'
                    {
                    enumLiteral_6=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSQL.g:515:3: (enumLiteral_7= 'float' )
                    {
                    // InternalSQL.g:515:3: (enumLiteral_7= 'float' )
                    // InternalSQL.g:516:4: enumLiteral_7= 'float'
                    {
                    enumLiteral_7=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSQL.g:523:3: (enumLiteral_8= 'decimal' )
                    {
                    // InternalSQL.g:523:3: (enumLiteral_8= 'decimal' )
                    // InternalSQL.g:524:4: enumLiteral_8= 'decimal'
                    {
                    enumLiteral_8=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDECIMALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDECIMALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSQL.g:531:3: (enumLiteral_9= 'numeric' )
                    {
                    // InternalSQL.g:531:3: (enumLiteral_9= 'numeric' )
                    // InternalSQL.g:532:4: enumLiteral_9= 'numeric'
                    {
                    enumLiteral_9=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_9());
                    			

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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000FFC00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000E02L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});

}