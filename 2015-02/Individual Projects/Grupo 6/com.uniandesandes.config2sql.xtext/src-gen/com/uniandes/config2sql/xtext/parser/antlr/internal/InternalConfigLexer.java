package com.uniandes.config2sql.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigLexer extends Lexer {
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

    public InternalConfigLexer() {;} 
    public InternalConfigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalConfigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:11:7: ( '\\'String\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:11:9: '\\'String\\''
            {
            match("'String'"); 


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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:12:7: ( '\\'Integer\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:12:9: '\\'Integer\\''
            {
            match("'Integer'"); 


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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:13:7: ( '\\'Float\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:13:9: '\\'Float\\''
            {
            match("'Float'"); 


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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:14:7: ( '\\'Array\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:14:9: '\\'Array\\''
            {
            match("'Array'"); 


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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:15:7: ( '\\'Boolean\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:15:9: '\\'Boolean\\''
            {
            match("'Boolean'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_LITERACONFIG"
    public final void mRULE_LITERACONFIG() throws RecognitionException {
        try {
            int _type = RULE_LITERACONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:646:19: ( '\\'config\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:646:21: '\\'config\\''
            {
            match("'config'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERACONFIG"

    // $ANTLR start "RULE_LITERACONNECTION"
    public final void mRULE_LITERACONNECTION() throws RecognitionException {
        try {
            int _type = RULE_LITERACONNECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:648:23: ( '\\'connection\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:648:25: '\\'connection\\''
            {
            match("'connection'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERACONNECTION"

    // $ANTLR start "RULE_LITERALMERGEDFIELDS"
    public final void mRULE_LITERALMERGEDFIELDS() throws RecognitionException {
        try {
            int _type = RULE_LITERALMERGEDFIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:650:26: ( '\\'mergeFields\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:650:28: '\\'mergeFields\\':'
            {
            match("'mergeFields':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALMERGEDFIELDS"

    // $ANTLR start "RULE_LITERALTABLENAME"
    public final void mRULE_LITERALTABLENAME() throws RecognitionException {
        try {
            int _type = RULE_LITERALTABLENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:652:23: ( '\\'tableName\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:652:25: '\\'tableName\\':'
            {
            match("'tableName':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALTABLENAME"

    // $ANTLR start "RULE_LITERALFIELDS"
    public final void mRULE_LITERALFIELDS() throws RecognitionException {
        try {
            int _type = RULE_LITERALFIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:654:20: ( '\\'fields\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:654:22: '\\'fields\\':'
            {
            match("'fields':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALFIELDS"

    // $ANTLR start "RULE_LITERALATTRIBUTENAMES"
    public final void mRULE_LITERALATTRIBUTENAMES() throws RecognitionException {
        try {
            int _type = RULE_LITERALATTRIBUTENAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:656:28: ( '\\'attributeNames\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:656:30: '\\'attributeNames\\':'
            {
            match("'attributeNames':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALATTRIBUTENAMES"

    // $ANTLR start "RULE_LITERALURL"
    public final void mRULE_LITERALURL() throws RecognitionException {
        try {
            int _type = RULE_LITERALURL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:658:17: ( '\\'url\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:658:19: '\\'url\\':'
            {
            match("'url':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALURL"

    // $ANTLR start "RULE_LITERALUSERNAME"
    public final void mRULE_LITERALUSERNAME() throws RecognitionException {
        try {
            int _type = RULE_LITERALUSERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:660:22: ( '\\'username\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:660:24: '\\'username\\':'
            {
            match("'username':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALUSERNAME"

    // $ANTLR start "RULE_LITERALPASSWORD"
    public final void mRULE_LITERALPASSWORD() throws RecognitionException {
        try {
            int _type = RULE_LITERALPASSWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:662:22: ( '\\'password\\':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:662:24: '\\'password\\':'
            {
            match("'password':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALPASSWORD"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:664:12: ( ':' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:664:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:666:11: ( ',' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:666:13: ','
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

    // $ANTLR start "RULE_LEFTPARENTESIS"
    public final void mRULE_LEFTPARENTESIS() throws RecognitionException {
        try {
            int _type = RULE_LEFTPARENTESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:668:21: ( '{' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:668:23: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFTPARENTESIS"

    // $ANTLR start "RULE_LEFTBRACKET"
    public final void mRULE_LEFTBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:670:18: ( '[' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:670:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFTBRACKET"

    // $ANTLR start "RULE_RIGHTBRACKET"
    public final void mRULE_RIGHTBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:672:19: ( ']' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:672:21: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHTBRACKET"

    // $ANTLR start "RULE_RIGHTPARENTESIS"
    public final void mRULE_RIGHTPARENTESIS() throws RecognitionException {
        try {
            int _type = RULE_RIGHTPARENTESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:674:22: ( '}' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:674:24: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHTPARENTESIS"

    // $ANTLR start "RULE_SINGLEQUOTE"
    public final void mRULE_SINGLEQUOTE() throws RecognitionException {
        try {
            int _type = RULE_SINGLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:676:18: ( '\\'' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:676:20: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLEQUOTE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:678:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:678:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:678:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:678:11: '^'
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

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:678:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:
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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:680:10: ( ( '0' .. '9' )+ )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:680:12: ( '0' .. '9' )+
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:680:12: ( '0' .. '9' )+
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
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:680:13: '0' .. '9'
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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:682:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:684:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:684:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:684:24: ( options {greedy=false; } : . )*
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
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:684:52: .
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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:41: ( '\\r' )? '\\n'
                    {
                    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:686:41: '\\r'
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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:688:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:688:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:688:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:
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
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:690:16: ( . )
            // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:690:18: .
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
        // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | RULE_LITERACONFIG | RULE_LITERACONNECTION | RULE_LITERALMERGEDFIELDS | RULE_LITERALTABLENAME | RULE_LITERALFIELDS | RULE_LITERALATTRIBUTENAMES | RULE_LITERALURL | RULE_LITERALUSERNAME | RULE_LITERALPASSWORD | RULE_COLON | RULE_COMA | RULE_LEFTPARENTESIS | RULE_LEFTBRACKET | RULE_RIGHTBRACKET | RULE_RIGHTPARENTESIS | RULE_SINGLEQUOTE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:40: RULE_LITERACONFIG
                {
                mRULE_LITERACONFIG(); 

                }
                break;
            case 7 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:58: RULE_LITERACONNECTION
                {
                mRULE_LITERACONNECTION(); 

                }
                break;
            case 8 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:80: RULE_LITERALMERGEDFIELDS
                {
                mRULE_LITERALMERGEDFIELDS(); 

                }
                break;
            case 9 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:105: RULE_LITERALTABLENAME
                {
                mRULE_LITERALTABLENAME(); 

                }
                break;
            case 10 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:127: RULE_LITERALFIELDS
                {
                mRULE_LITERALFIELDS(); 

                }
                break;
            case 11 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:146: RULE_LITERALATTRIBUTENAMES
                {
                mRULE_LITERALATTRIBUTENAMES(); 

                }
                break;
            case 12 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:173: RULE_LITERALURL
                {
                mRULE_LITERALURL(); 

                }
                break;
            case 13 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:189: RULE_LITERALUSERNAME
                {
                mRULE_LITERALUSERNAME(); 

                }
                break;
            case 14 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:210: RULE_LITERALPASSWORD
                {
                mRULE_LITERALPASSWORD(); 

                }
                break;
            case 15 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:231: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 16 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:242: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 17 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:252: RULE_LEFTPARENTESIS
                {
                mRULE_LEFTPARENTESIS(); 

                }
                break;
            case 18 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:272: RULE_LEFTBRACKET
                {
                mRULE_LEFTBRACKET(); 

                }
                break;
            case 19 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:289: RULE_RIGHTBRACKET
                {
                mRULE_RIGHTBRACKET(); 

                }
                break;
            case 20 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:307: RULE_RIGHTPARENTESIS
                {
                mRULE_RIGHTPARENTESIS(); 

                }
                break;
            case 21 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:328: RULE_SINGLEQUOTE
                {
                mRULE_SINGLEQUOTE(); 

                }
                break;
            case 22 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:345: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:353: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:362: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:374: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:390: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:406: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../com.uniandesandes.config2sql.xtext/src-gen/com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.g:1:414: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\34\6\uffff\1\16\2\uffff\2\16\100\uffff\1\33\46\uffff"+
        "\1\33\24\uffff\2\33\2\uffff\1\33\10\uffff\1\33\4\uffff\1\33\1\uffff";
    static final String DFA12_eofS =
        "\u009d\uffff";
    static final String DFA12_minS =
        "\2\0\6\uffff\1\101\2\uffff\1\0\1\52\2\uffff\14\0\15\uffff\45\0"+
        "\1\72\15\0\1\uffff\4\0\2\uffff\11\0\1\uffff\1\0\2\uffff\1\0\1\uffff"+
        "\3\0\1\72\3\0\4\uffff\3\0\1\uffff\3\0\2\uffff\4\0\2\72\2\0\1\72"+
        "\1\0\3\uffff\1\0\1\uffff\1\0\1\uffff\1\72\1\0\1\uffff\2\0\1\72\1"+
        "\uffff";
    static final String DFA12_maxS =
        "\2\uffff\6\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\14\uffff\15"+
        "\uffff\45\uffff\1\72\15\uffff\1\uffff\4\uffff\2\uffff\11\uffff\1"+
        "\uffff\1\uffff\2\uffff\1\uffff\1\uffff\3\uffff\1\72\3\uffff\4\uffff"+
        "\3\uffff\1\uffff\3\uffff\2\uffff\4\uffff\2\72\2\uffff\1\72\1\uffff"+
        "\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\72\1\uffff\1\uffff\2"+
        "\uffff\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\26\1\27\2\uffff"+
        "\1\33\1\34\14\uffff\1\30\1\25\1\17\1\20\1\21\1\22\1\23\1\24\1\26"+
        "\1\27\1\31\1\32\1\33\63\uffff\1\14\4\uffff\1\3\1\4\11\uffff\1\1"+
        "\1\uffff\1\3\1\4\1\uffff\1\6\7\uffff\1\1\1\2\1\5\1\6\3\uffff\1\12"+
        "\3\uffff\1\2\1\5\12\uffff\1\15\1\16\1\7\1\uffff\1\11\1\uffff\1\7"+
        "\2\uffff\1\10\3\uffff\1\13";
    static final String DFA12_specialS =
        "\1\36\1\30\11\uffff\1\0\3\uffff\1\1\1\7\1\16\1\23\1\31\1\145\1"+
        "\53\1\66\1\100\1\106\1\74\1\135\15\uffff\1\2\1\10\1\17\1\24\1\32"+
        "\1\146\1\54\1\67\1\101\1\107\1\124\1\126\1\136\1\3\1\11\1\20\1\25"+
        "\1\33\1\147\1\55\1\70\1\102\1\110\1\125\1\127\1\137\1\4\1\12\1\21"+
        "\1\26\1\34\1\41\1\44\1\56\1\71\1\103\1\111\1\uffff\1\130\1\140\1"+
        "\5\1\13\1\22\1\27\1\35\1\42\1\45\1\57\1\72\1\104\1\112\1\uffff\1"+
        "\131\1\141\1\6\1\14\2\uffff\1\37\1\43\1\46\1\60\1\73\1\105\1\113"+
        "\1\132\1\142\1\uffff\1\15\2\uffff\1\40\1\uffff\1\47\1\61\1\75\1"+
        "\uffff\1\114\1\133\1\143\4\uffff\1\50\1\62\1\76\1\uffff\1\115\1"+
        "\134\1\144\2\uffff\1\51\1\63\1\77\1\116\2\uffff\1\52\1\64\1\uffff"+
        "\1\117\3\uffff\1\65\1\uffff\1\120\2\uffff\1\121\1\uffff\1\122\1"+
        "\123\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\13\4\16\1\1\4\16\1"+
            "\3\2\16\1\14\12\12\1\2\6\16\32\11\1\5\1\16\1\6\1\10\1\11\1\16"+
            "\32\11\1\4\1\16\1\7\uff82\16",
            "\101\33\1\22\1\23\3\33\1\21\2\33\1\20\11\33\1\17\15\33\1\30"+
            "\1\33\1\24\2\33\1\27\6\33\1\25\2\33\1\32\3\33\1\26\1\31\uff8a"+
            "\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\33",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\164\33\1\50\uff8b\33",
            "\156\33\1\51\uff91\33",
            "\154\33\1\52\uff93\33",
            "\162\33\1\53\uff8d\33",
            "\157\33\1\54\uff90\33",
            "\157\33\1\55\uff90\33",
            "\145\33\1\56\uff9a\33",
            "\141\33\1\57\uff9e\33",
            "\151\33\1\60\uff96\33",
            "\164\33\1\61\uff8b\33",
            "\162\33\1\62\1\63\uff8c\33",
            "\141\33\1\64\uff9e\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\162\33\1\65\uff8d\33",
            "\164\33\1\66\uff8b\33",
            "\157\33\1\67\uff90\33",
            "\162\33\1\70\uff8d\33",
            "\157\33\1\71\uff90\33",
            "\156\33\1\72\uff91\33",
            "\162\33\1\73\uff8d\33",
            "\142\33\1\74\uff9d\33",
            "\145\33\1\75\uff9a\33",
            "\164\33\1\76\uff8b\33",
            "\154\33\1\77\uff93\33",
            "\145\33\1\100\uff9a\33",
            "\163\33\1\101\uff8c\33",
            "\151\33\1\102\uff96\33",
            "\145\33\1\103\uff9a\33",
            "\141\33\1\104\uff9e\33",
            "\141\33\1\105\uff9e\33",
            "\154\33\1\106\uff93\33",
            "\146\33\1\107\7\33\1\110\uff91\33",
            "\147\33\1\111\uff98\33",
            "\154\33\1\112\uff93\33",
            "\154\33\1\113\uff93\33",
            "\162\33\1\114\uff8d\33",
            "\47\33\1\115\uffd8\33",
            "\162\33\1\116\uff8d\33",
            "\163\33\1\117\uff8c\33",
            "\156\33\1\120\uff91\33",
            "\147\33\1\121\uff98\33",
            "\164\33\1\122\uff8b\33",
            "\171\33\1\123\uff86\33",
            "\145\33\1\124\uff9a\33",
            "\151\33\1\125\uff96\33",
            "\145\33\1\126\uff9a\33",
            "\145\33\1\127\uff9a\33",
            "\145\33\1\130\uff9a\33",
            "\144\33\1\131\uff9b\33",
            "\151\33\1\132\uff96\33",
            "\1\133",
            "\156\33\1\134\uff91\33",
            "\167\33\1\135\uff88\33",
            "\147\33\1\136\uff98\33",
            "\145\33\1\137\uff9a\33",
            "\47\33\1\140\uffd8\33",
            "\47\33\1\141\uffd8\33",
            "\141\33\1\142\uff9e\33",
            "\147\33\1\143\uff98\33",
            "\143\33\1\144\uff9c\33",
            "\106\33\1\145\uffb9\33",
            "\116\33\1\146\uffb1\33",
            "\163\33\1\147\uff8c\33",
            "\142\33\1\150\uff9d\33",
            "",
            "\141\33\1\151\uff9e\33",
            "\157\33\1\152\uff90\33",
            "\47\33\1\153\uffd8\33",
            "\162\33\1\154\uff8d\33",
            "",
            "",
            "\156\33\1\157\uff91\33",
            "\47\33\1\160\uffd8\33",
            "\164\33\1\161\uff8b\33",
            "\151\33\1\162\uff96\33",
            "\141\33\1\163\uff9e\33",
            "\47\33\1\164\uffd8\33",
            "\165\33\1\165\uff8a\33",
            "\155\33\1\166\uff92\33",
            "\162\33\1\167\uff8d\33",
            "",
            "\47\33\1\171\uffd8\33",
            "",
            "",
            "\47\33\1\172\uffd8\33",
            "",
            "\151\33\1\174\uff96\33",
            "\145\33\1\175\uff9a\33",
            "\155\33\1\176\uff92\33",
            "\1\177",
            "\164\33\1\u0080\uff8b\33",
            "\145\33\1\u0081\uff9a\33",
            "\144\33\1\u0082\uff9b\33",
            "",
            "",
            "",
            "",
            "\157\33\1\u0085\uff90\33",
            "\154\33\1\u0086\uff93\33",
            "\145\33\1\u0087\uff9a\33",
            "",
            "\145\33\1\u0088\uff9a\33",
            "\47\33\1\u0089\uffd8\33",
            "\47\33\1\u008a\uffd8\33",
            "",
            "",
            "\156\33\1\u008b\uff91\33",
            "\144\33\1\u008c\uff9b\33",
            "\47\33\1\u008d\uffd8\33",
            "\116\33\1\u008e\uffb1\33",
            "\1\u008f",
            "\1\u0090",
            "\47\33\1\u0091\uffd8\33",
            "\163\33\1\u0092\uff8c\33",
            "\1\u0093",
            "\141\33\1\u0094\uff9e\33",
            "",
            "",
            "",
            "\47\33\1\u0096\uffd8\33",
            "",
            "\155\33\1\u0097\uff92\33",
            "",
            "\1\u0098",
            "\145\33\1\u0099\uff9a\33",
            "",
            "\163\33\1\u009a\uff8c\33",
            "\47\33\1\u009b\uffd8\33",
            "\1\u009c",
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
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | RULE_LITERACONFIG | RULE_LITERACONNECTION | RULE_LITERALMERGEDFIELDS | RULE_LITERALTABLENAME | RULE_LITERALFIELDS | RULE_LITERALATTRIBUTENAMES | RULE_LITERALURL | RULE_LITERALUSERNAME | RULE_LITERALPASSWORD | RULE_COLON | RULE_COMA | RULE_LEFTPARENTESIS | RULE_LEFTBRACKET | RULE_RIGHTBRACKET | RULE_RIGHTPARENTESIS | RULE_SINGLEQUOTE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 27;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( (LA12_15=='t') ) {s = 40;}

                        else if ( ((LA12_15>='\u0000' && LA12_15<='s')||(LA12_15>='u' && LA12_15<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='r') ) {s = 53;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='q')||(LA12_40>='s' && LA12_40<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='i') ) {s = 66;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='h')||(LA12_53>='j' && LA12_53<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='n') ) {s = 80;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='m')||(LA12_66>='o' && LA12_66<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='g') ) {s = 94;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='f')||(LA12_80>='h' && LA12_80<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_94 = input.LA(1);

                        s = -1;
                        if ( (LA12_94=='\'') ) {s = 107;}

                        else if ( ((LA12_94>='\u0000' && LA12_94<='&')||(LA12_94>='(' && LA12_94<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( (LA12_16=='n') ) {s = 41;}

                        else if ( ((LA12_16>='\u0000' && LA12_16<='m')||(LA12_16>='o' && LA12_16<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='t') ) {s = 54;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='s')||(LA12_41>='u' && LA12_41<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='e') ) {s = 67;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='d')||(LA12_54>='f' && LA12_54<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='g') ) {s = 81;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='f')||(LA12_67>='h' && LA12_67<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='e') ) {s = 95;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='d')||(LA12_81>='f' && LA12_81<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='r') ) {s = 108;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='q')||(LA12_95>='s' && LA12_95<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='\'') ) {s = 121;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='&')||(LA12_108>='(' && LA12_108<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( (LA12_17=='l') ) {s = 42;}

                        else if ( ((LA12_17>='\u0000' && LA12_17<='k')||(LA12_17>='m' && LA12_17<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='o') ) {s = 55;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='n')||(LA12_42>='p' && LA12_42<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='a') ) {s = 68;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='`')||(LA12_55>='b' && LA12_55<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='t') ) {s = 82;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='s')||(LA12_68>='u' && LA12_68<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_82 = input.LA(1);

                        s = -1;
                        if ( (LA12_82=='\'') ) {s = 96;}

                        else if ( ((LA12_82>='\u0000' && LA12_82<='&')||(LA12_82>='(' && LA12_82<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( (LA12_18=='r') ) {s = 43;}

                        else if ( ((LA12_18>='\u0000' && LA12_18<='q')||(LA12_18>='s' && LA12_18<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='r') ) {s = 56;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='q')||(LA12_43>='s' && LA12_43<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='a') ) {s = 69;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='`')||(LA12_56>='b' && LA12_56<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='y') ) {s = 83;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='x')||(LA12_69>='z' && LA12_69<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='\'') ) {s = 97;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='&')||(LA12_83>='(' && LA12_83<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_1 = input.LA(1);

                        s = -1;
                        if ( (LA12_1=='S') ) {s = 15;}

                        else if ( (LA12_1=='I') ) {s = 16;}

                        else if ( (LA12_1=='F') ) {s = 17;}

                        else if ( (LA12_1=='A') ) {s = 18;}

                        else if ( (LA12_1=='B') ) {s = 19;}

                        else if ( (LA12_1=='c') ) {s = 20;}

                        else if ( (LA12_1=='m') ) {s = 21;}

                        else if ( (LA12_1=='t') ) {s = 22;}

                        else if ( (LA12_1=='f') ) {s = 23;}

                        else if ( (LA12_1=='a') ) {s = 24;}

                        else if ( (LA12_1=='u') ) {s = 25;}

                        else if ( (LA12_1=='p') ) {s = 26;}

                        else if ( ((LA12_1>='\u0000' && LA12_1<='@')||(LA12_1>='C' && LA12_1<='E')||(LA12_1>='G' && LA12_1<='H')||(LA12_1>='J' && LA12_1<='R')||(LA12_1>='T' && LA12_1<='`')||LA12_1=='b'||(LA12_1>='d' && LA12_1<='e')||(LA12_1>='g' && LA12_1<='l')||(LA12_1>='n' && LA12_1<='o')||(LA12_1>='q' && LA12_1<='s')||(LA12_1>='v' && LA12_1<='\uFFFF')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='o') ) {s = 44;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='n')||(LA12_19>='p' && LA12_19<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='o') ) {s = 57;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='n')||(LA12_44>='p' && LA12_44<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='l') ) {s = 70;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='k')||(LA12_57>='m' && LA12_57<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_70 = input.LA(1);

                        s = -1;
                        if ( (LA12_70=='e') ) {s = 84;}

                        else if ( ((LA12_70>='\u0000' && LA12_70<='d')||(LA12_70>='f' && LA12_70<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='a') ) {s = 98;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='`')||(LA12_84>='b' && LA12_84<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='\'') ) {s = 1;}

                        else if ( (LA12_0==':') ) {s = 2;}

                        else if ( (LA12_0==',') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0=='[') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\"') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 13;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='n') ) {s = 111;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='m')||(LA12_98>='o' && LA12_98<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='\'') ) {s = 122;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='&')||(LA12_111>='(' && LA12_111<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='i') ) {s = 85;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='h')||(LA12_71>='j' && LA12_71<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='g') ) {s = 99;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='f')||(LA12_85>='h' && LA12_85<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='\'') ) {s = 112;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='&')||(LA12_99>='(' && LA12_99<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='e') ) {s = 86;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='d')||(LA12_72>='f' && LA12_72<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_86 = input.LA(1);

                        s = -1;
                        if ( (LA12_86=='c') ) {s = 100;}

                        else if ( ((LA12_86>='\u0000' && LA12_86<='b')||(LA12_86>='d' && LA12_86<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_100 = input.LA(1);

                        s = -1;
                        if ( (LA12_100=='t') ) {s = 113;}

                        else if ( ((LA12_100>='\u0000' && LA12_100<='s')||(LA12_100>='u' && LA12_100<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='i') ) {s = 124;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='h')||(LA12_113>='j' && LA12_113<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='o') ) {s = 133;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='n')||(LA12_124>='p' && LA12_124<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='n') ) {s = 139;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='m')||(LA12_133>='o' && LA12_133<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='\'') ) {s = 145;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='&')||(LA12_139>='(' && LA12_139<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( (LA12_21=='e') ) {s = 46;}

                        else if ( ((LA12_21>='\u0000' && LA12_21<='d')||(LA12_21>='f' && LA12_21<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='r') ) {s = 59;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='q')||(LA12_46>='s' && LA12_46<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='g') ) {s = 73;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='f')||(LA12_59>='h' && LA12_59<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='e') ) {s = 87;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<='d')||(LA12_73>='f' && LA12_73<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='F') ) {s = 101;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='E')||(LA12_87>='G' && LA12_87<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101=='i') ) {s = 114;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='h')||(LA12_101>='j' && LA12_101<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='e') ) {s = 125;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='d')||(LA12_114>='f' && LA12_114<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='l') ) {s = 134;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='k')||(LA12_125>='m' && LA12_125<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_134 = input.LA(1);

                        s = -1;
                        if ( (LA12_134=='d') ) {s = 140;}

                        else if ( ((LA12_134>='\u0000' && LA12_134<='c')||(LA12_134>='e' && LA12_134<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_140 = input.LA(1);

                        s = -1;
                        if ( (LA12_140=='s') ) {s = 146;}

                        else if ( ((LA12_140>='\u0000' && LA12_140<='r')||(LA12_140>='t' && LA12_140<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_146 = input.LA(1);

                        s = -1;
                        if ( (LA12_146=='\'') ) {s = 150;}

                        else if ( ((LA12_146>='\u0000' && LA12_146<='&')||(LA12_146>='(' && LA12_146<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( (LA12_22=='a') ) {s = 47;}

                        else if ( ((LA12_22>='\u0000' && LA12_22<='`')||(LA12_22>='b' && LA12_22<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='b') ) {s = 60;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='a')||(LA12_47>='c' && LA12_47<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='l') ) {s = 74;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='k')||(LA12_60>='m' && LA12_60<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='e') ) {s = 88;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='d')||(LA12_74>='f' && LA12_74<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88=='N') ) {s = 102;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='M')||(LA12_88>='O' && LA12_88<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='a') ) {s = 115;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='`')||(LA12_102>='b' && LA12_102<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( (LA12_25=='r') ) {s = 50;}

                        else if ( (LA12_25=='s') ) {s = 51;}

                        else if ( ((LA12_25>='\u0000' && LA12_25<='q')||(LA12_25>='t' && LA12_25<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115=='m') ) {s = 126;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='l')||(LA12_115>='n' && LA12_115<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='e') ) {s = 135;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<='d')||(LA12_126>='f' && LA12_126<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_135 = input.LA(1);

                        s = -1;
                        if ( (LA12_135=='\'') ) {s = 141;}

                        else if ( ((LA12_135>='\u0000' && LA12_135<='&')||(LA12_135>='(' && LA12_135<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='i') ) {s = 48;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='h')||(LA12_23>='j' && LA12_23<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='e') ) {s = 61;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='d')||(LA12_48>='f' && LA12_48<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_61 = input.LA(1);

                        s = -1;
                        if ( (LA12_61=='l') ) {s = 75;}

                        else if ( ((LA12_61>='\u0000' && LA12_61<='k')||(LA12_61>='m' && LA12_61<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='d') ) {s = 89;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='c')||(LA12_75>='e' && LA12_75<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='s') ) {s = 103;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='r')||(LA12_89>='t' && LA12_89<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_103 = input.LA(1);

                        s = -1;
                        if ( (LA12_103=='\'') ) {s = 116;}

                        else if ( ((LA12_103>='\u0000' && LA12_103<='&')||(LA12_103>='(' && LA12_103<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='t') ) {s = 49;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='s')||(LA12_24>='u' && LA12_24<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='t') ) {s = 62;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='s')||(LA12_49>='u' && LA12_49<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='r') ) {s = 76;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='q')||(LA12_62>='s' && LA12_62<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='i') ) {s = 90;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='h')||(LA12_76>='j' && LA12_76<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='b') ) {s = 104;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<='a')||(LA12_90>='c' && LA12_90<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='u') ) {s = 117;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='t')||(LA12_104>='v' && LA12_104<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='t') ) {s = 128;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='s')||(LA12_117>='u' && LA12_117<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='e') ) {s = 136;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='d')||(LA12_128>='f' && LA12_128<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='N') ) {s = 142;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='M')||(LA12_136>='O' && LA12_136<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='a') ) {s = 148;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='`')||(LA12_142>='b' && LA12_142<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_148 = input.LA(1);

                        s = -1;
                        if ( (LA12_148=='m') ) {s = 151;}

                        else if ( ((LA12_148>='\u0000' && LA12_148<='l')||(LA12_148>='n' && LA12_148<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_151 = input.LA(1);

                        s = -1;
                        if ( (LA12_151=='e') ) {s = 153;}

                        else if ( ((LA12_151>='\u0000' && LA12_151<='d')||(LA12_151>='f' && LA12_151<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_153 = input.LA(1);

                        s = -1;
                        if ( (LA12_153=='s') ) {s = 154;}

                        else if ( ((LA12_153>='\u0000' && LA12_153<='r')||(LA12_153>='t' && LA12_153<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_154 = input.LA(1);

                        s = -1;
                        if ( (LA12_154=='\'') ) {s = 155;}

                        else if ( ((LA12_154>='\u0000' && LA12_154<='&')||(LA12_154>='(' && LA12_154<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( (LA12_50=='l') ) {s = 63;}

                        else if ( ((LA12_50>='\u0000' && LA12_50<='k')||(LA12_50>='m' && LA12_50<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_63 = input.LA(1);

                        s = -1;
                        if ( (LA12_63=='\'') ) {s = 77;}

                        else if ( ((LA12_63>='\u0000' && LA12_63<='&')||(LA12_63>='(' && LA12_63<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='e') ) {s = 64;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='d')||(LA12_51>='f' && LA12_51<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='r') ) {s = 78;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='q')||(LA12_64>='s' && LA12_64<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='n') ) {s = 92;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='m')||(LA12_78>='o' && LA12_78<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='a') ) {s = 105;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='`')||(LA12_92>='b' && LA12_92<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105=='m') ) {s = 118;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<='l')||(LA12_105>='n' && LA12_105<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='e') ) {s = 129;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='d')||(LA12_118>='f' && LA12_118<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_129 = input.LA(1);

                        s = -1;
                        if ( (LA12_129=='\'') ) {s = 137;}

                        else if ( ((LA12_129>='\u0000' && LA12_129<='&')||(LA12_129>='(' && LA12_129<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( (LA12_26=='a') ) {s = 52;}

                        else if ( ((LA12_26>='\u0000' && LA12_26<='`')||(LA12_26>='b' && LA12_26<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_52 = input.LA(1);

                        s = -1;
                        if ( (LA12_52=='s') ) {s = 65;}

                        else if ( ((LA12_52>='\u0000' && LA12_52<='r')||(LA12_52>='t' && LA12_52<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='s') ) {s = 79;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='r')||(LA12_65>='t' && LA12_65<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='w') ) {s = 93;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='v')||(LA12_79>='x' && LA12_79<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='o') ) {s = 106;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='n')||(LA12_93>='p' && LA12_93<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='r') ) {s = 119;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='q')||(LA12_106>='s' && LA12_106<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='d') ) {s = 130;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='c')||(LA12_119>='e' && LA12_119<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_130 = input.LA(1);

                        s = -1;
                        if ( (LA12_130=='\'') ) {s = 138;}

                        else if ( ((LA12_130>='\u0000' && LA12_130<='&')||(LA12_130>='(' && LA12_130<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( (LA12_20=='o') ) {s = 45;}

                        else if ( ((LA12_20>='\u0000' && LA12_20<='n')||(LA12_20>='p' && LA12_20<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='n') ) {s = 58;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='m')||(LA12_45>='o' && LA12_45<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='f') ) {s = 71;}

                        else if ( (LA12_58=='n') ) {s = 72;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='e')||(LA12_58>='g' && LA12_58<='m')||(LA12_58>='o' && LA12_58<='\uFFFF')) ) {s = 27;}

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