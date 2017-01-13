package org.xtext.example.mydsl.parser.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LESS", "RULE_QUESTION", "RULE_EQUALS", "RULE_GREATER", "RULE_TMARKETPLACE", "RULE_TXMI", "RULE_TXSI", "RULE_TPROYECTOS", "RULE_SCHEMALOCATION", "RULE_SLASH", "RULE_TPAGINAS", "RULE_STRING", "RULE_ID", "RULE_TPROMOCION", "RULE_TMAPA", "RULE_TTIPO", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xml'", "'version'", "'\"1.0\"'", "'encoding'", "'\"ASCII\"'", "'xmi:version'", "'\"2.0\"'", "'xmlns:xmi'", "'xmlns:xsi'", "'xmlns:proyectos'", "'xsi:schemaLocation'", "'nombre'", "'presentacion'", "'xsi:type=\"proyectos:Promocion\"'", "'estilo'", "'xsi:type=\"proyectos:Mapa\"'", "'xsi:type=\"proyectos:Contacto\"'", "'xsi:type=\"proyectos:Catalogo\"'", "'\"empresarial\"'", "'\"clasico\"'", "'\"moderno\"'", "'\"profesional\"'", "'\"basico\"'", "'\"premium\"'", "'\"gold\"'"
    };
    public static final int RULE_ID=16;
    public static final int RULE_TMAPA=18;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int RULE_TPAGINAS=14;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_TPROYECTOS=11;
    public static final int RULE_TXSI=10;
    public static final int EOF=-1;
    public static final int RULE_TPROMOCION=17;
    public static final int RULE_TTIPO=19;
    public static final int RULE_INT=20;
    public static final int RULE_TXMI=9;
    public static final int RULE_SCHEMALOCATION=12;
    public static final int RULE_TMARKETPLACE=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_GREATER=7;
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
    public static final int RULE_STRING=15;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_LESS=4;
    public static final int RULE_EQUALS=6;
    public static final int RULE_SLASH=13;
    public static final int RULE_WS=23;
    public static final int RULE_QUESTION=5;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MarketPlace";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMarketPlace"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleMarketPlace returns [EObject current=null] : iv_ruleMarketPlace= ruleMarketPlace EOF ;
    public final EObject entryRuleMarketPlace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarketPlace = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleMarketPlace= ruleMarketPlace EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleMarketPlace= ruleMarketPlace EOF
            {
             newCompositeNode(grammarAccess.getMarketPlaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMarketPlace_in_entryRuleMarketPlace75);
            iv_ruleMarketPlace=ruleMarketPlace();

            state._fsp--;

             current =iv_ruleMarketPlace; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarketPlace85); 

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
    // $ANTLR end "entryRuleMarketPlace"


    // $ANTLR start "ruleMarketPlace"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleMarketPlace returns [EObject current=null] : ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' otherlv_7= 'encoding' this_EQUALS_8= RULE_EQUALS otherlv_9= '\"ASCII\"' this_QUESTION_10= RULE_QUESTION this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_TMARKETPLACE_13= RULE_TMARKETPLACE otherlv_14= 'xmi:version' this_EQUALS_15= RULE_EQUALS otherlv_16= '\"2.0\"' otherlv_17= 'xmlns:xmi' this_EQUALS_18= RULE_EQUALS this_TXMI_19= RULE_TXMI otherlv_20= 'xmlns:xsi' this_EQUALS_21= RULE_EQUALS this_TXSI_22= RULE_TXSI otherlv_23= 'xmlns:proyectos' this_EQUALS_24= RULE_EQUALS this_TPROYECTOS_25= RULE_TPROYECTOS otherlv_26= 'xsi:schemaLocation' this_EQUALS_27= RULE_EQUALS this_SCHEMALOCATION_28= RULE_SCHEMALOCATION otherlv_29= 'nombre' this_EQUALS_30= RULE_EQUALS ( (lv_nombre_31_0= ruleEString ) ) otherlv_32= 'presentacion' this_EQUALS_33= RULE_EQUALS ( (lv_presentacion_34_0= ruleTipoPresentacion ) ) this_GREATER_35= RULE_GREATER ( (lv_paginas_36_0= rulePagina ) )* this_LESS_37= RULE_LESS this_SLASH_38= RULE_SLASH this_TMARKETPLACE_39= RULE_TMARKETPLACE this_GREATER_40= RULE_GREATER ) ;
    public final EObject ruleMarketPlace() throws RecognitionException {
        EObject current = null;

        Token this_LESS_1=null;
        Token this_QUESTION_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_EQUALS_8=null;
        Token otherlv_9=null;
        Token this_QUESTION_10=null;
        Token this_GREATER_11=null;
        Token this_LESS_12=null;
        Token this_TMARKETPLACE_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_TXMI_19=null;
        Token otherlv_20=null;
        Token this_EQUALS_21=null;
        Token this_TXSI_22=null;
        Token otherlv_23=null;
        Token this_EQUALS_24=null;
        Token this_TPROYECTOS_25=null;
        Token otherlv_26=null;
        Token this_EQUALS_27=null;
        Token this_SCHEMALOCATION_28=null;
        Token otherlv_29=null;
        Token this_EQUALS_30=null;
        Token otherlv_32=null;
        Token this_EQUALS_33=null;
        Token this_GREATER_35=null;
        Token this_LESS_37=null;
        Token this_SLASH_38=null;
        Token this_TMARKETPLACE_39=null;
        Token this_GREATER_40=null;
        AntlrDatatypeRuleToken lv_nombre_31_0 = null;

        Enumerator lv_presentacion_34_0 = null;

        EObject lv_paginas_36_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' otherlv_7= 'encoding' this_EQUALS_8= RULE_EQUALS otherlv_9= '\"ASCII\"' this_QUESTION_10= RULE_QUESTION this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_TMARKETPLACE_13= RULE_TMARKETPLACE otherlv_14= 'xmi:version' this_EQUALS_15= RULE_EQUALS otherlv_16= '\"2.0\"' otherlv_17= 'xmlns:xmi' this_EQUALS_18= RULE_EQUALS this_TXMI_19= RULE_TXMI otherlv_20= 'xmlns:xsi' this_EQUALS_21= RULE_EQUALS this_TXSI_22= RULE_TXSI otherlv_23= 'xmlns:proyectos' this_EQUALS_24= RULE_EQUALS this_TPROYECTOS_25= RULE_TPROYECTOS otherlv_26= 'xsi:schemaLocation' this_EQUALS_27= RULE_EQUALS this_SCHEMALOCATION_28= RULE_SCHEMALOCATION otherlv_29= 'nombre' this_EQUALS_30= RULE_EQUALS ( (lv_nombre_31_0= ruleEString ) ) otherlv_32= 'presentacion' this_EQUALS_33= RULE_EQUALS ( (lv_presentacion_34_0= ruleTipoPresentacion ) ) this_GREATER_35= RULE_GREATER ( (lv_paginas_36_0= rulePagina ) )* this_LESS_37= RULE_LESS this_SLASH_38= RULE_SLASH this_TMARKETPLACE_39= RULE_TMARKETPLACE this_GREATER_40= RULE_GREATER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' otherlv_7= 'encoding' this_EQUALS_8= RULE_EQUALS otherlv_9= '\"ASCII\"' this_QUESTION_10= RULE_QUESTION this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_TMARKETPLACE_13= RULE_TMARKETPLACE otherlv_14= 'xmi:version' this_EQUALS_15= RULE_EQUALS otherlv_16= '\"2.0\"' otherlv_17= 'xmlns:xmi' this_EQUALS_18= RULE_EQUALS this_TXMI_19= RULE_TXMI otherlv_20= 'xmlns:xsi' this_EQUALS_21= RULE_EQUALS this_TXSI_22= RULE_TXSI otherlv_23= 'xmlns:proyectos' this_EQUALS_24= RULE_EQUALS this_TPROYECTOS_25= RULE_TPROYECTOS otherlv_26= 'xsi:schemaLocation' this_EQUALS_27= RULE_EQUALS this_SCHEMALOCATION_28= RULE_SCHEMALOCATION otherlv_29= 'nombre' this_EQUALS_30= RULE_EQUALS ( (lv_nombre_31_0= ruleEString ) ) otherlv_32= 'presentacion' this_EQUALS_33= RULE_EQUALS ( (lv_presentacion_34_0= ruleTipoPresentacion ) ) this_GREATER_35= RULE_GREATER ( (lv_paginas_36_0= rulePagina ) )* this_LESS_37= RULE_LESS this_SLASH_38= RULE_SLASH this_TMARKETPLACE_39= RULE_TMARKETPLACE this_GREATER_40= RULE_GREATER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' otherlv_7= 'encoding' this_EQUALS_8= RULE_EQUALS otherlv_9= '\"ASCII\"' this_QUESTION_10= RULE_QUESTION this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_TMARKETPLACE_13= RULE_TMARKETPLACE otherlv_14= 'xmi:version' this_EQUALS_15= RULE_EQUALS otherlv_16= '\"2.0\"' otherlv_17= 'xmlns:xmi' this_EQUALS_18= RULE_EQUALS this_TXMI_19= RULE_TXMI otherlv_20= 'xmlns:xsi' this_EQUALS_21= RULE_EQUALS this_TXSI_22= RULE_TXSI otherlv_23= 'xmlns:proyectos' this_EQUALS_24= RULE_EQUALS this_TPROYECTOS_25= RULE_TPROYECTOS otherlv_26= 'xsi:schemaLocation' this_EQUALS_27= RULE_EQUALS this_SCHEMALOCATION_28= RULE_SCHEMALOCATION otherlv_29= 'nombre' this_EQUALS_30= RULE_EQUALS ( (lv_nombre_31_0= ruleEString ) ) otherlv_32= 'presentacion' this_EQUALS_33= RULE_EQUALS ( (lv_presentacion_34_0= ruleTipoPresentacion ) ) this_GREATER_35= RULE_GREATER ( (lv_paginas_36_0= rulePagina ) )* this_LESS_37= RULE_LESS this_SLASH_38= RULE_SLASH this_TMARKETPLACE_39= RULE_TMARKETPLACE this_GREATER_40= RULE_GREATER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' otherlv_7= 'encoding' this_EQUALS_8= RULE_EQUALS otherlv_9= '\"ASCII\"' this_QUESTION_10= RULE_QUESTION this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_TMARKETPLACE_13= RULE_TMARKETPLACE otherlv_14= 'xmi:version' this_EQUALS_15= RULE_EQUALS otherlv_16= '\"2.0\"' otherlv_17= 'xmlns:xmi' this_EQUALS_18= RULE_EQUALS this_TXMI_19= RULE_TXMI otherlv_20= 'xmlns:xsi' this_EQUALS_21= RULE_EQUALS this_TXSI_22= RULE_TXSI otherlv_23= 'xmlns:proyectos' this_EQUALS_24= RULE_EQUALS this_TPROYECTOS_25= RULE_TPROYECTOS otherlv_26= 'xsi:schemaLocation' this_EQUALS_27= RULE_EQUALS this_SCHEMALOCATION_28= RULE_SCHEMALOCATION otherlv_29= 'nombre' this_EQUALS_30= RULE_EQUALS ( (lv_nombre_31_0= ruleEString ) ) otherlv_32= 'presentacion' this_EQUALS_33= RULE_EQUALS ( (lv_presentacion_34_0= ruleTipoPresentacion ) ) this_GREATER_35= RULE_GREATER ( (lv_paginas_36_0= rulePagina ) )* this_LESS_37= RULE_LESS this_SLASH_38= RULE_SLASH this_TMARKETPLACE_39= RULE_TMARKETPLACE this_GREATER_40= RULE_GREATER
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMarketPlaceAccess().getMarketPlaceAction_0(),
                        current);
                

            }

            this_LESS_1=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_ruleMarketPlace130); 
             
                newLeafNode(this_LESS_1, grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_1()); 
                
            this_QUESTION_2=(Token)match(input,RULE_QUESTION,FollowSets000.FOLLOW_RULE_QUESTION_in_ruleMarketPlace140); 
             
                newLeafNode(this_QUESTION_2, grammarAccess.getMarketPlaceAccess().getQUESTIONTerminalRuleCall_2()); 
                
            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMarketPlace151); 

                	newLeafNode(otherlv_3, grammarAccess.getMarketPlaceAccess().getXmlKeyword_3());
                
            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMarketPlace163); 

                	newLeafNode(otherlv_4, grammarAccess.getMarketPlaceAccess().getVersionKeyword_4());
                
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace174); 
             
                newLeafNode(this_EQUALS_5, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMarketPlace185); 

                	newLeafNode(otherlv_6, grammarAccess.getMarketPlaceAccess().getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6());
                
            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMarketPlace197); 

                	newLeafNode(otherlv_7, grammarAccess.getMarketPlaceAccess().getEncodingKeyword_7());
                
            this_EQUALS_8=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace208); 
             
                newLeafNode(this_EQUALS_8, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_8()); 
                
            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMarketPlace219); 

                	newLeafNode(otherlv_9, grammarAccess.getMarketPlaceAccess().getASCIIKeyword_9());
                
            this_QUESTION_10=(Token)match(input,RULE_QUESTION,FollowSets000.FOLLOW_RULE_QUESTION_in_ruleMarketPlace230); 
             
                newLeafNode(this_QUESTION_10, grammarAccess.getMarketPlaceAccess().getQUESTIONTerminalRuleCall_10()); 
                
            this_GREATER_11=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_ruleMarketPlace240); 
             
                newLeafNode(this_GREATER_11, grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_11()); 
                
            this_LESS_12=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_ruleMarketPlace250); 
             
                newLeafNode(this_LESS_12, grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_12()); 
                
            this_TMARKETPLACE_13=(Token)match(input,RULE_TMARKETPLACE,FollowSets000.FOLLOW_RULE_TMARKETPLACE_in_ruleMarketPlace260); 
             
                newLeafNode(this_TMARKETPLACE_13, grammarAccess.getMarketPlaceAccess().getTMARKETPLACETerminalRuleCall_13()); 
                
            otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMarketPlace271); 

                	newLeafNode(otherlv_14, grammarAccess.getMarketPlaceAccess().getXmiVersionKeyword_14());
                
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace282); 
             
                newLeafNode(this_EQUALS_15, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_15()); 
                
            otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMarketPlace293); 

                	newLeafNode(otherlv_16, grammarAccess.getMarketPlaceAccess().getQuotationMarkDigitTwoFullStopDigitZeroQuotationMarkKeyword_16());
                
            otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMarketPlace305); 

                	newLeafNode(otherlv_17, grammarAccess.getMarketPlaceAccess().getXmlnsXmiKeyword_17());
                
            this_EQUALS_18=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace316); 
             
                newLeafNode(this_EQUALS_18, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_18()); 
                
            this_TXMI_19=(Token)match(input,RULE_TXMI,FollowSets000.FOLLOW_RULE_TXMI_in_ruleMarketPlace326); 
             
                newLeafNode(this_TXMI_19, grammarAccess.getMarketPlaceAccess().getTXMITerminalRuleCall_19()); 
                
            otherlv_20=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMarketPlace337); 

                	newLeafNode(otherlv_20, grammarAccess.getMarketPlaceAccess().getXmlnsXsiKeyword_20());
                
            this_EQUALS_21=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace348); 
             
                newLeafNode(this_EQUALS_21, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_21()); 
                
            this_TXSI_22=(Token)match(input,RULE_TXSI,FollowSets000.FOLLOW_RULE_TXSI_in_ruleMarketPlace358); 
             
                newLeafNode(this_TXSI_22, grammarAccess.getMarketPlaceAccess().getTXSITerminalRuleCall_22()); 
                
            otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMarketPlace369); 

                	newLeafNode(otherlv_23, grammarAccess.getMarketPlaceAccess().getXmlnsProyectosKeyword_23());
                
            this_EQUALS_24=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace380); 
             
                newLeafNode(this_EQUALS_24, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_24()); 
                
            this_TPROYECTOS_25=(Token)match(input,RULE_TPROYECTOS,FollowSets000.FOLLOW_RULE_TPROYECTOS_in_ruleMarketPlace390); 
             
                newLeafNode(this_TPROYECTOS_25, grammarAccess.getMarketPlaceAccess().getTPROYECTOSTerminalRuleCall_25()); 
                
            otherlv_26=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMarketPlace401); 

                	newLeafNode(otherlv_26, grammarAccess.getMarketPlaceAccess().getXsiSchemaLocationKeyword_26());
                
            this_EQUALS_27=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace412); 
             
                newLeafNode(this_EQUALS_27, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_27()); 
                
            this_SCHEMALOCATION_28=(Token)match(input,RULE_SCHEMALOCATION,FollowSets000.FOLLOW_RULE_SCHEMALOCATION_in_ruleMarketPlace422); 
             
                newLeafNode(this_SCHEMALOCATION_28, grammarAccess.getMarketPlaceAccess().getSCHEMALOCATIONTerminalRuleCall_28()); 
                
            otherlv_29=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMarketPlace433); 

                	newLeafNode(otherlv_29, grammarAccess.getMarketPlaceAccess().getNombreKeyword_29());
                
            this_EQUALS_30=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace444); 
             
                newLeafNode(this_EQUALS_30, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_30()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:1: ( (lv_nombre_31_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (lv_nombre_31_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (lv_nombre_31_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:3: lv_nombre_31_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMarketPlaceAccess().getNombreEStringParserRuleCall_31_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMarketPlace464);
            lv_nombre_31_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMarketPlaceRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_31_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_32=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMarketPlace476); 

                	newLeafNode(otherlv_32, grammarAccess.getMarketPlaceAccess().getPresentacionKeyword_32());
                
            this_EQUALS_33=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMarketPlace487); 
             
                newLeafNode(this_EQUALS_33, grammarAccess.getMarketPlaceAccess().getEQUALSTerminalRuleCall_33()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ( (lv_presentacion_34_0= ruleTipoPresentacion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_presentacion_34_0= ruleTipoPresentacion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_presentacion_34_0= ruleTipoPresentacion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:3: lv_presentacion_34_0= ruleTipoPresentacion
            {
             
            	        newCompositeNode(grammarAccess.getMarketPlaceAccess().getPresentacionTipoPresentacionEnumRuleCall_34_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPresentacion_in_ruleMarketPlace507);
            lv_presentacion_34_0=ruleTipoPresentacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMarketPlaceRule());
            	        }
                   		set(
                   			current, 
                   			"presentacion",
                    		lv_presentacion_34_0, 
                    		"TipoPresentacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_GREATER_35=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_ruleMarketPlace518); 
             
                newLeafNode(this_GREATER_35, grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_35()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:1: ( (lv_paginas_36_0= rulePagina ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_LESS) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_TPAGINAS) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:1: (lv_paginas_36_0= rulePagina )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:1: (lv_paginas_36_0= rulePagina )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:3: lv_paginas_36_0= rulePagina
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMarketPlaceAccess().getPaginasPaginaParserRuleCall_36_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePagina_in_ruleMarketPlace538);
            	    lv_paginas_36_0=rulePagina();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMarketPlaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"paginas",
            	            		lv_paginas_36_0, 
            	            		"Pagina");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_LESS_37=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_ruleMarketPlace550); 
             
                newLeafNode(this_LESS_37, grammarAccess.getMarketPlaceAccess().getLESSTerminalRuleCall_37()); 
                
            this_SLASH_38=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_ruleMarketPlace560); 
             
                newLeafNode(this_SLASH_38, grammarAccess.getMarketPlaceAccess().getSLASHTerminalRuleCall_38()); 
                
            this_TMARKETPLACE_39=(Token)match(input,RULE_TMARKETPLACE,FollowSets000.FOLLOW_RULE_TMARKETPLACE_in_ruleMarketPlace570); 
             
                newLeafNode(this_TMARKETPLACE_39, grammarAccess.getMarketPlaceAccess().getTMARKETPLACETerminalRuleCall_39()); 
                
            this_GREATER_40=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_ruleMarketPlace580); 
             
                newLeafNode(this_GREATER_40, grammarAccess.getMarketPlaceAccess().getGREATERTerminalRuleCall_40()); 
                

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
    // $ANTLR end "ruleMarketPlace"


    // $ANTLR start "entryRulePagina"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:297:1: entryRulePagina returns [EObject current=null] : iv_rulePagina= rulePagina EOF ;
    public final EObject entryRulePagina() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagina = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:2: (iv_rulePagina= rulePagina EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:2: iv_rulePagina= rulePagina EOF
            {
             newCompositeNode(grammarAccess.getPaginaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePagina_in_entryRulePagina615);
            iv_rulePagina=rulePagina();

            state._fsp--;

             current =iv_rulePagina; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePagina625); 

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
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:306:1: rulePagina returns [EObject current=null] : (this_Promocion_0= rulePromocion | this_Mapa_1= ruleMapa | this_Contacto_2= ruleContacto | this_Catalogo_3= ruleCatalogo ) ;
    public final EObject rulePagina() throws RecognitionException {
        EObject current = null;

        EObject this_Promocion_0 = null;

        EObject this_Mapa_1 = null;

        EObject this_Contacto_2 = null;

        EObject this_Catalogo_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:28: ( (this_Promocion_0= rulePromocion | this_Mapa_1= ruleMapa | this_Contacto_2= ruleContacto | this_Catalogo_3= ruleCatalogo ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (this_Promocion_0= rulePromocion | this_Mapa_1= ruleMapa | this_Contacto_2= ruleContacto | this_Catalogo_3= ruleCatalogo )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (this_Promocion_0= rulePromocion | this_Mapa_1= ruleMapa | this_Contacto_2= ruleContacto | this_Catalogo_3= ruleCatalogo )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LESS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_TPAGINAS) ) {
                    switch ( input.LA(3) ) {
                    case 38:
                        {
                        alt2=1;
                        }
                        break;
                    case 41:
                        {
                        alt2=3;
                        }
                        break;
                    case 40:
                        {
                        alt2=2;
                        }
                        break;
                    case 42:
                        {
                        alt2=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:5: this_Promocion_0= rulePromocion
                    {
                     
                            newCompositeNode(grammarAccess.getPaginaAccess().getPromocionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePromocion_in_rulePagina672);
                    this_Promocion_0=rulePromocion();

                    state._fsp--;

                     
                            current = this_Promocion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:5: this_Mapa_1= ruleMapa
                    {
                     
                            newCompositeNode(grammarAccess.getPaginaAccess().getMapaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMapa_in_rulePagina699);
                    this_Mapa_1=ruleMapa();

                    state._fsp--;

                     
                            current = this_Mapa_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:5: this_Contacto_2= ruleContacto
                    {
                     
                            newCompositeNode(grammarAccess.getPaginaAccess().getContactoParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContacto_in_rulePagina726);
                    this_Contacto_2=ruleContacto();

                    state._fsp--;

                     
                            current = this_Contacto_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:5: this_Catalogo_3= ruleCatalogo
                    {
                     
                            newCompositeNode(grammarAccess.getPaginaAccess().getCatalogoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_rulePagina753);
                    this_Catalogo_3=ruleCatalogo();

                    state._fsp--;

                     
                            current = this_Catalogo_3; 
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
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRulePromocion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: entryRulePromocion returns [EObject current=null] : iv_rulePromocion= rulePromocion EOF ;
    public final EObject entryRulePromocion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromocion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:358:2: (iv_rulePromocion= rulePromocion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:2: iv_rulePromocion= rulePromocion EOF
            {
             newCompositeNode(grammarAccess.getPromocionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePromocion_in_entryRulePromocion788);
            iv_rulePromocion=rulePromocion();

            state._fsp--;

             current =iv_rulePromocion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePromocion798); 

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
    // $ANTLR end "entryRulePromocion"


    // $ANTLR start "rulePromocion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:1: rulePromocion returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Promocion\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) ;
    public final EObject rulePromocion() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TPAGINAS_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_EQUALS_4=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SLASH_9=null;
        Token this_GREATER_10=null;
        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        Enumerator lv_estilo_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:28: ( (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Promocion\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Promocion\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Promocion\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:2: this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Promocion\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_rulePromocion834); 
             
                newLeafNode(this_LESS_0, grammarAccess.getPromocionAccess().getLESSTerminalRuleCall_0()); 
                
            this_TPAGINAS_1=(Token)match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_rulePromocion844); 
             
                newLeafNode(this_TPAGINAS_1, grammarAccess.getPromocionAccess().getTPAGINASTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulePromocion855); 

                	newLeafNode(otherlv_2, grammarAccess.getPromocionAccess().getXsiTypeProyectosPromocionKeyword_2());
                
            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePromocion867); 

                	newLeafNode(otherlv_3, grammarAccess.getPromocionAccess().getNombreKeyword_3());
                
            this_EQUALS_4=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rulePromocion878); 
             
                newLeafNode(this_EQUALS_4, grammarAccess.getPromocionAccess().getEQUALSTerminalRuleCall_4()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:1: ( (lv_nombre_5_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: (lv_nombre_5_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: (lv_nombre_5_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:3: lv_nombre_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPromocionAccess().getNombreEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePromocion898);
            lv_nombre_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPromocionRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePromocion910); 

                	newLeafNode(otherlv_6, grammarAccess.getPromocionAccess().getEstiloKeyword_6());
                
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_rulePromocion921); 
             
                newLeafNode(this_EQUALS_7, grammarAccess.getPromocionAccess().getEQUALSTerminalRuleCall_7()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:416:1: ( (lv_estilo_8_0= ruleEstilo ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:417:1: (lv_estilo_8_0= ruleEstilo )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:417:1: (lv_estilo_8_0= ruleEstilo )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:3: lv_estilo_8_0= ruleEstilo
            {
             
            	        newCompositeNode(grammarAccess.getPromocionAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_rulePromocion941);
            lv_estilo_8_0=ruleEstilo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPromocionRule());
            	        }
                   		set(
                   			current, 
                   			"estilo",
                    		lv_estilo_8_0, 
                    		"Estilo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_SLASH_9=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_rulePromocion952); 
             
                newLeafNode(this_SLASH_9, grammarAccess.getPromocionAccess().getSLASHTerminalRuleCall_9()); 
                
            this_GREATER_10=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_rulePromocion962); 
             
                newLeafNode(this_GREATER_10, grammarAccess.getPromocionAccess().getGREATERTerminalRuleCall_10()); 
                

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
    // $ANTLR end "rulePromocion"


    // $ANTLR start "entryRuleMapa"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:1: entryRuleMapa returns [EObject current=null] : iv_ruleMapa= ruleMapa EOF ;
    public final EObject entryRuleMapa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapa = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:2: (iv_ruleMapa= ruleMapa EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:2: iv_ruleMapa= ruleMapa EOF
            {
             newCompositeNode(grammarAccess.getMapaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMapa_in_entryRuleMapa997);
            iv_ruleMapa=ruleMapa();

            state._fsp--;

             current =iv_ruleMapa; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapa1007); 

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
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: ruleMapa returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Mapa\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) ;
    public final EObject ruleMapa() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TPAGINAS_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_EQUALS_4=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SLASH_9=null;
        Token this_GREATER_10=null;
        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        Enumerator lv_estilo_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:28: ( (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Mapa\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Mapa\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Mapa\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:2: this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Mapa\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_ruleMapa1043); 
             
                newLeafNode(this_LESS_0, grammarAccess.getMapaAccess().getLESSTerminalRuleCall_0()); 
                
            this_TPAGINAS_1=(Token)match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_ruleMapa1053); 
             
                newLeafNode(this_TPAGINAS_1, grammarAccess.getMapaAccess().getTPAGINASTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMapa1064); 

                	newLeafNode(otherlv_2, grammarAccess.getMapaAccess().getXsiTypeProyectosMapaKeyword_2());
                
            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMapa1076); 

                	newLeafNode(otherlv_3, grammarAccess.getMapaAccess().getNombreKeyword_3());
                
            this_EQUALS_4=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMapa1087); 
             
                newLeafNode(this_EQUALS_4, grammarAccess.getMapaAccess().getEQUALSTerminalRuleCall_4()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: ( (lv_nombre_5_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:1: (lv_nombre_5_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:1: (lv_nombre_5_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:3: lv_nombre_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMapaAccess().getNombreEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMapa1107);
            lv_nombre_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapaRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMapa1119); 

                	newLeafNode(otherlv_6, grammarAccess.getMapaAccess().getEstiloKeyword_6());
                
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleMapa1130); 
             
                newLeafNode(this_EQUALS_7, grammarAccess.getMapaAccess().getEQUALSTerminalRuleCall_7()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: ( (lv_estilo_8_0= ruleEstilo ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:1: (lv_estilo_8_0= ruleEstilo )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:1: (lv_estilo_8_0= ruleEstilo )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:3: lv_estilo_8_0= ruleEstilo
            {
             
            	        newCompositeNode(grammarAccess.getMapaAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_ruleMapa1150);
            lv_estilo_8_0=ruleEstilo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapaRule());
            	        }
                   		set(
                   			current, 
                   			"estilo",
                    		lv_estilo_8_0, 
                    		"Estilo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_SLASH_9=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_ruleMapa1161); 
             
                newLeafNode(this_SLASH_9, grammarAccess.getMapaAccess().getSLASHTerminalRuleCall_9()); 
                
            this_GREATER_10=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_ruleMapa1171); 
             
                newLeafNode(this_GREATER_10, grammarAccess.getMapaAccess().getGREATERTerminalRuleCall_10()); 
                

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
    // $ANTLR end "ruleMapa"


    // $ANTLR start "entryRuleContacto"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:1: entryRuleContacto returns [EObject current=null] : iv_ruleContacto= ruleContacto EOF ;
    public final EObject entryRuleContacto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContacto = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:2: (iv_ruleContacto= ruleContacto EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:2: iv_ruleContacto= ruleContacto EOF
            {
             newCompositeNode(grammarAccess.getContactoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContacto_in_entryRuleContacto1206);
            iv_ruleContacto=ruleContacto();

            state._fsp--;

             current =iv_ruleContacto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContacto1216); 

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
    // $ANTLR end "entryRuleContacto"


    // $ANTLR start "ruleContacto"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:1: ruleContacto returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Contacto\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) ;
    public final EObject ruleContacto() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TPAGINAS_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_EQUALS_4=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SLASH_9=null;
        Token this_GREATER_10=null;
        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        Enumerator lv_estilo_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:28: ( (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Contacto\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Contacto\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Contacto\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:2: this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Contacto\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_ruleContacto1252); 
             
                newLeafNode(this_LESS_0, grammarAccess.getContactoAccess().getLESSTerminalRuleCall_0()); 
                
            this_TPAGINAS_1=(Token)match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_ruleContacto1262); 
             
                newLeafNode(this_TPAGINAS_1, grammarAccess.getContactoAccess().getTPAGINASTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleContacto1273); 

                	newLeafNode(otherlv_2, grammarAccess.getContactoAccess().getXsiTypeProyectosContactoKeyword_2());
                
            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleContacto1285); 

                	newLeafNode(otherlv_3, grammarAccess.getContactoAccess().getNombreKeyword_3());
                
            this_EQUALS_4=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleContacto1296); 
             
                newLeafNode(this_EQUALS_4, grammarAccess.getContactoAccess().getEQUALSTerminalRuleCall_4()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: ( (lv_nombre_5_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: (lv_nombre_5_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: (lv_nombre_5_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:3: lv_nombre_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContactoAccess().getNombreEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContacto1316);
            lv_nombre_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContactoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleContacto1328); 

                	newLeafNode(otherlv_6, grammarAccess.getContactoAccess().getEstiloKeyword_6());
                
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleContacto1339); 
             
                newLeafNode(this_EQUALS_7, grammarAccess.getContactoAccess().getEQUALSTerminalRuleCall_7()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: ( (lv_estilo_8_0= ruleEstilo ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: (lv_estilo_8_0= ruleEstilo )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: (lv_estilo_8_0= ruleEstilo )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:3: lv_estilo_8_0= ruleEstilo
            {
             
            	        newCompositeNode(grammarAccess.getContactoAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_ruleContacto1359);
            lv_estilo_8_0=ruleEstilo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContactoRule());
            	        }
                   		set(
                   			current, 
                   			"estilo",
                    		lv_estilo_8_0, 
                    		"Estilo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_SLASH_9=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_ruleContacto1370); 
             
                newLeafNode(this_SLASH_9, grammarAccess.getContactoAccess().getSLASHTerminalRuleCall_9()); 
                
            this_GREATER_10=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_ruleContacto1380); 
             
                newLeafNode(this_GREATER_10, grammarAccess.getContactoAccess().getGREATERTerminalRuleCall_10()); 
                

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
    // $ANTLR end "ruleContacto"


    // $ANTLR start "entryRuleCatalogo"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: entryRuleCatalogo returns [EObject current=null] : iv_ruleCatalogo= ruleCatalogo EOF ;
    public final EObject entryRuleCatalogo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatalogo = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:2: (iv_ruleCatalogo= ruleCatalogo EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:2: iv_ruleCatalogo= ruleCatalogo EOF
            {
             newCompositeNode(grammarAccess.getCatalogoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_entryRuleCatalogo1415);
            iv_ruleCatalogo=ruleCatalogo();

            state._fsp--;

             current =iv_ruleCatalogo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCatalogo1425); 

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
    // $ANTLR end "entryRuleCatalogo"


    // $ANTLR start "ruleCatalogo"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:1: ruleCatalogo returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Catalogo\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) ;
    public final EObject ruleCatalogo() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TPAGINAS_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_EQUALS_4=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SLASH_9=null;
        Token this_GREATER_10=null;
        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        Enumerator lv_estilo_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:28: ( (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Catalogo\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Catalogo\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:1: (this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Catalogo\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:2: this_LESS_0= RULE_LESS this_TPAGINAS_1= RULE_TPAGINAS otherlv_2= 'xsi:type=\"proyectos:Catalogo\"' otherlv_3= 'nombre' this_EQUALS_4= RULE_EQUALS ( (lv_nombre_5_0= ruleEString ) ) otherlv_6= 'estilo' this_EQUALS_7= RULE_EQUALS ( (lv_estilo_8_0= ruleEstilo ) ) this_SLASH_9= RULE_SLASH this_GREATER_10= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_RULE_LESS_in_ruleCatalogo1461); 
             
                newLeafNode(this_LESS_0, grammarAccess.getCatalogoAccess().getLESSTerminalRuleCall_0()); 
                
            this_TPAGINAS_1=(Token)match(input,RULE_TPAGINAS,FollowSets000.FOLLOW_RULE_TPAGINAS_in_ruleCatalogo1471); 
             
                newLeafNode(this_TPAGINAS_1, grammarAccess.getCatalogoAccess().getTPAGINASTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCatalogo1482); 

                	newLeafNode(otherlv_2, grammarAccess.getCatalogoAccess().getXsiTypeProyectosCatalogoKeyword_2());
                
            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCatalogo1494); 

                	newLeafNode(otherlv_3, grammarAccess.getCatalogoAccess().getNombreKeyword_3());
                
            this_EQUALS_4=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleCatalogo1505); 
             
                newLeafNode(this_EQUALS_4, grammarAccess.getCatalogoAccess().getEQUALSTerminalRuleCall_4()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:1: ( (lv_nombre_5_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:1: (lv_nombre_5_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:1: (lv_nombre_5_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:3: lv_nombre_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCatalogo1525);
            lv_nombre_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCatalogoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCatalogo1537); 

                	newLeafNode(otherlv_6, grammarAccess.getCatalogoAccess().getEstiloKeyword_6());
                
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_RULE_EQUALS_in_ruleCatalogo1548); 
             
                newLeafNode(this_EQUALS_7, grammarAccess.getCatalogoAccess().getEQUALSTerminalRuleCall_7()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:695:1: ( (lv_estilo_8_0= ruleEstilo ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:696:1: (lv_estilo_8_0= ruleEstilo )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:696:1: (lv_estilo_8_0= ruleEstilo )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:3: lv_estilo_8_0= ruleEstilo
            {
             
            	        newCompositeNode(grammarAccess.getCatalogoAccess().getEstiloEstiloEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEstilo_in_ruleCatalogo1568);
            lv_estilo_8_0=ruleEstilo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCatalogoRule());
            	        }
                   		set(
                   			current, 
                   			"estilo",
                    		lv_estilo_8_0, 
                    		"Estilo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_SLASH_9=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_RULE_SLASH_in_ruleCatalogo1579); 
             
                newLeafNode(this_SLASH_9, grammarAccess.getCatalogoAccess().getSLASHTerminalRuleCall_9()); 
                
            this_GREATER_10=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_RULE_GREATER_in_ruleCatalogo1589); 
             
                newLeafNode(this_GREATER_10, grammarAccess.getCatalogoAccess().getGREATERTerminalRuleCall_10()); 
                

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
    // $ANTLR end "ruleCatalogo"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1625);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1636); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1676); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1702); 

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


    // $ANTLR start "ruleEstilo"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: ruleEstilo returns [Enumerator current=null] : ( (enumLiteral_0= '\"empresarial\"' ) | (enumLiteral_1= '\"clasico\"' ) | (enumLiteral_2= '\"moderno\"' ) | (enumLiteral_3= '\"profesional\"' ) ) ;
    public final Enumerator ruleEstilo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:767:28: ( ( (enumLiteral_0= '\"empresarial\"' ) | (enumLiteral_1= '\"clasico\"' ) | (enumLiteral_2= '\"moderno\"' ) | (enumLiteral_3= '\"profesional\"' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:1: ( (enumLiteral_0= '\"empresarial\"' ) | (enumLiteral_1= '\"clasico\"' ) | (enumLiteral_2= '\"moderno\"' ) | (enumLiteral_3= '\"profesional\"' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:1: ( (enumLiteral_0= '\"empresarial\"' ) | (enumLiteral_1= '\"clasico\"' ) | (enumLiteral_2= '\"moderno\"' ) | (enumLiteral_3= '\"profesional\"' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case 44:
                {
                alt4=2;
                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:2: (enumLiteral_0= '\"empresarial\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:2: (enumLiteral_0= '\"empresarial\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:4: enumLiteral_0= '\"empresarial\"'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEstilo1761); 

                            current = grammarAccess.getEstiloAccess().getEmpresarialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEstiloAccess().getEmpresarialEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:6: (enumLiteral_1= '\"clasico\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:6: (enumLiteral_1= '\"clasico\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:8: enumLiteral_1= '\"clasico\"'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEstilo1778); 

                            current = grammarAccess.getEstiloAccess().getClasicoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEstiloAccess().getClasicoEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:6: (enumLiteral_2= '\"moderno\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:6: (enumLiteral_2= '\"moderno\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:8: enumLiteral_2= '\"moderno\"'
                    {
                    enumLiteral_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEstilo1795); 

                            current = grammarAccess.getEstiloAccess().getModernoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEstiloAccess().getModernoEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:6: (enumLiteral_3= '\"profesional\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:6: (enumLiteral_3= '\"profesional\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:8: enumLiteral_3= '\"profesional\"'
                    {
                    enumLiteral_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEstilo1812); 

                            current = grammarAccess.getEstiloAccess().getProfesionalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEstiloAccess().getProfesionalEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleEstilo"


    // $ANTLR start "ruleTipoPresentacion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: ruleTipoPresentacion returns [Enumerator current=null] : ( (enumLiteral_0= '\"basico\"' ) | (enumLiteral_1= '\"premium\"' ) | (enumLiteral_2= '\"gold\"' ) ) ;
    public final Enumerator ruleTipoPresentacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:798:28: ( ( (enumLiteral_0= '\"basico\"' ) | (enumLiteral_1= '\"premium\"' ) | (enumLiteral_2= '\"gold\"' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:1: ( (enumLiteral_0= '\"basico\"' ) | (enumLiteral_1= '\"premium\"' ) | (enumLiteral_2= '\"gold\"' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:1: ( (enumLiteral_0= '\"basico\"' ) | (enumLiteral_1= '\"premium\"' ) | (enumLiteral_2= '\"gold\"' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 49:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:2: (enumLiteral_0= '\"basico\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:2: (enumLiteral_0= '\"basico\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:4: enumLiteral_0= '\"basico\"'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTipoPresentacion1857); 

                            current = grammarAccess.getTipoPresentacionAccess().getBasicoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTipoPresentacionAccess().getBasicoEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:6: (enumLiteral_1= '\"premium\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:6: (enumLiteral_1= '\"premium\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:8: enumLiteral_1= '\"premium\"'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTipoPresentacion1874); 

                            current = grammarAccess.getTipoPresentacionAccess().getPremiumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTipoPresentacionAccess().getPremiumEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:6: (enumLiteral_2= '\"gold\"' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:6: (enumLiteral_2= '\"gold\"' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:8: enumLiteral_2= '\"gold\"'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTipoPresentacion1891); 

                            current = grammarAccess.getTipoPresentacionAccess().getGoldEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTipoPresentacionAccess().getGoldEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleTipoPresentacion"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMarketPlace_in_entryRuleMarketPlace75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarketPlace85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_ruleMarketPlace130 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUESTION_in_ruleMarketPlace140 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleMarketPlace151 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMarketPlace163 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace174 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMarketPlace185 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMarketPlace197 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace208 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMarketPlace219 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUESTION_in_ruleMarketPlace230 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_ruleMarketPlace240 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_LESS_in_ruleMarketPlace250 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_TMARKETPLACE_in_ruleMarketPlace260 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMarketPlace271 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace282 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMarketPlace293 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMarketPlace305 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace316 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_TXMI_in_ruleMarketPlace326 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMarketPlace337 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace348 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_RULE_TXSI_in_ruleMarketPlace358 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMarketPlace369 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace380 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_RULE_TPROYECTOS_in_ruleMarketPlace390 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMarketPlace401 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace412 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_SCHEMALOCATION_in_ruleMarketPlace422 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMarketPlace433 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace444 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMarketPlace464 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleMarketPlace476 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMarketPlace487 = new BitSet(new long[]{0x0003800000000000L});
        public static final BitSet FOLLOW_ruleTipoPresentacion_in_ruleMarketPlace507 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_ruleMarketPlace518 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePagina_in_ruleMarketPlace538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_LESS_in_ruleMarketPlace550 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_RULE_SLASH_in_ruleMarketPlace560 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_TMARKETPLACE_in_ruleMarketPlace570 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_ruleMarketPlace580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePagina_in_entryRulePagina615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePagina625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePromocion_in_rulePagina672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapa_in_rulePagina699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacto_in_rulePagina726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_rulePagina753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePromocion_in_entryRulePromocion788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePromocion798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_rulePromocion834 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_rulePromocion844 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_rulePromocion855 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_rulePromocion867 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rulePromocion878 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_ruleEString_in_rulePromocion898 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulePromocion910 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_rulePromocion921 = new BitSet(new long[]{0x0000780000000000L});
        public static final BitSet FOLLOW_ruleEstilo_in_rulePromocion941 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_RULE_SLASH_in_rulePromocion952 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_rulePromocion962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapa_in_entryRuleMapa997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapa1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_ruleMapa1043 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_ruleMapa1053 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleMapa1064 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMapa1076 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMapa1087 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMapa1107 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMapa1119 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMapa1130 = new BitSet(new long[]{0x0000780000000000L});
        public static final BitSet FOLLOW_ruleEstilo_in_ruleMapa1150 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_RULE_SLASH_in_ruleMapa1161 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_ruleMapa1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacto_in_entryRuleContacto1206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContacto1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_ruleContacto1252 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_ruleContacto1262 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleContacto1273 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleContacto1285 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleContacto1296 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContacto1316 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleContacto1328 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleContacto1339 = new BitSet(new long[]{0x0000780000000000L});
        public static final BitSet FOLLOW_ruleEstilo_in_ruleContacto1359 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_RULE_SLASH_in_ruleContacto1370 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_ruleContacto1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_entryRuleCatalogo1415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCatalogo1425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LESS_in_ruleCatalogo1461 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_RULE_TPAGINAS_in_ruleCatalogo1471 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCatalogo1482 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleCatalogo1494 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleCatalogo1505 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCatalogo1525 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleCatalogo1537 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_EQUALS_in_ruleCatalogo1548 = new BitSet(new long[]{0x0000780000000000L});
        public static final BitSet FOLLOW_ruleEstilo_in_ruleCatalogo1568 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_RULE_SLASH_in_ruleCatalogo1579 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_GREATER_in_ruleCatalogo1589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEstilo1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEstilo1778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEstilo1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEstilo1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTipoPresentacion1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTipoPresentacion1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTipoPresentacion1891 = new BitSet(new long[]{0x0000000000000002L});
    }


}