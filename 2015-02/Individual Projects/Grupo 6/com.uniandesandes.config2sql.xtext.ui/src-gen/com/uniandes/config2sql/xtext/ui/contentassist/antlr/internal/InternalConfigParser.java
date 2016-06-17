package com.uniandes.config2sql.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.uniandes.config2sql.xtext.services.ConfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LITERACONFIG", "RULE_COLON", "RULE_LEFTPARENTESIS", "RULE_LITERACONNECTION", "RULE_RIGHTPARENTESIS", "RULE_LITERALMERGEDFIELDS", "RULE_LEFTBRACKET", "RULE_RIGHTBRACKET", "RULE_COMA", "RULE_LITERALURL", "RULE_LITERALUSERNAME", "RULE_LITERALPASSWORD", "RULE_LITERALFIELDS", "RULE_LITERALATTRIBUTENAMES", "RULE_LITERALTABLENAME", "RULE_SINGLEQUOTE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\'String\\''", "'\\'Integer\\''", "'\\'Float\\''", "'\\'Array\\''", "'\\'Boolean\\''"
    };
    public static final int RULE_LITERALMERGEDFIELDS=11;
    public static final int RULE_COMA=14;
    public static final int RULE_LITERALUSERNAME=16;
    public static final int RULE_STRING=4;
    public static final int RULE_LITERACONFIG=6;
    public static final int RULE_LITERALFIELDS=18;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_RIGHTBRACKET=13;
    public static final int RULE_SINGLEQUOTE=21;
    public static final int RULE_LITERACONNECTION=9;
    public static final int RULE_LITERALATTRIBUTENAMES=19;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=25;
    public static final int RULE_RIGHTPARENTESIS=10;
    public static final int RULE_LITERALTABLENAME=20;
    public static final int RULE_COLON=7;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_LITERALPASSWORD=17;
    public static final int RULE_LEFTBRACKET=12;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=22;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_LITERALURL=15;
    public static final int RULE_LEFTPARENTESIS=8;

    // delegates
    // delegators


        public InternalConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigParser.tokenNames; }
    public String getGrammarFileName() { return "../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g"; }


     
     	private ConfigGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ConfigGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleConfig"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:60:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:61:1: ( ruleConfig EOF )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:62:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig61);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:69:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:73:2: ( ( ( rule__Config__Group__0 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:74:1: ( ( rule__Config__Group__0 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:74:1: ( ( rule__Config__Group__0 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:75:1: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:76:1: ( rule__Config__Group__0 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:76:2: rule__Config__Group__0
            {
            pushFollow(FOLLOW_rule__Config__Group__0_in_ruleConfig94);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConnection"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:88:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:89:1: ( ruleConnection EOF )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:90:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection121);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:97:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:101:2: ( ( ( rule__Connection__Group__0 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:102:1: ( ( rule__Connection__Group__0 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:102:1: ( ( rule__Connection__Group__0 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:103:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:104:1: ( rule__Connection__Group__0 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:104:2: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_rule__Connection__Group__0_in_ruleConnection154);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleMergedField"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:116:1: entryRuleMergedField : ruleMergedField EOF ;
    public final void entryRuleMergedField() throws RecognitionException {
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:117:1: ( ruleMergedField EOF )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:118:1: ruleMergedField EOF
            {
             before(grammarAccess.getMergedFieldRule()); 
            pushFollow(FOLLOW_ruleMergedField_in_entryRuleMergedField181);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getMergedFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMergedField188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMergedField"


    // $ANTLR start "ruleMergedField"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:125:1: ruleMergedField : ( ( rule__MergedField__Group__0 ) ) ;
    public final void ruleMergedField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:129:2: ( ( ( rule__MergedField__Group__0 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:130:1: ( ( rule__MergedField__Group__0 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:130:1: ( ( rule__MergedField__Group__0 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:131:1: ( rule__MergedField__Group__0 )
            {
             before(grammarAccess.getMergedFieldAccess().getGroup()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:132:1: ( rule__MergedField__Group__0 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:132:2: rule__MergedField__Group__0
            {
            pushFollow(FOLLOW_rule__MergedField__Group__0_in_ruleMergedField214);
            rule__MergedField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMergedField"


    // $ANTLR start "entryRuleEString"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:145:1: ( ruleEString EOF )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:160:1: ( rule__EString__Alternatives )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttributeName"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:172:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:173:1: ( ruleAttributeName EOF )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:174:1: ruleAttributeName EOF
            {
             before(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName301);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:181:1: ruleAttributeName : ( ( rule__AttributeName__Group__0 ) ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:185:2: ( ( ( rule__AttributeName__Group__0 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:186:1: ( ( rule__AttributeName__Group__0 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:186:1: ( ( rule__AttributeName__Group__0 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:187:1: ( rule__AttributeName__Group__0 )
            {
             before(grammarAccess.getAttributeNameAccess().getGroup()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:188:1: ( rule__AttributeName__Group__0 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:188:2: rule__AttributeName__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeName__Group__0_in_ruleAttributeName334);
            rule__AttributeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleField"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:200:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:201:1: ( ruleField EOF )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:202:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField361);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:209:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:213:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:214:1: ( ( rule__Field__Group__0 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:214:1: ( ( rule__Field__Group__0 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:215:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:216:1: ( rule__Field__Group__0 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:216:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField394);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "ruleFieldType"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:229:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:233:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:234:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:234:1: ( ( rule__FieldType__Alternatives ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:235:1: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:236:1: ( rule__FieldType__Alternatives )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:236:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType431);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__EString__Alternatives"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:247:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:251:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:252:1: ( RULE_STRING )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:252:1: ( RULE_STRING )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:253:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives466); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:258:6: ( RULE_ID )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:258:6: ( RULE_ID )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:259:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives483); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:269:1: rule__FieldType__Alternatives : ( ( ( '\\'String\\'' ) ) | ( ( '\\'Integer\\'' ) ) | ( ( '\\'Float\\'' ) ) | ( ( '\\'Array\\'' ) ) | ( ( '\\'Boolean\\'' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:273:1: ( ( ( '\\'String\\'' ) ) | ( ( '\\'Integer\\'' ) ) | ( ( '\\'Float\\'' ) ) | ( ( '\\'Array\\'' ) ) | ( ( '\\'Boolean\\'' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:274:1: ( ( '\\'String\\'' ) )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:274:1: ( ( '\\'String\\'' ) )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:275:1: ( '\\'String\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:276:1: ( '\\'String\\'' )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:276:3: '\\'String\\''
                    {
                    match(input,27,FOLLOW_27_in_rule__FieldType__Alternatives516); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:281:6: ( ( '\\'Integer\\'' ) )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:281:6: ( ( '\\'Integer\\'' ) )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:282:1: ( '\\'Integer\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:283:1: ( '\\'Integer\\'' )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:283:3: '\\'Integer\\''
                    {
                    match(input,28,FOLLOW_28_in_rule__FieldType__Alternatives537); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:288:6: ( ( '\\'Float\\'' ) )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:288:6: ( ( '\\'Float\\'' ) )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:289:1: ( '\\'Float\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:290:1: ( '\\'Float\\'' )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:290:3: '\\'Float\\''
                    {
                    match(input,29,FOLLOW_29_in_rule__FieldType__Alternatives558); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:295:6: ( ( '\\'Array\\'' ) )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:295:6: ( ( '\\'Array\\'' ) )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:296:1: ( '\\'Array\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getArrayEnumLiteralDeclaration_3()); 
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:297:1: ( '\\'Array\\'' )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:297:3: '\\'Array\\''
                    {
                    match(input,30,FOLLOW_30_in_rule__FieldType__Alternatives579); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getArrayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:302:6: ( ( '\\'Boolean\\'' ) )
                    {
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:302:6: ( ( '\\'Boolean\\'' ) )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:303:1: ( '\\'Boolean\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:304:1: ( '\\'Boolean\\'' )
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:304:3: '\\'Boolean\\''
                    {
                    match(input,31,FOLLOW_31_in_rule__FieldType__Alternatives600); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__Config__Group__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:316:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:320:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:321:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0633);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0636);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:328:1: rule__Config__Group__0__Impl : ( RULE_LITERACONFIG ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:332:1: ( ( RULE_LITERACONFIG ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:333:1: ( RULE_LITERACONFIG )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:333:1: ( RULE_LITERACONFIG )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:334:1: RULE_LITERACONFIG
            {
             before(grammarAccess.getConfigAccess().getLITERACONFIGTerminalRuleCall_0()); 
            match(input,RULE_LITERACONFIG,FOLLOW_RULE_LITERACONFIG_in_rule__Config__Group__0__Impl663); 
             after(grammarAccess.getConfigAccess().getLITERACONFIGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:345:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:349:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:350:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1692);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1695);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:357:1: rule__Config__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:361:1: ( ( RULE_COLON ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:362:1: ( RULE_COLON )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:362:1: ( RULE_COLON )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:363:1: RULE_COLON
            {
             before(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__Config__Group__1__Impl722); 
             after(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:374:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:378:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:379:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2751);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2754);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:386:1: rule__Config__Group__2__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:390:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:391:1: ( RULE_LEFTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:391:1: ( RULE_LEFTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:392:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getConfigAccess().getLEFTPARENTESISTerminalRuleCall_2()); 
            match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_rule__Config__Group__2__Impl781); 
             after(grammarAccess.getConfigAccess().getLEFTPARENTESISTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:403:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:407:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:408:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3810);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3813);
            rule__Config__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:415:1: rule__Config__Group__3__Impl : ( RULE_LITERACONNECTION ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:419:1: ( ( RULE_LITERACONNECTION ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:420:1: ( RULE_LITERACONNECTION )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:420:1: ( RULE_LITERACONNECTION )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:421:1: RULE_LITERACONNECTION
            {
             before(grammarAccess.getConfigAccess().getLITERACONNECTIONTerminalRuleCall_3()); 
            match(input,RULE_LITERACONNECTION,FOLLOW_RULE_LITERACONNECTION_in_rule__Config__Group__3__Impl840); 
             after(grammarAccess.getConfigAccess().getLITERACONNECTIONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:432:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:436:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:437:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4869);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4872);
            rule__Config__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:444:1: rule__Config__Group__4__Impl : ( RULE_COLON ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:448:1: ( ( RULE_COLON ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:449:1: ( RULE_COLON )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:449:1: ( RULE_COLON )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:450:1: RULE_COLON
            {
             before(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_4()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__Config__Group__4__Impl899); 
             after(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:461:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:465:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:466:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5928);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__6_in_rule__Config__Group__5931);
            rule__Config__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:473:1: rule__Config__Group__5__Impl : ( ( rule__Config__ConnectionAssignment_5 ) ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:477:1: ( ( ( rule__Config__ConnectionAssignment_5 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:478:1: ( ( rule__Config__ConnectionAssignment_5 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:478:1: ( ( rule__Config__ConnectionAssignment_5 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:479:1: ( rule__Config__ConnectionAssignment_5 )
            {
             before(grammarAccess.getConfigAccess().getConnectionAssignment_5()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:480:1: ( rule__Config__ConnectionAssignment_5 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:480:2: rule__Config__ConnectionAssignment_5
            {
            pushFollow(FOLLOW_rule__Config__ConnectionAssignment_5_in_rule__Config__Group__5__Impl958);
            rule__Config__ConnectionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getConnectionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:490:1: rule__Config__Group__6 : rule__Config__Group__6__Impl rule__Config__Group__7 ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:494:1: ( rule__Config__Group__6__Impl rule__Config__Group__7 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:495:2: rule__Config__Group__6__Impl rule__Config__Group__7
            {
            pushFollow(FOLLOW_rule__Config__Group__6__Impl_in_rule__Config__Group__6988);
            rule__Config__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__7_in_rule__Config__Group__6991);
            rule__Config__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:502:1: rule__Config__Group__6__Impl : ( ( rule__Config__Group_6__0 )? ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:506:1: ( ( ( rule__Config__Group_6__0 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:507:1: ( ( rule__Config__Group_6__0 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:507:1: ( ( rule__Config__Group_6__0 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:508:1: ( rule__Config__Group_6__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_6()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:509:1: ( rule__Config__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LITERALMERGEDFIELDS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:509:2: rule__Config__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Config__Group_6__0_in_rule__Config__Group__6__Impl1018);
                    rule__Config__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group__7"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:519:1: rule__Config__Group__7 : rule__Config__Group__7__Impl ;
    public final void rule__Config__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:523:1: ( rule__Config__Group__7__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:524:2: rule__Config__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Config__Group__7__Impl_in_rule__Config__Group__71049);
            rule__Config__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__7"


    // $ANTLR start "rule__Config__Group__7__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:530:1: rule__Config__Group__7__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__Config__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:534:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:535:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:535:1: ( RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:536:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getConfigAccess().getRIGHTPARENTESISTerminalRuleCall_7()); 
            match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Config__Group__7__Impl1076); 
             after(grammarAccess.getConfigAccess().getRIGHTPARENTESISTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__7__Impl"


    // $ANTLR start "rule__Config__Group_6__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:563:1: rule__Config__Group_6__0 : rule__Config__Group_6__0__Impl rule__Config__Group_6__1 ;
    public final void rule__Config__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:567:1: ( rule__Config__Group_6__0__Impl rule__Config__Group_6__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:568:2: rule__Config__Group_6__0__Impl rule__Config__Group_6__1
            {
            pushFollow(FOLLOW_rule__Config__Group_6__0__Impl_in_rule__Config__Group_6__01121);
            rule__Config__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_6__1_in_rule__Config__Group_6__01124);
            rule__Config__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__0"


    // $ANTLR start "rule__Config__Group_6__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:575:1: rule__Config__Group_6__0__Impl : ( RULE_LITERALMERGEDFIELDS ) ;
    public final void rule__Config__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:579:1: ( ( RULE_LITERALMERGEDFIELDS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:580:1: ( RULE_LITERALMERGEDFIELDS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:580:1: ( RULE_LITERALMERGEDFIELDS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:581:1: RULE_LITERALMERGEDFIELDS
            {
             before(grammarAccess.getConfigAccess().getLITERALMERGEDFIELDSTerminalRuleCall_6_0()); 
            match(input,RULE_LITERALMERGEDFIELDS,FOLLOW_RULE_LITERALMERGEDFIELDS_in_rule__Config__Group_6__0__Impl1151); 
             after(grammarAccess.getConfigAccess().getLITERALMERGEDFIELDSTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__0__Impl"


    // $ANTLR start "rule__Config__Group_6__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:592:1: rule__Config__Group_6__1 : rule__Config__Group_6__1__Impl rule__Config__Group_6__2 ;
    public final void rule__Config__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:596:1: ( rule__Config__Group_6__1__Impl rule__Config__Group_6__2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:597:2: rule__Config__Group_6__1__Impl rule__Config__Group_6__2
            {
            pushFollow(FOLLOW_rule__Config__Group_6__1__Impl_in_rule__Config__Group_6__11180);
            rule__Config__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_6__2_in_rule__Config__Group_6__11183);
            rule__Config__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__1"


    // $ANTLR start "rule__Config__Group_6__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:604:1: rule__Config__Group_6__1__Impl : ( RULE_LEFTBRACKET ) ;
    public final void rule__Config__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:608:1: ( ( RULE_LEFTBRACKET ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:609:1: ( RULE_LEFTBRACKET )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:609:1: ( RULE_LEFTBRACKET )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:610:1: RULE_LEFTBRACKET
            {
             before(grammarAccess.getConfigAccess().getLEFTBRACKETTerminalRuleCall_6_1()); 
            match(input,RULE_LEFTBRACKET,FOLLOW_RULE_LEFTBRACKET_in_rule__Config__Group_6__1__Impl1210); 
             after(grammarAccess.getConfigAccess().getLEFTBRACKETTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__1__Impl"


    // $ANTLR start "rule__Config__Group_6__2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:621:1: rule__Config__Group_6__2 : rule__Config__Group_6__2__Impl rule__Config__Group_6__3 ;
    public final void rule__Config__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:625:1: ( rule__Config__Group_6__2__Impl rule__Config__Group_6__3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:626:2: rule__Config__Group_6__2__Impl rule__Config__Group_6__3
            {
            pushFollow(FOLLOW_rule__Config__Group_6__2__Impl_in_rule__Config__Group_6__21239);
            rule__Config__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_6__3_in_rule__Config__Group_6__21242);
            rule__Config__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__2"


    // $ANTLR start "rule__Config__Group_6__2__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:633:1: rule__Config__Group_6__2__Impl : ( ( rule__Config__MergeFieldsAssignment_6_2 ) ) ;
    public final void rule__Config__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:637:1: ( ( ( rule__Config__MergeFieldsAssignment_6_2 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:638:1: ( ( rule__Config__MergeFieldsAssignment_6_2 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:638:1: ( ( rule__Config__MergeFieldsAssignment_6_2 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:639:1: ( rule__Config__MergeFieldsAssignment_6_2 )
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_2()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:640:1: ( rule__Config__MergeFieldsAssignment_6_2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:640:2: rule__Config__MergeFieldsAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Config__MergeFieldsAssignment_6_2_in_rule__Config__Group_6__2__Impl1269);
            rule__Config__MergeFieldsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__2__Impl"


    // $ANTLR start "rule__Config__Group_6__3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:650:1: rule__Config__Group_6__3 : rule__Config__Group_6__3__Impl rule__Config__Group_6__4 ;
    public final void rule__Config__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:654:1: ( rule__Config__Group_6__3__Impl rule__Config__Group_6__4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:655:2: rule__Config__Group_6__3__Impl rule__Config__Group_6__4
            {
            pushFollow(FOLLOW_rule__Config__Group_6__3__Impl_in_rule__Config__Group_6__31299);
            rule__Config__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_6__4_in_rule__Config__Group_6__31302);
            rule__Config__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__3"


    // $ANTLR start "rule__Config__Group_6__3__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:662:1: rule__Config__Group_6__3__Impl : ( ( rule__Config__Group_6_3__0 )* ) ;
    public final void rule__Config__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:666:1: ( ( ( rule__Config__Group_6_3__0 )* ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:667:1: ( ( rule__Config__Group_6_3__0 )* )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:667:1: ( ( rule__Config__Group_6_3__0 )* )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:668:1: ( rule__Config__Group_6_3__0 )*
            {
             before(grammarAccess.getConfigAccess().getGroup_6_3()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:669:1: ( rule__Config__Group_6_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:669:2: rule__Config__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Config__Group_6_3__0_in_rule__Config__Group_6__3__Impl1329);
            	    rule__Config__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__3__Impl"


    // $ANTLR start "rule__Config__Group_6__4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:679:1: rule__Config__Group_6__4 : rule__Config__Group_6__4__Impl ;
    public final void rule__Config__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:683:1: ( rule__Config__Group_6__4__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:684:2: rule__Config__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__Config__Group_6__4__Impl_in_rule__Config__Group_6__41360);
            rule__Config__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__4"


    // $ANTLR start "rule__Config__Group_6__4__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:690:1: rule__Config__Group_6__4__Impl : ( RULE_RIGHTBRACKET ) ;
    public final void rule__Config__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:694:1: ( ( RULE_RIGHTBRACKET ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:695:1: ( RULE_RIGHTBRACKET )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:695:1: ( RULE_RIGHTBRACKET )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:696:1: RULE_RIGHTBRACKET
            {
             before(grammarAccess.getConfigAccess().getRIGHTBRACKETTerminalRuleCall_6_4()); 
            match(input,RULE_RIGHTBRACKET,FOLLOW_RULE_RIGHTBRACKET_in_rule__Config__Group_6__4__Impl1387); 
             after(grammarAccess.getConfigAccess().getRIGHTBRACKETTerminalRuleCall_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6__4__Impl"


    // $ANTLR start "rule__Config__Group_6_3__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:717:1: rule__Config__Group_6_3__0 : rule__Config__Group_6_3__0__Impl rule__Config__Group_6_3__1 ;
    public final void rule__Config__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:721:1: ( rule__Config__Group_6_3__0__Impl rule__Config__Group_6_3__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:722:2: rule__Config__Group_6_3__0__Impl rule__Config__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__Config__Group_6_3__0__Impl_in_rule__Config__Group_6_3__01426);
            rule__Config__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_6_3__1_in_rule__Config__Group_6_3__01429);
            rule__Config__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6_3__0"


    // $ANTLR start "rule__Config__Group_6_3__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:729:1: rule__Config__Group_6_3__0__Impl : ( RULE_COMA ) ;
    public final void rule__Config__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:733:1: ( ( RULE_COMA ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:734:1: ( RULE_COMA )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:734:1: ( RULE_COMA )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:735:1: RULE_COMA
            {
             before(grammarAccess.getConfigAccess().getCOMATerminalRuleCall_6_3_0()); 
            match(input,RULE_COMA,FOLLOW_RULE_COMA_in_rule__Config__Group_6_3__0__Impl1456); 
             after(grammarAccess.getConfigAccess().getCOMATerminalRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6_3__0__Impl"


    // $ANTLR start "rule__Config__Group_6_3__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:746:1: rule__Config__Group_6_3__1 : rule__Config__Group_6_3__1__Impl ;
    public final void rule__Config__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:750:1: ( rule__Config__Group_6_3__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:751:2: rule__Config__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Config__Group_6_3__1__Impl_in_rule__Config__Group_6_3__11485);
            rule__Config__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6_3__1"


    // $ANTLR start "rule__Config__Group_6_3__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:757:1: rule__Config__Group_6_3__1__Impl : ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) ) ;
    public final void rule__Config__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:761:1: ( ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:762:1: ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:762:1: ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:763:1: ( rule__Config__MergeFieldsAssignment_6_3_1 )
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_3_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:764:1: ( rule__Config__MergeFieldsAssignment_6_3_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:764:2: rule__Config__MergeFieldsAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__Config__MergeFieldsAssignment_6_3_1_in_rule__Config__Group_6_3__1__Impl1512);
            rule__Config__MergeFieldsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_6_3__1__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:778:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:782:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:783:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01546);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01549);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:790:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:794:1: ( ( () ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:795:1: ( () )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:795:1: ( () )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:796:1: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:797:1: ()
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:799:1: 
            {
            }

             after(grammarAccess.getConnectionAccess().getConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:809:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:813:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:814:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11607);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11610);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:821:1: rule__Connection__Group__1__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:825:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:826:1: ( RULE_LEFTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:826:1: ( RULE_LEFTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:827:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getConnectionAccess().getLEFTPARENTESISTerminalRuleCall_1()); 
            match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_rule__Connection__Group__1__Impl1637); 
             after(grammarAccess.getConnectionAccess().getLEFTPARENTESISTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:838:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:842:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:843:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21666);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21669);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:850:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__Group_2__0 )? ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:854:1: ( ( ( rule__Connection__Group_2__0 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:855:1: ( ( rule__Connection__Group_2__0 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:855:1: ( ( rule__Connection__Group_2__0 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:856:1: ( rule__Connection__Group_2__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_2()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:857:1: ( rule__Connection__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LITERALURL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:857:2: rule__Connection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl1696);
                    rule__Connection__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:867:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:871:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:872:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31727);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31730);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:879:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:883:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:884:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:884:1: ( ( rule__Connection__Group_3__0 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:885:1: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:886:1: ( rule__Connection__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LITERALUSERNAME) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:886:2: rule__Connection__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl1757);
                    rule__Connection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:896:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:900:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:901:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41788);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__41791);
            rule__Connection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:908:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:912:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:913:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:913:1: ( ( rule__Connection__Group_4__0 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:914:1: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:915:1: ( rule__Connection__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LITERALPASSWORD) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:915:2: rule__Connection__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1818);
                    rule__Connection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:925:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:929:1: ( rule__Connection__Group__5__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:930:2: rule__Connection__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__51849);
            rule__Connection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:936:1: rule__Connection__Group__5__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:940:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:941:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:941:1: ( RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:942:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getConnectionAccess().getRIGHTPARENTESISTerminalRuleCall_5()); 
            match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Connection__Group__5__Impl1876); 
             after(grammarAccess.getConnectionAccess().getRIGHTPARENTESISTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group_2__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:965:1: rule__Connection__Group_2__0 : rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 ;
    public final void rule__Connection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:969:1: ( rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:970:2: rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1
            {
            pushFollow(FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__01917);
            rule__Connection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__01920);
            rule__Connection__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__0"


    // $ANTLR start "rule__Connection__Group_2__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:977:1: rule__Connection__Group_2__0__Impl : ( RULE_LITERALURL ) ;
    public final void rule__Connection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:981:1: ( ( RULE_LITERALURL ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:982:1: ( RULE_LITERALURL )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:982:1: ( RULE_LITERALURL )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:983:1: RULE_LITERALURL
            {
             before(grammarAccess.getConnectionAccess().getLITERALURLTerminalRuleCall_2_0()); 
            match(input,RULE_LITERALURL,FOLLOW_RULE_LITERALURL_in_rule__Connection__Group_2__0__Impl1947); 
             after(grammarAccess.getConnectionAccess().getLITERALURLTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__0__Impl"


    // $ANTLR start "rule__Connection__Group_2__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:994:1: rule__Connection__Group_2__1 : rule__Connection__Group_2__1__Impl ;
    public final void rule__Connection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:998:1: ( rule__Connection__Group_2__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:999:2: rule__Connection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__11976);
            rule__Connection__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__1"


    // $ANTLR start "rule__Connection__Group_2__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1005:1: rule__Connection__Group_2__1__Impl : ( ( rule__Connection__UrlAssignment_2_1 ) ) ;
    public final void rule__Connection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1009:1: ( ( ( rule__Connection__UrlAssignment_2_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1010:1: ( ( rule__Connection__UrlAssignment_2_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1010:1: ( ( rule__Connection__UrlAssignment_2_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1011:1: ( rule__Connection__UrlAssignment_2_1 )
            {
             before(grammarAccess.getConnectionAccess().getUrlAssignment_2_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1012:1: ( rule__Connection__UrlAssignment_2_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1012:2: rule__Connection__UrlAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Connection__UrlAssignment_2_1_in_rule__Connection__Group_2__1__Impl2003);
            rule__Connection__UrlAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUrlAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__1__Impl"


    // $ANTLR start "rule__Connection__Group_3__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1026:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1030:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1031:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
            {
            pushFollow(FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__02037);
            rule__Connection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__02040);
            rule__Connection__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__0"


    // $ANTLR start "rule__Connection__Group_3__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1038:1: rule__Connection__Group_3__0__Impl : ( RULE_LITERALUSERNAME ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1042:1: ( ( RULE_LITERALUSERNAME ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1043:1: ( RULE_LITERALUSERNAME )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1043:1: ( RULE_LITERALUSERNAME )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1044:1: RULE_LITERALUSERNAME
            {
             before(grammarAccess.getConnectionAccess().getLITERALUSERNAMETerminalRuleCall_3_0()); 
            match(input,RULE_LITERALUSERNAME,FOLLOW_RULE_LITERALUSERNAME_in_rule__Connection__Group_3__0__Impl2067); 
             after(grammarAccess.getConnectionAccess().getLITERALUSERNAMETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__0__Impl"


    // $ANTLR start "rule__Connection__Group_3__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1055:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1059:1: ( rule__Connection__Group_3__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1060:2: rule__Connection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__12096);
            rule__Connection__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__1"


    // $ANTLR start "rule__Connection__Group_3__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1066:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__UsernameAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1070:1: ( ( ( rule__Connection__UsernameAssignment_3_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1071:1: ( ( rule__Connection__UsernameAssignment_3_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1071:1: ( ( rule__Connection__UsernameAssignment_3_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1072:1: ( rule__Connection__UsernameAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getUsernameAssignment_3_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1073:1: ( rule__Connection__UsernameAssignment_3_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1073:2: rule__Connection__UsernameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Connection__UsernameAssignment_3_1_in_rule__Connection__Group_3__1__Impl2123);
            rule__Connection__UsernameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUsernameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__1__Impl"


    // $ANTLR start "rule__Connection__Group_4__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1087:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1091:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1092:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
            {
            pushFollow(FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__02157);
            rule__Connection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__02160);
            rule__Connection__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__0"


    // $ANTLR start "rule__Connection__Group_4__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1099:1: rule__Connection__Group_4__0__Impl : ( RULE_LITERALPASSWORD ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1103:1: ( ( RULE_LITERALPASSWORD ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1104:1: ( RULE_LITERALPASSWORD )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1104:1: ( RULE_LITERALPASSWORD )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1105:1: RULE_LITERALPASSWORD
            {
             before(grammarAccess.getConnectionAccess().getLITERALPASSWORDTerminalRuleCall_4_0()); 
            match(input,RULE_LITERALPASSWORD,FOLLOW_RULE_LITERALPASSWORD_in_rule__Connection__Group_4__0__Impl2187); 
             after(grammarAccess.getConnectionAccess().getLITERALPASSWORDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__0__Impl"


    // $ANTLR start "rule__Connection__Group_4__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1116:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1120:1: ( rule__Connection__Group_4__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1121:2: rule__Connection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__12216);
            rule__Connection__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__1"


    // $ANTLR start "rule__Connection__Group_4__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1127:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__PasswordAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1131:1: ( ( ( rule__Connection__PasswordAssignment_4_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1132:1: ( ( rule__Connection__PasswordAssignment_4_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1132:1: ( ( rule__Connection__PasswordAssignment_4_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1133:1: ( rule__Connection__PasswordAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getPasswordAssignment_4_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1134:1: ( rule__Connection__PasswordAssignment_4_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1134:2: rule__Connection__PasswordAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Connection__PasswordAssignment_4_1_in_rule__Connection__Group_4__1__Impl2243);
            rule__Connection__PasswordAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getPasswordAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__1__Impl"


    // $ANTLR start "rule__MergedField__Group__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1148:1: rule__MergedField__Group__0 : rule__MergedField__Group__0__Impl rule__MergedField__Group__1 ;
    public final void rule__MergedField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1152:1: ( rule__MergedField__Group__0__Impl rule__MergedField__Group__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1153:2: rule__MergedField__Group__0__Impl rule__MergedField__Group__1
            {
            pushFollow(FOLLOW_rule__MergedField__Group__0__Impl_in_rule__MergedField__Group__02277);
            rule__MergedField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__1_in_rule__MergedField__Group__02280);
            rule__MergedField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__0"


    // $ANTLR start "rule__MergedField__Group__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1160:1: rule__MergedField__Group__0__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__MergedField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1164:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1165:1: ( RULE_LEFTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1165:1: ( RULE_LEFTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1166:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getMergedFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
            match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_rule__MergedField__Group__0__Impl2307); 
             after(grammarAccess.getMergedFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__0__Impl"


    // $ANTLR start "rule__MergedField__Group__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1177:1: rule__MergedField__Group__1 : rule__MergedField__Group__1__Impl rule__MergedField__Group__2 ;
    public final void rule__MergedField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1181:1: ( rule__MergedField__Group__1__Impl rule__MergedField__Group__2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1182:2: rule__MergedField__Group__1__Impl rule__MergedField__Group__2
            {
            pushFollow(FOLLOW_rule__MergedField__Group__1__Impl_in_rule__MergedField__Group__12336);
            rule__MergedField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__2_in_rule__MergedField__Group__12339);
            rule__MergedField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__1"


    // $ANTLR start "rule__MergedField__Group__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1189:1: rule__MergedField__Group__1__Impl : ( ( rule__MergedField__Group_1__0 )? ) ;
    public final void rule__MergedField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1193:1: ( ( ( rule__MergedField__Group_1__0 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1194:1: ( ( rule__MergedField__Group_1__0 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1194:1: ( ( rule__MergedField__Group_1__0 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1195:1: ( rule__MergedField__Group_1__0 )?
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1196:1: ( rule__MergedField__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LITERALTABLENAME) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1196:2: rule__MergedField__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MergedField__Group_1__0_in_rule__MergedField__Group__1__Impl2366);
                    rule__MergedField__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMergedFieldAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__1__Impl"


    // $ANTLR start "rule__MergedField__Group__2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1206:1: rule__MergedField__Group__2 : rule__MergedField__Group__2__Impl rule__MergedField__Group__3 ;
    public final void rule__MergedField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1210:1: ( rule__MergedField__Group__2__Impl rule__MergedField__Group__3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1211:2: rule__MergedField__Group__2__Impl rule__MergedField__Group__3
            {
            pushFollow(FOLLOW_rule__MergedField__Group__2__Impl_in_rule__MergedField__Group__22397);
            rule__MergedField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__3_in_rule__MergedField__Group__22400);
            rule__MergedField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__2"


    // $ANTLR start "rule__MergedField__Group__2__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1218:1: rule__MergedField__Group__2__Impl : ( RULE_LITERALFIELDS ) ;
    public final void rule__MergedField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1222:1: ( ( RULE_LITERALFIELDS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1223:1: ( RULE_LITERALFIELDS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1223:1: ( RULE_LITERALFIELDS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1224:1: RULE_LITERALFIELDS
            {
             before(grammarAccess.getMergedFieldAccess().getLITERALFIELDSTerminalRuleCall_2()); 
            match(input,RULE_LITERALFIELDS,FOLLOW_RULE_LITERALFIELDS_in_rule__MergedField__Group__2__Impl2427); 
             after(grammarAccess.getMergedFieldAccess().getLITERALFIELDSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__2__Impl"


    // $ANTLR start "rule__MergedField__Group__3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1235:1: rule__MergedField__Group__3 : rule__MergedField__Group__3__Impl rule__MergedField__Group__4 ;
    public final void rule__MergedField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1239:1: ( rule__MergedField__Group__3__Impl rule__MergedField__Group__4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1240:2: rule__MergedField__Group__3__Impl rule__MergedField__Group__4
            {
            pushFollow(FOLLOW_rule__MergedField__Group__3__Impl_in_rule__MergedField__Group__32456);
            rule__MergedField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__4_in_rule__MergedField__Group__32459);
            rule__MergedField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__3"


    // $ANTLR start "rule__MergedField__Group__3__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1247:1: rule__MergedField__Group__3__Impl : ( RULE_LEFTBRACKET ) ;
    public final void rule__MergedField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1251:1: ( ( RULE_LEFTBRACKET ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1252:1: ( RULE_LEFTBRACKET )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1252:1: ( RULE_LEFTBRACKET )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1253:1: RULE_LEFTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_3()); 
            match(input,RULE_LEFTBRACKET,FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__3__Impl2486); 
             after(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__3__Impl"


    // $ANTLR start "rule__MergedField__Group__4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1264:1: rule__MergedField__Group__4 : rule__MergedField__Group__4__Impl rule__MergedField__Group__5 ;
    public final void rule__MergedField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1268:1: ( rule__MergedField__Group__4__Impl rule__MergedField__Group__5 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1269:2: rule__MergedField__Group__4__Impl rule__MergedField__Group__5
            {
            pushFollow(FOLLOW_rule__MergedField__Group__4__Impl_in_rule__MergedField__Group__42515);
            rule__MergedField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__5_in_rule__MergedField__Group__42518);
            rule__MergedField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__4"


    // $ANTLR start "rule__MergedField__Group__4__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1276:1: rule__MergedField__Group__4__Impl : ( ( rule__MergedField__FieldsAssignment_4 ) ) ;
    public final void rule__MergedField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1280:1: ( ( ( rule__MergedField__FieldsAssignment_4 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1281:1: ( ( rule__MergedField__FieldsAssignment_4 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1281:1: ( ( rule__MergedField__FieldsAssignment_4 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1282:1: ( rule__MergedField__FieldsAssignment_4 )
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsAssignment_4()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1283:1: ( rule__MergedField__FieldsAssignment_4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1283:2: rule__MergedField__FieldsAssignment_4
            {
            pushFollow(FOLLOW_rule__MergedField__FieldsAssignment_4_in_rule__MergedField__Group__4__Impl2545);
            rule__MergedField__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__4__Impl"


    // $ANTLR start "rule__MergedField__Group__5"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1293:1: rule__MergedField__Group__5 : rule__MergedField__Group__5__Impl rule__MergedField__Group__6 ;
    public final void rule__MergedField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1297:1: ( rule__MergedField__Group__5__Impl rule__MergedField__Group__6 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1298:2: rule__MergedField__Group__5__Impl rule__MergedField__Group__6
            {
            pushFollow(FOLLOW_rule__MergedField__Group__5__Impl_in_rule__MergedField__Group__52575);
            rule__MergedField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__6_in_rule__MergedField__Group__52578);
            rule__MergedField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__5"


    // $ANTLR start "rule__MergedField__Group__5__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1305:1: rule__MergedField__Group__5__Impl : ( ( rule__MergedField__Group_5__0 )* ) ;
    public final void rule__MergedField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1309:1: ( ( ( rule__MergedField__Group_5__0 )* ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1310:1: ( ( rule__MergedField__Group_5__0 )* )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1310:1: ( ( rule__MergedField__Group_5__0 )* )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1311:1: ( rule__MergedField__Group_5__0 )*
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_5()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1312:1: ( rule__MergedField__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1312:2: rule__MergedField__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__MergedField__Group_5__0_in_rule__MergedField__Group__5__Impl2605);
            	    rule__MergedField__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMergedFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__5__Impl"


    // $ANTLR start "rule__MergedField__Group__6"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1322:1: rule__MergedField__Group__6 : rule__MergedField__Group__6__Impl rule__MergedField__Group__7 ;
    public final void rule__MergedField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1326:1: ( rule__MergedField__Group__6__Impl rule__MergedField__Group__7 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1327:2: rule__MergedField__Group__6__Impl rule__MergedField__Group__7
            {
            pushFollow(FOLLOW_rule__MergedField__Group__6__Impl_in_rule__MergedField__Group__62636);
            rule__MergedField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__7_in_rule__MergedField__Group__62639);
            rule__MergedField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__6"


    // $ANTLR start "rule__MergedField__Group__6__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1334:1: rule__MergedField__Group__6__Impl : ( RULE_RIGHTBRACKET ) ;
    public final void rule__MergedField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1338:1: ( ( RULE_RIGHTBRACKET ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1339:1: ( RULE_RIGHTBRACKET )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1339:1: ( RULE_RIGHTBRACKET )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1340:1: RULE_RIGHTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_6()); 
            match(input,RULE_RIGHTBRACKET,FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__6__Impl2666); 
             after(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__6__Impl"


    // $ANTLR start "rule__MergedField__Group__7"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1351:1: rule__MergedField__Group__7 : rule__MergedField__Group__7__Impl rule__MergedField__Group__8 ;
    public final void rule__MergedField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1355:1: ( rule__MergedField__Group__7__Impl rule__MergedField__Group__8 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1356:2: rule__MergedField__Group__7__Impl rule__MergedField__Group__8
            {
            pushFollow(FOLLOW_rule__MergedField__Group__7__Impl_in_rule__MergedField__Group__72695);
            rule__MergedField__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__8_in_rule__MergedField__Group__72698);
            rule__MergedField__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__7"


    // $ANTLR start "rule__MergedField__Group__7__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1363:1: rule__MergedField__Group__7__Impl : ( RULE_LITERALATTRIBUTENAMES ) ;
    public final void rule__MergedField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1367:1: ( ( RULE_LITERALATTRIBUTENAMES ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1368:1: ( RULE_LITERALATTRIBUTENAMES )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1368:1: ( RULE_LITERALATTRIBUTENAMES )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1369:1: RULE_LITERALATTRIBUTENAMES
            {
             before(grammarAccess.getMergedFieldAccess().getLITERALATTRIBUTENAMESTerminalRuleCall_7()); 
            match(input,RULE_LITERALATTRIBUTENAMES,FOLLOW_RULE_LITERALATTRIBUTENAMES_in_rule__MergedField__Group__7__Impl2725); 
             after(grammarAccess.getMergedFieldAccess().getLITERALATTRIBUTENAMESTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__7__Impl"


    // $ANTLR start "rule__MergedField__Group__8"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1380:1: rule__MergedField__Group__8 : rule__MergedField__Group__8__Impl rule__MergedField__Group__9 ;
    public final void rule__MergedField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1384:1: ( rule__MergedField__Group__8__Impl rule__MergedField__Group__9 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1385:2: rule__MergedField__Group__8__Impl rule__MergedField__Group__9
            {
            pushFollow(FOLLOW_rule__MergedField__Group__8__Impl_in_rule__MergedField__Group__82754);
            rule__MergedField__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__9_in_rule__MergedField__Group__82757);
            rule__MergedField__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__8"


    // $ANTLR start "rule__MergedField__Group__8__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1392:1: rule__MergedField__Group__8__Impl : ( RULE_LEFTBRACKET ) ;
    public final void rule__MergedField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1396:1: ( ( RULE_LEFTBRACKET ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1397:1: ( RULE_LEFTBRACKET )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1397:1: ( RULE_LEFTBRACKET )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1398:1: RULE_LEFTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_8()); 
            match(input,RULE_LEFTBRACKET,FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__8__Impl2784); 
             after(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__8__Impl"


    // $ANTLR start "rule__MergedField__Group__9"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1409:1: rule__MergedField__Group__9 : rule__MergedField__Group__9__Impl rule__MergedField__Group__10 ;
    public final void rule__MergedField__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1413:1: ( rule__MergedField__Group__9__Impl rule__MergedField__Group__10 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1414:2: rule__MergedField__Group__9__Impl rule__MergedField__Group__10
            {
            pushFollow(FOLLOW_rule__MergedField__Group__9__Impl_in_rule__MergedField__Group__92813);
            rule__MergedField__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__10_in_rule__MergedField__Group__92816);
            rule__MergedField__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__9"


    // $ANTLR start "rule__MergedField__Group__9__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1421:1: rule__MergedField__Group__9__Impl : ( ( rule__MergedField__AttributeNamesAssignment_9 ) ) ;
    public final void rule__MergedField__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1425:1: ( ( ( rule__MergedField__AttributeNamesAssignment_9 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1426:1: ( ( rule__MergedField__AttributeNamesAssignment_9 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1426:1: ( ( rule__MergedField__AttributeNamesAssignment_9 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1427:1: ( rule__MergedField__AttributeNamesAssignment_9 )
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_9()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1428:1: ( rule__MergedField__AttributeNamesAssignment_9 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1428:2: rule__MergedField__AttributeNamesAssignment_9
            {
            pushFollow(FOLLOW_rule__MergedField__AttributeNamesAssignment_9_in_rule__MergedField__Group__9__Impl2843);
            rule__MergedField__AttributeNamesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__9__Impl"


    // $ANTLR start "rule__MergedField__Group__10"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1438:1: rule__MergedField__Group__10 : rule__MergedField__Group__10__Impl rule__MergedField__Group__11 ;
    public final void rule__MergedField__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1442:1: ( rule__MergedField__Group__10__Impl rule__MergedField__Group__11 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1443:2: rule__MergedField__Group__10__Impl rule__MergedField__Group__11
            {
            pushFollow(FOLLOW_rule__MergedField__Group__10__Impl_in_rule__MergedField__Group__102873);
            rule__MergedField__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__11_in_rule__MergedField__Group__102876);
            rule__MergedField__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__10"


    // $ANTLR start "rule__MergedField__Group__10__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1450:1: rule__MergedField__Group__10__Impl : ( ( rule__MergedField__Group_10__0 )* ) ;
    public final void rule__MergedField__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1454:1: ( ( ( rule__MergedField__Group_10__0 )* ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1455:1: ( ( rule__MergedField__Group_10__0 )* )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1455:1: ( ( rule__MergedField__Group_10__0 )* )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1456:1: ( rule__MergedField__Group_10__0 )*
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_10()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1457:1: ( rule__MergedField__Group_10__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1457:2: rule__MergedField__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__MergedField__Group_10__0_in_rule__MergedField__Group__10__Impl2903);
            	    rule__MergedField__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMergedFieldAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__10__Impl"


    // $ANTLR start "rule__MergedField__Group__11"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1467:1: rule__MergedField__Group__11 : rule__MergedField__Group__11__Impl rule__MergedField__Group__12 ;
    public final void rule__MergedField__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1471:1: ( rule__MergedField__Group__11__Impl rule__MergedField__Group__12 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1472:2: rule__MergedField__Group__11__Impl rule__MergedField__Group__12
            {
            pushFollow(FOLLOW_rule__MergedField__Group__11__Impl_in_rule__MergedField__Group__112934);
            rule__MergedField__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group__12_in_rule__MergedField__Group__112937);
            rule__MergedField__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__11"


    // $ANTLR start "rule__MergedField__Group__11__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1479:1: rule__MergedField__Group__11__Impl : ( RULE_RIGHTBRACKET ) ;
    public final void rule__MergedField__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1483:1: ( ( RULE_RIGHTBRACKET ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1484:1: ( RULE_RIGHTBRACKET )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1484:1: ( RULE_RIGHTBRACKET )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1485:1: RULE_RIGHTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_11()); 
            match(input,RULE_RIGHTBRACKET,FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__11__Impl2964); 
             after(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__11__Impl"


    // $ANTLR start "rule__MergedField__Group__12"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1496:1: rule__MergedField__Group__12 : rule__MergedField__Group__12__Impl ;
    public final void rule__MergedField__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1500:1: ( rule__MergedField__Group__12__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1501:2: rule__MergedField__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__MergedField__Group__12__Impl_in_rule__MergedField__Group__122993);
            rule__MergedField__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__12"


    // $ANTLR start "rule__MergedField__Group__12__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1507:1: rule__MergedField__Group__12__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__MergedField__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1511:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1512:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1512:1: ( RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1513:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getMergedFieldAccess().getRIGHTPARENTESISTerminalRuleCall_12()); 
            match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_rule__MergedField__Group__12__Impl3020); 
             after(grammarAccess.getMergedFieldAccess().getRIGHTPARENTESISTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group__12__Impl"


    // $ANTLR start "rule__MergedField__Group_1__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1550:1: rule__MergedField__Group_1__0 : rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1 ;
    public final void rule__MergedField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1554:1: ( rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1555:2: rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1
            {
            pushFollow(FOLLOW_rule__MergedField__Group_1__0__Impl_in_rule__MergedField__Group_1__03075);
            rule__MergedField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group_1__1_in_rule__MergedField__Group_1__03078);
            rule__MergedField__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_1__0"


    // $ANTLR start "rule__MergedField__Group_1__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1562:1: rule__MergedField__Group_1__0__Impl : ( RULE_LITERALTABLENAME ) ;
    public final void rule__MergedField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1566:1: ( ( RULE_LITERALTABLENAME ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1567:1: ( RULE_LITERALTABLENAME )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1567:1: ( RULE_LITERALTABLENAME )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1568:1: RULE_LITERALTABLENAME
            {
             before(grammarAccess.getMergedFieldAccess().getLITERALTABLENAMETerminalRuleCall_1_0()); 
            match(input,RULE_LITERALTABLENAME,FOLLOW_RULE_LITERALTABLENAME_in_rule__MergedField__Group_1__0__Impl3105); 
             after(grammarAccess.getMergedFieldAccess().getLITERALTABLENAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_1__0__Impl"


    // $ANTLR start "rule__MergedField__Group_1__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1579:1: rule__MergedField__Group_1__1 : rule__MergedField__Group_1__1__Impl ;
    public final void rule__MergedField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1583:1: ( rule__MergedField__Group_1__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1584:2: rule__MergedField__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MergedField__Group_1__1__Impl_in_rule__MergedField__Group_1__13134);
            rule__MergedField__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_1__1"


    // $ANTLR start "rule__MergedField__Group_1__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1590:1: rule__MergedField__Group_1__1__Impl : ( ( rule__MergedField__TableNameAssignment_1_1 ) ) ;
    public final void rule__MergedField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1594:1: ( ( ( rule__MergedField__TableNameAssignment_1_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1595:1: ( ( rule__MergedField__TableNameAssignment_1_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1595:1: ( ( rule__MergedField__TableNameAssignment_1_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1596:1: ( rule__MergedField__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameAssignment_1_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1597:1: ( rule__MergedField__TableNameAssignment_1_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1597:2: rule__MergedField__TableNameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MergedField__TableNameAssignment_1_1_in_rule__MergedField__Group_1__1__Impl3161);
            rule__MergedField__TableNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getTableNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_1__1__Impl"


    // $ANTLR start "rule__MergedField__Group_5__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1611:1: rule__MergedField__Group_5__0 : rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1 ;
    public final void rule__MergedField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1615:1: ( rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1616:2: rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1
            {
            pushFollow(FOLLOW_rule__MergedField__Group_5__0__Impl_in_rule__MergedField__Group_5__03195);
            rule__MergedField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group_5__1_in_rule__MergedField__Group_5__03198);
            rule__MergedField__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_5__0"


    // $ANTLR start "rule__MergedField__Group_5__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1623:1: rule__MergedField__Group_5__0__Impl : ( RULE_COMA ) ;
    public final void rule__MergedField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1627:1: ( ( RULE_COMA ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1628:1: ( RULE_COMA )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1628:1: ( RULE_COMA )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1629:1: RULE_COMA
            {
             before(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_5_0()); 
            match(input,RULE_COMA,FOLLOW_RULE_COMA_in_rule__MergedField__Group_5__0__Impl3225); 
             after(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_5__0__Impl"


    // $ANTLR start "rule__MergedField__Group_5__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1640:1: rule__MergedField__Group_5__1 : rule__MergedField__Group_5__1__Impl ;
    public final void rule__MergedField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1644:1: ( rule__MergedField__Group_5__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1645:2: rule__MergedField__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MergedField__Group_5__1__Impl_in_rule__MergedField__Group_5__13254);
            rule__MergedField__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_5__1"


    // $ANTLR start "rule__MergedField__Group_5__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1651:1: rule__MergedField__Group_5__1__Impl : ( ( rule__MergedField__FieldsAssignment_5_1 ) ) ;
    public final void rule__MergedField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1655:1: ( ( ( rule__MergedField__FieldsAssignment_5_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1656:1: ( ( rule__MergedField__FieldsAssignment_5_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1656:1: ( ( rule__MergedField__FieldsAssignment_5_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1657:1: ( rule__MergedField__FieldsAssignment_5_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsAssignment_5_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1658:1: ( rule__MergedField__FieldsAssignment_5_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1658:2: rule__MergedField__FieldsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MergedField__FieldsAssignment_5_1_in_rule__MergedField__Group_5__1__Impl3281);
            rule__MergedField__FieldsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getFieldsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_5__1__Impl"


    // $ANTLR start "rule__MergedField__Group_10__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1672:1: rule__MergedField__Group_10__0 : rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1 ;
    public final void rule__MergedField__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1676:1: ( rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1677:2: rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1
            {
            pushFollow(FOLLOW_rule__MergedField__Group_10__0__Impl_in_rule__MergedField__Group_10__03315);
            rule__MergedField__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MergedField__Group_10__1_in_rule__MergedField__Group_10__03318);
            rule__MergedField__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_10__0"


    // $ANTLR start "rule__MergedField__Group_10__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1684:1: rule__MergedField__Group_10__0__Impl : ( RULE_COMA ) ;
    public final void rule__MergedField__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1688:1: ( ( RULE_COMA ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1689:1: ( RULE_COMA )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1689:1: ( RULE_COMA )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1690:1: RULE_COMA
            {
             before(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_10_0()); 
            match(input,RULE_COMA,FOLLOW_RULE_COMA_in_rule__MergedField__Group_10__0__Impl3345); 
             after(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_10__0__Impl"


    // $ANTLR start "rule__MergedField__Group_10__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1701:1: rule__MergedField__Group_10__1 : rule__MergedField__Group_10__1__Impl ;
    public final void rule__MergedField__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1705:1: ( rule__MergedField__Group_10__1__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1706:2: rule__MergedField__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__MergedField__Group_10__1__Impl_in_rule__MergedField__Group_10__13374);
            rule__MergedField__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_10__1"


    // $ANTLR start "rule__MergedField__Group_10__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1712:1: rule__MergedField__Group_10__1__Impl : ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) ) ;
    public final void rule__MergedField__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1716:1: ( ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1717:1: ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1717:1: ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1718:1: ( rule__MergedField__AttributeNamesAssignment_10_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_10_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1719:1: ( rule__MergedField__AttributeNamesAssignment_10_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1719:2: rule__MergedField__AttributeNamesAssignment_10_1
            {
            pushFollow(FOLLOW_rule__MergedField__AttributeNamesAssignment_10_1_in_rule__MergedField__Group_10__1__Impl3401);
            rule__MergedField__AttributeNamesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__Group_10__1__Impl"


    // $ANTLR start "rule__AttributeName__Group__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1733:1: rule__AttributeName__Group__0 : rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1 ;
    public final void rule__AttributeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1737:1: ( rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1738:2: rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group__0__Impl_in_rule__AttributeName__Group__03435);
            rule__AttributeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group__1_in_rule__AttributeName__Group__03438);
            rule__AttributeName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__0"


    // $ANTLR start "rule__AttributeName__Group__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1745:1: rule__AttributeName__Group__0__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__AttributeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1749:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1750:1: ( RULE_LEFTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1750:1: ( RULE_LEFTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1751:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getAttributeNameAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
            match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_rule__AttributeName__Group__0__Impl3465); 
             after(grammarAccess.getAttributeNameAccess().getLEFTPARENTESISTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__0__Impl"


    // $ANTLR start "rule__AttributeName__Group__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1762:1: rule__AttributeName__Group__1 : rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2 ;
    public final void rule__AttributeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1766:1: ( rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1767:2: rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group__1__Impl_in_rule__AttributeName__Group__13494);
            rule__AttributeName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group__2_in_rule__AttributeName__Group__13497);
            rule__AttributeName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__1"


    // $ANTLR start "rule__AttributeName__Group__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1774:1: rule__AttributeName__Group__1__Impl : ( ( rule__AttributeName__OldFieldAssignment_1 )? ) ;
    public final void rule__AttributeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1778:1: ( ( ( rule__AttributeName__OldFieldAssignment_1 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1779:1: ( ( rule__AttributeName__OldFieldAssignment_1 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1779:1: ( ( rule__AttributeName__OldFieldAssignment_1 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1780:1: ( rule__AttributeName__OldFieldAssignment_1 )?
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldAssignment_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1781:1: ( rule__AttributeName__OldFieldAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1781:2: rule__AttributeName__OldFieldAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeName__OldFieldAssignment_1_in_rule__AttributeName__Group__1__Impl3524);
                    rule__AttributeName__OldFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeNameAccess().getOldFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__1__Impl"


    // $ANTLR start "rule__AttributeName__Group__2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1791:1: rule__AttributeName__Group__2 : rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3 ;
    public final void rule__AttributeName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1795:1: ( rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1796:2: rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeName__Group__2__Impl_in_rule__AttributeName__Group__23555);
            rule__AttributeName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group__3_in_rule__AttributeName__Group__23558);
            rule__AttributeName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__2"


    // $ANTLR start "rule__AttributeName__Group__2__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1803:1: rule__AttributeName__Group__2__Impl : ( RULE_COMA ) ;
    public final void rule__AttributeName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1807:1: ( ( RULE_COMA ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1808:1: ( RULE_COMA )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1808:1: ( RULE_COMA )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1809:1: RULE_COMA
            {
             before(grammarAccess.getAttributeNameAccess().getCOMATerminalRuleCall_2()); 
            match(input,RULE_COMA,FOLLOW_RULE_COMA_in_rule__AttributeName__Group__2__Impl3585); 
             after(grammarAccess.getAttributeNameAccess().getCOMATerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__2__Impl"


    // $ANTLR start "rule__AttributeName__Group__3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1820:1: rule__AttributeName__Group__3 : rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4 ;
    public final void rule__AttributeName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1824:1: ( rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1825:2: rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeName__Group__3__Impl_in_rule__AttributeName__Group__33614);
            rule__AttributeName__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeName__Group__4_in_rule__AttributeName__Group__33617);
            rule__AttributeName__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__3"


    // $ANTLR start "rule__AttributeName__Group__3__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1832:1: rule__AttributeName__Group__3__Impl : ( ( rule__AttributeName__FinalFieldAssignment_3 ) ) ;
    public final void rule__AttributeName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1836:1: ( ( ( rule__AttributeName__FinalFieldAssignment_3 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1837:1: ( ( rule__AttributeName__FinalFieldAssignment_3 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1837:1: ( ( rule__AttributeName__FinalFieldAssignment_3 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1838:1: ( rule__AttributeName__FinalFieldAssignment_3 )
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldAssignment_3()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1839:1: ( rule__AttributeName__FinalFieldAssignment_3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1839:2: rule__AttributeName__FinalFieldAssignment_3
            {
            pushFollow(FOLLOW_rule__AttributeName__FinalFieldAssignment_3_in_rule__AttributeName__Group__3__Impl3644);
            rule__AttributeName__FinalFieldAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getFinalFieldAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__3__Impl"


    // $ANTLR start "rule__AttributeName__Group__4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1849:1: rule__AttributeName__Group__4 : rule__AttributeName__Group__4__Impl ;
    public final void rule__AttributeName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1853:1: ( rule__AttributeName__Group__4__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1854:2: rule__AttributeName__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group__4__Impl_in_rule__AttributeName__Group__43674);
            rule__AttributeName__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__4"


    // $ANTLR start "rule__AttributeName__Group__4__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1860:1: rule__AttributeName__Group__4__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__AttributeName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1864:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1865:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1865:1: ( RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1866:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getAttributeNameAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
            match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_rule__AttributeName__Group__4__Impl3701); 
             after(grammarAccess.getAttributeNameAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1887:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1891:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1892:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03740);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03743);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1899:1: rule__Field__Group__0__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1903:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1904:1: ( RULE_LEFTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1904:1: ( RULE_LEFTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1905:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
            match(input,RULE_LEFTPARENTESIS,FOLLOW_RULE_LEFTPARENTESIS_in_rule__Field__Group__0__Impl3770); 
             after(grammarAccess.getFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1916:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1920:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1921:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13799);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13802);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1928:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1932:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1933:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1933:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1934:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1935:1: ( rule__Field__NameAssignment_1 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1935:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl3829);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1945:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1949:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1950:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23859);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23862);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1957:1: rule__Field__Group__2__Impl : ( RULE_COMA ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1961:1: ( ( RULE_COMA ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1962:1: ( RULE_COMA )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1962:1: ( RULE_COMA )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1963:1: RULE_COMA
            {
             before(grammarAccess.getFieldAccess().getCOMATerminalRuleCall_2()); 
            match(input,RULE_COMA,FOLLOW_RULE_COMA_in_rule__Field__Group__2__Impl3889); 
             after(grammarAccess.getFieldAccess().getCOMATerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1974:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1978:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1979:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33918);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33921);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1986:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1990:1: ( ( ( rule__Field__TypeAssignment_3 )? ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1991:1: ( ( rule__Field__TypeAssignment_3 )? )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1991:1: ( ( rule__Field__TypeAssignment_3 )? )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1992:1: ( rule__Field__TypeAssignment_3 )?
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1993:1: ( rule__Field__TypeAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=31)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:1993:2: rule__Field__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl3948);
                    rule__Field__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2003:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2007:1: ( rule__Field__Group__4__Impl )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2008:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43979);
            rule__Field__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2014:1: rule__Field__Group__4__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2018:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2019:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2019:1: ( RULE_RIGHTPARENTESIS )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2020:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getFieldAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
            match(input,RULE_RIGHTPARENTESIS,FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Field__Group__4__Impl4006); 
             after(grammarAccess.getFieldAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Config__ConnectionAssignment_5"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2042:1: rule__Config__ConnectionAssignment_5 : ( ruleConnection ) ;
    public final void rule__Config__ConnectionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2046:1: ( ( ruleConnection ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2047:1: ( ruleConnection )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2047:1: ( ruleConnection )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2048:1: ruleConnection
            {
             before(grammarAccess.getConfigAccess().getConnectionConnectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConnection_in_rule__Config__ConnectionAssignment_54050);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getConnectionConnectionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__ConnectionAssignment_5"


    // $ANTLR start "rule__Config__MergeFieldsAssignment_6_2"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2057:1: rule__Config__MergeFieldsAssignment_6_2 : ( ruleMergedField ) ;
    public final void rule__Config__MergeFieldsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2061:1: ( ( ruleMergedField ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2062:1: ( ruleMergedField )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2062:1: ( ruleMergedField )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2063:1: ruleMergedField
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_24081);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__MergeFieldsAssignment_6_2"


    // $ANTLR start "rule__Config__MergeFieldsAssignment_6_3_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2072:1: rule__Config__MergeFieldsAssignment_6_3_1 : ( ruleMergedField ) ;
    public final void rule__Config__MergeFieldsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2076:1: ( ( ruleMergedField ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2077:1: ( ruleMergedField )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2077:1: ( ruleMergedField )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2078:1: ruleMergedField
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_3_14112);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__MergeFieldsAssignment_6_3_1"


    // $ANTLR start "rule__Connection__UrlAssignment_2_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2087:1: rule__Connection__UrlAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Connection__UrlAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2091:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2092:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2092:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2093:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Connection__UrlAssignment_2_14143);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UrlAssignment_2_1"


    // $ANTLR start "rule__Connection__UsernameAssignment_3_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2102:1: rule__Connection__UsernameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Connection__UsernameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2106:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2107:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2107:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2108:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Connection__UsernameAssignment_3_14174);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UsernameAssignment_3_1"


    // $ANTLR start "rule__Connection__PasswordAssignment_4_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2117:1: rule__Connection__PasswordAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Connection__PasswordAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2121:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2122:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2122:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2123:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Connection__PasswordAssignment_4_14205);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__PasswordAssignment_4_1"


    // $ANTLR start "rule__MergedField__TableNameAssignment_1_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2132:1: rule__MergedField__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__MergedField__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2136:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2137:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2137:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2138:1: ruleEString
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__MergedField__TableNameAssignment_1_14236);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__TableNameAssignment_1_1"


    // $ANTLR start "rule__MergedField__FieldsAssignment_4"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2147:1: rule__MergedField__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__MergedField__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2151:1: ( ( ruleField ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2152:1: ( ruleField )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2152:1: ( ruleField )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2153:1: ruleField
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_44267);
            ruleField();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__FieldsAssignment_4"


    // $ANTLR start "rule__MergedField__FieldsAssignment_5_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2162:1: rule__MergedField__FieldsAssignment_5_1 : ( ruleField ) ;
    public final void rule__MergedField__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2166:1: ( ( ruleField ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2167:1: ( ruleField )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2167:1: ( ruleField )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2168:1: ruleField
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_5_14298);
            ruleField();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__FieldsAssignment_5_1"


    // $ANTLR start "rule__MergedField__AttributeNamesAssignment_9"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2177:1: rule__MergedField__AttributeNamesAssignment_9 : ( ruleAttributeName ) ;
    public final void rule__MergedField__AttributeNamesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2181:1: ( ( ruleAttributeName ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2182:1: ( ruleAttributeName )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2182:1: ( ruleAttributeName )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2183:1: ruleAttributeName
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_94329);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__AttributeNamesAssignment_9"


    // $ANTLR start "rule__MergedField__AttributeNamesAssignment_10_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2192:1: rule__MergedField__AttributeNamesAssignment_10_1 : ( ruleAttributeName ) ;
    public final void rule__MergedField__AttributeNamesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2196:1: ( ( ruleAttributeName ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2197:1: ( ruleAttributeName )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2197:1: ( ruleAttributeName )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2198:1: ruleAttributeName
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_10_14360);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergedField__AttributeNamesAssignment_10_1"


    // $ANTLR start "rule__AttributeName__OldFieldAssignment_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2207:1: rule__AttributeName__OldFieldAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeName__OldFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2211:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2212:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2212:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2213:1: ruleEString
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AttributeName__OldFieldAssignment_14391);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__OldFieldAssignment_1"


    // $ANTLR start "rule__AttributeName__FinalFieldAssignment_3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2222:1: rule__AttributeName__FinalFieldAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AttributeName__FinalFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2226:1: ( ( ( ruleEString ) ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2227:1: ( ( ruleEString ) )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2227:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2228:1: ( ruleEString )
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2229:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2230:1: ruleEString
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldFieldEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AttributeName__FinalFieldAssignment_34426);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeNameAccess().getFinalFieldFieldEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__FinalFieldAssignment_3"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2241:1: rule__Field__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2245:1: ( ( ruleEString ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2246:1: ( ruleEString )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2246:1: ( ruleEString )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2247:1: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Field__NameAssignment_14461);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_3"
    // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2256:1: rule__Field__TypeAssignment_3 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2260:1: ( ( ruleFieldType ) )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2261:1: ( ruleFieldType )
            {
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2261:1: ( ruleFieldType )
            // ../com.uniandesandes.config2sql.xtext.ui/src-gen/com/uniandes/config2sql/xtext/ui/contentassist/antlr/internal/InternalConfig.g:2262:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_34492);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__0_in_ruleConfig94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMergedField_in_entryRuleMergedField181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMergedField188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__0_in_ruleMergedField214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__0_in_ruleAttributeName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldType__Alternatives516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FieldType__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldType__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FieldType__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FieldType__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0633 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERACONFIG_in_rule__Config__Group__0__Impl663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1692 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__Config__Group__1__Impl722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2751 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__Config__Group__2__Impl781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3810 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERACONNECTION_in_rule__Config__Group__3__Impl840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__Config__Group__4__Impl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5928 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__Config__Group__6_in_rule__Config__Group__5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__ConnectionAssignment_5_in_rule__Config__Group__5__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__6__Impl_in_rule__Config__Group__6988 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__Config__Group__7_in_rule__Config__Group__6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6__0_in_rule__Config__Group__6__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__7__Impl_in_rule__Config__Group__71049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Config__Group__7__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6__0__Impl_in_rule__Config__Group_6__01121 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Config__Group_6__1_in_rule__Config__Group_6__01124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALMERGEDFIELDS_in_rule__Config__Group_6__0__Impl1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6__1__Impl_in_rule__Config__Group_6__11180 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Config__Group_6__2_in_rule__Config__Group_6__11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_rule__Config__Group_6__1__Impl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6__2__Impl_in_rule__Config__Group_6__21239 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Config__Group_6__3_in_rule__Config__Group_6__21242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__MergeFieldsAssignment_6_2_in_rule__Config__Group_6__2__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6__3__Impl_in_rule__Config__Group_6__31299 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Config__Group_6__4_in_rule__Config__Group_6__31302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6_3__0_in_rule__Config__Group_6__3__Impl1329 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Config__Group_6__4__Impl_in_rule__Config__Group_6__41360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_rule__Config__Group_6__4__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6_3__0__Impl_in_rule__Config__Group_6_3__01426 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Config__Group_6_3__1_in_rule__Config__Group_6_3__01429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMA_in_rule__Config__Group_6_3__0__Impl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_6_3__1__Impl_in_rule__Config__Group_6_3__11485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__MergeFieldsAssignment_6_3_1_in_rule__Config__Group_6_3__1__Impl1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01546 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11607 = new BitSet(new long[]{0x0000000000038400L});
    public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__Connection__Group__1__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21666 = new BitSet(new long[]{0x0000000000038400L});
    public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31727 = new BitSet(new long[]{0x0000000000038400L});
    public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41788 = new BitSet(new long[]{0x0000000000038400L});
    public static final BitSet FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__41791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__51849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Connection__Group__5__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__01917 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__01920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALURL_in_rule__Connection__Group_2__0__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__UrlAssignment_2_1_in_rule__Connection__Group_2__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__02037 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__02040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALUSERNAME_in_rule__Connection__Group_3__0__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__UsernameAssignment_3_1_in_rule__Connection__Group_3__1__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__02157 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALPASSWORD_in_rule__Connection__Group_4__0__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__PasswordAssignment_4_1_in_rule__Connection__Group_4__1__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__0__Impl_in_rule__MergedField__Group__02277 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__1_in_rule__MergedField__Group__02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__MergedField__Group__0__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__1__Impl_in_rule__MergedField__Group__12336 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__2_in_rule__MergedField__Group__12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_1__0_in_rule__MergedField__Group__1__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__2__Impl_in_rule__MergedField__Group__22397 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__3_in_rule__MergedField__Group__22400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALFIELDS_in_rule__MergedField__Group__2__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__3__Impl_in_rule__MergedField__Group__32456 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MergedField__Group__4_in_rule__MergedField__Group__32459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__3__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__4__Impl_in_rule__MergedField__Group__42515 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__5_in_rule__MergedField__Group__42518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__FieldsAssignment_4_in_rule__MergedField__Group__4__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__5__Impl_in_rule__MergedField__Group__52575 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__6_in_rule__MergedField__Group__52578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_5__0_in_rule__MergedField__Group__5__Impl2605 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__6__Impl_in_rule__MergedField__Group__62636 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__7_in_rule__MergedField__Group__62639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__6__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__7__Impl_in_rule__MergedField__Group__72695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__8_in_rule__MergedField__Group__72698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALATTRIBUTENAMES_in_rule__MergedField__Group__7__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__8__Impl_in_rule__MergedField__Group__82754 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MergedField__Group__9_in_rule__MergedField__Group__82757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__8__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__9__Impl_in_rule__MergedField__Group__92813 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__10_in_rule__MergedField__Group__92816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__AttributeNamesAssignment_9_in_rule__MergedField__Group__9__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__10__Impl_in_rule__MergedField__Group__102873 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MergedField__Group__11_in_rule__MergedField__Group__102876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_10__0_in_rule__MergedField__Group__10__Impl2903 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__11__Impl_in_rule__MergedField__Group__112934 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__MergedField__Group__12_in_rule__MergedField__Group__112937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__11__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group__12__Impl_in_rule__MergedField__Group__122993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__MergedField__Group__12__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_1__0__Impl_in_rule__MergedField__Group_1__03075 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__MergedField__Group_1__1_in_rule__MergedField__Group_1__03078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALTABLENAME_in_rule__MergedField__Group_1__0__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_1__1__Impl_in_rule__MergedField__Group_1__13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__TableNameAssignment_1_1_in_rule__MergedField__Group_1__1__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_5__0__Impl_in_rule__MergedField__Group_5__03195 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MergedField__Group_5__1_in_rule__MergedField__Group_5__03198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMA_in_rule__MergedField__Group_5__0__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_5__1__Impl_in_rule__MergedField__Group_5__13254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__FieldsAssignment_5_1_in_rule__MergedField__Group_5__1__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_10__0__Impl_in_rule__MergedField__Group_10__03315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MergedField__Group_10__1_in_rule__MergedField__Group_10__03318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMA_in_rule__MergedField__Group_10__0__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__Group_10__1__Impl_in_rule__MergedField__Group_10__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MergedField__AttributeNamesAssignment_10_1_in_rule__MergedField__Group_10__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__0__Impl_in_rule__AttributeName__Group__03435 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__1_in_rule__AttributeName__Group__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__AttributeName__Group__0__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__1__Impl_in_rule__AttributeName__Group__13494 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__2_in_rule__AttributeName__Group__13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__OldFieldAssignment_1_in_rule__AttributeName__Group__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__2__Impl_in_rule__AttributeName__Group__23555 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__3_in_rule__AttributeName__Group__23558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMA_in_rule__AttributeName__Group__2__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__3__Impl_in_rule__AttributeName__Group__33614 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__4_in_rule__AttributeName__Group__33617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__FinalFieldAssignment_3_in_rule__AttributeName__Group__3__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group__4__Impl_in_rule__AttributeName__Group__43674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__AttributeName__Group__4__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03740 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__Field__Group__0__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13799 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23859 = new BitSet(new long[]{0x00000000F8000400L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMA_in_rule__Field__Group__2__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33918 = new BitSet(new long[]{0x00000000F8000400L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Field__Group__4__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Config__ConnectionAssignment_54050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_24081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_3_14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Connection__UrlAssignment_2_14143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Connection__UsernameAssignment_3_14174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Connection__PasswordAssignment_4_14205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__MergedField__TableNameAssignment_1_14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_44267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_5_14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_94329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_10_14360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AttributeName__OldFieldAssignment_14391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AttributeName__FinalFieldAssignment_34426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Field__NameAssignment_14461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_34492 = new BitSet(new long[]{0x0000000000000002L});

}