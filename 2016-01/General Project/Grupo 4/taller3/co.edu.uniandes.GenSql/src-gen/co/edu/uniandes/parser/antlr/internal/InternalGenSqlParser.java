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
import co.edu.uniandes.services.GenSqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATE", "RULE_CTABLE", "RULE_ID", "RULE_LPARENT", "RULE_RPARENT", "RULE_SEMICOLON", "RULE_FIN", "RULE_TIPO", "RULE_LONGITUD", "RULE_NOT", "RULE_NULL", "RULE_COMMA", "RULE_PRIMARY", "RULE_KEY", "RULE_FOREIGN", "RULE_REFERENCES", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_CTABLE=5;
    public static final int RULE_KEY=17;
    public static final int RULE_STRING=22;
    public static final int RULE_NOT=13;
    public static final int RULE_NULL=14;
    public static final int RULE_LONGITUD=12;
    public static final int RULE_LPARENT=7;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_CREATE=4;
    public static final int RULE_FIN=10;
    public static final int RULE_RPARENT=8;
    public static final int EOF=-1;
    public static final int RULE_REFERENCES=19;
    public static final int RULE_ID=6;
    public static final int RULE_COMMA=15;
    public static final int RULE_WS=25;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_NUMBER=20;
    public static final int RULE_PRIMARY=16;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SEMICOLON=9;
    public static final int RULE_FOREIGN=18;
    public static final int RULE_TIPO=11;

    // delegates
    // delegators


        public InternalGenSqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenSqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenSqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenSql.g"; }



     	private GenSqlGrammarAccess grammarAccess;

        public InternalGenSqlParser(TokenStream input, GenSqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataBase";
       	}

       	@Override
       	protected GenSqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataBase"
    // InternalGenSql.g:64:1: entryRuleDataBase returns [EObject current=null] : iv_ruleDataBase= ruleDataBase EOF ;
    public final EObject entryRuleDataBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataBase = null;


        try {
            // InternalGenSql.g:64:49: (iv_ruleDataBase= ruleDataBase EOF )
            // InternalGenSql.g:65:2: iv_ruleDataBase= ruleDataBase EOF
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
    // InternalGenSql.g:71:1: ruleDataBase returns [EObject current=null] : ( () ( (lv_tables_1_0= ruleTable ) )+ ) ;
    public final EObject ruleDataBase() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_1_0 = null;



        	enterRule();

        try {
            // InternalGenSql.g:77:2: ( ( () ( (lv_tables_1_0= ruleTable ) )+ ) )
            // InternalGenSql.g:78:2: ( () ( (lv_tables_1_0= ruleTable ) )+ )
            {
            // InternalGenSql.g:78:2: ( () ( (lv_tables_1_0= ruleTable ) )+ )
            // InternalGenSql.g:79:3: () ( (lv_tables_1_0= ruleTable ) )+
            {
            // InternalGenSql.g:79:3: ()
            // InternalGenSql.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataBaseAccess().getDataBaseAction_0(),
            					current);
            			

            }

            // InternalGenSql.g:86:3: ( (lv_tables_1_0= ruleTable ) )+
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
            	    // InternalGenSql.g:87:4: (lv_tables_1_0= ruleTable )
            	    {
            	    // InternalGenSql.g:87:4: (lv_tables_1_0= ruleTable )
            	    // InternalGenSql.g:88:5: lv_tables_1_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tables_1_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataBaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_1_0,
            	    						"co.edu.uniandes.GenSql.Table");
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
    // InternalGenSql.g:109:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalGenSql.g:109:46: (iv_ruleTable= ruleTable EOF )
            // InternalGenSql.g:110:2: iv_ruleTable= ruleTable EOF
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
    // InternalGenSql.g:116:1: ruleTable returns [EObject current=null] : (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_columns_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkeys_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT (this_SEMICOLON_8= RULE_SEMICOLON | this_FIN_9= RULE_FIN )? ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_CREATE_0=null;
        Token this_CTABLE_1=null;
        Token lv_name_2_0=null;
        Token this_LPARENT_3=null;
        Token this_RPARENT_7=null;
        Token this_SEMICOLON_8=null;
        Token this_FIN_9=null;
        EObject lv_columns_4_0 = null;

        EObject lv_primarykey_5_0 = null;

        EObject lv_foreignkeys_6_0 = null;



        	enterRule();

        try {
            // InternalGenSql.g:122:2: ( (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_columns_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkeys_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT (this_SEMICOLON_8= RULE_SEMICOLON | this_FIN_9= RULE_FIN )? ) )
            // InternalGenSql.g:123:2: (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_columns_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkeys_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT (this_SEMICOLON_8= RULE_SEMICOLON | this_FIN_9= RULE_FIN )? )
            {
            // InternalGenSql.g:123:2: (this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_columns_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkeys_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT (this_SEMICOLON_8= RULE_SEMICOLON | this_FIN_9= RULE_FIN )? )
            // InternalGenSql.g:124:3: this_CREATE_0= RULE_CREATE this_CTABLE_1= RULE_CTABLE ( (lv_name_2_0= RULE_ID ) ) this_LPARENT_3= RULE_LPARENT ( (lv_columns_4_0= ruleColumn ) )+ ( (lv_primarykey_5_0= rulePrimaryKey ) ) ( (lv_foreignkeys_6_0= ruleForeignKey ) )* this_RPARENT_7= RULE_RPARENT (this_SEMICOLON_8= RULE_SEMICOLON | this_FIN_9= RULE_FIN )?
            {
            this_CREATE_0=(Token)match(input,RULE_CREATE,FOLLOW_4); 

            			newLeafNode(this_CREATE_0, grammarAccess.getTableAccess().getCREATETerminalRuleCall_0());
            		
            this_CTABLE_1=(Token)match(input,RULE_CTABLE,FOLLOW_5); 

            			newLeafNode(this_CTABLE_1, grammarAccess.getTableAccess().getCTABLETerminalRuleCall_1());
            		
            // InternalGenSql.g:132:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGenSql.g:133:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGenSql.g:133:4: (lv_name_2_0= RULE_ID )
            // InternalGenSql.g:134:5: lv_name_2_0= RULE_ID
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
            						"co.edu.uniandes.GenSql.ID");
            				

            }


            }

            this_LPARENT_3=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_3, grammarAccess.getTableAccess().getLPARENTTerminalRuleCall_3());
            		
            // InternalGenSql.g:154:3: ( (lv_columns_4_0= ruleColumn ) )+
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
            	    // InternalGenSql.g:155:4: (lv_columns_4_0= ruleColumn )
            	    {
            	    // InternalGenSql.g:155:4: (lv_columns_4_0= ruleColumn )
            	    // InternalGenSql.g:156:5: lv_columns_4_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_columns_4_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_4_0,
            	    						"co.edu.uniandes.GenSql.Column");
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

            // InternalGenSql.g:173:3: ( (lv_primarykey_5_0= rulePrimaryKey ) )
            // InternalGenSql.g:174:4: (lv_primarykey_5_0= rulePrimaryKey )
            {
            // InternalGenSql.g:174:4: (lv_primarykey_5_0= rulePrimaryKey )
            // InternalGenSql.g:175:5: lv_primarykey_5_0= rulePrimaryKey
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
            						"co.edu.uniandes.GenSql.PrimaryKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenSql.g:192:3: ( (lv_foreignkeys_6_0= ruleForeignKey ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_FOREIGN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGenSql.g:193:4: (lv_foreignkeys_6_0= ruleForeignKey )
            	    {
            	    // InternalGenSql.g:193:4: (lv_foreignkeys_6_0= ruleForeignKey )
            	    // InternalGenSql.g:194:5: lv_foreignkeys_6_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_foreignkeys_6_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foreignkeys",
            	    						lv_foreignkeys_6_0,
            	    						"co.edu.uniandes.GenSql.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RPARENT_7=(Token)match(input,RULE_RPARENT,FOLLOW_9); 

            			newLeafNode(this_RPARENT_7, grammarAccess.getTableAccess().getRPARENTTerminalRuleCall_7());
            		
            // InternalGenSql.g:215:3: (this_SEMICOLON_8= RULE_SEMICOLON | this_FIN_9= RULE_FIN )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SEMICOLON) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_FIN) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenSql.g:216:4: this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGenSql.g:221:4: this_FIN_9= RULE_FIN
                    {
                    this_FIN_9=(Token)match(input,RULE_FIN,FOLLOW_2); 

                    				newLeafNode(this_FIN_9, grammarAccess.getTableAccess().getFINTerminalRuleCall_8_1());
                    			

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


    // $ANTLR start "entryRuleColumn"
    // InternalGenSql.g:230:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalGenSql.g:230:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalGenSql.g:231:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalGenSql.g:237:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_SQLType_1_0= RULE_TIPO ) )? ( (lv_Longitud_2_0= RULE_LONGITUD ) )? (this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL )? (this_COMMA_5= RULE_COMMA )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_SQLType_1_0=null;
        Token lv_Longitud_2_0=null;
        Token this_NOT_3=null;
        Token this_NULL_4=null;
        Token this_COMMA_5=null;


        	enterRule();

        try {
            // InternalGenSql.g:243:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_SQLType_1_0= RULE_TIPO ) )? ( (lv_Longitud_2_0= RULE_LONGITUD ) )? (this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL )? (this_COMMA_5= RULE_COMMA )? ) )
            // InternalGenSql.g:244:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_SQLType_1_0= RULE_TIPO ) )? ( (lv_Longitud_2_0= RULE_LONGITUD ) )? (this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL )? (this_COMMA_5= RULE_COMMA )? )
            {
            // InternalGenSql.g:244:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_SQLType_1_0= RULE_TIPO ) )? ( (lv_Longitud_2_0= RULE_LONGITUD ) )? (this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL )? (this_COMMA_5= RULE_COMMA )? )
            // InternalGenSql.g:245:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_SQLType_1_0= RULE_TIPO ) )? ( (lv_Longitud_2_0= RULE_LONGITUD ) )? (this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL )? (this_COMMA_5= RULE_COMMA )?
            {
            // InternalGenSql.g:245:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGenSql.g:246:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGenSql.g:246:4: (lv_name_0_0= RULE_ID )
            // InternalGenSql.g:247:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"co.edu.uniandes.GenSql.ID");
            				

            }


            }

            // InternalGenSql.g:263:3: ( (lv_SQLType_1_0= RULE_TIPO ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_TIPO) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenSql.g:264:4: (lv_SQLType_1_0= RULE_TIPO )
                    {
                    // InternalGenSql.g:264:4: (lv_SQLType_1_0= RULE_TIPO )
                    // InternalGenSql.g:265:5: lv_SQLType_1_0= RULE_TIPO
                    {
                    lv_SQLType_1_0=(Token)match(input,RULE_TIPO,FOLLOW_11); 

                    					newLeafNode(lv_SQLType_1_0, grammarAccess.getColumnAccess().getSQLTypeTIPOTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"SQLType",
                    						lv_SQLType_1_0,
                    						"co.edu.uniandes.GenSql.TIPO");
                    				

                    }


                    }
                    break;

            }

            // InternalGenSql.g:281:3: ( (lv_Longitud_2_0= RULE_LONGITUD ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LONGITUD) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenSql.g:282:4: (lv_Longitud_2_0= RULE_LONGITUD )
                    {
                    // InternalGenSql.g:282:4: (lv_Longitud_2_0= RULE_LONGITUD )
                    // InternalGenSql.g:283:5: lv_Longitud_2_0= RULE_LONGITUD
                    {
                    lv_Longitud_2_0=(Token)match(input,RULE_LONGITUD,FOLLOW_12); 

                    					newLeafNode(lv_Longitud_2_0, grammarAccess.getColumnAccess().getLongitudLONGITUDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"Longitud",
                    						lv_Longitud_2_0,
                    						"co.edu.uniandes.GenSql.LONGITUD");
                    				

                    }


                    }
                    break;

            }

            // InternalGenSql.g:299:3: (this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NOT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenSql.g:300:4: this_NOT_3= RULE_NOT this_NULL_4= RULE_NULL
                    {
                    this_NOT_3=(Token)match(input,RULE_NOT,FOLLOW_13); 

                    				newLeafNode(this_NOT_3, grammarAccess.getColumnAccess().getNOTTerminalRuleCall_3_0());
                    			
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_14); 

                    				newLeafNode(this_NULL_4, grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }

            // InternalGenSql.g:309:3: (this_COMMA_5= RULE_COMMA )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMMA) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGenSql.g:310:4: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_2); 

                    				newLeafNode(this_COMMA_5, grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_4());
                    			

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
    // InternalGenSql.g:319:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalGenSql.g:319:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalGenSql.g:320:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalGenSql.g:326:1: rulePrimaryKey returns [EObject current=null] : (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? ) ;
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
            // InternalGenSql.g:332:2: ( (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? ) )
            // InternalGenSql.g:333:2: (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? )
            {
            // InternalGenSql.g:333:2: (this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )? )
            // InternalGenSql.g:334:3: this_PRIMARY_0= RULE_PRIMARY this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT (this_COMMA_7= RULE_COMMA )?
            {
            this_PRIMARY_0=(Token)match(input,RULE_PRIMARY,FOLLOW_15); 

            			newLeafNode(this_PRIMARY_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0());
            		
            this_KEY_1=(Token)match(input,RULE_KEY,FOLLOW_6); 

            			newLeafNode(this_KEY_1, grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1());
            		
            this_LPARENT_2=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_2, grammarAccess.getPrimaryKeyAccess().getLPARENTTerminalRuleCall_2());
            		
            // InternalGenSql.g:346:3: ( (otherlv_3= RULE_ID ) )
            // InternalGenSql.g:347:4: (otherlv_3= RULE_ID )
            {
            // InternalGenSql.g:347:4: (otherlv_3= RULE_ID )
            // InternalGenSql.g:348:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_3_0());
            				

            }


            }

            // InternalGenSql.g:359:3: ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGenSql.g:360:4: (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalGenSql.g:360:4: (this_COMMA_4= RULE_COMMA )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_COMMA) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalGenSql.g:361:5: this_COMMA_4= RULE_COMMA
            	    	    {
            	    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            	    	    					newLeafNode(this_COMMA_4, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	    // InternalGenSql.g:366:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalGenSql.g:367:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGenSql.g:367:5: (otherlv_5= RULE_ID )
            	    // InternalGenSql.g:368:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnsColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_RPARENT_6=(Token)match(input,RULE_RPARENT,FOLLOW_14); 

            			newLeafNode(this_RPARENT_6, grammarAccess.getPrimaryKeyAccess().getRPARENTTerminalRuleCall_5());
            		
            // InternalGenSql.g:384:3: (this_COMMA_7= RULE_COMMA )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMA) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGenSql.g:385:4: this_COMMA_7= RULE_COMMA
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
    // InternalGenSql.g:394:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalGenSql.g:394:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalGenSql.g:395:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalGenSql.g:401:1: ruleForeignKey returns [EObject current=null] : (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? ) ;
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
            // InternalGenSql.g:407:2: ( (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? ) )
            // InternalGenSql.g:408:2: (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? )
            {
            // InternalGenSql.g:408:2: (this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )? )
            // InternalGenSql.g:409:3: this_FOREIGN_0= RULE_FOREIGN this_KEY_1= RULE_KEY this_LPARENT_2= RULE_LPARENT ( (otherlv_3= RULE_ID ) ) ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )* this_RPARENT_6= RULE_RPARENT this_REFERENCES_7= RULE_REFERENCES ( (otherlv_8= RULE_ID ) ) this_LPARENT_9= RULE_LPARENT ( (otherlv_10= RULE_ID ) ) ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )* this_RPARENT_13= RULE_RPARENT (this_COMMA_14= RULE_COMMA )?
            {
            this_FOREIGN_0=(Token)match(input,RULE_FOREIGN,FOLLOW_15); 

            			newLeafNode(this_FOREIGN_0, grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0());
            		
            this_KEY_1=(Token)match(input,RULE_KEY,FOLLOW_6); 

            			newLeafNode(this_KEY_1, grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1());
            		
            this_LPARENT_2=(Token)match(input,RULE_LPARENT,FOLLOW_5); 

            			newLeafNode(this_LPARENT_2, grammarAccess.getForeignKeyAccess().getLPARENTTerminalRuleCall_2());
            		
            // InternalGenSql.g:421:3: ( (otherlv_3= RULE_ID ) )
            // InternalGenSql.g:422:4: (otherlv_3= RULE_ID )
            {
            // InternalGenSql.g:422:4: (otherlv_3= RULE_ID )
            // InternalGenSql.g:423:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_3_0());
            				

            }


            }

            // InternalGenSql.g:434:3: ( (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGenSql.g:435:4: (this_COMMA_4= RULE_COMMA )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalGenSql.g:435:4: (this_COMMA_4= RULE_COMMA )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==RULE_COMMA) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalGenSql.g:436:5: this_COMMA_4= RULE_COMMA
            	    	    {
            	    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            	    	    					newLeafNode(this_COMMA_4, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);

            	    // InternalGenSql.g:441:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalGenSql.g:442:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGenSql.g:442:5: (otherlv_5= RULE_ID )
            	    // InternalGenSql.g:443:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnsColumnCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_RPARENT_6=(Token)match(input,RULE_RPARENT,FOLLOW_18); 

            			newLeafNode(this_RPARENT_6, grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_5());
            		
            this_REFERENCES_7=(Token)match(input,RULE_REFERENCES,FOLLOW_5); 

            			newLeafNode(this_REFERENCES_7, grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_6());
            		
            // InternalGenSql.g:463:3: ( (otherlv_8= RULE_ID ) )
            // InternalGenSql.g:464:4: (otherlv_8= RULE_ID )
            {
            // InternalGenSql.g:464:4: (otherlv_8= RULE_ID )
            // InternalGenSql.g:465:5: otherlv_8= RULE_ID
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
            		
            // InternalGenSql.g:480:3: ( (otherlv_10= RULE_ID ) )
            // InternalGenSql.g:481:4: (otherlv_10= RULE_ID )
            {
            // InternalGenSql.g:481:4: (otherlv_10= RULE_ID )
            // InternalGenSql.g:482:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getColumnsRefColumnCrossReference_9_0());
            				

            }


            }

            // InternalGenSql.g:493:3: ( (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGenSql.g:494:4: (this_COMMA_11= RULE_COMMA )+ ( (otherlv_12= RULE_ID ) )
            	    {
            	    // InternalGenSql.g:494:4: (this_COMMA_11= RULE_COMMA )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_COMMA) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalGenSql.g:495:5: this_COMMA_11= RULE_COMMA
            	    	    {
            	    	    this_COMMA_11=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            	    	    					newLeafNode(this_COMMA_11, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	    // InternalGenSql.g:500:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalGenSql.g:501:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalGenSql.g:501:5: (otherlv_12= RULE_ID )
            	    // InternalGenSql.g:502:6: otherlv_12= RULE_ID
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
            	    break loop15;
                }
            } while (true);

            this_RPARENT_13=(Token)match(input,RULE_RPARENT,FOLLOW_14); 

            			newLeafNode(this_RPARENT_13, grammarAccess.getForeignKeyAccess().getRPARENTTerminalRuleCall_11());
            		
            // InternalGenSql.g:518:3: (this_COMMA_14= RULE_COMMA )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMA) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGenSql.g:519:4: this_COMMA_14= RULE_COMMA
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000B802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000B002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});

}