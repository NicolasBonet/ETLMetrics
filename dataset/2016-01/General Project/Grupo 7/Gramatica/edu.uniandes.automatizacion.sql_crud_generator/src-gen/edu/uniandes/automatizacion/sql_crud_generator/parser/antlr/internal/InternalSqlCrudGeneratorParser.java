package edu.uniandes.automatizacion.sql_crud_generator.parser.antlr.internal;

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
import edu.uniandes.automatizacion.sql_crud_generator.services.SqlCrudGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlCrudGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WCREATE", "RULE_WNEW", "RULE_WSCHEMA", "RULE_ID", "RULE_SEMICOLON", "RULE_WTABLE", "RULE_PARENTHESIS_IZQ", "RULE_PARENTHESIS_DER", "RULE_WNOT", "RULE_WNULL", "RULE_COMA", "RULE_WPRIMARY_KEY", "RULE_WFOREIGN_KEY", "RULE_WREFERENCES", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CHARACTER'", "'VARCHAR'", "'VARYING'", "'BOOLEAN'", "'VARBINARY'", "'BINARY'", "'INTEGER'", "'SMALLINT'", "'INT'", "'BIGINT'", "'DECIMAL'", "'NUMERIC'", "'FLOAT'", "'REAL'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'INTERVAL'", "'ARRAY'", "'MULTISET'", "'XML'", "'character'", "'varchar'", "'varying'", "'boolean'", "'varbinary'", "'binary'", "'integer'", "'smallint'", "'int'", "'bigint'", "'decimal'", "'numeric'", "'float'", "'real'", "'date'", "'time'", "'timestamp'", "'interval'", "'array'", "'multiset'", "'xml'"
    };
    public static final int T__50=50;
    public static final int RULE_WNEW=5;
    public static final int RULE_WREFERENCES=17;
    public static final int RULE_WCREATE=4;
    public static final int RULE_WTABLE=9;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_WSCHEMA=6;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int RULE_PARENTHESIS_DER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int RULE_WFOREIGN_KEY=16;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=8;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMA=14;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=21;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=22;
    public static final int RULE_WNULL=13;
    public static final int RULE_ANY_OTHER=23;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_WNOT=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_WPRIMARY_KEY=15;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_PARENTHESIS_IZQ=10;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSqlCrudGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlCrudGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlCrudGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSqlCrudGenerator.g"; }



     	private SqlCrudGeneratorGrammarAccess grammarAccess;

        public InternalSqlCrudGeneratorParser(TokenStream input, SqlCrudGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schema";
       	}

       	@Override
       	protected SqlCrudGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchema"
    // InternalSqlCrudGenerator.g:65:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalSqlCrudGenerator.g:65:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalSqlCrudGenerator.g:66:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalSqlCrudGenerator.g:72:1: ruleSchema returns [EObject current=null] : (this_WCREATE_0= RULE_WCREATE this_WNEW_1= RULE_WNEW this_WSCHEMA_2= RULE_WSCHEMA ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_tables_5_0= ruleTable ) )* ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token this_WCREATE_0=null;
        Token this_WNEW_1=null;
        Token this_WSCHEMA_2=null;
        Token lv_name_3_0=null;
        Token this_SEMICOLON_4=null;
        EObject lv_tables_5_0 = null;



        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:78:2: ( (this_WCREATE_0= RULE_WCREATE this_WNEW_1= RULE_WNEW this_WSCHEMA_2= RULE_WSCHEMA ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_tables_5_0= ruleTable ) )* ) )
            // InternalSqlCrudGenerator.g:79:2: (this_WCREATE_0= RULE_WCREATE this_WNEW_1= RULE_WNEW this_WSCHEMA_2= RULE_WSCHEMA ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_tables_5_0= ruleTable ) )* )
            {
            // InternalSqlCrudGenerator.g:79:2: (this_WCREATE_0= RULE_WCREATE this_WNEW_1= RULE_WNEW this_WSCHEMA_2= RULE_WSCHEMA ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_tables_5_0= ruleTable ) )* )
            // InternalSqlCrudGenerator.g:80:3: this_WCREATE_0= RULE_WCREATE this_WNEW_1= RULE_WNEW this_WSCHEMA_2= RULE_WSCHEMA ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_tables_5_0= ruleTable ) )*
            {
            this_WCREATE_0=(Token)match(input,RULE_WCREATE,FOLLOW_3); 

            			newLeafNode(this_WCREATE_0, grammarAccess.getSchemaAccess().getWCREATETerminalRuleCall_0());
            		
            this_WNEW_1=(Token)match(input,RULE_WNEW,FOLLOW_4); 

            			newLeafNode(this_WNEW_1, grammarAccess.getSchemaAccess().getWNEWTerminalRuleCall_1());
            		
            this_WSCHEMA_2=(Token)match(input,RULE_WSCHEMA,FOLLOW_5); 

            			newLeafNode(this_WSCHEMA_2, grammarAccess.getSchemaAccess().getWSCHEMATerminalRuleCall_2());
            		
            // InternalSqlCrudGenerator.g:92:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSqlCrudGenerator.g:93:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:93:4: (lv_name_3_0= RULE_ID )
            // InternalSqlCrudGenerator.g:94:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getSchemaAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalSqlCrudGenerator.g:114:3: ( (lv_tables_5_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WCREATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSqlCrudGenerator.g:115:4: (lv_tables_5_0= ruleTable )
            	    {
            	    // InternalSqlCrudGenerator.g:115:4: (lv_tables_5_0= ruleTable )
            	    // InternalSqlCrudGenerator.g:116:5: lv_tables_5_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getTablesTableParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_tables_5_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_5_0,
            	    						"edu.uniandes.automatizacion.sql_crud_generator.SqlCrudGenerator.Table");
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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleTable"
    // InternalSqlCrudGenerator.g:137:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSqlCrudGenerator.g:137:46: (iv_ruleTable= ruleTable EOF )
            // InternalSqlCrudGenerator.g:138:2: iv_ruleTable= ruleTable EOF
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
    // InternalSqlCrudGenerator.g:144:1: ruleTable returns [EObject current=null] : (this_WCREATE_0= RULE_WCREATE this_WTABLE_1= RULE_WTABLE ( (lv_name_2_0= RULE_ID ) ) this_PARENTHESIS_IZQ_3= RULE_PARENTHESIS_IZQ ( (lv_columns_4_0= ruleColumn ) )* ( (lv_primaryKey_5_0= rulePrimaryKey ) )? ( (lv_foreignsKeys_6_0= ruleForeignKey ) )* this_PARENTHESIS_DER_7= RULE_PARENTHESIS_DER ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_WCREATE_0=null;
        Token this_WTABLE_1=null;
        Token lv_name_2_0=null;
        Token this_PARENTHESIS_IZQ_3=null;
        Token this_PARENTHESIS_DER_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_primaryKey_5_0 = null;

        EObject lv_foreignsKeys_6_0 = null;



        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:150:2: ( (this_WCREATE_0= RULE_WCREATE this_WTABLE_1= RULE_WTABLE ( (lv_name_2_0= RULE_ID ) ) this_PARENTHESIS_IZQ_3= RULE_PARENTHESIS_IZQ ( (lv_columns_4_0= ruleColumn ) )* ( (lv_primaryKey_5_0= rulePrimaryKey ) )? ( (lv_foreignsKeys_6_0= ruleForeignKey ) )* this_PARENTHESIS_DER_7= RULE_PARENTHESIS_DER ) )
            // InternalSqlCrudGenerator.g:151:2: (this_WCREATE_0= RULE_WCREATE this_WTABLE_1= RULE_WTABLE ( (lv_name_2_0= RULE_ID ) ) this_PARENTHESIS_IZQ_3= RULE_PARENTHESIS_IZQ ( (lv_columns_4_0= ruleColumn ) )* ( (lv_primaryKey_5_0= rulePrimaryKey ) )? ( (lv_foreignsKeys_6_0= ruleForeignKey ) )* this_PARENTHESIS_DER_7= RULE_PARENTHESIS_DER )
            {
            // InternalSqlCrudGenerator.g:151:2: (this_WCREATE_0= RULE_WCREATE this_WTABLE_1= RULE_WTABLE ( (lv_name_2_0= RULE_ID ) ) this_PARENTHESIS_IZQ_3= RULE_PARENTHESIS_IZQ ( (lv_columns_4_0= ruleColumn ) )* ( (lv_primaryKey_5_0= rulePrimaryKey ) )? ( (lv_foreignsKeys_6_0= ruleForeignKey ) )* this_PARENTHESIS_DER_7= RULE_PARENTHESIS_DER )
            // InternalSqlCrudGenerator.g:152:3: this_WCREATE_0= RULE_WCREATE this_WTABLE_1= RULE_WTABLE ( (lv_name_2_0= RULE_ID ) ) this_PARENTHESIS_IZQ_3= RULE_PARENTHESIS_IZQ ( (lv_columns_4_0= ruleColumn ) )* ( (lv_primaryKey_5_0= rulePrimaryKey ) )? ( (lv_foreignsKeys_6_0= ruleForeignKey ) )* this_PARENTHESIS_DER_7= RULE_PARENTHESIS_DER
            {
            this_WCREATE_0=(Token)match(input,RULE_WCREATE,FOLLOW_8); 

            			newLeafNode(this_WCREATE_0, grammarAccess.getTableAccess().getWCREATETerminalRuleCall_0());
            		
            this_WTABLE_1=(Token)match(input,RULE_WTABLE,FOLLOW_5); 

            			newLeafNode(this_WTABLE_1, grammarAccess.getTableAccess().getWTABLETerminalRuleCall_1());
            		
            // InternalSqlCrudGenerator.g:160:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSqlCrudGenerator.g:161:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:161:4: (lv_name_2_0= RULE_ID )
            // InternalSqlCrudGenerator.g:162:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            this_PARENTHESIS_IZQ_3=(Token)match(input,RULE_PARENTHESIS_IZQ,FOLLOW_10); 

            			newLeafNode(this_PARENTHESIS_IZQ_3, grammarAccess.getTableAccess().getPARENTHESIS_IZQTerminalRuleCall_3());
            		
            // InternalSqlCrudGenerator.g:182:3: ( (lv_columns_4_0= ruleColumn ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSqlCrudGenerator.g:183:4: (lv_columns_4_0= ruleColumn )
            	    {
            	    // InternalSqlCrudGenerator.g:183:4: (lv_columns_4_0= ruleColumn )
            	    // InternalSqlCrudGenerator.g:184:5: lv_columns_4_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_columns_4_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_4_0,
            	    						"edu.uniandes.automatizacion.sql_crud_generator.SqlCrudGenerator.Column");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSqlCrudGenerator.g:201:3: ( (lv_primaryKey_5_0= rulePrimaryKey ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_WPRIMARY_KEY) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSqlCrudGenerator.g:202:4: (lv_primaryKey_5_0= rulePrimaryKey )
                    {
                    // InternalSqlCrudGenerator.g:202:4: (lv_primaryKey_5_0= rulePrimaryKey )
                    // InternalSqlCrudGenerator.g:203:5: lv_primaryKey_5_0= rulePrimaryKey
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_primaryKey_5_0=rulePrimaryKey();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"primaryKey",
                    						lv_primaryKey_5_0,
                    						"edu.uniandes.automatizacion.sql_crud_generator.SqlCrudGenerator.PrimaryKey");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSqlCrudGenerator.g:220:3: ( (lv_foreignsKeys_6_0= ruleForeignKey ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WFOREIGN_KEY) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSqlCrudGenerator.g:221:4: (lv_foreignsKeys_6_0= ruleForeignKey )
            	    {
            	    // InternalSqlCrudGenerator.g:221:4: (lv_foreignsKeys_6_0= ruleForeignKey )
            	    // InternalSqlCrudGenerator.g:222:5: lv_foreignsKeys_6_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getForeignsKeysForeignKeyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_foreignsKeys_6_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foreignsKeys",
            	    						lv_foreignsKeys_6_0,
            	    						"edu.uniandes.automatizacion.sql_crud_generator.SqlCrudGenerator.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_PARENTHESIS_DER_7=(Token)match(input,RULE_PARENTHESIS_DER,FOLLOW_2); 

            			newLeafNode(this_PARENTHESIS_DER_7, grammarAccess.getTableAccess().getPARENTHESIS_DERTerminalRuleCall_7());
            		

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
    // InternalSqlCrudGenerator.g:247:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSqlCrudGenerator.g:247:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSqlCrudGenerator.g:248:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSqlCrudGenerator.g:254:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) ) (this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL )? (this_COMA_4= RULE_COMA )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_WNOT_2=null;
        Token this_WNULL_3=null;
        Token this_COMA_4=null;
        EObject lv_dataType_1_0 = null;



        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:260:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) ) (this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL )? (this_COMA_4= RULE_COMA )? ) )
            // InternalSqlCrudGenerator.g:261:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) ) (this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL )? (this_COMA_4= RULE_COMA )? )
            {
            // InternalSqlCrudGenerator.g:261:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) ) (this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL )? (this_COMA_4= RULE_COMA )? )
            // InternalSqlCrudGenerator.g:262:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) ) (this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL )? (this_COMA_4= RULE_COMA )?
            {
            // InternalSqlCrudGenerator.g:262:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSqlCrudGenerator.g:263:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:263:4: (lv_name_0_0= RULE_ID )
            // InternalSqlCrudGenerator.g:264:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalSqlCrudGenerator.g:280:3: ( (lv_dataType_1_0= ruleDataType ) )
            // InternalSqlCrudGenerator.g:281:4: (lv_dataType_1_0= ruleDataType )
            {
            // InternalSqlCrudGenerator.g:281:4: (lv_dataType_1_0= ruleDataType )
            // InternalSqlCrudGenerator.g:282:5: lv_dataType_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getDataTypeDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_dataType_1_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_1_0,
            						"edu.uniandes.automatizacion.sql_crud_generator.SqlCrudGenerator.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlCrudGenerator.g:299:3: (this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WNOT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSqlCrudGenerator.g:300:4: this_WNOT_2= RULE_WNOT this_WNULL_3= RULE_WNULL
                    {
                    this_WNOT_2=(Token)match(input,RULE_WNOT,FOLLOW_14); 

                    				newLeafNode(this_WNOT_2, grammarAccess.getColumnAccess().getWNOTTerminalRuleCall_2_0());
                    			
                    this_WNULL_3=(Token)match(input,RULE_WNULL,FOLLOW_15); 

                    				newLeafNode(this_WNULL_3, grammarAccess.getColumnAccess().getWNULLTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalSqlCrudGenerator.g:309:3: (this_COMA_4= RULE_COMA )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSqlCrudGenerator.g:310:4: this_COMA_4= RULE_COMA
                    {
                    this_COMA_4=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_4, grammarAccess.getColumnAccess().getCOMATerminalRuleCall_3());
                    			

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
    // InternalSqlCrudGenerator.g:319:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSqlCrudGenerator.g:319:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSqlCrudGenerator.g:320:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalSqlCrudGenerator.g:326:1: rulePrimaryKey returns [EObject current=null] : (this_WPRIMARY_KEY_0= RULE_WPRIMARY_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) (this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) ) )* this_PARENTHESIS_DER_5= RULE_PARENTHESIS_DER (this_COMA_6= RULE_COMA )? ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token this_WPRIMARY_KEY_0=null;
        Token this_PARENTHESIS_IZQ_1=null;
        Token otherlv_2=null;
        Token this_COMA_3=null;
        Token otherlv_4=null;
        Token this_PARENTHESIS_DER_5=null;
        Token this_COMA_6=null;


        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:332:2: ( (this_WPRIMARY_KEY_0= RULE_WPRIMARY_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) (this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) ) )* this_PARENTHESIS_DER_5= RULE_PARENTHESIS_DER (this_COMA_6= RULE_COMA )? ) )
            // InternalSqlCrudGenerator.g:333:2: (this_WPRIMARY_KEY_0= RULE_WPRIMARY_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) (this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) ) )* this_PARENTHESIS_DER_5= RULE_PARENTHESIS_DER (this_COMA_6= RULE_COMA )? )
            {
            // InternalSqlCrudGenerator.g:333:2: (this_WPRIMARY_KEY_0= RULE_WPRIMARY_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) (this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) ) )* this_PARENTHESIS_DER_5= RULE_PARENTHESIS_DER (this_COMA_6= RULE_COMA )? )
            // InternalSqlCrudGenerator.g:334:3: this_WPRIMARY_KEY_0= RULE_WPRIMARY_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) (this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) ) )* this_PARENTHESIS_DER_5= RULE_PARENTHESIS_DER (this_COMA_6= RULE_COMA )?
            {
            this_WPRIMARY_KEY_0=(Token)match(input,RULE_WPRIMARY_KEY,FOLLOW_9); 

            			newLeafNode(this_WPRIMARY_KEY_0, grammarAccess.getPrimaryKeyAccess().getWPRIMARY_KEYTerminalRuleCall_0());
            		
            this_PARENTHESIS_IZQ_1=(Token)match(input,RULE_PARENTHESIS_IZQ,FOLLOW_5); 

            			newLeafNode(this_PARENTHESIS_IZQ_1, grammarAccess.getPrimaryKeyAccess().getPARENTHESIS_IZQTerminalRuleCall_1());
            		
            // InternalSqlCrudGenerator.g:342:3: ( (otherlv_2= RULE_ID ) )
            // InternalSqlCrudGenerator.g:343:4: (otherlv_2= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:343:4: (otherlv_2= RULE_ID )
            // InternalSqlCrudGenerator.g:344:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getIdsColumnCrossReference_2_0());
            				

            }


            }

            // InternalSqlCrudGenerator.g:355:3: (this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSqlCrudGenerator.g:356:4: this_COMA_3= RULE_COMA ( (otherlv_4= RULE_ID ) )
            	    {
            	    this_COMA_3=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_3, grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_3_0());
            	    			
            	    // InternalSqlCrudGenerator.g:360:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSqlCrudGenerator.g:361:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSqlCrudGenerator.g:361:5: (otherlv_4= RULE_ID )
            	    // InternalSqlCrudGenerator.g:362:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getIdsColumnCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_PARENTHESIS_DER_5=(Token)match(input,RULE_PARENTHESIS_DER,FOLLOW_15); 

            			newLeafNode(this_PARENTHESIS_DER_5, grammarAccess.getPrimaryKeyAccess().getPARENTHESIS_DERTerminalRuleCall_4());
            		
            // InternalSqlCrudGenerator.g:378:3: (this_COMA_6= RULE_COMA )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMA) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSqlCrudGenerator.g:379:4: this_COMA_6= RULE_COMA
                    {
                    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_6, grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_5());
                    			

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
    // InternalSqlCrudGenerator.g:388:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSqlCrudGenerator.g:388:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSqlCrudGenerator.g:389:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSqlCrudGenerator.g:395:1: ruleForeignKey returns [EObject current=null] : (this_WFOREIGN_KEY_0= RULE_WFOREIGN_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER this_WREFERENCES_4= RULE_WREFERENCES ( (otherlv_5= RULE_ID ) ) this_PARENTHESIS_IZQ_6= RULE_PARENTHESIS_IZQ ( (otherlv_7= RULE_ID ) ) this_PARENTHESIS_DER_8= RULE_PARENTHESIS_DER (this_COMA_9= RULE_COMA )? ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token this_WFOREIGN_KEY_0=null;
        Token this_PARENTHESIS_IZQ_1=null;
        Token otherlv_2=null;
        Token this_PARENTHESIS_DER_3=null;
        Token this_WREFERENCES_4=null;
        Token otherlv_5=null;
        Token this_PARENTHESIS_IZQ_6=null;
        Token otherlv_7=null;
        Token this_PARENTHESIS_DER_8=null;
        Token this_COMA_9=null;


        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:401:2: ( (this_WFOREIGN_KEY_0= RULE_WFOREIGN_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER this_WREFERENCES_4= RULE_WREFERENCES ( (otherlv_5= RULE_ID ) ) this_PARENTHESIS_IZQ_6= RULE_PARENTHESIS_IZQ ( (otherlv_7= RULE_ID ) ) this_PARENTHESIS_DER_8= RULE_PARENTHESIS_DER (this_COMA_9= RULE_COMA )? ) )
            // InternalSqlCrudGenerator.g:402:2: (this_WFOREIGN_KEY_0= RULE_WFOREIGN_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER this_WREFERENCES_4= RULE_WREFERENCES ( (otherlv_5= RULE_ID ) ) this_PARENTHESIS_IZQ_6= RULE_PARENTHESIS_IZQ ( (otherlv_7= RULE_ID ) ) this_PARENTHESIS_DER_8= RULE_PARENTHESIS_DER (this_COMA_9= RULE_COMA )? )
            {
            // InternalSqlCrudGenerator.g:402:2: (this_WFOREIGN_KEY_0= RULE_WFOREIGN_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER this_WREFERENCES_4= RULE_WREFERENCES ( (otherlv_5= RULE_ID ) ) this_PARENTHESIS_IZQ_6= RULE_PARENTHESIS_IZQ ( (otherlv_7= RULE_ID ) ) this_PARENTHESIS_DER_8= RULE_PARENTHESIS_DER (this_COMA_9= RULE_COMA )? )
            // InternalSqlCrudGenerator.g:403:3: this_WFOREIGN_KEY_0= RULE_WFOREIGN_KEY this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (otherlv_2= RULE_ID ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER this_WREFERENCES_4= RULE_WREFERENCES ( (otherlv_5= RULE_ID ) ) this_PARENTHESIS_IZQ_6= RULE_PARENTHESIS_IZQ ( (otherlv_7= RULE_ID ) ) this_PARENTHESIS_DER_8= RULE_PARENTHESIS_DER (this_COMA_9= RULE_COMA )?
            {
            this_WFOREIGN_KEY_0=(Token)match(input,RULE_WFOREIGN_KEY,FOLLOW_9); 

            			newLeafNode(this_WFOREIGN_KEY_0, grammarAccess.getForeignKeyAccess().getWFOREIGN_KEYTerminalRuleCall_0());
            		
            this_PARENTHESIS_IZQ_1=(Token)match(input,RULE_PARENTHESIS_IZQ,FOLLOW_5); 

            			newLeafNode(this_PARENTHESIS_IZQ_1, grammarAccess.getForeignKeyAccess().getPARENTHESIS_IZQTerminalRuleCall_1());
            		
            // InternalSqlCrudGenerator.g:411:3: ( (otherlv_2= RULE_ID ) )
            // InternalSqlCrudGenerator.g:412:4: (otherlv_2= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:412:4: (otherlv_2= RULE_ID )
            // InternalSqlCrudGenerator.g:413:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getRefsToColumnCrossReference_2_0());
            				

            }


            }

            this_PARENTHESIS_DER_3=(Token)match(input,RULE_PARENTHESIS_DER,FOLLOW_18); 

            			newLeafNode(this_PARENTHESIS_DER_3, grammarAccess.getForeignKeyAccess().getPARENTHESIS_DERTerminalRuleCall_3());
            		
            this_WREFERENCES_4=(Token)match(input,RULE_WREFERENCES,FOLLOW_5); 

            			newLeafNode(this_WREFERENCES_4, grammarAccess.getForeignKeyAccess().getWREFERENCESTerminalRuleCall_4());
            		
            // InternalSqlCrudGenerator.g:432:3: ( (otherlv_5= RULE_ID ) )
            // InternalSqlCrudGenerator.g:433:4: (otherlv_5= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:433:4: (otherlv_5= RULE_ID )
            // InternalSqlCrudGenerator.g:434:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getReferenceTableCrossReference_5_0());
            				

            }


            }

            this_PARENTHESIS_IZQ_6=(Token)match(input,RULE_PARENTHESIS_IZQ,FOLLOW_5); 

            			newLeafNode(this_PARENTHESIS_IZQ_6, grammarAccess.getForeignKeyAccess().getPARENTHESIS_IZQTerminalRuleCall_6());
            		
            // InternalSqlCrudGenerator.g:449:3: ( (otherlv_7= RULE_ID ) )
            // InternalSqlCrudGenerator.g:450:4: (otherlv_7= RULE_ID )
            {
            // InternalSqlCrudGenerator.g:450:4: (otherlv_7= RULE_ID )
            // InternalSqlCrudGenerator.g:451:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_7, grammarAccess.getForeignKeyAccess().getRefsFromColumnCrossReference_7_0());
            				

            }


            }

            this_PARENTHESIS_DER_8=(Token)match(input,RULE_PARENTHESIS_DER,FOLLOW_15); 

            			newLeafNode(this_PARENTHESIS_DER_8, grammarAccess.getForeignKeyAccess().getPARENTHESIS_DERTerminalRuleCall_8());
            		
            // InternalSqlCrudGenerator.g:466:3: (this_COMA_9= RULE_COMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSqlCrudGenerator.g:467:4: this_COMA_9= RULE_COMA
                    {
                    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_9, grammarAccess.getForeignKeyAccess().getCOMATerminalRuleCall_9());
                    			

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


    // $ANTLR start "entryRuleDataType"
    // InternalSqlCrudGenerator.g:476:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalSqlCrudGenerator.g:476:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalSqlCrudGenerator.g:477:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalSqlCrudGenerator.g:483:1: ruleDataType returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleENUM_DATA_TYPE ) ) (this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token this_PARENTHESIS_IZQ_1=null;
        Token lv_precision_2_0=null;
        Token this_PARENTHESIS_DER_3=null;
        Enumerator lv_dataType_0_0 = null;



        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:489:2: ( ( ( (lv_dataType_0_0= ruleENUM_DATA_TYPE ) ) (this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER )? ) )
            // InternalSqlCrudGenerator.g:490:2: ( ( (lv_dataType_0_0= ruleENUM_DATA_TYPE ) ) (this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER )? )
            {
            // InternalSqlCrudGenerator.g:490:2: ( ( (lv_dataType_0_0= ruleENUM_DATA_TYPE ) ) (this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER )? )
            // InternalSqlCrudGenerator.g:491:3: ( (lv_dataType_0_0= ruleENUM_DATA_TYPE ) ) (this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER )?
            {
            // InternalSqlCrudGenerator.g:491:3: ( (lv_dataType_0_0= ruleENUM_DATA_TYPE ) )
            // InternalSqlCrudGenerator.g:492:4: (lv_dataType_0_0= ruleENUM_DATA_TYPE )
            {
            // InternalSqlCrudGenerator.g:492:4: (lv_dataType_0_0= ruleENUM_DATA_TYPE )
            // InternalSqlCrudGenerator.g:493:5: lv_dataType_0_0= ruleENUM_DATA_TYPE
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeENUM_DATA_TYPEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_dataType_0_0=ruleENUM_DATA_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_0_0,
            						"edu.uniandes.automatizacion.sql_crud_generator.SqlCrudGenerator.ENUM_DATA_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlCrudGenerator.g:510:3: (this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PARENTHESIS_IZQ) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlCrudGenerator.g:511:4: this_PARENTHESIS_IZQ_1= RULE_PARENTHESIS_IZQ ( (lv_precision_2_0= RULE_INT ) ) this_PARENTHESIS_DER_3= RULE_PARENTHESIS_DER
                    {
                    this_PARENTHESIS_IZQ_1=(Token)match(input,RULE_PARENTHESIS_IZQ,FOLLOW_20); 

                    				newLeafNode(this_PARENTHESIS_IZQ_1, grammarAccess.getDataTypeAccess().getPARENTHESIS_IZQTerminalRuleCall_1_0());
                    			
                    // InternalSqlCrudGenerator.g:515:4: ( (lv_precision_2_0= RULE_INT ) )
                    // InternalSqlCrudGenerator.g:516:5: (lv_precision_2_0= RULE_INT )
                    {
                    // InternalSqlCrudGenerator.g:516:5: (lv_precision_2_0= RULE_INT )
                    // InternalSqlCrudGenerator.g:517:6: lv_precision_2_0= RULE_INT
                    {
                    lv_precision_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_precision_2_0, grammarAccess.getDataTypeAccess().getPrecisionINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"precision",
                    							lv_precision_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    this_PARENTHESIS_DER_3=(Token)match(input,RULE_PARENTHESIS_DER,FOLLOW_2); 

                    				newLeafNode(this_PARENTHESIS_DER_3, grammarAccess.getDataTypeAccess().getPARENTHESIS_DERTerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleENUM_DATA_TYPE"
    // InternalSqlCrudGenerator.g:542:1: ruleENUM_DATA_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'CHARACTER' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'VARYING' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'VARBINARY' ) | (enumLiteral_5= 'BINARY' ) | (enumLiteral_6= 'INTEGER' ) | (enumLiteral_7= 'SMALLINT' ) | (enumLiteral_8= 'INT' ) | (enumLiteral_9= 'BIGINT' ) | (enumLiteral_10= 'DECIMAL' ) | (enumLiteral_11= 'NUMERIC' ) | (enumLiteral_12= 'FLOAT' ) | (enumLiteral_13= 'REAL' ) | (enumLiteral_14= 'DATE' ) | (enumLiteral_15= 'TIME' ) | (enumLiteral_16= 'TIMESTAMP' ) | (enumLiteral_17= 'INTERVAL' ) | (enumLiteral_18= 'ARRAY' ) | (enumLiteral_19= 'MULTISET' ) | (enumLiteral_20= 'XML' ) | (enumLiteral_21= 'character' ) | (enumLiteral_22= 'varchar' ) | (enumLiteral_23= 'varying' ) | (enumLiteral_24= 'boolean' ) | (enumLiteral_25= 'varbinary' ) | (enumLiteral_26= 'binary' ) | (enumLiteral_27= 'integer' ) | (enumLiteral_28= 'smallint' ) | (enumLiteral_29= 'int' ) | (enumLiteral_30= 'bigint' ) | (enumLiteral_31= 'decimal' ) | (enumLiteral_32= 'numeric' ) | (enumLiteral_33= 'float' ) | (enumLiteral_34= 'real' ) | (enumLiteral_35= 'date' ) | (enumLiteral_36= 'time' ) | (enumLiteral_37= 'timestamp' ) | (enumLiteral_38= 'interval' ) | (enumLiteral_39= 'array' ) | (enumLiteral_40= 'multiset' ) | (enumLiteral_41= 'xml' ) ) ;
    public final Enumerator ruleENUM_DATA_TYPE() throws RecognitionException {
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
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;


        	enterRule();

        try {
            // InternalSqlCrudGenerator.g:548:2: ( ( (enumLiteral_0= 'CHARACTER' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'VARYING' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'VARBINARY' ) | (enumLiteral_5= 'BINARY' ) | (enumLiteral_6= 'INTEGER' ) | (enumLiteral_7= 'SMALLINT' ) | (enumLiteral_8= 'INT' ) | (enumLiteral_9= 'BIGINT' ) | (enumLiteral_10= 'DECIMAL' ) | (enumLiteral_11= 'NUMERIC' ) | (enumLiteral_12= 'FLOAT' ) | (enumLiteral_13= 'REAL' ) | (enumLiteral_14= 'DATE' ) | (enumLiteral_15= 'TIME' ) | (enumLiteral_16= 'TIMESTAMP' ) | (enumLiteral_17= 'INTERVAL' ) | (enumLiteral_18= 'ARRAY' ) | (enumLiteral_19= 'MULTISET' ) | (enumLiteral_20= 'XML' ) | (enumLiteral_21= 'character' ) | (enumLiteral_22= 'varchar' ) | (enumLiteral_23= 'varying' ) | (enumLiteral_24= 'boolean' ) | (enumLiteral_25= 'varbinary' ) | (enumLiteral_26= 'binary' ) | (enumLiteral_27= 'integer' ) | (enumLiteral_28= 'smallint' ) | (enumLiteral_29= 'int' ) | (enumLiteral_30= 'bigint' ) | (enumLiteral_31= 'decimal' ) | (enumLiteral_32= 'numeric' ) | (enumLiteral_33= 'float' ) | (enumLiteral_34= 'real' ) | (enumLiteral_35= 'date' ) | (enumLiteral_36= 'time' ) | (enumLiteral_37= 'timestamp' ) | (enumLiteral_38= 'interval' ) | (enumLiteral_39= 'array' ) | (enumLiteral_40= 'multiset' ) | (enumLiteral_41= 'xml' ) ) )
            // InternalSqlCrudGenerator.g:549:2: ( (enumLiteral_0= 'CHARACTER' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'VARYING' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'VARBINARY' ) | (enumLiteral_5= 'BINARY' ) | (enumLiteral_6= 'INTEGER' ) | (enumLiteral_7= 'SMALLINT' ) | (enumLiteral_8= 'INT' ) | (enumLiteral_9= 'BIGINT' ) | (enumLiteral_10= 'DECIMAL' ) | (enumLiteral_11= 'NUMERIC' ) | (enumLiteral_12= 'FLOAT' ) | (enumLiteral_13= 'REAL' ) | (enumLiteral_14= 'DATE' ) | (enumLiteral_15= 'TIME' ) | (enumLiteral_16= 'TIMESTAMP' ) | (enumLiteral_17= 'INTERVAL' ) | (enumLiteral_18= 'ARRAY' ) | (enumLiteral_19= 'MULTISET' ) | (enumLiteral_20= 'XML' ) | (enumLiteral_21= 'character' ) | (enumLiteral_22= 'varchar' ) | (enumLiteral_23= 'varying' ) | (enumLiteral_24= 'boolean' ) | (enumLiteral_25= 'varbinary' ) | (enumLiteral_26= 'binary' ) | (enumLiteral_27= 'integer' ) | (enumLiteral_28= 'smallint' ) | (enumLiteral_29= 'int' ) | (enumLiteral_30= 'bigint' ) | (enumLiteral_31= 'decimal' ) | (enumLiteral_32= 'numeric' ) | (enumLiteral_33= 'float' ) | (enumLiteral_34= 'real' ) | (enumLiteral_35= 'date' ) | (enumLiteral_36= 'time' ) | (enumLiteral_37= 'timestamp' ) | (enumLiteral_38= 'interval' ) | (enumLiteral_39= 'array' ) | (enumLiteral_40= 'multiset' ) | (enumLiteral_41= 'xml' ) )
            {
            // InternalSqlCrudGenerator.g:549:2: ( (enumLiteral_0= 'CHARACTER' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'VARYING' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'VARBINARY' ) | (enumLiteral_5= 'BINARY' ) | (enumLiteral_6= 'INTEGER' ) | (enumLiteral_7= 'SMALLINT' ) | (enumLiteral_8= 'INT' ) | (enumLiteral_9= 'BIGINT' ) | (enumLiteral_10= 'DECIMAL' ) | (enumLiteral_11= 'NUMERIC' ) | (enumLiteral_12= 'FLOAT' ) | (enumLiteral_13= 'REAL' ) | (enumLiteral_14= 'DATE' ) | (enumLiteral_15= 'TIME' ) | (enumLiteral_16= 'TIMESTAMP' ) | (enumLiteral_17= 'INTERVAL' ) | (enumLiteral_18= 'ARRAY' ) | (enumLiteral_19= 'MULTISET' ) | (enumLiteral_20= 'XML' ) | (enumLiteral_21= 'character' ) | (enumLiteral_22= 'varchar' ) | (enumLiteral_23= 'varying' ) | (enumLiteral_24= 'boolean' ) | (enumLiteral_25= 'varbinary' ) | (enumLiteral_26= 'binary' ) | (enumLiteral_27= 'integer' ) | (enumLiteral_28= 'smallint' ) | (enumLiteral_29= 'int' ) | (enumLiteral_30= 'bigint' ) | (enumLiteral_31= 'decimal' ) | (enumLiteral_32= 'numeric' ) | (enumLiteral_33= 'float' ) | (enumLiteral_34= 'real' ) | (enumLiteral_35= 'date' ) | (enumLiteral_36= 'time' ) | (enumLiteral_37= 'timestamp' ) | (enumLiteral_38= 'interval' ) | (enumLiteral_39= 'array' ) | (enumLiteral_40= 'multiset' ) | (enumLiteral_41= 'xml' ) )
            int alt11=42;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            case 30:
                {
                alt11=7;
                }
                break;
            case 31:
                {
                alt11=8;
                }
                break;
            case 32:
                {
                alt11=9;
                }
                break;
            case 33:
                {
                alt11=10;
                }
                break;
            case 34:
                {
                alt11=11;
                }
                break;
            case 35:
                {
                alt11=12;
                }
                break;
            case 36:
                {
                alt11=13;
                }
                break;
            case 37:
                {
                alt11=14;
                }
                break;
            case 38:
                {
                alt11=15;
                }
                break;
            case 39:
                {
                alt11=16;
                }
                break;
            case 40:
                {
                alt11=17;
                }
                break;
            case 41:
                {
                alt11=18;
                }
                break;
            case 42:
                {
                alt11=19;
                }
                break;
            case 43:
                {
                alt11=20;
                }
                break;
            case 44:
                {
                alt11=21;
                }
                break;
            case 45:
                {
                alt11=22;
                }
                break;
            case 46:
                {
                alt11=23;
                }
                break;
            case 47:
                {
                alt11=24;
                }
                break;
            case 48:
                {
                alt11=25;
                }
                break;
            case 49:
                {
                alt11=26;
                }
                break;
            case 50:
                {
                alt11=27;
                }
                break;
            case 51:
                {
                alt11=28;
                }
                break;
            case 52:
                {
                alt11=29;
                }
                break;
            case 53:
                {
                alt11=30;
                }
                break;
            case 54:
                {
                alt11=31;
                }
                break;
            case 55:
                {
                alt11=32;
                }
                break;
            case 56:
                {
                alt11=33;
                }
                break;
            case 57:
                {
                alt11=34;
                }
                break;
            case 58:
                {
                alt11=35;
                }
                break;
            case 59:
                {
                alt11=36;
                }
                break;
            case 60:
                {
                alt11=37;
                }
                break;
            case 61:
                {
                alt11=38;
                }
                break;
            case 62:
                {
                alt11=39;
                }
                break;
            case 63:
                {
                alt11=40;
                }
                break;
            case 64:
                {
                alt11=41;
                }
                break;
            case 65:
                {
                alt11=42;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSqlCrudGenerator.g:550:3: (enumLiteral_0= 'CHARACTER' )
                    {
                    // InternalSqlCrudGenerator.g:550:3: (enumLiteral_0= 'CHARACTER' )
                    // InternalSqlCrudGenerator.g:551:4: enumLiteral_0= 'CHARACTER'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getCHARACTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getENUM_DATA_TYPEAccess().getCHARACTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlCrudGenerator.g:558:3: (enumLiteral_1= 'VARCHAR' )
                    {
                    // InternalSqlCrudGenerator.g:558:3: (enumLiteral_1= 'VARCHAR' )
                    // InternalSqlCrudGenerator.g:559:4: enumLiteral_1= 'VARCHAR'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getVARCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getENUM_DATA_TYPEAccess().getVARCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlCrudGenerator.g:566:3: (enumLiteral_2= 'VARYING' )
                    {
                    // InternalSqlCrudGenerator.g:566:3: (enumLiteral_2= 'VARYING' )
                    // InternalSqlCrudGenerator.g:567:4: enumLiteral_2= 'VARYING'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getVARYINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getENUM_DATA_TYPEAccess().getVARYINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlCrudGenerator.g:574:3: (enumLiteral_3= 'BOOLEAN' )
                    {
                    // InternalSqlCrudGenerator.g:574:3: (enumLiteral_3= 'BOOLEAN' )
                    // InternalSqlCrudGenerator.g:575:4: enumLiteral_3= 'BOOLEAN'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getENUM_DATA_TYPEAccess().getBOOLEANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlCrudGenerator.g:582:3: (enumLiteral_4= 'VARBINARY' )
                    {
                    // InternalSqlCrudGenerator.g:582:3: (enumLiteral_4= 'VARBINARY' )
                    // InternalSqlCrudGenerator.g:583:4: enumLiteral_4= 'VARBINARY'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getVARBINARYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getENUM_DATA_TYPEAccess().getVARBINARYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSqlCrudGenerator.g:590:3: (enumLiteral_5= 'BINARY' )
                    {
                    // InternalSqlCrudGenerator.g:590:3: (enumLiteral_5= 'BINARY' )
                    // InternalSqlCrudGenerator.g:591:4: enumLiteral_5= 'BINARY'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getBINARYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getENUM_DATA_TYPEAccess().getBINARYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSqlCrudGenerator.g:598:3: (enumLiteral_6= 'INTEGER' )
                    {
                    // InternalSqlCrudGenerator.g:598:3: (enumLiteral_6= 'INTEGER' )
                    // InternalSqlCrudGenerator.g:599:4: enumLiteral_6= 'INTEGER'
                    {
                    enumLiteral_6=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getINTEGEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getENUM_DATA_TYPEAccess().getINTEGEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSqlCrudGenerator.g:606:3: (enumLiteral_7= 'SMALLINT' )
                    {
                    // InternalSqlCrudGenerator.g:606:3: (enumLiteral_7= 'SMALLINT' )
                    // InternalSqlCrudGenerator.g:607:4: enumLiteral_7= 'SMALLINT'
                    {
                    enumLiteral_7=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getSMALLINTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getENUM_DATA_TYPEAccess().getSMALLINTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSqlCrudGenerator.g:614:3: (enumLiteral_8= 'INT' )
                    {
                    // InternalSqlCrudGenerator.g:614:3: (enumLiteral_8= 'INT' )
                    // InternalSqlCrudGenerator.g:615:4: enumLiteral_8= 'INT'
                    {
                    enumLiteral_8=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getINTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getENUM_DATA_TYPEAccess().getINTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSqlCrudGenerator.g:622:3: (enumLiteral_9= 'BIGINT' )
                    {
                    // InternalSqlCrudGenerator.g:622:3: (enumLiteral_9= 'BIGINT' )
                    // InternalSqlCrudGenerator.g:623:4: enumLiteral_9= 'BIGINT'
                    {
                    enumLiteral_9=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getBIGINTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getENUM_DATA_TYPEAccess().getBIGINTEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSqlCrudGenerator.g:630:3: (enumLiteral_10= 'DECIMAL' )
                    {
                    // InternalSqlCrudGenerator.g:630:3: (enumLiteral_10= 'DECIMAL' )
                    // InternalSqlCrudGenerator.g:631:4: enumLiteral_10= 'DECIMAL'
                    {
                    enumLiteral_10=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getDECIMALEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getENUM_DATA_TYPEAccess().getDECIMALEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSqlCrudGenerator.g:638:3: (enumLiteral_11= 'NUMERIC' )
                    {
                    // InternalSqlCrudGenerator.g:638:3: (enumLiteral_11= 'NUMERIC' )
                    // InternalSqlCrudGenerator.g:639:4: enumLiteral_11= 'NUMERIC'
                    {
                    enumLiteral_11=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getNUMERICEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getENUM_DATA_TYPEAccess().getNUMERICEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalSqlCrudGenerator.g:646:3: (enumLiteral_12= 'FLOAT' )
                    {
                    // InternalSqlCrudGenerator.g:646:3: (enumLiteral_12= 'FLOAT' )
                    // InternalSqlCrudGenerator.g:647:4: enumLiteral_12= 'FLOAT'
                    {
                    enumLiteral_12=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getFLOATEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getENUM_DATA_TYPEAccess().getFLOATEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalSqlCrudGenerator.g:654:3: (enumLiteral_13= 'REAL' )
                    {
                    // InternalSqlCrudGenerator.g:654:3: (enumLiteral_13= 'REAL' )
                    // InternalSqlCrudGenerator.g:655:4: enumLiteral_13= 'REAL'
                    {
                    enumLiteral_13=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getREALEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getENUM_DATA_TYPEAccess().getREALEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalSqlCrudGenerator.g:662:3: (enumLiteral_14= 'DATE' )
                    {
                    // InternalSqlCrudGenerator.g:662:3: (enumLiteral_14= 'DATE' )
                    // InternalSqlCrudGenerator.g:663:4: enumLiteral_14= 'DATE'
                    {
                    enumLiteral_14=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getDATEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getENUM_DATA_TYPEAccess().getDATEEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalSqlCrudGenerator.g:670:3: (enumLiteral_15= 'TIME' )
                    {
                    // InternalSqlCrudGenerator.g:670:3: (enumLiteral_15= 'TIME' )
                    // InternalSqlCrudGenerator.g:671:4: enumLiteral_15= 'TIME'
                    {
                    enumLiteral_15=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getTIMEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getENUM_DATA_TYPEAccess().getTIMEEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalSqlCrudGenerator.g:678:3: (enumLiteral_16= 'TIMESTAMP' )
                    {
                    // InternalSqlCrudGenerator.g:678:3: (enumLiteral_16= 'TIMESTAMP' )
                    // InternalSqlCrudGenerator.g:679:4: enumLiteral_16= 'TIMESTAMP'
                    {
                    enumLiteral_16=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getTIMESTAMPEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getENUM_DATA_TYPEAccess().getTIMESTAMPEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalSqlCrudGenerator.g:686:3: (enumLiteral_17= 'INTERVAL' )
                    {
                    // InternalSqlCrudGenerator.g:686:3: (enumLiteral_17= 'INTERVAL' )
                    // InternalSqlCrudGenerator.g:687:4: enumLiteral_17= 'INTERVAL'
                    {
                    enumLiteral_17=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getINTERVALEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getENUM_DATA_TYPEAccess().getINTERVALEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalSqlCrudGenerator.g:694:3: (enumLiteral_18= 'ARRAY' )
                    {
                    // InternalSqlCrudGenerator.g:694:3: (enumLiteral_18= 'ARRAY' )
                    // InternalSqlCrudGenerator.g:695:4: enumLiteral_18= 'ARRAY'
                    {
                    enumLiteral_18=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getARRAYEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getENUM_DATA_TYPEAccess().getARRAYEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalSqlCrudGenerator.g:702:3: (enumLiteral_19= 'MULTISET' )
                    {
                    // InternalSqlCrudGenerator.g:702:3: (enumLiteral_19= 'MULTISET' )
                    // InternalSqlCrudGenerator.g:703:4: enumLiteral_19= 'MULTISET'
                    {
                    enumLiteral_19=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getMULTISETEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getENUM_DATA_TYPEAccess().getMULTISETEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalSqlCrudGenerator.g:710:3: (enumLiteral_20= 'XML' )
                    {
                    // InternalSqlCrudGenerator.g:710:3: (enumLiteral_20= 'XML' )
                    // InternalSqlCrudGenerator.g:711:4: enumLiteral_20= 'XML'
                    {
                    enumLiteral_20=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getXMLEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getENUM_DATA_TYPEAccess().getXMLEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalSqlCrudGenerator.g:718:3: (enumLiteral_21= 'character' )
                    {
                    // InternalSqlCrudGenerator.g:718:3: (enumLiteral_21= 'character' )
                    // InternalSqlCrudGenerator.g:719:4: enumLiteral_21= 'character'
                    {
                    enumLiteral_21=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getCHARACTER_MEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getENUM_DATA_TYPEAccess().getCHARACTER_MEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalSqlCrudGenerator.g:726:3: (enumLiteral_22= 'varchar' )
                    {
                    // InternalSqlCrudGenerator.g:726:3: (enumLiteral_22= 'varchar' )
                    // InternalSqlCrudGenerator.g:727:4: enumLiteral_22= 'varchar'
                    {
                    enumLiteral_22=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getVARCHAR_MEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getENUM_DATA_TYPEAccess().getVARCHAR_MEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalSqlCrudGenerator.g:734:3: (enumLiteral_23= 'varying' )
                    {
                    // InternalSqlCrudGenerator.g:734:3: (enumLiteral_23= 'varying' )
                    // InternalSqlCrudGenerator.g:735:4: enumLiteral_23= 'varying'
                    {
                    enumLiteral_23=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getVARYING_MEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getENUM_DATA_TYPEAccess().getVARYING_MEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalSqlCrudGenerator.g:742:3: (enumLiteral_24= 'boolean' )
                    {
                    // InternalSqlCrudGenerator.g:742:3: (enumLiteral_24= 'boolean' )
                    // InternalSqlCrudGenerator.g:743:4: enumLiteral_24= 'boolean'
                    {
                    enumLiteral_24=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getBOOLEAN_MEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getENUM_DATA_TYPEAccess().getBOOLEAN_MEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalSqlCrudGenerator.g:750:3: (enumLiteral_25= 'varbinary' )
                    {
                    // InternalSqlCrudGenerator.g:750:3: (enumLiteral_25= 'varbinary' )
                    // InternalSqlCrudGenerator.g:751:4: enumLiteral_25= 'varbinary'
                    {
                    enumLiteral_25=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getVARBINARY_MEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getENUM_DATA_TYPEAccess().getVARBINARY_MEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalSqlCrudGenerator.g:758:3: (enumLiteral_26= 'binary' )
                    {
                    // InternalSqlCrudGenerator.g:758:3: (enumLiteral_26= 'binary' )
                    // InternalSqlCrudGenerator.g:759:4: enumLiteral_26= 'binary'
                    {
                    enumLiteral_26=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getBINARY_MEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getENUM_DATA_TYPEAccess().getBINARY_MEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalSqlCrudGenerator.g:766:3: (enumLiteral_27= 'integer' )
                    {
                    // InternalSqlCrudGenerator.g:766:3: (enumLiteral_27= 'integer' )
                    // InternalSqlCrudGenerator.g:767:4: enumLiteral_27= 'integer'
                    {
                    enumLiteral_27=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getINTEGER_MEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getENUM_DATA_TYPEAccess().getINTEGER_MEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalSqlCrudGenerator.g:774:3: (enumLiteral_28= 'smallint' )
                    {
                    // InternalSqlCrudGenerator.g:774:3: (enumLiteral_28= 'smallint' )
                    // InternalSqlCrudGenerator.g:775:4: enumLiteral_28= 'smallint'
                    {
                    enumLiteral_28=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getSMALLINT_MEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getENUM_DATA_TYPEAccess().getSMALLINT_MEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalSqlCrudGenerator.g:782:3: (enumLiteral_29= 'int' )
                    {
                    // InternalSqlCrudGenerator.g:782:3: (enumLiteral_29= 'int' )
                    // InternalSqlCrudGenerator.g:783:4: enumLiteral_29= 'int'
                    {
                    enumLiteral_29=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getINT_MEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getENUM_DATA_TYPEAccess().getINT_MEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalSqlCrudGenerator.g:790:3: (enumLiteral_30= 'bigint' )
                    {
                    // InternalSqlCrudGenerator.g:790:3: (enumLiteral_30= 'bigint' )
                    // InternalSqlCrudGenerator.g:791:4: enumLiteral_30= 'bigint'
                    {
                    enumLiteral_30=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getBIGINT_MEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getENUM_DATA_TYPEAccess().getBIGINT_MEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalSqlCrudGenerator.g:798:3: (enumLiteral_31= 'decimal' )
                    {
                    // InternalSqlCrudGenerator.g:798:3: (enumLiteral_31= 'decimal' )
                    // InternalSqlCrudGenerator.g:799:4: enumLiteral_31= 'decimal'
                    {
                    enumLiteral_31=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getDECIMAL_MEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getENUM_DATA_TYPEAccess().getDECIMAL_MEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalSqlCrudGenerator.g:806:3: (enumLiteral_32= 'numeric' )
                    {
                    // InternalSqlCrudGenerator.g:806:3: (enumLiteral_32= 'numeric' )
                    // InternalSqlCrudGenerator.g:807:4: enumLiteral_32= 'numeric'
                    {
                    enumLiteral_32=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getNUMERIC_MEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getENUM_DATA_TYPEAccess().getNUMERIC_MEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalSqlCrudGenerator.g:814:3: (enumLiteral_33= 'float' )
                    {
                    // InternalSqlCrudGenerator.g:814:3: (enumLiteral_33= 'float' )
                    // InternalSqlCrudGenerator.g:815:4: enumLiteral_33= 'float'
                    {
                    enumLiteral_33=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getFLOAT_MEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getENUM_DATA_TYPEAccess().getFLOAT_MEnumLiteralDeclaration_33());
                    			

                    }


                    }
                    break;
                case 35 :
                    // InternalSqlCrudGenerator.g:822:3: (enumLiteral_34= 'real' )
                    {
                    // InternalSqlCrudGenerator.g:822:3: (enumLiteral_34= 'real' )
                    // InternalSqlCrudGenerator.g:823:4: enumLiteral_34= 'real'
                    {
                    enumLiteral_34=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getREAL_MEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_34, grammarAccess.getENUM_DATA_TYPEAccess().getREAL_MEnumLiteralDeclaration_34());
                    			

                    }


                    }
                    break;
                case 36 :
                    // InternalSqlCrudGenerator.g:830:3: (enumLiteral_35= 'date' )
                    {
                    // InternalSqlCrudGenerator.g:830:3: (enumLiteral_35= 'date' )
                    // InternalSqlCrudGenerator.g:831:4: enumLiteral_35= 'date'
                    {
                    enumLiteral_35=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getDATE_MEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_35, grammarAccess.getENUM_DATA_TYPEAccess().getDATE_MEnumLiteralDeclaration_35());
                    			

                    }


                    }
                    break;
                case 37 :
                    // InternalSqlCrudGenerator.g:838:3: (enumLiteral_36= 'time' )
                    {
                    // InternalSqlCrudGenerator.g:838:3: (enumLiteral_36= 'time' )
                    // InternalSqlCrudGenerator.g:839:4: enumLiteral_36= 'time'
                    {
                    enumLiteral_36=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getTIME_MEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_36, grammarAccess.getENUM_DATA_TYPEAccess().getTIME_MEnumLiteralDeclaration_36());
                    			

                    }


                    }
                    break;
                case 38 :
                    // InternalSqlCrudGenerator.g:846:3: (enumLiteral_37= 'timestamp' )
                    {
                    // InternalSqlCrudGenerator.g:846:3: (enumLiteral_37= 'timestamp' )
                    // InternalSqlCrudGenerator.g:847:4: enumLiteral_37= 'timestamp'
                    {
                    enumLiteral_37=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getTIMESTAMP_MEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_37, grammarAccess.getENUM_DATA_TYPEAccess().getTIMESTAMP_MEnumLiteralDeclaration_37());
                    			

                    }


                    }
                    break;
                case 39 :
                    // InternalSqlCrudGenerator.g:854:3: (enumLiteral_38= 'interval' )
                    {
                    // InternalSqlCrudGenerator.g:854:3: (enumLiteral_38= 'interval' )
                    // InternalSqlCrudGenerator.g:855:4: enumLiteral_38= 'interval'
                    {
                    enumLiteral_38=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getINTERVAL_MEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_38, grammarAccess.getENUM_DATA_TYPEAccess().getINTERVAL_MEnumLiteralDeclaration_38());
                    			

                    }


                    }
                    break;
                case 40 :
                    // InternalSqlCrudGenerator.g:862:3: (enumLiteral_39= 'array' )
                    {
                    // InternalSqlCrudGenerator.g:862:3: (enumLiteral_39= 'array' )
                    // InternalSqlCrudGenerator.g:863:4: enumLiteral_39= 'array'
                    {
                    enumLiteral_39=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getARRAY_MEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_39, grammarAccess.getENUM_DATA_TYPEAccess().getARRAY_MEnumLiteralDeclaration_39());
                    			

                    }


                    }
                    break;
                case 41 :
                    // InternalSqlCrudGenerator.g:870:3: (enumLiteral_40= 'multiset' )
                    {
                    // InternalSqlCrudGenerator.g:870:3: (enumLiteral_40= 'multiset' )
                    // InternalSqlCrudGenerator.g:871:4: enumLiteral_40= 'multiset'
                    {
                    enumLiteral_40=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getMULTISET_MEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_40, grammarAccess.getENUM_DATA_TYPEAccess().getMULTISET_MEnumLiteralDeclaration_40());
                    			

                    }


                    }
                    break;
                case 42 :
                    // InternalSqlCrudGenerator.g:878:3: (enumLiteral_41= 'xml' )
                    {
                    // InternalSqlCrudGenerator.g:878:3: (enumLiteral_41= 'xml' )
                    // InternalSqlCrudGenerator.g:879:4: enumLiteral_41= 'xml'
                    {
                    enumLiteral_41=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getENUM_DATA_TYPEAccess().getXML_MEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_41, grammarAccess.getENUM_DATA_TYPEAccess().getXML_MEnumLiteralDeclaration_41());
                    			

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
    // $ANTLR end "ruleENUM_DATA_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018880L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFFFFFFFFFF000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});

}