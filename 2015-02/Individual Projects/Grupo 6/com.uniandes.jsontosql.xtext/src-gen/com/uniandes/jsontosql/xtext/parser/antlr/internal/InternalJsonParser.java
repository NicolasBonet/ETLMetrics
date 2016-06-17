package com.uniandes.jsontosql.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.uniandes.jsontosql.xtext.services.JsonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'['", "']'", "':'", "','", "'-'", "'true'", "'false'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonParser.tokenNames; }
    public String getGrammarFileName() { return "../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g"; }



     	private JsonGrammarAccess grammarAccess;
     	
        public InternalJsonParser(TokenStream input, JsonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected JsonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:67:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:68:2: (iv_ruleDocument= ruleDocument EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:69:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:76:1: ruleDocument returns [EObject current=null] : ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;

        EObject lv_objects_2_0 = null;

        EObject lv_objects_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:79:28: ( ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:80:1: ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:80:1: ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:80:2: ( (lv_objects_0_0= ruleObject ) )
                    {
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:80:2: ( (lv_objects_0_0= ruleObject ) )
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:81:1: (lv_objects_0_0= ruleObject )
                    {
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:81:1: (lv_objects_0_0= ruleObject )
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:82:3: lv_objects_0_0= ruleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getObjectsObjectParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObject_in_ruleDocument131);
                    lv_objects_0_0=ruleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		add(
                           			current, 
                           			"objects",
                            		lv_objects_0_0, 
                            		"Object");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:99:6: ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE )
                    {
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:99:6: ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE )
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:100:5: ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE
                    {
                     
                            newCompositeNode(grammarAccess.getDocumentAccess().getLSQUAREParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleLSQUARE_in_ruleDocument154);
                    ruleLSQUARE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:107:1: ( (lv_objects_2_0= ruleObject ) )
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:108:1: (lv_objects_2_0= ruleObject )
                    {
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:108:1: (lv_objects_2_0= ruleObject )
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:109:3: lv_objects_2_0= ruleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getObjectsObjectParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObject_in_ruleDocument174);
                    lv_objects_2_0=ruleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		add(
                           			current, 
                           			"objects",
                            		lv_objects_2_0, 
                            		"Object");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:125:2: ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:126:5: ruleCOMMA ( (lv_objects_4_0= ruleObject ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getDocumentAccess().getCOMMAParserRuleCall_1_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleCOMMA_in_ruleDocument191);
                    	    ruleCOMMA();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:133:1: ( (lv_objects_4_0= ruleObject ) )
                    	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:134:1: (lv_objects_4_0= ruleObject )
                    	    {
                    	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:134:1: (lv_objects_4_0= ruleObject )
                    	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:135:3: lv_objects_4_0= ruleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDocumentAccess().getObjectsObjectParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleObject_in_ruleDocument211);
                    	    lv_objects_4_0=ruleObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"objects",
                    	            		lv_objects_4_0, 
                    	            		"Object");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getDocumentAccess().getRSQUAREParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleRSQUARE_in_ruleDocument229);
                    ruleRSQUARE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleObject"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:167:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:168:2: (iv_ruleObject= ruleObject EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:169:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject265);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject275); 

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:176:1: ruleObject returns [EObject current=null] : ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject lv_pairs_1_0 = null;

        EObject lv_pairs_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:179:28: ( ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:180:1: ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:180:1: ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:181:5: ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY
            {
             
                    newCompositeNode(grammarAccess.getObjectAccess().getLCURLYParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLCURLY_in_ruleObject316);
            ruleLCURLY();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:188:1: ( (lv_pairs_1_0= rulePair ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:189:1: (lv_pairs_1_0= rulePair )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:189:1: (lv_pairs_1_0= rulePair )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:190:3: lv_pairs_1_0= rulePair
            {
             
            	        newCompositeNode(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePair_in_ruleObject336);
            lv_pairs_1_0=rulePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	        }
                   		add(
                   			current, 
                   			"pairs",
                    		lv_pairs_1_0, 
                    		"Pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:206:2: ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:207:5: ruleCOMMA ( (lv_pairs_3_0= rulePair ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getObjectAccess().getCOMMAParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCOMMA_in_ruleObject353);
            	    ruleCOMMA();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:214:1: ( (lv_pairs_3_0= rulePair ) )
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:215:1: (lv_pairs_3_0= rulePair )
            	    {
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:215:1: (lv_pairs_3_0= rulePair )
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:216:3: lv_pairs_3_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePair_in_ruleObject373);
            	    lv_pairs_3_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_3_0, 
            	            		"Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getObjectAccess().getRCURLYParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleRCURLY_in_ruleObject391);
            ruleRCURLY();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRulePair"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:248:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:249:2: (iv_rulePair= rulePair EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:250:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair426);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair436); 

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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:257:1: rulePair returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ruleCOLON ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:260:28: ( ( ( (lv_name_0_0= ruleEString ) ) ruleCOLON ( (lv_value_2_0= ruleValue ) ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:261:1: ( ( (lv_name_0_0= ruleEString ) ) ruleCOLON ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:261:1: ( ( (lv_name_0_0= ruleEString ) ) ruleCOLON ( (lv_value_2_0= ruleValue ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:261:2: ( (lv_name_0_0= ruleEString ) ) ruleCOLON ( (lv_value_2_0= ruleValue ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:261:2: ( (lv_name_0_0= ruleEString ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:262:1: (lv_name_0_0= ruleEString )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:262:1: (lv_name_0_0= ruleEString )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:263:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_rulePair482);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getPairAccess().getCOLONParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCOLON_in_rulePair498);
            ruleCOLON();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:287:1: ( (lv_value_2_0= ruleValue ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:288:1: (lv_value_2_0= ruleValue )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:288:1: (lv_value_2_0= ruleValue )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:289:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePair518);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:313:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:314:2: (iv_ruleValue= ruleValue EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:315:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue554);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue564); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:322:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_DecimalValue_2 = null;

        EObject this_ArrayValue_3 = null;

        EObject this_BooleanValue_4 = null;

        EObject this_ValueObject_5 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:325:28: ( (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:326:1: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:326:1: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_INT) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==20) ) {
                        alt4=3;
                    }
                    else if ( (LA4_3==EOF||LA4_3==12||LA4_3==14||LA4_3==16) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==20) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==20) ) {
                    alt4=3;
                }
                else if ( (LA4_3==EOF||LA4_3==12||LA4_3==14||LA4_3==16) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 18:
            case 19:
                {
                alt4=5;
                }
                break;
            case 11:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:327:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue611);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:337:5: this_NumberValue_1= ruleNumberValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleValue638);
                    this_NumberValue_1=ruleNumberValue();

                    state._fsp--;

                     
                            current = this_NumberValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:347:5: this_DecimalValue_2= ruleDecimalValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDecimalValue_in_ruleValue665);
                    this_DecimalValue_2=ruleDecimalValue();

                    state._fsp--;

                     
                            current = this_DecimalValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:357:5: this_ArrayValue_3= ruleArrayValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleArrayValue_in_ruleValue692);
                    this_ArrayValue_3=ruleArrayValue();

                    state._fsp--;

                     
                            current = this_ArrayValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:367:5: this_BooleanValue_4= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue719);
                    this_BooleanValue_4=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:377:5: this_ValueObject_5= ruleValueObject
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getValueObjectParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleValueObject_in_ruleValue746);
                    this_ValueObject_5=ruleValueObject();

                    state._fsp--;

                     
                            current = this_ValueObject_5; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStringValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:393:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:394:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:395:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue781);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue791); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:402:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:405:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:406:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:406:1: ( (lv_value_0_0= ruleEString ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:407:1: (lv_value_0_0= ruleEString )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:407:1: (lv_value_0_0= ruleEString )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:408:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleStringValue836);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:432:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:433:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:434:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue871);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue881); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:441:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:444:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:445:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:445:1: ( (lv_value_0_0= ruleEInt ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:446:1: (lv_value_0_0= ruleEInt )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:446:1: (lv_value_0_0= ruleEInt )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:447:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberValueAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEInt_in_ruleNumberValue926);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EInt");
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleDecimalValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:471:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:472:2: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:473:2: iv_ruleDecimalValue= ruleDecimalValue EOF
            {
             newCompositeNode(grammarAccess.getDecimalValueRule()); 
            pushFollow(FOLLOW_ruleDecimalValue_in_entryRuleDecimalValue961);
            iv_ruleDecimalValue=ruleDecimalValue();

            state._fsp--;

             current =iv_ruleDecimalValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValue971); 

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
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:480:1: ruleDecimalValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:483:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:484:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:484:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:485:1: (lv_value_0_0= ruleEDouble )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:485:1: (lv_value_0_0= ruleEDouble )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:486:3: lv_value_0_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDecimalValueAccess().getValueEDoubleParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEDouble_in_ruleDecimalValue1016);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecimalValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EDouble");
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
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleValueObject"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:510:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:511:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:512:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject1051);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject1061); 

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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:519:1: ruleValueObject returns [EObject current=null] : ( (lv_value_0_0= ruleObject ) ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:522:28: ( ( (lv_value_0_0= ruleObject ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:523:1: ( (lv_value_0_0= ruleObject ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:523:1: ( (lv_value_0_0= ruleObject ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:524:1: (lv_value_0_0= ruleObject )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:524:1: (lv_value_0_0= ruleObject )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:525:3: lv_value_0_0= ruleObject
            {
             
            	        newCompositeNode(grammarAccess.getValueObjectAccess().getValueObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleObject_in_ruleValueObject1106);
            lv_value_0_0=ruleObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Object");
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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleArrayValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:549:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:550:2: (iv_ruleArrayValue= ruleArrayValue EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:551:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_ruleArrayValue_in_entryRuleArrayValue1141);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayValue1151); 

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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:558:1: ruleArrayValue returns [EObject current=null] : ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:561:28: ( ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:562:1: ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:562:1: ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:563:5: ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE
            {
             
                    newCompositeNode(grammarAccess.getArrayValueAccess().getLSQUAREParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLSQUARE_in_ruleArrayValue1192);
            ruleLSQUARE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:570:1: ( (lv_values_1_0= ruleValue ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:571:1: (lv_values_1_0= ruleValue )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:571:1: (lv_values_1_0= ruleValue )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:572:3: lv_values_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getArrayValueAccess().getValuesValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArrayValue1212);
            lv_values_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:588:2: ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:589:5: ruleCOMMA ( (lv_values_3_0= ruleValue ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getArrayValueAccess().getCOMMAParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCOMMA_in_ruleArrayValue1229);
            	    ruleCOMMA();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:596:1: ( (lv_values_3_0= ruleValue ) )
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:597:1: (lv_values_3_0= ruleValue )
            	    {
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:597:1: (lv_values_3_0= ruleValue )
            	    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:598:3: lv_values_3_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayValueAccess().getValuesValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArrayValue1249);
            	    lv_values_3_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getArrayValueAccess().getRSQUAREParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleRSQUARE_in_ruleArrayValue1267);
            ruleRSQUARE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:630:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:631:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:632:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1302);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1312); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:639:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:642:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:643:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:643:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:644:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:644:1: (lv_value_0_0= ruleEBoolean )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:645:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleBooleanValue1357);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EBoolean");
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLCURLY"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:669:1: entryRuleLCURLY returns [String current=null] : iv_ruleLCURLY= ruleLCURLY EOF ;
    public final String entryRuleLCURLY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLCURLY = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:670:2: (iv_ruleLCURLY= ruleLCURLY EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:671:2: iv_ruleLCURLY= ruleLCURLY EOF
            {
             newCompositeNode(grammarAccess.getLCURLYRule()); 
            pushFollow(FOLLOW_ruleLCURLY_in_entryRuleLCURLY1393);
            iv_ruleLCURLY=ruleLCURLY();

            state._fsp--;

             current =iv_ruleLCURLY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCURLY1404); 

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
    // $ANTLR end "entryRuleLCURLY"


    // $ANTLR start "ruleLCURLY"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:678:1: ruleLCURLY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLCURLY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:681:28: (kw= '{' )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:683:2: kw= '{'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleLCURLY1441); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLCURLYAccess().getLeftCurlyBracketKeyword()); 
                

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
    // $ANTLR end "ruleLCURLY"


    // $ANTLR start "entryRuleRCURLY"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:696:1: entryRuleRCURLY returns [String current=null] : iv_ruleRCURLY= ruleRCURLY EOF ;
    public final String entryRuleRCURLY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRCURLY = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:697:2: (iv_ruleRCURLY= ruleRCURLY EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:698:2: iv_ruleRCURLY= ruleRCURLY EOF
            {
             newCompositeNode(grammarAccess.getRCURLYRule()); 
            pushFollow(FOLLOW_ruleRCURLY_in_entryRuleRCURLY1481);
            iv_ruleRCURLY=ruleRCURLY();

            state._fsp--;

             current =iv_ruleRCURLY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRCURLY1492); 

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
    // $ANTLR end "entryRuleRCURLY"


    // $ANTLR start "ruleRCURLY"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:705:1: ruleRCURLY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRCURLY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:708:28: (kw= '}' )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:710:2: kw= '}'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleRCURLY1529); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRCURLYAccess().getRightCurlyBracketKeyword()); 
                

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
    // $ANTLR end "ruleRCURLY"


    // $ANTLR start "entryRuleLSQUARE"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:723:1: entryRuleLSQUARE returns [String current=null] : iv_ruleLSQUARE= ruleLSQUARE EOF ;
    public final String entryRuleLSQUARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLSQUARE = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:724:2: (iv_ruleLSQUARE= ruleLSQUARE EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:725:2: iv_ruleLSQUARE= ruleLSQUARE EOF
            {
             newCompositeNode(grammarAccess.getLSQUARERule()); 
            pushFollow(FOLLOW_ruleLSQUARE_in_entryRuleLSQUARE1569);
            iv_ruleLSQUARE=ruleLSQUARE();

            state._fsp--;

             current =iv_ruleLSQUARE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLSQUARE1580); 

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
    // $ANTLR end "entryRuleLSQUARE"


    // $ANTLR start "ruleLSQUARE"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:732:1: ruleLSQUARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '[' ;
    public final AntlrDatatypeRuleToken ruleLSQUARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:735:28: (kw= '[' )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:737:2: kw= '['
            {
            kw=(Token)match(input,13,FOLLOW_13_in_ruleLSQUARE1617); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLSQUAREAccess().getLeftSquareBracketKeyword()); 
                

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
    // $ANTLR end "ruleLSQUARE"


    // $ANTLR start "entryRuleRSQUARE"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:750:1: entryRuleRSQUARE returns [String current=null] : iv_ruleRSQUARE= ruleRSQUARE EOF ;
    public final String entryRuleRSQUARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRSQUARE = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:751:2: (iv_ruleRSQUARE= ruleRSQUARE EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:752:2: iv_ruleRSQUARE= ruleRSQUARE EOF
            {
             newCompositeNode(grammarAccess.getRSQUARERule()); 
            pushFollow(FOLLOW_ruleRSQUARE_in_entryRuleRSQUARE1657);
            iv_ruleRSQUARE=ruleRSQUARE();

            state._fsp--;

             current =iv_ruleRSQUARE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSQUARE1668); 

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
    // $ANTLR end "entryRuleRSQUARE"


    // $ANTLR start "ruleRSQUARE"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:759:1: ruleRSQUARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ']' ;
    public final AntlrDatatypeRuleToken ruleRSQUARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:762:28: (kw= ']' )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:764:2: kw= ']'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleRSQUARE1705); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRSQUAREAccess().getRightSquareBracketKeyword()); 
                

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
    // $ANTLR end "ruleRSQUARE"


    // $ANTLR start "entryRuleCOLON"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:777:1: entryRuleCOLON returns [String current=null] : iv_ruleCOLON= ruleCOLON EOF ;
    public final String entryRuleCOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLON = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:778:2: (iv_ruleCOLON= ruleCOLON EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:779:2: iv_ruleCOLON= ruleCOLON EOF
            {
             newCompositeNode(grammarAccess.getCOLONRule()); 
            pushFollow(FOLLOW_ruleCOLON_in_entryRuleCOLON1745);
            iv_ruleCOLON=ruleCOLON();

            state._fsp--;

             current =iv_ruleCOLON.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLON1756); 

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
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:786:1: ruleCOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleCOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:789:28: (kw= ':' )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:791:2: kw= ':'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleCOLON1793); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCOLONAccess().getColonKeyword()); 
                

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
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleCOMMA"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:804:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:805:2: (iv_ruleCOMMA= ruleCOMMA EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:806:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
             newCompositeNode(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_ruleCOMMA_in_entryRuleCOMMA1833);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;

             current =iv_ruleCOMMA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMMA1844); 

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
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:813:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:816:28: (kw= ',' )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:818:2: kw= ','
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleCOMMA1881); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword()); 
                

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
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleEString"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:835:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:836:2: (iv_ruleEString= ruleEString EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:837:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1925);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1936); 

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
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:844:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:847:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:848:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:848:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:848:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1976); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:856:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2002); 

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


    // $ANTLR start "entryRuleEInt"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:871:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:872:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:873:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt2048);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt2059); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:880:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:883:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:884:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:884:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:884:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:884:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:885:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleEInt2098); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt2115); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:905:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:906:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:907:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2161);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2172); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:914:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:917:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:918:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:918:1: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:919:2: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEBoolean2210); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:926:2: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleEBoolean2229); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDouble"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:939:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:940:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:941:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_ruleEDouble_in_entryRuleEDouble2270);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDouble2281); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:948:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:951:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:952:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:952:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:952:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:952:2: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:953:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleEDouble2320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:958:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:958:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEDouble2338); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_20_in_ruleEDouble2358); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEDouble2373); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:978:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=21 && LA13_0<=22)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:978:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:978:2: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==22) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:979:2: kw= 'E'
                            {
                            kw=(Token)match(input,21,FOLLOW_21_in_ruleEDouble2393); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:986:2: kw= 'e'
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_ruleEDouble2412); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:991:2: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==17) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.uniandes.jsontosql.xtext/src-gen/com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.g:992:2: kw= '-'
                            {
                            kw=(Token)match(input,17,FOLLOW_17_in_ruleEDouble2427); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEDouble2444); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

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
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSQUARE_in_ruleDocument154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleObject_in_ruleDocument174 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_ruleDocument191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleObject_in_ruleDocument211 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleRSQUARE_in_ruleDocument229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCURLY_in_ruleObject316 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePair_in_ruleObject336 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_ruleObject353 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulePair_in_ruleObject373 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleRCURLY_in_ruleObject391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rulePair482 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCOLON_in_rulePair498 = new BitSet(new long[]{0x00000000001E2870L});
    public static final BitSet FOLLOW_ruleValue_in_rulePair518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleValue638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValue_in_ruleValue665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValue_in_ruleValue692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleValue746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleStringValue836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleNumberValue926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValue_in_entryRuleDecimalValue961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValue971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDouble_in_ruleDecimalValue1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleValueObject1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValue_in_entryRuleArrayValue1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayValue1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSQUARE_in_ruleArrayValue1192 = new BitSet(new long[]{0x00000000001E2870L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArrayValue1212 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_ruleArrayValue1229 = new BitSet(new long[]{0x00000000001E2870L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArrayValue1249 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleRSQUARE_in_ruleArrayValue1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanValue1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCURLY_in_entryRuleLCURLY1393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCURLY1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleLCURLY1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRCURLY_in_entryRuleRCURLY1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRCURLY1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRCURLY1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSQUARE_in_entryRuleLSQUARE1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLSQUARE1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLSQUARE1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSQUARE_in_entryRuleRSQUARE1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSQUARE1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRSQUARE1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLON_in_entryRuleCOLON1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLON1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCOLON1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMMA_in_entryRuleCOMMA1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMMA1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCOMMA1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEInt2098 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEBoolean2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEBoolean2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEDouble2320 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2338 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEDouble2358 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2373 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleEDouble2393 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_22_in_ruleEDouble2412 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleEDouble2427 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2444 = new BitSet(new long[]{0x0000000000000002L});

}