package org.xtext.ui.contentassist.antlr.internal; 

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
import org.xtext.services.CsharpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsharpParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DATATYPES", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'List'", "'IEnumerable'", "'.'", "';'", "'_'", "'('", "')'", "'='", "'{'", "'public class'", "'}'", "':'", "'['", "']'", "','", "'public '", "'public enum '", "'<'", "'>'", "'get'", "'set'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g"; }


     
     	private CsharpGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CsharpGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCSharp"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:60:1: entryRuleCSharp : ruleCSharp EOF ;
    public final void entryRuleCSharp() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:61:1: ( ruleCSharp EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:62:1: ruleCSharp EOF
            {
             before(grammarAccess.getCSharpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCSharp_in_entryRuleCSharp61);
            ruleCSharp();

            state._fsp--;

             after(grammarAccess.getCSharpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCSharp68); 

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
    // $ANTLR end "entryRuleCSharp"


    // $ANTLR start "ruleCSharp"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:69:1: ruleCSharp : ( ( rule__CSharp__Group__0 ) ) ;
    public final void ruleCSharp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:73:2: ( ( ( rule__CSharp__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:74:1: ( ( rule__CSharp__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:74:1: ( ( rule__CSharp__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:75:1: ( rule__CSharp__Group__0 )
            {
             before(grammarAccess.getCSharpAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:76:1: ( rule__CSharp__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:76:2: rule__CSharp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CSharp__Group__0_in_ruleCSharp94);
            rule__CSharp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSharpAccess().getGroup()); 

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
    // $ANTLR end "ruleCSharp"


    // $ANTLR start "entryRuleClase"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:88:1: entryRuleClase : ruleClase EOF ;
    public final void entryRuleClase() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:89:1: ( ruleClase EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:90:1: ruleClase EOF
            {
             before(grammarAccess.getClaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClase_in_entryRuleClase121);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getClaseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClase128); 

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
    // $ANTLR end "entryRuleClase"


    // $ANTLR start "ruleClase"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:97:1: ruleClase : ( ( rule__Clase__Group__0 ) ) ;
    public final void ruleClase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:101:2: ( ( ( rule__Clase__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:102:1: ( ( rule__Clase__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:102:1: ( ( rule__Clase__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:103:1: ( rule__Clase__Group__0 )
            {
             before(grammarAccess.getClaseAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:104:1: ( rule__Clase__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:104:2: rule__Clase__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__0_in_ruleClase154);
            rule__Clase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClaseAccess().getGroup()); 

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
    // $ANTLR end "ruleClase"


    // $ANTLR start "entryRuleAtributo"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:116:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:117:1: ( ruleAtributo EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:118:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_entryRuleAtributo181);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtributo188); 

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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:125:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:129:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:130:1: ( ( rule__Atributo__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:130:1: ( ( rule__Atributo__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:131:1: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:132:1: ( rule__Atributo__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:132:2: rule__Atributo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__0_in_ruleAtributo214);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRulePropiedadAtributo"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:144:1: entryRulePropiedadAtributo : rulePropiedadAtributo EOF ;
    public final void entryRulePropiedadAtributo() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:145:1: ( rulePropiedadAtributo EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:146:1: rulePropiedadAtributo EOF
            {
             before(grammarAccess.getPropiedadAtributoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedadAtributo_in_entryRulePropiedadAtributo241);
            rulePropiedadAtributo();

            state._fsp--;

             after(grammarAccess.getPropiedadAtributoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropiedadAtributo248); 

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
    // $ANTLR end "entryRulePropiedadAtributo"


    // $ANTLR start "rulePropiedadAtributo"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:153:1: rulePropiedadAtributo : ( ( rule__PropiedadAtributo__Group__0 ) ) ;
    public final void rulePropiedadAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:157:2: ( ( ( rule__PropiedadAtributo__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:158:1: ( ( rule__PropiedadAtributo__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:158:1: ( ( rule__PropiedadAtributo__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:159:1: ( rule__PropiedadAtributo__Group__0 )
            {
             before(grammarAccess.getPropiedadAtributoAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:160:1: ( rule__PropiedadAtributo__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:160:2: rule__PropiedadAtributo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__0_in_rulePropiedadAtributo274);
            rule__PropiedadAtributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAtributoAccess().getGroup()); 

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
    // $ANTLR end "rulePropiedadAtributo"


    // $ANTLR start "entryRuleConstructor"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:172:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:173:1: ( ruleConstructor EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:174:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstructor_in_entryRuleConstructor301);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructor308); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:181:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:185:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:186:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:186:1: ( ( rule__Constructor__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:187:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:188:1: ( rule__Constructor__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:188:2: rule__Constructor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__0_in_ruleConstructor334);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:200:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:201:1: ( ruleEnum EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:202:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum361);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum368); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:209:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:213:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:214:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:214:1: ( ( rule__Enum__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:215:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:216:1: ( rule__Enum__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:216:2: rule__Enum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__0_in_ruleEnum394);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:228:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:229:1: ( ruleEnumLiteral EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:230:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral421);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteral428); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:237:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:241:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:242:1: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:242:1: ( ( rule__EnumLiteral__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:243:1: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:244:1: ( rule__EnumLiteral__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:244:2: rule__EnumLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral454);
            rule__EnumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleList"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:256:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:257:1: ( ruleList EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:258:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList481);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList488); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:265:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:269:2: ( ( ( rule__List__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:270:1: ( ( rule__List__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:270:1: ( ( rule__List__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:271:1: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:272:1: ( rule__List__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:272:2: rule__List__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0_in_ruleList514);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRulePropiedad"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:286:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:287:1: ( rulePropiedad EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:288:1: rulePropiedad EOF
            {
             before(grammarAccess.getPropiedadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedad_in_entryRulePropiedad543);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getPropiedadRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropiedad550); 

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
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:295:1: rulePropiedad : ( ( rule__Propiedad__Group__0 ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:299:2: ( ( ( rule__Propiedad__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:300:1: ( ( rule__Propiedad__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:300:1: ( ( rule__Propiedad__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:301:1: ( rule__Propiedad__Group__0 )
            {
             before(grammarAccess.getPropiedadAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:302:1: ( rule__Propiedad__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:302:2: rule__Propiedad__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__0_in_rulePropiedad576);
            rule__Propiedad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getGroup()); 

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
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleMetodo"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:314:1: entryRuleMetodo : ruleMetodo EOF ;
    public final void entryRuleMetodo() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:315:1: ( ruleMetodo EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:316:1: ruleMetodo EOF
            {
             before(grammarAccess.getMetodoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetodo_in_entryRuleMetodo603);
            ruleMetodo();

            state._fsp--;

             after(grammarAccess.getMetodoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetodo610); 

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
    // $ANTLR end "entryRuleMetodo"


    // $ANTLR start "ruleMetodo"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:323:1: ruleMetodo : ( ( rule__Metodo__Group__0 ) ) ;
    public final void ruleMetodo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:327:2: ( ( ( rule__Metodo__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:328:1: ( ( rule__Metodo__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:328:1: ( ( rule__Metodo__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:329:1: ( rule__Metodo__Group__0 )
            {
             before(grammarAccess.getMetodoAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:330:1: ( rule__Metodo__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:330:2: rule__Metodo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__0_in_ruleMetodo636);
            rule__Metodo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetodoAccess().getGroup()); 

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
    // $ANTLR end "ruleMetodo"


    // $ANTLR start "entryRuleParametro"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:342:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:343:1: ( ruleParametro EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:344:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametro_in_entryRuleParametro663);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametro670); 

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
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:351:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:355:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:356:1: ( ( rule__Parametro__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:356:1: ( ( rule__Parametro__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:357:1: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:358:1: ( rule__Parametro__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:358:2: rule__Parametro__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__0_in_ruleParametro696);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

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
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:370:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:371:1: ( ruleEString EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:372:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString723);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString730); 

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
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:379:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:383:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:384:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:384:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:385:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:386:1: ( rule__EString__Alternatives )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:386:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString756);
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


    // $ANTLR start "entryRuleCharacters"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:398:1: entryRuleCharacters : ruleCharacters EOF ;
    public final void entryRuleCharacters() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:399:1: ( ruleCharacters EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:400:1: ruleCharacters EOF
            {
             before(grammarAccess.getCharactersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacters_in_entryRuleCharacters783);
            ruleCharacters();

            state._fsp--;

             after(grammarAccess.getCharactersRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacters790); 

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
    // $ANTLR end "entryRuleCharacters"


    // $ANTLR start "ruleCharacters"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:407:1: ruleCharacters : ( ( rule__Characters__Alternatives ) ) ;
    public final void ruleCharacters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:411:2: ( ( ( rule__Characters__Alternatives ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:412:1: ( ( rule__Characters__Alternatives ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:412:1: ( ( rule__Characters__Alternatives ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:413:1: ( rule__Characters__Alternatives )
            {
             before(grammarAccess.getCharactersAccess().getAlternatives()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:414:1: ( rule__Characters__Alternatives )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:414:2: rule__Characters__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Characters__Alternatives_in_ruleCharacters816);
            rule__Characters__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharactersAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharacters"


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:426:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:427:1: ( ruleBlock EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:428:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock843);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock850); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:435:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:439:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:440:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:440:1: ( ( rule__Block__Group__0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:441:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:442:1: ( rule__Block__Group__0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:442:2: rule__Block__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__0_in_ruleBlock876);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleExpressionString"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:454:1: entryRuleExpressionString : ruleExpressionString EOF ;
    public final void entryRuleExpressionString() throws RecognitionException {
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:455:1: ( ruleExpressionString EOF )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:456:1: ruleExpressionString EOF
            {
             before(grammarAccess.getExpressionStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_entryRuleExpressionString903);
            ruleExpressionString();

            state._fsp--;

             after(grammarAccess.getExpressionStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionString910); 

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
    // $ANTLR end "entryRuleExpressionString"


    // $ANTLR start "ruleExpressionString"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:463:1: ruleExpressionString : ( ( rule__ExpressionString__Alternatives )* ) ;
    public final void ruleExpressionString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:467:2: ( ( ( rule__ExpressionString__Alternatives )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:468:1: ( ( rule__ExpressionString__Alternatives )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:468:1: ( ( rule__ExpressionString__Alternatives )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:469:1: ( rule__ExpressionString__Alternatives )*
            {
             before(grammarAccess.getExpressionStringAccess().getAlternatives()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:470:1: ( rule__ExpressionString__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_ID||(LA1_2>=14 && LA1_2<=19)||LA1_2==22) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:470:2: rule__ExpressionString__Alternatives
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExpressionString__Alternatives_in_ruleExpressionString936);
            	    rule__ExpressionString__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExpressionStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpressionString"


    // $ANTLR start "rule__Atributo__Alternatives_3_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:482:1: rule__Atributo__Alternatives_3_1 : ( ( ( rule__Atributo__Group_3_1_0__0 ) ) | ( ( rule__Atributo__ValorAssignment_3_1_1 ) ) );
    public final void rule__Atributo__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:486:1: ( ( ( rule__Atributo__Group_3_1_0__0 ) ) | ( ( rule__Atributo__ValorAssignment_3_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:487:1: ( ( rule__Atributo__Group_3_1_0__0 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:487:1: ( ( rule__Atributo__Group_3_1_0__0 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:488:1: ( rule__Atributo__Group_3_1_0__0 )
                    {
                     before(grammarAccess.getAtributoAccess().getGroup_3_1_0()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:489:1: ( rule__Atributo__Group_3_1_0__0 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:489:2: rule__Atributo__Group_3_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0__0_in_rule__Atributo__Alternatives_3_1973);
                    rule__Atributo__Group_3_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoAccess().getGroup_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:493:6: ( ( rule__Atributo__ValorAssignment_3_1_1 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:493:6: ( ( rule__Atributo__ValorAssignment_3_1_1 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:494:1: ( rule__Atributo__ValorAssignment_3_1_1 )
                    {
                     before(grammarAccess.getAtributoAccess().getValorAssignment_3_1_1()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:495:1: ( rule__Atributo__ValorAssignment_3_1_1 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:495:2: rule__Atributo__ValorAssignment_3_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__ValorAssignment_3_1_1_in_rule__Atributo__Alternatives_3_1991);
                    rule__Atributo__ValorAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoAccess().getValorAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Atributo__Alternatives_3_1"


    // $ANTLR start "rule__List__Alternatives_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:504:1: rule__List__Alternatives_0 : ( ( 'List' ) | ( 'IEnumerable' ) );
    public final void rule__List__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:508:1: ( ( 'List' ) | ( 'IEnumerable' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:509:1: ( 'List' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:509:1: ( 'List' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:510:1: 'List'
                    {
                     before(grammarAccess.getListAccess().getListKeyword_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__List__Alternatives_01025); 
                     after(grammarAccess.getListAccess().getListKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:517:6: ( 'IEnumerable' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:517:6: ( 'IEnumerable' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:518:1: 'IEnumerable'
                    {
                     before(grammarAccess.getListAccess().getIEnumerableKeyword_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__List__Alternatives_01045); 
                     after(grammarAccess.getListAccess().getIEnumerableKeyword_0_1()); 

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
    // $ANTLR end "rule__List__Alternatives_0"


    // $ANTLR start "rule__Propiedad__Alternatives_3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:531:1: rule__Propiedad__Alternatives_3 : ( ( ( rule__Propiedad__TipoAssignment_3_0 ) ) | ( ( rule__Propiedad__TipoPrimitivoAssignment_3_1 ) ) | ( ( rule__Propiedad__ListaAssignment_3_2 ) ) );
    public final void rule__Propiedad__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:535:1: ( ( ( rule__Propiedad__TipoAssignment_3_0 ) ) | ( ( rule__Propiedad__TipoPrimitivoAssignment_3_1 ) ) | ( ( rule__Propiedad__ListaAssignment_3_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_DATATYPES:
                {
                alt4=2;
                }
                break;
            case 12:
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:536:1: ( ( rule__Propiedad__TipoAssignment_3_0 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:536:1: ( ( rule__Propiedad__TipoAssignment_3_0 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:537:1: ( rule__Propiedad__TipoAssignment_3_0 )
                    {
                     before(grammarAccess.getPropiedadAccess().getTipoAssignment_3_0()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:538:1: ( rule__Propiedad__TipoAssignment_3_0 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:538:2: rule__Propiedad__TipoAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Propiedad__TipoAssignment_3_0_in_rule__Propiedad__Alternatives_31080);
                    rule__Propiedad__TipoAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropiedadAccess().getTipoAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:542:6: ( ( rule__Propiedad__TipoPrimitivoAssignment_3_1 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:542:6: ( ( rule__Propiedad__TipoPrimitivoAssignment_3_1 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:543:1: ( rule__Propiedad__TipoPrimitivoAssignment_3_1 )
                    {
                     before(grammarAccess.getPropiedadAccess().getTipoPrimitivoAssignment_3_1()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:544:1: ( rule__Propiedad__TipoPrimitivoAssignment_3_1 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:544:2: rule__Propiedad__TipoPrimitivoAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Propiedad__TipoPrimitivoAssignment_3_1_in_rule__Propiedad__Alternatives_31098);
                    rule__Propiedad__TipoPrimitivoAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropiedadAccess().getTipoPrimitivoAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:548:6: ( ( rule__Propiedad__ListaAssignment_3_2 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:548:6: ( ( rule__Propiedad__ListaAssignment_3_2 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:549:1: ( rule__Propiedad__ListaAssignment_3_2 )
                    {
                     before(grammarAccess.getPropiedadAccess().getListaAssignment_3_2()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:550:1: ( rule__Propiedad__ListaAssignment_3_2 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:550:2: rule__Propiedad__ListaAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Propiedad__ListaAssignment_3_2_in_rule__Propiedad__Alternatives_31116);
                    rule__Propiedad__ListaAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropiedadAccess().getListaAssignment_3_2()); 

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
    // $ANTLR end "rule__Propiedad__Alternatives_3"


    // $ANTLR start "rule__Metodo__Alternatives_3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:559:1: rule__Metodo__Alternatives_3 : ( ( ( rule__Metodo__TipoAssignment_3_0 ) ) | ( ( rule__Metodo__TipoPrimitivoAssignment_3_1 ) ) | ( ( rule__Metodo__ListaAssignment_3_2 ) ) );
    public final void rule__Metodo__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:563:1: ( ( ( rule__Metodo__TipoAssignment_3_0 ) ) | ( ( rule__Metodo__TipoPrimitivoAssignment_3_1 ) ) | ( ( rule__Metodo__ListaAssignment_3_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_DATATYPES:
                {
                alt5=2;
                }
                break;
            case 12:
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:564:1: ( ( rule__Metodo__TipoAssignment_3_0 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:564:1: ( ( rule__Metodo__TipoAssignment_3_0 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:565:1: ( rule__Metodo__TipoAssignment_3_0 )
                    {
                     before(grammarAccess.getMetodoAccess().getTipoAssignment_3_0()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:566:1: ( rule__Metodo__TipoAssignment_3_0 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:566:2: rule__Metodo__TipoAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Metodo__TipoAssignment_3_0_in_rule__Metodo__Alternatives_31149);
                    rule__Metodo__TipoAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetodoAccess().getTipoAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:570:6: ( ( rule__Metodo__TipoPrimitivoAssignment_3_1 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:570:6: ( ( rule__Metodo__TipoPrimitivoAssignment_3_1 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:571:1: ( rule__Metodo__TipoPrimitivoAssignment_3_1 )
                    {
                     before(grammarAccess.getMetodoAccess().getTipoPrimitivoAssignment_3_1()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:572:1: ( rule__Metodo__TipoPrimitivoAssignment_3_1 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:572:2: rule__Metodo__TipoPrimitivoAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Metodo__TipoPrimitivoAssignment_3_1_in_rule__Metodo__Alternatives_31167);
                    rule__Metodo__TipoPrimitivoAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetodoAccess().getTipoPrimitivoAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:576:6: ( ( rule__Metodo__ListaAssignment_3_2 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:576:6: ( ( rule__Metodo__ListaAssignment_3_2 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:577:1: ( rule__Metodo__ListaAssignment_3_2 )
                    {
                     before(grammarAccess.getMetodoAccess().getListaAssignment_3_2()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:578:1: ( rule__Metodo__ListaAssignment_3_2 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:578:2: rule__Metodo__ListaAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Metodo__ListaAssignment_3_2_in_rule__Metodo__Alternatives_31185);
                    rule__Metodo__ListaAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetodoAccess().getListaAssignment_3_2()); 

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
    // $ANTLR end "rule__Metodo__Alternatives_3"


    // $ANTLR start "rule__Parametro__Alternatives_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:587:1: rule__Parametro__Alternatives_2 : ( ( ( rule__Parametro__TipoAssignment_2_0 ) ) | ( ( rule__Parametro__TipoPrimitivoAssignment_2_1 ) ) | ( ( rule__Parametro__ListaAssignment_2_2 ) ) );
    public final void rule__Parametro__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:591:1: ( ( ( rule__Parametro__TipoAssignment_2_0 ) ) | ( ( rule__Parametro__TipoPrimitivoAssignment_2_1 ) ) | ( ( rule__Parametro__ListaAssignment_2_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_DATATYPES:
                {
                alt6=2;
                }
                break;
            case 12:
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:592:1: ( ( rule__Parametro__TipoAssignment_2_0 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:592:1: ( ( rule__Parametro__TipoAssignment_2_0 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:593:1: ( rule__Parametro__TipoAssignment_2_0 )
                    {
                     before(grammarAccess.getParametroAccess().getTipoAssignment_2_0()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:594:1: ( rule__Parametro__TipoAssignment_2_0 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:594:2: rule__Parametro__TipoAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parametro__TipoAssignment_2_0_in_rule__Parametro__Alternatives_21218);
                    rule__Parametro__TipoAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParametroAccess().getTipoAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:598:6: ( ( rule__Parametro__TipoPrimitivoAssignment_2_1 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:598:6: ( ( rule__Parametro__TipoPrimitivoAssignment_2_1 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:599:1: ( rule__Parametro__TipoPrimitivoAssignment_2_1 )
                    {
                     before(grammarAccess.getParametroAccess().getTipoPrimitivoAssignment_2_1()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:600:1: ( rule__Parametro__TipoPrimitivoAssignment_2_1 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:600:2: rule__Parametro__TipoPrimitivoAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parametro__TipoPrimitivoAssignment_2_1_in_rule__Parametro__Alternatives_21236);
                    rule__Parametro__TipoPrimitivoAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParametroAccess().getTipoPrimitivoAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:604:6: ( ( rule__Parametro__ListaAssignment_2_2 ) )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:604:6: ( ( rule__Parametro__ListaAssignment_2_2 ) )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:605:1: ( rule__Parametro__ListaAssignment_2_2 )
                    {
                     before(grammarAccess.getParametroAccess().getListaAssignment_2_2()); 
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:606:1: ( rule__Parametro__ListaAssignment_2_2 )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:606:2: rule__Parametro__ListaAssignment_2_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parametro__ListaAssignment_2_2_in_rule__Parametro__Alternatives_21254);
                    rule__Parametro__ListaAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getParametroAccess().getListaAssignment_2_2()); 

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
    // $ANTLR end "rule__Parametro__Alternatives_2"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:615:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:619:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:620:1: ( RULE_STRING )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:620:1: ( RULE_STRING )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:621:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1287); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:626:6: ( RULE_ID )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:626:6: ( RULE_ID )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:627:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1304); 
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


    // $ANTLR start "rule__Characters__Alternatives"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:637:1: rule__Characters__Alternatives : ( ( RULE_ID ) | ( '.' ) | ( ';' ) | ( '_' ) | ( '(' ) | ( ')' ) | ( '=' ) );
    public final void rule__Characters__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:641:1: ( ( RULE_ID ) | ( '.' ) | ( ';' ) | ( '_' ) | ( '(' ) | ( ')' ) | ( '=' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:642:1: ( RULE_ID )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:642:1: ( RULE_ID )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:643:1: RULE_ID
                    {
                     before(grammarAccess.getCharactersAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Characters__Alternatives1336); 
                     after(grammarAccess.getCharactersAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:648:6: ( '.' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:648:6: ( '.' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:649:1: '.'
                    {
                     before(grammarAccess.getCharactersAccess().getFullStopKeyword_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Characters__Alternatives1354); 
                     after(grammarAccess.getCharactersAccess().getFullStopKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:656:6: ( ';' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:656:6: ( ';' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:657:1: ';'
                    {
                     before(grammarAccess.getCharactersAccess().getSemicolonKeyword_2()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Characters__Alternatives1374); 
                     after(grammarAccess.getCharactersAccess().getSemicolonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:664:6: ( '_' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:664:6: ( '_' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:665:1: '_'
                    {
                     before(grammarAccess.getCharactersAccess().get_Keyword_3()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Characters__Alternatives1394); 
                     after(grammarAccess.getCharactersAccess().get_Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:672:6: ( '(' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:672:6: ( '(' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:673:1: '('
                    {
                     before(grammarAccess.getCharactersAccess().getLeftParenthesisKeyword_4()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Characters__Alternatives1414); 
                     after(grammarAccess.getCharactersAccess().getLeftParenthesisKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:680:6: ( ')' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:680:6: ( ')' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:681:1: ')'
                    {
                     before(grammarAccess.getCharactersAccess().getRightParenthesisKeyword_5()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Characters__Alternatives1434); 
                     after(grammarAccess.getCharactersAccess().getRightParenthesisKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:688:6: ( '=' )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:688:6: ( '=' )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:689:1: '='
                    {
                     before(grammarAccess.getCharactersAccess().getEqualsSignKeyword_6()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Characters__Alternatives1454); 
                     after(grammarAccess.getCharactersAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__Characters__Alternatives"


    // $ANTLR start "rule__ExpressionString__Alternatives"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:701:1: rule__ExpressionString__Alternatives : ( ( ruleCharacters ) | ( ruleBlock ) );
    public final void rule__ExpressionString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:705:1: ( ( ruleCharacters ) | ( ruleBlock ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=14 && LA9_0<=19)) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:706:1: ( ruleCharacters )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:706:1: ( ruleCharacters )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:707:1: ruleCharacters
                    {
                     before(grammarAccess.getExpressionStringAccess().getCharactersParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCharacters_in_rule__ExpressionString__Alternatives1488);
                    ruleCharacters();

                    state._fsp--;

                     after(grammarAccess.getExpressionStringAccess().getCharactersParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:712:6: ( ruleBlock )
                    {
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:712:6: ( ruleBlock )
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:713:1: ruleBlock
                    {
                     before(grammarAccess.getExpressionStringAccess().getBlockParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__ExpressionString__Alternatives1505);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getExpressionStringAccess().getBlockParserRuleCall_1()); 

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
    // $ANTLR end "rule__ExpressionString__Alternatives"


    // $ANTLR start "rule__CSharp__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:725:1: rule__CSharp__Group__0 : rule__CSharp__Group__0__Impl rule__CSharp__Group__1 ;
    public final void rule__CSharp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:729:1: ( rule__CSharp__Group__0__Impl rule__CSharp__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:730:2: rule__CSharp__Group__0__Impl rule__CSharp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CSharp__Group__0__Impl_in_rule__CSharp__Group__01535);
            rule__CSharp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CSharp__Group__1_in_rule__CSharp__Group__01538);
            rule__CSharp__Group__1();

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
    // $ANTLR end "rule__CSharp__Group__0"


    // $ANTLR start "rule__CSharp__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:737:1: rule__CSharp__Group__0__Impl : ( () ) ;
    public final void rule__CSharp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:741:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:742:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:742:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:743:1: ()
            {
             before(grammarAccess.getCSharpAccess().getCSharpAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:744:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:746:1: 
            {
            }

             after(grammarAccess.getCSharpAccess().getCSharpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSharp__Group__0__Impl"


    // $ANTLR start "rule__CSharp__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:756:1: rule__CSharp__Group__1 : rule__CSharp__Group__1__Impl ;
    public final void rule__CSharp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:760:1: ( rule__CSharp__Group__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:761:2: rule__CSharp__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CSharp__Group__1__Impl_in_rule__CSharp__Group__11596);
            rule__CSharp__Group__1__Impl();

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
    // $ANTLR end "rule__CSharp__Group__1"


    // $ANTLR start "rule__CSharp__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:767:1: rule__CSharp__Group__1__Impl : ( ( rule__CSharp__ClasesAssignment_1 )* ) ;
    public final void rule__CSharp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:771:1: ( ( ( rule__CSharp__ClasesAssignment_1 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:772:1: ( ( rule__CSharp__ClasesAssignment_1 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:772:1: ( ( rule__CSharp__ClasesAssignment_1 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:773:1: ( rule__CSharp__ClasesAssignment_1 )*
            {
             before(grammarAccess.getCSharpAccess().getClasesAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:774:1: ( rule__CSharp__ClasesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=14 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:774:2: rule__CSharp__ClasesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CSharp__ClasesAssignment_1_in_rule__CSharp__Group__1__Impl1623);
            	    rule__CSharp__ClasesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCSharpAccess().getClasesAssignment_1()); 

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
    // $ANTLR end "rule__CSharp__Group__1__Impl"


    // $ANTLR start "rule__Clase__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:788:1: rule__Clase__Group__0 : rule__Clase__Group__0__Impl rule__Clase__Group__1 ;
    public final void rule__Clase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:792:1: ( rule__Clase__Group__0__Impl rule__Clase__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:793:2: rule__Clase__Group__0__Impl rule__Clase__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__0__Impl_in_rule__Clase__Group__01658);
            rule__Clase__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__1_in_rule__Clase__Group__01661);
            rule__Clase__Group__1();

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
    // $ANTLR end "rule__Clase__Group__0"


    // $ANTLR start "rule__Clase__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:800:1: rule__Clase__Group__0__Impl : ( () ) ;
    public final void rule__Clase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:804:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:805:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:805:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:806:1: ()
            {
             before(grammarAccess.getClaseAccess().getClaseAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:807:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:809:1: 
            {
            }

             after(grammarAccess.getClaseAccess().getClaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clase__Group__0__Impl"


    // $ANTLR start "rule__Clase__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:819:1: rule__Clase__Group__1 : rule__Clase__Group__1__Impl rule__Clase__Group__2 ;
    public final void rule__Clase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:823:1: ( rule__Clase__Group__1__Impl rule__Clase__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:824:2: rule__Clase__Group__1__Impl rule__Clase__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__1__Impl_in_rule__Clase__Group__11719);
            rule__Clase__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__2_in_rule__Clase__Group__11722);
            rule__Clase__Group__2();

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
    // $ANTLR end "rule__Clase__Group__1"


    // $ANTLR start "rule__Clase__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:831:1: rule__Clase__Group__1__Impl : ( ( rule__Clase__NamespaceAssignment_1 ) ) ;
    public final void rule__Clase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:835:1: ( ( ( rule__Clase__NamespaceAssignment_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:836:1: ( ( rule__Clase__NamespaceAssignment_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:836:1: ( ( rule__Clase__NamespaceAssignment_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:837:1: ( rule__Clase__NamespaceAssignment_1 )
            {
             before(grammarAccess.getClaseAccess().getNamespaceAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:838:1: ( rule__Clase__NamespaceAssignment_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:838:2: rule__Clase__NamespaceAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__NamespaceAssignment_1_in_rule__Clase__Group__1__Impl1749);
            rule__Clase__NamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClaseAccess().getNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Clase__Group__1__Impl"


    // $ANTLR start "rule__Clase__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:848:1: rule__Clase__Group__2 : rule__Clase__Group__2__Impl rule__Clase__Group__3 ;
    public final void rule__Clase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:852:1: ( rule__Clase__Group__2__Impl rule__Clase__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:853:2: rule__Clase__Group__2__Impl rule__Clase__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__2__Impl_in_rule__Clase__Group__21779);
            rule__Clase__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__3_in_rule__Clase__Group__21782);
            rule__Clase__Group__3();

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
    // $ANTLR end "rule__Clase__Group__2"


    // $ANTLR start "rule__Clase__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:860:1: rule__Clase__Group__2__Impl : ( '{' ) ;
    public final void rule__Clase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:864:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:865:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:865:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:866:1: '{'
            {
             before(grammarAccess.getClaseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Clase__Group__2__Impl1810); 
             after(grammarAccess.getClaseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Clase__Group__2__Impl"


    // $ANTLR start "rule__Clase__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:879:1: rule__Clase__Group__3 : rule__Clase__Group__3__Impl rule__Clase__Group__4 ;
    public final void rule__Clase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:883:1: ( rule__Clase__Group__3__Impl rule__Clase__Group__4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:884:2: rule__Clase__Group__3__Impl rule__Clase__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__3__Impl_in_rule__Clase__Group__31841);
            rule__Clase__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__4_in_rule__Clase__Group__31844);
            rule__Clase__Group__4();

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
    // $ANTLR end "rule__Clase__Group__3"


    // $ANTLR start "rule__Clase__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:891:1: rule__Clase__Group__3__Impl : ( ( rule__Clase__AtributosAssignment_3 )* ) ;
    public final void rule__Clase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:895:1: ( ( ( rule__Clase__AtributosAssignment_3 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:896:1: ( ( rule__Clase__AtributosAssignment_3 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:896:1: ( ( rule__Clase__AtributosAssignment_3 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:897:1: ( rule__Clase__AtributosAssignment_3 )*
            {
             before(grammarAccess.getClaseAccess().getAtributosAssignment_3()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:898:1: ( rule__Clase__AtributosAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:898:2: rule__Clase__AtributosAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clase__AtributosAssignment_3_in_rule__Clase__Group__3__Impl1871);
            	    rule__Clase__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClaseAccess().getAtributosAssignment_3()); 

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
    // $ANTLR end "rule__Clase__Group__3__Impl"


    // $ANTLR start "rule__Clase__Group__4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:908:1: rule__Clase__Group__4 : rule__Clase__Group__4__Impl rule__Clase__Group__5 ;
    public final void rule__Clase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:912:1: ( rule__Clase__Group__4__Impl rule__Clase__Group__5 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:913:2: rule__Clase__Group__4__Impl rule__Clase__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__4__Impl_in_rule__Clase__Group__41902);
            rule__Clase__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__5_in_rule__Clase__Group__41905);
            rule__Clase__Group__5();

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
    // $ANTLR end "rule__Clase__Group__4"


    // $ANTLR start "rule__Clase__Group__4__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:920:1: rule__Clase__Group__4__Impl : ( 'public class' ) ;
    public final void rule__Clase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:924:1: ( ( 'public class' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:925:1: ( 'public class' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:925:1: ( 'public class' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:926:1: 'public class'
            {
             before(grammarAccess.getClaseAccess().getPublicClassKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Clase__Group__4__Impl1933); 
             after(grammarAccess.getClaseAccess().getPublicClassKeyword_4()); 

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
    // $ANTLR end "rule__Clase__Group__4__Impl"


    // $ANTLR start "rule__Clase__Group__5"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:939:1: rule__Clase__Group__5 : rule__Clase__Group__5__Impl rule__Clase__Group__6 ;
    public final void rule__Clase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:943:1: ( rule__Clase__Group__5__Impl rule__Clase__Group__6 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:944:2: rule__Clase__Group__5__Impl rule__Clase__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__5__Impl_in_rule__Clase__Group__51964);
            rule__Clase__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__6_in_rule__Clase__Group__51967);
            rule__Clase__Group__6();

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
    // $ANTLR end "rule__Clase__Group__5"


    // $ANTLR start "rule__Clase__Group__5__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:951:1: rule__Clase__Group__5__Impl : ( ( rule__Clase__NameAssignment_5 ) ) ;
    public final void rule__Clase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:955:1: ( ( ( rule__Clase__NameAssignment_5 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:956:1: ( ( rule__Clase__NameAssignment_5 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:956:1: ( ( rule__Clase__NameAssignment_5 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:957:1: ( rule__Clase__NameAssignment_5 )
            {
             before(grammarAccess.getClaseAccess().getNameAssignment_5()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:958:1: ( rule__Clase__NameAssignment_5 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:958:2: rule__Clase__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__NameAssignment_5_in_rule__Clase__Group__5__Impl1994);
            rule__Clase__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClaseAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__Clase__Group__5__Impl"


    // $ANTLR start "rule__Clase__Group__6"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:968:1: rule__Clase__Group__6 : rule__Clase__Group__6__Impl rule__Clase__Group__7 ;
    public final void rule__Clase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:972:1: ( rule__Clase__Group__6__Impl rule__Clase__Group__7 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:973:2: rule__Clase__Group__6__Impl rule__Clase__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__6__Impl_in_rule__Clase__Group__62024);
            rule__Clase__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__7_in_rule__Clase__Group__62027);
            rule__Clase__Group__7();

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
    // $ANTLR end "rule__Clase__Group__6"


    // $ANTLR start "rule__Clase__Group__6__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:980:1: rule__Clase__Group__6__Impl : ( ( rule__Clase__Group_6__0 )? ) ;
    public final void rule__Clase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:984:1: ( ( ( rule__Clase__Group_6__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:985:1: ( ( rule__Clase__Group_6__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:985:1: ( ( rule__Clase__Group_6__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:986:1: ( rule__Clase__Group_6__0 )?
            {
             before(grammarAccess.getClaseAccess().getGroup_6()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:987:1: ( rule__Clase__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:987:2: rule__Clase__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Clase__Group_6__0_in_rule__Clase__Group__6__Impl2054);
                    rule__Clase__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClaseAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Clase__Group__6__Impl"


    // $ANTLR start "rule__Clase__Group__7"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:997:1: rule__Clase__Group__7 : rule__Clase__Group__7__Impl rule__Clase__Group__8 ;
    public final void rule__Clase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1001:1: ( rule__Clase__Group__7__Impl rule__Clase__Group__8 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1002:2: rule__Clase__Group__7__Impl rule__Clase__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__7__Impl_in_rule__Clase__Group__72085);
            rule__Clase__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__8_in_rule__Clase__Group__72088);
            rule__Clase__Group__8();

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
    // $ANTLR end "rule__Clase__Group__7"


    // $ANTLR start "rule__Clase__Group__7__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1009:1: rule__Clase__Group__7__Impl : ( '{' ) ;
    public final void rule__Clase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1013:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1014:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1014:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1015:1: '{'
            {
             before(grammarAccess.getClaseAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Clase__Group__7__Impl2116); 
             after(grammarAccess.getClaseAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Clase__Group__7__Impl"


    // $ANTLR start "rule__Clase__Group__8"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1028:1: rule__Clase__Group__8 : rule__Clase__Group__8__Impl rule__Clase__Group__9 ;
    public final void rule__Clase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1032:1: ( rule__Clase__Group__8__Impl rule__Clase__Group__9 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1033:2: rule__Clase__Group__8__Impl rule__Clase__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__8__Impl_in_rule__Clase__Group__82147);
            rule__Clase__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__9_in_rule__Clase__Group__82150);
            rule__Clase__Group__9();

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
    // $ANTLR end "rule__Clase__Group__8"


    // $ANTLR start "rule__Clase__Group__8__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1040:1: rule__Clase__Group__8__Impl : ( ( rule__Clase__TextoAssignment_8 ) ) ;
    public final void rule__Clase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1044:1: ( ( ( rule__Clase__TextoAssignment_8 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1045:1: ( ( rule__Clase__TextoAssignment_8 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1045:1: ( ( rule__Clase__TextoAssignment_8 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1046:1: ( rule__Clase__TextoAssignment_8 )
            {
             before(grammarAccess.getClaseAccess().getTextoAssignment_8()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1047:1: ( rule__Clase__TextoAssignment_8 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1047:2: rule__Clase__TextoAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__TextoAssignment_8_in_rule__Clase__Group__8__Impl2177);
            rule__Clase__TextoAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getClaseAccess().getTextoAssignment_8()); 

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
    // $ANTLR end "rule__Clase__Group__8__Impl"


    // $ANTLR start "rule__Clase__Group__9"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1057:1: rule__Clase__Group__9 : rule__Clase__Group__9__Impl rule__Clase__Group__10 ;
    public final void rule__Clase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1061:1: ( rule__Clase__Group__9__Impl rule__Clase__Group__10 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1062:2: rule__Clase__Group__9__Impl rule__Clase__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__9__Impl_in_rule__Clase__Group__92207);
            rule__Clase__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__10_in_rule__Clase__Group__92210);
            rule__Clase__Group__10();

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
    // $ANTLR end "rule__Clase__Group__9"


    // $ANTLR start "rule__Clase__Group__9__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1069:1: rule__Clase__Group__9__Impl : ( ( rule__Clase__ConstructoresAssignment_9 )* ) ;
    public final void rule__Clase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1073:1: ( ( ( rule__Clase__ConstructoresAssignment_9 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1074:1: ( ( rule__Clase__ConstructoresAssignment_9 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1074:1: ( ( rule__Clase__ConstructoresAssignment_9 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1075:1: ( rule__Clase__ConstructoresAssignment_9 )*
            {
             before(grammarAccess.getClaseAccess().getConstructoresAssignment_9()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1076:1: ( rule__Clase__ConstructoresAssignment_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_ID) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==17) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1076:2: rule__Clase__ConstructoresAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clase__ConstructoresAssignment_9_in_rule__Clase__Group__9__Impl2237);
            	    rule__Clase__ConstructoresAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClaseAccess().getConstructoresAssignment_9()); 

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
    // $ANTLR end "rule__Clase__Group__9__Impl"


    // $ANTLR start "rule__Clase__Group__10"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1086:1: rule__Clase__Group__10 : rule__Clase__Group__10__Impl rule__Clase__Group__11 ;
    public final void rule__Clase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1090:1: ( rule__Clase__Group__10__Impl rule__Clase__Group__11 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1091:2: rule__Clase__Group__10__Impl rule__Clase__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__10__Impl_in_rule__Clase__Group__102268);
            rule__Clase__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__11_in_rule__Clase__Group__102271);
            rule__Clase__Group__11();

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
    // $ANTLR end "rule__Clase__Group__10"


    // $ANTLR start "rule__Clase__Group__10__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1098:1: rule__Clase__Group__10__Impl : ( ( rule__Clase__EnumsAssignment_10 )* ) ;
    public final void rule__Clase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1102:1: ( ( ( rule__Clase__EnumsAssignment_10 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1103:1: ( ( rule__Clase__EnumsAssignment_10 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1103:1: ( ( rule__Clase__EnumsAssignment_10 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1104:1: ( rule__Clase__EnumsAssignment_10 )*
            {
             before(grammarAccess.getClaseAccess().getEnumsAssignment_10()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1105:1: ( rule__Clase__EnumsAssignment_10 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1105:2: rule__Clase__EnumsAssignment_10
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clase__EnumsAssignment_10_in_rule__Clase__Group__10__Impl2298);
            	    rule__Clase__EnumsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClaseAccess().getEnumsAssignment_10()); 

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
    // $ANTLR end "rule__Clase__Group__10__Impl"


    // $ANTLR start "rule__Clase__Group__11"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1115:1: rule__Clase__Group__11 : rule__Clase__Group__11__Impl rule__Clase__Group__12 ;
    public final void rule__Clase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1119:1: ( rule__Clase__Group__11__Impl rule__Clase__Group__12 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1120:2: rule__Clase__Group__11__Impl rule__Clase__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__11__Impl_in_rule__Clase__Group__112329);
            rule__Clase__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__12_in_rule__Clase__Group__112332);
            rule__Clase__Group__12();

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
    // $ANTLR end "rule__Clase__Group__11"


    // $ANTLR start "rule__Clase__Group__11__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1127:1: rule__Clase__Group__11__Impl : ( ( rule__Clase__PropiedadesAssignment_11 )* ) ;
    public final void rule__Clase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1131:1: ( ( ( rule__Clase__PropiedadesAssignment_11 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1132:1: ( ( rule__Clase__PropiedadesAssignment_11 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1132:1: ( ( rule__Clase__PropiedadesAssignment_11 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1133:1: ( rule__Clase__PropiedadesAssignment_11 )*
            {
             before(grammarAccess.getClaseAccess().getPropiedadesAssignment_11()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1134:1: ( rule__Clase__PropiedadesAssignment_11 )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1134:2: rule__Clase__PropiedadesAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clase__PropiedadesAssignment_11_in_rule__Clase__Group__11__Impl2359);
            	    rule__Clase__PropiedadesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClaseAccess().getPropiedadesAssignment_11()); 

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
    // $ANTLR end "rule__Clase__Group__11__Impl"


    // $ANTLR start "rule__Clase__Group__12"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1144:1: rule__Clase__Group__12 : rule__Clase__Group__12__Impl rule__Clase__Group__13 ;
    public final void rule__Clase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1148:1: ( rule__Clase__Group__12__Impl rule__Clase__Group__13 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1149:2: rule__Clase__Group__12__Impl rule__Clase__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__12__Impl_in_rule__Clase__Group__122390);
            rule__Clase__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__13_in_rule__Clase__Group__122393);
            rule__Clase__Group__13();

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
    // $ANTLR end "rule__Clase__Group__12"


    // $ANTLR start "rule__Clase__Group__12__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1156:1: rule__Clase__Group__12__Impl : ( ( rule__Clase__MetodosAssignment_12 )* ) ;
    public final void rule__Clase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1160:1: ( ( ( rule__Clase__MetodosAssignment_12 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1161:1: ( ( rule__Clase__MetodosAssignment_12 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1161:1: ( ( rule__Clase__MetodosAssignment_12 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1162:1: ( rule__Clase__MetodosAssignment_12 )*
            {
             before(grammarAccess.getClaseAccess().getMetodosAssignment_12()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1163:1: ( rule__Clase__MetodosAssignment_12 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1163:2: rule__Clase__MetodosAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Clase__MetodosAssignment_12_in_rule__Clase__Group__12__Impl2420);
            	    rule__Clase__MetodosAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getClaseAccess().getMetodosAssignment_12()); 

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
    // $ANTLR end "rule__Clase__Group__12__Impl"


    // $ANTLR start "rule__Clase__Group__13"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1173:1: rule__Clase__Group__13 : rule__Clase__Group__13__Impl rule__Clase__Group__14 ;
    public final void rule__Clase__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1177:1: ( rule__Clase__Group__13__Impl rule__Clase__Group__14 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1178:2: rule__Clase__Group__13__Impl rule__Clase__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__13__Impl_in_rule__Clase__Group__132451);
            rule__Clase__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__14_in_rule__Clase__Group__132454);
            rule__Clase__Group__14();

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
    // $ANTLR end "rule__Clase__Group__13"


    // $ANTLR start "rule__Clase__Group__13__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1185:1: rule__Clase__Group__13__Impl : ( '}' ) ;
    public final void rule__Clase__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1189:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1190:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1190:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1191:1: '}'
            {
             before(grammarAccess.getClaseAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Clase__Group__13__Impl2482); 
             after(grammarAccess.getClaseAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Clase__Group__13__Impl"


    // $ANTLR start "rule__Clase__Group__14"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1204:1: rule__Clase__Group__14 : rule__Clase__Group__14__Impl ;
    public final void rule__Clase__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1208:1: ( rule__Clase__Group__14__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1209:2: rule__Clase__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group__14__Impl_in_rule__Clase__Group__142513);
            rule__Clase__Group__14__Impl();

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
    // $ANTLR end "rule__Clase__Group__14"


    // $ANTLR start "rule__Clase__Group__14__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1215:1: rule__Clase__Group__14__Impl : ( '}' ) ;
    public final void rule__Clase__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1219:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1220:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1220:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1221:1: '}'
            {
             before(grammarAccess.getClaseAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Clase__Group__14__Impl2541); 
             after(grammarAccess.getClaseAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Clase__Group__14__Impl"


    // $ANTLR start "rule__Clase__Group_6__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1264:1: rule__Clase__Group_6__0 : rule__Clase__Group_6__0__Impl rule__Clase__Group_6__1 ;
    public final void rule__Clase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1268:1: ( rule__Clase__Group_6__0__Impl rule__Clase__Group_6__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1269:2: rule__Clase__Group_6__0__Impl rule__Clase__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group_6__0__Impl_in_rule__Clase__Group_6__02602);
            rule__Clase__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group_6__1_in_rule__Clase__Group_6__02605);
            rule__Clase__Group_6__1();

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
    // $ANTLR end "rule__Clase__Group_6__0"


    // $ANTLR start "rule__Clase__Group_6__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1276:1: rule__Clase__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Clase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1280:1: ( ( ':' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1281:1: ( ':' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1281:1: ( ':' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1282:1: ':'
            {
             before(grammarAccess.getClaseAccess().getColonKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Clase__Group_6__0__Impl2633); 
             after(grammarAccess.getClaseAccess().getColonKeyword_6_0()); 

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
    // $ANTLR end "rule__Clase__Group_6__0__Impl"


    // $ANTLR start "rule__Clase__Group_6__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1295:1: rule__Clase__Group_6__1 : rule__Clase__Group_6__1__Impl ;
    public final void rule__Clase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1299:1: ( rule__Clase__Group_6__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1300:2: rule__Clase__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__Group_6__1__Impl_in_rule__Clase__Group_6__12664);
            rule__Clase__Group_6__1__Impl();

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
    // $ANTLR end "rule__Clase__Group_6__1"


    // $ANTLR start "rule__Clase__Group_6__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1306:1: rule__Clase__Group_6__1__Impl : ( ( rule__Clase__SuperAssignment_6_1 ) ) ;
    public final void rule__Clase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1310:1: ( ( ( rule__Clase__SuperAssignment_6_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1311:1: ( ( rule__Clase__SuperAssignment_6_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1311:1: ( ( rule__Clase__SuperAssignment_6_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1312:1: ( rule__Clase__SuperAssignment_6_1 )
            {
             before(grammarAccess.getClaseAccess().getSuperAssignment_6_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1313:1: ( rule__Clase__SuperAssignment_6_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1313:2: rule__Clase__SuperAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clase__SuperAssignment_6_1_in_rule__Clase__Group_6__1__Impl2691);
            rule__Clase__SuperAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getClaseAccess().getSuperAssignment_6_1()); 

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
    // $ANTLR end "rule__Clase__Group_6__1__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1327:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1331:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1332:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__0__Impl_in_rule__Atributo__Group__02725);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__1_in_rule__Atributo__Group__02728);
            rule__Atributo__Group__1();

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
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1339:1: rule__Atributo__Group__0__Impl : ( () ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1343:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1344:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1344:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1345:1: ()
            {
             before(grammarAccess.getAtributoAccess().getAtributoAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1346:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1348:1: 
            {
            }

             after(grammarAccess.getAtributoAccess().getAtributoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1358:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1362:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1363:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__1__Impl_in_rule__Atributo__Group__12786);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__2_in_rule__Atributo__Group__12789);
            rule__Atributo__Group__2();

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
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1370:1: rule__Atributo__Group__1__Impl : ( '[' ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1374:1: ( ( '[' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1375:1: ( '[' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1375:1: ( '[' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1376:1: '['
            {
             before(grammarAccess.getAtributoAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Atributo__Group__1__Impl2817); 
             after(grammarAccess.getAtributoAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1389:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1393:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1394:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__2__Impl_in_rule__Atributo__Group__22848);
            rule__Atributo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__3_in_rule__Atributo__Group__22851);
            rule__Atributo__Group__3();

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
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1401:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NameAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1405:1: ( ( ( rule__Atributo__NameAssignment_2 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1406:1: ( ( rule__Atributo__NameAssignment_2 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1406:1: ( ( rule__Atributo__NameAssignment_2 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1407:1: ( rule__Atributo__NameAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_2()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1408:1: ( rule__Atributo__NameAssignment_2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1408:2: rule__Atributo__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__NameAssignment_2_in_rule__Atributo__Group__2__Impl2878);
            rule__Atributo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1418:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl rule__Atributo__Group__4 ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1422:1: ( rule__Atributo__Group__3__Impl rule__Atributo__Group__4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1423:2: rule__Atributo__Group__3__Impl rule__Atributo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__3__Impl_in_rule__Atributo__Group__32908);
            rule__Atributo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__4_in_rule__Atributo__Group__32911);
            rule__Atributo__Group__4();

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
    // $ANTLR end "rule__Atributo__Group__3"


    // $ANTLR start "rule__Atributo__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1430:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__Group_3__0 )? ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1434:1: ( ( ( rule__Atributo__Group_3__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1435:1: ( ( rule__Atributo__Group_3__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1435:1: ( ( rule__Atributo__Group_3__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1436:1: ( rule__Atributo__Group_3__0 )?
            {
             before(grammarAccess.getAtributoAccess().getGroup_3()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1437:1: ( rule__Atributo__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1437:2: rule__Atributo__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__0_in_rule__Atributo__Group__3__Impl2938);
                    rule__Atributo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atributo__Group__3__Impl"


    // $ANTLR start "rule__Atributo__Group__4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1447:1: rule__Atributo__Group__4 : rule__Atributo__Group__4__Impl ;
    public final void rule__Atributo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1451:1: ( rule__Atributo__Group__4__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1452:2: rule__Atributo__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__4__Impl_in_rule__Atributo__Group__42969);
            rule__Atributo__Group__4__Impl();

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
    // $ANTLR end "rule__Atributo__Group__4"


    // $ANTLR start "rule__Atributo__Group__4__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1458:1: rule__Atributo__Group__4__Impl : ( ']' ) ;
    public final void rule__Atributo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1462:1: ( ( ']' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1463:1: ( ']' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1463:1: ( ']' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1464:1: ']'
            {
             before(grammarAccess.getAtributoAccess().getRightSquareBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Atributo__Group__4__Impl2997); 
             after(grammarAccess.getAtributoAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Atributo__Group__4__Impl"


    // $ANTLR start "rule__Atributo__Group_3__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1487:1: rule__Atributo__Group_3__0 : rule__Atributo__Group_3__0__Impl rule__Atributo__Group_3__1 ;
    public final void rule__Atributo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1491:1: ( rule__Atributo__Group_3__0__Impl rule__Atributo__Group_3__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1492:2: rule__Atributo__Group_3__0__Impl rule__Atributo__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__0__Impl_in_rule__Atributo__Group_3__03038);
            rule__Atributo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__1_in_rule__Atributo__Group_3__03041);
            rule__Atributo__Group_3__1();

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
    // $ANTLR end "rule__Atributo__Group_3__0"


    // $ANTLR start "rule__Atributo__Group_3__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1499:1: rule__Atributo__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Atributo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1503:1: ( ( '(' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1504:1: ( '(' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1504:1: ( '(' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1505:1: '('
            {
             before(grammarAccess.getAtributoAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Atributo__Group_3__0__Impl3069); 
             after(grammarAccess.getAtributoAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Atributo__Group_3__0__Impl"


    // $ANTLR start "rule__Atributo__Group_3__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1518:1: rule__Atributo__Group_3__1 : rule__Atributo__Group_3__1__Impl rule__Atributo__Group_3__2 ;
    public final void rule__Atributo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1522:1: ( rule__Atributo__Group_3__1__Impl rule__Atributo__Group_3__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1523:2: rule__Atributo__Group_3__1__Impl rule__Atributo__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__1__Impl_in_rule__Atributo__Group_3__13100);
            rule__Atributo__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__2_in_rule__Atributo__Group_3__13103);
            rule__Atributo__Group_3__2();

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
    // $ANTLR end "rule__Atributo__Group_3__1"


    // $ANTLR start "rule__Atributo__Group_3__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1530:1: rule__Atributo__Group_3__1__Impl : ( ( rule__Atributo__Alternatives_3_1 ) ) ;
    public final void rule__Atributo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1534:1: ( ( ( rule__Atributo__Alternatives_3_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1535:1: ( ( rule__Atributo__Alternatives_3_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1535:1: ( ( rule__Atributo__Alternatives_3_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1536:1: ( rule__Atributo__Alternatives_3_1 )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives_3_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1537:1: ( rule__Atributo__Alternatives_3_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1537:2: rule__Atributo__Alternatives_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Alternatives_3_1_in_rule__Atributo__Group_3__1__Impl3130);
            rule__Atributo__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getAlternatives_3_1()); 

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
    // $ANTLR end "rule__Atributo__Group_3__1__Impl"


    // $ANTLR start "rule__Atributo__Group_3__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1547:1: rule__Atributo__Group_3__2 : rule__Atributo__Group_3__2__Impl ;
    public final void rule__Atributo__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1551:1: ( rule__Atributo__Group_3__2__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1552:2: rule__Atributo__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__2__Impl_in_rule__Atributo__Group_3__23160);
            rule__Atributo__Group_3__2__Impl();

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
    // $ANTLR end "rule__Atributo__Group_3__2"


    // $ANTLR start "rule__Atributo__Group_3__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1558:1: rule__Atributo__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Atributo__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1562:1: ( ( ')' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1563:1: ( ')' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1563:1: ( ')' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1564:1: ')'
            {
             before(grammarAccess.getAtributoAccess().getRightParenthesisKeyword_3_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Atributo__Group_3__2__Impl3188); 
             after(grammarAccess.getAtributoAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Atributo__Group_3__2__Impl"


    // $ANTLR start "rule__Atributo__Group_3_1_0__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1583:1: rule__Atributo__Group_3_1_0__0 : rule__Atributo__Group_3_1_0__0__Impl rule__Atributo__Group_3_1_0__1 ;
    public final void rule__Atributo__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1587:1: ( rule__Atributo__Group_3_1_0__0__Impl rule__Atributo__Group_3_1_0__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1588:2: rule__Atributo__Group_3_1_0__0__Impl rule__Atributo__Group_3_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0__0__Impl_in_rule__Atributo__Group_3_1_0__03225);
            rule__Atributo__Group_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0__1_in_rule__Atributo__Group_3_1_0__03228);
            rule__Atributo__Group_3_1_0__1();

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
    // $ANTLR end "rule__Atributo__Group_3_1_0__0"


    // $ANTLR start "rule__Atributo__Group_3_1_0__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1595:1: rule__Atributo__Group_3_1_0__0__Impl : ( ( rule__Atributo__PropiedadesAssignment_3_1_0_0 ) ) ;
    public final void rule__Atributo__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1599:1: ( ( ( rule__Atributo__PropiedadesAssignment_3_1_0_0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1600:1: ( ( rule__Atributo__PropiedadesAssignment_3_1_0_0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1600:1: ( ( rule__Atributo__PropiedadesAssignment_3_1_0_0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1601:1: ( rule__Atributo__PropiedadesAssignment_3_1_0_0 )
            {
             before(grammarAccess.getAtributoAccess().getPropiedadesAssignment_3_1_0_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1602:1: ( rule__Atributo__PropiedadesAssignment_3_1_0_0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1602:2: rule__Atributo__PropiedadesAssignment_3_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__PropiedadesAssignment_3_1_0_0_in_rule__Atributo__Group_3_1_0__0__Impl3255);
            rule__Atributo__PropiedadesAssignment_3_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getPropiedadesAssignment_3_1_0_0()); 

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
    // $ANTLR end "rule__Atributo__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__Atributo__Group_3_1_0__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1612:1: rule__Atributo__Group_3_1_0__1 : rule__Atributo__Group_3_1_0__1__Impl ;
    public final void rule__Atributo__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1616:1: ( rule__Atributo__Group_3_1_0__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1617:2: rule__Atributo__Group_3_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0__1__Impl_in_rule__Atributo__Group_3_1_0__13285);
            rule__Atributo__Group_3_1_0__1__Impl();

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
    // $ANTLR end "rule__Atributo__Group_3_1_0__1"


    // $ANTLR start "rule__Atributo__Group_3_1_0__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1623:1: rule__Atributo__Group_3_1_0__1__Impl : ( ( rule__Atributo__Group_3_1_0_1__0 )* ) ;
    public final void rule__Atributo__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1627:1: ( ( ( rule__Atributo__Group_3_1_0_1__0 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1628:1: ( ( rule__Atributo__Group_3_1_0_1__0 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1628:1: ( ( rule__Atributo__Group_3_1_0_1__0 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1629:1: ( rule__Atributo__Group_3_1_0_1__0 )*
            {
             before(grammarAccess.getAtributoAccess().getGroup_3_1_0_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1630:1: ( rule__Atributo__Group_3_1_0_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1630:2: rule__Atributo__Group_3_1_0_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0_1__0_in_rule__Atributo__Group_3_1_0__1__Impl3312);
            	    rule__Atributo__Group_3_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAtributoAccess().getGroup_3_1_0_1()); 

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
    // $ANTLR end "rule__Atributo__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__Atributo__Group_3_1_0_1__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1644:1: rule__Atributo__Group_3_1_0_1__0 : rule__Atributo__Group_3_1_0_1__0__Impl rule__Atributo__Group_3_1_0_1__1 ;
    public final void rule__Atributo__Group_3_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1648:1: ( rule__Atributo__Group_3_1_0_1__0__Impl rule__Atributo__Group_3_1_0_1__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1649:2: rule__Atributo__Group_3_1_0_1__0__Impl rule__Atributo__Group_3_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0_1__0__Impl_in_rule__Atributo__Group_3_1_0_1__03347);
            rule__Atributo__Group_3_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0_1__1_in_rule__Atributo__Group_3_1_0_1__03350);
            rule__Atributo__Group_3_1_0_1__1();

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
    // $ANTLR end "rule__Atributo__Group_3_1_0_1__0"


    // $ANTLR start "rule__Atributo__Group_3_1_0_1__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1656:1: rule__Atributo__Group_3_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__Atributo__Group_3_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1660:1: ( ( ',' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1661:1: ( ',' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1661:1: ( ',' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1662:1: ','
            {
             before(grammarAccess.getAtributoAccess().getCommaKeyword_3_1_0_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Atributo__Group_3_1_0_1__0__Impl3378); 
             after(grammarAccess.getAtributoAccess().getCommaKeyword_3_1_0_1_0()); 

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
    // $ANTLR end "rule__Atributo__Group_3_1_0_1__0__Impl"


    // $ANTLR start "rule__Atributo__Group_3_1_0_1__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1675:1: rule__Atributo__Group_3_1_0_1__1 : rule__Atributo__Group_3_1_0_1__1__Impl ;
    public final void rule__Atributo__Group_3_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1679:1: ( rule__Atributo__Group_3_1_0_1__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1680:2: rule__Atributo__Group_3_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3_1_0_1__1__Impl_in_rule__Atributo__Group_3_1_0_1__13409);
            rule__Atributo__Group_3_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Atributo__Group_3_1_0_1__1"


    // $ANTLR start "rule__Atributo__Group_3_1_0_1__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1686:1: rule__Atributo__Group_3_1_0_1__1__Impl : ( ( rule__Atributo__PropiedadesAssignment_3_1_0_1_1 ) ) ;
    public final void rule__Atributo__Group_3_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1690:1: ( ( ( rule__Atributo__PropiedadesAssignment_3_1_0_1_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1691:1: ( ( rule__Atributo__PropiedadesAssignment_3_1_0_1_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1691:1: ( ( rule__Atributo__PropiedadesAssignment_3_1_0_1_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1692:1: ( rule__Atributo__PropiedadesAssignment_3_1_0_1_1 )
            {
             before(grammarAccess.getAtributoAccess().getPropiedadesAssignment_3_1_0_1_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1693:1: ( rule__Atributo__PropiedadesAssignment_3_1_0_1_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1693:2: rule__Atributo__PropiedadesAssignment_3_1_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__PropiedadesAssignment_3_1_0_1_1_in_rule__Atributo__Group_3_1_0_1__1__Impl3436);
            rule__Atributo__PropiedadesAssignment_3_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getPropiedadesAssignment_3_1_0_1_1()); 

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
    // $ANTLR end "rule__Atributo__Group_3_1_0_1__1__Impl"


    // $ANTLR start "rule__PropiedadAtributo__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1707:1: rule__PropiedadAtributo__Group__0 : rule__PropiedadAtributo__Group__0__Impl rule__PropiedadAtributo__Group__1 ;
    public final void rule__PropiedadAtributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1711:1: ( rule__PropiedadAtributo__Group__0__Impl rule__PropiedadAtributo__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1712:2: rule__PropiedadAtributo__Group__0__Impl rule__PropiedadAtributo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__0__Impl_in_rule__PropiedadAtributo__Group__03470);
            rule__PropiedadAtributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__1_in_rule__PropiedadAtributo__Group__03473);
            rule__PropiedadAtributo__Group__1();

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
    // $ANTLR end "rule__PropiedadAtributo__Group__0"


    // $ANTLR start "rule__PropiedadAtributo__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1719:1: rule__PropiedadAtributo__Group__0__Impl : ( () ) ;
    public final void rule__PropiedadAtributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1723:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1724:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1724:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1725:1: ()
            {
             before(grammarAccess.getPropiedadAtributoAccess().getPropiedadAtributoAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1726:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1728:1: 
            {
            }

             after(grammarAccess.getPropiedadAtributoAccess().getPropiedadAtributoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropiedadAtributo__Group__0__Impl"


    // $ANTLR start "rule__PropiedadAtributo__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1738:1: rule__PropiedadAtributo__Group__1 : rule__PropiedadAtributo__Group__1__Impl rule__PropiedadAtributo__Group__2 ;
    public final void rule__PropiedadAtributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1742:1: ( rule__PropiedadAtributo__Group__1__Impl rule__PropiedadAtributo__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1743:2: rule__PropiedadAtributo__Group__1__Impl rule__PropiedadAtributo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__1__Impl_in_rule__PropiedadAtributo__Group__13531);
            rule__PropiedadAtributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__2_in_rule__PropiedadAtributo__Group__13534);
            rule__PropiedadAtributo__Group__2();

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
    // $ANTLR end "rule__PropiedadAtributo__Group__1"


    // $ANTLR start "rule__PropiedadAtributo__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1750:1: rule__PropiedadAtributo__Group__1__Impl : ( ( rule__PropiedadAtributo__NameAssignment_1 ) ) ;
    public final void rule__PropiedadAtributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1754:1: ( ( ( rule__PropiedadAtributo__NameAssignment_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1755:1: ( ( rule__PropiedadAtributo__NameAssignment_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1755:1: ( ( rule__PropiedadAtributo__NameAssignment_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1756:1: ( rule__PropiedadAtributo__NameAssignment_1 )
            {
             before(grammarAccess.getPropiedadAtributoAccess().getNameAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1757:1: ( rule__PropiedadAtributo__NameAssignment_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1757:2: rule__PropiedadAtributo__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__NameAssignment_1_in_rule__PropiedadAtributo__Group__1__Impl3561);
            rule__PropiedadAtributo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAtributoAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PropiedadAtributo__Group__1__Impl"


    // $ANTLR start "rule__PropiedadAtributo__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1767:1: rule__PropiedadAtributo__Group__2 : rule__PropiedadAtributo__Group__2__Impl rule__PropiedadAtributo__Group__3 ;
    public final void rule__PropiedadAtributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1771:1: ( rule__PropiedadAtributo__Group__2__Impl rule__PropiedadAtributo__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1772:2: rule__PropiedadAtributo__Group__2__Impl rule__PropiedadAtributo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__2__Impl_in_rule__PropiedadAtributo__Group__23591);
            rule__PropiedadAtributo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__3_in_rule__PropiedadAtributo__Group__23594);
            rule__PropiedadAtributo__Group__3();

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
    // $ANTLR end "rule__PropiedadAtributo__Group__2"


    // $ANTLR start "rule__PropiedadAtributo__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1779:1: rule__PropiedadAtributo__Group__2__Impl : ( '=' ) ;
    public final void rule__PropiedadAtributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1783:1: ( ( '=' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1784:1: ( '=' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1784:1: ( '=' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1785:1: '='
            {
             before(grammarAccess.getPropiedadAtributoAccess().getEqualsSignKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PropiedadAtributo__Group__2__Impl3622); 
             after(grammarAccess.getPropiedadAtributoAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__PropiedadAtributo__Group__2__Impl"


    // $ANTLR start "rule__PropiedadAtributo__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1798:1: rule__PropiedadAtributo__Group__3 : rule__PropiedadAtributo__Group__3__Impl ;
    public final void rule__PropiedadAtributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1802:1: ( rule__PropiedadAtributo__Group__3__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1803:2: rule__PropiedadAtributo__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__Group__3__Impl_in_rule__PropiedadAtributo__Group__33653);
            rule__PropiedadAtributo__Group__3__Impl();

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
    // $ANTLR end "rule__PropiedadAtributo__Group__3"


    // $ANTLR start "rule__PropiedadAtributo__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1809:1: rule__PropiedadAtributo__Group__3__Impl : ( ( rule__PropiedadAtributo__ValorAssignment_3 ) ) ;
    public final void rule__PropiedadAtributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1813:1: ( ( ( rule__PropiedadAtributo__ValorAssignment_3 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1814:1: ( ( rule__PropiedadAtributo__ValorAssignment_3 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1814:1: ( ( rule__PropiedadAtributo__ValorAssignment_3 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1815:1: ( rule__PropiedadAtributo__ValorAssignment_3 )
            {
             before(grammarAccess.getPropiedadAtributoAccess().getValorAssignment_3()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1816:1: ( rule__PropiedadAtributo__ValorAssignment_3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1816:2: rule__PropiedadAtributo__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropiedadAtributo__ValorAssignment_3_in_rule__PropiedadAtributo__Group__3__Impl3680);
            rule__PropiedadAtributo__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAtributoAccess().getValorAssignment_3()); 

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
    // $ANTLR end "rule__PropiedadAtributo__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1834:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1838:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1839:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__03718);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__03721);
            rule__Constructor__Group__1();

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
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1846:1: rule__Constructor__Group__0__Impl : ( () ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1850:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1851:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1851:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1852:1: ()
            {
             before(grammarAccess.getConstructorAccess().getConstructorAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1853:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1855:1: 
            {
            }

             after(grammarAccess.getConstructorAccess().getConstructorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1865:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1869:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1870:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__13779);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__13782);
            rule__Constructor__Group__2();

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
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1877:1: rule__Constructor__Group__1__Impl : ( 'public ' ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1881:1: ( ( 'public ' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1882:1: ( 'public ' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1882:1: ( 'public ' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1883:1: 'public '
            {
             before(grammarAccess.getConstructorAccess().getPublicKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Constructor__Group__1__Impl3810); 
             after(grammarAccess.getConstructorAccess().getPublicKeyword_1()); 

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
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1896:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1900:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1901:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__23841);
            rule__Constructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__23844);
            rule__Constructor__Group__3();

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
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1908:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__NameAssignment_2 ) ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1912:1: ( ( ( rule__Constructor__NameAssignment_2 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1913:1: ( ( rule__Constructor__NameAssignment_2 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1913:1: ( ( rule__Constructor__NameAssignment_2 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1914:1: ( rule__Constructor__NameAssignment_2 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_2()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1915:1: ( rule__Constructor__NameAssignment_2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1915:2: rule__Constructor__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__NameAssignment_2_in_rule__Constructor__Group__2__Impl3871);
            rule__Constructor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1925:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl rule__Constructor__Group__4 ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1929:1: ( rule__Constructor__Group__3__Impl rule__Constructor__Group__4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1930:2: rule__Constructor__Group__3__Impl rule__Constructor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__33901);
            rule__Constructor__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__33904);
            rule__Constructor__Group__4();

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
    // $ANTLR end "rule__Constructor__Group__3"


    // $ANTLR start "rule__Constructor__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1937:1: rule__Constructor__Group__3__Impl : ( '(' ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1941:1: ( ( '(' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1942:1: ( '(' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1942:1: ( '(' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1943:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Constructor__Group__3__Impl3932); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Constructor__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1956:1: rule__Constructor__Group__4 : rule__Constructor__Group__4__Impl rule__Constructor__Group__5 ;
    public final void rule__Constructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1960:1: ( rule__Constructor__Group__4__Impl rule__Constructor__Group__5 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1961:2: rule__Constructor__Group__4__Impl rule__Constructor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__43963);
            rule__Constructor__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__43966);
            rule__Constructor__Group__5();

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
    // $ANTLR end "rule__Constructor__Group__4"


    // $ANTLR start "rule__Constructor__Group__4__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1968:1: rule__Constructor__Group__4__Impl : ( ( rule__Constructor__Group_4__0 )? ) ;
    public final void rule__Constructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1972:1: ( ( ( rule__Constructor__Group_4__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1973:1: ( ( rule__Constructor__Group_4__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1973:1: ( ( rule__Constructor__Group_4__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1974:1: ( rule__Constructor__Group_4__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_4()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1975:1: ( rule__Constructor__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_DATATYPES)||(LA19_0>=12 && LA19_0<=13)||LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1975:2: rule__Constructor__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4__0_in_rule__Constructor__Group__4__Impl3993);
                    rule__Constructor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Constructor__Group__4__Impl"


    // $ANTLR start "rule__Constructor__Group__5"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1985:1: rule__Constructor__Group__5 : rule__Constructor__Group__5__Impl rule__Constructor__Group__6 ;
    public final void rule__Constructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1989:1: ( rule__Constructor__Group__5__Impl rule__Constructor__Group__6 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1990:2: rule__Constructor__Group__5__Impl rule__Constructor__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__54024);
            rule__Constructor__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__54027);
            rule__Constructor__Group__6();

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
    // $ANTLR end "rule__Constructor__Group__5"


    // $ANTLR start "rule__Constructor__Group__5__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:1997:1: rule__Constructor__Group__5__Impl : ( ')' ) ;
    public final void rule__Constructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2001:1: ( ( ')' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2002:1: ( ')' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2002:1: ( ')' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2003:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Constructor__Group__5__Impl4055); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Constructor__Group__5__Impl"


    // $ANTLR start "rule__Constructor__Group__6"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2016:1: rule__Constructor__Group__6 : rule__Constructor__Group__6__Impl rule__Constructor__Group__7 ;
    public final void rule__Constructor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2020:1: ( rule__Constructor__Group__6__Impl rule__Constructor__Group__7 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2021:2: rule__Constructor__Group__6__Impl rule__Constructor__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__64086);
            rule__Constructor__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__64089);
            rule__Constructor__Group__7();

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
    // $ANTLR end "rule__Constructor__Group__6"


    // $ANTLR start "rule__Constructor__Group__6__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2028:1: rule__Constructor__Group__6__Impl : ( '{' ) ;
    public final void rule__Constructor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2032:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2033:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2033:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2034:1: '{'
            {
             before(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Constructor__Group__6__Impl4117); 
             after(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Constructor__Group__6__Impl"


    // $ANTLR start "rule__Constructor__Group__7"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2047:1: rule__Constructor__Group__7 : rule__Constructor__Group__7__Impl rule__Constructor__Group__8 ;
    public final void rule__Constructor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2051:1: ( rule__Constructor__Group__7__Impl rule__Constructor__Group__8 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2052:2: rule__Constructor__Group__7__Impl rule__Constructor__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__74148);
            rule__Constructor__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__8_in_rule__Constructor__Group__74151);
            rule__Constructor__Group__8();

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
    // $ANTLR end "rule__Constructor__Group__7"


    // $ANTLR start "rule__Constructor__Group__7__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2059:1: rule__Constructor__Group__7__Impl : ( ( rule__Constructor__TextoAssignment_7 ) ) ;
    public final void rule__Constructor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2063:1: ( ( ( rule__Constructor__TextoAssignment_7 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2064:1: ( ( rule__Constructor__TextoAssignment_7 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2064:1: ( ( rule__Constructor__TextoAssignment_7 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2065:1: ( rule__Constructor__TextoAssignment_7 )
            {
             before(grammarAccess.getConstructorAccess().getTextoAssignment_7()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2066:1: ( rule__Constructor__TextoAssignment_7 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2066:2: rule__Constructor__TextoAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__TextoAssignment_7_in_rule__Constructor__Group__7__Impl4178);
            rule__Constructor__TextoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getTextoAssignment_7()); 

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
    // $ANTLR end "rule__Constructor__Group__7__Impl"


    // $ANTLR start "rule__Constructor__Group__8"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2076:1: rule__Constructor__Group__8 : rule__Constructor__Group__8__Impl ;
    public final void rule__Constructor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2080:1: ( rule__Constructor__Group__8__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2081:2: rule__Constructor__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group__8__Impl_in_rule__Constructor__Group__84208);
            rule__Constructor__Group__8__Impl();

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
    // $ANTLR end "rule__Constructor__Group__8"


    // $ANTLR start "rule__Constructor__Group__8__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2087:1: rule__Constructor__Group__8__Impl : ( '}' ) ;
    public final void rule__Constructor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2091:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2092:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2092:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2093:1: '}'
            {
             before(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Constructor__Group__8__Impl4236); 
             after(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Constructor__Group__8__Impl"


    // $ANTLR start "rule__Constructor__Group_4__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2124:1: rule__Constructor__Group_4__0 : rule__Constructor__Group_4__0__Impl rule__Constructor__Group_4__1 ;
    public final void rule__Constructor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2128:1: ( rule__Constructor__Group_4__0__Impl rule__Constructor__Group_4__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2129:2: rule__Constructor__Group_4__0__Impl rule__Constructor__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4__0__Impl_in_rule__Constructor__Group_4__04285);
            rule__Constructor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4__1_in_rule__Constructor__Group_4__04288);
            rule__Constructor__Group_4__1();

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
    // $ANTLR end "rule__Constructor__Group_4__0"


    // $ANTLR start "rule__Constructor__Group_4__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2136:1: rule__Constructor__Group_4__0__Impl : ( ( rule__Constructor__ParametrosAssignment_4_0 ) ) ;
    public final void rule__Constructor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2140:1: ( ( ( rule__Constructor__ParametrosAssignment_4_0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2141:1: ( ( rule__Constructor__ParametrosAssignment_4_0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2141:1: ( ( rule__Constructor__ParametrosAssignment_4_0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2142:1: ( rule__Constructor__ParametrosAssignment_4_0 )
            {
             before(grammarAccess.getConstructorAccess().getParametrosAssignment_4_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2143:1: ( rule__Constructor__ParametrosAssignment_4_0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2143:2: rule__Constructor__ParametrosAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__ParametrosAssignment_4_0_in_rule__Constructor__Group_4__0__Impl4315);
            rule__Constructor__ParametrosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametrosAssignment_4_0()); 

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
    // $ANTLR end "rule__Constructor__Group_4__0__Impl"


    // $ANTLR start "rule__Constructor__Group_4__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2153:1: rule__Constructor__Group_4__1 : rule__Constructor__Group_4__1__Impl ;
    public final void rule__Constructor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2157:1: ( rule__Constructor__Group_4__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2158:2: rule__Constructor__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4__1__Impl_in_rule__Constructor__Group_4__14345);
            rule__Constructor__Group_4__1__Impl();

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
    // $ANTLR end "rule__Constructor__Group_4__1"


    // $ANTLR start "rule__Constructor__Group_4__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2164:1: rule__Constructor__Group_4__1__Impl : ( ( rule__Constructor__Group_4_1__0 )* ) ;
    public final void rule__Constructor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2168:1: ( ( ( rule__Constructor__Group_4_1__0 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2169:1: ( ( rule__Constructor__Group_4_1__0 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2169:1: ( ( rule__Constructor__Group_4_1__0 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2170:1: ( rule__Constructor__Group_4_1__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_4_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2171:1: ( rule__Constructor__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2171:2: rule__Constructor__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4_1__0_in_rule__Constructor__Group_4__1__Impl4372);
            	    rule__Constructor__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Constructor__Group_4__1__Impl"


    // $ANTLR start "rule__Constructor__Group_4_1__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2185:1: rule__Constructor__Group_4_1__0 : rule__Constructor__Group_4_1__0__Impl rule__Constructor__Group_4_1__1 ;
    public final void rule__Constructor__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2189:1: ( rule__Constructor__Group_4_1__0__Impl rule__Constructor__Group_4_1__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2190:2: rule__Constructor__Group_4_1__0__Impl rule__Constructor__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4_1__0__Impl_in_rule__Constructor__Group_4_1__04407);
            rule__Constructor__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4_1__1_in_rule__Constructor__Group_4_1__04410);
            rule__Constructor__Group_4_1__1();

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
    // $ANTLR end "rule__Constructor__Group_4_1__0"


    // $ANTLR start "rule__Constructor__Group_4_1__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2197:1: rule__Constructor__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2201:1: ( ( ',' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2202:1: ( ',' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2202:1: ( ',' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2203:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Constructor__Group_4_1__0__Impl4438); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Constructor__Group_4_1__0__Impl"


    // $ANTLR start "rule__Constructor__Group_4_1__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2216:1: rule__Constructor__Group_4_1__1 : rule__Constructor__Group_4_1__1__Impl ;
    public final void rule__Constructor__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2220:1: ( rule__Constructor__Group_4_1__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2221:2: rule__Constructor__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__Group_4_1__1__Impl_in_rule__Constructor__Group_4_1__14469);
            rule__Constructor__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Constructor__Group_4_1__1"


    // $ANTLR start "rule__Constructor__Group_4_1__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2227:1: rule__Constructor__Group_4_1__1__Impl : ( ( rule__Constructor__ParametrosAssignment_4_1_1 ) ) ;
    public final void rule__Constructor__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2231:1: ( ( ( rule__Constructor__ParametrosAssignment_4_1_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2232:1: ( ( rule__Constructor__ParametrosAssignment_4_1_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2232:1: ( ( rule__Constructor__ParametrosAssignment_4_1_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2233:1: ( rule__Constructor__ParametrosAssignment_4_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getParametrosAssignment_4_1_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2234:1: ( rule__Constructor__ParametrosAssignment_4_1_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2234:2: rule__Constructor__ParametrosAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constructor__ParametrosAssignment_4_1_1_in_rule__Constructor__Group_4_1__1__Impl4496);
            rule__Constructor__ParametrosAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametrosAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Constructor__Group_4_1__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2248:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2252:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2253:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04530);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__04533);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2260:1: rule__Enum__Group__0__Impl : ( () ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2264:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2265:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2265:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2266:1: ()
            {
             before(grammarAccess.getEnumAccess().getEnumAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2267:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2269:1: 
            {
            }

             after(grammarAccess.getEnumAccess().getEnumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2279:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2283:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2284:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__14591);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__14594);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2291:1: rule__Enum__Group__1__Impl : ( 'public enum ' ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2295:1: ( ( 'public enum ' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2296:1: ( 'public enum ' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2296:1: ( 'public enum ' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2297:1: 'public enum '
            {
             before(grammarAccess.getEnumAccess().getPublicEnumKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Enum__Group__1__Impl4622); 
             after(grammarAccess.getEnumAccess().getPublicEnumKeyword_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2310:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2314:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2315:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__24653);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__24656);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2322:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__NameAssignment_2 ) ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2326:1: ( ( ( rule__Enum__NameAssignment_2 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2327:1: ( ( rule__Enum__NameAssignment_2 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2327:1: ( ( rule__Enum__NameAssignment_2 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2328:1: ( rule__Enum__NameAssignment_2 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_2()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2329:1: ( rule__Enum__NameAssignment_2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2329:2: rule__Enum__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__NameAssignment_2_in_rule__Enum__Group__2__Impl4683);
            rule__Enum__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2339:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2343:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2344:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__34713);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__34716);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2351:1: rule__Enum__Group__3__Impl : ( '{' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2355:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2356:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2356:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2357:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Enum__Group__3__Impl4744); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2370:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2374:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2375:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44775);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__44778);
            rule__Enum__Group__5();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2382:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )? ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2386:1: ( ( ( rule__Enum__Group_4__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2387:1: ( ( rule__Enum__Group_4__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2387:1: ( ( rule__Enum__Group_4__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2388:1: ( rule__Enum__Group_4__0 )?
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2389:1: ( rule__Enum__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2389:2: rule__Enum__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl4805);
                    rule__Enum__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2399:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2403:1: ( rule__Enum__Group__5__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2404:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__54836);
            rule__Enum__Group__5__Impl();

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
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2410:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2414:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2415:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2415:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2416:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Enum__Group__5__Impl4864); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group_4__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2441:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2445:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2446:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__04907);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__04910);
            rule__Enum__Group_4__1();

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
    // $ANTLR end "rule__Enum__Group_4__0"


    // $ANTLR start "rule__Enum__Group_4__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2453:1: rule__Enum__Group_4__0__Impl : ( ( rule__Enum__ValoresAssignment_4_0 ) ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2457:1: ( ( ( rule__Enum__ValoresAssignment_4_0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2458:1: ( ( rule__Enum__ValoresAssignment_4_0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2458:1: ( ( rule__Enum__ValoresAssignment_4_0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2459:1: ( rule__Enum__ValoresAssignment_4_0 )
            {
             before(grammarAccess.getEnumAccess().getValoresAssignment_4_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2460:1: ( rule__Enum__ValoresAssignment_4_0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2460:2: rule__Enum__ValoresAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__ValoresAssignment_4_0_in_rule__Enum__Group_4__0__Impl4937);
            rule__Enum__ValoresAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getValoresAssignment_4_0()); 

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
    // $ANTLR end "rule__Enum__Group_4__0__Impl"


    // $ANTLR start "rule__Enum__Group_4__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2470:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2474:1: ( rule__Enum__Group_4__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2475:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__14967);
            rule__Enum__Group_4__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_4__1"


    // $ANTLR start "rule__Enum__Group_4__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2481:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__Group_4_1__0 )* ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2485:1: ( ( ( rule__Enum__Group_4_1__0 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2486:1: ( ( rule__Enum__Group_4_1__0 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2486:1: ( ( rule__Enum__Group_4_1__0 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2487:1: ( rule__Enum__Group_4_1__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2488:1: ( rule__Enum__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2488:2: rule__Enum__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4_1__0_in_rule__Enum__Group_4__1__Impl4994);
            	    rule__Enum__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Enum__Group_4__1__Impl"


    // $ANTLR start "rule__Enum__Group_4_1__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2502:1: rule__Enum__Group_4_1__0 : rule__Enum__Group_4_1__0__Impl rule__Enum__Group_4_1__1 ;
    public final void rule__Enum__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2506:1: ( rule__Enum__Group_4_1__0__Impl rule__Enum__Group_4_1__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2507:2: rule__Enum__Group_4_1__0__Impl rule__Enum__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4_1__0__Impl_in_rule__Enum__Group_4_1__05029);
            rule__Enum__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4_1__1_in_rule__Enum__Group_4_1__05032);
            rule__Enum__Group_4_1__1();

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
    // $ANTLR end "rule__Enum__Group_4_1__0"


    // $ANTLR start "rule__Enum__Group_4_1__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2514:1: rule__Enum__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2518:1: ( ( ',' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2519:1: ( ',' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2519:1: ( ',' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2520:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Enum__Group_4_1__0__Impl5060); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Enum__Group_4_1__0__Impl"


    // $ANTLR start "rule__Enum__Group_4_1__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2533:1: rule__Enum__Group_4_1__1 : rule__Enum__Group_4_1__1__Impl ;
    public final void rule__Enum__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2537:1: ( rule__Enum__Group_4_1__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2538:2: rule__Enum__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4_1__1__Impl_in_rule__Enum__Group_4_1__15091);
            rule__Enum__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_4_1__1"


    // $ANTLR start "rule__Enum__Group_4_1__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2544:1: rule__Enum__Group_4_1__1__Impl : ( ( rule__Enum__ValoresAssignment_4_1_1 ) ) ;
    public final void rule__Enum__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2548:1: ( ( ( rule__Enum__ValoresAssignment_4_1_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2549:1: ( ( rule__Enum__ValoresAssignment_4_1_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2549:1: ( ( rule__Enum__ValoresAssignment_4_1_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2550:1: ( rule__Enum__ValoresAssignment_4_1_1 )
            {
             before(grammarAccess.getEnumAccess().getValoresAssignment_4_1_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2551:1: ( rule__Enum__ValoresAssignment_4_1_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2551:2: rule__Enum__ValoresAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__ValoresAssignment_4_1_1_in_rule__Enum__Group_4_1__1__Impl5118);
            rule__Enum__ValoresAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getValoresAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Enum__Group_4_1__1__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2565:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2569:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2570:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__05152);
            rule__EnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__05155);
            rule__EnumLiteral__Group__1();

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
    // $ANTLR end "rule__EnumLiteral__Group__0"


    // $ANTLR start "rule__EnumLiteral__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2577:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2581:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2582:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2582:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2583:1: ()
            {
             before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2584:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2586:1: 
            {
            }

             after(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2596:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2600:1: ( rule__EnumLiteral__Group__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2601:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__15213);
            rule__EnumLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__EnumLiteral__Group__1"


    // $ANTLR start "rule__EnumLiteral__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2607:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2611:1: ( ( ( rule__EnumLiteral__NameAssignment_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2612:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2612:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2613:1: ( rule__EnumLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2614:1: ( rule__EnumLiteral__NameAssignment_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2614:2: rule__EnumLiteral__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl5240);
            rule__EnumLiteral__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2628:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2632:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2633:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__05274);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1_in_rule__List__Group__05277);
            rule__List__Group__1();

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
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2640:1: rule__List__Group__0__Impl : ( ( rule__List__Alternatives_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2644:1: ( ( ( rule__List__Alternatives_0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2645:1: ( ( rule__List__Alternatives_0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2645:1: ( ( rule__List__Alternatives_0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2646:1: ( rule__List__Alternatives_0 )
            {
             before(grammarAccess.getListAccess().getAlternatives_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2647:1: ( rule__List__Alternatives_0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2647:2: rule__List__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Alternatives_0_in_rule__List__Group__0__Impl5304);
            rule__List__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2657:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2661:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2662:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__15334);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2_in_rule__List__Group__15337);
            rule__List__Group__2();

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
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2669:1: rule__List__Group__1__Impl : ( '<' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2673:1: ( ( '<' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2674:1: ( '<' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2674:1: ( '<' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2675:1: '<'
            {
             before(grammarAccess.getListAccess().getLessThanSignKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__List__Group__1__Impl5365); 
             after(grammarAccess.getListAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2688:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2692:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2693:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__25396);
            rule__List__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3_in_rule__List__Group__25399);
            rule__List__Group__3();

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
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2700:1: rule__List__Group__2__Impl : ( ( rule__List__ClaseAssignment_2 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2704:1: ( ( ( rule__List__ClaseAssignment_2 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2705:1: ( ( rule__List__ClaseAssignment_2 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2705:1: ( ( rule__List__ClaseAssignment_2 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2706:1: ( rule__List__ClaseAssignment_2 )
            {
             before(grammarAccess.getListAccess().getClaseAssignment_2()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2707:1: ( rule__List__ClaseAssignment_2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2707:2: rule__List__ClaseAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__ClaseAssignment_2_in_rule__List__Group__2__Impl5426);
            rule__List__ClaseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getClaseAssignment_2()); 

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
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2717:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2721:1: ( rule__List__Group__3__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2722:2: rule__List__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__35456);
            rule__List__Group__3__Impl();

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
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2728:1: rule__List__Group__3__Impl : ( '>' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2732:1: ( ( '>' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2733:1: ( '>' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2733:1: ( '>' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2734:1: '>'
            {
             before(grammarAccess.getListAccess().getGreaterThanSignKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__List__Group__3__Impl5484); 
             after(grammarAccess.getListAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__Propiedad__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2755:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2759:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2760:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__0__Impl_in_rule__Propiedad__Group__05523);
            rule__Propiedad__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__1_in_rule__Propiedad__Group__05526);
            rule__Propiedad__Group__1();

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
    // $ANTLR end "rule__Propiedad__Group__0"


    // $ANTLR start "rule__Propiedad__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2767:1: rule__Propiedad__Group__0__Impl : ( () ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2771:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2772:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2772:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2773:1: ()
            {
             before(grammarAccess.getPropiedadAccess().getPropiedadAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2774:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2776:1: 
            {
            }

             after(grammarAccess.getPropiedadAccess().getPropiedadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__0__Impl"


    // $ANTLR start "rule__Propiedad__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2786:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2790:1: ( rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2791:2: rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__1__Impl_in_rule__Propiedad__Group__15584);
            rule__Propiedad__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__2_in_rule__Propiedad__Group__15587);
            rule__Propiedad__Group__2();

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
    // $ANTLR end "rule__Propiedad__Group__1"


    // $ANTLR start "rule__Propiedad__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2798:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__AtributosAssignment_1 )* ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2802:1: ( ( ( rule__Propiedad__AtributosAssignment_1 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2803:1: ( ( rule__Propiedad__AtributosAssignment_1 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2803:1: ( ( rule__Propiedad__AtributosAssignment_1 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2804:1: ( rule__Propiedad__AtributosAssignment_1 )*
            {
             before(grammarAccess.getPropiedadAccess().getAtributosAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2805:1: ( rule__Propiedad__AtributosAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2805:2: rule__Propiedad__AtributosAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Propiedad__AtributosAssignment_1_in_rule__Propiedad__Group__1__Impl5614);
            	    rule__Propiedad__AtributosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPropiedadAccess().getAtributosAssignment_1()); 

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
    // $ANTLR end "rule__Propiedad__Group__1__Impl"


    // $ANTLR start "rule__Propiedad__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2815:1: rule__Propiedad__Group__2 : rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3 ;
    public final void rule__Propiedad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2819:1: ( rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2820:2: rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__2__Impl_in_rule__Propiedad__Group__25645);
            rule__Propiedad__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__3_in_rule__Propiedad__Group__25648);
            rule__Propiedad__Group__3();

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
    // $ANTLR end "rule__Propiedad__Group__2"


    // $ANTLR start "rule__Propiedad__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2827:1: rule__Propiedad__Group__2__Impl : ( 'public ' ) ;
    public final void rule__Propiedad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2831:1: ( ( 'public ' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2832:1: ( 'public ' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2832:1: ( 'public ' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2833:1: 'public '
            {
             before(grammarAccess.getPropiedadAccess().getPublicKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Propiedad__Group__2__Impl5676); 
             after(grammarAccess.getPropiedadAccess().getPublicKeyword_2()); 

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
    // $ANTLR end "rule__Propiedad__Group__2__Impl"


    // $ANTLR start "rule__Propiedad__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2846:1: rule__Propiedad__Group__3 : rule__Propiedad__Group__3__Impl rule__Propiedad__Group__4 ;
    public final void rule__Propiedad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2850:1: ( rule__Propiedad__Group__3__Impl rule__Propiedad__Group__4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2851:2: rule__Propiedad__Group__3__Impl rule__Propiedad__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__3__Impl_in_rule__Propiedad__Group__35707);
            rule__Propiedad__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__4_in_rule__Propiedad__Group__35710);
            rule__Propiedad__Group__4();

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
    // $ANTLR end "rule__Propiedad__Group__3"


    // $ANTLR start "rule__Propiedad__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2858:1: rule__Propiedad__Group__3__Impl : ( ( rule__Propiedad__Alternatives_3 ) ) ;
    public final void rule__Propiedad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2862:1: ( ( ( rule__Propiedad__Alternatives_3 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2863:1: ( ( rule__Propiedad__Alternatives_3 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2863:1: ( ( rule__Propiedad__Alternatives_3 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2864:1: ( rule__Propiedad__Alternatives_3 )
            {
             before(grammarAccess.getPropiedadAccess().getAlternatives_3()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2865:1: ( rule__Propiedad__Alternatives_3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2865:2: rule__Propiedad__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Alternatives_3_in_rule__Propiedad__Group__3__Impl5737);
            rule__Propiedad__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Propiedad__Group__3__Impl"


    // $ANTLR start "rule__Propiedad__Group__4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2875:1: rule__Propiedad__Group__4 : rule__Propiedad__Group__4__Impl rule__Propiedad__Group__5 ;
    public final void rule__Propiedad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2879:1: ( rule__Propiedad__Group__4__Impl rule__Propiedad__Group__5 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2880:2: rule__Propiedad__Group__4__Impl rule__Propiedad__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__4__Impl_in_rule__Propiedad__Group__45767);
            rule__Propiedad__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__5_in_rule__Propiedad__Group__45770);
            rule__Propiedad__Group__5();

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
    // $ANTLR end "rule__Propiedad__Group__4"


    // $ANTLR start "rule__Propiedad__Group__4__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2887:1: rule__Propiedad__Group__4__Impl : ( ( rule__Propiedad__NameAssignment_4 ) ) ;
    public final void rule__Propiedad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2891:1: ( ( ( rule__Propiedad__NameAssignment_4 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2892:1: ( ( rule__Propiedad__NameAssignment_4 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2892:1: ( ( rule__Propiedad__NameAssignment_4 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2893:1: ( rule__Propiedad__NameAssignment_4 )
            {
             before(grammarAccess.getPropiedadAccess().getNameAssignment_4()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2894:1: ( rule__Propiedad__NameAssignment_4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2894:2: rule__Propiedad__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__NameAssignment_4_in_rule__Propiedad__Group__4__Impl5797);
            rule__Propiedad__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Propiedad__Group__4__Impl"


    // $ANTLR start "rule__Propiedad__Group__5"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2904:1: rule__Propiedad__Group__5 : rule__Propiedad__Group__5__Impl rule__Propiedad__Group__6 ;
    public final void rule__Propiedad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2908:1: ( rule__Propiedad__Group__5__Impl rule__Propiedad__Group__6 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2909:2: rule__Propiedad__Group__5__Impl rule__Propiedad__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__5__Impl_in_rule__Propiedad__Group__55827);
            rule__Propiedad__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__6_in_rule__Propiedad__Group__55830);
            rule__Propiedad__Group__6();

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
    // $ANTLR end "rule__Propiedad__Group__5"


    // $ANTLR start "rule__Propiedad__Group__5__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2916:1: rule__Propiedad__Group__5__Impl : ( '{' ) ;
    public final void rule__Propiedad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2920:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2921:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2921:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2922:1: '{'
            {
             before(grammarAccess.getPropiedadAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Propiedad__Group__5__Impl5858); 
             after(grammarAccess.getPropiedadAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Propiedad__Group__5__Impl"


    // $ANTLR start "rule__Propiedad__Group__6"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2935:1: rule__Propiedad__Group__6 : rule__Propiedad__Group__6__Impl rule__Propiedad__Group__7 ;
    public final void rule__Propiedad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2939:1: ( rule__Propiedad__Group__6__Impl rule__Propiedad__Group__7 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2940:2: rule__Propiedad__Group__6__Impl rule__Propiedad__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__6__Impl_in_rule__Propiedad__Group__65889);
            rule__Propiedad__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__7_in_rule__Propiedad__Group__65892);
            rule__Propiedad__Group__7();

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
    // $ANTLR end "rule__Propiedad__Group__6"


    // $ANTLR start "rule__Propiedad__Group__6__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2947:1: rule__Propiedad__Group__6__Impl : ( ( rule__Propiedad__Group_6__0 )? ) ;
    public final void rule__Propiedad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2951:1: ( ( ( rule__Propiedad__Group_6__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2952:1: ( ( rule__Propiedad__Group_6__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2952:1: ( ( rule__Propiedad__Group_6__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2953:1: ( rule__Propiedad__Group_6__0 )?
            {
             before(grammarAccess.getPropiedadAccess().getGroup_6()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2954:1: ( rule__Propiedad__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2954:2: rule__Propiedad__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_6__0_in_rule__Propiedad__Group__6__Impl5919);
                    rule__Propiedad__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropiedadAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Propiedad__Group__6__Impl"


    // $ANTLR start "rule__Propiedad__Group__7"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2964:1: rule__Propiedad__Group__7 : rule__Propiedad__Group__7__Impl rule__Propiedad__Group__8 ;
    public final void rule__Propiedad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2968:1: ( rule__Propiedad__Group__7__Impl rule__Propiedad__Group__8 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2969:2: rule__Propiedad__Group__7__Impl rule__Propiedad__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__7__Impl_in_rule__Propiedad__Group__75950);
            rule__Propiedad__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__8_in_rule__Propiedad__Group__75953);
            rule__Propiedad__Group__8();

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
    // $ANTLR end "rule__Propiedad__Group__7"


    // $ANTLR start "rule__Propiedad__Group__7__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2976:1: rule__Propiedad__Group__7__Impl : ( ( rule__Propiedad__Group_7__0 )? ) ;
    public final void rule__Propiedad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2980:1: ( ( ( rule__Propiedad__Group_7__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2981:1: ( ( rule__Propiedad__Group_7__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2981:1: ( ( rule__Propiedad__Group_7__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2982:1: ( rule__Propiedad__Group_7__0 )?
            {
             before(grammarAccess.getPropiedadAccess().getGroup_7()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2983:1: ( rule__Propiedad__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2983:2: rule__Propiedad__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_7__0_in_rule__Propiedad__Group__7__Impl5980);
                    rule__Propiedad__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropiedadAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Propiedad__Group__7__Impl"


    // $ANTLR start "rule__Propiedad__Group__8"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2993:1: rule__Propiedad__Group__8 : rule__Propiedad__Group__8__Impl ;
    public final void rule__Propiedad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2997:1: ( rule__Propiedad__Group__8__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:2998:2: rule__Propiedad__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group__8__Impl_in_rule__Propiedad__Group__86011);
            rule__Propiedad__Group__8__Impl();

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
    // $ANTLR end "rule__Propiedad__Group__8"


    // $ANTLR start "rule__Propiedad__Group__8__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3004:1: rule__Propiedad__Group__8__Impl : ( '}' ) ;
    public final void rule__Propiedad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3008:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3009:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3009:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3010:1: '}'
            {
             before(grammarAccess.getPropiedadAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Propiedad__Group__8__Impl6039); 
             after(grammarAccess.getPropiedadAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Propiedad__Group__8__Impl"


    // $ANTLR start "rule__Propiedad__Group_6__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3041:1: rule__Propiedad__Group_6__0 : rule__Propiedad__Group_6__0__Impl rule__Propiedad__Group_6__1 ;
    public final void rule__Propiedad__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3045:1: ( rule__Propiedad__Group_6__0__Impl rule__Propiedad__Group_6__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3046:2: rule__Propiedad__Group_6__0__Impl rule__Propiedad__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_6__0__Impl_in_rule__Propiedad__Group_6__06088);
            rule__Propiedad__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_6__1_in_rule__Propiedad__Group_6__06091);
            rule__Propiedad__Group_6__1();

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
    // $ANTLR end "rule__Propiedad__Group_6__0"


    // $ANTLR start "rule__Propiedad__Group_6__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3053:1: rule__Propiedad__Group_6__0__Impl : ( 'get' ) ;
    public final void rule__Propiedad__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3057:1: ( ( 'get' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3058:1: ( 'get' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3058:1: ( 'get' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3059:1: 'get'
            {
             before(grammarAccess.getPropiedadAccess().getGetKeyword_6_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Propiedad__Group_6__0__Impl6119); 
             after(grammarAccess.getPropiedadAccess().getGetKeyword_6_0()); 

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
    // $ANTLR end "rule__Propiedad__Group_6__0__Impl"


    // $ANTLR start "rule__Propiedad__Group_6__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3072:1: rule__Propiedad__Group_6__1 : rule__Propiedad__Group_6__1__Impl ;
    public final void rule__Propiedad__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3076:1: ( rule__Propiedad__Group_6__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3077:2: rule__Propiedad__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_6__1__Impl_in_rule__Propiedad__Group_6__16150);
            rule__Propiedad__Group_6__1__Impl();

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
    // $ANTLR end "rule__Propiedad__Group_6__1"


    // $ANTLR start "rule__Propiedad__Group_6__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3083:1: rule__Propiedad__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Propiedad__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3087:1: ( ( ';' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3088:1: ( ';' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3088:1: ( ';' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3089:1: ';'
            {
             before(grammarAccess.getPropiedadAccess().getSemicolonKeyword_6_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Propiedad__Group_6__1__Impl6178); 
             after(grammarAccess.getPropiedadAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end "rule__Propiedad__Group_6__1__Impl"


    // $ANTLR start "rule__Propiedad__Group_7__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3106:1: rule__Propiedad__Group_7__0 : rule__Propiedad__Group_7__0__Impl rule__Propiedad__Group_7__1 ;
    public final void rule__Propiedad__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3110:1: ( rule__Propiedad__Group_7__0__Impl rule__Propiedad__Group_7__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3111:2: rule__Propiedad__Group_7__0__Impl rule__Propiedad__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_7__0__Impl_in_rule__Propiedad__Group_7__06213);
            rule__Propiedad__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_7__1_in_rule__Propiedad__Group_7__06216);
            rule__Propiedad__Group_7__1();

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
    // $ANTLR end "rule__Propiedad__Group_7__0"


    // $ANTLR start "rule__Propiedad__Group_7__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3118:1: rule__Propiedad__Group_7__0__Impl : ( 'set' ) ;
    public final void rule__Propiedad__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3122:1: ( ( 'set' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3123:1: ( 'set' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3123:1: ( 'set' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3124:1: 'set'
            {
             before(grammarAccess.getPropiedadAccess().getSetKeyword_7_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Propiedad__Group_7__0__Impl6244); 
             after(grammarAccess.getPropiedadAccess().getSetKeyword_7_0()); 

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
    // $ANTLR end "rule__Propiedad__Group_7__0__Impl"


    // $ANTLR start "rule__Propiedad__Group_7__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3137:1: rule__Propiedad__Group_7__1 : rule__Propiedad__Group_7__1__Impl ;
    public final void rule__Propiedad__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3141:1: ( rule__Propiedad__Group_7__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3142:2: rule__Propiedad__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Propiedad__Group_7__1__Impl_in_rule__Propiedad__Group_7__16275);
            rule__Propiedad__Group_7__1__Impl();

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
    // $ANTLR end "rule__Propiedad__Group_7__1"


    // $ANTLR start "rule__Propiedad__Group_7__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3148:1: rule__Propiedad__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Propiedad__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3152:1: ( ( ';' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3153:1: ( ';' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3153:1: ( ';' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3154:1: ';'
            {
             before(grammarAccess.getPropiedadAccess().getSemicolonKeyword_7_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Propiedad__Group_7__1__Impl6303); 
             after(grammarAccess.getPropiedadAccess().getSemicolonKeyword_7_1()); 

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
    // $ANTLR end "rule__Propiedad__Group_7__1__Impl"


    // $ANTLR start "rule__Metodo__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3171:1: rule__Metodo__Group__0 : rule__Metodo__Group__0__Impl rule__Metodo__Group__1 ;
    public final void rule__Metodo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3175:1: ( rule__Metodo__Group__0__Impl rule__Metodo__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3176:2: rule__Metodo__Group__0__Impl rule__Metodo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__0__Impl_in_rule__Metodo__Group__06338);
            rule__Metodo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__1_in_rule__Metodo__Group__06341);
            rule__Metodo__Group__1();

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
    // $ANTLR end "rule__Metodo__Group__0"


    // $ANTLR start "rule__Metodo__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3183:1: rule__Metodo__Group__0__Impl : ( () ) ;
    public final void rule__Metodo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3187:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3188:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3188:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3189:1: ()
            {
             before(grammarAccess.getMetodoAccess().getMetodoAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3190:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3192:1: 
            {
            }

             after(grammarAccess.getMetodoAccess().getMetodoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metodo__Group__0__Impl"


    // $ANTLR start "rule__Metodo__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3202:1: rule__Metodo__Group__1 : rule__Metodo__Group__1__Impl rule__Metodo__Group__2 ;
    public final void rule__Metodo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3206:1: ( rule__Metodo__Group__1__Impl rule__Metodo__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3207:2: rule__Metodo__Group__1__Impl rule__Metodo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__1__Impl_in_rule__Metodo__Group__16399);
            rule__Metodo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__2_in_rule__Metodo__Group__16402);
            rule__Metodo__Group__2();

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
    // $ANTLR end "rule__Metodo__Group__1"


    // $ANTLR start "rule__Metodo__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3214:1: rule__Metodo__Group__1__Impl : ( ( rule__Metodo__AtributosAssignment_1 )* ) ;
    public final void rule__Metodo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3218:1: ( ( ( rule__Metodo__AtributosAssignment_1 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3219:1: ( ( rule__Metodo__AtributosAssignment_1 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3219:1: ( ( rule__Metodo__AtributosAssignment_1 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3220:1: ( rule__Metodo__AtributosAssignment_1 )*
            {
             before(grammarAccess.getMetodoAccess().getAtributosAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3221:1: ( rule__Metodo__AtributosAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3221:2: rule__Metodo__AtributosAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Metodo__AtributosAssignment_1_in_rule__Metodo__Group__1__Impl6429);
            	    rule__Metodo__AtributosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMetodoAccess().getAtributosAssignment_1()); 

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
    // $ANTLR end "rule__Metodo__Group__1__Impl"


    // $ANTLR start "rule__Metodo__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3231:1: rule__Metodo__Group__2 : rule__Metodo__Group__2__Impl rule__Metodo__Group__3 ;
    public final void rule__Metodo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3235:1: ( rule__Metodo__Group__2__Impl rule__Metodo__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3236:2: rule__Metodo__Group__2__Impl rule__Metodo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__2__Impl_in_rule__Metodo__Group__26460);
            rule__Metodo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__3_in_rule__Metodo__Group__26463);
            rule__Metodo__Group__3();

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
    // $ANTLR end "rule__Metodo__Group__2"


    // $ANTLR start "rule__Metodo__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3243:1: rule__Metodo__Group__2__Impl : ( 'public ' ) ;
    public final void rule__Metodo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3247:1: ( ( 'public ' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3248:1: ( 'public ' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3248:1: ( 'public ' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3249:1: 'public '
            {
             before(grammarAccess.getMetodoAccess().getPublicKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Metodo__Group__2__Impl6491); 
             after(grammarAccess.getMetodoAccess().getPublicKeyword_2()); 

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
    // $ANTLR end "rule__Metodo__Group__2__Impl"


    // $ANTLR start "rule__Metodo__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3262:1: rule__Metodo__Group__3 : rule__Metodo__Group__3__Impl rule__Metodo__Group__4 ;
    public final void rule__Metodo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3266:1: ( rule__Metodo__Group__3__Impl rule__Metodo__Group__4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3267:2: rule__Metodo__Group__3__Impl rule__Metodo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__3__Impl_in_rule__Metodo__Group__36522);
            rule__Metodo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__4_in_rule__Metodo__Group__36525);
            rule__Metodo__Group__4();

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
    // $ANTLR end "rule__Metodo__Group__3"


    // $ANTLR start "rule__Metodo__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3274:1: rule__Metodo__Group__3__Impl : ( ( rule__Metodo__Alternatives_3 ) ) ;
    public final void rule__Metodo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3278:1: ( ( ( rule__Metodo__Alternatives_3 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3279:1: ( ( rule__Metodo__Alternatives_3 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3279:1: ( ( rule__Metodo__Alternatives_3 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3280:1: ( rule__Metodo__Alternatives_3 )
            {
             before(grammarAccess.getMetodoAccess().getAlternatives_3()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3281:1: ( rule__Metodo__Alternatives_3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3281:2: rule__Metodo__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Alternatives_3_in_rule__Metodo__Group__3__Impl6552);
            rule__Metodo__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMetodoAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Metodo__Group__3__Impl"


    // $ANTLR start "rule__Metodo__Group__4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3291:1: rule__Metodo__Group__4 : rule__Metodo__Group__4__Impl rule__Metodo__Group__5 ;
    public final void rule__Metodo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3295:1: ( rule__Metodo__Group__4__Impl rule__Metodo__Group__5 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3296:2: rule__Metodo__Group__4__Impl rule__Metodo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__4__Impl_in_rule__Metodo__Group__46582);
            rule__Metodo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__5_in_rule__Metodo__Group__46585);
            rule__Metodo__Group__5();

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
    // $ANTLR end "rule__Metodo__Group__4"


    // $ANTLR start "rule__Metodo__Group__4__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3303:1: rule__Metodo__Group__4__Impl : ( ( rule__Metodo__NameAssignment_4 ) ) ;
    public final void rule__Metodo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3307:1: ( ( ( rule__Metodo__NameAssignment_4 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3308:1: ( ( rule__Metodo__NameAssignment_4 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3308:1: ( ( rule__Metodo__NameAssignment_4 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3309:1: ( rule__Metodo__NameAssignment_4 )
            {
             before(grammarAccess.getMetodoAccess().getNameAssignment_4()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3310:1: ( rule__Metodo__NameAssignment_4 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3310:2: rule__Metodo__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__NameAssignment_4_in_rule__Metodo__Group__4__Impl6612);
            rule__Metodo__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetodoAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Metodo__Group__4__Impl"


    // $ANTLR start "rule__Metodo__Group__5"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3320:1: rule__Metodo__Group__5 : rule__Metodo__Group__5__Impl rule__Metodo__Group__6 ;
    public final void rule__Metodo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3324:1: ( rule__Metodo__Group__5__Impl rule__Metodo__Group__6 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3325:2: rule__Metodo__Group__5__Impl rule__Metodo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__5__Impl_in_rule__Metodo__Group__56642);
            rule__Metodo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__6_in_rule__Metodo__Group__56645);
            rule__Metodo__Group__6();

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
    // $ANTLR end "rule__Metodo__Group__5"


    // $ANTLR start "rule__Metodo__Group__5__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3332:1: rule__Metodo__Group__5__Impl : ( '(' ) ;
    public final void rule__Metodo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3336:1: ( ( '(' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3337:1: ( '(' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3337:1: ( '(' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3338:1: '('
            {
             before(grammarAccess.getMetodoAccess().getLeftParenthesisKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Metodo__Group__5__Impl6673); 
             after(grammarAccess.getMetodoAccess().getLeftParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Metodo__Group__5__Impl"


    // $ANTLR start "rule__Metodo__Group__6"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3351:1: rule__Metodo__Group__6 : rule__Metodo__Group__6__Impl rule__Metodo__Group__7 ;
    public final void rule__Metodo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3355:1: ( rule__Metodo__Group__6__Impl rule__Metodo__Group__7 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3356:2: rule__Metodo__Group__6__Impl rule__Metodo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__6__Impl_in_rule__Metodo__Group__66704);
            rule__Metodo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__7_in_rule__Metodo__Group__66707);
            rule__Metodo__Group__7();

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
    // $ANTLR end "rule__Metodo__Group__6"


    // $ANTLR start "rule__Metodo__Group__6__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3363:1: rule__Metodo__Group__6__Impl : ( ( rule__Metodo__Group_6__0 )? ) ;
    public final void rule__Metodo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3367:1: ( ( ( rule__Metodo__Group_6__0 )? ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3368:1: ( ( rule__Metodo__Group_6__0 )? )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3368:1: ( ( rule__Metodo__Group_6__0 )? )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3369:1: ( rule__Metodo__Group_6__0 )?
            {
             before(grammarAccess.getMetodoAccess().getGroup_6()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3370:1: ( rule__Metodo__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DATATYPES)||(LA27_0>=12 && LA27_0<=13)||LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3370:2: rule__Metodo__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6__0_in_rule__Metodo__Group__6__Impl6734);
                    rule__Metodo__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetodoAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Metodo__Group__6__Impl"


    // $ANTLR start "rule__Metodo__Group__7"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3380:1: rule__Metodo__Group__7 : rule__Metodo__Group__7__Impl rule__Metodo__Group__8 ;
    public final void rule__Metodo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3384:1: ( rule__Metodo__Group__7__Impl rule__Metodo__Group__8 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3385:2: rule__Metodo__Group__7__Impl rule__Metodo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__7__Impl_in_rule__Metodo__Group__76765);
            rule__Metodo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__8_in_rule__Metodo__Group__76768);
            rule__Metodo__Group__8();

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
    // $ANTLR end "rule__Metodo__Group__7"


    // $ANTLR start "rule__Metodo__Group__7__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3392:1: rule__Metodo__Group__7__Impl : ( ')' ) ;
    public final void rule__Metodo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3396:1: ( ( ')' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3397:1: ( ')' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3397:1: ( ')' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3398:1: ')'
            {
             before(grammarAccess.getMetodoAccess().getRightParenthesisKeyword_7()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Metodo__Group__7__Impl6796); 
             after(grammarAccess.getMetodoAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Metodo__Group__7__Impl"


    // $ANTLR start "rule__Metodo__Group__8"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3411:1: rule__Metodo__Group__8 : rule__Metodo__Group__8__Impl rule__Metodo__Group__9 ;
    public final void rule__Metodo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3415:1: ( rule__Metodo__Group__8__Impl rule__Metodo__Group__9 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3416:2: rule__Metodo__Group__8__Impl rule__Metodo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__8__Impl_in_rule__Metodo__Group__86827);
            rule__Metodo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__9_in_rule__Metodo__Group__86830);
            rule__Metodo__Group__9();

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
    // $ANTLR end "rule__Metodo__Group__8"


    // $ANTLR start "rule__Metodo__Group__8__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3423:1: rule__Metodo__Group__8__Impl : ( '{' ) ;
    public final void rule__Metodo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3427:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3428:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3428:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3429:1: '{'
            {
             before(grammarAccess.getMetodoAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Metodo__Group__8__Impl6858); 
             after(grammarAccess.getMetodoAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Metodo__Group__8__Impl"


    // $ANTLR start "rule__Metodo__Group__9"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3442:1: rule__Metodo__Group__9 : rule__Metodo__Group__9__Impl rule__Metodo__Group__10 ;
    public final void rule__Metodo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3446:1: ( rule__Metodo__Group__9__Impl rule__Metodo__Group__10 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3447:2: rule__Metodo__Group__9__Impl rule__Metodo__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__9__Impl_in_rule__Metodo__Group__96889);
            rule__Metodo__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__10_in_rule__Metodo__Group__96892);
            rule__Metodo__Group__10();

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
    // $ANTLR end "rule__Metodo__Group__9"


    // $ANTLR start "rule__Metodo__Group__9__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3454:1: rule__Metodo__Group__9__Impl : ( ( rule__Metodo__TextoAssignment_9 ) ) ;
    public final void rule__Metodo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3458:1: ( ( ( rule__Metodo__TextoAssignment_9 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3459:1: ( ( rule__Metodo__TextoAssignment_9 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3459:1: ( ( rule__Metodo__TextoAssignment_9 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3460:1: ( rule__Metodo__TextoAssignment_9 )
            {
             before(grammarAccess.getMetodoAccess().getTextoAssignment_9()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3461:1: ( rule__Metodo__TextoAssignment_9 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3461:2: rule__Metodo__TextoAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__TextoAssignment_9_in_rule__Metodo__Group__9__Impl6919);
            rule__Metodo__TextoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMetodoAccess().getTextoAssignment_9()); 

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
    // $ANTLR end "rule__Metodo__Group__9__Impl"


    // $ANTLR start "rule__Metodo__Group__10"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3471:1: rule__Metodo__Group__10 : rule__Metodo__Group__10__Impl ;
    public final void rule__Metodo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3475:1: ( rule__Metodo__Group__10__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3476:2: rule__Metodo__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group__10__Impl_in_rule__Metodo__Group__106949);
            rule__Metodo__Group__10__Impl();

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
    // $ANTLR end "rule__Metodo__Group__10"


    // $ANTLR start "rule__Metodo__Group__10__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3482:1: rule__Metodo__Group__10__Impl : ( '}' ) ;
    public final void rule__Metodo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3486:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3487:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3487:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3488:1: '}'
            {
             before(grammarAccess.getMetodoAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Metodo__Group__10__Impl6977); 
             after(grammarAccess.getMetodoAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Metodo__Group__10__Impl"


    // $ANTLR start "rule__Metodo__Group_6__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3523:1: rule__Metodo__Group_6__0 : rule__Metodo__Group_6__0__Impl rule__Metodo__Group_6__1 ;
    public final void rule__Metodo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3527:1: ( rule__Metodo__Group_6__0__Impl rule__Metodo__Group_6__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3528:2: rule__Metodo__Group_6__0__Impl rule__Metodo__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6__0__Impl_in_rule__Metodo__Group_6__07030);
            rule__Metodo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6__1_in_rule__Metodo__Group_6__07033);
            rule__Metodo__Group_6__1();

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
    // $ANTLR end "rule__Metodo__Group_6__0"


    // $ANTLR start "rule__Metodo__Group_6__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3535:1: rule__Metodo__Group_6__0__Impl : ( ( rule__Metodo__ParametrosAssignment_6_0 ) ) ;
    public final void rule__Metodo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3539:1: ( ( ( rule__Metodo__ParametrosAssignment_6_0 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3540:1: ( ( rule__Metodo__ParametrosAssignment_6_0 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3540:1: ( ( rule__Metodo__ParametrosAssignment_6_0 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3541:1: ( rule__Metodo__ParametrosAssignment_6_0 )
            {
             before(grammarAccess.getMetodoAccess().getParametrosAssignment_6_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3542:1: ( rule__Metodo__ParametrosAssignment_6_0 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3542:2: rule__Metodo__ParametrosAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__ParametrosAssignment_6_0_in_rule__Metodo__Group_6__0__Impl7060);
            rule__Metodo__ParametrosAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMetodoAccess().getParametrosAssignment_6_0()); 

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
    // $ANTLR end "rule__Metodo__Group_6__0__Impl"


    // $ANTLR start "rule__Metodo__Group_6__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3552:1: rule__Metodo__Group_6__1 : rule__Metodo__Group_6__1__Impl ;
    public final void rule__Metodo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3556:1: ( rule__Metodo__Group_6__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3557:2: rule__Metodo__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6__1__Impl_in_rule__Metodo__Group_6__17090);
            rule__Metodo__Group_6__1__Impl();

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
    // $ANTLR end "rule__Metodo__Group_6__1"


    // $ANTLR start "rule__Metodo__Group_6__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3563:1: rule__Metodo__Group_6__1__Impl : ( ( rule__Metodo__Group_6_1__0 )* ) ;
    public final void rule__Metodo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3567:1: ( ( ( rule__Metodo__Group_6_1__0 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3568:1: ( ( rule__Metodo__Group_6_1__0 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3568:1: ( ( rule__Metodo__Group_6_1__0 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3569:1: ( rule__Metodo__Group_6_1__0 )*
            {
             before(grammarAccess.getMetodoAccess().getGroup_6_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3570:1: ( rule__Metodo__Group_6_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3570:2: rule__Metodo__Group_6_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6_1__0_in_rule__Metodo__Group_6__1__Impl7117);
            	    rule__Metodo__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMetodoAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Metodo__Group_6__1__Impl"


    // $ANTLR start "rule__Metodo__Group_6_1__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3584:1: rule__Metodo__Group_6_1__0 : rule__Metodo__Group_6_1__0__Impl rule__Metodo__Group_6_1__1 ;
    public final void rule__Metodo__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3588:1: ( rule__Metodo__Group_6_1__0__Impl rule__Metodo__Group_6_1__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3589:2: rule__Metodo__Group_6_1__0__Impl rule__Metodo__Group_6_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6_1__0__Impl_in_rule__Metodo__Group_6_1__07152);
            rule__Metodo__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6_1__1_in_rule__Metodo__Group_6_1__07155);
            rule__Metodo__Group_6_1__1();

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
    // $ANTLR end "rule__Metodo__Group_6_1__0"


    // $ANTLR start "rule__Metodo__Group_6_1__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3596:1: rule__Metodo__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Metodo__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3600:1: ( ( ',' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3601:1: ( ',' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3601:1: ( ',' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3602:1: ','
            {
             before(grammarAccess.getMetodoAccess().getCommaKeyword_6_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Metodo__Group_6_1__0__Impl7183); 
             after(grammarAccess.getMetodoAccess().getCommaKeyword_6_1_0()); 

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
    // $ANTLR end "rule__Metodo__Group_6_1__0__Impl"


    // $ANTLR start "rule__Metodo__Group_6_1__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3615:1: rule__Metodo__Group_6_1__1 : rule__Metodo__Group_6_1__1__Impl ;
    public final void rule__Metodo__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3619:1: ( rule__Metodo__Group_6_1__1__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3620:2: rule__Metodo__Group_6_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__Group_6_1__1__Impl_in_rule__Metodo__Group_6_1__17214);
            rule__Metodo__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Metodo__Group_6_1__1"


    // $ANTLR start "rule__Metodo__Group_6_1__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3626:1: rule__Metodo__Group_6_1__1__Impl : ( ( rule__Metodo__ParametrosAssignment_6_1_1 ) ) ;
    public final void rule__Metodo__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3630:1: ( ( ( rule__Metodo__ParametrosAssignment_6_1_1 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3631:1: ( ( rule__Metodo__ParametrosAssignment_6_1_1 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3631:1: ( ( rule__Metodo__ParametrosAssignment_6_1_1 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3632:1: ( rule__Metodo__ParametrosAssignment_6_1_1 )
            {
             before(grammarAccess.getMetodoAccess().getParametrosAssignment_6_1_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3633:1: ( rule__Metodo__ParametrosAssignment_6_1_1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3633:2: rule__Metodo__ParametrosAssignment_6_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metodo__ParametrosAssignment_6_1_1_in_rule__Metodo__Group_6_1__1__Impl7241);
            rule__Metodo__ParametrosAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMetodoAccess().getParametrosAssignment_6_1_1()); 

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
    // $ANTLR end "rule__Metodo__Group_6_1__1__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3647:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3651:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3652:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__0__Impl_in_rule__Parametro__Group__07275);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__1_in_rule__Parametro__Group__07278);
            rule__Parametro__Group__1();

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
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3659:1: rule__Parametro__Group__0__Impl : ( () ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3663:1: ( ( () ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3664:1: ( () )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3664:1: ( () )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3665:1: ()
            {
             before(grammarAccess.getParametroAccess().getParametroAction_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3666:1: ()
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3668:1: 
            {
            }

             after(grammarAccess.getParametroAccess().getParametroAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3678:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3682:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3683:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__1__Impl_in_rule__Parametro__Group__17336);
            rule__Parametro__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__2_in_rule__Parametro__Group__17339);
            rule__Parametro__Group__2();

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
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3690:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__AtributosAssignment_1 )* ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3694:1: ( ( ( rule__Parametro__AtributosAssignment_1 )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3695:1: ( ( rule__Parametro__AtributosAssignment_1 )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3695:1: ( ( rule__Parametro__AtributosAssignment_1 )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3696:1: ( rule__Parametro__AtributosAssignment_1 )*
            {
             before(grammarAccess.getParametroAccess().getAtributosAssignment_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3697:1: ( rule__Parametro__AtributosAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3697:2: rule__Parametro__AtributosAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Parametro__AtributosAssignment_1_in_rule__Parametro__Group__1__Impl7366);
            	    rule__Parametro__AtributosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getParametroAccess().getAtributosAssignment_1()); 

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
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__Parametro__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3707:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl rule__Parametro__Group__3 ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3711:1: ( rule__Parametro__Group__2__Impl rule__Parametro__Group__3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3712:2: rule__Parametro__Group__2__Impl rule__Parametro__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__2__Impl_in_rule__Parametro__Group__27397);
            rule__Parametro__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__3_in_rule__Parametro__Group__27400);
            rule__Parametro__Group__3();

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
    // $ANTLR end "rule__Parametro__Group__2"


    // $ANTLR start "rule__Parametro__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3719:1: rule__Parametro__Group__2__Impl : ( ( rule__Parametro__Alternatives_2 ) ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3723:1: ( ( ( rule__Parametro__Alternatives_2 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3724:1: ( ( rule__Parametro__Alternatives_2 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3724:1: ( ( rule__Parametro__Alternatives_2 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3725:1: ( rule__Parametro__Alternatives_2 )
            {
             before(grammarAccess.getParametroAccess().getAlternatives_2()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3726:1: ( rule__Parametro__Alternatives_2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3726:2: rule__Parametro__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Alternatives_2_in_rule__Parametro__Group__2__Impl7427);
            rule__Parametro__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Parametro__Group__2__Impl"


    // $ANTLR start "rule__Parametro__Group__3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3736:1: rule__Parametro__Group__3 : rule__Parametro__Group__3__Impl ;
    public final void rule__Parametro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3740:1: ( rule__Parametro__Group__3__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3741:2: rule__Parametro__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__Group__3__Impl_in_rule__Parametro__Group__37457);
            rule__Parametro__Group__3__Impl();

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
    // $ANTLR end "rule__Parametro__Group__3"


    // $ANTLR start "rule__Parametro__Group__3__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3747:1: rule__Parametro__Group__3__Impl : ( ( rule__Parametro__NameAssignment_3 ) ) ;
    public final void rule__Parametro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3751:1: ( ( ( rule__Parametro__NameAssignment_3 ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3752:1: ( ( rule__Parametro__NameAssignment_3 ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3752:1: ( ( rule__Parametro__NameAssignment_3 ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3753:1: ( rule__Parametro__NameAssignment_3 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_3()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3754:1: ( rule__Parametro__NameAssignment_3 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3754:2: rule__Parametro__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parametro__NameAssignment_3_in_rule__Parametro__Group__3__Impl7484);
            rule__Parametro__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Parametro__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3772:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3776:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3777:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__07522);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__1_in_rule__Block__Group__07525);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3784:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3788:1: ( ( '{' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3789:1: ( '{' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3789:1: ( '{' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3790:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Block__Group__0__Impl7553); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3803:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3807:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3808:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__17584);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__2_in_rule__Block__Group__17587);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3815:1: rule__Block__Group__1__Impl : ( ( ruleCharacters )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3819:1: ( ( ( ruleCharacters )* ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3820:1: ( ( ruleCharacters )* )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3820:1: ( ( ruleCharacters )* )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3821:1: ( ruleCharacters )*
            {
             before(grammarAccess.getBlockAccess().getCharactersParserRuleCall_1()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3822:1: ( ruleCharacters )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=14 && LA30_0<=19)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3822:3: ruleCharacters
            	    {
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacters_in_rule__Block__Group__1__Impl7615);
            	    ruleCharacters();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getCharactersParserRuleCall_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3832:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3836:1: ( rule__Block__Group__2__Impl )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3837:2: rule__Block__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__27646);
            rule__Block__Group__2__Impl();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3843:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3847:1: ( ( '}' ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3848:1: ( '}' )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3848:1: ( '}' )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3849:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Block__Group__2__Impl7674); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__CSharp__ClasesAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3869:1: rule__CSharp__ClasesAssignment_1 : ( ruleClase ) ;
    public final void rule__CSharp__ClasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3873:1: ( ( ruleClase ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3874:1: ( ruleClase )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3874:1: ( ruleClase )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3875:1: ruleClase
            {
             before(grammarAccess.getCSharpAccess().getClasesClaseParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClase_in_rule__CSharp__ClasesAssignment_17716);
            ruleClase();

            state._fsp--;

             after(grammarAccess.getCSharpAccess().getClasesClaseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CSharp__ClasesAssignment_1"


    // $ANTLR start "rule__Clase__NamespaceAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3884:1: rule__Clase__NamespaceAssignment_1 : ( ruleExpressionString ) ;
    public final void rule__Clase__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3888:1: ( ( ruleExpressionString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3889:1: ( ruleExpressionString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3889:1: ( ruleExpressionString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3890:1: ruleExpressionString
            {
             before(grammarAccess.getClaseAccess().getNamespaceExpressionStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_rule__Clase__NamespaceAssignment_17747);
            ruleExpressionString();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getNamespaceExpressionStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Clase__NamespaceAssignment_1"


    // $ANTLR start "rule__Clase__AtributosAssignment_3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3899:1: rule__Clase__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__Clase__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3903:1: ( ( ruleAtributo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3904:1: ( ruleAtributo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3904:1: ( ruleAtributo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3905:1: ruleAtributo
            {
             before(grammarAccess.getClaseAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rule__Clase__AtributosAssignment_37778);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getAtributosAtributoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Clase__AtributosAssignment_3"


    // $ANTLR start "rule__Clase__NameAssignment_5"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3914:1: rule__Clase__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Clase__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3918:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3919:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3919:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3920:1: RULE_ID
            {
             before(grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Clase__NameAssignment_57809); 
             after(grammarAccess.getClaseAccess().getNameIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Clase__NameAssignment_5"


    // $ANTLR start "rule__Clase__SuperAssignment_6_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3929:1: rule__Clase__SuperAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Clase__SuperAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3933:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3934:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3934:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3935:1: RULE_ID
            {
             before(grammarAccess.getClaseAccess().getSuperIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Clase__SuperAssignment_6_17840); 
             after(grammarAccess.getClaseAccess().getSuperIDTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Clase__SuperAssignment_6_1"


    // $ANTLR start "rule__Clase__TextoAssignment_8"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3944:1: rule__Clase__TextoAssignment_8 : ( ruleExpressionString ) ;
    public final void rule__Clase__TextoAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3948:1: ( ( ruleExpressionString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3949:1: ( ruleExpressionString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3949:1: ( ruleExpressionString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3950:1: ruleExpressionString
            {
             before(grammarAccess.getClaseAccess().getTextoExpressionStringParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_rule__Clase__TextoAssignment_87871);
            ruleExpressionString();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getTextoExpressionStringParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Clase__TextoAssignment_8"


    // $ANTLR start "rule__Clase__ConstructoresAssignment_9"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3959:1: rule__Clase__ConstructoresAssignment_9 : ( ruleConstructor ) ;
    public final void rule__Clase__ConstructoresAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3963:1: ( ( ruleConstructor ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3964:1: ( ruleConstructor )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3964:1: ( ruleConstructor )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3965:1: ruleConstructor
            {
             before(grammarAccess.getClaseAccess().getConstructoresConstructorParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstructor_in_rule__Clase__ConstructoresAssignment_97902);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getConstructoresConstructorParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Clase__ConstructoresAssignment_9"


    // $ANTLR start "rule__Clase__EnumsAssignment_10"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3974:1: rule__Clase__EnumsAssignment_10 : ( ruleEnum ) ;
    public final void rule__Clase__EnumsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3978:1: ( ( ruleEnum ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3979:1: ( ruleEnum )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3979:1: ( ruleEnum )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3980:1: ruleEnum
            {
             before(grammarAccess.getClaseAccess().getEnumsEnumParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_rule__Clase__EnumsAssignment_107933);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getEnumsEnumParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Clase__EnumsAssignment_10"


    // $ANTLR start "rule__Clase__PropiedadesAssignment_11"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3989:1: rule__Clase__PropiedadesAssignment_11 : ( rulePropiedad ) ;
    public final void rule__Clase__PropiedadesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3993:1: ( ( rulePropiedad ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3994:1: ( rulePropiedad )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3994:1: ( rulePropiedad )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:3995:1: rulePropiedad
            {
             before(grammarAccess.getClaseAccess().getPropiedadesPropiedadParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedad_in_rule__Clase__PropiedadesAssignment_117964);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getPropiedadesPropiedadParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Clase__PropiedadesAssignment_11"


    // $ANTLR start "rule__Clase__MetodosAssignment_12"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4004:1: rule__Clase__MetodosAssignment_12 : ( ruleMetodo ) ;
    public final void rule__Clase__MetodosAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4008:1: ( ( ruleMetodo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4009:1: ( ruleMetodo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4009:1: ( ruleMetodo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4010:1: ruleMetodo
            {
             before(grammarAccess.getClaseAccess().getMetodosMetodoParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetodo_in_rule__Clase__MetodosAssignment_127995);
            ruleMetodo();

            state._fsp--;

             after(grammarAccess.getClaseAccess().getMetodosMetodoParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Clase__MetodosAssignment_12"


    // $ANTLR start "rule__Atributo__NameAssignment_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4019:1: rule__Atributo__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Atributo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4023:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4024:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4024:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4025:1: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Atributo__NameAssignment_28026); 
             after(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Atributo__NameAssignment_2"


    // $ANTLR start "rule__Atributo__PropiedadesAssignment_3_1_0_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4034:1: rule__Atributo__PropiedadesAssignment_3_1_0_0 : ( rulePropiedadAtributo ) ;
    public final void rule__Atributo__PropiedadesAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4038:1: ( ( rulePropiedadAtributo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4039:1: ( rulePropiedadAtributo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4039:1: ( rulePropiedadAtributo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4040:1: rulePropiedadAtributo
            {
             before(grammarAccess.getAtributoAccess().getPropiedadesPropiedadAtributoParserRuleCall_3_1_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedadAtributo_in_rule__Atributo__PropiedadesAssignment_3_1_0_08057);
            rulePropiedadAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getPropiedadesPropiedadAtributoParserRuleCall_3_1_0_0_0()); 

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
    // $ANTLR end "rule__Atributo__PropiedadesAssignment_3_1_0_0"


    // $ANTLR start "rule__Atributo__PropiedadesAssignment_3_1_0_1_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4049:1: rule__Atributo__PropiedadesAssignment_3_1_0_1_1 : ( rulePropiedadAtributo ) ;
    public final void rule__Atributo__PropiedadesAssignment_3_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4053:1: ( ( rulePropiedadAtributo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4054:1: ( rulePropiedadAtributo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4054:1: ( rulePropiedadAtributo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4055:1: rulePropiedadAtributo
            {
             before(grammarAccess.getAtributoAccess().getPropiedadesPropiedadAtributoParserRuleCall_3_1_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropiedadAtributo_in_rule__Atributo__PropiedadesAssignment_3_1_0_1_18088);
            rulePropiedadAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getPropiedadesPropiedadAtributoParserRuleCall_3_1_0_1_1_0()); 

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
    // $ANTLR end "rule__Atributo__PropiedadesAssignment_3_1_0_1_1"


    // $ANTLR start "rule__Atributo__ValorAssignment_3_1_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4064:1: rule__Atributo__ValorAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Atributo__ValorAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4068:1: ( ( RULE_STRING ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4069:1: ( RULE_STRING )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4069:1: ( RULE_STRING )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4070:1: RULE_STRING
            {
             before(grammarAccess.getAtributoAccess().getValorSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Atributo__ValorAssignment_3_1_18119); 
             after(grammarAccess.getAtributoAccess().getValorSTRINGTerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Atributo__ValorAssignment_3_1_1"


    // $ANTLR start "rule__PropiedadAtributo__NameAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4079:1: rule__PropiedadAtributo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropiedadAtributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4083:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4084:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4084:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4085:1: RULE_ID
            {
             before(grammarAccess.getPropiedadAtributoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropiedadAtributo__NameAssignment_18150); 
             after(grammarAccess.getPropiedadAtributoAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PropiedadAtributo__NameAssignment_1"


    // $ANTLR start "rule__PropiedadAtributo__ValorAssignment_3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4094:1: rule__PropiedadAtributo__ValorAssignment_3 : ( ruleEString ) ;
    public final void rule__PropiedadAtributo__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4098:1: ( ( ruleEString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4099:1: ( ruleEString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4099:1: ( ruleEString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4100:1: ruleEString
            {
             before(grammarAccess.getPropiedadAtributoAccess().getValorEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PropiedadAtributo__ValorAssignment_38181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropiedadAtributoAccess().getValorEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PropiedadAtributo__ValorAssignment_3"


    // $ANTLR start "rule__Constructor__NameAssignment_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4109:1: rule__Constructor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4113:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4114:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4114:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4115:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_28212); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Constructor__NameAssignment_2"


    // $ANTLR start "rule__Constructor__ParametrosAssignment_4_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4124:1: rule__Constructor__ParametrosAssignment_4_0 : ( ruleParametro ) ;
    public final void rule__Constructor__ParametrosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4128:1: ( ( ruleParametro ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4129:1: ( ruleParametro )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4129:1: ( ruleParametro )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4130:1: ruleParametro
            {
             before(grammarAccess.getConstructorAccess().getParametrosParametroParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametro_in_rule__Constructor__ParametrosAssignment_4_08243);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getParametrosParametroParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Constructor__ParametrosAssignment_4_0"


    // $ANTLR start "rule__Constructor__ParametrosAssignment_4_1_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4139:1: rule__Constructor__ParametrosAssignment_4_1_1 : ( ruleParametro ) ;
    public final void rule__Constructor__ParametrosAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4143:1: ( ( ruleParametro ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4144:1: ( ruleParametro )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4144:1: ( ruleParametro )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4145:1: ruleParametro
            {
             before(grammarAccess.getConstructorAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametro_in_rule__Constructor__ParametrosAssignment_4_1_18274);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Constructor__ParametrosAssignment_4_1_1"


    // $ANTLR start "rule__Constructor__TextoAssignment_7"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4154:1: rule__Constructor__TextoAssignment_7 : ( ruleExpressionString ) ;
    public final void rule__Constructor__TextoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4158:1: ( ( ruleExpressionString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4159:1: ( ruleExpressionString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4159:1: ( ruleExpressionString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4160:1: ruleExpressionString
            {
             before(grammarAccess.getConstructorAccess().getTextoExpressionStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_rule__Constructor__TextoAssignment_78305);
            ruleExpressionString();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getTextoExpressionStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Constructor__TextoAssignment_7"


    // $ANTLR start "rule__Enum__NameAssignment_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4169:1: rule__Enum__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Enum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4173:1: ( ( ruleEString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4174:1: ( ruleEString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4174:1: ( ruleEString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4175:1: ruleEString
            {
             before(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Enum__NameAssignment_28336);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Enum__NameAssignment_2"


    // $ANTLR start "rule__Enum__ValoresAssignment_4_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4184:1: rule__Enum__ValoresAssignment_4_0 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__ValoresAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4188:1: ( ( ruleEnumLiteral ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4189:1: ( ruleEnumLiteral )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4189:1: ( ruleEnumLiteral )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4190:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumAccess().getValoresEnumLiteralParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteral_in_rule__Enum__ValoresAssignment_4_08367);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getValoresEnumLiteralParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Enum__ValoresAssignment_4_0"


    // $ANTLR start "rule__Enum__ValoresAssignment_4_1_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4199:1: rule__Enum__ValoresAssignment_4_1_1 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__ValoresAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4203:1: ( ( ruleEnumLiteral ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4204:1: ( ruleEnumLiteral )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4204:1: ( ruleEnumLiteral )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4205:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumAccess().getValoresEnumLiteralParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteral_in_rule__Enum__ValoresAssignment_4_1_18398);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getValoresEnumLiteralParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Enum__ValoresAssignment_4_1_1"


    // $ANTLR start "rule__EnumLiteral__NameAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4214:1: rule__EnumLiteral__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4218:1: ( ( ruleEString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4219:1: ( ruleEString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4219:1: ( ruleEString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4220:1: ruleEString
            {
             before(grammarAccess.getEnumLiteralAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__EnumLiteral__NameAssignment_18429);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumLiteralAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumLiteral__NameAssignment_1"


    // $ANTLR start "rule__List__ClaseAssignment_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4229:1: rule__List__ClaseAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__List__ClaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4233:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4234:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4234:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4235:1: ( RULE_ID )
            {
             before(grammarAccess.getListAccess().getClaseClaseCrossReference_2_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4236:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4237:1: RULE_ID
            {
             before(grammarAccess.getListAccess().getClaseClaseIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__List__ClaseAssignment_28464); 
             after(grammarAccess.getListAccess().getClaseClaseIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getListAccess().getClaseClaseCrossReference_2_0()); 

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
    // $ANTLR end "rule__List__ClaseAssignment_2"


    // $ANTLR start "rule__Propiedad__AtributosAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4248:1: rule__Propiedad__AtributosAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Propiedad__AtributosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4252:1: ( ( ruleAtributo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4253:1: ( ruleAtributo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4253:1: ( ruleAtributo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4254:1: ruleAtributo
            {
             before(grammarAccess.getPropiedadAccess().getAtributosAtributoParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rule__Propiedad__AtributosAssignment_18499);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getAtributosAtributoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Propiedad__AtributosAssignment_1"


    // $ANTLR start "rule__Propiedad__TipoAssignment_3_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4263:1: rule__Propiedad__TipoAssignment_3_0 : ( ( ruleEString ) ) ;
    public final void rule__Propiedad__TipoAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4267:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4268:1: ( ( ruleEString ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4268:1: ( ( ruleEString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4269:1: ( ruleEString )
            {
             before(grammarAccess.getPropiedadAccess().getTipoTipoCrossReference_3_0_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4270:1: ( ruleEString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4271:1: ruleEString
            {
             before(grammarAccess.getPropiedadAccess().getTipoTipoEStringParserRuleCall_3_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Propiedad__TipoAssignment_3_08534);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getTipoTipoEStringParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getPropiedadAccess().getTipoTipoCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__Propiedad__TipoAssignment_3_0"


    // $ANTLR start "rule__Propiedad__TipoPrimitivoAssignment_3_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4282:1: rule__Propiedad__TipoPrimitivoAssignment_3_1 : ( RULE_DATATYPES ) ;
    public final void rule__Propiedad__TipoPrimitivoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4286:1: ( ( RULE_DATATYPES ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4287:1: ( RULE_DATATYPES )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4287:1: ( RULE_DATATYPES )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4288:1: RULE_DATATYPES
            {
             before(grammarAccess.getPropiedadAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_3_1_0()); 
            match(input,RULE_DATATYPES,FollowSets000.FOLLOW_RULE_DATATYPES_in_rule__Propiedad__TipoPrimitivoAssignment_3_18569); 
             after(grammarAccess.getPropiedadAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Propiedad__TipoPrimitivoAssignment_3_1"


    // $ANTLR start "rule__Propiedad__ListaAssignment_3_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4297:1: rule__Propiedad__ListaAssignment_3_2 : ( ruleList ) ;
    public final void rule__Propiedad__ListaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4301:1: ( ( ruleList ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4302:1: ( ruleList )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4302:1: ( ruleList )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4303:1: ruleList
            {
             before(grammarAccess.getPropiedadAccess().getListaListParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleList_in_rule__Propiedad__ListaAssignment_3_28600);
            ruleList();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getListaListParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Propiedad__ListaAssignment_3_2"


    // $ANTLR start "rule__Propiedad__NameAssignment_4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4312:1: rule__Propiedad__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Propiedad__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4316:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4317:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4317:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4318:1: RULE_ID
            {
             before(grammarAccess.getPropiedadAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Propiedad__NameAssignment_48631); 
             after(grammarAccess.getPropiedadAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Propiedad__NameAssignment_4"


    // $ANTLR start "rule__Metodo__AtributosAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4327:1: rule__Metodo__AtributosAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Metodo__AtributosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4331:1: ( ( ruleAtributo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4332:1: ( ruleAtributo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4332:1: ( ruleAtributo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4333:1: ruleAtributo
            {
             before(grammarAccess.getMetodoAccess().getAtributosAtributoParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rule__Metodo__AtributosAssignment_18662);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getMetodoAccess().getAtributosAtributoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Metodo__AtributosAssignment_1"


    // $ANTLR start "rule__Metodo__TipoAssignment_3_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4342:1: rule__Metodo__TipoAssignment_3_0 : ( ( ruleEString ) ) ;
    public final void rule__Metodo__TipoAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4346:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4347:1: ( ( ruleEString ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4347:1: ( ( ruleEString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4348:1: ( ruleEString )
            {
             before(grammarAccess.getMetodoAccess().getTipoTipoCrossReference_3_0_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4349:1: ( ruleEString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4350:1: ruleEString
            {
             before(grammarAccess.getMetodoAccess().getTipoTipoEStringParserRuleCall_3_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Metodo__TipoAssignment_3_08697);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetodoAccess().getTipoTipoEStringParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getMetodoAccess().getTipoTipoCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__Metodo__TipoAssignment_3_0"


    // $ANTLR start "rule__Metodo__TipoPrimitivoAssignment_3_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4361:1: rule__Metodo__TipoPrimitivoAssignment_3_1 : ( RULE_DATATYPES ) ;
    public final void rule__Metodo__TipoPrimitivoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4365:1: ( ( RULE_DATATYPES ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4366:1: ( RULE_DATATYPES )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4366:1: ( RULE_DATATYPES )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4367:1: RULE_DATATYPES
            {
             before(grammarAccess.getMetodoAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_3_1_0()); 
            match(input,RULE_DATATYPES,FollowSets000.FOLLOW_RULE_DATATYPES_in_rule__Metodo__TipoPrimitivoAssignment_3_18732); 
             after(grammarAccess.getMetodoAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Metodo__TipoPrimitivoAssignment_3_1"


    // $ANTLR start "rule__Metodo__ListaAssignment_3_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4376:1: rule__Metodo__ListaAssignment_3_2 : ( ruleList ) ;
    public final void rule__Metodo__ListaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4380:1: ( ( ruleList ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4381:1: ( ruleList )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4381:1: ( ruleList )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4382:1: ruleList
            {
             before(grammarAccess.getMetodoAccess().getListaListParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleList_in_rule__Metodo__ListaAssignment_3_28763);
            ruleList();

            state._fsp--;

             after(grammarAccess.getMetodoAccess().getListaListParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Metodo__ListaAssignment_3_2"


    // $ANTLR start "rule__Metodo__NameAssignment_4"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4391:1: rule__Metodo__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Metodo__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4395:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4396:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4396:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4397:1: RULE_ID
            {
             before(grammarAccess.getMetodoAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Metodo__NameAssignment_48794); 
             after(grammarAccess.getMetodoAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Metodo__NameAssignment_4"


    // $ANTLR start "rule__Metodo__ParametrosAssignment_6_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4406:1: rule__Metodo__ParametrosAssignment_6_0 : ( ruleParametro ) ;
    public final void rule__Metodo__ParametrosAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4410:1: ( ( ruleParametro ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4411:1: ( ruleParametro )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4411:1: ( ruleParametro )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4412:1: ruleParametro
            {
             before(grammarAccess.getMetodoAccess().getParametrosParametroParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametro_in_rule__Metodo__ParametrosAssignment_6_08825);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getMetodoAccess().getParametrosParametroParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Metodo__ParametrosAssignment_6_0"


    // $ANTLR start "rule__Metodo__ParametrosAssignment_6_1_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4421:1: rule__Metodo__ParametrosAssignment_6_1_1 : ( ruleParametro ) ;
    public final void rule__Metodo__ParametrosAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4425:1: ( ( ruleParametro ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4426:1: ( ruleParametro )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4426:1: ( ruleParametro )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4427:1: ruleParametro
            {
             before(grammarAccess.getMetodoAccess().getParametrosParametroParserRuleCall_6_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametro_in_rule__Metodo__ParametrosAssignment_6_1_18856);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getMetodoAccess().getParametrosParametroParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__Metodo__ParametrosAssignment_6_1_1"


    // $ANTLR start "rule__Metodo__TextoAssignment_9"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4436:1: rule__Metodo__TextoAssignment_9 : ( ruleExpressionString ) ;
    public final void rule__Metodo__TextoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4440:1: ( ( ruleExpressionString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4441:1: ( ruleExpressionString )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4441:1: ( ruleExpressionString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4442:1: ruleExpressionString
            {
             before(grammarAccess.getMetodoAccess().getTextoExpressionStringParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionString_in_rule__Metodo__TextoAssignment_98887);
            ruleExpressionString();

            state._fsp--;

             after(grammarAccess.getMetodoAccess().getTextoExpressionStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Metodo__TextoAssignment_9"


    // $ANTLR start "rule__Parametro__AtributosAssignment_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4451:1: rule__Parametro__AtributosAssignment_1 : ( ruleAtributo ) ;
    public final void rule__Parametro__AtributosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4455:1: ( ( ruleAtributo ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4456:1: ( ruleAtributo )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4456:1: ( ruleAtributo )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4457:1: ruleAtributo
            {
             before(grammarAccess.getParametroAccess().getAtributosAtributoParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rule__Parametro__AtributosAssignment_18918);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getAtributosAtributoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parametro__AtributosAssignment_1"


    // $ANTLR start "rule__Parametro__TipoAssignment_2_0"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4466:1: rule__Parametro__TipoAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipoAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4470:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4471:1: ( ( ruleEString ) )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4471:1: ( ( ruleEString ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4472:1: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipoTipoCrossReference_2_0_0()); 
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4473:1: ( ruleEString )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4474:1: ruleEString
            {
             before(grammarAccess.getParametroAccess().getTipoTipoEStringParserRuleCall_2_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parametro__TipoAssignment_2_08953);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getTipoTipoEStringParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getParametroAccess().getTipoTipoCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__Parametro__TipoAssignment_2_0"


    // $ANTLR start "rule__Parametro__TipoPrimitivoAssignment_2_1"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4485:1: rule__Parametro__TipoPrimitivoAssignment_2_1 : ( RULE_DATATYPES ) ;
    public final void rule__Parametro__TipoPrimitivoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4489:1: ( ( RULE_DATATYPES ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4490:1: ( RULE_DATATYPES )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4490:1: ( RULE_DATATYPES )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4491:1: RULE_DATATYPES
            {
             before(grammarAccess.getParametroAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_2_1_0()); 
            match(input,RULE_DATATYPES,FollowSets000.FOLLOW_RULE_DATATYPES_in_rule__Parametro__TipoPrimitivoAssignment_2_18988); 
             after(grammarAccess.getParametroAccess().getTipoPrimitivoDATATYPESTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Parametro__TipoPrimitivoAssignment_2_1"


    // $ANTLR start "rule__Parametro__ListaAssignment_2_2"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4500:1: rule__Parametro__ListaAssignment_2_2 : ( ruleList ) ;
    public final void rule__Parametro__ListaAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4504:1: ( ( ruleList ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4505:1: ( ruleList )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4505:1: ( ruleList )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4506:1: ruleList
            {
             before(grammarAccess.getParametroAccess().getListaListParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleList_in_rule__Parametro__ListaAssignment_2_29019);
            ruleList();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getListaListParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Parametro__ListaAssignment_2_2"


    // $ANTLR start "rule__Parametro__NameAssignment_3"
    // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4515:1: rule__Parametro__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parametro__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4519:1: ( ( RULE_ID ) )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4520:1: ( RULE_ID )
            {
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4520:1: ( RULE_ID )
            // ../org.xtext.csharp.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCsharp.g:4521:1: RULE_ID
            {
             before(grammarAccess.getParametroAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Parametro__NameAssignment_39050); 
             after(grammarAccess.getParametroAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Parametro__NameAssignment_3"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\34\uffff";
    static final String DFA15_eofS =
        "\34\uffff";
    static final String DFA15_minS =
        "\1\26\1\5\1\4\1\uffff\1\21\3\5\2\35\1\4\1\30\1\21\1\5\1\23\1\22"+
        "\1\uffff\1\36\1\4\1\31\1\5\2\22\1\5\1\23\1\4\2\22";
    static final String DFA15_maxS =
        "\1\33\1\5\1\15\1\uffff\1\31\3\5\2\35\1\5\1\33\1\24\1\5\1\23\1\22"+
        "\1\uffff\1\36\1\5\1\31\1\5\2\32\1\5\1\23\1\5\2\32";
    static final String DFA15_acceptS =
        "\3\uffff\1\2\14\uffff\1\1\13\uffff";
    static final String DFA15_specialS =
        "\34\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\1\uffff\1\1\2\uffff\1\2",
            "\1\4",
            "\1\5\1\6\1\7\5\uffff\1\10\1\11",
            "",
            "\1\12\7\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\15",
            "\1\15",
            "\1\17\1\16",
            "\1\1\2\uffff\1\2",
            "\1\3\2\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "\1\24",
            "\1\25\1\26",
            "\1\13",
            "\1\14",
            "\1\23\7\uffff\1\27",
            "\1\23\7\uffff\1\27",
            "\1\30",
            "\1\31",
            "\1\32\1\33",
            "\1\23\7\uffff\1\27",
            "\1\23\7\uffff\1\27"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 1134:1: ( rule__Clase__PropiedadesAssignment_11 )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCSharp_in_entryRuleCSharp61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCSharp68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CSharp__Group__0_in_ruleCSharp94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClase_in_entryRuleClase121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClase128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__0_in_ruleClase154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtributo188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__0_in_ruleAtributo214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedadAtributo_in_entryRulePropiedadAtributo241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropiedadAtributo248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__0_in_rulePropiedadAtributo274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructor308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedad_in_entryRulePropiedad543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropiedad550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__0_in_rulePropiedad576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetodo_in_entryRuleMetodo603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetodo610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__0_in_ruleMetodo636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametro_in_entryRuleParametro663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametro670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__Group__0_in_ruleParametro696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacters_in_entryRuleCharacters783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacters790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Characters__Alternatives_in_ruleCharacters816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_entryRuleExpressionString903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionString910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionString__Alternatives_in_ruleExpressionString936 = new BitSet(new long[]{0x00000000001FC022L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0__0_in_rule__Atributo__Alternatives_3_1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__ValorAssignment_3_1_1_in_rule__Atributo__Alternatives_3_1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__List__Alternatives_01025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__List__Alternatives_01045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__TipoAssignment_3_0_in_rule__Propiedad__Alternatives_31080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__TipoPrimitivoAssignment_3_1_in_rule__Propiedad__Alternatives_31098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__ListaAssignment_3_2_in_rule__Propiedad__Alternatives_31116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__TipoAssignment_3_0_in_rule__Metodo__Alternatives_31149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__TipoPrimitivoAssignment_3_1_in_rule__Metodo__Alternatives_31167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__ListaAssignment_3_2_in_rule__Metodo__Alternatives_31185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__TipoAssignment_2_0_in_rule__Parametro__Alternatives_21218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__TipoPrimitivoAssignment_2_1_in_rule__Parametro__Alternatives_21236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__ListaAssignment_2_2_in_rule__Parametro__Alternatives_21254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Characters__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Characters__Alternatives1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Characters__Alternatives1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Characters__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Characters__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Characters__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Characters__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacters_in_rule__ExpressionString__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__ExpressionString__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CSharp__Group__0__Impl_in_rule__CSharp__Group__01535 = new BitSet(new long[]{0x00000000001FC020L});
        public static final BitSet FOLLOW_rule__CSharp__Group__1_in_rule__CSharp__Group__01538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CSharp__Group__1__Impl_in_rule__CSharp__Group__11596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CSharp__ClasesAssignment_1_in_rule__CSharp__Group__1__Impl1623 = new BitSet(new long[]{0x00000000001FC022L});
        public static final BitSet FOLLOW_rule__Clase__Group__0__Impl_in_rule__Clase__Group__01658 = new BitSet(new long[]{0x00000000001FC020L});
        public static final BitSet FOLLOW_rule__Clase__Group__1_in_rule__Clase__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__1__Impl_in_rule__Clase__Group__11719 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Clase__Group__2_in_rule__Clase__Group__11722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__NamespaceAssignment_1_in_rule__Clase__Group__1__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__2__Impl_in_rule__Clase__Group__21779 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Clase__Group__3_in_rule__Clase__Group__21782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Clase__Group__2__Impl1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__3__Impl_in_rule__Clase__Group__31841 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Clase__Group__4_in_rule__Clase__Group__31844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__AtributosAssignment_3_in_rule__Clase__Group__3__Impl1871 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__4__Impl_in_rule__Clase__Group__41902 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Clase__Group__5_in_rule__Clase__Group__41905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Clase__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__5__Impl_in_rule__Clase__Group__51964 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_rule__Clase__Group__6_in_rule__Clase__Group__51967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__NameAssignment_5_in_rule__Clase__Group__5__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__6__Impl_in_rule__Clase__Group__62024 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_rule__Clase__Group__7_in_rule__Clase__Group__62027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group_6__0_in_rule__Clase__Group__6__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__7__Impl_in_rule__Clase__Group__72085 = new BitSet(new long[]{0x00000000001FC020L});
        public static final BitSet FOLLOW_rule__Clase__Group__8_in_rule__Clase__Group__72088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Clase__Group__7__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__8__Impl_in_rule__Clase__Group__82147 = new BitSet(new long[]{0x0000000019400000L});
        public static final BitSet FOLLOW_rule__Clase__Group__9_in_rule__Clase__Group__82150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__TextoAssignment_8_in_rule__Clase__Group__8__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__9__Impl_in_rule__Clase__Group__92207 = new BitSet(new long[]{0x0000000019400000L});
        public static final BitSet FOLLOW_rule__Clase__Group__10_in_rule__Clase__Group__92210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__ConstructoresAssignment_9_in_rule__Clase__Group__9__Impl2237 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__10__Impl_in_rule__Clase__Group__102268 = new BitSet(new long[]{0x0000000019400000L});
        public static final BitSet FOLLOW_rule__Clase__Group__11_in_rule__Clase__Group__102271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__EnumsAssignment_10_in_rule__Clase__Group__10__Impl2298 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__11__Impl_in_rule__Clase__Group__112329 = new BitSet(new long[]{0x0000000019400000L});
        public static final BitSet FOLLOW_rule__Clase__Group__12_in_rule__Clase__Group__112332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__PropiedadesAssignment_11_in_rule__Clase__Group__11__Impl2359 = new BitSet(new long[]{0x0000000009000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__12__Impl_in_rule__Clase__Group__122390 = new BitSet(new long[]{0x0000000019400000L});
        public static final BitSet FOLLOW_rule__Clase__Group__13_in_rule__Clase__Group__122393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__MetodosAssignment_12_in_rule__Clase__Group__12__Impl2420 = new BitSet(new long[]{0x0000000009000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__13__Impl_in_rule__Clase__Group__132451 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Clase__Group__14_in_rule__Clase__Group__132454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Clase__Group__13__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group__14__Impl_in_rule__Clase__Group__142513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Clase__Group__14__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group_6__0__Impl_in_rule__Clase__Group_6__02602 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Clase__Group_6__1_in_rule__Clase__Group_6__02605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Clase__Group_6__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__Group_6__1__Impl_in_rule__Clase__Group_6__12664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clase__SuperAssignment_6_1_in_rule__Clase__Group_6__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__0__Impl_in_rule__Atributo__Group__02725 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__1_in_rule__Atributo__Group__02728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__1__Impl_in_rule__Atributo__Group__12786 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Atributo__Group__2_in_rule__Atributo__Group__12789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Atributo__Group__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__2__Impl_in_rule__Atributo__Group__22848 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__3_in_rule__Atributo__Group__22851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__NameAssignment_2_in_rule__Atributo__Group__2__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__3__Impl_in_rule__Atributo__Group__32908 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__4_in_rule__Atributo__Group__32911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__0_in_rule__Atributo__Group__3__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__4__Impl_in_rule__Atributo__Group__42969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Atributo__Group__4__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__0__Impl_in_rule__Atributo__Group_3__03038 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__1_in_rule__Atributo__Group_3__03041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Atributo__Group_3__0__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__1__Impl_in_rule__Atributo__Group_3__13100 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__2_in_rule__Atributo__Group_3__13103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Alternatives_3_1_in_rule__Atributo__Group_3__1__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__2__Impl_in_rule__Atributo__Group_3__23160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Atributo__Group_3__2__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0__0__Impl_in_rule__Atributo__Group_3_1_0__03225 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0__1_in_rule__Atributo__Group_3_1_0__03228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__PropiedadesAssignment_3_1_0_0_in_rule__Atributo__Group_3_1_0__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0__1__Impl_in_rule__Atributo__Group_3_1_0__13285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0_1__0_in_rule__Atributo__Group_3_1_0__1__Impl3312 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0_1__0__Impl_in_rule__Atributo__Group_3_1_0_1__03347 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0_1__1_in_rule__Atributo__Group_3_1_0_1__03350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Atributo__Group_3_1_0_1__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3_1_0_1__1__Impl_in_rule__Atributo__Group_3_1_0_1__13409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__PropiedadesAssignment_3_1_0_1_1_in_rule__Atributo__Group_3_1_0_1__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__0__Impl_in_rule__PropiedadAtributo__Group__03470 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__1_in_rule__PropiedadAtributo__Group__03473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__1__Impl_in_rule__PropiedadAtributo__Group__13531 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__2_in_rule__PropiedadAtributo__Group__13534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__NameAssignment_1_in_rule__PropiedadAtributo__Group__1__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__2__Impl_in_rule__PropiedadAtributo__Group__23591 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__3_in_rule__PropiedadAtributo__Group__23594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PropiedadAtributo__Group__2__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__Group__3__Impl_in_rule__PropiedadAtributo__Group__33653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropiedadAtributo__ValorAssignment_3_in_rule__PropiedadAtributo__Group__3__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__03718 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__03721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__13779 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__13782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Constructor__Group__1__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__23841 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__23844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__NameAssignment_2_in_rule__Constructor__Group__2__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__33901 = new BitSet(new long[]{0x0000000001043070L});
        public static final BitSet FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__33904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Constructor__Group__3__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__43963 = new BitSet(new long[]{0x0000000001043070L});
        public static final BitSet FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__43966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4__0_in_rule__Constructor__Group__4__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__54024 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__54027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Constructor__Group__5__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__64086 = new BitSet(new long[]{0x00000000001FC020L});
        public static final BitSet FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__64089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Constructor__Group__6__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__74148 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Constructor__Group__8_in_rule__Constructor__Group__74151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__TextoAssignment_7_in_rule__Constructor__Group__7__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group__8__Impl_in_rule__Constructor__Group__84208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Constructor__Group__8__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4__0__Impl_in_rule__Constructor__Group_4__04285 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4__1_in_rule__Constructor__Group_4__04288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__ParametrosAssignment_4_0_in_rule__Constructor__Group_4__0__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4__1__Impl_in_rule__Constructor__Group_4__14345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4_1__0_in_rule__Constructor__Group_4__1__Impl4372 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4_1__0__Impl_in_rule__Constructor__Group_4_1__04407 = new BitSet(new long[]{0x0000000001003070L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4_1__1_in_rule__Constructor__Group_4_1__04410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Constructor__Group_4_1__0__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__Group_4_1__1__Impl_in_rule__Constructor__Group_4_1__14469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constructor__ParametrosAssignment_4_1_1_in_rule__Constructor__Group_4_1__1__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04530 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__04533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__14591 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__14594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Enum__Group__1__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__24653 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__24656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__NameAssignment_2_in_rule__Enum__Group__2__Impl4683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__34713 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__34716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Enum__Group__3__Impl4744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44775 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__44778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__54836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Enum__Group__5__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__04907 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__04910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__ValoresAssignment_4_0_in_rule__Enum__Group_4__0__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__14967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4_1__0_in_rule__Enum__Group_4__1__Impl4994 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4_1__0__Impl_in_rule__Enum__Group_4_1__05029 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Enum__Group_4_1__1_in_rule__Enum__Group_4_1__05032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Enum__Group_4_1__0__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4_1__1__Impl_in_rule__Enum__Group_4_1__15091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__ValoresAssignment_4_1_1_in_rule__Enum__Group_4_1__1__Impl5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__05152 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__05155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__15213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__05274 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__05277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Alternatives_0_in_rule__List__Group__0__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__15334 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__15337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__List__Group__1__Impl5365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__25396 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__25399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__ClaseAssignment_2_in_rule__List__Group__2__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__35456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__List__Group__3__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__0__Impl_in_rule__Propiedad__Group__05523 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__1_in_rule__Propiedad__Group__05526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__1__Impl_in_rule__Propiedad__Group__15584 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__2_in_rule__Propiedad__Group__15587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__AtributosAssignment_1_in_rule__Propiedad__Group__1__Impl5614 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__2__Impl_in_rule__Propiedad__Group__25645 = new BitSet(new long[]{0x0000000001003070L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__3_in_rule__Propiedad__Group__25648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Propiedad__Group__2__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__3__Impl_in_rule__Propiedad__Group__35707 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__4_in_rule__Propiedad__Group__35710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Alternatives_3_in_rule__Propiedad__Group__3__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__4__Impl_in_rule__Propiedad__Group__45767 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__5_in_rule__Propiedad__Group__45770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__NameAssignment_4_in_rule__Propiedad__Group__4__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__5__Impl_in_rule__Propiedad__Group__55827 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__6_in_rule__Propiedad__Group__55830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Propiedad__Group__5__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__6__Impl_in_rule__Propiedad__Group__65889 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__7_in_rule__Propiedad__Group__65892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_6__0_in_rule__Propiedad__Group__6__Impl5919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__7__Impl_in_rule__Propiedad__Group__75950 = new BitSet(new long[]{0x0000000180400000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__8_in_rule__Propiedad__Group__75953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_7__0_in_rule__Propiedad__Group__7__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group__8__Impl_in_rule__Propiedad__Group__86011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Propiedad__Group__8__Impl6039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_6__0__Impl_in_rule__Propiedad__Group_6__06088 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_6__1_in_rule__Propiedad__Group_6__06091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Propiedad__Group_6__0__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_6__1__Impl_in_rule__Propiedad__Group_6__16150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Propiedad__Group_6__1__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_7__0__Impl_in_rule__Propiedad__Group_7__06213 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_7__1_in_rule__Propiedad__Group_7__06216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Propiedad__Group_7__0__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Propiedad__Group_7__1__Impl_in_rule__Propiedad__Group_7__16275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Propiedad__Group_7__1__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__0__Impl_in_rule__Metodo__Group__06338 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Metodo__Group__1_in_rule__Metodo__Group__06341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__1__Impl_in_rule__Metodo__Group__16399 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Metodo__Group__2_in_rule__Metodo__Group__16402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__AtributosAssignment_1_in_rule__Metodo__Group__1__Impl6429 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__2__Impl_in_rule__Metodo__Group__26460 = new BitSet(new long[]{0x0000000001003070L});
        public static final BitSet FOLLOW_rule__Metodo__Group__3_in_rule__Metodo__Group__26463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Metodo__Group__2__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__3__Impl_in_rule__Metodo__Group__36522 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Metodo__Group__4_in_rule__Metodo__Group__36525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Alternatives_3_in_rule__Metodo__Group__3__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__4__Impl_in_rule__Metodo__Group__46582 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Metodo__Group__5_in_rule__Metodo__Group__46585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__NameAssignment_4_in_rule__Metodo__Group__4__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__5__Impl_in_rule__Metodo__Group__56642 = new BitSet(new long[]{0x0000000001043070L});
        public static final BitSet FOLLOW_rule__Metodo__Group__6_in_rule__Metodo__Group__56645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Metodo__Group__5__Impl6673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__6__Impl_in_rule__Metodo__Group__66704 = new BitSet(new long[]{0x0000000001043070L});
        public static final BitSet FOLLOW_rule__Metodo__Group__7_in_rule__Metodo__Group__66707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6__0_in_rule__Metodo__Group__6__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__7__Impl_in_rule__Metodo__Group__76765 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Metodo__Group__8_in_rule__Metodo__Group__76768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Metodo__Group__7__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__8__Impl_in_rule__Metodo__Group__86827 = new BitSet(new long[]{0x00000000001FC020L});
        public static final BitSet FOLLOW_rule__Metodo__Group__9_in_rule__Metodo__Group__86830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Metodo__Group__8__Impl6858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__9__Impl_in_rule__Metodo__Group__96889 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Metodo__Group__10_in_rule__Metodo__Group__96892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__TextoAssignment_9_in_rule__Metodo__Group__9__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group__10__Impl_in_rule__Metodo__Group__106949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Metodo__Group__10__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6__0__Impl_in_rule__Metodo__Group_6__07030 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6__1_in_rule__Metodo__Group_6__07033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__ParametrosAssignment_6_0_in_rule__Metodo__Group_6__0__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6__1__Impl_in_rule__Metodo__Group_6__17090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6_1__0_in_rule__Metodo__Group_6__1__Impl7117 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6_1__0__Impl_in_rule__Metodo__Group_6_1__07152 = new BitSet(new long[]{0x0000000001003070L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6_1__1_in_rule__Metodo__Group_6_1__07155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Metodo__Group_6_1__0__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__Group_6_1__1__Impl_in_rule__Metodo__Group_6_1__17214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metodo__ParametrosAssignment_6_1_1_in_rule__Metodo__Group_6_1__1__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__Group__0__Impl_in_rule__Parametro__Group__07275 = new BitSet(new long[]{0x0000000001003070L});
        public static final BitSet FOLLOW_rule__Parametro__Group__1_in_rule__Parametro__Group__07278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__Group__1__Impl_in_rule__Parametro__Group__17336 = new BitSet(new long[]{0x0000000001003070L});
        public static final BitSet FOLLOW_rule__Parametro__Group__2_in_rule__Parametro__Group__17339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__AtributosAssignment_1_in_rule__Parametro__Group__1__Impl7366 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Parametro__Group__2__Impl_in_rule__Parametro__Group__27397 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Parametro__Group__3_in_rule__Parametro__Group__27400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__Alternatives_2_in_rule__Parametro__Group__2__Impl7427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__Group__3__Impl_in_rule__Parametro__Group__37457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parametro__NameAssignment_3_in_rule__Parametro__Group__3__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__07522 = new BitSet(new long[]{0x00000000004FC020L});
        public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__07525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Block__Group__0__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__17584 = new BitSet(new long[]{0x00000000004FC020L});
        public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__17587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacters_in_rule__Block__Group__1__Impl7615 = new BitSet(new long[]{0x00000000000FC022L});
        public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__27646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Block__Group__2__Impl7674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClase_in_rule__CSharp__ClasesAssignment_17716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_rule__Clase__NamespaceAssignment_17747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rule__Clase__AtributosAssignment_37778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Clase__NameAssignment_57809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Clase__SuperAssignment_6_17840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_rule__Clase__TextoAssignment_87871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructor_in_rule__Clase__ConstructoresAssignment_97902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_rule__Clase__EnumsAssignment_107933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedad_in_rule__Clase__PropiedadesAssignment_117964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetodo_in_rule__Clase__MetodosAssignment_127995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Atributo__NameAssignment_28026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedadAtributo_in_rule__Atributo__PropiedadesAssignment_3_1_0_08057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropiedadAtributo_in_rule__Atributo__PropiedadesAssignment_3_1_0_1_18088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Atributo__ValorAssignment_3_1_18119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropiedadAtributo__NameAssignment_18150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PropiedadAtributo__ValorAssignment_38181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_28212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametro_in_rule__Constructor__ParametrosAssignment_4_08243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametro_in_rule__Constructor__ParametrosAssignment_4_1_18274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_rule__Constructor__TextoAssignment_78305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Enum__NameAssignment_28336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enum__ValoresAssignment_4_08367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enum__ValoresAssignment_4_1_18398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__EnumLiteral__NameAssignment_18429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__List__ClaseAssignment_28464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rule__Propiedad__AtributosAssignment_18499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Propiedad__TipoAssignment_3_08534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DATATYPES_in_rule__Propiedad__TipoPrimitivoAssignment_3_18569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_rule__Propiedad__ListaAssignment_3_28600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Propiedad__NameAssignment_48631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rule__Metodo__AtributosAssignment_18662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Metodo__TipoAssignment_3_08697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DATATYPES_in_rule__Metodo__TipoPrimitivoAssignment_3_18732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_rule__Metodo__ListaAssignment_3_28763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Metodo__NameAssignment_48794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametro_in_rule__Metodo__ParametrosAssignment_6_08825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametro_in_rule__Metodo__ParametrosAssignment_6_1_18856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionString_in_rule__Metodo__TextoAssignment_98887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rule__Parametro__AtributosAssignment_18918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parametro__TipoAssignment_2_08953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DATATYPES_in_rule__Parametro__TipoPrimitivoAssignment_2_18988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_rule__Parametro__ListaAssignment_2_29019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Parametro__NameAssignment_39050 = new BitSet(new long[]{0x0000000000000002L});
    }


}