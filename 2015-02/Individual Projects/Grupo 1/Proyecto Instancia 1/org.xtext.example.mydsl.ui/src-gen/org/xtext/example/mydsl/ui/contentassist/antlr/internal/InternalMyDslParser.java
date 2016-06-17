package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LESS", "RULE_QUESTION", "RULE_EQUALS", "RULE_GREATER", "RULE_TMARKETPLACE", "RULE_TXMI", "RULE_TXSI", "RULE_TPROYECTOS", "RULE_SCHEMALOCATION", "RULE_SLASH", "RULE_TPAGINAS", "RULE_TPROMOCION", "RULE_TMAPA", "RULE_TTIPO", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\"empresarial\"'", "'\"clasico\"'", "'\"moderno\"'", "'\"profesional\"'", "'\"basico\"'", "'\"premium\"'", "'\"gold\"'", "'xml'", "'version'", "'\"1.0\"'", "'encoding'", "'\"ASCII\"'", "'xmi:version'", "'\"2.0\"'", "'xmlns:xmi'", "'xmlns:xsi'", "'xmlns:proyectos'", "'xsi:schemaLocation'", "'nombre'", "'presentacion'", "'xsi:type=\"proyectos:Promocion\"'", "'estilo'", "'xsi:type=\"proyectos:Mapa\"'", "'xsi:type=\"proyectos:Contacto\"'", "'xsi:type=\"proyectos:Catalogo\"'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_TMAPA=18;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int RULE_TPAGINAS=16;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_TPROYECTOS=13;
    public static final int RULE_TXSI=12;
    public static final int EOF=-1;
    public static final int RULE_TPROMOCION=17;
    public static final int RULE_TTIPO=19;
    public static final int RULE_INT=20;
    public static final int RULE_TXMI=11;
    public static final int RULE_SCHEMALOCATION=14;
    public static final int RULE_TMARKETPLACE=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_GREATER=9;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=22;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_LESS=6;
    public static final int RULE_EQUALS=8;
    public static final int RULE_SLASH=15;
    public static final int RULE_WS=23;
    public static final int RULE_QUESTION=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMarketPlace"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleMarketPlace : ruleMarketPlace EOF ;
    public final void entryRuleMarketPlace() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleMarketPlace EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleMarketPlace EOF
            {
             before(grammarAccess.getMarketPlaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMarketPlace_in_entryRuleMarketPlace61);
            ruleMarketPlace();

            state._fsp--;

             after(grammarAccess.getMarketPlaceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarketPlace68); 

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
    // $ANTLR end "entryRuleMarketPlace"


    // $ANTLR start "ruleMarketPlace"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleMarketPlace : ( ( rule__MarketPlace__Group__0 ) ) ;
    public final void ruleMarketPlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__MarketPlace__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__MarketPlace__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__MarketPlace__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__MarketPlace__Group__0 )
            {
             before(grammarAccess.getMarketPlaceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__MarketPlace__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__MarketPlace__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__0_in_ruleMarketPlace94);
            rule__MarketPlace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarketPlaceAccess().getGroup()); 

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
    // $ANTLR end "ruleMarketPlace"


    // $ANTLR start "entryRulePagina"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRulePagina : rulePagina EOF ;
    public final void entryRulePagina() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( rulePagina EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: rulePagina EOF
            {
             before(grammarAccess.getPaginaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePagina_in_entryRulePagina121);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getPaginaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePagina128); 

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
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: rulePagina : ( ( rule__Pagina__Alternatives ) ) ;
    public final void rulePagina() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Pagina__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Pagina__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Pagina__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Pagina__Alternatives )
            {
             before(grammarAccess.getPaginaAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Pagina__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Pagina__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Pagina__Alternatives_in_rulePagina154);
            rule__Pagina__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getAlternatives()); 

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
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRulePromocion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRulePromocion : rulePromocion EOF ;
    public final void entryRulePromocion() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( rulePromocion EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: rulePromocion EOF
            {
             before(grammarAccess.getPromocionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePromocion_in_entryRulePromocion181);
            rulePromocion();

            state._fsp--;

             after(grammarAccess.getPromocionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePromocion188); 

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
    // $ANTLR end "entryRulePromocion"


    // $ANTLR start "rulePromocion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: rulePromocion : ( ( rule__Promocion__Group__0 ) ) ;
    public final void rulePromocion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Promocion__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Promocion__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Promocion__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Promocion__Group__0 )
            {
             before(grammarAccess.getPromocionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Promocion__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Promocion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__0_in_rulePromocion214);
            rule__Promocion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPromocionAccess().getGroup()); 

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
    // $ANTLR end "rulePromocion"


    // $ANTLR start "entryRuleMapa"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleMapa EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleMapa EOF
            {
             before(grammarAccess.getMapaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMapa_in_entryRuleMapa241);
            ruleMapa();

            state._fsp--;

             after(grammarAccess.getMapaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapa248); 

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
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Mapa__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Mapa__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Mapa__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Mapa__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__0_in_ruleMapa274);
            rule__Mapa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getGroup()); 

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
    // $ANTLR end "ruleMapa"


    // $ANTLR start "entryRuleContacto"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleContacto : ruleContacto EOF ;
    public final void entryRuleContacto() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleContacto EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleContacto EOF
            {
             before(grammarAccess.getContactoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContacto_in_entryRuleContacto301);
            ruleContacto();

            state._fsp--;

             after(grammarAccess.getContactoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContacto308); 

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
    // $ANTLR end "entryRuleContacto"


    // $ANTLR start "ruleContacto"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleContacto : ( ( rule__Contacto__Group__0 ) ) ;
    public final void ruleContacto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Contacto__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Contacto__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Contacto__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Contacto__Group__0 )
            {
             before(grammarAccess.getContactoAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Contacto__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Contacto__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__0_in_ruleContacto334);
            rule__Contacto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactoAccess().getGroup()); 

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
    // $ANTLR end "ruleContacto"


    // $ANTLR start "entryRuleCatalogo"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleCatalogo : ruleCatalogo EOF ;
    public final void entryRuleCatalogo() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleCatalogo EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleCatalogo EOF
            {
             before(grammarAccess.getCatalogoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_entryRuleCatalogo361);
            ruleCatalogo();

            state._fsp--;

             after(grammarAccess.getCatalogoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCatalogo368); 

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
    // $ANTLR end "entryRuleCatalogo"


    // $ANTLR start "ruleCatalogo"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleCatalogo : ( ( rule__Catalogo__Group__0 ) ) ;
    public final void ruleCatalogo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Catalogo__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Catalogo__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Catalogo__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Catalogo__Group__0 )
            {
             before(grammarAccess.getCatalogoAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Catalogo__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Catalogo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__0_in_ruleCatalogo394);
            rule__Catalogo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getGroup()); 

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
    // $ANTLR end "ruleCatalogo"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString421);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString428); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString454);
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


    // $ANTLR start "ruleEstilo"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ruleEstilo : ( ( rule__Estilo__Alternatives ) ) ;
    public final void ruleEstilo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ( ( ( rule__Estilo__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ( ( rule__Estilo__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ( ( rule__Estilo__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( rule__Estilo__Alternatives )
            {
             before(grammarAccess.getEstiloAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( rule__Estilo__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:264:2: rule__Estilo__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estilo__Alternatives_in_ruleEstilo491);
            rule__Estilo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEstilo"


    // $ANTLR start "ruleTipoPresentacion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ruleTipoPresentacion : ( ( rule__TipoPresentacion__Alternatives ) ) ;
    public final void ruleTipoPresentacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( ( ( rule__TipoPresentacion__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( ( rule__TipoPresentacion__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( ( rule__TipoPresentacion__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( rule__TipoPresentacion__Alternatives )
            {
             before(grammarAccess.getTipoPresentacionAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:283:1: ( rule__TipoPresentacion__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:283:2: rule__TipoPresentacion__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TipoPresentacion__Alternatives_in_ruleTipoPresentacion527);
            rule__TipoPresentacion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoPresentacionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTipoPresentacion"


    // $ANTLR start "rule__Pagina__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: rule__Pagina__Alternatives : ( ( rulePromocion ) | ( ruleMapa ) | ( ruleContacto ) | ( ruleCatalogo ) );
    public final void rule__Pagina__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rulePromocion ) | ( ruleMapa ) | ( ruleContacto ) | ( ruleCatalogo ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LESS) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_TPAGINAS) ) {
                    switch ( input.LA(3) ) {
                    case 47:
                        {
                        alt1=2;
                        }
                        break;
                    case 49:
                        {
                        alt1=4;
                        }
                        break;
                    case 48:
                        {
                        alt1=3;
                        }
                        break;
                    case 45:
                        {
                        alt1=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rulePromocion )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rulePromocion )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: rulePromocion
                    {
                     before(grammarAccess.getPaginaAccess().getPromocionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulePromocion_in_rule__Pagina__Alternatives562);
                    rulePromocion();

                    state._fsp--;

                     after(grammarAccess.getPaginaAccess().getPromocionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:6: ( ruleMapa )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:6: ( ruleMapa )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ruleMapa
                    {
                     before(grammarAccess.getPaginaAccess().getMapaParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMapa_in_rule__Pagina__Alternatives579);
                    ruleMapa();

                    state._fsp--;

                     after(grammarAccess.getPaginaAccess().getMapaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:311:6: ( ruleContacto )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:311:6: ( ruleContacto )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ruleContacto
                    {
                     before(grammarAccess.getPaginaAccess().getContactoParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleContacto_in_rule__Pagina__Alternatives596);
                    ruleContacto();

                    state._fsp--;

                     after(grammarAccess.getPaginaAccess().getContactoParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:6: ( ruleCatalogo )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:6: ( ruleCatalogo )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: ruleCatalogo
                    {
                     before(grammarAccess.getPaginaAccess().getCatalogoParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_rule__Pagina__Alternatives613);
                    ruleCatalogo();

                    state._fsp--;

                     after(grammarAccess.getPaginaAccess().getCatalogoParserRuleCall_3()); 

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
    // $ANTLR end "rule__Pagina__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives645); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:339:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:339:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives662); 
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


    // $ANTLR start "rule__Estilo__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:350:1: rule__Estilo__Alternatives : ( ( ( '\"empresarial\"' ) ) | ( ( '\"clasico\"' ) ) | ( ( '\"moderno\"' ) ) | ( ( '\"profesional\"' ) ) );
    public final void rule__Estilo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( ( '\"empresarial\"' ) ) | ( ( '\"clasico\"' ) ) | ( ( '\"moderno\"' ) ) | ( ( '\"profesional\"' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( '\"empresarial\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( '\"empresarial\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( '\"empresarial\"' )
                    {
                     before(grammarAccess.getEstiloAccess().getEmpresarialEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( '\"empresarial\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:3: '\"empresarial\"'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Estilo__Alternatives695); 

                    }

                     after(grammarAccess.getEstiloAccess().getEmpresarialEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:6: ( ( '\"clasico\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:6: ( ( '\"clasico\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: ( '\"clasico\"' )
                    {
                     before(grammarAccess.getEstiloAccess().getClasicoEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( '\"clasico\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:364:3: '\"clasico\"'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Estilo__Alternatives716); 

                    }

                     after(grammarAccess.getEstiloAccess().getClasicoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:6: ( ( '\"moderno\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:6: ( ( '\"moderno\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( '\"moderno\"' )
                    {
                     before(grammarAccess.getEstiloAccess().getModernoEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( '\"moderno\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:3: '\"moderno\"'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Estilo__Alternatives737); 

                    }

                     after(grammarAccess.getEstiloAccess().getModernoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:376:6: ( ( '\"profesional\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:376:6: ( ( '\"profesional\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( '\"profesional\"' )
                    {
                     before(grammarAccess.getEstiloAccess().getProfesionalEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ( '\"profesional\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:3: '\"profesional\"'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Estilo__Alternatives758); 

                    }

                     after(grammarAccess.getEstiloAccess().getProfesionalEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Estilo__Alternatives"


    // $ANTLR start "rule__TipoPresentacion__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: rule__TipoPresentacion__Alternatives : ( ( ( '\"basico\"' ) ) | ( ( '\"premium\"' ) ) | ( ( '\"gold\"' ) ) );
    public final void rule__TipoPresentacion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( ( ( '\"basico\"' ) ) | ( ( '\"premium\"' ) ) | ( ( '\"gold\"' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( ( '\"basico\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( ( '\"basico\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( '\"basico\"' )
                    {
                     before(grammarAccess.getTipoPresentacionAccess().getBasicoEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: ( '\"basico\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:395:3: '\"basico\"'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__TipoPresentacion__Alternatives794); 

                    }

                     after(grammarAccess.getTipoPresentacionAccess().getBasicoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:6: ( ( '\"premium\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:6: ( ( '\"premium\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( '\"premium\"' )
                    {
                     before(grammarAccess.getTipoPresentacionAccess().getPremiumEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( '\"premium\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:3: '\"premium\"'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__TipoPresentacion__Alternatives815); 

                    }

                     after(grammarAccess.getTipoPresentacionAccess().getPremiumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:407:6: ( ( '\"gold\"' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:407:6: ( ( '\"gold\"' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:408:1: ( '\"gold\"' )
                    {
                     before(grammarAccess.getTipoPresentacionAccess().getGoldEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: ( '\"gold\"' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:3: '\"gold\"'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__TipoPresentacion__Alternatives836); 

                    }

                     after(grammarAccess.getTipoPresentacionAccess().getGoldEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TipoPresentacion__Alternatives"


    // $ANTLR start "rule__MarketPlace__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: rule__MarketPlace__Group__0 : rule__MarketPlace__Group__0__Impl rule__MarketPlace__Group__1 ;
    public final void rule__MarketPlace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( rule__MarketPlace__Group__0__Impl rule__MarketPlace__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:2: rule__MarketPlace__Group__0__Impl rule__MarketPlace__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__0__Impl_in_rule__MarketPlace__Group__0869);
            rule__MarketPlace__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__1_in_rule__MarketPlace__Group__0872);
            rule__MarketPlace__Group__1();

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
    // $ANTLR end "rule__MarketPlace__Group__0"


    // $ANTLR start "rule__MarketPlace__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: rule__MarketPlace__Group__0__Impl : ( () ) ;
    public final void rule__MarketPlace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ()
            {
             before(grammarAccess.getMarketPlaceAccess().getMarketPlaceAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: 
            {
            }

             after(grammarAccess.getMarketPlaceAccess().getMarketPlaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarketPlace__Group__0__Impl"


    // $ANTLR start "rule__MarketPlace__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: rule__MarketPlace__Group__1 : rule__MarketPlace__Group__1__Impl rule__MarketPlace__Group__2 ;
    public final void rule__MarketPlace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( rule__MarketPlace__Group__1__Impl rule__MarketPlace__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:2: rule__MarketPlace__Group__1__Impl rule__MarketPlace__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__1__Impl_in_rule__MarketPlace__Group__1930);
            rule__MarketPlace__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__2_in_rule__MarketPlace__Group__1933);
            rule__MarketPlace__Group__2();

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
    // $ANTLR end "rule__MarketPlace__Group__1"


    // $ANTLR start "rule__MarketPlace__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: rule__MarketPlace__Group__1__Impl : ( RULE_LESS ) ;
    public final void rule__MarketPlace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: RULE_LESS
            {
             before(grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_1()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__MarketPlace__Group__1__Impl960); 
             after(grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__MarketPlace__Group__1__Impl"


    // $ANTLR start "rule__MarketPlace__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: rule__MarketPlace__Group__2 : rule__MarketPlace__Group__2__Impl rule__MarketPlace__Group__3 ;
    public final void rule__MarketPlace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( rule__MarketPlace__Group__2__Impl rule__MarketPlace__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:2: rule__MarketPlace__Group__2__Impl rule__MarketPlace__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__2__Impl_in_rule__MarketPlace__Group__2989);
            rule__MarketPlace__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__3_in_rule__MarketPlace__Group__2992);
            rule__MarketPlace__Group__3();

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
    // $ANTLR end "rule__MarketPlace__Group__2"


    // $ANTLR start "rule__MarketPlace__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: rule__MarketPlace__Group__2__Impl : ( RULE_QUESTION ) ;
    public final void rule__MarketPlace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( RULE_QUESTION ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( RULE_QUESTION )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( RULE_QUESTION )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: RULE_QUESTION
            {
             before(grammarAccess.getMarketPlaceAccess().getQUESTIONTerminalRuleCall_2()); 
            match(input,RULE_QUESTION,FollowSets000.FOLLOW_RULE_QUESTION_in_rule__MarketPlace__Group__2__Impl1019); 
             after(grammarAccess.getMarketPlaceAccess().getQUESTIONTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__MarketPlace__Group__2__Impl"


    // $ANTLR start "rule__MarketPlace__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: rule__MarketPlace__Group__3 : rule__MarketPlace__Group__3__Impl rule__MarketPlace__Group__4 ;
    public final void rule__MarketPlace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( rule__MarketPlace__Group__3__Impl rule__MarketPlace__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:2: rule__MarketPlace__Group__3__Impl rule__MarketPlace__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__3__Impl_in_rule__MarketPlace__Group__31048);
            rule__MarketPlace__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__4_in_rule__MarketPlace__Group__31051);
            rule__MarketPlace__Group__4();

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
    // $ANTLR end "rule__MarketPlace__Group__3"


    // $ANTLR start "rule__MarketPlace__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: rule__MarketPlace__Group__3__Impl : ( 'xml' ) ;
    public final void rule__MarketPlace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( 'xml' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( 'xml' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( 'xml' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: 'xml'
            {
             before(grammarAccess.getMarketPlaceAccess().getXmlKeyword_3()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MarketPlace__Group__3__Impl1079); 
             after(grammarAccess.getMarketPlaceAccess().getXmlKeyword_3()); 

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
    // $ANTLR end "rule__MarketPlace__Group__3__Impl"


    // $ANTLR start "rule__MarketPlace__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: rule__MarketPlace__Group__4 : rule__MarketPlace__Group__4__Impl rule__MarketPlace__Group__5 ;
    public final void rule__MarketPlace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ( rule__MarketPlace__Group__4__Impl rule__MarketPlace__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:2: rule__MarketPlace__Group__4__Impl rule__MarketPlace__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__4__Impl_in_rule__MarketPlace__Group__41110);
            rule__MarketPlace__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__5_in_rule__MarketPlace__Group__41113);
            rule__MarketPlace__Group__5();

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
    // $ANTLR end "rule__MarketPlace__Group__4"


    // $ANTLR start "rule__MarketPlace__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: rule__MarketPlace__Group__4__Impl : ( 'version' ) ;
    public final void rule__MarketPlace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( ( 'version' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( 'version' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( 'version' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: 'version'
            {
             before(grammarAccess.getMarketPlaceAccess().getVersionKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MarketPlace__Group__4__Impl1141); 
             after(grammarAccess.getMarketPlaceAccess().getVersionKeyword_4()); 

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
    // $ANTLR end "rule__MarketPlace__Group__4__Impl"


    // $ANTLR start "rule__MarketPlace__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: rule__MarketPlace__Group__5 : rule__MarketPlace__Group__5__Impl rule__MarketPlace__Group__6 ;
    public final void rule__MarketPlace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( rule__MarketPlace__Group__5__Impl rule__MarketPlace__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: rule__MarketPlace__Group__5__Impl rule__MarketPlace__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__5__Impl_in_rule__MarketPlace__Group__51172);
            rule__MarketPlace__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__6_in_rule__MarketPlace__Group__51175);
            rule__MarketPlace__Group__6();

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
    // $ANTLR end "rule__MarketPlace__Group__5"


    // $ANTLR start "rule__MarketPlace__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: rule__MarketPlace__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__5__Impl1202); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__MarketPlace__Group__5__Impl"


    // $ANTLR start "rule__MarketPlace__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: rule__MarketPlace__Group__6 : rule__MarketPlace__Group__6__Impl rule__MarketPlace__Group__7 ;
    public final void rule__MarketPlace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__MarketPlace__Group__6__Impl rule__MarketPlace__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: rule__MarketPlace__Group__6__Impl rule__MarketPlace__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__6__Impl_in_rule__MarketPlace__Group__61231);
            rule__MarketPlace__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__7_in_rule__MarketPlace__Group__61234);
            rule__MarketPlace__Group__7();

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
    // $ANTLR end "rule__MarketPlace__Group__6"


    // $ANTLR start "rule__MarketPlace__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: rule__MarketPlace__Group__6__Impl : ( '\"1.0\"' ) ;
    public final void rule__MarketPlace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( ( '\"1.0\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( '\"1.0\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( '\"1.0\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: '\"1.0\"'
            {
             before(grammarAccess.getMarketPlaceAccess().getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MarketPlace__Group__6__Impl1262); 
             after(grammarAccess.getMarketPlaceAccess().getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6()); 

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
    // $ANTLR end "rule__MarketPlace__Group__6__Impl"


    // $ANTLR start "rule__MarketPlace__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: rule__MarketPlace__Group__7 : rule__MarketPlace__Group__7__Impl rule__MarketPlace__Group__8 ;
    public final void rule__MarketPlace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__MarketPlace__Group__7__Impl rule__MarketPlace__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:2: rule__MarketPlace__Group__7__Impl rule__MarketPlace__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__7__Impl_in_rule__MarketPlace__Group__71293);
            rule__MarketPlace__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__8_in_rule__MarketPlace__Group__71296);
            rule__MarketPlace__Group__8();

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
    // $ANTLR end "rule__MarketPlace__Group__7"


    // $ANTLR start "rule__MarketPlace__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: rule__MarketPlace__Group__7__Impl : ( 'encoding' ) ;
    public final void rule__MarketPlace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( ( 'encoding' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( 'encoding' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( 'encoding' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: 'encoding'
            {
             before(grammarAccess.getMarketPlaceAccess().getEncodingKeyword_7()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MarketPlace__Group__7__Impl1324); 
             after(grammarAccess.getMarketPlaceAccess().getEncodingKeyword_7()); 

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
    // $ANTLR end "rule__MarketPlace__Group__7__Impl"


    // $ANTLR start "rule__MarketPlace__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: rule__MarketPlace__Group__8 : rule__MarketPlace__Group__8__Impl rule__MarketPlace__Group__9 ;
    public final void rule__MarketPlace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( rule__MarketPlace__Group__8__Impl rule__MarketPlace__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:2: rule__MarketPlace__Group__8__Impl rule__MarketPlace__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__8__Impl_in_rule__MarketPlace__Group__81355);
            rule__MarketPlace__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__9_in_rule__MarketPlace__Group__81358);
            rule__MarketPlace__Group__9();

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
    // $ANTLR end "rule__MarketPlace__Group__8"


    // $ANTLR start "rule__MarketPlace__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: rule__MarketPlace__Group__8__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_8()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__8__Impl1385); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__MarketPlace__Group__8__Impl"


    // $ANTLR start "rule__MarketPlace__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: rule__MarketPlace__Group__9 : rule__MarketPlace__Group__9__Impl rule__MarketPlace__Group__10 ;
    public final void rule__MarketPlace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( rule__MarketPlace__Group__9__Impl rule__MarketPlace__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:2: rule__MarketPlace__Group__9__Impl rule__MarketPlace__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__9__Impl_in_rule__MarketPlace__Group__91414);
            rule__MarketPlace__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__10_in_rule__MarketPlace__Group__91417);
            rule__MarketPlace__Group__10();

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
    // $ANTLR end "rule__MarketPlace__Group__9"


    // $ANTLR start "rule__MarketPlace__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: rule__MarketPlace__Group__9__Impl : ( '\"ASCII\"' ) ;
    public final void rule__MarketPlace__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( '\"ASCII\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( '\"ASCII\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( '\"ASCII\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: '\"ASCII\"'
            {
             before(grammarAccess.getMarketPlaceAccess().getASCIIKeyword_9()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MarketPlace__Group__9__Impl1445); 
             after(grammarAccess.getMarketPlaceAccess().getASCIIKeyword_9()); 

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
    // $ANTLR end "rule__MarketPlace__Group__9__Impl"


    // $ANTLR start "rule__MarketPlace__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: rule__MarketPlace__Group__10 : rule__MarketPlace__Group__10__Impl rule__MarketPlace__Group__11 ;
    public final void rule__MarketPlace__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( rule__MarketPlace__Group__10__Impl rule__MarketPlace__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:2: rule__MarketPlace__Group__10__Impl rule__MarketPlace__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__10__Impl_in_rule__MarketPlace__Group__101476);
            rule__MarketPlace__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__11_in_rule__MarketPlace__Group__101479);
            rule__MarketPlace__Group__11();

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
    // $ANTLR end "rule__MarketPlace__Group__10"


    // $ANTLR start "rule__MarketPlace__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: rule__MarketPlace__Group__10__Impl : ( RULE_QUESTION ) ;
    public final void rule__MarketPlace__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( ( RULE_QUESTION ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: ( RULE_QUESTION )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: ( RULE_QUESTION )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: RULE_QUESTION
            {
             before(grammarAccess.getMarketPlaceAccess().getQUESTIONTerminalRuleCall_10()); 
            match(input,RULE_QUESTION,FollowSets000.FOLLOW_RULE_QUESTION_in_rule__MarketPlace__Group__10__Impl1506); 
             after(grammarAccess.getMarketPlaceAccess().getQUESTIONTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__MarketPlace__Group__10__Impl"


    // $ANTLR start "rule__MarketPlace__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: rule__MarketPlace__Group__11 : rule__MarketPlace__Group__11__Impl rule__MarketPlace__Group__12 ;
    public final void rule__MarketPlace__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( rule__MarketPlace__Group__11__Impl rule__MarketPlace__Group__12 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:2: rule__MarketPlace__Group__11__Impl rule__MarketPlace__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__11__Impl_in_rule__MarketPlace__Group__111535);
            rule__MarketPlace__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__12_in_rule__MarketPlace__Group__111538);
            rule__MarketPlace__Group__12();

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
    // $ANTLR end "rule__MarketPlace__Group__11"


    // $ANTLR start "rule__MarketPlace__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: rule__MarketPlace__Group__11__Impl : ( RULE_GREATER ) ;
    public final void rule__MarketPlace__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: RULE_GREATER
            {
             before(grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_11()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__MarketPlace__Group__11__Impl1565); 
             after(grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_11()); 

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
    // $ANTLR end "rule__MarketPlace__Group__11__Impl"


    // $ANTLR start "rule__MarketPlace__Group__12"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: rule__MarketPlace__Group__12 : rule__MarketPlace__Group__12__Impl rule__MarketPlace__Group__13 ;
    public final void rule__MarketPlace__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( rule__MarketPlace__Group__12__Impl rule__MarketPlace__Group__13 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:2: rule__MarketPlace__Group__12__Impl rule__MarketPlace__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__12__Impl_in_rule__MarketPlace__Group__121594);
            rule__MarketPlace__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__13_in_rule__MarketPlace__Group__121597);
            rule__MarketPlace__Group__13();

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
    // $ANTLR end "rule__MarketPlace__Group__12"


    // $ANTLR start "rule__MarketPlace__Group__12__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__MarketPlace__Group__12__Impl : ( RULE_LESS ) ;
    public final void rule__MarketPlace__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: RULE_LESS
            {
             before(grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_12()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__MarketPlace__Group__12__Impl1624); 
             after(grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_12()); 

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
    // $ANTLR end "rule__MarketPlace__Group__12__Impl"


    // $ANTLR start "rule__MarketPlace__Group__13"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: rule__MarketPlace__Group__13 : rule__MarketPlace__Group__13__Impl rule__MarketPlace__Group__14 ;
    public final void rule__MarketPlace__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( rule__MarketPlace__Group__13__Impl rule__MarketPlace__Group__14 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:2: rule__MarketPlace__Group__13__Impl rule__MarketPlace__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__13__Impl_in_rule__MarketPlace__Group__131653);
            rule__MarketPlace__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__14_in_rule__MarketPlace__Group__131656);
            rule__MarketPlace__Group__14();

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
    // $ANTLR end "rule__MarketPlace__Group__13"


    // $ANTLR start "rule__MarketPlace__Group__13__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: rule__MarketPlace__Group__13__Impl : ( RULE_TMARKETPLACE ) ;
    public final void rule__MarketPlace__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( ( RULE_TMARKETPLACE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( RULE_TMARKETPLACE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( RULE_TMARKETPLACE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: RULE_TMARKETPLACE
            {
             before(grammarAccess.getMarketPlaceAccess().getTMARKETPLACETerminalRuleCall_13()); 
            match(input,RULE_TMARKETPLACE,FollowSets000.FOLLOW_RULE_TMARKETPLACE_in_rule__MarketPlace__Group__13__Impl1683); 
             after(grammarAccess.getMarketPlaceAccess().getTMARKETPLACETerminalRuleCall_13()); 

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
    // $ANTLR end "rule__MarketPlace__Group__13__Impl"


    // $ANTLR start "rule__MarketPlace__Group__14"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: rule__MarketPlace__Group__14 : rule__MarketPlace__Group__14__Impl rule__MarketPlace__Group__15 ;
    public final void rule__MarketPlace__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__MarketPlace__Group__14__Impl rule__MarketPlace__Group__15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: rule__MarketPlace__Group__14__Impl rule__MarketPlace__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__14__Impl_in_rule__MarketPlace__Group__141712);
            rule__MarketPlace__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__15_in_rule__MarketPlace__Group__141715);
            rule__MarketPlace__Group__15();

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
    // $ANTLR end "rule__MarketPlace__Group__14"


    // $ANTLR start "rule__MarketPlace__Group__14__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: rule__MarketPlace__Group__14__Impl : ( 'xmi:version' ) ;
    public final void rule__MarketPlace__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ( 'xmi:version' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( 'xmi:version' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( 'xmi:version' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: 'xmi:version'
            {
             before(grammarAccess.getMarketPlaceAccess().getXmiVersionKeyword_14()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MarketPlace__Group__14__Impl1743); 
             after(grammarAccess.getMarketPlaceAccess().getXmiVersionKeyword_14()); 

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
    // $ANTLR end "rule__MarketPlace__Group__14__Impl"


    // $ANTLR start "rule__MarketPlace__Group__15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: rule__MarketPlace__Group__15 : rule__MarketPlace__Group__15__Impl rule__MarketPlace__Group__16 ;
    public final void rule__MarketPlace__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( rule__MarketPlace__Group__15__Impl rule__MarketPlace__Group__16 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:2: rule__MarketPlace__Group__15__Impl rule__MarketPlace__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__15__Impl_in_rule__MarketPlace__Group__151774);
            rule__MarketPlace__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__16_in_rule__MarketPlace__Group__151777);
            rule__MarketPlace__Group__16();

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
    // $ANTLR end "rule__MarketPlace__Group__15"


    // $ANTLR start "rule__MarketPlace__Group__15__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: rule__MarketPlace__Group__15__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_15()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__15__Impl1804); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_15()); 

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
    // $ANTLR end "rule__MarketPlace__Group__15__Impl"


    // $ANTLR start "rule__MarketPlace__Group__16"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: rule__MarketPlace__Group__16 : rule__MarketPlace__Group__16__Impl rule__MarketPlace__Group__17 ;
    public final void rule__MarketPlace__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( rule__MarketPlace__Group__16__Impl rule__MarketPlace__Group__17 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:2: rule__MarketPlace__Group__16__Impl rule__MarketPlace__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__16__Impl_in_rule__MarketPlace__Group__161833);
            rule__MarketPlace__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__17_in_rule__MarketPlace__Group__161836);
            rule__MarketPlace__Group__17();

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
    // $ANTLR end "rule__MarketPlace__Group__16"


    // $ANTLR start "rule__MarketPlace__Group__16__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: rule__MarketPlace__Group__16__Impl : ( '\"2.0\"' ) ;
    public final void rule__MarketPlace__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( ( '\"2.0\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( '\"2.0\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( '\"2.0\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: '\"2.0\"'
            {
             before(grammarAccess.getMarketPlaceAccess().getQuotationMarkDigitTwoFullStopDigitZeroQuotationMarkKeyword_16()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MarketPlace__Group__16__Impl1864); 
             after(grammarAccess.getMarketPlaceAccess().getQuotationMarkDigitTwoFullStopDigitZeroQuotationMarkKeyword_16()); 

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
    // $ANTLR end "rule__MarketPlace__Group__16__Impl"


    // $ANTLR start "rule__MarketPlace__Group__17"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: rule__MarketPlace__Group__17 : rule__MarketPlace__Group__17__Impl rule__MarketPlace__Group__18 ;
    public final void rule__MarketPlace__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__MarketPlace__Group__17__Impl rule__MarketPlace__Group__18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:2: rule__MarketPlace__Group__17__Impl rule__MarketPlace__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__17__Impl_in_rule__MarketPlace__Group__171895);
            rule__MarketPlace__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__18_in_rule__MarketPlace__Group__171898);
            rule__MarketPlace__Group__18();

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
    // $ANTLR end "rule__MarketPlace__Group__17"


    // $ANTLR start "rule__MarketPlace__Group__17__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: rule__MarketPlace__Group__17__Impl : ( 'xmlns:xmi' ) ;
    public final void rule__MarketPlace__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( ( 'xmlns:xmi' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( 'xmlns:xmi' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( 'xmlns:xmi' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: 'xmlns:xmi'
            {
             before(grammarAccess.getMarketPlaceAccess().getXmlnsXmiKeyword_17()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MarketPlace__Group__17__Impl1926); 
             after(grammarAccess.getMarketPlaceAccess().getXmlnsXmiKeyword_17()); 

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
    // $ANTLR end "rule__MarketPlace__Group__17__Impl"


    // $ANTLR start "rule__MarketPlace__Group__18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: rule__MarketPlace__Group__18 : rule__MarketPlace__Group__18__Impl rule__MarketPlace__Group__19 ;
    public final void rule__MarketPlace__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: ( rule__MarketPlace__Group__18__Impl rule__MarketPlace__Group__19 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:2: rule__MarketPlace__Group__18__Impl rule__MarketPlace__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__18__Impl_in_rule__MarketPlace__Group__181957);
            rule__MarketPlace__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__19_in_rule__MarketPlace__Group__181960);
            rule__MarketPlace__Group__19();

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
    // $ANTLR end "rule__MarketPlace__Group__18"


    // $ANTLR start "rule__MarketPlace__Group__18__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: rule__MarketPlace__Group__18__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_18()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__18__Impl1987); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_18()); 

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
    // $ANTLR end "rule__MarketPlace__Group__18__Impl"


    // $ANTLR start "rule__MarketPlace__Group__19"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: rule__MarketPlace__Group__19 : rule__MarketPlace__Group__19__Impl rule__MarketPlace__Group__20 ;
    public final void rule__MarketPlace__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( rule__MarketPlace__Group__19__Impl rule__MarketPlace__Group__20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:2: rule__MarketPlace__Group__19__Impl rule__MarketPlace__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__19__Impl_in_rule__MarketPlace__Group__192016);
            rule__MarketPlace__Group__19__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__20_in_rule__MarketPlace__Group__192019);
            rule__MarketPlace__Group__20();

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
    // $ANTLR end "rule__MarketPlace__Group__19"


    // $ANTLR start "rule__MarketPlace__Group__19__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: rule__MarketPlace__Group__19__Impl : ( RULE_TXMI ) ;
    public final void rule__MarketPlace__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( ( RULE_TXMI ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( RULE_TXMI )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( RULE_TXMI )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: RULE_TXMI
            {
             before(grammarAccess.getMarketPlaceAccess().getTXMITerminalRuleCall_19()); 
            match(input,RULE_TXMI,FollowSets000.FOLLOW_RULE_TXMI_in_rule__MarketPlace__Group__19__Impl2046); 
             after(grammarAccess.getMarketPlaceAccess().getTXMITerminalRuleCall_19()); 

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
    // $ANTLR end "rule__MarketPlace__Group__19__Impl"


    // $ANTLR start "rule__MarketPlace__Group__20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: rule__MarketPlace__Group__20 : rule__MarketPlace__Group__20__Impl rule__MarketPlace__Group__21 ;
    public final void rule__MarketPlace__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( rule__MarketPlace__Group__20__Impl rule__MarketPlace__Group__21 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:2: rule__MarketPlace__Group__20__Impl rule__MarketPlace__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__20__Impl_in_rule__MarketPlace__Group__202075);
            rule__MarketPlace__Group__20__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__21_in_rule__MarketPlace__Group__202078);
            rule__MarketPlace__Group__21();

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
    // $ANTLR end "rule__MarketPlace__Group__20"


    // $ANTLR start "rule__MarketPlace__Group__20__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: rule__MarketPlace__Group__20__Impl : ( 'xmlns:xsi' ) ;
    public final void rule__MarketPlace__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( ( 'xmlns:xsi' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( 'xmlns:xsi' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( 'xmlns:xsi' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: 'xmlns:xsi'
            {
             before(grammarAccess.getMarketPlaceAccess().getXmlnsXsiKeyword_20()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MarketPlace__Group__20__Impl2106); 
             after(grammarAccess.getMarketPlaceAccess().getXmlnsXsiKeyword_20()); 

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
    // $ANTLR end "rule__MarketPlace__Group__20__Impl"


    // $ANTLR start "rule__MarketPlace__Group__21"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: rule__MarketPlace__Group__21 : rule__MarketPlace__Group__21__Impl rule__MarketPlace__Group__22 ;
    public final void rule__MarketPlace__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( rule__MarketPlace__Group__21__Impl rule__MarketPlace__Group__22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:2: rule__MarketPlace__Group__21__Impl rule__MarketPlace__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__21__Impl_in_rule__MarketPlace__Group__212137);
            rule__MarketPlace__Group__21__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__22_in_rule__MarketPlace__Group__212140);
            rule__MarketPlace__Group__22();

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
    // $ANTLR end "rule__MarketPlace__Group__21"


    // $ANTLR start "rule__MarketPlace__Group__21__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: rule__MarketPlace__Group__21__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_21()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__21__Impl2167); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_21()); 

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
    // $ANTLR end "rule__MarketPlace__Group__21__Impl"


    // $ANTLR start "rule__MarketPlace__Group__22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: rule__MarketPlace__Group__22 : rule__MarketPlace__Group__22__Impl rule__MarketPlace__Group__23 ;
    public final void rule__MarketPlace__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__MarketPlace__Group__22__Impl rule__MarketPlace__Group__23 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:2: rule__MarketPlace__Group__22__Impl rule__MarketPlace__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__22__Impl_in_rule__MarketPlace__Group__222196);
            rule__MarketPlace__Group__22__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__23_in_rule__MarketPlace__Group__222199);
            rule__MarketPlace__Group__23();

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
    // $ANTLR end "rule__MarketPlace__Group__22"


    // $ANTLR start "rule__MarketPlace__Group__22__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: rule__MarketPlace__Group__22__Impl : ( RULE_TXSI ) ;
    public final void rule__MarketPlace__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( ( RULE_TXSI ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( RULE_TXSI )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( RULE_TXSI )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: RULE_TXSI
            {
             before(grammarAccess.getMarketPlaceAccess().getTXSITerminalRuleCall_22()); 
            match(input,RULE_TXSI,FollowSets000.FOLLOW_RULE_TXSI_in_rule__MarketPlace__Group__22__Impl2226); 
             after(grammarAccess.getMarketPlaceAccess().getTXSITerminalRuleCall_22()); 

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
    // $ANTLR end "rule__MarketPlace__Group__22__Impl"


    // $ANTLR start "rule__MarketPlace__Group__23"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: rule__MarketPlace__Group__23 : rule__MarketPlace__Group__23__Impl rule__MarketPlace__Group__24 ;
    public final void rule__MarketPlace__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( rule__MarketPlace__Group__23__Impl rule__MarketPlace__Group__24 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:2: rule__MarketPlace__Group__23__Impl rule__MarketPlace__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__23__Impl_in_rule__MarketPlace__Group__232255);
            rule__MarketPlace__Group__23__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__24_in_rule__MarketPlace__Group__232258);
            rule__MarketPlace__Group__24();

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
    // $ANTLR end "rule__MarketPlace__Group__23"


    // $ANTLR start "rule__MarketPlace__Group__23__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: rule__MarketPlace__Group__23__Impl : ( 'xmlns:proyectos' ) ;
    public final void rule__MarketPlace__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: ( ( 'xmlns:proyectos' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( 'xmlns:proyectos' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( 'xmlns:proyectos' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: 'xmlns:proyectos'
            {
             before(grammarAccess.getMarketPlaceAccess().getXmlnsProyectosKeyword_23()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MarketPlace__Group__23__Impl2286); 
             after(grammarAccess.getMarketPlaceAccess().getXmlnsProyectosKeyword_23()); 

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
    // $ANTLR end "rule__MarketPlace__Group__23__Impl"


    // $ANTLR start "rule__MarketPlace__Group__24"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: rule__MarketPlace__Group__24 : rule__MarketPlace__Group__24__Impl rule__MarketPlace__Group__25 ;
    public final void rule__MarketPlace__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__MarketPlace__Group__24__Impl rule__MarketPlace__Group__25 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:2: rule__MarketPlace__Group__24__Impl rule__MarketPlace__Group__25
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__24__Impl_in_rule__MarketPlace__Group__242317);
            rule__MarketPlace__Group__24__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__25_in_rule__MarketPlace__Group__242320);
            rule__MarketPlace__Group__25();

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
    // $ANTLR end "rule__MarketPlace__Group__24"


    // $ANTLR start "rule__MarketPlace__Group__24__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: rule__MarketPlace__Group__24__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_24()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__24__Impl2347); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_24()); 

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
    // $ANTLR end "rule__MarketPlace__Group__24__Impl"


    // $ANTLR start "rule__MarketPlace__Group__25"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: rule__MarketPlace__Group__25 : rule__MarketPlace__Group__25__Impl rule__MarketPlace__Group__26 ;
    public final void rule__MarketPlace__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( rule__MarketPlace__Group__25__Impl rule__MarketPlace__Group__26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:2: rule__MarketPlace__Group__25__Impl rule__MarketPlace__Group__26
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__25__Impl_in_rule__MarketPlace__Group__252376);
            rule__MarketPlace__Group__25__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__26_in_rule__MarketPlace__Group__252379);
            rule__MarketPlace__Group__26();

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
    // $ANTLR end "rule__MarketPlace__Group__25"


    // $ANTLR start "rule__MarketPlace__Group__25__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: rule__MarketPlace__Group__25__Impl : ( RULE_TPROYECTOS ) ;
    public final void rule__MarketPlace__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( ( RULE_TPROYECTOS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( RULE_TPROYECTOS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( RULE_TPROYECTOS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: RULE_TPROYECTOS
            {
             before(grammarAccess.getMarketPlaceAccess().getTPROYECTOSTerminalRuleCall_25()); 
            match(input,RULE_TPROYECTOS,FollowSets000.FOLLOW_RULE_TPROYECTOS_in_rule__MarketPlace__Group__25__Impl2406); 
             after(grammarAccess.getMarketPlaceAccess().getTPROYECTOSTerminalRuleCall_25()); 

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
    // $ANTLR end "rule__MarketPlace__Group__25__Impl"


    // $ANTLR start "rule__MarketPlace__Group__26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: rule__MarketPlace__Group__26 : rule__MarketPlace__Group__26__Impl rule__MarketPlace__Group__27 ;
    public final void rule__MarketPlace__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( rule__MarketPlace__Group__26__Impl rule__MarketPlace__Group__27 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:2: rule__MarketPlace__Group__26__Impl rule__MarketPlace__Group__27
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__26__Impl_in_rule__MarketPlace__Group__262435);
            rule__MarketPlace__Group__26__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__27_in_rule__MarketPlace__Group__262438);
            rule__MarketPlace__Group__27();

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
    // $ANTLR end "rule__MarketPlace__Group__26"


    // $ANTLR start "rule__MarketPlace__Group__26__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: rule__MarketPlace__Group__26__Impl : ( 'xsi:schemaLocation' ) ;
    public final void rule__MarketPlace__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: ( ( 'xsi:schemaLocation' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( 'xsi:schemaLocation' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( 'xsi:schemaLocation' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: 'xsi:schemaLocation'
            {
             before(grammarAccess.getMarketPlaceAccess().getXsiSchemaLocationKeyword_26()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__MarketPlace__Group__26__Impl2466); 
             after(grammarAccess.getMarketPlaceAccess().getXsiSchemaLocationKeyword_26()); 

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
    // $ANTLR end "rule__MarketPlace__Group__26__Impl"


    // $ANTLR start "rule__MarketPlace__Group__27"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: rule__MarketPlace__Group__27 : rule__MarketPlace__Group__27__Impl rule__MarketPlace__Group__28 ;
    public final void rule__MarketPlace__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( rule__MarketPlace__Group__27__Impl rule__MarketPlace__Group__28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:2: rule__MarketPlace__Group__27__Impl rule__MarketPlace__Group__28
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__27__Impl_in_rule__MarketPlace__Group__272497);
            rule__MarketPlace__Group__27__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__28_in_rule__MarketPlace__Group__272500);
            rule__MarketPlace__Group__28();

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
    // $ANTLR end "rule__MarketPlace__Group__27"


    // $ANTLR start "rule__MarketPlace__Group__27__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__MarketPlace__Group__27__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_27()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__27__Impl2527); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_27()); 

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
    // $ANTLR end "rule__MarketPlace__Group__27__Impl"


    // $ANTLR start "rule__MarketPlace__Group__28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: rule__MarketPlace__Group__28 : rule__MarketPlace__Group__28__Impl rule__MarketPlace__Group__29 ;
    public final void rule__MarketPlace__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( rule__MarketPlace__Group__28__Impl rule__MarketPlace__Group__29 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:2: rule__MarketPlace__Group__28__Impl rule__MarketPlace__Group__29
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__28__Impl_in_rule__MarketPlace__Group__282556);
            rule__MarketPlace__Group__28__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__29_in_rule__MarketPlace__Group__282559);
            rule__MarketPlace__Group__29();

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
    // $ANTLR end "rule__MarketPlace__Group__28"


    // $ANTLR start "rule__MarketPlace__Group__28__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: rule__MarketPlace__Group__28__Impl : ( RULE_SCHEMALOCATION ) ;
    public final void rule__MarketPlace__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( ( RULE_SCHEMALOCATION ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( RULE_SCHEMALOCATION )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( RULE_SCHEMALOCATION )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: RULE_SCHEMALOCATION
            {
             before(grammarAccess.getMarketPlaceAccess().getSCHEMALOCATIONTerminalRuleCall_28()); 
            match(input,RULE_SCHEMALOCATION,FollowSets000.FOLLOW_RULE_SCHEMALOCATION_in_rule__MarketPlace__Group__28__Impl2586); 
             after(grammarAccess.getMarketPlaceAccess().getSCHEMALOCATIONTerminalRuleCall_28()); 

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
    // $ANTLR end "rule__MarketPlace__Group__28__Impl"


    // $ANTLR start "rule__MarketPlace__Group__29"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: rule__MarketPlace__Group__29 : rule__MarketPlace__Group__29__Impl rule__MarketPlace__Group__30 ;
    public final void rule__MarketPlace__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( rule__MarketPlace__Group__29__Impl rule__MarketPlace__Group__30 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:2: rule__MarketPlace__Group__29__Impl rule__MarketPlace__Group__30
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__29__Impl_in_rule__MarketPlace__Group__292615);
            rule__MarketPlace__Group__29__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__30_in_rule__MarketPlace__Group__292618);
            rule__MarketPlace__Group__30();

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
    // $ANTLR end "rule__MarketPlace__Group__29"


    // $ANTLR start "rule__MarketPlace__Group__29__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: rule__MarketPlace__Group__29__Impl : ( 'nombre' ) ;
    public final void rule__MarketPlace__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( ( 'nombre' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( 'nombre' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( 'nombre' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: 'nombre'
            {
             before(grammarAccess.getMarketPlaceAccess().getNombreKeyword_29()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MarketPlace__Group__29__Impl2646); 
             after(grammarAccess.getMarketPlaceAccess().getNombreKeyword_29()); 

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
    // $ANTLR end "rule__MarketPlace__Group__29__Impl"


    // $ANTLR start "rule__MarketPlace__Group__30"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__MarketPlace__Group__30 : rule__MarketPlace__Group__30__Impl rule__MarketPlace__Group__31 ;
    public final void rule__MarketPlace__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( rule__MarketPlace__Group__30__Impl rule__MarketPlace__Group__31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:2: rule__MarketPlace__Group__30__Impl rule__MarketPlace__Group__31
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__30__Impl_in_rule__MarketPlace__Group__302677);
            rule__MarketPlace__Group__30__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__31_in_rule__MarketPlace__Group__302680);
            rule__MarketPlace__Group__31();

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
    // $ANTLR end "rule__MarketPlace__Group__30"


    // $ANTLR start "rule__MarketPlace__Group__30__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: rule__MarketPlace__Group__30__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_30()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__30__Impl2707); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_30()); 

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
    // $ANTLR end "rule__MarketPlace__Group__30__Impl"


    // $ANTLR start "rule__MarketPlace__Group__31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__MarketPlace__Group__31 : rule__MarketPlace__Group__31__Impl rule__MarketPlace__Group__32 ;
    public final void rule__MarketPlace__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__MarketPlace__Group__31__Impl rule__MarketPlace__Group__32 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__MarketPlace__Group__31__Impl rule__MarketPlace__Group__32
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__31__Impl_in_rule__MarketPlace__Group__312736);
            rule__MarketPlace__Group__31__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__32_in_rule__MarketPlace__Group__312739);
            rule__MarketPlace__Group__32();

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
    // $ANTLR end "rule__MarketPlace__Group__31"


    // $ANTLR start "rule__MarketPlace__Group__31__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__MarketPlace__Group__31__Impl : ( ( rule__MarketPlace__NombreAssignment_31 ) ) ;
    public final void rule__MarketPlace__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ( ( rule__MarketPlace__NombreAssignment_31 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__MarketPlace__NombreAssignment_31 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__MarketPlace__NombreAssignment_31 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__MarketPlace__NombreAssignment_31 )
            {
             before(grammarAccess.getMarketPlaceAccess().getNombreAssignment_31()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( rule__MarketPlace__NombreAssignment_31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__MarketPlace__NombreAssignment_31
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__NombreAssignment_31_in_rule__MarketPlace__Group__31__Impl2766);
            rule__MarketPlace__NombreAssignment_31();

            state._fsp--;


            }

             after(grammarAccess.getMarketPlaceAccess().getNombreAssignment_31()); 

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
    // $ANTLR end "rule__MarketPlace__Group__31__Impl"


    // $ANTLR start "rule__MarketPlace__Group__32"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__MarketPlace__Group__32 : rule__MarketPlace__Group__32__Impl rule__MarketPlace__Group__33 ;
    public final void rule__MarketPlace__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__MarketPlace__Group__32__Impl rule__MarketPlace__Group__33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__MarketPlace__Group__32__Impl rule__MarketPlace__Group__33
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__32__Impl_in_rule__MarketPlace__Group__322796);
            rule__MarketPlace__Group__32__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__33_in_rule__MarketPlace__Group__322799);
            rule__MarketPlace__Group__33();

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
    // $ANTLR end "rule__MarketPlace__Group__32"


    // $ANTLR start "rule__MarketPlace__Group__32__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: rule__MarketPlace__Group__32__Impl : ( 'presentacion' ) ;
    public final void rule__MarketPlace__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( 'presentacion' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( 'presentacion' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( 'presentacion' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: 'presentacion'
            {
             before(grammarAccess.getMarketPlaceAccess().getPresentacionKeyword_32()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__MarketPlace__Group__32__Impl2827); 
             after(grammarAccess.getMarketPlaceAccess().getPresentacionKeyword_32()); 

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
    // $ANTLR end "rule__MarketPlace__Group__32__Impl"


    // $ANTLR start "rule__MarketPlace__Group__33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__MarketPlace__Group__33 : rule__MarketPlace__Group__33__Impl rule__MarketPlace__Group__34 ;
    public final void rule__MarketPlace__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( rule__MarketPlace__Group__33__Impl rule__MarketPlace__Group__34 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:2: rule__MarketPlace__Group__33__Impl rule__MarketPlace__Group__34
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__33__Impl_in_rule__MarketPlace__Group__332858);
            rule__MarketPlace__Group__33__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__34_in_rule__MarketPlace__Group__332861);
            rule__MarketPlace__Group__34();

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
    // $ANTLR end "rule__MarketPlace__Group__33"


    // $ANTLR start "rule__MarketPlace__Group__33__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: rule__MarketPlace__Group__33__Impl : ( RULE_EQUALS ) ;
    public final void rule__MarketPlace__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: RULE_EQUALS
            {
             before(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_33()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__33__Impl2888); 
             after(grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_33()); 

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
    // $ANTLR end "rule__MarketPlace__Group__33__Impl"


    // $ANTLR start "rule__MarketPlace__Group__34"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: rule__MarketPlace__Group__34 : rule__MarketPlace__Group__34__Impl rule__MarketPlace__Group__35 ;
    public final void rule__MarketPlace__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: ( rule__MarketPlace__Group__34__Impl rule__MarketPlace__Group__35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:2: rule__MarketPlace__Group__34__Impl rule__MarketPlace__Group__35
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__34__Impl_in_rule__MarketPlace__Group__342917);
            rule__MarketPlace__Group__34__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__35_in_rule__MarketPlace__Group__342920);
            rule__MarketPlace__Group__35();

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
    // $ANTLR end "rule__MarketPlace__Group__34"


    // $ANTLR start "rule__MarketPlace__Group__34__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: rule__MarketPlace__Group__34__Impl : ( ( rule__MarketPlace__PresentacionAssignment_34 ) ) ;
    public final void rule__MarketPlace__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( ( ( rule__MarketPlace__PresentacionAssignment_34 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( rule__MarketPlace__PresentacionAssignment_34 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( rule__MarketPlace__PresentacionAssignment_34 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( rule__MarketPlace__PresentacionAssignment_34 )
            {
             before(grammarAccess.getMarketPlaceAccess().getPresentacionAssignment_34()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( rule__MarketPlace__PresentacionAssignment_34 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:2: rule__MarketPlace__PresentacionAssignment_34
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__PresentacionAssignment_34_in_rule__MarketPlace__Group__34__Impl2947);
            rule__MarketPlace__PresentacionAssignment_34();

            state._fsp--;


            }

             after(grammarAccess.getMarketPlaceAccess().getPresentacionAssignment_34()); 

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
    // $ANTLR end "rule__MarketPlace__Group__34__Impl"


    // $ANTLR start "rule__MarketPlace__Group__35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: rule__MarketPlace__Group__35 : rule__MarketPlace__Group__35__Impl rule__MarketPlace__Group__36 ;
    public final void rule__MarketPlace__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( rule__MarketPlace__Group__35__Impl rule__MarketPlace__Group__36 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:2: rule__MarketPlace__Group__35__Impl rule__MarketPlace__Group__36
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__35__Impl_in_rule__MarketPlace__Group__352977);
            rule__MarketPlace__Group__35__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__36_in_rule__MarketPlace__Group__352980);
            rule__MarketPlace__Group__36();

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
    // $ANTLR end "rule__MarketPlace__Group__35"


    // $ANTLR start "rule__MarketPlace__Group__35__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: rule__MarketPlace__Group__35__Impl : ( RULE_GREATER ) ;
    public final void rule__MarketPlace__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: RULE_GREATER
            {
             before(grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_35()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__MarketPlace__Group__35__Impl3007); 
             after(grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_35()); 

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
    // $ANTLR end "rule__MarketPlace__Group__35__Impl"


    // $ANTLR start "rule__MarketPlace__Group__36"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: rule__MarketPlace__Group__36 : rule__MarketPlace__Group__36__Impl rule__MarketPlace__Group__37 ;
    public final void rule__MarketPlace__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( rule__MarketPlace__Group__36__Impl rule__MarketPlace__Group__37 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:2: rule__MarketPlace__Group__36__Impl rule__MarketPlace__Group__37
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__36__Impl_in_rule__MarketPlace__Group__363036);
            rule__MarketPlace__Group__36__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__37_in_rule__MarketPlace__Group__363039);
            rule__MarketPlace__Group__37();

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
    // $ANTLR end "rule__MarketPlace__Group__36"


    // $ANTLR start "rule__MarketPlace__Group__36__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: rule__MarketPlace__Group__36__Impl : ( ( rule__MarketPlace__PaginasAssignment_36 )* ) ;
    public final void rule__MarketPlace__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( ( ( rule__MarketPlace__PaginasAssignment_36 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ( ( rule__MarketPlace__PaginasAssignment_36 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ( ( rule__MarketPlace__PaginasAssignment_36 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: ( rule__MarketPlace__PaginasAssignment_36 )*
            {
             before(grammarAccess.getMarketPlaceAccess().getPaginasAssignment_36()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( rule__MarketPlace__PaginasAssignment_36 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_LESS) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_TPAGINAS) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:2: rule__MarketPlace__PaginasAssignment_36
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__PaginasAssignment_36_in_rule__MarketPlace__Group__36__Impl3066);
            	    rule__MarketPlace__PaginasAssignment_36();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMarketPlaceAccess().getPaginasAssignment_36()); 

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
    // $ANTLR end "rule__MarketPlace__Group__36__Impl"


    // $ANTLR start "rule__MarketPlace__Group__37"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: rule__MarketPlace__Group__37 : rule__MarketPlace__Group__37__Impl rule__MarketPlace__Group__38 ;
    public final void rule__MarketPlace__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: ( rule__MarketPlace__Group__37__Impl rule__MarketPlace__Group__38 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:2: rule__MarketPlace__Group__37__Impl rule__MarketPlace__Group__38
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__37__Impl_in_rule__MarketPlace__Group__373097);
            rule__MarketPlace__Group__37__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__38_in_rule__MarketPlace__Group__373100);
            rule__MarketPlace__Group__38();

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
    // $ANTLR end "rule__MarketPlace__Group__37"


    // $ANTLR start "rule__MarketPlace__Group__37__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: rule__MarketPlace__Group__37__Impl : ( RULE_LESS ) ;
    public final void rule__MarketPlace__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: RULE_LESS
            {
             before(grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_37()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__MarketPlace__Group__37__Impl3127); 
             after(grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_37()); 

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
    // $ANTLR end "rule__MarketPlace__Group__37__Impl"


    // $ANTLR start "rule__MarketPlace__Group__38"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: rule__MarketPlace__Group__38 : rule__MarketPlace__Group__38__Impl rule__MarketPlace__Group__39 ;
    public final void rule__MarketPlace__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( rule__MarketPlace__Group__38__Impl rule__MarketPlace__Group__39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:2: rule__MarketPlace__Group__38__Impl rule__MarketPlace__Group__39
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__38__Impl_in_rule__MarketPlace__Group__383156);
            rule__MarketPlace__Group__38__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__39_in_rule__MarketPlace__Group__383159);
            rule__MarketPlace__Group__39();

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
    // $ANTLR end "rule__MarketPlace__Group__38"


    // $ANTLR start "rule__MarketPlace__Group__38__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: rule__MarketPlace__Group__38__Impl : ( RULE_SLASH ) ;
    public final void rule__MarketPlace__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( ( RULE_SLASH ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( RULE_SLASH )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( RULE_SLASH )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: RULE_SLASH
            {
             before(grammarAccess.getMarketPlaceAccess().getSLASHTerminalRuleCall_38()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_rule__MarketPlace__Group__38__Impl3186); 
             after(grammarAccess.getMarketPlaceAccess().getSLASHTerminalRuleCall_38()); 

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
    // $ANTLR end "rule__MarketPlace__Group__38__Impl"


    // $ANTLR start "rule__MarketPlace__Group__39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: rule__MarketPlace__Group__39 : rule__MarketPlace__Group__39__Impl rule__MarketPlace__Group__40 ;
    public final void rule__MarketPlace__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( rule__MarketPlace__Group__39__Impl rule__MarketPlace__Group__40 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:2: rule__MarketPlace__Group__39__Impl rule__MarketPlace__Group__40
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__39__Impl_in_rule__MarketPlace__Group__393215);
            rule__MarketPlace__Group__39__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__40_in_rule__MarketPlace__Group__393218);
            rule__MarketPlace__Group__40();

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
    // $ANTLR end "rule__MarketPlace__Group__39"


    // $ANTLR start "rule__MarketPlace__Group__39__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: rule__MarketPlace__Group__39__Impl : ( RULE_TMARKETPLACE ) ;
    public final void rule__MarketPlace__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( ( RULE_TMARKETPLACE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( RULE_TMARKETPLACE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( RULE_TMARKETPLACE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: RULE_TMARKETPLACE
            {
             before(grammarAccess.getMarketPlaceAccess().getTMARKETPLACETerminalRuleCall_39()); 
            match(input,RULE_TMARKETPLACE,FollowSets000.FOLLOW_RULE_TMARKETPLACE_in_rule__MarketPlace__Group__39__Impl3245); 
             after(grammarAccess.getMarketPlaceAccess().getTMARKETPLACETerminalRuleCall_39()); 

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
    // $ANTLR end "rule__MarketPlace__Group__39__Impl"


    // $ANTLR start "rule__MarketPlace__Group__40"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: rule__MarketPlace__Group__40 : rule__MarketPlace__Group__40__Impl ;
    public final void rule__MarketPlace__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( rule__MarketPlace__Group__40__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:2: rule__MarketPlace__Group__40__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarketPlace__Group__40__Impl_in_rule__MarketPlace__Group__403274);
            rule__MarketPlace__Group__40__Impl();

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
    // $ANTLR end "rule__MarketPlace__Group__40"


    // $ANTLR start "rule__MarketPlace__Group__40__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: rule__MarketPlace__Group__40__Impl : ( RULE_GREATER ) ;
    public final void rule__MarketPlace__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: RULE_GREATER
            {
             before(grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_40()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__MarketPlace__Group__40__Impl3301); 
             after(grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_40()); 

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
    // $ANTLR end "rule__MarketPlace__Group__40__Impl"


    // $ANTLR start "rule__Promocion__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: rule__Promocion__Group__0 : rule__Promocion__Group__0__Impl rule__Promocion__Group__1 ;
    public final void rule__Promocion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( rule__Promocion__Group__0__Impl rule__Promocion__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:2: rule__Promocion__Group__0__Impl rule__Promocion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__0__Impl_in_rule__Promocion__Group__03412);
            rule__Promocion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__1_in_rule__Promocion__Group__03415);
            rule__Promocion__Group__1();

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
    // $ANTLR end "rule__Promocion__Group__0"


    // $ANTLR start "rule__Promocion__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: rule__Promocion__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__Promocion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: RULE_LESS
            {
             before(grammarAccess.getPromocionAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__Promocion__Group__0__Impl3442); 
             after(grammarAccess.getPromocionAccess().getLESSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Promocion__Group__0__Impl"


    // $ANTLR start "rule__Promocion__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: rule__Promocion__Group__1 : rule__Promocion__Group__1__Impl rule__Promocion__Group__2 ;
    public final void rule__Promocion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__Promocion__Group__1__Impl rule__Promocion__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:2: rule__Promocion__Group__1__Impl rule__Promocion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__1__Impl_in_rule__Promocion__Group__13471);
            rule__Promocion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__2_in_rule__Promocion__Group__13474);
            rule__Promocion__Group__2();

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
    // $ANTLR end "rule__Promocion__Group__1"


    // $ANTLR start "rule__Promocion__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: rule__Promocion__Group__1__Impl : ( RULE_TPAGINAS ) ;
    public final void rule__Promocion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: ( ( RULE_TPAGINAS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( RULE_TPAGINAS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( RULE_TPAGINAS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: RULE_TPAGINAS
            {
             before(grammarAccess.getPromocionAccess().getTPAGINASTerminalRuleCall_1()); 
            match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_rule__Promocion__Group__1__Impl3501); 
             after(grammarAccess.getPromocionAccess().getTPAGINASTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Promocion__Group__1__Impl"


    // $ANTLR start "rule__Promocion__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: rule__Promocion__Group__2 : rule__Promocion__Group__2__Impl rule__Promocion__Group__3 ;
    public final void rule__Promocion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__Promocion__Group__2__Impl rule__Promocion__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:2: rule__Promocion__Group__2__Impl rule__Promocion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__2__Impl_in_rule__Promocion__Group__23530);
            rule__Promocion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__3_in_rule__Promocion__Group__23533);
            rule__Promocion__Group__3();

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
    // $ANTLR end "rule__Promocion__Group__2"


    // $ANTLR start "rule__Promocion__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:1: rule__Promocion__Group__2__Impl : ( 'xsi:type=\"proyectos:Promocion\"' ) ;
    public final void rule__Promocion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( ( 'xsi:type=\"proyectos:Promocion\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( 'xsi:type=\"proyectos:Promocion\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( 'xsi:type=\"proyectos:Promocion\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: 'xsi:type=\"proyectos:Promocion\"'
            {
             before(grammarAccess.getPromocionAccess().getXsiTypeProyectosPromocionKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Promocion__Group__2__Impl3561); 
             after(grammarAccess.getPromocionAccess().getXsiTypeProyectosPromocionKeyword_2()); 

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
    // $ANTLR end "rule__Promocion__Group__2__Impl"


    // $ANTLR start "rule__Promocion__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: rule__Promocion__Group__3 : rule__Promocion__Group__3__Impl rule__Promocion__Group__4 ;
    public final void rule__Promocion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( rule__Promocion__Group__3__Impl rule__Promocion__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:2: rule__Promocion__Group__3__Impl rule__Promocion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__3__Impl_in_rule__Promocion__Group__33592);
            rule__Promocion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__4_in_rule__Promocion__Group__33595);
            rule__Promocion__Group__4();

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
    // $ANTLR end "rule__Promocion__Group__3"


    // $ANTLR start "rule__Promocion__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: rule__Promocion__Group__3__Impl : ( 'nombre' ) ;
    public final void rule__Promocion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( 'nombre' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( 'nombre' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( 'nombre' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: 'nombre'
            {
             before(grammarAccess.getPromocionAccess().getNombreKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Promocion__Group__3__Impl3623); 
             after(grammarAccess.getPromocionAccess().getNombreKeyword_3()); 

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
    // $ANTLR end "rule__Promocion__Group__3__Impl"


    // $ANTLR start "rule__Promocion__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: rule__Promocion__Group__4 : rule__Promocion__Group__4__Impl rule__Promocion__Group__5 ;
    public final void rule__Promocion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: ( rule__Promocion__Group__4__Impl rule__Promocion__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:2: rule__Promocion__Group__4__Impl rule__Promocion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__4__Impl_in_rule__Promocion__Group__43654);
            rule__Promocion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__5_in_rule__Promocion__Group__43657);
            rule__Promocion__Group__5();

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
    // $ANTLR end "rule__Promocion__Group__4"


    // $ANTLR start "rule__Promocion__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__Promocion__Group__4__Impl : ( RULE_EQUALS ) ;
    public final void rule__Promocion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: RULE_EQUALS
            {
             before(grammarAccess.getPromocionAccess().getEQUALSTerminalRuleCall_4()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Promocion__Group__4__Impl3684); 
             after(grammarAccess.getPromocionAccess().getEQUALSTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Promocion__Group__4__Impl"


    // $ANTLR start "rule__Promocion__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: rule__Promocion__Group__5 : rule__Promocion__Group__5__Impl rule__Promocion__Group__6 ;
    public final void rule__Promocion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( rule__Promocion__Group__5__Impl rule__Promocion__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:2: rule__Promocion__Group__5__Impl rule__Promocion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__5__Impl_in_rule__Promocion__Group__53713);
            rule__Promocion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__6_in_rule__Promocion__Group__53716);
            rule__Promocion__Group__6();

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
    // $ANTLR end "rule__Promocion__Group__5"


    // $ANTLR start "rule__Promocion__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: rule__Promocion__Group__5__Impl : ( ( rule__Promocion__NombreAssignment_5 ) ) ;
    public final void rule__Promocion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: ( ( ( rule__Promocion__NombreAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( ( rule__Promocion__NombreAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( ( rule__Promocion__NombreAssignment_5 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( rule__Promocion__NombreAssignment_5 )
            {
             before(grammarAccess.getPromocionAccess().getNombreAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( rule__Promocion__NombreAssignment_5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:2: rule__Promocion__NombreAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__NombreAssignment_5_in_rule__Promocion__Group__5__Impl3743);
            rule__Promocion__NombreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPromocionAccess().getNombreAssignment_5()); 

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
    // $ANTLR end "rule__Promocion__Group__5__Impl"


    // $ANTLR start "rule__Promocion__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: rule__Promocion__Group__6 : rule__Promocion__Group__6__Impl rule__Promocion__Group__7 ;
    public final void rule__Promocion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( rule__Promocion__Group__6__Impl rule__Promocion__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:2: rule__Promocion__Group__6__Impl rule__Promocion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__6__Impl_in_rule__Promocion__Group__63773);
            rule__Promocion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__7_in_rule__Promocion__Group__63776);
            rule__Promocion__Group__7();

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
    // $ANTLR end "rule__Promocion__Group__6"


    // $ANTLR start "rule__Promocion__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: rule__Promocion__Group__6__Impl : ( 'estilo' ) ;
    public final void rule__Promocion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: ( ( 'estilo' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: ( 'estilo' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: ( 'estilo' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: 'estilo'
            {
             before(grammarAccess.getPromocionAccess().getEstiloKeyword_6()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Promocion__Group__6__Impl3804); 
             after(grammarAccess.getPromocionAccess().getEstiloKeyword_6()); 

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
    // $ANTLR end "rule__Promocion__Group__6__Impl"


    // $ANTLR start "rule__Promocion__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: rule__Promocion__Group__7 : rule__Promocion__Group__7__Impl rule__Promocion__Group__8 ;
    public final void rule__Promocion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( rule__Promocion__Group__7__Impl rule__Promocion__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:2: rule__Promocion__Group__7__Impl rule__Promocion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__7__Impl_in_rule__Promocion__Group__73835);
            rule__Promocion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__8_in_rule__Promocion__Group__73838);
            rule__Promocion__Group__8();

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
    // $ANTLR end "rule__Promocion__Group__7"


    // $ANTLR start "rule__Promocion__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: rule__Promocion__Group__7__Impl : ( RULE_EQUALS ) ;
    public final void rule__Promocion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: RULE_EQUALS
            {
             before(grammarAccess.getPromocionAccess().getEQUALSTerminalRuleCall_7()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Promocion__Group__7__Impl3865); 
             after(grammarAccess.getPromocionAccess().getEQUALSTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Promocion__Group__7__Impl"


    // $ANTLR start "rule__Promocion__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: rule__Promocion__Group__8 : rule__Promocion__Group__8__Impl rule__Promocion__Group__9 ;
    public final void rule__Promocion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( rule__Promocion__Group__8__Impl rule__Promocion__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:2: rule__Promocion__Group__8__Impl rule__Promocion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__8__Impl_in_rule__Promocion__Group__83894);
            rule__Promocion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__9_in_rule__Promocion__Group__83897);
            rule__Promocion__Group__9();

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
    // $ANTLR end "rule__Promocion__Group__8"


    // $ANTLR start "rule__Promocion__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__Promocion__Group__8__Impl : ( ( rule__Promocion__EstiloAssignment_8 ) ) ;
    public final void rule__Promocion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( ( ( rule__Promocion__EstiloAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ( rule__Promocion__EstiloAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ( rule__Promocion__EstiloAssignment_8 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ( rule__Promocion__EstiloAssignment_8 )
            {
             before(grammarAccess.getPromocionAccess().getEstiloAssignment_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ( rule__Promocion__EstiloAssignment_8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:2: rule__Promocion__EstiloAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__EstiloAssignment_8_in_rule__Promocion__Group__8__Impl3924);
            rule__Promocion__EstiloAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPromocionAccess().getEstiloAssignment_8()); 

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
    // $ANTLR end "rule__Promocion__Group__8__Impl"


    // $ANTLR start "rule__Promocion__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: rule__Promocion__Group__9 : rule__Promocion__Group__9__Impl rule__Promocion__Group__10 ;
    public final void rule__Promocion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( rule__Promocion__Group__9__Impl rule__Promocion__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:2: rule__Promocion__Group__9__Impl rule__Promocion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__9__Impl_in_rule__Promocion__Group__93954);
            rule__Promocion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__10_in_rule__Promocion__Group__93957);
            rule__Promocion__Group__10();

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
    // $ANTLR end "rule__Promocion__Group__9"


    // $ANTLR start "rule__Promocion__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: rule__Promocion__Group__9__Impl : ( RULE_SLASH ) ;
    public final void rule__Promocion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ( ( RULE_SLASH ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( RULE_SLASH )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( RULE_SLASH )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: RULE_SLASH
            {
             before(grammarAccess.getPromocionAccess().getSLASHTerminalRuleCall_9()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_rule__Promocion__Group__9__Impl3984); 
             after(grammarAccess.getPromocionAccess().getSLASHTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Promocion__Group__9__Impl"


    // $ANTLR start "rule__Promocion__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: rule__Promocion__Group__10 : rule__Promocion__Group__10__Impl ;
    public final void rule__Promocion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ( rule__Promocion__Group__10__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:2: rule__Promocion__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Promocion__Group__10__Impl_in_rule__Promocion__Group__104013);
            rule__Promocion__Group__10__Impl();

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
    // $ANTLR end "rule__Promocion__Group__10"


    // $ANTLR start "rule__Promocion__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: rule__Promocion__Group__10__Impl : ( RULE_GREATER ) ;
    public final void rule__Promocion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: RULE_GREATER
            {
             before(grammarAccess.getPromocionAccess().getGREATERTerminalRuleCall_10()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__Promocion__Group__10__Impl4040); 
             after(grammarAccess.getPromocionAccess().getGREATERTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Promocion__Group__10__Impl"


    // $ANTLR start "rule__Mapa__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__0__Impl_in_rule__Mapa__Group__04091);
            rule__Mapa__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__1_in_rule__Mapa__Group__04094);
            rule__Mapa__Group__1();

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
    // $ANTLR end "rule__Mapa__Group__0"


    // $ANTLR start "rule__Mapa__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: rule__Mapa__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: RULE_LESS
            {
             before(grammarAccess.getMapaAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__Mapa__Group__0__Impl4121); 
             after(grammarAccess.getMapaAccess().getLESSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Mapa__Group__0__Impl"


    // $ANTLR start "rule__Mapa__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__1__Impl_in_rule__Mapa__Group__14150);
            rule__Mapa__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__2_in_rule__Mapa__Group__14153);
            rule__Mapa__Group__2();

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
    // $ANTLR end "rule__Mapa__Group__1"


    // $ANTLR start "rule__Mapa__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__Mapa__Group__1__Impl : ( RULE_TPAGINAS ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( ( RULE_TPAGINAS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( RULE_TPAGINAS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( RULE_TPAGINAS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: RULE_TPAGINAS
            {
             before(grammarAccess.getMapaAccess().getTPAGINASTerminalRuleCall_1()); 
            match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_rule__Mapa__Group__1__Impl4180); 
             after(grammarAccess.getMapaAccess().getTPAGINASTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Mapa__Group__1__Impl"


    // $ANTLR start "rule__Mapa__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__2__Impl_in_rule__Mapa__Group__24209);
            rule__Mapa__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__3_in_rule__Mapa__Group__24212);
            rule__Mapa__Group__3();

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
    // $ANTLR end "rule__Mapa__Group__2"


    // $ANTLR start "rule__Mapa__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: rule__Mapa__Group__2__Impl : ( 'xsi:type=\"proyectos:Mapa\"' ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( 'xsi:type=\"proyectos:Mapa\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( 'xsi:type=\"proyectos:Mapa\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( 'xsi:type=\"proyectos:Mapa\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: 'xsi:type=\"proyectos:Mapa\"'
            {
             before(grammarAccess.getMapaAccess().getXsiTypeProyectosMapaKeyword_2()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Mapa__Group__2__Impl4240); 
             after(grammarAccess.getMapaAccess().getXsiTypeProyectosMapaKeyword_2()); 

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
    // $ANTLR end "rule__Mapa__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__3__Impl_in_rule__Mapa__Group__34271);
            rule__Mapa__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__4_in_rule__Mapa__Group__34274);
            rule__Mapa__Group__4();

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
    // $ANTLR end "rule__Mapa__Group__3"


    // $ANTLR start "rule__Mapa__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: rule__Mapa__Group__3__Impl : ( 'nombre' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( ( 'nombre' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( 'nombre' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( 'nombre' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: 'nombre'
            {
             before(grammarAccess.getMapaAccess().getNombreKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Mapa__Group__3__Impl4302); 
             after(grammarAccess.getMapaAccess().getNombreKeyword_3()); 

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
    // $ANTLR end "rule__Mapa__Group__3__Impl"


    // $ANTLR start "rule__Mapa__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__4__Impl_in_rule__Mapa__Group__44333);
            rule__Mapa__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__5_in_rule__Mapa__Group__44336);
            rule__Mapa__Group__5();

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
    // $ANTLR end "rule__Mapa__Group__4"


    // $ANTLR start "rule__Mapa__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: rule__Mapa__Group__4__Impl : ( RULE_EQUALS ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: RULE_EQUALS
            {
             before(grammarAccess.getMapaAccess().getEQUALSTerminalRuleCall_4()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Mapa__Group__4__Impl4363); 
             after(grammarAccess.getMapaAccess().getEQUALSTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Mapa__Group__4__Impl"


    // $ANTLR start "rule__Mapa__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__5__Impl_in_rule__Mapa__Group__54392);
            rule__Mapa__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__6_in_rule__Mapa__Group__54395);
            rule__Mapa__Group__6();

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
    // $ANTLR end "rule__Mapa__Group__5"


    // $ANTLR start "rule__Mapa__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: rule__Mapa__Group__5__Impl : ( ( rule__Mapa__NombreAssignment_5 ) ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( ( ( rule__Mapa__NombreAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( ( rule__Mapa__NombreAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( ( rule__Mapa__NombreAssignment_5 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( rule__Mapa__NombreAssignment_5 )
            {
             before(grammarAccess.getMapaAccess().getNombreAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( rule__Mapa__NombreAssignment_5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:2: rule__Mapa__NombreAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__NombreAssignment_5_in_rule__Mapa__Group__5__Impl4422);
            rule__Mapa__NombreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getNombreAssignment_5()); 

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
    // $ANTLR end "rule__Mapa__Group__5__Impl"


    // $ANTLR start "rule__Mapa__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__6__Impl_in_rule__Mapa__Group__64452);
            rule__Mapa__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__7_in_rule__Mapa__Group__64455);
            rule__Mapa__Group__7();

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
    // $ANTLR end "rule__Mapa__Group__6"


    // $ANTLR start "rule__Mapa__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__Mapa__Group__6__Impl : ( 'estilo' ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( ( 'estilo' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( 'estilo' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( 'estilo' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: 'estilo'
            {
             before(grammarAccess.getMapaAccess().getEstiloKeyword_6()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Mapa__Group__6__Impl4483); 
             after(grammarAccess.getMapaAccess().getEstiloKeyword_6()); 

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
    // $ANTLR end "rule__Mapa__Group__6__Impl"


    // $ANTLR start "rule__Mapa__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl rule__Mapa__Group__8 ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( rule__Mapa__Group__7__Impl rule__Mapa__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:2: rule__Mapa__Group__7__Impl rule__Mapa__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__7__Impl_in_rule__Mapa__Group__74514);
            rule__Mapa__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__8_in_rule__Mapa__Group__74517);
            rule__Mapa__Group__8();

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
    // $ANTLR end "rule__Mapa__Group__7"


    // $ANTLR start "rule__Mapa__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: rule__Mapa__Group__7__Impl : ( RULE_EQUALS ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: RULE_EQUALS
            {
             before(grammarAccess.getMapaAccess().getEQUALSTerminalRuleCall_7()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Mapa__Group__7__Impl4544); 
             after(grammarAccess.getMapaAccess().getEQUALSTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Mapa__Group__7__Impl"


    // $ANTLR start "rule__Mapa__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: rule__Mapa__Group__8 : rule__Mapa__Group__8__Impl rule__Mapa__Group__9 ;
    public final void rule__Mapa__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( rule__Mapa__Group__8__Impl rule__Mapa__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:2: rule__Mapa__Group__8__Impl rule__Mapa__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__8__Impl_in_rule__Mapa__Group__84573);
            rule__Mapa__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__9_in_rule__Mapa__Group__84576);
            rule__Mapa__Group__9();

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
    // $ANTLR end "rule__Mapa__Group__8"


    // $ANTLR start "rule__Mapa__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: rule__Mapa__Group__8__Impl : ( ( rule__Mapa__EstiloAssignment_8 ) ) ;
    public final void rule__Mapa__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( ( ( rule__Mapa__EstiloAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( ( rule__Mapa__EstiloAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( ( rule__Mapa__EstiloAssignment_8 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( rule__Mapa__EstiloAssignment_8 )
            {
             before(grammarAccess.getMapaAccess().getEstiloAssignment_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( rule__Mapa__EstiloAssignment_8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:2: rule__Mapa__EstiloAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__EstiloAssignment_8_in_rule__Mapa__Group__8__Impl4603);
            rule__Mapa__EstiloAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getEstiloAssignment_8()); 

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
    // $ANTLR end "rule__Mapa__Group__8__Impl"


    // $ANTLR start "rule__Mapa__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: rule__Mapa__Group__9 : rule__Mapa__Group__9__Impl rule__Mapa__Group__10 ;
    public final void rule__Mapa__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: ( rule__Mapa__Group__9__Impl rule__Mapa__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:2: rule__Mapa__Group__9__Impl rule__Mapa__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__9__Impl_in_rule__Mapa__Group__94633);
            rule__Mapa__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__10_in_rule__Mapa__Group__94636);
            rule__Mapa__Group__10();

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
    // $ANTLR end "rule__Mapa__Group__9"


    // $ANTLR start "rule__Mapa__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: rule__Mapa__Group__9__Impl : ( RULE_SLASH ) ;
    public final void rule__Mapa__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: ( ( RULE_SLASH ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: ( RULE_SLASH )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: ( RULE_SLASH )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: RULE_SLASH
            {
             before(grammarAccess.getMapaAccess().getSLASHTerminalRuleCall_9()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_rule__Mapa__Group__9__Impl4663); 
             after(grammarAccess.getMapaAccess().getSLASHTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Mapa__Group__9__Impl"


    // $ANTLR start "rule__Mapa__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: rule__Mapa__Group__10 : rule__Mapa__Group__10__Impl ;
    public final void rule__Mapa__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( rule__Mapa__Group__10__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:2: rule__Mapa__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mapa__Group__10__Impl_in_rule__Mapa__Group__104692);
            rule__Mapa__Group__10__Impl();

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
    // $ANTLR end "rule__Mapa__Group__10"


    // $ANTLR start "rule__Mapa__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: rule__Mapa__Group__10__Impl : ( RULE_GREATER ) ;
    public final void rule__Mapa__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:1: RULE_GREATER
            {
             before(grammarAccess.getMapaAccess().getGREATERTerminalRuleCall_10()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__Mapa__Group__10__Impl4719); 
             after(grammarAccess.getMapaAccess().getGREATERTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Mapa__Group__10__Impl"


    // $ANTLR start "rule__Contacto__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: rule__Contacto__Group__0 : rule__Contacto__Group__0__Impl rule__Contacto__Group__1 ;
    public final void rule__Contacto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__Contacto__Group__0__Impl rule__Contacto__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:2: rule__Contacto__Group__0__Impl rule__Contacto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__0__Impl_in_rule__Contacto__Group__04770);
            rule__Contacto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__1_in_rule__Contacto__Group__04773);
            rule__Contacto__Group__1();

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
    // $ANTLR end "rule__Contacto__Group__0"


    // $ANTLR start "rule__Contacto__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: rule__Contacto__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__Contacto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: RULE_LESS
            {
             before(grammarAccess.getContactoAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__Contacto__Group__0__Impl4800); 
             after(grammarAccess.getContactoAccess().getLESSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Contacto__Group__0__Impl"


    // $ANTLR start "rule__Contacto__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: rule__Contacto__Group__1 : rule__Contacto__Group__1__Impl rule__Contacto__Group__2 ;
    public final void rule__Contacto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: ( rule__Contacto__Group__1__Impl rule__Contacto__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:2: rule__Contacto__Group__1__Impl rule__Contacto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__1__Impl_in_rule__Contacto__Group__14829);
            rule__Contacto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__2_in_rule__Contacto__Group__14832);
            rule__Contacto__Group__2();

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
    // $ANTLR end "rule__Contacto__Group__1"


    // $ANTLR start "rule__Contacto__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: rule__Contacto__Group__1__Impl : ( RULE_TPAGINAS ) ;
    public final void rule__Contacto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ( RULE_TPAGINAS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( RULE_TPAGINAS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( RULE_TPAGINAS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: RULE_TPAGINAS
            {
             before(grammarAccess.getContactoAccess().getTPAGINASTerminalRuleCall_1()); 
            match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_rule__Contacto__Group__1__Impl4859); 
             after(grammarAccess.getContactoAccess().getTPAGINASTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Contacto__Group__1__Impl"


    // $ANTLR start "rule__Contacto__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: rule__Contacto__Group__2 : rule__Contacto__Group__2__Impl rule__Contacto__Group__3 ;
    public final void rule__Contacto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( rule__Contacto__Group__2__Impl rule__Contacto__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:2: rule__Contacto__Group__2__Impl rule__Contacto__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__2__Impl_in_rule__Contacto__Group__24888);
            rule__Contacto__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__3_in_rule__Contacto__Group__24891);
            rule__Contacto__Group__3();

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
    // $ANTLR end "rule__Contacto__Group__2"


    // $ANTLR start "rule__Contacto__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: rule__Contacto__Group__2__Impl : ( 'xsi:type=\"proyectos:Contacto\"' ) ;
    public final void rule__Contacto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( ( 'xsi:type=\"proyectos:Contacto\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( 'xsi:type=\"proyectos:Contacto\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( 'xsi:type=\"proyectos:Contacto\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: 'xsi:type=\"proyectos:Contacto\"'
            {
             before(grammarAccess.getContactoAccess().getXsiTypeProyectosContactoKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Contacto__Group__2__Impl4919); 
             after(grammarAccess.getContactoAccess().getXsiTypeProyectosContactoKeyword_2()); 

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
    // $ANTLR end "rule__Contacto__Group__2__Impl"


    // $ANTLR start "rule__Contacto__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: rule__Contacto__Group__3 : rule__Contacto__Group__3__Impl rule__Contacto__Group__4 ;
    public final void rule__Contacto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( rule__Contacto__Group__3__Impl rule__Contacto__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:2: rule__Contacto__Group__3__Impl rule__Contacto__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__3__Impl_in_rule__Contacto__Group__34950);
            rule__Contacto__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__4_in_rule__Contacto__Group__34953);
            rule__Contacto__Group__4();

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
    // $ANTLR end "rule__Contacto__Group__3"


    // $ANTLR start "rule__Contacto__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: rule__Contacto__Group__3__Impl : ( 'nombre' ) ;
    public final void rule__Contacto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ( 'nombre' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( 'nombre' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( 'nombre' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: 'nombre'
            {
             before(grammarAccess.getContactoAccess().getNombreKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Contacto__Group__3__Impl4981); 
             after(grammarAccess.getContactoAccess().getNombreKeyword_3()); 

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
    // $ANTLR end "rule__Contacto__Group__3__Impl"


    // $ANTLR start "rule__Contacto__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: rule__Contacto__Group__4 : rule__Contacto__Group__4__Impl rule__Contacto__Group__5 ;
    public final void rule__Contacto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( rule__Contacto__Group__4__Impl rule__Contacto__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:2: rule__Contacto__Group__4__Impl rule__Contacto__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__4__Impl_in_rule__Contacto__Group__45012);
            rule__Contacto__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__5_in_rule__Contacto__Group__45015);
            rule__Contacto__Group__5();

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
    // $ANTLR end "rule__Contacto__Group__4"


    // $ANTLR start "rule__Contacto__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: rule__Contacto__Group__4__Impl : ( RULE_EQUALS ) ;
    public final void rule__Contacto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: RULE_EQUALS
            {
             before(grammarAccess.getContactoAccess().getEQUALSTerminalRuleCall_4()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Contacto__Group__4__Impl5042); 
             after(grammarAccess.getContactoAccess().getEQUALSTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Contacto__Group__4__Impl"


    // $ANTLR start "rule__Contacto__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: rule__Contacto__Group__5 : rule__Contacto__Group__5__Impl rule__Contacto__Group__6 ;
    public final void rule__Contacto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( rule__Contacto__Group__5__Impl rule__Contacto__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:2: rule__Contacto__Group__5__Impl rule__Contacto__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__5__Impl_in_rule__Contacto__Group__55071);
            rule__Contacto__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__6_in_rule__Contacto__Group__55074);
            rule__Contacto__Group__6();

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
    // $ANTLR end "rule__Contacto__Group__5"


    // $ANTLR start "rule__Contacto__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: rule__Contacto__Group__5__Impl : ( ( rule__Contacto__NombreAssignment_5 ) ) ;
    public final void rule__Contacto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( ( ( rule__Contacto__NombreAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( ( rule__Contacto__NombreAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( ( rule__Contacto__NombreAssignment_5 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( rule__Contacto__NombreAssignment_5 )
            {
             before(grammarAccess.getContactoAccess().getNombreAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( rule__Contacto__NombreAssignment_5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__Contacto__NombreAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__NombreAssignment_5_in_rule__Contacto__Group__5__Impl5101);
            rule__Contacto__NombreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContactoAccess().getNombreAssignment_5()); 

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
    // $ANTLR end "rule__Contacto__Group__5__Impl"


    // $ANTLR start "rule__Contacto__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: rule__Contacto__Group__6 : rule__Contacto__Group__6__Impl rule__Contacto__Group__7 ;
    public final void rule__Contacto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( rule__Contacto__Group__6__Impl rule__Contacto__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:2: rule__Contacto__Group__6__Impl rule__Contacto__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__6__Impl_in_rule__Contacto__Group__65131);
            rule__Contacto__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__7_in_rule__Contacto__Group__65134);
            rule__Contacto__Group__7();

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
    // $ANTLR end "rule__Contacto__Group__6"


    // $ANTLR start "rule__Contacto__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: rule__Contacto__Group__6__Impl : ( 'estilo' ) ;
    public final void rule__Contacto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: ( ( 'estilo' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( 'estilo' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( 'estilo' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: 'estilo'
            {
             before(grammarAccess.getContactoAccess().getEstiloKeyword_6()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Contacto__Group__6__Impl5162); 
             after(grammarAccess.getContactoAccess().getEstiloKeyword_6()); 

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
    // $ANTLR end "rule__Contacto__Group__6__Impl"


    // $ANTLR start "rule__Contacto__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: rule__Contacto__Group__7 : rule__Contacto__Group__7__Impl rule__Contacto__Group__8 ;
    public final void rule__Contacto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( rule__Contacto__Group__7__Impl rule__Contacto__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:2: rule__Contacto__Group__7__Impl rule__Contacto__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__7__Impl_in_rule__Contacto__Group__75193);
            rule__Contacto__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__8_in_rule__Contacto__Group__75196);
            rule__Contacto__Group__8();

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
    // $ANTLR end "rule__Contacto__Group__7"


    // $ANTLR start "rule__Contacto__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: rule__Contacto__Group__7__Impl : ( RULE_EQUALS ) ;
    public final void rule__Contacto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: RULE_EQUALS
            {
             before(grammarAccess.getContactoAccess().getEQUALSTerminalRuleCall_7()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Contacto__Group__7__Impl5223); 
             after(grammarAccess.getContactoAccess().getEQUALSTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Contacto__Group__7__Impl"


    // $ANTLR start "rule__Contacto__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: rule__Contacto__Group__8 : rule__Contacto__Group__8__Impl rule__Contacto__Group__9 ;
    public final void rule__Contacto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( rule__Contacto__Group__8__Impl rule__Contacto__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:2: rule__Contacto__Group__8__Impl rule__Contacto__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__8__Impl_in_rule__Contacto__Group__85252);
            rule__Contacto__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__9_in_rule__Contacto__Group__85255);
            rule__Contacto__Group__9();

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
    // $ANTLR end "rule__Contacto__Group__8"


    // $ANTLR start "rule__Contacto__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: rule__Contacto__Group__8__Impl : ( ( rule__Contacto__EstiloAssignment_8 ) ) ;
    public final void rule__Contacto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ( ( rule__Contacto__EstiloAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ( ( rule__Contacto__EstiloAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ( ( rule__Contacto__EstiloAssignment_8 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( rule__Contacto__EstiloAssignment_8 )
            {
             before(grammarAccess.getContactoAccess().getEstiloAssignment_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( rule__Contacto__EstiloAssignment_8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:2: rule__Contacto__EstiloAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__EstiloAssignment_8_in_rule__Contacto__Group__8__Impl5282);
            rule__Contacto__EstiloAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContactoAccess().getEstiloAssignment_8()); 

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
    // $ANTLR end "rule__Contacto__Group__8__Impl"


    // $ANTLR start "rule__Contacto__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: rule__Contacto__Group__9 : rule__Contacto__Group__9__Impl rule__Contacto__Group__10 ;
    public final void rule__Contacto__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( rule__Contacto__Group__9__Impl rule__Contacto__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:2: rule__Contacto__Group__9__Impl rule__Contacto__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__9__Impl_in_rule__Contacto__Group__95312);
            rule__Contacto__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__10_in_rule__Contacto__Group__95315);
            rule__Contacto__Group__10();

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
    // $ANTLR end "rule__Contacto__Group__9"


    // $ANTLR start "rule__Contacto__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: rule__Contacto__Group__9__Impl : ( RULE_SLASH ) ;
    public final void rule__Contacto__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ( RULE_SLASH ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( RULE_SLASH )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( RULE_SLASH )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: RULE_SLASH
            {
             before(grammarAccess.getContactoAccess().getSLASHTerminalRuleCall_9()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_rule__Contacto__Group__9__Impl5342); 
             after(grammarAccess.getContactoAccess().getSLASHTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Contacto__Group__9__Impl"


    // $ANTLR start "rule__Contacto__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: rule__Contacto__Group__10 : rule__Contacto__Group__10__Impl ;
    public final void rule__Contacto__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: ( rule__Contacto__Group__10__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:2: rule__Contacto__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacto__Group__10__Impl_in_rule__Contacto__Group__105371);
            rule__Contacto__Group__10__Impl();

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
    // $ANTLR end "rule__Contacto__Group__10"


    // $ANTLR start "rule__Contacto__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: rule__Contacto__Group__10__Impl : ( RULE_GREATER ) ;
    public final void rule__Contacto__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: RULE_GREATER
            {
             before(grammarAccess.getContactoAccess().getGREATERTerminalRuleCall_10()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__Contacto__Group__10__Impl5398); 
             after(grammarAccess.getContactoAccess().getGREATERTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Contacto__Group__10__Impl"


    // $ANTLR start "rule__Catalogo__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: rule__Catalogo__Group__0 : rule__Catalogo__Group__0__Impl rule__Catalogo__Group__1 ;
    public final void rule__Catalogo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( rule__Catalogo__Group__0__Impl rule__Catalogo__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:2: rule__Catalogo__Group__0__Impl rule__Catalogo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__0__Impl_in_rule__Catalogo__Group__05449);
            rule__Catalogo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__1_in_rule__Catalogo__Group__05452);
            rule__Catalogo__Group__1();

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
    // $ANTLR end "rule__Catalogo__Group__0"


    // $ANTLR start "rule__Catalogo__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: rule__Catalogo__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__Catalogo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: ( ( RULE_LESS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:1: ( RULE_LESS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:1: ( RULE_LESS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: RULE_LESS
            {
             before(grammarAccess.getCatalogoAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rule__Catalogo__Group__0__Impl5479); 
             after(grammarAccess.getCatalogoAccess().getLESSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Catalogo__Group__0__Impl"


    // $ANTLR start "rule__Catalogo__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: rule__Catalogo__Group__1 : rule__Catalogo__Group__1__Impl rule__Catalogo__Group__2 ;
    public final void rule__Catalogo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( rule__Catalogo__Group__1__Impl rule__Catalogo__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:2: rule__Catalogo__Group__1__Impl rule__Catalogo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__1__Impl_in_rule__Catalogo__Group__15508);
            rule__Catalogo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__2_in_rule__Catalogo__Group__15511);
            rule__Catalogo__Group__2();

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
    // $ANTLR end "rule__Catalogo__Group__1"


    // $ANTLR start "rule__Catalogo__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: rule__Catalogo__Group__1__Impl : ( RULE_TPAGINAS ) ;
    public final void rule__Catalogo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: ( ( RULE_TPAGINAS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( RULE_TPAGINAS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( RULE_TPAGINAS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: RULE_TPAGINAS
            {
             before(grammarAccess.getCatalogoAccess().getTPAGINASTerminalRuleCall_1()); 
            match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_rule__Catalogo__Group__1__Impl5538); 
             after(grammarAccess.getCatalogoAccess().getTPAGINASTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Catalogo__Group__1__Impl"


    // $ANTLR start "rule__Catalogo__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: rule__Catalogo__Group__2 : rule__Catalogo__Group__2__Impl rule__Catalogo__Group__3 ;
    public final void rule__Catalogo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( rule__Catalogo__Group__2__Impl rule__Catalogo__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:2: rule__Catalogo__Group__2__Impl rule__Catalogo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__2__Impl_in_rule__Catalogo__Group__25567);
            rule__Catalogo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__3_in_rule__Catalogo__Group__25570);
            rule__Catalogo__Group__3();

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
    // $ANTLR end "rule__Catalogo__Group__2"


    // $ANTLR start "rule__Catalogo__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: rule__Catalogo__Group__2__Impl : ( 'xsi:type=\"proyectos:Catalogo\"' ) ;
    public final void rule__Catalogo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( ( 'xsi:type=\"proyectos:Catalogo\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( 'xsi:type=\"proyectos:Catalogo\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( 'xsi:type=\"proyectos:Catalogo\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: 'xsi:type=\"proyectos:Catalogo\"'
            {
             before(grammarAccess.getCatalogoAccess().getXsiTypeProyectosCatalogoKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Catalogo__Group__2__Impl5598); 
             after(grammarAccess.getCatalogoAccess().getXsiTypeProyectosCatalogoKeyword_2()); 

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
    // $ANTLR end "rule__Catalogo__Group__2__Impl"


    // $ANTLR start "rule__Catalogo__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: rule__Catalogo__Group__3 : rule__Catalogo__Group__3__Impl rule__Catalogo__Group__4 ;
    public final void rule__Catalogo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( rule__Catalogo__Group__3__Impl rule__Catalogo__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:2: rule__Catalogo__Group__3__Impl rule__Catalogo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__3__Impl_in_rule__Catalogo__Group__35629);
            rule__Catalogo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__4_in_rule__Catalogo__Group__35632);
            rule__Catalogo__Group__4();

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
    // $ANTLR end "rule__Catalogo__Group__3"


    // $ANTLR start "rule__Catalogo__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: rule__Catalogo__Group__3__Impl : ( 'nombre' ) ;
    public final void rule__Catalogo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( ( 'nombre' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( 'nombre' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( 'nombre' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: 'nombre'
            {
             before(grammarAccess.getCatalogoAccess().getNombreKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Catalogo__Group__3__Impl5660); 
             after(grammarAccess.getCatalogoAccess().getNombreKeyword_3()); 

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
    // $ANTLR end "rule__Catalogo__Group__3__Impl"


    // $ANTLR start "rule__Catalogo__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: rule__Catalogo__Group__4 : rule__Catalogo__Group__4__Impl rule__Catalogo__Group__5 ;
    public final void rule__Catalogo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( rule__Catalogo__Group__4__Impl rule__Catalogo__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:2: rule__Catalogo__Group__4__Impl rule__Catalogo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__4__Impl_in_rule__Catalogo__Group__45691);
            rule__Catalogo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__5_in_rule__Catalogo__Group__45694);
            rule__Catalogo__Group__5();

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
    // $ANTLR end "rule__Catalogo__Group__4"


    // $ANTLR start "rule__Catalogo__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: rule__Catalogo__Group__4__Impl : ( RULE_EQUALS ) ;
    public final void rule__Catalogo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: RULE_EQUALS
            {
             before(grammarAccess.getCatalogoAccess().getEQUALSTerminalRuleCall_4()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Catalogo__Group__4__Impl5721); 
             after(grammarAccess.getCatalogoAccess().getEQUALSTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Catalogo__Group__4__Impl"


    // $ANTLR start "rule__Catalogo__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: rule__Catalogo__Group__5 : rule__Catalogo__Group__5__Impl rule__Catalogo__Group__6 ;
    public final void rule__Catalogo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( rule__Catalogo__Group__5__Impl rule__Catalogo__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:2: rule__Catalogo__Group__5__Impl rule__Catalogo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__5__Impl_in_rule__Catalogo__Group__55750);
            rule__Catalogo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__6_in_rule__Catalogo__Group__55753);
            rule__Catalogo__Group__6();

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
    // $ANTLR end "rule__Catalogo__Group__5"


    // $ANTLR start "rule__Catalogo__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: rule__Catalogo__Group__5__Impl : ( ( rule__Catalogo__NombreAssignment_5 ) ) ;
    public final void rule__Catalogo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( ( ( rule__Catalogo__NombreAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( ( rule__Catalogo__NombreAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( ( rule__Catalogo__NombreAssignment_5 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: ( rule__Catalogo__NombreAssignment_5 )
            {
             before(grammarAccess.getCatalogoAccess().getNombreAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( rule__Catalogo__NombreAssignment_5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:2: rule__Catalogo__NombreAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__NombreAssignment_5_in_rule__Catalogo__Group__5__Impl5780);
            rule__Catalogo__NombreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getNombreAssignment_5()); 

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
    // $ANTLR end "rule__Catalogo__Group__5__Impl"


    // $ANTLR start "rule__Catalogo__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: rule__Catalogo__Group__6 : rule__Catalogo__Group__6__Impl rule__Catalogo__Group__7 ;
    public final void rule__Catalogo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( rule__Catalogo__Group__6__Impl rule__Catalogo__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:2: rule__Catalogo__Group__6__Impl rule__Catalogo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__6__Impl_in_rule__Catalogo__Group__65810);
            rule__Catalogo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__7_in_rule__Catalogo__Group__65813);
            rule__Catalogo__Group__7();

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
    // $ANTLR end "rule__Catalogo__Group__6"


    // $ANTLR start "rule__Catalogo__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: rule__Catalogo__Group__6__Impl : ( 'estilo' ) ;
    public final void rule__Catalogo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2951:1: ( ( 'estilo' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: ( 'estilo' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: ( 'estilo' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: 'estilo'
            {
             before(grammarAccess.getCatalogoAccess().getEstiloKeyword_6()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Catalogo__Group__6__Impl5841); 
             after(grammarAccess.getCatalogoAccess().getEstiloKeyword_6()); 

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
    // $ANTLR end "rule__Catalogo__Group__6__Impl"


    // $ANTLR start "rule__Catalogo__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: rule__Catalogo__Group__7 : rule__Catalogo__Group__7__Impl rule__Catalogo__Group__8 ;
    public final void rule__Catalogo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( rule__Catalogo__Group__7__Impl rule__Catalogo__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:2: rule__Catalogo__Group__7__Impl rule__Catalogo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__7__Impl_in_rule__Catalogo__Group__75872);
            rule__Catalogo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__8_in_rule__Catalogo__Group__75875);
            rule__Catalogo__Group__8();

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
    // $ANTLR end "rule__Catalogo__Group__7"


    // $ANTLR start "rule__Catalogo__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: rule__Catalogo__Group__7__Impl : ( RULE_EQUALS ) ;
    public final void rule__Catalogo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( ( RULE_EQUALS ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( RULE_EQUALS )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( RULE_EQUALS )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: RULE_EQUALS
            {
             before(grammarAccess.getCatalogoAccess().getEQUALSTerminalRuleCall_7()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rule__Catalogo__Group__7__Impl5902); 
             after(grammarAccess.getCatalogoAccess().getEQUALSTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Catalogo__Group__7__Impl"


    // $ANTLR start "rule__Catalogo__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: rule__Catalogo__Group__8 : rule__Catalogo__Group__8__Impl rule__Catalogo__Group__9 ;
    public final void rule__Catalogo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:1: ( rule__Catalogo__Group__8__Impl rule__Catalogo__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:2: rule__Catalogo__Group__8__Impl rule__Catalogo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__8__Impl_in_rule__Catalogo__Group__85931);
            rule__Catalogo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__9_in_rule__Catalogo__Group__85934);
            rule__Catalogo__Group__9();

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
    // $ANTLR end "rule__Catalogo__Group__8"


    // $ANTLR start "rule__Catalogo__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: rule__Catalogo__Group__8__Impl : ( ( rule__Catalogo__EstiloAssignment_8 ) ) ;
    public final void rule__Catalogo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( ( ( rule__Catalogo__EstiloAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( ( rule__Catalogo__EstiloAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( ( rule__Catalogo__EstiloAssignment_8 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( rule__Catalogo__EstiloAssignment_8 )
            {
             before(grammarAccess.getCatalogoAccess().getEstiloAssignment_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( rule__Catalogo__EstiloAssignment_8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:2: rule__Catalogo__EstiloAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__EstiloAssignment_8_in_rule__Catalogo__Group__8__Impl5961);
            rule__Catalogo__EstiloAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getEstiloAssignment_8()); 

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
    // $ANTLR end "rule__Catalogo__Group__8__Impl"


    // $ANTLR start "rule__Catalogo__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: rule__Catalogo__Group__9 : rule__Catalogo__Group__9__Impl rule__Catalogo__Group__10 ;
    public final void rule__Catalogo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( rule__Catalogo__Group__9__Impl rule__Catalogo__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:2: rule__Catalogo__Group__9__Impl rule__Catalogo__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__9__Impl_in_rule__Catalogo__Group__95991);
            rule__Catalogo__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__10_in_rule__Catalogo__Group__95994);
            rule__Catalogo__Group__10();

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
    // $ANTLR end "rule__Catalogo__Group__9"


    // $ANTLR start "rule__Catalogo__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: rule__Catalogo__Group__9__Impl : ( RULE_SLASH ) ;
    public final void rule__Catalogo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( RULE_SLASH ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( RULE_SLASH )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( RULE_SLASH )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: RULE_SLASH
            {
             before(grammarAccess.getCatalogoAccess().getSLASHTerminalRuleCall_9()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_rule__Catalogo__Group__9__Impl6021); 
             after(grammarAccess.getCatalogoAccess().getSLASHTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Catalogo__Group__9__Impl"


    // $ANTLR start "rule__Catalogo__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: rule__Catalogo__Group__10 : rule__Catalogo__Group__10__Impl ;
    public final void rule__Catalogo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ( rule__Catalogo__Group__10__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:2: rule__Catalogo__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__10__Impl_in_rule__Catalogo__Group__106050);
            rule__Catalogo__Group__10__Impl();

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
    // $ANTLR end "rule__Catalogo__Group__10"


    // $ANTLR start "rule__Catalogo__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: rule__Catalogo__Group__10__Impl : ( RULE_GREATER ) ;
    public final void rule__Catalogo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( ( RULE_GREATER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( RULE_GREATER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( RULE_GREATER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: RULE_GREATER
            {
             before(grammarAccess.getCatalogoAccess().getGREATERTerminalRuleCall_10()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rule__Catalogo__Group__10__Impl6077); 
             after(grammarAccess.getCatalogoAccess().getGREATERTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Catalogo__Group__10__Impl"


    // $ANTLR start "rule__MarketPlace__NombreAssignment_31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: rule__MarketPlace__NombreAssignment_31 : ( ruleEString ) ;
    public final void rule__MarketPlace__NombreAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ruleEString
            {
             before(grammarAccess.getMarketPlaceAccess().getNombreEStringParserRuleCall_31_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MarketPlace__NombreAssignment_316133);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMarketPlaceAccess().getNombreEStringParserRuleCall_31_0()); 

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
    // $ANTLR end "rule__MarketPlace__NombreAssignment_31"


    // $ANTLR start "rule__MarketPlace__PresentacionAssignment_34"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: rule__MarketPlace__PresentacionAssignment_34 : ( ruleTipoPresentacion ) ;
    public final void rule__MarketPlace__PresentacionAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: ( ( ruleTipoPresentacion ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: ( ruleTipoPresentacion )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: ( ruleTipoPresentacion )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:1: ruleTipoPresentacion
            {
             before(grammarAccess.getMarketPlaceAccess().getPresentacionTipoPresentacionEnumRuleCall_34_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPresentacion_in_rule__MarketPlace__PresentacionAssignment_346164);
            ruleTipoPresentacion();

            state._fsp--;

             after(grammarAccess.getMarketPlaceAccess().getPresentacionTipoPresentacionEnumRuleCall_34_0()); 

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
    // $ANTLR end "rule__MarketPlace__PresentacionAssignment_34"


    // $ANTLR start "rule__MarketPlace__PaginasAssignment_36"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: rule__MarketPlace__PaginasAssignment_36 : ( rulePagina ) ;
    public final void rule__MarketPlace__PaginasAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ( ( rulePagina ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( rulePagina )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( rulePagina )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: rulePagina
            {
             before(grammarAccess.getMarketPlaceAccess().getPaginasPaginaParserRuleCall_36_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePagina_in_rule__MarketPlace__PaginasAssignment_366195);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getMarketPlaceAccess().getPaginasPaginaParserRuleCall_36_0()); 

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
    // $ANTLR end "rule__MarketPlace__PaginasAssignment_36"


    // $ANTLR start "rule__Promocion__NombreAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: rule__Promocion__NombreAssignment_5 : ( ruleEString ) ;
    public final void rule__Promocion__NombreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3153:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: ruleEString
            {
             before(grammarAccess.getPromocionAccess().getNombreEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Promocion__NombreAssignment_56226);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPromocionAccess().getNombreEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Promocion__NombreAssignment_5"


    // $ANTLR start "rule__Promocion__EstiloAssignment_8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: rule__Promocion__EstiloAssignment_8 : ( ruleEstilo ) ;
    public final void rule__Promocion__EstiloAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3168:1: ( ( ruleEstilo ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( ruleEstilo )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( ruleEstilo )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ruleEstilo
            {
             before(grammarAccess.getPromocionAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_rule__Promocion__EstiloAssignment_86257);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getPromocionAccess().getEstiloEstiloEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Promocion__EstiloAssignment_8"


    // $ANTLR start "rule__Mapa__NombreAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: rule__Mapa__NombreAssignment_5 : ( ruleEString ) ;
    public final void rule__Mapa__NombreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: ruleEString
            {
             before(grammarAccess.getMapaAccess().getNombreEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Mapa__NombreAssignment_56288);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getNombreEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Mapa__NombreAssignment_5"


    // $ANTLR start "rule__Mapa__EstiloAssignment_8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: rule__Mapa__EstiloAssignment_8 : ( ruleEstilo ) ;
    public final void rule__Mapa__EstiloAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ( ( ruleEstilo ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ruleEstilo )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ruleEstilo )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ruleEstilo
            {
             before(grammarAccess.getMapaAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_rule__Mapa__EstiloAssignment_86319);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getEstiloEstiloEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Mapa__EstiloAssignment_8"


    // $ANTLR start "rule__Contacto__NombreAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: rule__Contacto__NombreAssignment_5 : ( ruleEString ) ;
    public final void rule__Contacto__NombreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: ruleEString
            {
             before(grammarAccess.getContactoAccess().getNombreEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contacto__NombreAssignment_56350);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactoAccess().getNombreEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Contacto__NombreAssignment_5"


    // $ANTLR start "rule__Contacto__EstiloAssignment_8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: rule__Contacto__EstiloAssignment_8 : ( ruleEstilo ) ;
    public final void rule__Contacto__EstiloAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( ( ruleEstilo ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( ruleEstilo )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( ruleEstilo )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ruleEstilo
            {
             before(grammarAccess.getContactoAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_rule__Contacto__EstiloAssignment_86381);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getContactoAccess().getEstiloEstiloEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Contacto__EstiloAssignment_8"


    // $ANTLR start "rule__Catalogo__NombreAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: rule__Catalogo__NombreAssignment_5 : ( ruleEString ) ;
    public final void rule__Catalogo__NombreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: ruleEString
            {
             before(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Catalogo__NombreAssignment_56412);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Catalogo__NombreAssignment_5"


    // $ANTLR start "rule__Catalogo__EstiloAssignment_8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: rule__Catalogo__EstiloAssignment_8 : ( ruleEstilo ) ;
    public final void rule__Catalogo__EstiloAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( ( ruleEstilo ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( ruleEstilo )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( ruleEstilo )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: ruleEstilo
            {
             before(grammarAccess.getCatalogoAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_rule__Catalogo__EstiloAssignment_86443);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getCatalogoAccess().getEstiloEstiloEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Catalogo__EstiloAssignment_8"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMarketPlace_in_entryRuleMarketPlace61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarketPlace68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__0_in_ruleMarketPlace94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePagina_in_entryRulePagina121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePagina128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Pagina__Alternatives_in_rulePagina154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePromocion_in_entryRulePromocion181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePromocion188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__0_in_rulePromocion214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapa_in_entryRuleMapa241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapa248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__0_in_ruleMapa274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacto_in_entryRuleContacto301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContacto308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__0_in_ruleContacto334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_entryRuleCatalogo361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCatalogo368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__0_in_ruleCatalogo394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estilo__Alternatives_in_ruleEstilo491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TipoPresentacion__Alternatives_in_ruleTipoPresentacion527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePromocion_in_rule__Pagina__Alternatives562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapa_in_rule__Pagina__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacto_in_rule__Pagina__Alternatives596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_rule__Pagina__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Estilo__Alternatives695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Estilo__Alternatives716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Estilo__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Estilo__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TipoPresentacion__Alternatives794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TipoPresentacion__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TipoPresentacion__Alternatives836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__0__Impl_in_rule__MarketPlace__Group__0869 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__1_in_rule__MarketPlace__Group__0872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__1__Impl_in_rule__MarketPlace__Group__1930 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__2_in_rule__MarketPlace__Group__1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__MarketPlace__Group__1__Impl960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__2__Impl_in_rule__MarketPlace__Group__2989 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__3_in_rule__MarketPlace__Group__2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_QUESTION_in_rule__MarketPlace__Group__2__Impl1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__3__Impl_in_rule__MarketPlace__Group__31048 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__4_in_rule__MarketPlace__Group__31051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MarketPlace__Group__3__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__4__Impl_in_rule__MarketPlace__Group__41110 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__5_in_rule__MarketPlace__Group__41113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MarketPlace__Group__4__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__5__Impl_in_rule__MarketPlace__Group__51172 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__6_in_rule__MarketPlace__Group__51175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__5__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__6__Impl_in_rule__MarketPlace__Group__61231 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__7_in_rule__MarketPlace__Group__61234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MarketPlace__Group__6__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__7__Impl_in_rule__MarketPlace__Group__71293 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__8_in_rule__MarketPlace__Group__71296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MarketPlace__Group__7__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__8__Impl_in_rule__MarketPlace__Group__81355 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__9_in_rule__MarketPlace__Group__81358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__8__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__9__Impl_in_rule__MarketPlace__Group__91414 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__10_in_rule__MarketPlace__Group__91417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MarketPlace__Group__9__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__10__Impl_in_rule__MarketPlace__Group__101476 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__11_in_rule__MarketPlace__Group__101479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_QUESTION_in_rule__MarketPlace__Group__10__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__11__Impl_in_rule__MarketPlace__Group__111535 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__12_in_rule__MarketPlace__Group__111538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__MarketPlace__Group__11__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__12__Impl_in_rule__MarketPlace__Group__121594 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__13_in_rule__MarketPlace__Group__121597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__MarketPlace__Group__12__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__13__Impl_in_rule__MarketPlace__Group__131653 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__14_in_rule__MarketPlace__Group__131656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TMARKETPLACE_in_rule__MarketPlace__Group__13__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__14__Impl_in_rule__MarketPlace__Group__141712 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__15_in_rule__MarketPlace__Group__141715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MarketPlace__Group__14__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__15__Impl_in_rule__MarketPlace__Group__151774 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__16_in_rule__MarketPlace__Group__151777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__15__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__16__Impl_in_rule__MarketPlace__Group__161833 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__17_in_rule__MarketPlace__Group__161836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MarketPlace__Group__16__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__17__Impl_in_rule__MarketPlace__Group__171895 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__18_in_rule__MarketPlace__Group__171898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MarketPlace__Group__17__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__18__Impl_in_rule__MarketPlace__Group__181957 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__19_in_rule__MarketPlace__Group__181960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__18__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__19__Impl_in_rule__MarketPlace__Group__192016 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__20_in_rule__MarketPlace__Group__192019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TXMI_in_rule__MarketPlace__Group__19__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__20__Impl_in_rule__MarketPlace__Group__202075 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__21_in_rule__MarketPlace__Group__202078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MarketPlace__Group__20__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__21__Impl_in_rule__MarketPlace__Group__212137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__22_in_rule__MarketPlace__Group__212140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__21__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__22__Impl_in_rule__MarketPlace__Group__222196 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__23_in_rule__MarketPlace__Group__222199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TXSI_in_rule__MarketPlace__Group__22__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__23__Impl_in_rule__MarketPlace__Group__232255 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__24_in_rule__MarketPlace__Group__232258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MarketPlace__Group__23__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__24__Impl_in_rule__MarketPlace__Group__242317 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__25_in_rule__MarketPlace__Group__242320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__24__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__25__Impl_in_rule__MarketPlace__Group__252376 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__26_in_rule__MarketPlace__Group__252379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TPROYECTOS_in_rule__MarketPlace__Group__25__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__26__Impl_in_rule__MarketPlace__Group__262435 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__27_in_rule__MarketPlace__Group__262438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__MarketPlace__Group__26__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__27__Impl_in_rule__MarketPlace__Group__272497 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__28_in_rule__MarketPlace__Group__272500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__27__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__28__Impl_in_rule__MarketPlace__Group__282556 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__29_in_rule__MarketPlace__Group__282559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SCHEMALOCATION_in_rule__MarketPlace__Group__28__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__29__Impl_in_rule__MarketPlace__Group__292615 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__30_in_rule__MarketPlace__Group__292618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MarketPlace__Group__29__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__30__Impl_in_rule__MarketPlace__Group__302677 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__31_in_rule__MarketPlace__Group__302680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__30__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__31__Impl_in_rule__MarketPlace__Group__312736 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__32_in_rule__MarketPlace__Group__312739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__NombreAssignment_31_in_rule__MarketPlace__Group__31__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__32__Impl_in_rule__MarketPlace__Group__322796 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__33_in_rule__MarketPlace__Group__322799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__MarketPlace__Group__32__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__33__Impl_in_rule__MarketPlace__Group__332858 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__34_in_rule__MarketPlace__Group__332861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MarketPlace__Group__33__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__34__Impl_in_rule__MarketPlace__Group__342917 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__35_in_rule__MarketPlace__Group__342920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__PresentacionAssignment_34_in_rule__MarketPlace__Group__34__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__35__Impl_in_rule__MarketPlace__Group__352977 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__36_in_rule__MarketPlace__Group__352980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__MarketPlace__Group__35__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__36__Impl_in_rule__MarketPlace__Group__363036 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__37_in_rule__MarketPlace__Group__363039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__PaginasAssignment_36_in_rule__MarketPlace__Group__36__Impl3066 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__37__Impl_in_rule__MarketPlace__Group__373097 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__38_in_rule__MarketPlace__Group__373100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__MarketPlace__Group__37__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__38__Impl_in_rule__MarketPlace__Group__383156 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__39_in_rule__MarketPlace__Group__383159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SLASH_in_rule__MarketPlace__Group__38__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__39__Impl_in_rule__MarketPlace__Group__393215 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__40_in_rule__MarketPlace__Group__393218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TMARKETPLACE_in_rule__MarketPlace__Group__39__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarketPlace__Group__40__Impl_in_rule__MarketPlace__Group__403274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__MarketPlace__Group__40__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__0__Impl_in_rule__Promocion__Group__03412 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Promocion__Group__1_in_rule__Promocion__Group__03415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__Promocion__Group__0__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__1__Impl_in_rule__Promocion__Group__13471 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Promocion__Group__2_in_rule__Promocion__Group__13474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_rule__Promocion__Group__1__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__2__Impl_in_rule__Promocion__Group__23530 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Promocion__Group__3_in_rule__Promocion__Group__23533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Promocion__Group__2__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__3__Impl_in_rule__Promocion__Group__33592 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Promocion__Group__4_in_rule__Promocion__Group__33595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Promocion__Group__3__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__4__Impl_in_rule__Promocion__Group__43654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Promocion__Group__5_in_rule__Promocion__Group__43657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Promocion__Group__4__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__5__Impl_in_rule__Promocion__Group__53713 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Promocion__Group__6_in_rule__Promocion__Group__53716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__NombreAssignment_5_in_rule__Promocion__Group__5__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__6__Impl_in_rule__Promocion__Group__63773 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Promocion__Group__7_in_rule__Promocion__Group__63776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Promocion__Group__6__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__7__Impl_in_rule__Promocion__Group__73835 = new BitSet(new long[]{0x000000001E000000L});
        public static final BitSet FOLLOW_rule__Promocion__Group__8_in_rule__Promocion__Group__73838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Promocion__Group__7__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__8__Impl_in_rule__Promocion__Group__83894 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Promocion__Group__9_in_rule__Promocion__Group__83897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__EstiloAssignment_8_in_rule__Promocion__Group__8__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__9__Impl_in_rule__Promocion__Group__93954 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Promocion__Group__10_in_rule__Promocion__Group__93957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SLASH_in_rule__Promocion__Group__9__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Promocion__Group__10__Impl_in_rule__Promocion__Group__104013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__Promocion__Group__10__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__0__Impl_in_rule__Mapa__Group__04091 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Mapa__Group__1_in_rule__Mapa__Group__04094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__Mapa__Group__0__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__1__Impl_in_rule__Mapa__Group__14150 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Mapa__Group__2_in_rule__Mapa__Group__14153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_rule__Mapa__Group__1__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__2__Impl_in_rule__Mapa__Group__24209 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Mapa__Group__3_in_rule__Mapa__Group__24212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Mapa__Group__2__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__3__Impl_in_rule__Mapa__Group__34271 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Mapa__Group__4_in_rule__Mapa__Group__34274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Mapa__Group__3__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__4__Impl_in_rule__Mapa__Group__44333 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Mapa__Group__5_in_rule__Mapa__Group__44336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Mapa__Group__4__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__5__Impl_in_rule__Mapa__Group__54392 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Mapa__Group__6_in_rule__Mapa__Group__54395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__NombreAssignment_5_in_rule__Mapa__Group__5__Impl4422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__6__Impl_in_rule__Mapa__Group__64452 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Mapa__Group__7_in_rule__Mapa__Group__64455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Mapa__Group__6__Impl4483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__7__Impl_in_rule__Mapa__Group__74514 = new BitSet(new long[]{0x000000001E000000L});
        public static final BitSet FOLLOW_rule__Mapa__Group__8_in_rule__Mapa__Group__74517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Mapa__Group__7__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__8__Impl_in_rule__Mapa__Group__84573 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Mapa__Group__9_in_rule__Mapa__Group__84576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__EstiloAssignment_8_in_rule__Mapa__Group__8__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__9__Impl_in_rule__Mapa__Group__94633 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Mapa__Group__10_in_rule__Mapa__Group__94636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SLASH_in_rule__Mapa__Group__9__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mapa__Group__10__Impl_in_rule__Mapa__Group__104692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__Mapa__Group__10__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__0__Impl_in_rule__Contacto__Group__04770 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Contacto__Group__1_in_rule__Contacto__Group__04773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__Contacto__Group__0__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__1__Impl_in_rule__Contacto__Group__14829 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Contacto__Group__2_in_rule__Contacto__Group__14832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_rule__Contacto__Group__1__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__2__Impl_in_rule__Contacto__Group__24888 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Contacto__Group__3_in_rule__Contacto__Group__24891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Contacto__Group__2__Impl4919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__3__Impl_in_rule__Contacto__Group__34950 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Contacto__Group__4_in_rule__Contacto__Group__34953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Contacto__Group__3__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__4__Impl_in_rule__Contacto__Group__45012 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contacto__Group__5_in_rule__Contacto__Group__45015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Contacto__Group__4__Impl5042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__5__Impl_in_rule__Contacto__Group__55071 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Contacto__Group__6_in_rule__Contacto__Group__55074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__NombreAssignment_5_in_rule__Contacto__Group__5__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__6__Impl_in_rule__Contacto__Group__65131 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Contacto__Group__7_in_rule__Contacto__Group__65134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Contacto__Group__6__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__7__Impl_in_rule__Contacto__Group__75193 = new BitSet(new long[]{0x000000001E000000L});
        public static final BitSet FOLLOW_rule__Contacto__Group__8_in_rule__Contacto__Group__75196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Contacto__Group__7__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__8__Impl_in_rule__Contacto__Group__85252 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Contacto__Group__9_in_rule__Contacto__Group__85255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__EstiloAssignment_8_in_rule__Contacto__Group__8__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__9__Impl_in_rule__Contacto__Group__95312 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Contacto__Group__10_in_rule__Contacto__Group__95315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SLASH_in_rule__Contacto__Group__9__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacto__Group__10__Impl_in_rule__Contacto__Group__105371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__Contacto__Group__10__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__0__Impl_in_rule__Catalogo__Group__05449 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__1_in_rule__Catalogo__Group__05452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rule__Catalogo__Group__0__Impl5479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__1__Impl_in_rule__Catalogo__Group__15508 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__2_in_rule__Catalogo__Group__15511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_rule__Catalogo__Group__1__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__2__Impl_in_rule__Catalogo__Group__25567 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__3_in_rule__Catalogo__Group__25570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Catalogo__Group__2__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__3__Impl_in_rule__Catalogo__Group__35629 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__4_in_rule__Catalogo__Group__35632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Catalogo__Group__3__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__4__Impl_in_rule__Catalogo__Group__45691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__5_in_rule__Catalogo__Group__45694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Catalogo__Group__4__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__5__Impl_in_rule__Catalogo__Group__55750 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__6_in_rule__Catalogo__Group__55753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__NombreAssignment_5_in_rule__Catalogo__Group__5__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__6__Impl_in_rule__Catalogo__Group__65810 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__7_in_rule__Catalogo__Group__65813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Catalogo__Group__6__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__7__Impl_in_rule__Catalogo__Group__75872 = new BitSet(new long[]{0x000000001E000000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__8_in_rule__Catalogo__Group__75875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rule__Catalogo__Group__7__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__8__Impl_in_rule__Catalogo__Group__85931 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__9_in_rule__Catalogo__Group__85934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__EstiloAssignment_8_in_rule__Catalogo__Group__8__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__9__Impl_in_rule__Catalogo__Group__95991 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__10_in_rule__Catalogo__Group__95994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SLASH_in_rule__Catalogo__Group__9__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__10__Impl_in_rule__Catalogo__Group__106050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rule__Catalogo__Group__10__Impl6077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MarketPlace__NombreAssignment_316133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPresentacion_in_rule__MarketPlace__PresentacionAssignment_346164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePagina_in_rule__MarketPlace__PaginasAssignment_366195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Promocion__NombreAssignment_56226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstilo_in_rule__Promocion__EstiloAssignment_86257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Mapa__NombreAssignment_56288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstilo_in_rule__Mapa__EstiloAssignment_86319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contacto__NombreAssignment_56350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstilo_in_rule__Contacto__EstiloAssignment_86381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Catalogo__NombreAssignment_56412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstilo_in_rule__Catalogo__EstiloAssignment_86443 = new BitSet(new long[]{0x0000000000000002L});
    }


}