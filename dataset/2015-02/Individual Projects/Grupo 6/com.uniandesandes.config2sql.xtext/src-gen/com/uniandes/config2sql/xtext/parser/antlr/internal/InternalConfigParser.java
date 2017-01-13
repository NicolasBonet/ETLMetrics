package com.uniandes.config2sql.xtext.parser.antlr.internal; 

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
import com.uniandes.config2sql.xtext.services.ConfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LITERACONFIG", "RULE_COLON", "RULE_LEFTPARENTESIS", "RULE_LITERACONNECTION", "RULE_LITERALMERGEDFIELDS", "RULE_LEFTBRACKET", "RULE_COMA", "RULE_RIGHTBRACKET", "RULE_RIGHTPARENTESIS", "RULE_LITERALURL", "RULE_LITERALUSERNAME", "RULE_LITERALPASSWORD", "RULE_LITERALTABLENAME", "RULE_LITERALFIELDS", "RULE_LITERALATTRIBUTENAMES", "RULE_STRING", "RULE_ID", "RULE_SINGLEQUOTE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\'String\\''", "'\\'Integer\\''", "'\\'Float\\''", "'\\'Array\\''", "'\\'Boolean\\''"
    };
    public static final int RULE_LITERALMERGEDFIELDS=8;
    public static final int RULE_COMA=10;
    public static final int RULE_LITERALUSERNAME=14;
    public static final int RULE_STRING=19;
    public static final int RULE_LITERACONFIG=4;
    public static final int RULE_LITERALFIELDS=17;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_RIGHTBRACKET=11;
    public static final int RULE_SINGLEQUOTE=21;
    public static final int RULE_LITERACONNECTION=7;
    public static final int RULE_LITERALATTRIBUTENAMES=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=20;
    public static final int RULE_WS=25;
    public static final int RULE_RIGHTPARENTESIS=12;
    public static final int RULE_LITERALTABLENAME=16;
    public static final int RULE_COLON=5;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_LITERALPASSWORD=15;
    public static final int RULE_LEFTBRACKET=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=22;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_LITERALURL=13;
    public static final int RULE_LEFTPARENTESIS=6;

    // delegates
    // delegators


        public InternalConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigParser.tokenNames; }
    public String getGrammarFileName() { return "../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g"; }



     	private ConfigGrammarAccess grammarAccess;
     	
        public InternalConfigParser(TokenStream input, ConfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Config";	
       	}
       	
       	@Override
       	protected ConfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfig"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:68:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:69:2: (iv_ruleConfig= ruleConfig EOF )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:70:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig75);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig85); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:77:1: ruleConfig returns [EObject current=null] : (this_LITERACONFIG_0= RULE_LITERACONFIG this_COLON_1= RULE_COLON this_LEFTPARENTESIS_2= RULE_LEFTPARENTESIS this_LITERACONNECTION_3= RULE_LITERACONNECTION this_COLON_4= RULE_COLON ( (lv_connection_5_0= ruleConnection ) ) (this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET )? this_RIGHTPARENTESIS_12= RULE_RIGHTPARENTESIS ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token this_LITERACONFIG_0=null;
        Token this_COLON_1=null;
        Token this_LEFTPARENTESIS_2=null;
        Token this_LITERACONNECTION_3=null;
        Token this_COLON_4=null;
        Token this_LITERALMERGEDFIELDS_6=null;
        Token this_LEFTBRACKET_7=null;
        Token this_COMA_9=null;
        Token this_RIGHTBRACKET_11=null;
        Token this_RIGHTPARENTESIS_12=null;
        EObject lv_connection_5_0 = null;

        EObject lv_mergeFields_8_0 = null;

        EObject lv_mergeFields_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:80:28: ( (this_LITERACONFIG_0= RULE_LITERACONFIG this_COLON_1= RULE_COLON this_LEFTPARENTESIS_2= RULE_LEFTPARENTESIS this_LITERACONNECTION_3= RULE_LITERACONNECTION this_COLON_4= RULE_COLON ( (lv_connection_5_0= ruleConnection ) ) (this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET )? this_RIGHTPARENTESIS_12= RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:81:1: (this_LITERACONFIG_0= RULE_LITERACONFIG this_COLON_1= RULE_COLON this_LEFTPARENTESIS_2= RULE_LEFTPARENTESIS this_LITERACONNECTION_3= RULE_LITERACONNECTION this_COLON_4= RULE_COLON ( (lv_connection_5_0= ruleConnection ) ) (this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET )? this_RIGHTPARENTESIS_12= RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:81:1: (this_LITERACONFIG_0= RULE_LITERACONFIG this_COLON_1= RULE_COLON this_LEFTPARENTESIS_2= RULE_LEFTPARENTESIS this_LITERACONNECTION_3= RULE_LITERACONNECTION this_COLON_4= RULE_COLON ( (lv_connection_5_0= ruleConnection ) ) (this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET )? this_RIGHTPARENTESIS_12= RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:81:2: this_LITERACONFIG_0= RULE_LITERACONFIG this_COLON_1= RULE_COLON this_LEFTPARENTESIS_2= RULE_LEFTPARENTESIS this_LITERACONNECTION_3= RULE_LITERACONNECTION this_COLON_4= RULE_COLON ( (lv_connection_5_0= ruleConnection ) ) (this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET )? this_RIGHTPARENTESIS_12= RULE_RIGHTPARENTESIS
            {
            this_LITERACONFIG_0=(Token)match(input,RULE_LITERACONFIG,FOLLOW_RULE_LITERACONFIG_in_ruleConfig121); 
             
                newLeafNode(this_LITERACONFIG_0, grammarAccess.getConfigAccess().getLITERACONFIGTerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleConfig131); 
             
                newLeafNode(this_COLON_1, grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_1()); 
                
            this_LEFTPARENTESIS_2=(Token)match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_ruleConfig141); 
             
                newLeafNode(this_LEFTPARENTESIS_2, grammarAccess.getConfigAccess().getLEFTPARENTESISTerminalRuleCall_2()); 
                
            this_LITERACONNECTION_3=(Token)match(input,RULE_LITERACONNECTION,FOLLOW_RULE_LITERACONNECTION_in_ruleConfig151); 
             
                newLeafNode(this_LITERACONNECTION_3, grammarAccess.getConfigAccess().getLITERACONNECTIONTerminalRuleCall_3()); 
                
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleConfig161); 
             
                newLeafNode(this_COLON_4, grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_4()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:101:1: ( (lv_connection_5_0= ruleConnection ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:102:1: (lv_connection_5_0= ruleConnection )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:102:1: (lv_connection_5_0= ruleConnection )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:103:3: lv_connection_5_0= ruleConnection
            {
             
            	        newCompositeNode(grammarAccess.getConfigAccess().getConnectionConnectionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleConnection_in_ruleConfig181);
            lv_connection_5_0=ruleConnection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	        }
                   		set(
                   			current, 
                   			"connection",
                    		lv_connection_5_0, 
                    		"Connection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:119:2: (this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LITERALMERGEDFIELDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:119:3: this_LITERALMERGEDFIELDS_6= RULE_LITERALMERGEDFIELDS this_LEFTBRACKET_7= RULE_LEFTBRACKET ( (lv_mergeFields_8_0= ruleMergedField ) ) (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )* this_RIGHTBRACKET_11= RULE_RIGHTBRACKET
                    {
                    this_LITERALMERGEDFIELDS_6=(Token)match(input,RULE_LITERALMERGEDFIELDS,FOLLOW_RULE_LITERALMERGEDFIELDS_in_ruleConfig193); 
                     
                        newLeafNode(this_LITERALMERGEDFIELDS_6, grammarAccess.getConfigAccess().getLITERALMERGEDFIELDSTerminalRuleCall_6_0()); 
                        
                    this_LEFTBRACKET_7=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_RULE_LEFTBRACKET_in_ruleConfig203); 
                     
                        newLeafNode(this_LEFTBRACKET_7, grammarAccess.getConfigAccess().getLEFTBRACKETTerminalRuleCall_6_1()); 
                        
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:127:1: ( (lv_mergeFields_8_0= ruleMergedField ) )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:128:1: (lv_mergeFields_8_0= ruleMergedField )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:128:1: (lv_mergeFields_8_0= ruleMergedField )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:129:3: lv_mergeFields_8_0= ruleMergedField
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMergedField_in_ruleConfig223);
                    lv_mergeFields_8_0=ruleMergedField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigRule());
                    	        }
                           		add(
                           			current, 
                           			"mergeFields",
                            		lv_mergeFields_8_0, 
                            		"MergedField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:145:2: (this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_COMA) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:145:3: this_COMA_9= RULE_COMA ( (lv_mergeFields_10_0= ruleMergedField ) )
                    	    {
                    	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_RULE_COMA_in_ruleConfig235); 
                    	     
                    	        newLeafNode(this_COMA_9, grammarAccess.getConfigAccess().getCOMATerminalRuleCall_6_3_0()); 
                    	        
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:149:1: ( (lv_mergeFields_10_0= ruleMergedField ) )
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:150:1: (lv_mergeFields_10_0= ruleMergedField )
                    	    {
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:150:1: (lv_mergeFields_10_0= ruleMergedField )
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:151:3: lv_mergeFields_10_0= ruleMergedField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMergedField_in_ruleConfig255);
                    	    lv_mergeFields_10_0=ruleMergedField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mergeFields",
                    	            		lv_mergeFields_10_0, 
                    	            		"MergedField");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    this_RIGHTBRACKET_11=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_RULE_RIGHTBRACKET_in_ruleConfig268); 
                     
                        newLeafNode(this_RIGHTBRACKET_11, grammarAccess.getConfigAccess().getRIGHTBRACKETTerminalRuleCall_6_4()); 
                        

                    }
                    break;

            }

            this_RIGHTPARENTESIS_12=(Token)match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_ruleConfig280); 
             
                newLeafNode(this_RIGHTPARENTESIS_12, grammarAccess.getConfigAccess().getRIGHTPARENTESISTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConnection"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:183:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:184:2: (iv_ruleConnection= ruleConnection EOF )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:185:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection315);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection325); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:192:1: ruleConnection returns [EObject current=null] : ( () this_LEFTPARENTESIS_1= RULE_LEFTPARENTESIS (this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) ) )? (this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) ) )? (this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) ) )? this_RIGHTPARENTESIS_8= RULE_RIGHTPARENTESIS ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token this_LEFTPARENTESIS_1=null;
        Token this_LITERALURL_2=null;
        Token this_LITERALUSERNAME_4=null;
        Token this_LITERALPASSWORD_6=null;
        Token this_RIGHTPARENTESIS_8=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:195:28: ( ( () this_LEFTPARENTESIS_1= RULE_LEFTPARENTESIS (this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) ) )? (this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) ) )? (this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) ) )? this_RIGHTPARENTESIS_8= RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:196:1: ( () this_LEFTPARENTESIS_1= RULE_LEFTPARENTESIS (this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) ) )? (this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) ) )? (this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) ) )? this_RIGHTPARENTESIS_8= RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:196:1: ( () this_LEFTPARENTESIS_1= RULE_LEFTPARENTESIS (this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) ) )? (this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) ) )? (this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) ) )? this_RIGHTPARENTESIS_8= RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:196:2: () this_LEFTPARENTESIS_1= RULE_LEFTPARENTESIS (this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) ) )? (this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) ) )? (this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) ) )? this_RIGHTPARENTESIS_8= RULE_RIGHTPARENTESIS
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:196:2: ()
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:197:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionAccess().getConnectionAction_0(),
                        current);
                

            }

            this_LEFTPARENTESIS_1=(Token)match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_ruleConnection370); 
             
                newLeafNode(this_LEFTPARENTESIS_1, grammarAccess.getConnectionAccess().getLEFTPARENTESISTerminalRuleCall_1()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:206:1: (this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LITERALURL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:206:2: this_LITERALURL_2= RULE_LITERALURL ( (lv_url_3_0= ruleEString ) )
                    {
                    this_LITERALURL_2=(Token)match(input,RULE_LITERALURL,FOLLOW_RULE_LITERALURL_in_ruleConnection381); 
                     
                        newLeafNode(this_LITERALURL_2, grammarAccess.getConnectionAccess().getLITERALURLTerminalRuleCall_2_0()); 
                        
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:210:1: ( (lv_url_3_0= ruleEString ) )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:211:1: (lv_url_3_0= ruleEString )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:211:1: (lv_url_3_0= ruleEString )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:212:3: lv_url_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleConnection401);
                    lv_url_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:228:4: (this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LITERALUSERNAME) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:228:5: this_LITERALUSERNAME_4= RULE_LITERALUSERNAME ( (lv_username_5_0= ruleEString ) )
                    {
                    this_LITERALUSERNAME_4=(Token)match(input,RULE_LITERALUSERNAME,FOLLOW_RULE_LITERALUSERNAME_in_ruleConnection415); 
                     
                        newLeafNode(this_LITERALUSERNAME_4, grammarAccess.getConnectionAccess().getLITERALUSERNAMETerminalRuleCall_3_0()); 
                        
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:232:1: ( (lv_username_5_0= ruleEString ) )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:233:1: (lv_username_5_0= ruleEString )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:233:1: (lv_username_5_0= ruleEString )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:234:3: lv_username_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleConnection435);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	        }
                           		set(
                           			current, 
                           			"username",
                            		lv_username_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:250:4: (this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LITERALPASSWORD) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:250:5: this_LITERALPASSWORD_6= RULE_LITERALPASSWORD ( (lv_password_7_0= ruleEString ) )
                    {
                    this_LITERALPASSWORD_6=(Token)match(input,RULE_LITERALPASSWORD,FOLLOW_RULE_LITERALPASSWORD_in_ruleConnection449); 
                     
                        newLeafNode(this_LITERALPASSWORD_6, grammarAccess.getConnectionAccess().getLITERALPASSWORDTerminalRuleCall_4_0()); 
                        
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:254:1: ( (lv_password_7_0= ruleEString ) )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:255:1: (lv_password_7_0= ruleEString )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:255:1: (lv_password_7_0= ruleEString )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:256:3: lv_password_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleConnection469);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	        }
                           		set(
                           			current, 
                           			"password",
                            		lv_password_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            this_RIGHTPARENTESIS_8=(Token)match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_ruleConnection482); 
             
                newLeafNode(this_RIGHTPARENTESIS_8, grammarAccess.getConnectionAccess().getRIGHTPARENTESISTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleMergedField"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:284:1: entryRuleMergedField returns [EObject current=null] : iv_ruleMergedField= ruleMergedField EOF ;
    public final EObject entryRuleMergedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergedField = null;


        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:285:2: (iv_ruleMergedField= ruleMergedField EOF )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:286:2: iv_ruleMergedField= ruleMergedField EOF
            {
             newCompositeNode(grammarAccess.getMergedFieldRule()); 
            pushFollow(FOLLOW_ruleMergedField_in_entryRuleMergedField517);
            iv_ruleMergedField=ruleMergedField();

            state._fsp--;

             current =iv_ruleMergedField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMergedField527); 

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
    // $ANTLR end "entryRuleMergedField"


    // $ANTLR start "ruleMergedField"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:293:1: ruleMergedField returns [EObject current=null] : (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS (this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) ) )? this_LITERALFIELDS_3= RULE_LITERALFIELDS this_LEFTBRACKET_4= RULE_LEFTBRACKET ( (lv_fields_5_0= ruleField ) ) (this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) ) )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_LITERALATTRIBUTENAMES_9= RULE_LITERALATTRIBUTENAMES this_LEFTBRACKET_10= RULE_LEFTBRACKET ( (lv_attributeNames_11_0= ruleAttributeName ) ) (this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) ) )* this_RIGHTBRACKET_14= RULE_RIGHTBRACKET this_RIGHTPARENTESIS_15= RULE_RIGHTPARENTESIS ) ;
    public final EObject ruleMergedField() throws RecognitionException {
        EObject current = null;

        Token this_LEFTPARENTESIS_0=null;
        Token this_LITERALTABLENAME_1=null;
        Token this_LITERALFIELDS_3=null;
        Token this_LEFTBRACKET_4=null;
        Token this_COMA_6=null;
        Token this_RIGHTBRACKET_8=null;
        Token this_LITERALATTRIBUTENAMES_9=null;
        Token this_LEFTBRACKET_10=null;
        Token this_COMA_12=null;
        Token this_RIGHTBRACKET_14=null;
        Token this_RIGHTPARENTESIS_15=null;
        AntlrDatatypeRuleToken lv_tableName_2_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_fields_7_0 = null;

        EObject lv_attributeNames_11_0 = null;

        EObject lv_attributeNames_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:296:28: ( (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS (this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) ) )? this_LITERALFIELDS_3= RULE_LITERALFIELDS this_LEFTBRACKET_4= RULE_LEFTBRACKET ( (lv_fields_5_0= ruleField ) ) (this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) ) )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_LITERALATTRIBUTENAMES_9= RULE_LITERALATTRIBUTENAMES this_LEFTBRACKET_10= RULE_LEFTBRACKET ( (lv_attributeNames_11_0= ruleAttributeName ) ) (this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) ) )* this_RIGHTBRACKET_14= RULE_RIGHTBRACKET this_RIGHTPARENTESIS_15= RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:297:1: (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS (this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) ) )? this_LITERALFIELDS_3= RULE_LITERALFIELDS this_LEFTBRACKET_4= RULE_LEFTBRACKET ( (lv_fields_5_0= ruleField ) ) (this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) ) )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_LITERALATTRIBUTENAMES_9= RULE_LITERALATTRIBUTENAMES this_LEFTBRACKET_10= RULE_LEFTBRACKET ( (lv_attributeNames_11_0= ruleAttributeName ) ) (this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) ) )* this_RIGHTBRACKET_14= RULE_RIGHTBRACKET this_RIGHTPARENTESIS_15= RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:297:1: (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS (this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) ) )? this_LITERALFIELDS_3= RULE_LITERALFIELDS this_LEFTBRACKET_4= RULE_LEFTBRACKET ( (lv_fields_5_0= ruleField ) ) (this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) ) )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_LITERALATTRIBUTENAMES_9= RULE_LITERALATTRIBUTENAMES this_LEFTBRACKET_10= RULE_LEFTBRACKET ( (lv_attributeNames_11_0= ruleAttributeName ) ) (this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) ) )* this_RIGHTBRACKET_14= RULE_RIGHTBRACKET this_RIGHTPARENTESIS_15= RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:297:2: this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS (this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) ) )? this_LITERALFIELDS_3= RULE_LITERALFIELDS this_LEFTBRACKET_4= RULE_LEFTBRACKET ( (lv_fields_5_0= ruleField ) ) (this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) ) )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_LITERALATTRIBUTENAMES_9= RULE_LITERALATTRIBUTENAMES this_LEFTBRACKET_10= RULE_LEFTBRACKET ( (lv_attributeNames_11_0= ruleAttributeName ) ) (this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) ) )* this_RIGHTBRACKET_14= RULE_RIGHTBRACKET this_RIGHTPARENTESIS_15= RULE_RIGHTPARENTESIS
            {
            this_LEFTPARENTESIS_0=(Token)match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_ruleMergedField563); 
             
                newLeafNode(this_LEFTPARENTESIS_0, grammarAccess.getMergedFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:301:1: (this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LITERALTABLENAME) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:301:2: this_LITERALTABLENAME_1= RULE_LITERALTABLENAME ( (lv_tableName_2_0= ruleEString ) )
                    {
                    this_LITERALTABLENAME_1=(Token)match(input,RULE_LITERALTABLENAME,FOLLOW_RULE_LITERALTABLENAME_in_ruleMergedField574); 
                     
                        newLeafNode(this_LITERALTABLENAME_1, grammarAccess.getMergedFieldAccess().getLITERALTABLENAMETerminalRuleCall_1_0()); 
                        
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:305:1: ( (lv_tableName_2_0= ruleEString ) )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:306:1: (lv_tableName_2_0= ruleEString )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:306:1: (lv_tableName_2_0= ruleEString )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:307:3: lv_tableName_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleMergedField594);
                    lv_tableName_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"tableName",
                            		lv_tableName_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            this_LITERALFIELDS_3=(Token)match(input,RULE_LITERALFIELDS,FOLLOW_RULE_LITERALFIELDS_in_ruleMergedField607); 
             
                newLeafNode(this_LITERALFIELDS_3, grammarAccess.getMergedFieldAccess().getLITERALFIELDSTerminalRuleCall_2()); 
                
            this_LEFTBRACKET_4=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_RULE_LEFTBRACKET_in_ruleMergedField617); 
             
                newLeafNode(this_LEFTBRACKET_4, grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_3()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:331:1: ( (lv_fields_5_0= ruleField ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:332:1: (lv_fields_5_0= ruleField )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:332:1: (lv_fields_5_0= ruleField )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:333:3: lv_fields_5_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleField_in_ruleMergedField637);
            lv_fields_5_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_5_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:349:2: (this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:349:3: this_COMA_6= RULE_COMA ( (lv_fields_7_0= ruleField ) )
            	    {
            	    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_RULE_COMA_in_ruleMergedField649); 
            	     
            	        newLeafNode(this_COMA_6, grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_5_0()); 
            	        
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:353:1: ( (lv_fields_7_0= ruleField ) )
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:354:1: (lv_fields_7_0= ruleField )
            	    {
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:354:1: (lv_fields_7_0= ruleField )
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:355:3: lv_fields_7_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleMergedField669);
            	    lv_fields_7_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_7_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_RIGHTBRACKET_8=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_RULE_RIGHTBRACKET_in_ruleMergedField682); 
             
                newLeafNode(this_RIGHTBRACKET_8, grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_6()); 
                
            this_LITERALATTRIBUTENAMES_9=(Token)match(input,RULE_LITERALATTRIBUTENAMES,FOLLOW_RULE_LITERALATTRIBUTENAMES_in_ruleMergedField692); 
             
                newLeafNode(this_LITERALATTRIBUTENAMES_9, grammarAccess.getMergedFieldAccess().getLITERALATTRIBUTENAMESTerminalRuleCall_7()); 
                
            this_LEFTBRACKET_10=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_RULE_LEFTBRACKET_in_ruleMergedField702); 
             
                newLeafNode(this_LEFTBRACKET_10, grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_8()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:383:1: ( (lv_attributeNames_11_0= ruleAttributeName ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:384:1: (lv_attributeNames_11_0= ruleAttributeName )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:384:1: (lv_attributeNames_11_0= ruleAttributeName )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:385:3: lv_attributeNames_11_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleMergedField722);
            lv_attributeNames_11_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	        }
                   		add(
                   			current, 
                   			"attributeNames",
                    		lv_attributeNames_11_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:401:2: (this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:401:3: this_COMA_12= RULE_COMA ( (lv_attributeNames_13_0= ruleAttributeName ) )
            	    {
            	    this_COMA_12=(Token)match(input,RULE_COMA,FOLLOW_RULE_COMA_in_ruleMergedField734); 
            	     
            	        newLeafNode(this_COMA_12, grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_10_0()); 
            	        
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:405:1: ( (lv_attributeNames_13_0= ruleAttributeName ) )
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:406:1: (lv_attributeNames_13_0= ruleAttributeName )
            	    {
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:406:1: (lv_attributeNames_13_0= ruleAttributeName )
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:407:3: lv_attributeNames_13_0= ruleAttributeName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeName_in_ruleMergedField754);
            	    lv_attributeNames_13_0=ruleAttributeName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributeNames",
            	            		lv_attributeNames_13_0, 
            	            		"AttributeName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_RIGHTBRACKET_14=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_RULE_RIGHTBRACKET_in_ruleMergedField767); 
             
                newLeafNode(this_RIGHTBRACKET_14, grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_11()); 
                
            this_RIGHTPARENTESIS_15=(Token)match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_ruleMergedField777); 
             
                newLeafNode(this_RIGHTPARENTESIS_15, grammarAccess.getMergedFieldAccess().getRIGHTPARENTESISTerminalRuleCall_12()); 
                

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
    // $ANTLR end "ruleMergedField"


    // $ANTLR start "entryRuleEString"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:439:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:440:2: (iv_ruleEString= ruleEString EOF )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:441:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString813);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString824); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:448:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:451:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:452:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:452:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:452:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString864); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:460:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString890); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttributeName"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:475:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:476:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:477:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName935);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName945); 

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
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:484:1: ruleAttributeName returns [EObject current=null] : (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_oldField_1_0= ruleEString ) )? this_COMA_2= RULE_COMA ( ( ruleEString ) ) this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token this_LEFTPARENTESIS_0=null;
        Token this_COMA_2=null;
        Token this_RIGHTPARENTESIS_4=null;
        AntlrDatatypeRuleToken lv_oldField_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:487:28: ( (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_oldField_1_0= ruleEString ) )? this_COMA_2= RULE_COMA ( ( ruleEString ) ) this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:488:1: (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_oldField_1_0= ruleEString ) )? this_COMA_2= RULE_COMA ( ( ruleEString ) ) this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:488:1: (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_oldField_1_0= ruleEString ) )? this_COMA_2= RULE_COMA ( ( ruleEString ) ) this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:488:2: this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_oldField_1_0= ruleEString ) )? this_COMA_2= RULE_COMA ( ( ruleEString ) ) this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS
            {
            this_LEFTPARENTESIS_0=(Token)match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_ruleAttributeName981); 
             
                newLeafNode(this_LEFTPARENTESIS_0, grammarAccess.getAttributeNameAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:492:1: ( (lv_oldField_1_0= ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:493:1: (lv_oldField_1_0= ruleEString )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:493:1: (lv_oldField_1_0= ruleEString )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:494:3: lv_oldField_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleAttributeName1001);
                    lv_oldField_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeNameRule());
                    	        }
                           		set(
                           			current, 
                           			"oldField",
                            		lv_oldField_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            this_COMA_2=(Token)match(input,RULE_COMA,FOLLOW_RULE_COMA_in_ruleAttributeName1013); 
             
                newLeafNode(this_COMA_2, grammarAccess.getAttributeNameAccess().getCOMATerminalRuleCall_2()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:514:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:515:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:515:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:516:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeNameRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAttributeName1035);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RIGHTPARENTESIS_4=(Token)match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_ruleAttributeName1046); 
             
                newLeafNode(this_RIGHTPARENTESIS_4, grammarAccess.getAttributeNameAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleField"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:541:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:542:2: (iv_ruleField= ruleField EOF )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:543:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1081);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1091); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:550:1: ruleField returns [EObject current=null] : (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_name_1_0= ruleEString ) ) this_COMA_2= RULE_COMA ( (lv_type_3_0= ruleFieldType ) )? this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token this_LEFTPARENTESIS_0=null;
        Token this_COMA_2=null;
        Token this_RIGHTPARENTESIS_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:553:28: ( (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_name_1_0= ruleEString ) ) this_COMA_2= RULE_COMA ( (lv_type_3_0= ruleFieldType ) )? this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:554:1: (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_name_1_0= ruleEString ) ) this_COMA_2= RULE_COMA ( (lv_type_3_0= ruleFieldType ) )? this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:554:1: (this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_name_1_0= ruleEString ) ) this_COMA_2= RULE_COMA ( (lv_type_3_0= ruleFieldType ) )? this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:554:2: this_LEFTPARENTESIS_0= RULE_LEFTPARENTESIS ( (lv_name_1_0= ruleEString ) ) this_COMA_2= RULE_COMA ( (lv_type_3_0= ruleFieldType ) )? this_RIGHTPARENTESIS_4= RULE_RIGHTPARENTESIS
            {
            this_LEFTPARENTESIS_0=(Token)match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_ruleField1127); 
             
                newLeafNode(this_LEFTPARENTESIS_0, grammarAccess.getFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:558:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:559:1: (lv_name_1_0= ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:559:1: (lv_name_1_0= ruleEString )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:560:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleField1147);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_COMA_2=(Token)match(input,RULE_COMA,FOLLOW_RULE_COMA_in_ruleField1158); 
             
                newLeafNode(this_COMA_2, grammarAccess.getFieldAccess().getCOMATerminalRuleCall_2()); 
                
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:580:1: ( (lv_type_3_0= ruleFieldType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=31)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:581:1: (lv_type_3_0= ruleFieldType )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:581:1: (lv_type_3_0= ruleFieldType )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:582:3: lv_type_3_0= ruleFieldType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldType_in_ruleField1178);
                    lv_type_3_0=ruleFieldType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"FieldType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            this_RIGHTPARENTESIS_4=(Token)match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_ruleField1190); 
             
                newLeafNode(this_RIGHTPARENTESIS_4, grammarAccess.getFieldAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleField"


    // $ANTLR start "ruleFieldType"
    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:610:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= '\\'String\\'' ) | (enumLiteral_1= '\\'Integer\\'' ) | (enumLiteral_2= '\\'Float\\'' ) | (enumLiteral_3= '\\'Array\\'' ) | (enumLiteral_4= '\\'Boolean\\'' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:612:28: ( ( (enumLiteral_0= '\\'String\\'' ) | (enumLiteral_1= '\\'Integer\\'' ) | (enumLiteral_2= '\\'Float\\'' ) | (enumLiteral_3= '\\'Array\\'' ) | (enumLiteral_4= '\\'Boolean\\'' ) ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:613:1: ( (enumLiteral_0= '\\'String\\'' ) | (enumLiteral_1= '\\'Integer\\'' ) | (enumLiteral_2= '\\'Float\\'' ) | (enumLiteral_3= '\\'Array\\'' ) | (enumLiteral_4= '\\'Boolean\\'' ) )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:613:1: ( (enumLiteral_0= '\\'String\\'' ) | (enumLiteral_1= '\\'Integer\\'' ) | (enumLiteral_2= '\\'Float\\'' ) | (enumLiteral_3= '\\'Array\\'' ) | (enumLiteral_4= '\\'Boolean\\'' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:613:2: (enumLiteral_0= '\\'String\\'' )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:613:2: (enumLiteral_0= '\\'String\\'' )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:613:4: enumLiteral_0= '\\'String\\''
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleFieldType1239); 

                            current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:619:6: (enumLiteral_1= '\\'Integer\\'' )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:619:6: (enumLiteral_1= '\\'Integer\\'' )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:619:8: enumLiteral_1= '\\'Integer\\''
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleFieldType1256); 

                            current = grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:625:6: (enumLiteral_2= '\\'Float\\'' )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:625:6: (enumLiteral_2= '\\'Float\\'' )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:625:8: enumLiteral_2= '\\'Float\\''
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleFieldType1273); 

                            current = grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:631:6: (enumLiteral_3= '\\'Array\\'' )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:631:6: (enumLiteral_3= '\\'Array\\'' )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:631:8: enumLiteral_3= '\\'Array\\''
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_30_in_ruleFieldType1290); 

                            current = grammarAccess.getFieldTypeAccess().getArrayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getArrayEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:637:6: (enumLiteral_4= '\\'Boolean\\'' )
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:637:6: (enumLiteral_4= '\\'Boolean\\'' )
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:637:8: enumLiteral_4= '\\'Boolean\\''
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_31_in_ruleFieldType1307); 

                            current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERACONFIG_in_ruleConfig121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleConfig131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_ruleConfig141 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LITERACONNECTION_in_ruleConfig151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleConfig161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleConnection_in_ruleConfig181 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RULE_LITERALMERGEDFIELDS_in_ruleConfig193 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_ruleConfig203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMergedField_in_ruleConfig223 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_COMA_in_ruleConfig235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMergedField_in_ruleConfig255 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_ruleConfig268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_ruleConfig280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_ruleConnection370 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_RULE_LITERALURL_in_ruleConnection381 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConnection401 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_RULE_LITERALUSERNAME_in_ruleConnection415 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConnection435 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_RULE_LITERALPASSWORD_in_ruleConnection449 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConnection469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_ruleConnection482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMergedField_in_entryRuleMergedField517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMergedField527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_ruleMergedField563 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RULE_LITERALTABLENAME_in_ruleMergedField574 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMergedField594 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LITERALFIELDS_in_ruleMergedField607 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_ruleMergedField617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleField_in_ruleMergedField637 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_COMA_in_ruleMergedField649 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleField_in_ruleMergedField669 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_ruleMergedField682 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_LITERALATTRIBUTENAMES_in_ruleMergedField692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_ruleMergedField702 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleMergedField722 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_COMA_in_ruleMergedField734 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleMergedField754 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_ruleMergedField767 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_ruleMergedField777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_ruleAttributeName981 = new BitSet(new long[]{0x0000000000180400L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAttributeName1001 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COMA_in_ruleAttributeName1013 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAttributeName1035 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_ruleAttributeName1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_ruleField1127 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleField1147 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COMA_in_ruleField1158 = new BitSet(new long[]{0x00000000F8001000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField1178 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_ruleField1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldType1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFieldType1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldType1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldType1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldType1307 = new BitSet(new long[]{0x0000000000000002L});

}