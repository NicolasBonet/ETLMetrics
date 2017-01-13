package org.uniandes.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLLexer extends Lexer {
    public static final int RULE_CTABLE=5;
    public static final int RULE_KEY=11;
    public static final int RULE_STRING=17;
    public static final int RULE_LPARENT=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CREATE=4;
    public static final int RULE_RPARENT=7;
    public static final int EOF=-1;
    public static final int RULE_NOT_NULL=15;
    public static final int RULE_REFERENCES=13;
    public static final int RULE_ID=14;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_NUMBER=9;
    public static final int RULE_PRIMARY=10;
    public static final int T__26=26;
    public static final int RULE_INT=16;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FOREIGN=12;

    // delegates
    // delegators

    public InternalSQLLexer() {;} 
    public InternalSQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSQL.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:11:7: ( 'varchar' )
            // InternalSQL.g:11:9: 'varchar'
            {
            match("varchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:12:7: ( 'int' )
            // InternalSQL.g:12:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:13:7: ( 'boolean' )
            // InternalSQL.g:13:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalSQL.g:14:7: ( 'date' )
            // InternalSQL.g:14:9: 'date'
            {
            match("date"); 


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
            // InternalSQL.g:15:7: ( 'number' )
            // InternalSQL.g:15:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_CREATE"
    public final void mRULE_CREATE() throws RecognitionException {
        try {
            int _type = RULE_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1735:13: ( 'CREATE' )
            // InternalSQL.g:1735:15: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CREATE"

    // $ANTLR start "RULE_CTABLE"
    public final void mRULE_CTABLE() throws RecognitionException {
        try {
            int _type = RULE_CTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1737:13: ( 'TABLE' )
            // InternalSQL.g:1737:15: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CTABLE"

    // $ANTLR start "RULE_LPARENT"
    public final void mRULE_LPARENT() throws RecognitionException {
        try {
            int _type = RULE_LPARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1739:14: ( '(' )
            // InternalSQL.g:1739:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPARENT"

    // $ANTLR start "RULE_RPARENT"
    public final void mRULE_RPARENT() throws RecognitionException {
        try {
            int _type = RULE_RPARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1741:14: ( ')' )
            // InternalSQL.g:1741:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPARENT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1743:12: ( ',' )
            // InternalSQL.g:1743:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_FOREIGN"
    public final void mRULE_FOREIGN() throws RecognitionException {
        try {
            int _type = RULE_FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1745:14: ( 'FOREIGN' )
            // InternalSQL.g:1745:16: 'FOREIGN'
            {
            match("FOREIGN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOREIGN"

    // $ANTLR start "RULE_PRIMARY"
    public final void mRULE_PRIMARY() throws RecognitionException {
        try {
            int _type = RULE_PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1747:14: ( 'PRIMARY' )
            // InternalSQL.g:1747:16: 'PRIMARY'
            {
            match("PRIMARY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRIMARY"

    // $ANTLR start "RULE_KEY"
    public final void mRULE_KEY() throws RecognitionException {
        try {
            int _type = RULE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1749:10: ( 'KEY' )
            // InternalSQL.g:1749:12: 'KEY'
            {
            match("KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEY"

    // $ANTLR start "RULE_NOT_NULL"
    public final void mRULE_NOT_NULL() throws RecognitionException {
        try {
            int _type = RULE_NOT_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1751:15: ( 'NOT NULL' )
            // InternalSQL.g:1751:17: 'NOT NULL'
            {
            match("NOT NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_NULL"

    // $ANTLR start "RULE_REFERENCES"
    public final void mRULE_REFERENCES() throws RecognitionException {
        try {
            int _type = RULE_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1753:17: ( 'REFERENCES' )
            // InternalSQL.g:1753:19: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REFERENCES"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1755:9: ( 'A' .. 'z' ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )* )
            // InternalSQL.g:1755:11: 'A' .. 'z' ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            {
            matchRange('A','z'); 
            // InternalSQL.g:1755:20: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1757:13: ( ( '0' .. '9' )* )
            // InternalSQL.g:1757:15: ( '0' .. '9' )*
            {
            // InternalSQL.g:1757:15: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSQL.g:1757:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1759:10: ( ( '0' .. '9' )+ )
            // InternalSQL.g:1759:12: ( '0' .. '9' )+
            {
            // InternalSQL.g:1759:12: ( '0' .. '9' )+
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
            	    // InternalSQL.g:1759:13: '0' .. '9'
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
            // InternalSQL.g:1761:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSQL.g:1761:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSQL.g:1761:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSQL.g:1761:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSQL.g:1761:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSQL.g:1761:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSQL.g:1761:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSQL.g:1761:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSQL.g:1761:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSQL.g:1761:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSQL.g:1761:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSQL.g:1763:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSQL.g:1763:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSQL.g:1763:24: ( options {greedy=false; } : . )*
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
            	    // InternalSQL.g:1763:52: .
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
            // InternalSQL.g:1765:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSQL.g:1765:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSQL.g:1765:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSQL.g:1765:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSQL.g:1765:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:1765:41: ( '\\r' )? '\\n'
                    {
                    // InternalSQL.g:1765:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSQL.g:1765:41: '\\r'
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
            // InternalSQL.g:1767:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSQL.g:1767:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSQL.g:1767:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalSQL.g:
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
            // InternalSQL.g:1769:16: ( . )
            // InternalSQL.g:1769:18: .
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
        // InternalSQL.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | RULE_CREATE | RULE_CTABLE | RULE_LPARENT | RULE_RPARENT | RULE_COMMA | RULE_FOREIGN | RULE_PRIMARY | RULE_KEY | RULE_NOT_NULL | RULE_REFERENCES | RULE_ID | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=23;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSQL.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalSQL.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalSQL.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalSQL.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalSQL.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalSQL.g:1:40: RULE_CREATE
                {
                mRULE_CREATE(); 

                }
                break;
            case 7 :
                // InternalSQL.g:1:52: RULE_CTABLE
                {
                mRULE_CTABLE(); 

                }
                break;
            case 8 :
                // InternalSQL.g:1:64: RULE_LPARENT
                {
                mRULE_LPARENT(); 

                }
                break;
            case 9 :
                // InternalSQL.g:1:77: RULE_RPARENT
                {
                mRULE_RPARENT(); 

                }
                break;
            case 10 :
                // InternalSQL.g:1:90: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 11 :
                // InternalSQL.g:1:101: RULE_FOREIGN
                {
                mRULE_FOREIGN(); 

                }
                break;
            case 12 :
                // InternalSQL.g:1:114: RULE_PRIMARY
                {
                mRULE_PRIMARY(); 

                }
                break;
            case 13 :
                // InternalSQL.g:1:127: RULE_KEY
                {
                mRULE_KEY(); 

                }
                break;
            case 14 :
                // InternalSQL.g:1:136: RULE_NOT_NULL
                {
                mRULE_NOT_NULL(); 

                }
                break;
            case 15 :
                // InternalSQL.g:1:150: RULE_REFERENCES
                {
                mRULE_REFERENCES(); 

                }
                break;
            case 16 :
                // InternalSQL.g:1:166: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalSQL.g:1:174: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 18 :
                // InternalSQL.g:1:186: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalSQL.g:1:195: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalSQL.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalSQL.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalSQL.g:1:239: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalSQL.g:1:247: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\22\7\31\3\uffff\5\31\1\uffff\1\22\1\uffff\3\27\2\uffff\1\31\1\uffff\6\31\3\uffff\5\31\1\22\4\uffff\1\31\1\72\7\31\1\102\3\31\1\uffff\1\31\1\107\5\31\2\uffff\3\31\1\uffff\2\31\1\122\5\31\1\130\1\131\1\uffff\3\31\1\135\1\136\2\uffff\1\137\1\140\1\31\4\uffff\2\31\1\144\1\uffff";
    static final String DFA12_eofS =
        "\145\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\156\1\157\1\141\1\165\1\122\1\101\3\uffff\1\117\1\122\1\105\1\117\1\105\1\uffff\1\60\1\uffff\2\0\1\52\2\uffff\1\162\1\uffff\1\164\1\157\1\164\1\155\1\105\1\102\3\uffff\1\122\1\111\1\131\1\124\1\106\1\60\4\uffff\1\143\1\60\1\154\1\145\1\142\1\101\1\114\1\105\1\115\1\60\1\40\1\105\1\150\1\uffff\1\145\1\60\1\145\1\124\1\105\1\111\1\101\2\uffff\1\122\2\141\1\uffff\1\162\1\105\1\60\1\107\1\122\1\105\1\162\1\156\2\60\1\uffff\1\116\1\131\1\116\2\60\2\uffff\2\60\1\103\4\uffff\1\105\1\123\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\156\1\157\1\141\1\165\1\122\1\101\3\uffff\1\117\1\122\1\105\1\117\1\105\1\uffff\1\71\1\uffff\2\uffff\1\57\2\uffff\1\162\1\uffff\1\164\1\157\1\164\1\155\1\105\1\102\3\uffff\1\122\1\111\1\131\1\124\1\106\1\71\4\uffff\1\143\1\172\1\154\1\145\1\142\1\101\1\114\1\105\1\115\1\172\1\40\1\105\1\150\1\uffff\1\145\1\172\1\145\1\124\1\105\1\111\1\101\2\uffff\1\122\2\141\1\uffff\1\162\1\105\1\172\1\107\1\122\1\105\1\162\1\156\2\172\1\uffff\1\116\1\131\1\116\2\172\2\uffff\2\172\1\103\4\uffff\1\105\1\123\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\10\1\11\1\12\5\uffff\1\20\1\uffff\1\21\3\uffff\1\26\1\27\1\uffff\1\20\6\uffff\1\10\1\11\1\12\6\uffff\1\23\1\24\1\25\1\26\15\uffff\1\2\7\uffff\1\15\1\16\3\uffff\1\4\12\uffff\1\7\5\uffff\1\5\1\6\3\uffff\1\1\1\3\1\13\1\14\3\uffff\1\17";
    static final String DFA12_specialS =
        "\1\0\22\uffff\1\2\1\1\120\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\1\10\1\11\2\27\1\12\2\27\1\25\12\21\7\27\2\20\1\6\2\20\1\13\4\20\1\15\2\20\1\16\1\20\1\14\1\20\1\17\1\20\1\7\15\20\1\3\1\20\1\4\4\20\1\2\4\20\1\5\7\20\1\1\4\20\uff85\27",
            "\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "\12\50",
            "",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\50",
            "",
            "",
            "",
            "",
            "\1\71",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
            "\1\141",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\12\31\7\uffff\32\31\6\uffff\32\31",
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
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | RULE_CREATE | RULE_CTABLE | RULE_LPARENT | RULE_RPARENT | RULE_COMMA | RULE_FOREIGN | RULE_PRIMARY | RULE_KEY | RULE_NOT_NULL | RULE_REFERENCES | RULE_ID | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='v') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='b') ) {s = 3;}

                        else if ( (LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='n') ) {s = 5;}

                        else if ( (LA12_0=='C') ) {s = 6;}

                        else if ( (LA12_0=='T') ) {s = 7;}

                        else if ( (LA12_0=='(') ) {s = 8;}

                        else if ( (LA12_0==')') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='F') ) {s = 11;}

                        else if ( (LA12_0=='P') ) {s = 12;}

                        else if ( (LA12_0=='K') ) {s = 13;}

                        else if ( (LA12_0=='N') ) {s = 14;}

                        else if ( (LA12_0=='R') ) {s = 15;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='J')||(LA12_0>='L' && LA12_0<='M')||LA12_0=='O'||LA12_0=='Q'||LA12_0=='S'||(LA12_0>='U' && LA12_0<='a')||LA12_0=='c'||(LA12_0>='e' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 16;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 23;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 41;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 41;}

                        else s = 23;

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