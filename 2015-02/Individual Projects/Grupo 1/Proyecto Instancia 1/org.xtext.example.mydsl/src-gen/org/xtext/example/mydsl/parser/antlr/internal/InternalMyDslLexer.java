package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ID=16;
    public static final int RULE_TMAPA=18;
    public static final int T__29=29;
    public static final int RULE_TPAGINAS=14;
    public static final int T__28=28;
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:7: ( 'xml' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:9: 'xml'
            {
            match("xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:7: ( 'version' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:7: ( '\"1.0\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:9: '\"1.0\"'
            {
            match("\"1.0\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:7: ( 'encoding' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:9: 'encoding'
            {
            match("encoding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:7: ( '\"ASCII\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:9: '\"ASCII\"'
            {
            match("\"ASCII\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:7: ( 'xmi:version' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:9: 'xmi:version'
            {
            match("xmi:version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:7: ( '\"2.0\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:9: '\"2.0\"'
            {
            match("\"2.0\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:7: ( 'xmlns:xmi' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:9: 'xmlns:xmi'
            {
            match("xmlns:xmi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:7: ( 'xmlns:xsi' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:9: 'xmlns:xsi'
            {
            match("xmlns:xsi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:7: ( 'xmlns:proyectos' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:9: 'xmlns:proyectos'
            {
            match("xmlns:proyectos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:7: ( 'xsi:schemaLocation' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:9: 'xsi:schemaLocation'
            {
            match("xsi:schemaLocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:7: ( 'nombre' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:9: 'nombre'
            {
            match("nombre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:7: ( 'presentacion' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:9: 'presentacion'
            {
            match("presentacion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:7: ( 'xsi:type=\"proyectos:Promocion\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:9: 'xsi:type=\"proyectos:Promocion\"'
            {
            match("xsi:type=\"proyectos:Promocion\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:7: ( 'estilo' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:9: 'estilo'
            {
            match("estilo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:7: ( 'xsi:type=\"proyectos:Mapa\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:9: 'xsi:type=\"proyectos:Mapa\"'
            {
            match("xsi:type=\"proyectos:Mapa\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:7: ( 'xsi:type=\"proyectos:Contacto\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:9: 'xsi:type=\"proyectos:Contacto\"'
            {
            match("xsi:type=\"proyectos:Contacto\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:7: ( 'xsi:type=\"proyectos:Catalogo\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:9: 'xsi:type=\"proyectos:Catalogo\"'
            {
            match("xsi:type=\"proyectos:Catalogo\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:29:7: ( '\"empresarial\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:29:9: '\"empresarial\"'
            {
            match("\"empresarial\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:30:7: ( '\"clasico\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:30:9: '\"clasico\"'
            {
            match("\"clasico\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:31:7: ( '\"moderno\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:31:9: '\"moderno\"'
            {
            match("\"moderno\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:32:7: ( '\"profesional\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:32:9: '\"profesional\"'
            {
            match("\"profesional\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:33:7: ( '\"basico\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:33:9: '\"basico\"'
            {
            match("\"basico\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:34:7: ( '\"premium\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:34:9: '\"premium\"'
            {
            match("\"premium\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:35:7: ( '\"gold\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:35:9: '\"gold\"'
            {
            match("\"gold\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_GREATER"
    public final void mRULE_GREATER() throws RecognitionException {
        try {
            int _type = RULE_GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:14: ( '>' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER"

    // $ANTLR start "RULE_LESS"
    public final void mRULE_LESS() throws RecognitionException {
        try {
            int _type = RULE_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:822:11: ( '<' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:822:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:12: ( '/' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_TMARKETPLACE"
    public final void mRULE_TMARKETPLACE() throws RecognitionException {
        try {
            int _type = RULE_TMARKETPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:19: ( 'proyectos:MarketPlace' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:21: 'proyectos:MarketPlace'
            {
            match("proyectos:MarketPlace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TMARKETPLACE"

    // $ANTLR start "RULE_TXMI"
    public final void mRULE_TXMI() throws RecognitionException {
        try {
            int _type = RULE_TXMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:11: ( '\"http://www.omg.org/XMI\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:13: '\"http://www.omg.org/XMI\"'
            {
            match("\"http://www.omg.org/XMI\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TXMI"

    // $ANTLR start "RULE_TXSI"
    public final void mRULE_TXSI() throws RecognitionException {
        try {
            int _type = RULE_TXSI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:11: ( '\"http://www.w3.org/2001/XMLSchema-instance\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:13: '\"http://www.w3.org/2001/XMLSchema-instance\"'
            {
            match("\"http://www.w3.org/2001/XMLSchema-instance\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TXSI"

    // $ANTLR start "RULE_TPROYECTOS"
    public final void mRULE_TPROYECTOS() throws RecognitionException {
        try {
            int _type = RULE_TPROYECTOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:17: ( '\"http://www.example.org/proyectos\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:19: '\"http://www.example.org/proyectos\"'
            {
            match("\"http://www.example.org/proyectos\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TPROYECTOS"

    // $ANTLR start "RULE_SCHEMALOCATION"
    public final void mRULE_SCHEMALOCATION() throws RecognitionException {
        try {
            int _type = RULE_SCHEMALOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:21: ( '\"http://www.example.org/proyectos proyectos.ecore\"' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:23: '\"http://www.example.org/proyectos proyectos.ecore\"'
            {
            match("\"http://www.example.org/proyectos proyectos.ecore\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCHEMALOCATION"

    // $ANTLR start "RULE_TPAGINAS"
    public final void mRULE_TPAGINAS() throws RecognitionException {
        try {
            int _type = RULE_TPAGINAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:15: ( 'paginas' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:17: 'paginas'
            {
            match("paginas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TPAGINAS"

    // $ANTLR start "RULE_TPROMOCION"
    public final void mRULE_TPROMOCION() throws RecognitionException {
        try {
            int _type = RULE_TPROMOCION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:17: ( 'proyectos:Promocion' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:19: 'proyectos:Promocion'
            {
            match("proyectos:Promocion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TPROMOCION"

    // $ANTLR start "RULE_TMAPA"
    public final void mRULE_TMAPA() throws RecognitionException {
        try {
            int _type = RULE_TMAPA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:12: ( 'proyectos:Mapa' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:14: 'proyectos:Mapa'
            {
            match("proyectos:Mapa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TMAPA"

    // $ANTLR start "RULE_TTIPO"
    public final void mRULE_TTIPO() throws RecognitionException {
        try {
            int _type = RULE_TTIPO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:842:12: ( 'xsi:type' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:842:14: 'xsi:type'
            {
            match("xsi:type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TTIPO"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:844:13: ( '=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:844:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_QUESTION"
    public final void mRULE_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:15: ( '?' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:16: ( . )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_GREATER | RULE_LESS | RULE_SLASH | RULE_TMARKETPLACE | RULE_TXMI | RULE_TXSI | RULE_TPROYECTOS | RULE_SCHEMALOCATION | RULE_TPAGINAS | RULE_TPROMOCION | RULE_TMAPA | RULE_TTIPO | RULE_EQUALS | RULE_QUESTION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=46;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:40: T__30
                {
                mT__30(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:46: T__31
                {
                mT__31(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:52: T__32
                {
                mT__32(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:58: T__33
                {
                mT__33(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:64: T__34
                {
                mT__34(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:70: T__35
                {
                mT__35(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:76: T__36
                {
                mT__36(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:82: T__37
                {
                mT__37(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:88: T__38
                {
                mT__38(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:94: T__39
                {
                mT__39(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:100: T__40
                {
                mT__40(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:106: T__41
                {
                mT__41(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:112: T__42
                {
                mT__42(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:118: T__43
                {
                mT__43(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:124: T__44
                {
                mT__44(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:130: T__45
                {
                mT__45(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:136: T__46
                {
                mT__46(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:142: T__47
                {
                mT__47(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:148: T__48
                {
                mT__48(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:154: T__49
                {
                mT__49(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:160: RULE_GREATER
                {
                mRULE_GREATER(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:173: RULE_LESS
                {
                mRULE_LESS(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:183: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:194: RULE_TMARKETPLACE
                {
                mRULE_TMARKETPLACE(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:212: RULE_TXMI
                {
                mRULE_TXMI(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:222: RULE_TXSI
                {
                mRULE_TXSI(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:232: RULE_TPROYECTOS
                {
                mRULE_TPROYECTOS(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:248: RULE_SCHEMALOCATION
                {
                mRULE_SCHEMALOCATION(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:268: RULE_TPAGINAS
                {
                mRULE_TPAGINAS(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:282: RULE_TPROMOCION
                {
                mRULE_TPROMOCION(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:298: RULE_TMAPA
                {
                mRULE_TMAPA(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:309: RULE_TTIPO
                {
                mRULE_TTIPO(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:320: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:332: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:346: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:354: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:363: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:375: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:391: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:407: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:415: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\24\1\21\3\24\2\uffff\1\52\2\uffff\1\21\2\uffff\1\21"+
        "\2\uffff\2\24\1\uffff\1\24\13\uffff\5\24\11\uffff\1\104\3\24\12"+
        "\uffff\7\24\3\uffff\1\24\13\uffff\7\24\2\uffff\1\24\13\uffff\6\24"+
        "\2\uffff\1\24\13\uffff\1\24\1\u0090\1\u0091\3\24\3\uffff\1\u0098"+
        "\11\uffff\1\24\2\uffff\2\24\1\u00a4\2\uffff\1\u00a6\11\uffff\1\u00ae"+
        "\2\24\13\uffff\2\24\7\uffff\1\24\5\uffff\1\24\6\uffff\1\u00cd\153"+
        "\uffff";
    static final String DFA12_eofS =
        "\u0131\uffff";
    static final String DFA12_minS =
        "\1\0\1\155\1\145\1\0\1\156\1\157\1\141\2\uffff\1\52\2\uffff\1\101"+
        "\2\uffff\1\0\2\uffff\2\151\1\uffff\1\162\12\0\1\uffff\1\143\1\164"+
        "\1\155\1\145\1\147\11\uffff\1\60\2\72\1\163\12\0\1\157\1\151\1\142"+
        "\1\163\1\171\1\151\1\163\2\uffff\1\163\1\151\13\0\1\144\1\154\1"+
        "\162\2\145\1\156\1\72\1\uffff\1\171\1\157\1\uffff\1\0\1\uffff\10"+
        "\0\1\151\1\157\1\145\1\156\1\143\1\141\2\160\1\156\1\uffff\1\0\1"+
        "\uffff\6\0\1\uffff\1\0\1\156\2\60\2\164\1\163\1\155\1\uffff\1\145"+
        "\1\60\1\uffff\6\0\1\uffff\1\0\1\147\2\uffff\1\141\1\157\1\60\2\uffff"+
        "\1\75\2\uffff\5\0\1\uffff\1\0\1\60\1\143\1\163\1\uffff\1\42\1\uffff"+
        "\1\0\2\uffff\1\0\2\uffff\1\0\1\uffff\1\151\1\72\1\160\1\0\2\uffff"+
        "\1\0\1\uffff\1\0\1\157\1\115\1\162\3\0\1\156\1\141\1\uffff\1\157"+
        "\3\0\1\60\1\160\1\171\2\uffff\3\0\3\uffff\1\145\2\uffff\3\0\1\143"+
        "\3\0\1\164\3\0\1\157\3\0\1\163\3\0\1\72\3\0\1\103\3\0\2\uffff\1"+
        "\141\3\0\2\uffff\6\0\1\uffff\2\0\1\uffff\23\0\1\uffff\2\0\1\uffff"+
        "\17\0\1\uffff\1\0\1\uffff\6\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\145\1\uffff\1\163\1\157\1\162\2\uffff\1\57\2\uffff"+
        "\1\172\2\uffff\1\uffff\2\uffff\1\154\1\151\1\uffff\1\162\12\uffff"+
        "\1\uffff\1\143\1\164\1\155\1\157\1\147\11\uffff\1\172\2\72\1\163"+
        "\12\uffff\1\157\1\151\1\142\1\163\1\171\1\151\1\163\2\uffff\1\164"+
        "\1\151\13\uffff\1\144\1\154\1\162\2\145\1\156\1\72\1\uffff\1\171"+
        "\1\157\1\uffff\1\uffff\1\uffff\10\uffff\1\151\1\157\1\145\1\156"+
        "\1\143\1\141\1\170\1\160\1\156\1\uffff\1\uffff\1\uffff\6\uffff\1"+
        "\uffff\1\uffff\1\156\2\172\2\164\2\163\1\uffff\1\145\1\172\1\uffff"+
        "\6\uffff\1\uffff\1\uffff\1\147\2\uffff\1\141\1\157\1\172\2\uffff"+
        "\1\75\2\uffff\5\uffff\1\uffff\1\uffff\1\172\1\143\1\163\1\uffff"+
        "\1\42\1\uffff\1\uffff\2\uffff\1\uffff\2\uffff\1\uffff\1\uffff\1"+
        "\151\1\72\1\160\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\157\1"+
        "\120\1\162\3\uffff\1\156\1\141\1\uffff\1\157\3\uffff\1\172\1\162"+
        "\1\171\2\uffff\3\uffff\3\uffff\1\145\2\uffff\3\uffff\1\143\3\uffff"+
        "\1\164\3\uffff\1\157\3\uffff\1\163\3\uffff\1\72\3\uffff\1\120\3"+
        "\uffff\2\uffff\1\157\3\uffff\2\uffff\6\uffff\1\uffff\2\uffff\1\uffff"+
        "\23\uffff\1\uffff\2\uffff\1\uffff\17\uffff\1\uffff\1\uffff\1\uffff"+
        "\6\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\32\1\33\1\uffff\1\46\1\47\1\uffff\1\50\1\51\1\uffff"+
        "\1\55\1\56\2\uffff\1\50\13\uffff\1\52\5\uffff\1\32\1\33\1\53\1\54"+
        "\1\34\1\46\1\47\1\51\1\55\25\uffff\1\1\1\6\24\uffff\1\13\2\uffff"+
        "\1\3\1\uffff\1\7\21\uffff\1\3\1\uffff\1\7\6\uffff\1\31\10\uffff"+
        "\1\12\2\uffff\1\5\6\uffff\1\31\2\uffff\1\17\1\14\3\uffff\1\10\1"+
        "\11\1\uffff\1\2\1\5\5\uffff\1\27\4\uffff\1\42\1\uffff\1\45\1\uffff"+
        "\1\24\1\25\1\uffff\1\30\1\27\1\uffff\1\4\4\uffff\1\24\1\25\1\uffff"+
        "\1\30\11\uffff\1\43\7\uffff\1\23\1\26\3\uffff\1\15\1\35\1\44\1\uffff"+
        "\1\23\1\26\33\uffff\1\16\1\20\4\uffff\1\21\1\22\6\uffff\1\36\2\uffff"+
        "\1\36\23\uffff\1\40\2\uffff\1\40\17\uffff\1\37\1\uffff\1\37\6\uffff"+
        "\2\41";
    static final String DFA12_specialS =
        "\1\110\2\uffff\1\41\13\uffff\1\104\6\uffff\1\132\1\113\1\105\1"+
        "\u0086\1\u0091\1\u0096\1\141\1\156\1\173\1\40\23\uffff\1\134\1\117"+
        "\1\107\1\u0084\1\u0092\1\u0095\1\142\1\154\1\175\1\1\13\uffff\1"+
        "\127\1\116\1\106\1\u0088\1\u008f\1\u0094\1\143\1\166\1\161\1\176"+
        "\1\0\13\uffff\1\115\1\uffff\1\u0087\1\u0090\1\u0093\1\144\1\170"+
        "\1\157\1\174\1\11\12\uffff\1\114\1\uffff\1\u0081\1\u008d\1\u0099"+
        "\1\145\1\167\1\164\1\uffff\1\4\13\uffff\1\u0080\1\u008e\1\u0098"+
        "\1\146\1\171\1\162\1\uffff\1\22\13\uffff\1\u0083\1\u008c\1\u0097"+
        "\1\147\1\172\1\uffff\1\15\6\uffff\1\u0082\2\uffff\1\150\2\uffff"+
        "\1\34\4\uffff\1\u008a\2\uffff\1\151\1\uffff\1\27\3\uffff\1\u008b"+
        "\1\152\1\u0085\4\uffff\1\u0089\1\153\1\177\5\uffff\1\43\1\67\1\71"+
        "\6\uffff\1\101\1\70\1\51\1\uffff\1\100\1\63\1\52\1\uffff\1\103\1"+
        "\64\1\47\1\uffff\1\102\1\65\1\50\1\uffff\1\75\1\66\1\45\1\uffff"+
        "\1\74\1\32\1\46\1\uffff\1\77\1\31\1\42\3\uffff\1\76\1\30\1\44\2"+
        "\uffff\1\73\1\26\1\61\1\72\1\37\1\62\1\uffff\1\36\1\57\1\uffff\1"+
        "\35\1\60\1\33\1\55\1\20\1\56\1\17\1\53\1\16\1\54\1\14\1\163\1\25"+
        "\1\165\1\24\1\155\1\23\1\160\1\21\1\uffff\1\124\1\5\1\uffff\1\125"+
        "\1\6\1\120\1\2\1\121\1\3\1\122\1\12\1\123\1\13\1\135\1\7\1\136\1"+
        "\10\1\137\1\uffff\1\140\1\uffff\1\126\1\130\1\131\1\133\1\112\1"+
        "\111\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\3\4\21\1\17\7\21\1"+
            "\11\12\16\2\21\1\10\1\12\1\7\1\13\1\21\32\15\3\21\1\14\1\15"+
            "\1\21\4\15\1\4\10\15\1\5\1\15\1\6\5\15\1\2\1\15\1\1\2\15\uff85"+
            "\21",
            "\1\22\5\uffff\1\23",
            "\1\25",
            "\61\40\1\26\1\30\16\40\1\27\40\40\1\35\1\32\1\40\1\31\1\40"+
            "\1\36\1\37\4\40\1\33\2\40\1\34\uff8f\40",
            "\1\41\4\uffff\1\42",
            "\1\43",
            "\1\45\20\uffff\1\44",
            "",
            "",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\40",
            "",
            "",
            "\1\60\2\uffff\1\57",
            "\1\61",
            "",
            "\1\62",
            "\56\40\1\63\uffd1\40",
            "\123\40\1\64\uffac\40",
            "\56\40\1\65\uffd1\40",
            "\155\40\1\66\uff92\40",
            "\154\40\1\67\uff93\40",
            "\157\40\1\70\uff90\40",
            "\162\40\1\71\uff8d\40",
            "\141\40\1\72\uff9e\40",
            "\157\40\1\73\uff90\40",
            "\164\40\1\74\uff8b\40",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\11\uffff\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\103\14\24",
            "\1\105",
            "\1\106",
            "\1\107",
            "\60\40\1\110\uffcf\40",
            "\103\40\1\111\uffbc\40",
            "\60\40\1\112\uffcf\40",
            "\160\40\1\113\uff8f\40",
            "\141\40\1\114\uff9e\40",
            "\144\40\1\115\uff9b\40",
            "\145\40\1\117\11\40\1\116\uff90\40",
            "\163\40\1\120\uff8c\40",
            "\154\40\1\121\uff93\40",
            "\164\40\1\122\uff8b\40",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132\1\133",
            "\1\134",
            "\42\40\1\135\uffdd\40",
            "\111\40\1\136\uffb6\40",
            "\42\40\1\137\uffdd\40",
            "\162\40\1\140\uff8d\40",
            "\163\40\1\141\uff8c\40",
            "\145\40\1\142\uff9a\40",
            "\146\40\1\143\uff99\40",
            "\155\40\1\144\uff92\40",
            "\151\40\1\145\uff96\40",
            "\144\40\1\146\uff9b\40",
            "\160\40\1\147\uff8f\40",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\111\40\1\162\uffb6\40",
            "",
            "\145\40\1\164\uff9a\40",
            "\151\40\1\165\uff96\40",
            "\162\40\1\166\uff8d\40",
            "\145\40\1\167\uff9a\40",
            "\151\40\1\170\uff96\40",
            "\143\40\1\171\uff9c\40",
            "\42\40\1\172\uffdd\40",
            "\72\40\1\173\uffc5\40",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0083\7\uffff\1\u0082",
            "\1\u0084",
            "\1\u0085",
            "",
            "\42\40\1\u0086\uffdd\40",
            "",
            "\163\40\1\u0087\uff8c\40",
            "\143\40\1\u0088\uff9c\40",
            "\156\40\1\u0089\uff91\40",
            "\163\40\1\u008a\uff8c\40",
            "\165\40\1\u008b\uff8a\40",
            "\157\40\1\u008c\uff90\40",
            "",
            "\57\40\1\u008e\uffd0\40",
            "\1\u008f",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\5\uffff\1\u0096",
            "",
            "\1\u0097",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\141\40\1\u009a\uff9e\40",
            "\157\40\1\u009b\uff90\40",
            "\157\40\1\u009c\uff90\40",
            "\151\40\1\u009d\uff96\40",
            "\155\40\1\u009e\uff92\40",
            "\42\40\1\u009f\uffdd\40",
            "",
            "\57\40\1\u00a0\uffd0\40",
            "\1\u00a1",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\u00a5",
            "",
            "",
            "\162\40\1\u00a7\uff8d\40",
            "\42\40\1\u00a8\uffdd\40",
            "\42\40\1\u00a9\uffdd\40",
            "\157\40\1\u00aa\uff90\40",
            "\42\40\1\u00ab\uffdd\40",
            "",
            "\167\40\1\u00ad\uff88\40",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "",
            "\151\40\1\u00b2\uff96\40",
            "",
            "",
            "\156\40\1\u00b5\uff91\40",
            "",
            "",
            "\167\40\1\u00b7\uff88\40",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\141\40\1\u00bb\uff9e\40",
            "",
            "",
            "\141\40\1\u00bc\uff9e\40",
            "",
            "\167\40\1\u00bd\uff88\40",
            "\1\u00be",
            "\1\u00bf\2\uffff\1\u00c0",
            "\1\u00c1",
            "\154\40\1\u00c2\uff93\40",
            "\154\40\1\u00c3\uff93\40",
            "\56\40\1\u00c4\uffd1\40",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\42\40\1\u00c8\uffdd\40",
            "\42\40\1\u00c9\uffdd\40",
            "\145\40\1\u00cc\11\40\1\u00ca\7\40\1\u00cb\uff88\40",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u00cf\1\uffff\1\u00ce",
            "\1\u00d0",
            "",
            "",
            "\155\40\1\u00d3\uff92\40",
            "\63\40\1\u00d4\uffcc\40",
            "\170\40\1\u00d5\uff87\40",
            "",
            "",
            "",
            "\1\u00d6",
            "",
            "",
            "\147\40\1\u00d7\uff98\40",
            "\56\40\1\u00d8\uffd1\40",
            "\141\40\1\u00d9\uff9e\40",
            "\1\u00da",
            "\56\40\1\u00db\uffd1\40",
            "\157\40\1\u00dc\uff90\40",
            "\155\40\1\u00dd\uff92\40",
            "\1\u00de",
            "\157\40\1\u00df\uff90\40",
            "\162\40\1\u00e0\uff8d\40",
            "\160\40\1\u00e1\uff8f\40",
            "\1\u00e2",
            "\162\40\1\u00e3\uff8d\40",
            "\147\40\1\u00e4\uff98\40",
            "\154\40\1\u00e5\uff93\40",
            "\1\u00e6",
            "\147\40\1\u00e7\uff98\40",
            "\57\40\1\u00e8\uffd0\40",
            "\145\40\1\u00e9\uff9a\40",
            "\1\u00ea",
            "\57\40\1\u00eb\uffd0\40",
            "\62\40\1\u00ec\uffcd\40",
            "\56\40\1\u00ed\uffd1\40",
            "\1\u00f0\11\uffff\1\u00ef\2\uffff\1\u00ee",
            "\130\40\1\u00f1\uffa7\40",
            "\60\40\1\u00f2\uffcf\40",
            "\157\40\1\u00f3\uff90\40",
            "",
            "",
            "\1\u00f5\15\uffff\1\u00f4",
            "\115\40\1\u00f6\uffb2\40",
            "\60\40\1\u00f7\uffcf\40",
            "\162\40\1\u00f8\uff8d\40",
            "",
            "",
            "\111\40\1\u00f9\uffb6\40",
            "\61\40\1\u00fa\uffce\40",
            "\147\40\1\u00fb\uff98\40",
            "\42\40\1\u00fc\uffdd\40",
            "\57\40\1\u00fd\uffd0\40",
            "\57\40\1\u00fe\uffd0\40",
            "",
            "\130\40\1\u0100\uffa7\40",
            "\160\40\1\u0101\uff8f\40",
            "",
            "\115\40\1\u0102\uffb2\40",
            "\162\40\1\u0103\uff8d\40",
            "\114\40\1\u0104\uffb3\40",
            "\157\40\1\u0105\uff90\40",
            "\123\40\1\u0106\uffac\40",
            "\171\40\1\u0107\uff86\40",
            "\143\40\1\u0108\uff9c\40",
            "\145\40\1\u0109\uff9a\40",
            "\150\40\1\u010a\uff97\40",
            "\143\40\1\u010b\uff9c\40",
            "\145\40\1\u010c\uff9a\40",
            "\164\40\1\u010d\uff8b\40",
            "\155\40\1\u010e\uff92\40",
            "\157\40\1\u010f\uff90\40",
            "\141\40\1\u0110\uff9e\40",
            "\163\40\1\u0111\uff8c\40",
            "\55\40\1\u0112\uffd2\40",
            "\40\40\1\u0114\1\40\1\u0113\uffdd\40",
            "\151\40\1\u0115\uff96\40",
            "",
            "\160\40\1\u0117\uff8f\40",
            "\156\40\1\u0118\uff91\40",
            "",
            "\162\40\1\u0119\uff8d\40",
            "\163\40\1\u011a\uff8c\40",
            "\157\40\1\u011b\uff90\40",
            "\164\40\1\u011c\uff8b\40",
            "\171\40\1\u011d\uff86\40",
            "\141\40\1\u011e\uff9e\40",
            "\145\40\1\u011f\uff9a\40",
            "\156\40\1\u0120\uff91\40",
            "\143\40\1\u0121\uff9c\40",
            "\143\40\1\u0122\uff9c\40",
            "\164\40\1\u0123\uff8b\40",
            "\145\40\1\u0124\uff9a\40",
            "\157\40\1\u0125\uff90\40",
            "\42\40\1\u0126\uffdd\40",
            "\163\40\1\u0127\uff8c\40",
            "",
            "\56\40\1\u0129\uffd1\40",
            "",
            "\145\40\1\u012a\uff9a\40",
            "\143\40\1\u012b\uff9c\40",
            "\157\40\1\u012c\uff90\40",
            "\162\40\1\u012d\uff8d\40",
            "\145\40\1\u012e\uff9a\40",
            "\42\40\1\u012f\uffdd\40",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_GREATER | RULE_LESS | RULE_SLASH | RULE_TMARKETPLACE | RULE_TXMI | RULE_TXSI | RULE_TPROYECTOS | RULE_SCHEMALOCATION | RULE_TPAGINAS | RULE_TPROMOCION | RULE_TMAPA | RULE_TTIPO | RULE_EQUALS | RULE_QUESTION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        s = specialStateTransition0(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        s = specialStateTransition1(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        s = specialStateTransition2(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        s = specialStateTransition3(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        s = specialStateTransition4(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        s = specialStateTransition5(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        s = specialStateTransition6(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        s = specialStateTransition7(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        s = specialStateTransition8(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        s = specialStateTransition9(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        s = specialStateTransition10(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        s = specialStateTransition11(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        s = specialStateTransition12(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        s = specialStateTransition13(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        s = specialStateTransition14(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        s = specialStateTransition15(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        s = specialStateTransition16(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        s = specialStateTransition17(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        s = specialStateTransition18(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        s = specialStateTransition19(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        s = specialStateTransition20(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        s = specialStateTransition21(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        s = specialStateTransition22(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        s = specialStateTransition23(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        s = specialStateTransition24(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        s = specialStateTransition25(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        s = specialStateTransition26(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        s = specialStateTransition27(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        s = specialStateTransition28(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        s = specialStateTransition29(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        s = specialStateTransition30(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        s = specialStateTransition31(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        s = specialStateTransition32(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        s = specialStateTransition33(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        s = specialStateTransition34(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        s = specialStateTransition35(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        s = specialStateTransition36(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        s = specialStateTransition37(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        s = specialStateTransition38(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        s = specialStateTransition39(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        s = specialStateTransition40(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        s = specialStateTransition41(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        s = specialStateTransition42(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        s = specialStateTransition43(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        s = specialStateTransition44(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        s = specialStateTransition45(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        s = specialStateTransition46(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        s = specialStateTransition47(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        s = specialStateTransition48(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        s = specialStateTransition49(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        s = specialStateTransition50(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        s = specialStateTransition51(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        s = specialStateTransition52(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        s = specialStateTransition53(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        s = specialStateTransition54(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        s = specialStateTransition55(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        s = specialStateTransition56(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        s = specialStateTransition57(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        s = specialStateTransition58(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        s = specialStateTransition59(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        s = specialStateTransition60(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        s = specialStateTransition61(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        s = specialStateTransition62(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        s = specialStateTransition63(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        s = specialStateTransition64(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        s = specialStateTransition65(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        s = specialStateTransition66(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        s = specialStateTransition67(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        s = specialStateTransition68(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        s = specialStateTransition69(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        s = specialStateTransition70(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        s = specialStateTransition71(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        s = specialStateTransition72(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        s = specialStateTransition73(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        s = specialStateTransition74(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        s = specialStateTransition75(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        s = specialStateTransition76(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        s = specialStateTransition77(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        s = specialStateTransition78(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        s = specialStateTransition79(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        s = specialStateTransition80(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        s = specialStateTransition81(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        s = specialStateTransition82(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        s = specialStateTransition83(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        s = specialStateTransition84(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        s = specialStateTransition85(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        s = specialStateTransition86(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        s = specialStateTransition87(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        s = specialStateTransition88(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        s = specialStateTransition89(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        s = specialStateTransition90(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        s = specialStateTransition91(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        s = specialStateTransition92(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        s = specialStateTransition93(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        s = specialStateTransition94(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        s = specialStateTransition95(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        s = specialStateTransition96(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        s = specialStateTransition97(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        s = specialStateTransition98(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        s = specialStateTransition99(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        s = specialStateTransition100(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        s = specialStateTransition101(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        s = specialStateTransition102(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        s = specialStateTransition103(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        s = specialStateTransition104(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        s = specialStateTransition105(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        s = specialStateTransition106(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        s = specialStateTransition107(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        s = specialStateTransition108(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        s = specialStateTransition109(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        s = specialStateTransition110(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        s = specialStateTransition111(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        s = specialStateTransition112(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        s = specialStateTransition113(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        s = specialStateTransition114(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        s = specialStateTransition115(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        s = specialStateTransition116(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        s = specialStateTransition117(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        s = specialStateTransition118(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        s = specialStateTransition119(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        s = specialStateTransition120(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        s = specialStateTransition121(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        s = specialStateTransition122(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        s = specialStateTransition123(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        s = specialStateTransition124(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        s = specialStateTransition125(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        s = specialStateTransition126(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        s = specialStateTransition127(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        s = specialStateTransition128(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        s = specialStateTransition129(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        s = specialStateTransition130(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        s = specialStateTransition131(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        s = specialStateTransition132(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        s = specialStateTransition133(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        s = specialStateTransition134(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        s = specialStateTransition135(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        s = specialStateTransition136(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        s = specialStateTransition137(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        s = specialStateTransition138(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        s = specialStateTransition139(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        s = specialStateTransition140(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        s = specialStateTransition141(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        s = specialStateTransition142(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        s = specialStateTransition143(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        s = specialStateTransition144(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        s = specialStateTransition145(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        s = specialStateTransition146(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        s = specialStateTransition147(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        s = specialStateTransition148(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        s = specialStateTransition149(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        s = specialStateTransition150(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        s = specialStateTransition151(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        s = specialStateTransition152(input); 
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        s = specialStateTransition153(input); 
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
        protected int specialStateTransition0(IntStream input) {
            int s = -1;
            int LA12_82 = input.LA(1);
            if ( (LA12_82=='p') ) {s = 103;}
            else if ( ((LA12_82>='\u0000' && LA12_82<='o')||(LA12_82>='q' && LA12_82<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition1(IntStream input) {
            int s = -1;
            int LA12_60 = input.LA(1);
            if ( (LA12_60=='t') ) {s = 82;}
            else if ( ((LA12_60>='\u0000' && LA12_60<='s')||(LA12_60>='u' && LA12_60<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition2(IntStream input) {
            int s = -1;
            int LA12_282 = input.LA(1);
            if ( (LA12_282=='t') ) {s = 284;}
            else if ( ((LA12_282>='\u0000' && LA12_282<='s')||(LA12_282>='u' && LA12_282<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition3(IntStream input) {
            int s = -1;
            int LA12_284 = input.LA(1);
            if ( (LA12_284=='a') ) {s = 286;}
            else if ( ((LA12_284>='\u0000' && LA12_284<='`')||(LA12_284>='b' && LA12_284<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition4(IntStream input) {
            int s = -1;
            int LA12_123 = input.LA(1);
            if ( (LA12_123=='/') ) {s = 142;}
            else if ( ((LA12_123>='\u0000' && LA12_123<='.')||(LA12_123>='0' && LA12_123<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition5(IntStream input) {
            int s = -1;
            int LA12_277 = input.LA(1);
            if ( (LA12_277=='n') ) {s = 280;}
            else if ( ((LA12_277>='\u0000' && LA12_277<='m')||(LA12_277>='o' && LA12_277<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition6(IntStream input) {
            int s = -1;
            int LA12_280 = input.LA(1);
            if ( (LA12_280=='s') ) {s = 282;}
            else if ( ((LA12_280>='\u0000' && LA12_280<='r')||(LA12_280>='t' && LA12_280<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition7(IntStream input) {
            int s = -1;
            int LA12_290 = input.LA(1);
            if ( (LA12_290=='e') ) {s = 292;}
            else if ( ((LA12_290>='\u0000' && LA12_290<='d')||(LA12_290>='f' && LA12_290<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition8(IntStream input) {
            int s = -1;
            int LA12_292 = input.LA(1);
            if ( (LA12_292=='\"') ) {s = 294;}
            else if ( ((LA12_292>='\u0000' && LA12_292<='!')||(LA12_292>='#' && LA12_292<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition9(IntStream input) {
            int s = -1;
            int LA12_103 = input.LA(1);
            if ( (LA12_103==':') ) {s = 123;}
            else if ( ((LA12_103>='\u0000' && LA12_103<='9')||(LA12_103>=';' && LA12_103<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition10(IntStream input) {
            int s = -1;
            int LA12_286 = input.LA(1);
            if ( (LA12_286=='n') ) {s = 288;}
            else if ( ((LA12_286>='\u0000' && LA12_286<='m')||(LA12_286>='o' && LA12_286<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition11(IntStream input) {
            int s = -1;
            int LA12_288 = input.LA(1);
            if ( (LA12_288=='c') ) {s = 290;}
            else if ( ((LA12_288>='\u0000' && LA12_288<='b')||(LA12_288>='d' && LA12_288<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition12(IntStream input) {
            int s = -1;
            int LA12_266 = input.LA(1);
            if ( (LA12_266=='e') ) {s = 268;}
            else if ( ((LA12_266>='\u0000' && LA12_266<='d')||(LA12_266>='f' && LA12_266<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition13(IntStream input) {
            int s = -1;
            int LA12_160 = input.LA(1);
            if ( (LA12_160=='w') ) {s = 173;}
            else if ( ((LA12_160>='\u0000' && LA12_160<='v')||(LA12_160>='x' && LA12_160<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition14(IntStream input) {
            int s = -1;
            int LA12_264 = input.LA(1);
            if ( (LA12_264=='h') ) {s = 266;}
            else if ( ((LA12_264>='\u0000' && LA12_264<='g')||(LA12_264>='i' && LA12_264<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition15(IntStream input) {
            int s = -1;
            int LA12_262 = input.LA(1);
            if ( (LA12_262=='c') ) {s = 264;}
            else if ( ((LA12_262>='\u0000' && LA12_262<='b')||(LA12_262>='d' && LA12_262<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition16(IntStream input) {
            int s = -1;
            int LA12_260 = input.LA(1);
            if ( (LA12_260=='S') ) {s = 262;}
            else if ( ((LA12_260>='\u0000' && LA12_260<='R')||(LA12_260>='T' && LA12_260<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition17(IntStream input) {
            int s = -1;
            int LA12_274 = input.LA(1);
            if ( (LA12_274=='i') ) {s = 277;}
            else if ( ((LA12_274>='\u0000' && LA12_274<='h')||(LA12_274>='j' && LA12_274<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition18(IntStream input) {
            int s = -1;
            int LA12_142 = input.LA(1);
            if ( (LA12_142=='/') ) {s = 160;}
            else if ( ((LA12_142>='\u0000' && LA12_142<='.')||(LA12_142>='0' && LA12_142<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition19(IntStream input) {
            int s = -1;
            int LA12_272 = input.LA(1);
            if ( (LA12_272=='-') ) {s = 274;}
            else if ( ((LA12_272>='\u0000' && LA12_272<=',')||(LA12_272>='.' && LA12_272<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition20(IntStream input) {
            int s = -1;
            int LA12_270 = input.LA(1);
            if ( (LA12_270=='a') ) {s = 272;}
            else if ( ((LA12_270>='\u0000' && LA12_270<='`')||(LA12_270>='b' && LA12_270<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition21(IntStream input) {
            int s = -1;
            int LA12_268 = input.LA(1);
            if ( (LA12_268=='m') ) {s = 270;}
            else if ( ((LA12_268>='\u0000' && LA12_268<='l')||(LA12_268>='n' && LA12_268<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition22(IntStream input) {
            int s = -1;
            int LA12_247 = input.LA(1);
            if ( (LA12_247=='1') ) {s = 250;}
            else if ( ((LA12_247>='\u0000' && LA12_247<='0')||(LA12_247>='2' && LA12_247<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition23(IntStream input) {
            int s = -1;
            int LA12_183 = input.LA(1);
            if ( (LA12_183=='w') ) {s = 189;}
            else if ( ((LA12_183>='\u0000' && LA12_183<='v')||(LA12_183>='x' && LA12_183<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition24(IntStream input) {
            int s = -1;
            int LA12_242 = input.LA(1);
            if ( (LA12_242=='0') ) {s = 247;}
            else if ( ((LA12_242>='\u0000' && LA12_242<='/')||(LA12_242>='1' && LA12_242<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition25(IntStream input) {
            int s = -1;
            int LA12_236 = input.LA(1);
            if ( (LA12_236=='0') ) {s = 242;}
            else if ( ((LA12_236>='\u0000' && LA12_236<='/')||(LA12_236>='1' && LA12_236<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition26(IntStream input) {
            int s = -1;
            int LA12_232 = input.LA(1);
            if ( (LA12_232=='2') ) {s = 236;}
            else if ( ((LA12_232>='\u0000' && LA12_232<='1')||(LA12_232>='3' && LA12_232<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition27(IntStream input) {
            int s = -1;
            int LA12_258 = input.LA(1);
            if ( (LA12_258=='L') ) {s = 260;}
            else if ( ((LA12_258>='\u0000' && LA12_258<='K')||(LA12_258>='M' && LA12_258<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition28(IntStream input) {
            int s = -1;
            int LA12_173 = input.LA(1);
            if ( (LA12_173=='w') ) {s = 183;}
            else if ( ((LA12_173>='\u0000' && LA12_173<='v')||(LA12_173>='x' && LA12_173<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition29(IntStream input) {
            int s = -1;
            int LA12_256 = input.LA(1);
            if ( (LA12_256=='M') ) {s = 258;}
            else if ( ((LA12_256>='\u0000' && LA12_256<='L')||(LA12_256>='N' && LA12_256<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition30(IntStream input) {
            int s = -1;
            int LA12_253 = input.LA(1);
            if ( (LA12_253=='X') ) {s = 256;}
            else if ( ((LA12_253>='\u0000' && LA12_253<='W')||(LA12_253>='Y' && LA12_253<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition31(IntStream input) {
            int s = -1;
            int LA12_250 = input.LA(1);
            if ( (LA12_250=='/') ) {s = 253;}
            else if ( ((LA12_250>='\u0000' && LA12_250<='.')||(LA12_250>='0' && LA12_250<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition32(IntStream input) {
            int s = -1;
            int LA12_31 = input.LA(1);
            if ( (LA12_31=='t') ) {s = 60;}
            else if ( ((LA12_31>='\u0000' && LA12_31<='s')||(LA12_31>='u' && LA12_31<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition33(IntStream input) {
            int s = -1;
            int LA12_3 = input.LA(1);
            if ( (LA12_3=='1') ) {s = 22;}
            else if ( (LA12_3=='A') ) {s = 23;}
            else if ( (LA12_3=='2') ) {s = 24;}
            else if ( (LA12_3=='e') ) {s = 25;}
            else if ( (LA12_3=='c') ) {s = 26;}
            else if ( (LA12_3=='m') ) {s = 27;}
            else if ( (LA12_3=='p') ) {s = 28;}
            else if ( (LA12_3=='b') ) {s = 29;}
            else if ( (LA12_3=='g') ) {s = 30;}
            else if ( (LA12_3=='h') ) {s = 31;}
            else if ( ((LA12_3>='\u0000' && LA12_3<='0')||(LA12_3>='3' && LA12_3<='@')||(LA12_3>='B' && LA12_3<='a')||LA12_3=='d'||LA12_3=='f'||(LA12_3>='i' && LA12_3<='l')||(LA12_3>='n' && LA12_3<='o')||(LA12_3>='q' && LA12_3<='\uFFFF')) ) {s = 32;}
            else s = 17;
            return s;
        }
        protected int specialStateTransition34(IntStream input) {
            int s = -1;
            int LA12_237 = input.LA(1);
            if ( (LA12_237=='o') ) {s = 243;}
            else if ( ((LA12_237>='\u0000' && LA12_237<='n')||(LA12_237>='p' && LA12_237<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition35(IntStream input) {
            int s = -1;
            int LA12_202 = input.LA(1);
            if ( (LA12_202=='m') ) {s = 211;}
            else if ( ((LA12_202>='\u0000' && LA12_202<='l')||(LA12_202>='n' && LA12_202<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition36(IntStream input) {
            int s = -1;
            int LA12_243 = input.LA(1);
            if ( (LA12_243=='r') ) {s = 248;}
            else if ( ((LA12_243>='\u0000' && LA12_243<='q')||(LA12_243>='s' && LA12_243<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition37(IntStream input) {
            int s = -1;
            int LA12_229 = input.LA(1);
            if ( (LA12_229=='e') ) {s = 233;}
            else if ( ((LA12_229>='\u0000' && LA12_229<='d')||(LA12_229>='f' && LA12_229<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition38(IntStream input) {
            int s = -1;
            int LA12_233 = input.LA(1);
            if ( (LA12_233=='.') ) {s = 237;}
            else if ( ((LA12_233>='\u0000' && LA12_233<='-')||(LA12_233>='/' && LA12_233<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition39(IntStream input) {
            int s = -1;
            int LA12_221 = input.LA(1);
            if ( (LA12_221=='p') ) {s = 225;}
            else if ( ((LA12_221>='\u0000' && LA12_221<='o')||(LA12_221>='q' && LA12_221<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition40(IntStream input) {
            int s = -1;
            int LA12_225 = input.LA(1);
            if ( (LA12_225=='l') ) {s = 229;}
            else if ( ((LA12_225>='\u0000' && LA12_225<='k')||(LA12_225>='m' && LA12_225<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition41(IntStream input) {
            int s = -1;
            int LA12_213 = input.LA(1);
            if ( (LA12_213=='a') ) {s = 217;}
            else if ( ((LA12_213>='\u0000' && LA12_213<='`')||(LA12_213>='b' && LA12_213<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition42(IntStream input) {
            int s = -1;
            int LA12_217 = input.LA(1);
            if ( (LA12_217=='m') ) {s = 221;}
            else if ( ((LA12_217>='\u0000' && LA12_217<='l')||(LA12_217>='n' && LA12_217<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition43(IntStream input) {
            int s = -1;
            int LA12_263 = input.LA(1);
            if ( (LA12_263=='e') ) {s = 265;}
            else if ( ((LA12_263>='\u0000' && LA12_263<='d')||(LA12_263>='f' && LA12_263<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition44(IntStream input) {
            int s = -1;
            int LA12_265 = input.LA(1);
            if ( (LA12_265=='c') ) {s = 267;}
            else if ( ((LA12_265>='\u0000' && LA12_265<='b')||(LA12_265>='d' && LA12_265<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition45(IntStream input) {
            int s = -1;
            int LA12_259 = input.LA(1);
            if ( (LA12_259=='o') ) {s = 261;}
            else if ( ((LA12_259>='\u0000' && LA12_259<='n')||(LA12_259>='p' && LA12_259<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition46(IntStream input) {
            int s = -1;
            int LA12_261 = input.LA(1);
            if ( (LA12_261=='y') ) {s = 263;}
            else if ( ((LA12_261>='\u0000' && LA12_261<='x')||(LA12_261>='z' && LA12_261<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition47(IntStream input) {
            int s = -1;
            int LA12_254 = input.LA(1);
            if ( (LA12_254=='p') ) {s = 257;}
            else if ( ((LA12_254>='\u0000' && LA12_254<='o')||(LA12_254>='q' && LA12_254<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition48(IntStream input) {
            int s = -1;
            int LA12_257 = input.LA(1);
            if ( (LA12_257=='r') ) {s = 259;}
            else if ( ((LA12_257>='\u0000' && LA12_257<='q')||(LA12_257>='s' && LA12_257<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition49(IntStream input) {
            int s = -1;
            int LA12_248 = input.LA(1);
            if ( (LA12_248=='g') ) {s = 251;}
            else if ( ((LA12_248>='\u0000' && LA12_248<='f')||(LA12_248>='h' && LA12_248<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition50(IntStream input) {
            int s = -1;
            int LA12_251 = input.LA(1);
            if ( (LA12_251=='/') ) {s = 254;}
            else if ( ((LA12_251>='\u0000' && LA12_251<='.')||(LA12_251>='0' && LA12_251<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition51(IntStream input) {
            int s = -1;
            int LA12_216 = input.LA(1);
            if ( (LA12_216=='o') ) {s = 220;}
            else if ( ((LA12_216>='\u0000' && LA12_216<='n')||(LA12_216>='p' && LA12_216<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition52(IntStream input) {
            int s = -1;
            int LA12_220 = input.LA(1);
            if ( (LA12_220=='r') ) {s = 224;}
            else if ( ((LA12_220>='\u0000' && LA12_220<='q')||(LA12_220>='s' && LA12_220<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition53(IntStream input) {
            int s = -1;
            int LA12_224 = input.LA(1);
            if ( (LA12_224=='g') ) {s = 228;}
            else if ( ((LA12_224>='\u0000' && LA12_224<='f')||(LA12_224>='h' && LA12_224<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition54(IntStream input) {
            int s = -1;
            int LA12_228 = input.LA(1);
            if ( (LA12_228=='/') ) {s = 232;}
            else if ( ((LA12_228>='\u0000' && LA12_228<='.')||(LA12_228>='0' && LA12_228<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition55(IntStream input) {
            int s = -1;
            int LA12_203 = input.LA(1);
            if ( (LA12_203=='3') ) {s = 212;}
            else if ( ((LA12_203>='\u0000' && LA12_203<='2')||(LA12_203>='4' && LA12_203<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition56(IntStream input) {
            int s = -1;
            int LA12_212 = input.LA(1);
            if ( (LA12_212=='.') ) {s = 216;}
            else if ( ((LA12_212>='\u0000' && LA12_212<='-')||(LA12_212>='/' && LA12_212<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition57(IntStream input) {
            int s = -1;
            int LA12_204 = input.LA(1);
            if ( (LA12_204=='x') ) {s = 213;}
            else if ( ((LA12_204>='\u0000' && LA12_204<='w')||(LA12_204>='y' && LA12_204<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition58(IntStream input) {
            int s = -1;
            int LA12_249 = input.LA(1);
            if ( (LA12_249=='\"') ) {s = 252;}
            else if ( ((LA12_249>='\u0000' && LA12_249<='!')||(LA12_249>='#' && LA12_249<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition59(IntStream input) {
            int s = -1;
            int LA12_246 = input.LA(1);
            if ( (LA12_246=='I') ) {s = 249;}
            else if ( ((LA12_246>='\u0000' && LA12_246<='H')||(LA12_246>='J' && LA12_246<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition60(IntStream input) {
            int s = -1;
            int LA12_231 = input.LA(1);
            if ( (LA12_231=='/') ) {s = 235;}
            else if ( ((LA12_231>='\u0000' && LA12_231<='.')||(LA12_231>='0' && LA12_231<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition61(IntStream input) {
            int s = -1;
            int LA12_227 = input.LA(1);
            if ( (LA12_227=='g') ) {s = 231;}
            else if ( ((LA12_227>='\u0000' && LA12_227<='f')||(LA12_227>='h' && LA12_227<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition62(IntStream input) {
            int s = -1;
            int LA12_241 = input.LA(1);
            if ( (LA12_241=='M') ) {s = 246;}
            else if ( ((LA12_241>='\u0000' && LA12_241<='L')||(LA12_241>='N' && LA12_241<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition63(IntStream input) {
            int s = -1;
            int LA12_235 = input.LA(1);
            if ( (LA12_235=='X') ) {s = 241;}
            else if ( ((LA12_235>='\u0000' && LA12_235<='W')||(LA12_235>='Y' && LA12_235<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition64(IntStream input) {
            int s = -1;
            int LA12_215 = input.LA(1);
            if ( (LA12_215=='.') ) {s = 219;}
            else if ( ((LA12_215>='\u0000' && LA12_215<='-')||(LA12_215>='/' && LA12_215<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition65(IntStream input) {
            int s = -1;
            int LA12_211 = input.LA(1);
            if ( (LA12_211=='g') ) {s = 215;}
            else if ( ((LA12_211>='\u0000' && LA12_211<='f')||(LA12_211>='h' && LA12_211<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition66(IntStream input) {
            int s = -1;
            int LA12_223 = input.LA(1);
            if ( (LA12_223=='r') ) {s = 227;}
            else if ( ((LA12_223>='\u0000' && LA12_223<='q')||(LA12_223>='s' && LA12_223<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition67(IntStream input) {
            int s = -1;
            int LA12_219 = input.LA(1);
            if ( (LA12_219=='o') ) {s = 223;}
            else if ( ((LA12_219>='\u0000' && LA12_219<='n')||(LA12_219>='p' && LA12_219<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition68(IntStream input) {
            int s = -1;
            int LA12_15 = input.LA(1);
            if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 32;}
            else s = 17;
            return s;
        }
        protected int specialStateTransition69(IntStream input) {
            int s = -1;
            int LA12_24 = input.LA(1);
            if ( (LA12_24=='.') ) {s = 53;}
            else if ( ((LA12_24>='\u0000' && LA12_24<='-')||(LA12_24>='/' && LA12_24<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition70(IntStream input) {
            int s = -1;
            int LA12_74 = input.LA(1);
            if ( (LA12_74=='\"') ) {s = 95;}
            else if ( ((LA12_74>='\u0000' && LA12_74<='!')||(LA12_74>='#' && LA12_74<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition71(IntStream input) {
            int s = -1;
            int LA12_53 = input.LA(1);
            if ( (LA12_53=='0') ) {s = 74;}
            else if ( ((LA12_53>='\u0000' && LA12_53<='/')||(LA12_53>='1' && LA12_53<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition72(IntStream input) {
            int s = -1;
            int LA12_0 = input.LA(1);
            if ( (LA12_0=='x') ) {s = 1;}
            else if ( (LA12_0=='v') ) {s = 2;}
            else if ( (LA12_0=='\"') ) {s = 3;}
            else if ( (LA12_0=='e') ) {s = 4;}
            else if ( (LA12_0=='n') ) {s = 5;}
            else if ( (LA12_0=='p') ) {s = 6;}
            else if ( (LA12_0=='>') ) {s = 7;}
            else if ( (LA12_0=='<') ) {s = 8;}
            else if ( (LA12_0=='/') ) {s = 9;}
            else if ( (LA12_0=='=') ) {s = 10;}
            else if ( (LA12_0=='?') ) {s = 11;}
            else if ( (LA12_0=='^') ) {s = 12;}
            else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='m')||LA12_0=='o'||(LA12_0>='q' && LA12_0<='u')||LA12_0=='w'||(LA12_0>='y' && LA12_0<='z')) ) {s = 13;}
            else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 14;}
            else if ( (LA12_0=='\'') ) {s = 15;}
            else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 16;}
            else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||LA12_0=='@'||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 17;}
            return s;
        }
        protected int specialStateTransition73(IntStream input) {
            int s = -1;
            int LA12_302 = input.LA(1);
            if ( (LA12_302=='\"') ) {s = 303;}
            else if ( ((LA12_302>='\u0000' && LA12_302<='!')||(LA12_302>='#' && LA12_302<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition74(IntStream input) {
            int s = -1;
            int LA12_301 = input.LA(1);
            if ( (LA12_301=='e') ) {s = 302;}
            else if ( ((LA12_301>='\u0000' && LA12_301<='d')||(LA12_301>='f' && LA12_301<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition75(IntStream input) {
            int s = -1;
            int LA12_23 = input.LA(1);
            if ( (LA12_23=='S') ) {s = 52;}
            else if ( ((LA12_23>='\u0000' && LA12_23<='R')||(LA12_23>='T' && LA12_23<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition76(IntStream input) {
            int s = -1;
            int LA12_114 = input.LA(1);
            if ( (LA12_114=='\"') ) {s = 134;}
            else if ( ((LA12_114>='\u0000' && LA12_114<='!')||(LA12_114>='#' && LA12_114<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition77(IntStream input) {
            int s = -1;
            int LA12_94 = input.LA(1);
            if ( (LA12_94=='I') ) {s = 114;}
            else if ( ((LA12_94>='\u0000' && LA12_94<='H')||(LA12_94>='J' && LA12_94<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition78(IntStream input) {
            int s = -1;
            int LA12_73 = input.LA(1);
            if ( (LA12_73=='I') ) {s = 94;}
            else if ( ((LA12_73>='\u0000' && LA12_73<='H')||(LA12_73>='J' && LA12_73<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition79(IntStream input) {
            int s = -1;
            int LA12_52 = input.LA(1);
            if ( (LA12_52=='C') ) {s = 73;}
            else if ( ((LA12_52>='\u0000' && LA12_52<='B')||(LA12_52>='D' && LA12_52<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition80(IntStream input) {
            int s = -1;
            int LA12_281 = input.LA(1);
            if ( (LA12_281=='o') ) {s = 283;}
            else if ( ((LA12_281>='\u0000' && LA12_281<='n')||(LA12_281>='p' && LA12_281<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition81(IntStream input) {
            int s = -1;
            int LA12_283 = input.LA(1);
            if ( (LA12_283=='y') ) {s = 285;}
            else if ( ((LA12_283>='\u0000' && LA12_283<='x')||(LA12_283>='z' && LA12_283<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition82(IntStream input) {
            int s = -1;
            int LA12_285 = input.LA(1);
            if ( (LA12_285=='e') ) {s = 287;}
            else if ( ((LA12_285>='\u0000' && LA12_285<='d')||(LA12_285>='f' && LA12_285<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition83(IntStream input) {
            int s = -1;
            int LA12_287 = input.LA(1);
            if ( (LA12_287=='c') ) {s = 289;}
            else if ( ((LA12_287>='\u0000' && LA12_287<='b')||(LA12_287>='d' && LA12_287<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition84(IntStream input) {
            int s = -1;
            int LA12_276 = input.LA(1);
            if ( (LA12_276=='p') ) {s = 279;}
            else if ( ((LA12_276>='\u0000' && LA12_276<='o')||(LA12_276>='q' && LA12_276<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition85(IntStream input) {
            int s = -1;
            int LA12_279 = input.LA(1);
            if ( (LA12_279=='r') ) {s = 281;}
            else if ( ((LA12_279>='\u0000' && LA12_279<='q')||(LA12_279>='s' && LA12_279<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition86(IntStream input) {
            int s = -1;
            int LA12_297 = input.LA(1);
            if ( (LA12_297=='e') ) {s = 298;}
            else if ( ((LA12_297>='\u0000' && LA12_297<='d')||(LA12_297>='f' && LA12_297<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition87(IntStream input) {
            int s = -1;
            int LA12_72 = input.LA(1);
            if ( (LA12_72=='\"') ) {s = 93;}
            else if ( ((LA12_72>='\u0000' && LA12_72<='!')||(LA12_72>='#' && LA12_72<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition88(IntStream input) {
            int s = -1;
            int LA12_298 = input.LA(1);
            if ( (LA12_298=='c') ) {s = 299;}
            else if ( ((LA12_298>='\u0000' && LA12_298<='b')||(LA12_298>='d' && LA12_298<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition89(IntStream input) {
            int s = -1;
            int LA12_299 = input.LA(1);
            if ( (LA12_299=='o') ) {s = 300;}
            else if ( ((LA12_299>='\u0000' && LA12_299<='n')||(LA12_299>='p' && LA12_299<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition90(IntStream input) {
            int s = -1;
            int LA12_22 = input.LA(1);
            if ( (LA12_22=='.') ) {s = 51;}
            else if ( ((LA12_22>='\u0000' && LA12_22<='-')||(LA12_22>='/' && LA12_22<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition91(IntStream input) {
            int s = -1;
            int LA12_300 = input.LA(1);
            if ( (LA12_300=='r') ) {s = 301;}
            else if ( ((LA12_300>='\u0000' && LA12_300<='q')||(LA12_300>='s' && LA12_300<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition92(IntStream input) {
            int s = -1;
            int LA12_51 = input.LA(1);
            if ( (LA12_51=='0') ) {s = 72;}
            else if ( ((LA12_51>='\u0000' && LA12_51<='/')||(LA12_51>='1' && LA12_51<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition93(IntStream input) {
            int s = -1;
            int LA12_289 = input.LA(1);
            if ( (LA12_289=='t') ) {s = 291;}
            else if ( ((LA12_289>='\u0000' && LA12_289<='s')||(LA12_289>='u' && LA12_289<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition94(IntStream input) {
            int s = -1;
            int LA12_291 = input.LA(1);
            if ( (LA12_291=='o') ) {s = 293;}
            else if ( ((LA12_291>='\u0000' && LA12_291<='n')||(LA12_291>='p' && LA12_291<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition95(IntStream input) {
            int s = -1;
            int LA12_293 = input.LA(1);
            if ( (LA12_293=='s') ) {s = 295;}
            else if ( ((LA12_293>='\u0000' && LA12_293<='r')||(LA12_293>='t' && LA12_293<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition96(IntStream input) {
            int s = -1;
            int LA12_295 = input.LA(1);
            if ( (LA12_295=='.') ) {s = 297;}
            else if ( ((LA12_295>='\u0000' && LA12_295<='-')||(LA12_295>='/' && LA12_295<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition97(IntStream input) {
            int s = -1;
            int LA12_28 = input.LA(1);
            if ( (LA12_28=='r') ) {s = 57;}
            else if ( ((LA12_28>='\u0000' && LA12_28<='q')||(LA12_28>='s' && LA12_28<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition98(IntStream input) {
            int s = -1;
            int LA12_57 = input.LA(1);
            if ( (LA12_57=='o') ) {s = 78;}
            else if ( (LA12_57=='e') ) {s = 79;}
            else if ( ((LA12_57>='\u0000' && LA12_57<='d')||(LA12_57>='f' && LA12_57<='n')||(LA12_57>='p' && LA12_57<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition99(IntStream input) {
            int s = -1;
            int LA12_78 = input.LA(1);
            if ( (LA12_78=='f') ) {s = 99;}
            else if ( ((LA12_78>='\u0000' && LA12_78<='e')||(LA12_78>='g' && LA12_78<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition100(IntStream input) {
            int s = -1;
            int LA12_99 = input.LA(1);
            if ( (LA12_99=='e') ) {s = 119;}
            else if ( ((LA12_99>='\u0000' && LA12_99<='d')||(LA12_99>='f' && LA12_99<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition101(IntStream input) {
            int s = -1;
            int LA12_119 = input.LA(1);
            if ( (LA12_119=='s') ) {s = 138;}
            else if ( ((LA12_119>='\u0000' && LA12_119<='r')||(LA12_119>='t' && LA12_119<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition102(IntStream input) {
            int s = -1;
            int LA12_138 = input.LA(1);
            if ( (LA12_138=='i') ) {s = 157;}
            else if ( ((LA12_138>='\u0000' && LA12_138<='h')||(LA12_138>='j' && LA12_138<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition103(IntStream input) {
            int s = -1;
            int LA12_157 = input.LA(1);
            if ( (LA12_157=='o') ) {s = 170;}
            else if ( ((LA12_157>='\u0000' && LA12_157<='n')||(LA12_157>='p' && LA12_157<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition104(IntStream input) {
            int s = -1;
            int LA12_170 = input.LA(1);
            if ( (LA12_170=='n') ) {s = 181;}
            else if ( ((LA12_170>='\u0000' && LA12_170<='m')||(LA12_170>='o' && LA12_170<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition105(IntStream input) {
            int s = -1;
            int LA12_181 = input.LA(1);
            if ( (LA12_181=='a') ) {s = 188;}
            else if ( ((LA12_181>='\u0000' && LA12_181<='`')||(LA12_181>='b' && LA12_181<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition106(IntStream input) {
            int s = -1;
            int LA12_188 = input.LA(1);
            if ( (LA12_188=='l') ) {s = 195;}
            else if ( ((LA12_188>='\u0000' && LA12_188<='k')||(LA12_188>='m' && LA12_188<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition107(IntStream input) {
            int s = -1;
            int LA12_195 = input.LA(1);
            if ( (LA12_195=='\"') ) {s = 201;}
            else if ( ((LA12_195>='\u0000' && LA12_195<='!')||(LA12_195>='#' && LA12_195<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition108(IntStream input) {
            int s = -1;
            int LA12_58 = input.LA(1);
            if ( (LA12_58=='s') ) {s = 80;}
            else if ( ((LA12_58>='\u0000' && LA12_58<='r')||(LA12_58>='t' && LA12_58<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition109(IntStream input) {
            int s = -1;
            int LA12_271 = input.LA(1);
            if ( (LA12_271=='s') ) {s = 273;}
            else if ( ((LA12_271>='\u0000' && LA12_271<='r')||(LA12_271>='t' && LA12_271<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition110(IntStream input) {
            int s = -1;
            int LA12_29 = input.LA(1);
            if ( (LA12_29=='a') ) {s = 58;}
            else if ( ((LA12_29>='\u0000' && LA12_29<='`')||(LA12_29>='b' && LA12_29<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition111(IntStream input) {
            int s = -1;
            int LA12_101 = input.LA(1);
            if ( (LA12_101=='c') ) {s = 121;}
            else if ( ((LA12_101>='\u0000' && LA12_101<='b')||(LA12_101>='d' && LA12_101<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition112(IntStream input) {
            int s = -1;
            int LA12_273 = input.LA(1);
            if ( (LA12_273=='\"') ) {s = 275;}
            else if ( (LA12_273==' ') ) {s = 276;}
            else if ( ((LA12_273>='\u0000' && LA12_273<='\u001F')||LA12_273=='!'||(LA12_273>='#' && LA12_273<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition113(IntStream input) {
            int s = -1;
            int LA12_80 = input.LA(1);
            if ( (LA12_80=='i') ) {s = 101;}
            else if ( ((LA12_80>='\u0000' && LA12_80<='h')||(LA12_80>='j' && LA12_80<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition114(IntStream input) {
            int s = -1;
            int LA12_140 = input.LA(1);
            if ( (LA12_140=='\"') ) {s = 159;}
            else if ( ((LA12_140>='\u0000' && LA12_140<='!')||(LA12_140>='#' && LA12_140<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition115(IntStream input) {
            int s = -1;
            int LA12_267 = input.LA(1);
            if ( (LA12_267=='t') ) {s = 269;}
            else if ( ((LA12_267>='\u0000' && LA12_267<='s')||(LA12_267>='u' && LA12_267<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition116(IntStream input) {
            int s = -1;
            int LA12_121 = input.LA(1);
            if ( (LA12_121=='o') ) {s = 140;}
            else if ( ((LA12_121>='\u0000' && LA12_121<='n')||(LA12_121>='p' && LA12_121<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition117(IntStream input) {
            int s = -1;
            int LA12_269 = input.LA(1);
            if ( (LA12_269=='o') ) {s = 271;}
            else if ( ((LA12_269>='\u0000' && LA12_269<='n')||(LA12_269>='p' && LA12_269<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition118(IntStream input) {
            int s = -1;
            int LA12_79 = input.LA(1);
            if ( (LA12_79=='m') ) {s = 100;}
            else if ( ((LA12_79>='\u0000' && LA12_79<='l')||(LA12_79>='n' && LA12_79<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition119(IntStream input) {
            int s = -1;
            int LA12_120 = input.LA(1);
            if ( (LA12_120=='u') ) {s = 139;}
            else if ( ((LA12_120>='\u0000' && LA12_120<='t')||(LA12_120>='v' && LA12_120<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition120(IntStream input) {
            int s = -1;
            int LA12_100 = input.LA(1);
            if ( (LA12_100=='i') ) {s = 120;}
            else if ( ((LA12_100>='\u0000' && LA12_100<='h')||(LA12_100>='j' && LA12_100<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition121(IntStream input) {
            int s = -1;
            int LA12_139 = input.LA(1);
            if ( (LA12_139=='m') ) {s = 158;}
            else if ( ((LA12_139>='\u0000' && LA12_139<='l')||(LA12_139>='n' && LA12_139<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition122(IntStream input) {
            int s = -1;
            int LA12_158 = input.LA(1);
            if ( (LA12_158=='\"') ) {s = 171;}
            else if ( ((LA12_158>='\u0000' && LA12_158<='!')||(LA12_158>='#' && LA12_158<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition123(IntStream input) {
            int s = -1;
            int LA12_30 = input.LA(1);
            if ( (LA12_30=='o') ) {s = 59;}
            else if ( ((LA12_30>='\u0000' && LA12_30<='n')||(LA12_30>='p' && LA12_30<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition124(IntStream input) {
            int s = -1;
            int LA12_102 = input.LA(1);
            if ( (LA12_102=='\"') ) {s = 122;}
            else if ( ((LA12_102>='\u0000' && LA12_102<='!')||(LA12_102>='#' && LA12_102<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition125(IntStream input) {
            int s = -1;
            int LA12_59 = input.LA(1);
            if ( (LA12_59=='l') ) {s = 81;}
            else if ( ((LA12_59>='\u0000' && LA12_59<='k')||(LA12_59>='m' && LA12_59<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition126(IntStream input) {
            int s = -1;
            int LA12_81 = input.LA(1);
            if ( (LA12_81=='d') ) {s = 102;}
            else if ( ((LA12_81>='\u0000' && LA12_81<='c')||(LA12_81>='e' && LA12_81<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition127(IntStream input) {
            int s = -1;
            int LA12_196 = input.LA(1);
            if ( (LA12_196=='o') ) {s = 202;}
            else if ( (LA12_196=='w') ) {s = 203;}
            else if ( (LA12_196=='e') ) {s = 204;}
            else if ( ((LA12_196>='\u0000' && LA12_196<='d')||(LA12_196>='f' && LA12_196<='n')||(LA12_196>='p' && LA12_196<='v')||(LA12_196>='x' && LA12_196<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition128(IntStream input) {
            int s = -1;
            int LA12_135 = input.LA(1);
            if ( (LA12_135=='a') ) {s = 154;}
            else if ( ((LA12_135>='\u0000' && LA12_135<='`')||(LA12_135>='b' && LA12_135<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition129(IntStream input) {
            int s = -1;
            int LA12_116 = input.LA(1);
            if ( (LA12_116=='s') ) {s = 135;}
            else if ( ((LA12_116>='\u0000' && LA12_116<='r')||(LA12_116>='t' && LA12_116<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition130(IntStream input) {
            int s = -1;
            int LA12_167 = input.LA(1);
            if ( (LA12_167=='i') ) {s = 178;}
            else if ( ((LA12_167>='\u0000' && LA12_167<='h')||(LA12_167>='j' && LA12_167<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition131(IntStream input) {
            int s = -1;
            int LA12_154 = input.LA(1);
            if ( (LA12_154=='r') ) {s = 167;}
            else if ( ((LA12_154>='\u0000' && LA12_154<='q')||(LA12_154>='s' && LA12_154<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition132(IntStream input) {
            int s = -1;
            int LA12_54 = input.LA(1);
            if ( (LA12_54=='p') ) {s = 75;}
            else if ( ((LA12_54>='\u0000' && LA12_54<='o')||(LA12_54>='q' && LA12_54<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition133(IntStream input) {
            int s = -1;
            int LA12_189 = input.LA(1);
            if ( (LA12_189=='.') ) {s = 196;}
            else if ( ((LA12_189>='\u0000' && LA12_189<='-')||(LA12_189>='/' && LA12_189<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition134(IntStream input) {
            int s = -1;
            int LA12_25 = input.LA(1);
            if ( (LA12_25=='m') ) {s = 54;}
            else if ( ((LA12_25>='\u0000' && LA12_25<='l')||(LA12_25>='n' && LA12_25<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition135(IntStream input) {
            int s = -1;
            int LA12_96 = input.LA(1);
            if ( (LA12_96=='e') ) {s = 116;}
            else if ( ((LA12_96>='\u0000' && LA12_96<='d')||(LA12_96>='f' && LA12_96<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition136(IntStream input) {
            int s = -1;
            int LA12_75 = input.LA(1);
            if ( (LA12_75=='r') ) {s = 96;}
            else if ( ((LA12_75>='\u0000' && LA12_75<='q')||(LA12_75>='s' && LA12_75<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition137(IntStream input) {
            int s = -1;
            int LA12_194 = input.LA(1);
            if ( (LA12_194=='\"') ) {s = 200;}
            else if ( ((LA12_194>='\u0000' && LA12_194<='!')||(LA12_194>='#' && LA12_194<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition138(IntStream input) {
            int s = -1;
            int LA12_178 = input.LA(1);
            if ( (LA12_178=='a') ) {s = 187;}
            else if ( ((LA12_178>='\u0000' && LA12_178<='`')||(LA12_178>='b' && LA12_178<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition139(IntStream input) {
            int s = -1;
            int LA12_187 = input.LA(1);
            if ( (LA12_187=='l') ) {s = 194;}
            else if ( ((LA12_187>='\u0000' && LA12_187<='k')||(LA12_187>='m' && LA12_187<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition140(IntStream input) {
            int s = -1;
            int LA12_155 = input.LA(1);
            if ( (LA12_155=='\"') ) {s = 168;}
            else if ( ((LA12_155>='\u0000' && LA12_155<='!')||(LA12_155>='#' && LA12_155<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition141(IntStream input) {
            int s = -1;
            int LA12_117 = input.LA(1);
            if ( (LA12_117=='c') ) {s = 136;}
            else if ( ((LA12_117>='\u0000' && LA12_117<='b')||(LA12_117>='d' && LA12_117<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition142(IntStream input) {
            int s = -1;
            int LA12_136 = input.LA(1);
            if ( (LA12_136=='o') ) {s = 155;}
            else if ( ((LA12_136>='\u0000' && LA12_136<='n')||(LA12_136>='p' && LA12_136<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition143(IntStream input) {
            int s = -1;
            int LA12_76 = input.LA(1);
            if ( (LA12_76=='s') ) {s = 97;}
            else if ( ((LA12_76>='\u0000' && LA12_76<='r')||(LA12_76>='t' && LA12_76<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition144(IntStream input) {
            int s = -1;
            int LA12_97 = input.LA(1);
            if ( (LA12_97=='i') ) {s = 117;}
            else if ( ((LA12_97>='\u0000' && LA12_97<='h')||(LA12_97>='j' && LA12_97<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition145(IntStream input) {
            int s = -1;
            int LA12_26 = input.LA(1);
            if ( (LA12_26=='l') ) {s = 55;}
            else if ( ((LA12_26>='\u0000' && LA12_26<='k')||(LA12_26>='m' && LA12_26<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition146(IntStream input) {
            int s = -1;
            int LA12_55 = input.LA(1);
            if ( (LA12_55=='a') ) {s = 76;}
            else if ( ((LA12_55>='\u0000' && LA12_55<='`')||(LA12_55>='b' && LA12_55<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition147(IntStream input) {
            int s = -1;
            int LA12_98 = input.LA(1);
            if ( (LA12_98=='r') ) {s = 118;}
            else if ( ((LA12_98>='\u0000' && LA12_98<='q')||(LA12_98>='s' && LA12_98<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition148(IntStream input) {
            int s = -1;
            int LA12_77 = input.LA(1);
            if ( (LA12_77=='e') ) {s = 98;}
            else if ( ((LA12_77>='\u0000' && LA12_77<='d')||(LA12_77>='f' && LA12_77<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition149(IntStream input) {
            int s = -1;
            int LA12_56 = input.LA(1);
            if ( (LA12_56=='d') ) {s = 77;}
            else if ( ((LA12_56>='\u0000' && LA12_56<='c')||(LA12_56>='e' && LA12_56<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition150(IntStream input) {
            int s = -1;
            int LA12_27 = input.LA(1);
            if ( (LA12_27=='o') ) {s = 56;}
            else if ( ((LA12_27>='\u0000' && LA12_27<='n')||(LA12_27>='p' && LA12_27<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition151(IntStream input) {
            int s = -1;
            int LA12_156 = input.LA(1);
            if ( (LA12_156=='\"') ) {s = 169;}
            else if ( ((LA12_156>='\u0000' && LA12_156<='!')||(LA12_156>='#' && LA12_156<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition152(IntStream input) {
            int s = -1;
            int LA12_137 = input.LA(1);
            if ( (LA12_137=='o') ) {s = 156;}
            else if ( ((LA12_137>='\u0000' && LA12_137<='n')||(LA12_137>='p' && LA12_137<='\uFFFF')) ) {s = 32;}
            return s;
        }
        protected int specialStateTransition153(IntStream input) {
            int s = -1;
            int LA12_118 = input.LA(1);
            if ( (LA12_118=='n') ) {s = 137;}
            else if ( ((LA12_118>='\u0000' && LA12_118<='m')||(LA12_118>='o' && LA12_118<='\uFFFF')) ) {s = 32;}
            return s;
        }

    }
 

}