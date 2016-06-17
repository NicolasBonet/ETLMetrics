package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.CsharpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsharpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATATYPES", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'public class'", "':'", "'}'", "'['", "'('", "','", "')'", "']'", "'='", "'public '", "'public enum '", "'List'", "'IEnumerable'", "'<'", "'>'", "'get'", "';'", "'set'", "'.'", "'_'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_DATATYPES=6;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalCsharpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCsharpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCsharpParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g"; }



     	private CsharpGrammarAccess grammarAccess;
     	
        public InternalCsharpParser(TokenStream input, CsharpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CSharp";	
       	}
       	
       	@Override
       	protected CsharpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCSharp"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:67:1: entryRuleCSharp returns [EObject current=null] : iv_ruleCSharp= ruleCSharp EOF ;
    public final EObject entryRuleCSharp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSharp = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:68:2: (iv_ruleCSharp= ruleCSharp EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:69:2: iv_ruleCSharp= ruleCSharp EOF
            {
             newCompositeNode(grammarAccess.getCSharpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCSharp_in_entryRuleCSharp75);
            iv_ruleCSharp=ruleCSharp();

            state._fsp--;

             current =iv_ruleCSharp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCSharp85); 

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
    // $ANTLR end "entryRuleCSharp"


    // $ANTLR start "ruleCSharp"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:76:1: ruleCSharp returns [EObject current=null] : ( () ( (lv_clases_1_0= ruleClase ) )* ) ;
    public final EObject ruleCSharp() throws RecognitionException {
        EObject current = null;

        EObject lv_clases_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:79:28: ( ( () ( (lv_clases_1_0= ruleClase ) )* ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:80:1: ( () ( (lv_clases_1_0= ruleClase ) )* )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:80:1: ( () ( (lv_clases_1_0= ruleClase ) )* )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:80:2: () ( (lv_clases_1_0= ruleClase ) )*
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:80:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCSharpAccess().getCSharpAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:86:2: ( (lv_clases_1_0= ruleClase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==17||LA1_0==19||LA1_0==21||LA1_0==29||(LA1_0>=31 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:87:1: (lv_clases_1_0= ruleClase )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:87:1: (lv_clases_1_0= ruleClase )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:88:3: lv_clases_1_0= ruleClase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCSharpAccess().getClasesClaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClase_in_ruleCSharp140);
            	    lv_clases_1_0=ruleClase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCSharpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"clases",
            	            		lv_clases_1_0, 
            	            		"Clase");
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
    // $ANTLR end "ruleCSharp"


    // $ANTLR start "entryRuleClase"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:112:1: entryRuleClase returns [EObject current=null] : iv_ruleClase= ruleClase EOF ;
    public final EObject entryRuleClase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClase = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:113:2: (iv_ruleClase= ruleClase EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:114:2: iv_ruleClase= ruleClase EOF
            {
             newCompositeNode(grammarAccess.getClaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClase_in_entryRuleClase177);
            iv_ruleClase=ruleClase();

            state._fsp--;

             current =iv_ruleClase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClase187); 

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
    // $ANTLR end "entryRuleClase"


    // $ANTLR start "ruleClase"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:121:1: ruleClase returns [EObject current=null] : ( () ( (lv_namespace_1_0= ruleExpressionString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= 'public class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) ( (lv_constructores_10_0= ruleConstructor ) )* ( (lv_enums_11_0= ruleEnum ) )* ( (lv_propiedades_12_0= rulePropiedad ) )* ( (lv_metodos_13_0= ruleMetodo ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleClase() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_super_7_0=null;
        Token otherlv_8=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;

        EObject lv_atributos_3_0 = null;

        AntlrDatatypeRuleToken lv_texto_9_0 = null;

        EObject lv_constructores_10_0 = null;

        EObject lv_enums_11_0 = null;

        EObject lv_propiedades_12_0 = null;

        EObject lv_metodos_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:124:28: ( ( () ( (lv_namespace_1_0= ruleExpressionString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= 'public class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) ( (lv_constructores_10_0= ruleConstructor ) )* ( (lv_enums_11_0= ruleEnum ) )* ( (lv_propiedades_12_0= rulePropiedad ) )* ( (lv_metodos_13_0= ruleMetodo ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:125:1: ( () ( (lv_namespace_1_0= ruleExpressionString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= 'public class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) ( (lv_constructores_10_0= ruleConstructor ) )* ( (lv_enums_11_0= ruleEnum ) )* ( (lv_propiedades_12_0= rulePropiedad ) )* ( (lv_metodos_13_0= ruleMetodo ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:125:1: ( () ( (lv_namespace_1_0= ruleExpressionString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= 'public class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) ( (lv_constructores_10_0= ruleConstructor ) )* ( (lv_enums_11_0= ruleEnum ) )* ( (lv_propiedades_12_0= rulePropiedad ) )* ( (lv_metodos_13_0= ruleMetodo ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:125:2: () ( (lv_namespace_1_0= ruleExpressionString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= 'public class' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) ) )? otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) ( (lv_constructores_10_0= ruleConstructor ) )* ( (lv_enums_11_0= ruleEnum ) )* ( (lv_propiedades_12_0= rulePropiedad ) )* ( (lv_metodos_13_0= ruleMetodo ) )* otherlv_14= '}' otherlv_15= '}'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:125:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:126:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClaseAccess().getClaseAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:131:2: ( (lv_namespace_1_0= ruleExpressionString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:132:1: (lv_namespace_1_0= ruleExpressionString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:132:1: (lv_namespace_1_0= ruleExpressionString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:133:3: lv_namespace_1_0= ruleExpressionString
            {
             
            	        newCompositeNode(grammarAccess.getClaseAccess().getNamespaceExpressionStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_ruleClase242);
            lv_namespace_1_0=ruleExpressionString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_1_0, 
                    		"ExpressionString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClase254); 

                	newLeafNode(otherlv_2, grammarAccess.getClaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:153:1: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:154:1: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:154:1: (lv_atributos_3_0= ruleAtributo )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:155:3: lv_atributos_3_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClaseAccess().getAtributosAtributoParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_ruleClase275);
            	    lv_atributos_3_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributos",
            	            		lv_atributos_3_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClase288); 

                	newLeafNode(otherlv_4, grammarAccess.getClaseAccess().getPublicClassKeyword_4());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:175:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:176:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:176:1: (lv_name_5_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:177:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClase305); 

            			newLeafNode(lv_name_5_0, grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:193:2: (otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:193:4: otherlv_6= ':' ( (lv_super_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClase323); 

                        	newLeafNode(otherlv_6, grammarAccess.getClaseAccess().getColonKeyword_6_0());
                        
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:197:1: ( (lv_super_7_0= RULE_ID ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:198:1: (lv_super_7_0= RULE_ID )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:198:1: (lv_super_7_0= RULE_ID )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:199:3: lv_super_7_0= RULE_ID
                    {
                    lv_super_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClase340); 

                    			newLeafNode(lv_super_7_0, grammarAccess.getClaseAccess().getSuperIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"super",
                            		lv_super_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClase359); 

                	newLeafNode(otherlv_8, grammarAccess.getClaseAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:219:1: ( (lv_texto_9_0= ruleExpressionString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:220:1: (lv_texto_9_0= ruleExpressionString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:220:1: (lv_texto_9_0= ruleExpressionString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:221:3: lv_texto_9_0= ruleExpressionString
            {
             
            	        newCompositeNode(grammarAccess.getClaseAccess().getTextoExpressionStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_ruleClase380);
            lv_texto_9_0=ruleExpressionString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	        }
                   		set(
                   			current, 
                   			"texto",
                    		lv_texto_9_0, 
                    		"ExpressionString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:237:2: ( (lv_constructores_10_0= ruleConstructor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3==17) ) {
                            alt4=1;
                        }


                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:238:1: (lv_constructores_10_0= ruleConstructor )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:238:1: (lv_constructores_10_0= ruleConstructor )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:239:3: lv_constructores_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClaseAccess().getConstructoresConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstructor_in_ruleClase401);
            	    lv_constructores_10_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructores",
            	            		lv_constructores_10_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:255:3: ( (lv_enums_11_0= ruleEnum ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:256:1: (lv_enums_11_0= ruleEnum )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:256:1: (lv_enums_11_0= ruleEnum )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:257:3: lv_enums_11_0= ruleEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClaseAccess().getEnumsEnumParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_ruleClase423);
            	    lv_enums_11_0=ruleEnum();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enums",
            	            		lv_enums_11_0, 
            	            		"Enum");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:273:3: ( (lv_propiedades_12_0= rulePropiedad ) )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:274:1: (lv_propiedades_12_0= rulePropiedad )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:274:1: (lv_propiedades_12_0= rulePropiedad )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:275:3: lv_propiedades_12_0= rulePropiedad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClaseAccess().getPropiedadesPropiedadParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePropiedad_in_ruleClase445);
            	    lv_propiedades_12_0=rulePropiedad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propiedades",
            	            		lv_propiedades_12_0, 
            	            		"Propiedad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:291:3: ( (lv_metodos_13_0= ruleMetodo ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:292:1: (lv_metodos_13_0= ruleMetodo )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:292:1: (lv_metodos_13_0= ruleMetodo )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:293:3: lv_metodos_13_0= ruleMetodo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClaseAccess().getMetodosMetodoParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMetodo_in_ruleClase467);
            	    lv_metodos_13_0=ruleMetodo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metodos",
            	            		lv_metodos_13_0, 
            	            		"Metodo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClase480); 

                	newLeafNode(otherlv_14, grammarAccess.getClaseAccess().getRightCurlyBracketKeyword_13());
                
            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClase492); 

                	newLeafNode(otherlv_15, grammarAccess.getClaseAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleClase"


    // $ANTLR start "entryRuleAtributo"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:325:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:326:2: (iv_ruleAtributo= ruleAtributo EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:327:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_entryRuleAtributo528);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtributo538); 

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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:334:1: ruleAtributo returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')' )? otherlv_9= ']' ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_valor_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_propiedades_4_0 = null;

        EObject lv_propiedades_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:337:28: ( ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')' )? otherlv_9= ']' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:338:1: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')' )? otherlv_9= ']' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:338:1: ( () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')' )? otherlv_9= ']' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:338:2: () otherlv_1= '[' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')' )? otherlv_9= ']'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:338:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:339:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoAccess().getAtributoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtributo584); 

                	newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:348:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:349:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:349:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:350:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAtributo601); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:366:2: (otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:366:4: otherlv_3= '(' ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) ) otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtributo619); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtributoAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:370:1: ( ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* ) | ( (lv_valor_7_0= RULE_STRING ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_STRING) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:370:2: ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* )
                            {
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:370:2: ( ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )* )
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:370:3: ( (lv_propiedades_4_0= rulePropiedadAtributo ) ) (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )*
                            {
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:370:3: ( (lv_propiedades_4_0= rulePropiedadAtributo ) )
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:371:1: (lv_propiedades_4_0= rulePropiedadAtributo )
                            {
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:371:1: (lv_propiedades_4_0= rulePropiedadAtributo )
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:372:3: lv_propiedades_4_0= rulePropiedadAtributo
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtributoAccess().getPropiedadesPropiedadAtributoParserRuleCall_3_1_0_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_rulePropiedadAtributo_in_ruleAtributo642);
                            lv_propiedades_4_0=rulePropiedadAtributo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAtributoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"propiedades",
                                    		lv_propiedades_4_0, 
                                    		"PropiedadAtributo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:388:2: (otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==18) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:388:4: otherlv_5= ',' ( (lv_propiedades_6_0= rulePropiedadAtributo ) )
                            	    {
                            	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAtributo655); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getCommaKeyword_3_1_0_1_0());
                            	        
                            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:392:1: ( (lv_propiedades_6_0= rulePropiedadAtributo ) )
                            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:393:1: (lv_propiedades_6_0= rulePropiedadAtributo )
                            	    {
                            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:393:1: (lv_propiedades_6_0= rulePropiedadAtributo )
                            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:394:3: lv_propiedades_6_0= rulePropiedadAtributo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAtributoAccess().getPropiedadesPropiedadAtributoParserRuleCall_3_1_0_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_rulePropiedadAtributo_in_ruleAtributo676);
                            	    lv_propiedades_6_0=rulePropiedadAtributo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAtributoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"propiedades",
                            	            		lv_propiedades_6_0, 
                            	            		"PropiedadAtributo");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:411:6: ( (lv_valor_7_0= RULE_STRING ) )
                            {
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:411:6: ( (lv_valor_7_0= RULE_STRING ) )
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:412:1: (lv_valor_7_0= RULE_STRING )
                            {
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:412:1: (lv_valor_7_0= RULE_STRING )
                            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:413:3: lv_valor_7_0= RULE_STRING
                            {
                            lv_valor_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAtributo702); 

                            			newLeafNode(lv_valor_7_0, grammarAccess.getAtributoAccess().getValorSTRINGTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtributoRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"valor",
                                    		lv_valor_7_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAtributo720); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtributo734); 

                	newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRulePropiedadAtributo"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:445:1: entryRulePropiedadAtributo returns [EObject current=null] : iv_rulePropiedadAtributo= rulePropiedadAtributo EOF ;
    public final EObject entryRulePropiedadAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedadAtributo = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:446:2: (iv_rulePropiedadAtributo= rulePropiedadAtributo EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:447:2: iv_rulePropiedadAtributo= rulePropiedadAtributo EOF
            {
             newCompositeNode(grammarAccess.getPropiedadAtributoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedadAtributo_in_entryRulePropiedadAtributo770);
            iv_rulePropiedadAtributo=rulePropiedadAtributo();

            state._fsp--;

             current =iv_rulePropiedadAtributo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropiedadAtributo780); 

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
    // $ANTLR end "entryRulePropiedadAtributo"


    // $ANTLR start "rulePropiedadAtributo"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:454:1: rulePropiedadAtributo returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleEString ) ) ) ;
    public final EObject rulePropiedadAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_valor_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:457:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleEString ) ) ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:458:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleEString ) ) )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:458:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleEString ) ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:458:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleEString ) )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:458:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:459:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropiedadAtributoAccess().getPropiedadAtributoAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:464:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:465:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:465:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:466:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropiedadAtributo831); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPropiedadAtributoAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropiedadAtributoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePropiedadAtributo848); 

                	newLeafNode(otherlv_2, grammarAccess.getPropiedadAtributoAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:486:1: ( (lv_valor_3_0= ruleEString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:487:1: (lv_valor_3_0= ruleEString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:487:1: (lv_valor_3_0= ruleEString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:488:3: lv_valor_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropiedadAtributoAccess().getValorEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePropiedadAtributo869);
            lv_valor_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropiedadAtributoRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"EString");
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
    // $ANTLR end "rulePropiedadAtributo"


    // $ANTLR start "entryRuleConstructor"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:512:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:513:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:514:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstructor_in_entryRuleConstructor905);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructor915); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:521:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'public ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) otherlv_10= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_parametros_4_0 = null;

        EObject lv_parametros_6_0 = null;

        AntlrDatatypeRuleToken lv_texto_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:524:28: ( ( () otherlv_1= 'public ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) otherlv_10= '}' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:525:1: ( () otherlv_1= 'public ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) otherlv_10= '}' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:525:1: ( () otherlv_1= 'public ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) otherlv_10= '}' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:525:2: () otherlv_1= 'public ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_texto_9_0= ruleExpressionString ) ) otherlv_10= '}'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:525:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:526:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstructorAccess().getConstructorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstructor961); 

                	newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getPublicKeyword_1());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:535:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:536:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:536:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:537:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstructor978); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstructorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstructor995); 

                	newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:557:1: ( ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_DATATYPES)||LA12_0==16||(LA12_0>=24 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:557:2: ( (lv_parametros_4_0= ruleParametro ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )*
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:557:2: ( (lv_parametros_4_0= ruleParametro ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:558:1: (lv_parametros_4_0= ruleParametro )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:558:1: (lv_parametros_4_0= ruleParametro )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:559:3: lv_parametros_4_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getParametrosParametroParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametro_in_ruleConstructor1017);
                    lv_parametros_4_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_4_0, 
                            		"Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:575:2: (otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:575:4: otherlv_5= ',' ( (lv_parametros_6_0= ruleParametro ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstructor1030); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:579:1: ( (lv_parametros_6_0= ruleParametro ) )
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:580:1: (lv_parametros_6_0= ruleParametro )
                    	    {
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:580:1: (lv_parametros_6_0= ruleParametro )
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:581:3: lv_parametros_6_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstructorAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametro_in_ruleConstructor1051);
                    	    lv_parametros_6_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_6_0, 
                    	            		"Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstructor1067); 

                	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_5());
                
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstructor1079); 

                	newLeafNode(otherlv_8, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:605:1: ( (lv_texto_9_0= ruleExpressionString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:606:1: (lv_texto_9_0= ruleExpressionString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:606:1: (lv_texto_9_0= ruleExpressionString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:607:3: lv_texto_9_0= ruleExpressionString
            {
             
            	        newCompositeNode(grammarAccess.getConstructorAccess().getTextoExpressionStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_ruleConstructor1100);
            lv_texto_9_0=ruleExpressionString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	        }
                   		set(
                   			current, 
                   			"texto",
                    		lv_texto_9_0, 
                    		"ExpressionString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstructor1112); 

                	newLeafNode(otherlv_10, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:635:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:636:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:637:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum1148);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum1158); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:644:1: ruleEnum returns [EObject current=null] : ( () otherlv_1= 'public enum ' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_valores_4_0 = null;

        EObject lv_valores_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:647:28: ( ( () otherlv_1= 'public enum ' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )* )? otherlv_7= '}' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:648:1: ( () otherlv_1= 'public enum ' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )* )? otherlv_7= '}' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:648:1: ( () otherlv_1= 'public enum ' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )* )? otherlv_7= '}' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:648:2: () otherlv_1= 'public enum ' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )* )? otherlv_7= '}'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:648:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:649:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumAccess().getEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnum1204); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getPublicEnumKeyword_1());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:658:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:659:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:659:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:660:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnum1225);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnum1237); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:680:1: ( ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:680:2: ( (lv_valores_4_0= ruleEnumLiteral ) ) (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )*
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:680:2: ( (lv_valores_4_0= ruleEnumLiteral ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:681:1: (lv_valores_4_0= ruleEnumLiteral )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:681:1: (lv_valores_4_0= ruleEnumLiteral )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:682:3: lv_valores_4_0= ruleEnumLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumAccess().getValoresEnumLiteralParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteral_in_ruleEnum1259);
                    lv_valores_4_0=ruleEnumLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_4_0, 
                            		"EnumLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:698:2: (otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:698:4: otherlv_5= ',' ( (lv_valores_6_0= ruleEnumLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnum1272); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:702:1: ( (lv_valores_6_0= ruleEnumLiteral ) )
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:703:1: (lv_valores_6_0= ruleEnumLiteral )
                    	    {
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:703:1: (lv_valores_6_0= ruleEnumLiteral )
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:704:3: lv_valores_6_0= ruleEnumLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumAccess().getValoresEnumLiteralParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteral_in_ruleEnum1293);
                    	    lv_valores_6_0=ruleEnumLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_6_0, 
                    	            		"EnumLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnum1309); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:732:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:733:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:734:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1345);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteral1355); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:741:1: ruleEnumLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:744:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:745:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:745:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:745:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:745:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:746:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:751:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:752:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:752:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:753:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumLiteralAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumLiteral1410);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleList"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:777:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:778:2: (iv_ruleList= ruleList EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:779:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList1446);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList1456); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:786:1: ruleList returns [EObject current=null] : ( (otherlv_0= 'List' | otherlv_1= 'IEnumerable' ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:789:28: ( ( (otherlv_0= 'List' | otherlv_1= 'IEnumerable' ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:790:1: ( (otherlv_0= 'List' | otherlv_1= 'IEnumerable' ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:790:1: ( (otherlv_0= 'List' | otherlv_1= 'IEnumerable' ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:790:2: (otherlv_0= 'List' | otherlv_1= 'IEnumerable' ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:790:2: (otherlv_0= 'List' | otherlv_1= 'IEnumerable' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:790:4: otherlv_0= 'List'
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleList1494); 

                        	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:795:7: otherlv_1= 'IEnumerable'
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleList1512); 

                        	newLeafNode(otherlv_1, grammarAccess.getListAccess().getIEnumerableKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleList1525); 

                	newLeafNode(otherlv_2, grammarAccess.getListAccess().getLessThanSignKeyword_1());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:803:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:804:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:804:1: (otherlv_3= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:805:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList1545); 

            		newLeafNode(otherlv_3, grammarAccess.getListAccess().getClaseClaseCrossReference_2_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleList1557); 

                	newLeafNode(otherlv_4, grammarAccess.getListAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRulePropiedad"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:830:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:831:2: (iv_rulePropiedad= rulePropiedad EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:832:2: iv_rulePropiedad= rulePropiedad EOF
            {
             newCompositeNode(grammarAccess.getPropiedadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedad_in_entryRulePropiedad1595);
            iv_rulePropiedad=rulePropiedad();

            state._fsp--;

             current =iv_rulePropiedad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropiedad1605); 

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
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:839:1: rulePropiedad returns [EObject current=null] : ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' (otherlv_8= 'get' otherlv_9= ';' )? (otherlv_10= 'set' otherlv_11= ';' )? otherlv_12= '}' ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_tipoPrimitivo_4_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_atributos_1_0 = null;

        EObject lv_lista_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:842:28: ( ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' (otherlv_8= 'get' otherlv_9= ';' )? (otherlv_10= 'set' otherlv_11= ';' )? otherlv_12= '}' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:843:1: ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' (otherlv_8= 'get' otherlv_9= ';' )? (otherlv_10= 'set' otherlv_11= ';' )? otherlv_12= '}' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:843:1: ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' (otherlv_8= 'get' otherlv_9= ';' )? (otherlv_10= 'set' otherlv_11= ';' )? otherlv_12= '}' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:843:2: () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' (otherlv_8= 'get' otherlv_9= ';' )? (otherlv_10= 'set' otherlv_11= ';' )? otherlv_12= '}'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:843:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:844:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropiedadAccess().getPropiedadAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:849:2: ( (lv_atributos_1_0= ruleAtributo ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:850:1: (lv_atributos_1_0= ruleAtributo )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:850:1: (lv_atributos_1_0= ruleAtributo )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:851:3: lv_atributos_1_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropiedadAccess().getAtributosAtributoParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rulePropiedad1660);
            	    lv_atributos_1_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropiedadRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributos",
            	            		lv_atributos_1_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePropiedad1673); 

                	newLeafNode(otherlv_2, grammarAccess.getPropiedadAccess().getPublicKeyword_2());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:871:1: ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_DATATYPES:
                {
                alt17=2;
                }
                break;
            case 24:
            case 25:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:871:2: ( ( ruleEString ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:871:2: ( ( ruleEString ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:872:1: ( ruleEString )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:872:1: ( ruleEString )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:873:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropiedadRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPropiedadAccess().getTipoTipoCrossReference_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePropiedad1697);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:887:6: ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:887:6: ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:888:1: (lv_tipoPrimitivo_4_0= RULE_DATATYPES )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:888:1: (lv_tipoPrimitivo_4_0= RULE_DATATYPES )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:889:3: lv_tipoPrimitivo_4_0= RULE_DATATYPES
                    {
                    lv_tipoPrimitivo_4_0=(Token)match(input,RULE_DATATYPES,FollowSets000.FOLLOW_RULE_DATATYPES_in_rulePropiedad1720); 

                    			newLeafNode(lv_tipoPrimitivo_4_0, grammarAccess.getPropiedadAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropiedadRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tipoPrimitivo",
                            		lv_tipoPrimitivo_4_0, 
                            		"DATATYPES");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:906:6: ( (lv_lista_5_0= ruleList ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:906:6: ( (lv_lista_5_0= ruleList ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:907:1: (lv_lista_5_0= ruleList )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:907:1: (lv_lista_5_0= ruleList )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:908:3: lv_lista_5_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropiedadAccess().getListaListParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_rulePropiedad1752);
                    lv_lista_5_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropiedadRule());
                    	        }
                           		add(
                           			current, 
                           			"lista",
                            		lv_lista_5_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:924:3: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:925:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:925:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:926:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropiedad1770); 

            			newLeafNode(lv_name_6_0, grammarAccess.getPropiedadAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropiedadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePropiedad1787); 

                	newLeafNode(otherlv_7, grammarAccess.getPropiedadAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:946:1: (otherlv_8= 'get' otherlv_9= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:946:3: otherlv_8= 'get' otherlv_9= ';'
                    {
                    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePropiedad1800); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropiedadAccess().getGetKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePropiedad1812); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropiedadAccess().getSemicolonKeyword_6_1());
                        

                    }
                    break;

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:954:3: (otherlv_10= 'set' otherlv_11= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:954:5: otherlv_10= 'set' otherlv_11= ';'
                    {
                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePropiedad1827); 

                        	newLeafNode(otherlv_10, grammarAccess.getPropiedadAccess().getSetKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePropiedad1839); 

                        	newLeafNode(otherlv_11, grammarAccess.getPropiedadAccess().getSemicolonKeyword_7_1());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePropiedad1853); 

                	newLeafNode(otherlv_12, grammarAccess.getPropiedadAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleMetodo"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:974:1: entryRuleMetodo returns [EObject current=null] : iv_ruleMetodo= ruleMetodo EOF ;
    public final EObject entryRuleMetodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetodo = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:975:2: (iv_ruleMetodo= ruleMetodo EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:976:2: iv_ruleMetodo= ruleMetodo EOF
            {
             newCompositeNode(grammarAccess.getMetodoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetodo_in_entryRuleMetodo1889);
            iv_ruleMetodo=ruleMetodo();

            state._fsp--;

             current =iv_ruleMetodo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetodo1899); 

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
    // $ANTLR end "entryRuleMetodo"


    // $ANTLR start "ruleMetodo"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:983:1: ruleMetodo returns [EObject current=null] : ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_texto_13_0= ruleExpressionString ) ) otherlv_14= '}' ) ;
    public final EObject ruleMetodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_tipoPrimitivo_4_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_atributos_1_0 = null;

        EObject lv_lista_5_0 = null;

        EObject lv_parametros_8_0 = null;

        EObject lv_parametros_10_0 = null;

        AntlrDatatypeRuleToken lv_texto_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:986:28: ( ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_texto_13_0= ruleExpressionString ) ) otherlv_14= '}' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:987:1: ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_texto_13_0= ruleExpressionString ) ) otherlv_14= '}' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:987:1: ( () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_texto_13_0= ruleExpressionString ) ) otherlv_14= '}' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:987:2: () ( (lv_atributos_1_0= ruleAtributo ) )* otherlv_2= 'public ' ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_texto_13_0= ruleExpressionString ) ) otherlv_14= '}'
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:987:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:988:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMetodoAccess().getMetodoAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:993:2: ( (lv_atributos_1_0= ruleAtributo ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:994:1: (lv_atributos_1_0= ruleAtributo )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:994:1: (lv_atributos_1_0= ruleAtributo )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:995:3: lv_atributos_1_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetodoAccess().getAtributosAtributoParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_ruleMetodo1954);
            	    lv_atributos_1_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetodoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributos",
            	            		lv_atributos_1_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMetodo1967); 

                	newLeafNode(otherlv_2, grammarAccess.getMetodoAccess().getPublicKeyword_2());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1015:1: ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) ) | ( (lv_lista_5_0= ruleList ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case RULE_DATATYPES:
                {
                alt21=2;
                }
                break;
            case 24:
            case 25:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1015:2: ( ( ruleEString ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1015:2: ( ( ruleEString ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1016:1: ( ruleEString )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1016:1: ( ruleEString )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1017:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetodoRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMetodoAccess().getTipoTipoCrossReference_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMetodo1991);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1031:6: ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1031:6: ( (lv_tipoPrimitivo_4_0= RULE_DATATYPES ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1032:1: (lv_tipoPrimitivo_4_0= RULE_DATATYPES )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1032:1: (lv_tipoPrimitivo_4_0= RULE_DATATYPES )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1033:3: lv_tipoPrimitivo_4_0= RULE_DATATYPES
                    {
                    lv_tipoPrimitivo_4_0=(Token)match(input,RULE_DATATYPES,FollowSets000.FOLLOW_RULE_DATATYPES_in_ruleMetodo2014); 

                    			newLeafNode(lv_tipoPrimitivo_4_0, grammarAccess.getMetodoAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetodoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tipoPrimitivo",
                            		lv_tipoPrimitivo_4_0, 
                            		"DATATYPES");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1050:6: ( (lv_lista_5_0= ruleList ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1050:6: ( (lv_lista_5_0= ruleList ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1051:1: (lv_lista_5_0= ruleList )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1051:1: (lv_lista_5_0= ruleList )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1052:3: lv_lista_5_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetodoAccess().getListaListParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleMetodo2046);
                    lv_lista_5_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetodoRule());
                    	        }
                           		add(
                           			current, 
                           			"lista",
                            		lv_lista_5_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1068:3: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1069:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1069:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1070:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetodo2064); 

            			newLeafNode(lv_name_6_0, grammarAccess.getMetodoAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetodoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMetodo2081); 

                	newLeafNode(otherlv_7, grammarAccess.getMetodoAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1090:1: ( ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DATATYPES)||LA23_0==16||(LA23_0>=24 && LA23_0<=25)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1090:2: ( (lv_parametros_8_0= ruleParametro ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )*
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1090:2: ( (lv_parametros_8_0= ruleParametro ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1091:1: (lv_parametros_8_0= ruleParametro )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1091:1: (lv_parametros_8_0= ruleParametro )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1092:3: lv_parametros_8_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetodoAccess().getParametrosParametroParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametro_in_ruleMetodo2103);
                    lv_parametros_8_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetodoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_8_0, 
                            		"Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1108:2: (otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1108:4: otherlv_9= ',' ( (lv_parametros_10_0= ruleParametro ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMetodo2116); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getMetodoAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1112:1: ( (lv_parametros_10_0= ruleParametro ) )
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1113:1: (lv_parametros_10_0= ruleParametro )
                    	    {
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1113:1: (lv_parametros_10_0= ruleParametro )
                    	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1114:3: lv_parametros_10_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetodoAccess().getParametrosParametroParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametro_in_ruleMetodo2137);
                    	    lv_parametros_10_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMetodoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_10_0, 
                    	            		"Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMetodo2153); 

                	newLeafNode(otherlv_11, grammarAccess.getMetodoAccess().getRightParenthesisKeyword_7());
                
            otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMetodo2165); 

                	newLeafNode(otherlv_12, grammarAccess.getMetodoAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1138:1: ( (lv_texto_13_0= ruleExpressionString ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1139:1: (lv_texto_13_0= ruleExpressionString )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1139:1: (lv_texto_13_0= ruleExpressionString )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1140:3: lv_texto_13_0= ruleExpressionString
            {
             
            	        newCompositeNode(grammarAccess.getMetodoAccess().getTextoExpressionStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_ruleMetodo2186);
            lv_texto_13_0=ruleExpressionString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetodoRule());
            	        }
                   		set(
                   			current, 
                   			"texto",
                    		lv_texto_13_0, 
                    		"ExpressionString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMetodo2198); 

                	newLeafNode(otherlv_14, grammarAccess.getMetodoAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleMetodo"


    // $ANTLR start "entryRuleParametro"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1168:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1169:2: (iv_ruleParametro= ruleParametro EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1170:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametro_in_entryRuleParametro2234);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametro2244); 

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
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1177:1: ruleParametro returns [EObject current=null] : ( () ( (lv_atributos_1_0= ruleAtributo ) )* ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) ) | ( (lv_lista_4_0= ruleList ) ) ) ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        Token lv_tipoPrimitivo_3_0=null;
        Token lv_name_5_0=null;
        EObject lv_atributos_1_0 = null;

        EObject lv_lista_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1180:28: ( ( () ( (lv_atributos_1_0= ruleAtributo ) )* ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) ) | ( (lv_lista_4_0= ruleList ) ) ) ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1181:1: ( () ( (lv_atributos_1_0= ruleAtributo ) )* ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) ) | ( (lv_lista_4_0= ruleList ) ) ) ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1181:1: ( () ( (lv_atributos_1_0= ruleAtributo ) )* ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) ) | ( (lv_lista_4_0= ruleList ) ) ) ( (lv_name_5_0= RULE_ID ) ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1181:2: () ( (lv_atributos_1_0= ruleAtributo ) )* ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) ) | ( (lv_lista_4_0= ruleList ) ) ) ( (lv_name_5_0= RULE_ID ) )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1181:2: ()
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1182:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametroAccess().getParametroAction_0(),
                        current);
                

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1187:2: ( (lv_atributos_1_0= ruleAtributo ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1188:1: (lv_atributos_1_0= ruleAtributo )
            	    {
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1188:1: (lv_atributos_1_0= ruleAtributo )
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1189:3: lv_atributos_1_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParametroAccess().getAtributosAtributoParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_ruleParametro2299);
            	    lv_atributos_1_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParametroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributos",
            	            		lv_atributos_1_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1205:3: ( ( ( ruleEString ) ) | ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) ) | ( (lv_lista_4_0= ruleList ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case RULE_DATATYPES:
                {
                alt25=2;
                }
                break;
            case 24:
            case 25:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1205:4: ( ( ruleEString ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1205:4: ( ( ruleEString ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1206:1: ( ruleEString )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1206:1: ( ruleEString )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1207:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParametroRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getParametroAccess().getTipoTipoCrossReference_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametro2324);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1221:6: ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1221:6: ( (lv_tipoPrimitivo_3_0= RULE_DATATYPES ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1222:1: (lv_tipoPrimitivo_3_0= RULE_DATATYPES )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1222:1: (lv_tipoPrimitivo_3_0= RULE_DATATYPES )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1223:3: lv_tipoPrimitivo_3_0= RULE_DATATYPES
                    {
                    lv_tipoPrimitivo_3_0=(Token)match(input,RULE_DATATYPES,FollowSets000.FOLLOW_RULE_DATATYPES_in_ruleParametro2347); 

                    			newLeafNode(lv_tipoPrimitivo_3_0, grammarAccess.getParametroAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParametroRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tipoPrimitivo",
                            		lv_tipoPrimitivo_3_0, 
                            		"DATATYPES");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1240:6: ( (lv_lista_4_0= ruleList ) )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1240:6: ( (lv_lista_4_0= ruleList ) )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1241:1: (lv_lista_4_0= ruleList )
                    {
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1241:1: (lv_lista_4_0= ruleList )
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1242:3: lv_lista_4_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getParametroAccess().getListaListParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleParametro2379);
                    lv_lista_4_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParametroRule());
                    	        }
                           		add(
                           			current, 
                           			"lista",
                            		lv_lista_4_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1258:3: ( (lv_name_5_0= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1259:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1259:1: (lv_name_5_0= RULE_ID )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1260:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParametro2397); 

            			newLeafNode(lv_name_5_0, grammarAccess.getParametroAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParametroRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1284:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1285:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1286:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2439);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2450); 

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
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1293:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1296:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1297:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1297:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1297:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2490); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1305:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2516); 

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


    // $ANTLR start "entryRuleCharacters"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1320:1: entryRuleCharacters returns [String current=null] : iv_ruleCharacters= ruleCharacters EOF ;
    public final String entryRuleCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCharacters = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1321:2: (iv_ruleCharacters= ruleCharacters EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1322:2: iv_ruleCharacters= ruleCharacters EOF
            {
             newCompositeNode(grammarAccess.getCharactersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacters_in_entryRuleCharacters2562);
            iv_ruleCharacters=ruleCharacters();

            state._fsp--;

             current =iv_ruleCharacters.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacters2573); 

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
    // $ANTLR end "entryRuleCharacters"


    // $ANTLR start "ruleCharacters"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1329:1: ruleCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= ';' | kw= '_' | kw= '(' | kw= ')' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1332:28: ( (this_ID_0= RULE_ID | kw= '.' | kw= ';' | kw= '_' | kw= '(' | kw= ')' | kw= '=' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1333:1: (this_ID_0= RULE_ID | kw= '.' | kw= ';' | kw= '_' | kw= '(' | kw= ')' | kw= '=' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1333:1: (this_ID_0= RULE_ID | kw= '.' | kw= ';' | kw= '_' | kw= '(' | kw= ')' | kw= '=' )
            int alt27=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 29:
                {
                alt27=3;
                }
                break;
            case 32:
                {
                alt27=4;
                }
                break;
            case 17:
                {
                alt27=5;
                }
                break;
            case 19:
                {
                alt27=6;
                }
                break;
            case 21:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1333:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacters2613); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getCharactersAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1342:2: kw= '.'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCharacters2637); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCharactersAccess().getFullStopKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1349:2: kw= ';'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCharacters2656); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCharactersAccess().getSemicolonKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1356:2: kw= '_'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacters2675); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCharactersAccess().get_Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1363:2: kw= '('
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCharacters2694); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCharactersAccess().getLeftParenthesisKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1370:2: kw= ')'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCharacters2713); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCharactersAccess().getRightParenthesisKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1377:2: kw= '='
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCharacters2732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCharactersAccess().getEqualsSignKeyword_6()); 
                        

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
    // $ANTLR end "ruleCharacters"


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1390:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1391:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1392:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock2773);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock2784); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1399:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_Characters_1= ruleCharacters )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Characters_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1402:28: ( (kw= '{' (this_Characters_1= ruleCharacters )* kw= '}' ) )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1403:1: (kw= '{' (this_Characters_1= ruleCharacters )* kw= '}' )
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1403:1: (kw= '{' (this_Characters_1= ruleCharacters )* kw= '}' )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1404:2: kw= '{' (this_Characters_1= ruleCharacters )* kw= '}'
            {
            kw=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBlock2822); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
                
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1409:1: (this_Characters_1= ruleCharacters )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==17||LA28_0==19||LA28_0==21||LA28_0==29||(LA28_0>=31 && LA28_0<=32)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1410:5: this_Characters_1= ruleCharacters
            	    {
            	     
            	            newCompositeNode(grammarAccess.getBlockAccess().getCharactersParserRuleCall_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacters_in_ruleBlock2845);
            	    this_Characters_1=ruleCharacters();

            	    state._fsp--;


            	    		current.merge(this_Characters_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBlock2865); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleExpressionString"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1434:1: entryRuleExpressionString returns [String current=null] : iv_ruleExpressionString= ruleExpressionString EOF ;
    public final String entryRuleExpressionString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionString = null;


        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1435:2: (iv_ruleExpressionString= ruleExpressionString EOF )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1436:2: iv_ruleExpressionString= ruleExpressionString EOF
            {
             newCompositeNode(grammarAccess.getExpressionStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_entryRuleExpressionString2906);
            iv_ruleExpressionString=ruleExpressionString();

            state._fsp--;

             current =iv_ruleExpressionString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionString2917); 

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
    // $ANTLR end "entryRuleExpressionString"


    // $ANTLR start "ruleExpressionString"
    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1443:1: ruleExpressionString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Characters_0= ruleCharacters | this_Block_1= ruleBlock )* ;
    public final AntlrDatatypeRuleToken ruleExpressionString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Characters_0 = null;

        AntlrDatatypeRuleToken this_Block_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1446:28: ( (this_Characters_0= ruleCharacters | this_Block_1= ruleBlock )* )
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1447:1: (this_Characters_0= ruleCharacters | this_Block_1= ruleBlock )*
            {
            // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1447:1: (this_Characters_0= ruleCharacters | this_Block_1= ruleBlock )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==12) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||LA29_1==15||LA29_1==17||LA29_1==19||LA29_1==21||LA29_1==29||(LA29_1>=31 && LA29_1<=32)) ) {
                        alt29=2;
                    }


                }
                else if ( (LA29_0==RULE_ID||LA29_0==17||LA29_0==19||LA29_0==21||LA29_0==29||(LA29_0>=31 && LA29_0<=32)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1448:5: this_Characters_0= ruleCharacters
            	    {
            	     
            	            newCompositeNode(grammarAccess.getExpressionStringAccess().getCharactersParserRuleCall_0()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacters_in_ruleExpressionString2964);
            	    this_Characters_0=ruleCharacters();

            	    state._fsp--;


            	    		current.merge(this_Characters_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.csharp/src-gen/org/xtext/parser/antlr/internal/InternalCsharp.g:1460:5: this_Block_1= ruleBlock
            	    {
            	     
            	            newCompositeNode(grammarAccess.getExpressionStringAccess().getBlockParserRuleCall_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleExpressionString2997);
            	    this_Block_1=ruleBlock();

            	    state._fsp--;


            	    		current.merge(this_Block_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleExpressionString"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\34\uffff";
    static final String DFA6_eofS =
        "\34\uffff";
    static final String DFA6_minS =
        "\1\17\2\4\1\uffff\1\21\3\4\2\32\1\4\1\20\1\14\1\4\1\25\1\23\1\uffff"+
        "\1\33\1\4\1\24\1\4\2\22\1\4\1\25\1\4\2\22";
    static final String DFA6_maxS =
        "\1\26\1\4\1\31\1\uffff\1\24\3\4\2\32\1\5\1\26\1\21\1\4\1\25\1\23"+
        "\1\uffff\1\33\1\5\1\24\1\4\2\23\1\4\1\25\1\5\2\23";
    static final String DFA6_acceptS =
        "\3\uffff\1\2\14\uffff\1\1\13\uffff";
    static final String DFA6_specialS =
        "\34\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\3\1\1\5\uffff\1\2",
            "\1\4",
            "\1\6\1\5\1\7\21\uffff\1\10\1\11",
            "",
            "\1\12\2\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\15",
            "\1\15",
            "\1\16\1\17",
            "\1\1\5\uffff\1\2",
            "\1\20\4\uffff\1\3",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "\1\24",
            "\1\26\1\25",
            "\1\13",
            "\1\14",
            "\1\27\1\23",
            "\1\27\1\23",
            "\1\30",
            "\1\31",
            "\1\33\1\32",
            "\1\27\1\23",
            "\1\27\1\23"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 273:3: ( (lv_propiedades_12_0= rulePropiedad ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCSharp_in_entryRuleCSharp75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCSharp85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClase_in_ruleCSharp140 = new BitSet(new long[]{0x00000001A02A1012L});
        public static final BitSet FOLLOW_ruleClase_in_entryRuleClase177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClase187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_ruleClase242 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClase254 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_ruleAtributo_in_ruleClase275 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleClase288 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClase305 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleClase323 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClase340 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClase359 = new BitSet(new long[]{0x00000001A0EB9010L});
        public static final BitSet FOLLOW_ruleExpressionString_in_ruleClase380 = new BitSet(new long[]{0x0000000000C18000L});
        public static final BitSet FOLLOW_ruleConstructor_in_ruleClase401 = new BitSet(new long[]{0x0000000000C18000L});
        public static final BitSet FOLLOW_ruleEnum_in_ruleClase423 = new BitSet(new long[]{0x0000000000C18000L});
        public static final BitSet FOLLOW_rulePropiedad_in_ruleClase445 = new BitSet(new long[]{0x0000000000418000L});
        public static final BitSet FOLLOW_ruleMetodo_in_ruleClase467 = new BitSet(new long[]{0x0000000000418000L});
        public static final BitSet FOLLOW_15_in_ruleClase480 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleClase492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtributo538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtributo584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAtributo601 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleAtributo619 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulePropiedadAtributo_in_ruleAtributo642 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAtributo655 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePropiedadAtributo_in_ruleAtributo676 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributo702 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAtributo720 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAtributo734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedadAtributo_in_entryRulePropiedadAtributo770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropiedadAtributo780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropiedadAtributo831 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePropiedadAtributo848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePropiedadAtributo869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructor915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleConstructor961 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor978 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConstructor995 = new BitSet(new long[]{0x0000000003090070L});
        public static final BitSet FOLLOW_ruleParametro_in_ruleConstructor1017 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleConstructor1030 = new BitSet(new long[]{0x0000000003010070L});
        public static final BitSet FOLLOW_ruleParametro_in_ruleConstructor1051 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleConstructor1067 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstructor1079 = new BitSet(new long[]{0x00000001A02A9010L});
        public static final BitSet FOLLOW_ruleExpressionString_in_ruleConstructor1100 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConstructor1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEnum1204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnum1225 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnum1237 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnum1259 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleEnum1272 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnum1293 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleEnum1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral1355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumLiteral1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList1446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleList1494 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_25_in_ruleList1512 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleList1525 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList1545 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleList1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedad_in_entryRulePropiedad1595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropiedad1605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rulePropiedad1660 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_rulePropiedad1673 = new BitSet(new long[]{0x0000000003010070L});
        public static final BitSet FOLLOW_ruleEString_in_rulePropiedad1697 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_DATATYPES_in_rulePropiedad1720 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleList_in_rulePropiedad1752 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropiedad1770 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePropiedad1787 = new BitSet(new long[]{0x0000000050008000L});
        public static final BitSet FOLLOW_28_in_rulePropiedad1800 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulePropiedad1812 = new BitSet(new long[]{0x0000000040008000L});
        public static final BitSet FOLLOW_30_in_rulePropiedad1827 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulePropiedad1839 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePropiedad1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetodo_in_entryRuleMetodo1889 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetodo1899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_ruleMetodo1954 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleMetodo1967 = new BitSet(new long[]{0x0000000003010070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMetodo1991 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_DATATYPES_in_ruleMetodo2014 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleList_in_ruleMetodo2046 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetodo2064 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMetodo2081 = new BitSet(new long[]{0x0000000003090070L});
        public static final BitSet FOLLOW_ruleParametro_in_ruleMetodo2103 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMetodo2116 = new BitSet(new long[]{0x0000000003010070L});
        public static final BitSet FOLLOW_ruleParametro_in_ruleMetodo2137 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMetodo2153 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMetodo2165 = new BitSet(new long[]{0x00000001A02A9010L});
        public static final BitSet FOLLOW_ruleExpressionString_in_ruleMetodo2186 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMetodo2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametro_in_entryRuleParametro2234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametro2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_ruleParametro2299 = new BitSet(new long[]{0x0000000003010070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametro2324 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_DATATYPES_in_ruleParametro2347 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleList_in_ruleParametro2379 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParametro2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacters_in_entryRuleCharacters2562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacters2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacters2613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCharacters2637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCharacters2656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCharacters2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleCharacters2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleCharacters2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCharacters2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock2773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock2784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBlock2822 = new BitSet(new long[]{0x00000001A02A8010L});
        public static final BitSet FOLLOW_ruleCharacters_in_ruleBlock2845 = new BitSet(new long[]{0x00000001A02A8010L});
        public static final BitSet FOLLOW_15_in_ruleBlock2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_entryRuleExpressionString2906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionString2917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacters_in_ruleExpressionString2964 = new BitSet(new long[]{0x00000001A02A1012L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleExpressionString2997 = new BitSet(new long[]{0x00000001A02A1012L});
    }


}