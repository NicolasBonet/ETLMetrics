package edu.uniandes.automatizacion.sql_crud_generator.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlCrudGeneratorLexer extends Lexer {
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

    public InternalSqlCrudGeneratorLexer() {;} 
    public InternalSqlCrudGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSqlCrudGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSqlCrudGenerator.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:11:7: ( 'CHARACTER' )
            // InternalSqlCrudGenerator.g:11:9: 'CHARACTER'
            {
            match("CHARACTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:12:7: ( 'VARCHAR' )
            // InternalSqlCrudGenerator.g:12:9: 'VARCHAR'
            {
            match("VARCHAR"); 


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
            // InternalSqlCrudGenerator.g:13:7: ( 'VARYING' )
            // InternalSqlCrudGenerator.g:13:9: 'VARYING'
            {
            match("VARYING"); 


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
            // InternalSqlCrudGenerator.g:14:7: ( 'BOOLEAN' )
            // InternalSqlCrudGenerator.g:14:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


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
            // InternalSqlCrudGenerator.g:15:7: ( 'VARBINARY' )
            // InternalSqlCrudGenerator.g:15:9: 'VARBINARY'
            {
            match("VARBINARY"); 


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
            // InternalSqlCrudGenerator.g:16:7: ( 'BINARY' )
            // InternalSqlCrudGenerator.g:16:9: 'BINARY'
            {
            match("BINARY"); 


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
            // InternalSqlCrudGenerator.g:17:7: ( 'INTEGER' )
            // InternalSqlCrudGenerator.g:17:9: 'INTEGER'
            {
            match("INTEGER"); 


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
            // InternalSqlCrudGenerator.g:18:7: ( 'SMALLINT' )
            // InternalSqlCrudGenerator.g:18:9: 'SMALLINT'
            {
            match("SMALLINT"); 


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
            // InternalSqlCrudGenerator.g:19:7: ( 'INT' )
            // InternalSqlCrudGenerator.g:19:9: 'INT'
            {
            match("INT"); 


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
            // InternalSqlCrudGenerator.g:20:7: ( 'BIGINT' )
            // InternalSqlCrudGenerator.g:20:9: 'BIGINT'
            {
            match("BIGINT"); 


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
            // InternalSqlCrudGenerator.g:21:7: ( 'DECIMAL' )
            // InternalSqlCrudGenerator.g:21:9: 'DECIMAL'
            {
            match("DECIMAL"); 


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
            // InternalSqlCrudGenerator.g:22:7: ( 'NUMERIC' )
            // InternalSqlCrudGenerator.g:22:9: 'NUMERIC'
            {
            match("NUMERIC"); 


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
            // InternalSqlCrudGenerator.g:23:7: ( 'FLOAT' )
            // InternalSqlCrudGenerator.g:23:9: 'FLOAT'
            {
            match("FLOAT"); 


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
            // InternalSqlCrudGenerator.g:24:7: ( 'REAL' )
            // InternalSqlCrudGenerator.g:24:9: 'REAL'
            {
            match("REAL"); 


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
            // InternalSqlCrudGenerator.g:25:7: ( 'DATE' )
            // InternalSqlCrudGenerator.g:25:9: 'DATE'
            {
            match("DATE"); 


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
            // InternalSqlCrudGenerator.g:26:7: ( 'TIME' )
            // InternalSqlCrudGenerator.g:26:9: 'TIME'
            {
            match("TIME"); 


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
            // InternalSqlCrudGenerator.g:27:7: ( 'TIMESTAMP' )
            // InternalSqlCrudGenerator.g:27:9: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


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
            // InternalSqlCrudGenerator.g:28:7: ( 'INTERVAL' )
            // InternalSqlCrudGenerator.g:28:9: 'INTERVAL'
            {
            match("INTERVAL"); 


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
            // InternalSqlCrudGenerator.g:29:7: ( 'ARRAY' )
            // InternalSqlCrudGenerator.g:29:9: 'ARRAY'
            {
            match("ARRAY"); 


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
            // InternalSqlCrudGenerator.g:30:7: ( 'MULTISET' )
            // InternalSqlCrudGenerator.g:30:9: 'MULTISET'
            {
            match("MULTISET"); 


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
            // InternalSqlCrudGenerator.g:31:7: ( 'XML' )
            // InternalSqlCrudGenerator.g:31:9: 'XML'
            {
            match("XML"); 


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
            // InternalSqlCrudGenerator.g:32:7: ( 'character' )
            // InternalSqlCrudGenerator.g:32:9: 'character'
            {
            match("character"); 


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
            // InternalSqlCrudGenerator.g:33:7: ( 'varchar' )
            // InternalSqlCrudGenerator.g:33:9: 'varchar'
            {
            match("varchar"); 


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
            // InternalSqlCrudGenerator.g:34:7: ( 'varying' )
            // InternalSqlCrudGenerator.g:34:9: 'varying'
            {
            match("varying"); 


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
            // InternalSqlCrudGenerator.g:35:7: ( 'boolean' )
            // InternalSqlCrudGenerator.g:35:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalSqlCrudGenerator.g:36:7: ( 'varbinary' )
            // InternalSqlCrudGenerator.g:36:9: 'varbinary'
            {
            match("varbinary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:37:7: ( 'binary' )
            // InternalSqlCrudGenerator.g:37:9: 'binary'
            {
            match("binary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:38:7: ( 'integer' )
            // InternalSqlCrudGenerator.g:38:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:39:7: ( 'smallint' )
            // InternalSqlCrudGenerator.g:39:9: 'smallint'
            {
            match("smallint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:40:7: ( 'int' )
            // InternalSqlCrudGenerator.g:40:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:41:7: ( 'bigint' )
            // InternalSqlCrudGenerator.g:41:9: 'bigint'
            {
            match("bigint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:42:7: ( 'decimal' )
            // InternalSqlCrudGenerator.g:42:9: 'decimal'
            {
            match("decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:43:7: ( 'numeric' )
            // InternalSqlCrudGenerator.g:43:9: 'numeric'
            {
            match("numeric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:44:7: ( 'float' )
            // InternalSqlCrudGenerator.g:44:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:45:7: ( 'real' )
            // InternalSqlCrudGenerator.g:45:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:46:7: ( 'date' )
            // InternalSqlCrudGenerator.g:46:9: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:47:7: ( 'time' )
            // InternalSqlCrudGenerator.g:47:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:48:7: ( 'timestamp' )
            // InternalSqlCrudGenerator.g:48:9: 'timestamp'
            {
            match("timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:49:7: ( 'interval' )
            // InternalSqlCrudGenerator.g:49:9: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:50:7: ( 'array' )
            // InternalSqlCrudGenerator.g:50:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:51:7: ( 'multiset' )
            // InternalSqlCrudGenerator.g:51:9: 'multiset'
            {
            match("multiset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:52:7: ( 'xml' )
            // InternalSqlCrudGenerator.g:52:9: 'xml'
            {
            match("xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_WNEW"
    public final void mRULE_WNEW() throws RecognitionException {
        try {
            int _type = RULE_WNEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:888:11: ( 'NEW' )
            // InternalSqlCrudGenerator.g:888:13: 'NEW'
            {
            match("NEW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WNEW"

    // $ANTLR start "RULE_WSCHEMA"
    public final void mRULE_WSCHEMA() throws RecognitionException {
        try {
            int _type = RULE_WSCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:890:14: ( 'SCHEMA' )
            // InternalSqlCrudGenerator.g:890:16: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WSCHEMA"

    // $ANTLR start "RULE_WCREATE"
    public final void mRULE_WCREATE() throws RecognitionException {
        try {
            int _type = RULE_WCREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:892:14: ( 'CREATE' )
            // InternalSqlCrudGenerator.g:892:16: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WCREATE"

    // $ANTLR start "RULE_WTABLE"
    public final void mRULE_WTABLE() throws RecognitionException {
        try {
            int _type = RULE_WTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:894:13: ( 'TABLE' )
            // InternalSqlCrudGenerator.g:894:15: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WTABLE"

    // $ANTLR start "RULE_WPRIMARY_KEY"
    public final void mRULE_WPRIMARY_KEY() throws RecognitionException {
        try {
            int _type = RULE_WPRIMARY_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:896:19: ( 'PRIMARY KEY' )
            // InternalSqlCrudGenerator.g:896:21: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WPRIMARY_KEY"

    // $ANTLR start "RULE_WFOREIGN_KEY"
    public final void mRULE_WFOREIGN_KEY() throws RecognitionException {
        try {
            int _type = RULE_WFOREIGN_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:898:19: ( 'FOREIGN KEY' )
            // InternalSqlCrudGenerator.g:898:21: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WFOREIGN_KEY"

    // $ANTLR start "RULE_WREFERENCES"
    public final void mRULE_WREFERENCES() throws RecognitionException {
        try {
            int _type = RULE_WREFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:900:18: ( 'REFERENCES' )
            // InternalSqlCrudGenerator.g:900:20: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WREFERENCES"

    // $ANTLR start "RULE_WNOT"
    public final void mRULE_WNOT() throws RecognitionException {
        try {
            int _type = RULE_WNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:902:11: ( 'NOT' )
            // InternalSqlCrudGenerator.g:902:13: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WNOT"

    // $ANTLR start "RULE_WNULL"
    public final void mRULE_WNULL() throws RecognitionException {
        try {
            int _type = RULE_WNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:904:12: ( 'NULL' )
            // InternalSqlCrudGenerator.g:904:14: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WNULL"

    // $ANTLR start "RULE_PARENTHESIS_IZQ"
    public final void mRULE_PARENTHESIS_IZQ() throws RecognitionException {
        try {
            int _type = RULE_PARENTHESIS_IZQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:906:22: ( '(' )
            // InternalSqlCrudGenerator.g:906:24: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTHESIS_IZQ"

    // $ANTLR start "RULE_PARENTHESIS_DER"
    public final void mRULE_PARENTHESIS_DER() throws RecognitionException {
        try {
            int _type = RULE_PARENTHESIS_DER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:908:22: ( ')' )
            // InternalSqlCrudGenerator.g:908:24: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTHESIS_DER"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:910:16: ( ';' )
            // InternalSqlCrudGenerator.g:910:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:912:11: ( ',' )
            // InternalSqlCrudGenerator.g:912:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrudGenerator.g:914:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSqlCrudGenerator.g:914:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSqlCrudGenerator.g:914:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSqlCrudGenerator.g:914:11: '^'
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

            // InternalSqlCrudGenerator.g:914:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSqlCrudGenerator.g:
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
            // InternalSqlCrudGenerator.g:916:10: ( ( '0' .. '9' )+ )
            // InternalSqlCrudGenerator.g:916:12: ( '0' .. '9' )+
            {
            // InternalSqlCrudGenerator.g:916:12: ( '0' .. '9' )+
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
            	    // InternalSqlCrudGenerator.g:916:13: '0' .. '9'
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
            // InternalSqlCrudGenerator.g:918:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSqlCrudGenerator.g:918:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSqlCrudGenerator.g:918:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSqlCrudGenerator.g:918:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSqlCrudGenerator.g:918:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSqlCrudGenerator.g:918:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSqlCrudGenerator.g:918:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSqlCrudGenerator.g:918:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSqlCrudGenerator.g:918:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSqlCrudGenerator.g:918:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSqlCrudGenerator.g:918:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSqlCrudGenerator.g:920:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSqlCrudGenerator.g:920:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSqlCrudGenerator.g:920:24: ( options {greedy=false; } : . )*
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
            	    // InternalSqlCrudGenerator.g:920:52: .
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
            // InternalSqlCrudGenerator.g:922:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSqlCrudGenerator.g:922:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSqlCrudGenerator.g:922:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqlCrudGenerator.g:922:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSqlCrudGenerator.g:922:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlCrudGenerator.g:922:41: ( '\\r' )? '\\n'
                    {
                    // InternalSqlCrudGenerator.g:922:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSqlCrudGenerator.g:922:41: '\\r'
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
            // InternalSqlCrudGenerator.g:924:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSqlCrudGenerator.g:924:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSqlCrudGenerator.g:924:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalSqlCrudGenerator.g:
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
            // InternalSqlCrudGenerator.g:926:16: ( . )
            // InternalSqlCrudGenerator.g:926:18: .
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
        // InternalSqlCrudGenerator.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_WNEW | RULE_WSCHEMA | RULE_WCREATE | RULE_WTABLE | RULE_WPRIMARY_KEY | RULE_WFOREIGN_KEY | RULE_WREFERENCES | RULE_WNOT | RULE_WNULL | RULE_PARENTHESIS_IZQ | RULE_PARENTHESIS_DER | RULE_SEMICOLON | RULE_COMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=62;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSqlCrudGenerator.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // InternalSqlCrudGenerator.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // InternalSqlCrudGenerator.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // InternalSqlCrudGenerator.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // InternalSqlCrudGenerator.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // InternalSqlCrudGenerator.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // InternalSqlCrudGenerator.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // InternalSqlCrudGenerator.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // InternalSqlCrudGenerator.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // InternalSqlCrudGenerator.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // InternalSqlCrudGenerator.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // InternalSqlCrudGenerator.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // InternalSqlCrudGenerator.g:1:82: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // InternalSqlCrudGenerator.g:1:88: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // InternalSqlCrudGenerator.g:1:94: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // InternalSqlCrudGenerator.g:1:100: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // InternalSqlCrudGenerator.g:1:106: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // InternalSqlCrudGenerator.g:1:112: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // InternalSqlCrudGenerator.g:1:118: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // InternalSqlCrudGenerator.g:1:124: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // InternalSqlCrudGenerator.g:1:130: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // InternalSqlCrudGenerator.g:1:136: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // InternalSqlCrudGenerator.g:1:142: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // InternalSqlCrudGenerator.g:1:148: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // InternalSqlCrudGenerator.g:1:154: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // InternalSqlCrudGenerator.g:1:160: T__49
                {
                mT__49(); 

                }
                break;
            case 27 :
                // InternalSqlCrudGenerator.g:1:166: T__50
                {
                mT__50(); 

                }
                break;
            case 28 :
                // InternalSqlCrudGenerator.g:1:172: T__51
                {
                mT__51(); 

                }
                break;
            case 29 :
                // InternalSqlCrudGenerator.g:1:178: T__52
                {
                mT__52(); 

                }
                break;
            case 30 :
                // InternalSqlCrudGenerator.g:1:184: T__53
                {
                mT__53(); 

                }
                break;
            case 31 :
                // InternalSqlCrudGenerator.g:1:190: T__54
                {
                mT__54(); 

                }
                break;
            case 32 :
                // InternalSqlCrudGenerator.g:1:196: T__55
                {
                mT__55(); 

                }
                break;
            case 33 :
                // InternalSqlCrudGenerator.g:1:202: T__56
                {
                mT__56(); 

                }
                break;
            case 34 :
                // InternalSqlCrudGenerator.g:1:208: T__57
                {
                mT__57(); 

                }
                break;
            case 35 :
                // InternalSqlCrudGenerator.g:1:214: T__58
                {
                mT__58(); 

                }
                break;
            case 36 :
                // InternalSqlCrudGenerator.g:1:220: T__59
                {
                mT__59(); 

                }
                break;
            case 37 :
                // InternalSqlCrudGenerator.g:1:226: T__60
                {
                mT__60(); 

                }
                break;
            case 38 :
                // InternalSqlCrudGenerator.g:1:232: T__61
                {
                mT__61(); 

                }
                break;
            case 39 :
                // InternalSqlCrudGenerator.g:1:238: T__62
                {
                mT__62(); 

                }
                break;
            case 40 :
                // InternalSqlCrudGenerator.g:1:244: T__63
                {
                mT__63(); 

                }
                break;
            case 41 :
                // InternalSqlCrudGenerator.g:1:250: T__64
                {
                mT__64(); 

                }
                break;
            case 42 :
                // InternalSqlCrudGenerator.g:1:256: T__65
                {
                mT__65(); 

                }
                break;
            case 43 :
                // InternalSqlCrudGenerator.g:1:262: RULE_WNEW
                {
                mRULE_WNEW(); 

                }
                break;
            case 44 :
                // InternalSqlCrudGenerator.g:1:272: RULE_WSCHEMA
                {
                mRULE_WSCHEMA(); 

                }
                break;
            case 45 :
                // InternalSqlCrudGenerator.g:1:285: RULE_WCREATE
                {
                mRULE_WCREATE(); 

                }
                break;
            case 46 :
                // InternalSqlCrudGenerator.g:1:298: RULE_WTABLE
                {
                mRULE_WTABLE(); 

                }
                break;
            case 47 :
                // InternalSqlCrudGenerator.g:1:310: RULE_WPRIMARY_KEY
                {
                mRULE_WPRIMARY_KEY(); 

                }
                break;
            case 48 :
                // InternalSqlCrudGenerator.g:1:328: RULE_WFOREIGN_KEY
                {
                mRULE_WFOREIGN_KEY(); 

                }
                break;
            case 49 :
                // InternalSqlCrudGenerator.g:1:346: RULE_WREFERENCES
                {
                mRULE_WREFERENCES(); 

                }
                break;
            case 50 :
                // InternalSqlCrudGenerator.g:1:363: RULE_WNOT
                {
                mRULE_WNOT(); 

                }
                break;
            case 51 :
                // InternalSqlCrudGenerator.g:1:373: RULE_WNULL
                {
                mRULE_WNULL(); 

                }
                break;
            case 52 :
                // InternalSqlCrudGenerator.g:1:384: RULE_PARENTHESIS_IZQ
                {
                mRULE_PARENTHESIS_IZQ(); 

                }
                break;
            case 53 :
                // InternalSqlCrudGenerator.g:1:405: RULE_PARENTHESIS_DER
                {
                mRULE_PARENTHESIS_DER(); 

                }
                break;
            case 54 :
                // InternalSqlCrudGenerator.g:1:426: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 55 :
                // InternalSqlCrudGenerator.g:1:441: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 56 :
                // InternalSqlCrudGenerator.g:1:451: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // InternalSqlCrudGenerator.g:1:459: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 58 :
                // InternalSqlCrudGenerator.g:1:468: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // InternalSqlCrudGenerator.g:1:480: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // InternalSqlCrudGenerator.g:1:496: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalSqlCrudGenerator.g:1:512: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // InternalSqlCrudGenerator.g:1:520: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\33\52\4\uffff\1\47\2\uffff\3\47\2\uffff\2\52\1\uffff\43\52\11\uffff\6\52\1\u0089\6\52\1\u0090\1\u0091\10\52\1\u009a\5\52\1\u00a3\11\52\1\u00ad\12\52\1\uffff\3\52\1\u00bc\1\52\1\u00be\2\uffff\2\52\1\u00c1\1\52\1\u00c4\3\52\1\uffff\10\52\1\uffff\2\52\1\u00d3\2\52\1\u00d6\1\u00d8\2\52\1\uffff\16\52\1\uffff\1\52\1\uffff\1\u00ea\1\52\1\uffff\2\52\1\uffff\1\u00ee\1\u00ef\14\52\1\uffff\1\52\1\u00fd\1\uffff\1\52\1\uffff\1\u00ff\3\52\1\u0103\4\52\1\u0108\1\u0109\3\52\1\u010d\2\52\1\uffff\3\52\2\uffff\6\52\1\u0119\1\u011a\5\52\1\uffff\1\52\1\uffff\3\52\1\uffff\1\u0124\1\u0125\1\52\1\u0127\2\uffff\1\u0128\2\52\1\uffff\1\u012b\1\u012c\5\52\1\u0132\1\u0133\1\52\1\u0135\2\uffff\1\u0136\2\52\1\u0139\1\u013a\4\52\2\uffff\1\52\2\uffff\1\u0140\1\u0141\3\uffff\2\52\1\u0144\1\52\2\uffff\1\52\2\uffff\1\u0147\1\u0148\2\uffff\1\52\1\u014a\1\uffff\1\u014b\1\u014c\2\uffff\1\52\1\u014e\1\uffff\1\u014f\1\u0150\2\uffff\1\u0151\3\uffff\1\u0152\5\uffff";
    static final String DFA12_eofS =
        "\u0153\uffff";
    static final String DFA12_minS =
        "\1\0\1\110\1\101\1\111\1\116\1\103\1\101\1\105\1\114\1\105\1\101\1\122\1\125\1\115\1\150\1\141\1\151\1\156\1\155\1\141\1\165\1\154\1\145\1\151\1\162\1\165\1\155\1\122\4\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\101\1\105\1\uffff\1\122\1\117\1\107\1\124\1\101\1\110\1\103\1\124\1\114\1\127\1\124\1\117\1\122\1\101\1\115\1\102\1\122\2\114\1\141\1\162\1\157\1\147\1\164\1\141\1\143\1\164\1\155\1\157\1\141\1\155\1\162\2\154\1\111\11\uffff\1\122\1\101\1\102\1\114\1\101\1\111\1\60\1\114\1\105\1\111\2\105\1\114\2\60\1\101\1\105\1\114\2\105\1\114\1\101\1\124\1\60\1\162\1\142\1\154\1\141\1\151\1\60\1\154\1\151\2\145\1\141\1\154\1\145\1\141\1\164\1\60\1\115\1\101\1\124\1\110\2\111\1\105\1\122\1\116\1\107\1\uffff\1\114\2\115\1\60\1\122\1\60\2\uffff\1\124\1\111\1\60\1\122\1\60\1\105\1\131\1\111\1\uffff\1\141\1\150\2\151\1\145\1\162\1\156\1\147\1\uffff\1\154\1\155\1\60\1\162\1\164\2\60\1\171\1\151\1\uffff\1\101\1\103\1\105\1\101\2\116\1\101\1\131\1\124\1\105\1\126\1\111\2\101\1\uffff\1\111\1\uffff\1\60\1\107\1\uffff\1\105\1\124\1\uffff\2\60\1\123\1\143\1\141\2\156\1\141\1\171\1\164\1\145\1\166\1\151\1\141\1\uffff\1\151\1\60\1\uffff\1\164\1\uffff\1\60\1\163\1\122\1\124\1\60\1\122\1\107\1\101\1\116\2\60\1\122\1\101\1\116\1\60\1\114\1\103\1\uffff\2\116\1\101\2\uffff\1\105\1\164\1\162\1\147\1\141\1\156\2\60\1\162\1\141\1\156\1\154\1\143\1\uffff\1\141\1\uffff\1\145\1\131\1\105\1\uffff\2\60\1\122\1\60\2\uffff\1\60\1\114\1\124\1\uffff\2\60\1\40\1\103\1\115\1\124\1\145\2\60\1\162\1\60\2\uffff\1\60\1\154\1\164\2\60\1\155\1\164\1\40\1\122\2\uffff\1\131\2\uffff\2\60\3\uffff\1\105\1\120\1\60\1\162\2\uffff\1\171\2\uffff\2\60\2\uffff\1\160\1\60\1\uffff\2\60\2\uffff\1\123\1\60\1\uffff\2\60\2\uffff\1\60\3\uffff\1\60\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\122\1\101\1\117\1\116\1\115\1\105\1\125\1\117\1\105\1\111\1\122\1\125\1\115\1\150\1\141\1\157\1\156\1\155\1\145\1\165\1\154\1\145\1\151\1\162\1\165\1\155\1\122\4\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\101\1\105\1\uffff\1\122\1\117\1\116\1\124\1\101\1\110\1\103\1\124\1\115\1\127\1\124\1\117\1\122\1\106\1\115\1\102\1\122\2\114\1\141\1\162\1\157\1\156\1\164\1\141\1\143\1\164\1\155\1\157\1\141\1\155\1\162\2\154\1\111\11\uffff\1\122\1\101\1\131\1\114\1\101\1\111\1\172\1\114\1\105\1\111\2\105\1\114\2\172\1\101\1\105\1\114\2\105\1\114\1\101\1\124\1\172\1\162\1\171\1\154\1\141\1\151\1\172\1\154\1\151\2\145\1\141\1\154\1\145\1\141\1\164\1\172\1\115\1\101\1\124\1\110\2\111\1\105\1\122\1\116\1\122\1\uffff\1\114\2\115\1\172\1\122\1\172\2\uffff\1\124\1\111\1\172\1\122\1\172\1\105\1\131\1\111\1\uffff\1\141\1\150\2\151\1\145\1\162\1\156\1\162\1\uffff\1\154\1\155\1\172\1\162\1\164\2\172\1\171\1\151\1\uffff\1\101\1\103\1\105\1\101\2\116\1\101\1\131\1\124\1\105\1\126\1\111\2\101\1\uffff\1\111\1\uffff\1\172\1\107\1\uffff\1\105\1\124\1\uffff\2\172\1\123\1\143\1\141\2\156\1\141\1\171\1\164\1\145\1\166\1\151\1\141\1\uffff\1\151\1\172\1\uffff\1\164\1\uffff\1\172\1\163\1\122\1\124\1\172\1\122\1\107\1\101\1\116\2\172\1\122\1\101\1\116\1\172\1\114\1\103\1\uffff\2\116\1\101\2\uffff\1\105\1\164\1\162\1\147\1\141\1\156\2\172\1\162\1\141\1\156\1\154\1\143\1\uffff\1\141\1\uffff\1\145\1\131\1\105\1\uffff\2\172\1\122\1\172\2\uffff\1\172\1\114\1\124\1\uffff\2\172\1\40\1\103\1\115\1\124\1\145\2\172\1\162\1\172\2\uffff\1\172\1\154\1\164\2\172\1\155\1\164\1\40\1\122\2\uffff\1\131\2\uffff\2\172\3\uffff\1\105\1\120\1\172\1\162\2\uffff\1\171\2\uffff\2\172\2\uffff\1\160\1\172\1\uffff\2\172\2\uffff\1\123\1\172\1\uffff\2\172\2\uffff\1\172\3\uffff\1\172\5\uffff";
    static final String DFA12_acceptS =
        "\34\uffff\1\64\1\65\1\66\1\67\1\uffff\1\70\1\71\3\uffff\1\75\1\76\2\uffff\1\70\43\uffff\1\64\1\65\1\66\1\67\1\71\1\72\1\73\1\74\1\75\62\uffff\1\11\6\uffff\1\53\1\62\10\uffff\1\25\10\uffff\1\36\11\uffff\1\52\16\uffff\1\17\1\uffff\1\63\2\uffff\1\16\2\uffff\1\20\16\uffff\1\44\2\uffff\1\43\1\uffff\1\45\21\uffff\1\15\3\uffff\1\56\1\23\15\uffff\1\42\1\uffff\1\50\3\uffff\1\55\4\uffff\1\6\1\12\3\uffff\1\54\13\uffff\1\33\1\37\11\uffff\1\2\1\3\1\uffff\1\4\1\7\2\uffff\1\13\1\14\1\60\4\uffff\1\27\1\30\1\uffff\1\31\1\34\2\uffff\1\40\1\41\2\uffff\1\57\2\uffff\1\22\1\10\2\uffff\1\24\2\uffff\1\47\1\35\1\uffff\1\51\1\1\1\5\1\uffff\1\21\1\26\1\32\1\46\1\61";
    static final String DFA12_specialS =
        "\1\1\42\uffff\1\2\1\0\u012e\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\43\4\47\1\44\1\34\1\35\2\47\1\37\2\47\1\45\12\42\1\47\1\36\5\47\1\13\1\3\1\1\1\6\1\41\1\10\2\41\1\4\3\41\1\14\1\7\1\41\1\33\1\41\1\11\1\5\1\12\1\41\1\2\1\41\1\15\2\41\3\47\1\40\1\41\1\47\1\30\1\20\1\16\1\23\1\41\1\25\2\41\1\21\3\41\1\31\1\24\3\41\1\26\1\22\1\27\1\41\1\17\1\41\1\32\2\41\uff85\47",
            "\1\50\11\uffff\1\51",
            "\1\53",
            "\1\55\5\uffff\1\54",
            "\1\56",
            "\1\60\11\uffff\1\57",
            "\1\62\3\uffff\1\61",
            "\1\64\11\uffff\1\65\5\uffff\1\63",
            "\1\66\2\uffff\1\67",
            "\1\70",
            "\1\72\7\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\5\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\105\3\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\123",
            "\0\123",
            "\1\124\4\uffff\1\125",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\134\6\uffff\1\133",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\143\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150\4\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\163\6\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0084\1\u0082\25\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\52\7\uffff\4\52\1\u0088\25\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009b",
            "\1\u009e\1\u009c\25\uffff\1\u009d",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00a2\25\52",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\12\uffff\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c2",
            "\12\52\7\uffff\22\52\1\u00c3\7\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\12\uffff\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d4",
            "\1\u00d5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00d7\7\52",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00fe",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0126",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0129",
            "\1\u012a",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0134",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0137",
            "\1\u0138",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "",
            "\1\u013f",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u0142",
            "\1\u0143",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0145",
            "",
            "",
            "\1\u0146",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u0149",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u014d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
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

    class DFA12 extends DFA {

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
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_WNEW | RULE_WSCHEMA | RULE_WCREATE | RULE_WTABLE | RULE_WPRIMARY_KEY | RULE_WFOREIGN_KEY | RULE_WREFERENCES | RULE_WNOT | RULE_WNULL | RULE_PARENTHESIS_IZQ | RULE_PARENTHESIS_DER | RULE_SEMICOLON | RULE_COMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 83;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='C') ) {s = 1;}

                        else if ( (LA12_0=='V') ) {s = 2;}

                        else if ( (LA12_0=='B') ) {s = 3;}

                        else if ( (LA12_0=='I') ) {s = 4;}

                        else if ( (LA12_0=='S') ) {s = 5;}

                        else if ( (LA12_0=='D') ) {s = 6;}

                        else if ( (LA12_0=='N') ) {s = 7;}

                        else if ( (LA12_0=='F') ) {s = 8;}

                        else if ( (LA12_0=='R') ) {s = 9;}

                        else if ( (LA12_0=='T') ) {s = 10;}

                        else if ( (LA12_0=='A') ) {s = 11;}

                        else if ( (LA12_0=='M') ) {s = 12;}

                        else if ( (LA12_0=='X') ) {s = 13;}

                        else if ( (LA12_0=='c') ) {s = 14;}

                        else if ( (LA12_0=='v') ) {s = 15;}

                        else if ( (LA12_0=='b') ) {s = 16;}

                        else if ( (LA12_0=='i') ) {s = 17;}

                        else if ( (LA12_0=='s') ) {s = 18;}

                        else if ( (LA12_0=='d') ) {s = 19;}

                        else if ( (LA12_0=='n') ) {s = 20;}

                        else if ( (LA12_0=='f') ) {s = 21;}

                        else if ( (LA12_0=='r') ) {s = 22;}

                        else if ( (LA12_0=='t') ) {s = 23;}

                        else if ( (LA12_0=='a') ) {s = 24;}

                        else if ( (LA12_0=='m') ) {s = 25;}

                        else if ( (LA12_0=='x') ) {s = 26;}

                        else if ( (LA12_0=='P') ) {s = 27;}

                        else if ( (LA12_0=='(') ) {s = 28;}

                        else if ( (LA12_0==')') ) {s = 29;}

                        else if ( (LA12_0==';') ) {s = 30;}

                        else if ( (LA12_0==',') ) {s = 31;}

                        else if ( (LA12_0=='^') ) {s = 32;}

                        else if ( (LA12_0=='E'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='O'||LA12_0=='Q'||LA12_0=='U'||LA12_0=='W'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='o' && LA12_0<='q')||LA12_0=='u'||LA12_0=='w'||(LA12_0>='y' && LA12_0<='z')) ) {s = 33;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 34;}

                        else if ( (LA12_0=='\"') ) {s = 35;}

                        else if ( (LA12_0=='\'') ) {s = 36;}

                        else if ( (LA12_0=='/') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 83;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}