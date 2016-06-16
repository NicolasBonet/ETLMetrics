package org.xtext.example.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLLexer extends Lexer {
    public static final int RULE_COMA=10;
    public static final int RULE_KEY=12;
    public static final int RULE_STRING=17;
    public static final int RULE_NOT=8;
    public static final int RULE_NULL=9;
    public static final int RULE_LPAREN=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CREATE=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_REFERENCES=15;
    public static final int RULE_ID=13;
    public static final int RULE_WS=20;
    public static final int RULE_TABLA=5;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_PRIMARY=11;
    public static final int RULE_RPAREN=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FOREIGN=14;

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
            // InternalSQL.g:11:7: ( 'varchar(255)' )
            // InternalSQL.g:11:9: 'varchar(255)'
            {
            match("varchar(255)"); 


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
            // InternalSQL.g:12:7: ( 'varchar' )
            // InternalSQL.g:12:9: 'varchar'
            {
            match("varchar"); 


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
            // InternalSQL.g:13:7: ( 'int' )
            // InternalSQL.g:13:9: 'int'
            {
            match("int"); 


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
            // InternalSQL.g:14:7: ( 'character' )
            // InternalSQL.g:14:9: 'character'
            {
            match("character"); 


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
            // InternalSQL.g:15:7: ( 'boolean' )
            // InternalSQL.g:15:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalSQL.g:16:7: ( 'date' )
            // InternalSQL.g:16:9: 'date'
            {
            match("date"); 


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
            // InternalSQL.g:17:7: ( 'time' )
            // InternalSQL.g:17:9: 'time'
            {
            match("time"); 


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
            // InternalSQL.g:18:7: ( 'float' )
            // InternalSQL.g:18:9: 'float'
            {
            match("float"); 


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
            // InternalSQL.g:19:7: ( 'decimal' )
            // InternalSQL.g:19:9: 'decimal'
            {
            match("decimal"); 


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
            // InternalSQL.g:20:7: ( 'numeric' )
            // InternalSQL.g:20:9: 'numeric'
            {
            match("numeric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_CREATE"
    public final void mRULE_CREATE() throws RecognitionException {
        try {
            int _type = RULE_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1340:13: ( 'CREATE' )
            // InternalSQL.g:1340:15: 'CREATE'
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

    // $ANTLR start "RULE_TABLA"
    public final void mRULE_TABLA() throws RecognitionException {
        try {
            int _type = RULE_TABLA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1342:12: ( 'TABLE' )
            // InternalSQL.g:1342:14: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TABLA"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1344:13: ( '(' )
            // InternalSQL.g:1344:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1346:13: ( ')' )
            // InternalSQL.g:1346:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1348:11: ( ',' )
            // InternalSQL.g:1348:13: ','
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

    // $ANTLR start "RULE_PRIMARY"
    public final void mRULE_PRIMARY() throws RecognitionException {
        try {
            int _type = RULE_PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1350:14: ( 'PRIMARY' )
            // InternalSQL.g:1350:16: 'PRIMARY'
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

    // $ANTLR start "RULE_FOREIGN"
    public final void mRULE_FOREIGN() throws RecognitionException {
        try {
            int _type = RULE_FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1352:14: ( 'FOREIGN' )
            // InternalSQL.g:1352:16: 'FOREIGN'
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

    // $ANTLR start "RULE_REFERENCES"
    public final void mRULE_REFERENCES() throws RecognitionException {
        try {
            int _type = RULE_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1354:17: ( 'REFERENCES' )
            // InternalSQL.g:1354:19: 'REFERENCES'
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

    // $ANTLR start "RULE_KEY"
    public final void mRULE_KEY() throws RecognitionException {
        try {
            int _type = RULE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1356:10: ( 'KEY' )
            // InternalSQL.g:1356:12: 'KEY'
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

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1358:10: ( 'NOT' )
            // InternalSQL.g:1358:12: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1360:11: ( 'NULL' )
            // InternalSQL.g:1360:13: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1362:9: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' )* )
            // InternalSQL.g:1362:11: ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '0' .. '9' )*
            {
            // InternalSQL.g:1362:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalSQL.g:1362:32: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSQL.g:1362:33: '0' .. '9'
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:1364:10: ( ( '0' .. '9' )+ )
            // InternalSQL.g:1364:12: ( '0' .. '9' )+
            {
            // InternalSQL.g:1364:12: ( '0' .. '9' )+
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
            	    // InternalSQL.g:1364:13: '0' .. '9'
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
            // InternalSQL.g:1366:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSQL.g:1366:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSQL.g:1366:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSQL.g:1366:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSQL.g:1366:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSQL.g:1366:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSQL.g:1366:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSQL.g:1366:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSQL.g:1366:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSQL.g:1366:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSQL.g:1366:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSQL.g:1368:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSQL.g:1368:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSQL.g:1368:24: ( options {greedy=false; } : . )*
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
            	    // InternalSQL.g:1368:52: .
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
            // InternalSQL.g:1370:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSQL.g:1370:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSQL.g:1370:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSQL.g:1370:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSQL.g:1370:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:1370:41: ( '\\r' )? '\\n'
                    {
                    // InternalSQL.g:1370:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSQL.g:1370:41: '\\r'
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
            // InternalSQL.g:1372:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSQL.g:1372:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSQL.g:1372:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSQL.g:1374:16: ( . )
            // InternalSQL.g:1374:18: .
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
        // InternalSQL.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_CREATE | RULE_TABLA | RULE_LPAREN | RULE_RPAREN | RULE_COMA | RULE_PRIMARY | RULE_FOREIGN | RULE_REFERENCES | RULE_KEY | RULE_NOT | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
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
                // InternalSQL.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalSQL.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalSQL.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalSQL.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalSQL.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalSQL.g:1:70: RULE_CREATE
                {
                mRULE_CREATE(); 

                }
                break;
            case 12 :
                // InternalSQL.g:1:82: RULE_TABLA
                {
                mRULE_TABLA(); 

                }
                break;
            case 13 :
                // InternalSQL.g:1:93: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 14 :
                // InternalSQL.g:1:105: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 15 :
                // InternalSQL.g:1:117: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 16 :
                // InternalSQL.g:1:127: RULE_PRIMARY
                {
                mRULE_PRIMARY(); 

                }
                break;
            case 17 :
                // InternalSQL.g:1:140: RULE_FOREIGN
                {
                mRULE_FOREIGN(); 

                }
                break;
            case 18 :
                // InternalSQL.g:1:153: RULE_REFERENCES
                {
                mRULE_REFERENCES(); 

                }
                break;
            case 19 :
                // InternalSQL.g:1:169: RULE_KEY
                {
                mRULE_KEY(); 

                }
                break;
            case 20 :
                // InternalSQL.g:1:178: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 21 :
                // InternalSQL.g:1:187: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 22 :
                // InternalSQL.g:1:197: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalSQL.g:1:205: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalSQL.g:1:214: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalSQL.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalSQL.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalSQL.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalSQL.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\12\33\3\uffff\5\33\2\uffff\3\31\2\uffff\1\33\1\uffff\12\33\3\uffff\6\33\5\uffff\1\33\1\106\14\33\1\123\1\124\2\33\1\uffff\2\33\1\131\1\33\1\133\7\33\2\uffff\1\143\3\33\1\uffff\1\33\1\uffff\1\150\2\33\1\153\3\33\1\uffff\4\33\1\uffff\1\33\1\164\1\uffff\3\33\1\171\1\33\1\173\1\174\1\175\1\uffff\1\176\1\177\1\33\2\uffff\1\33\5\uffff\1\33\1\u0083\1\33\1\uffff\1\u0085\1\uffff";
    static final String DFA12_eofS =
        "\u0086\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\156\1\150\1\157\1\141\1\151\1\154\1\165\1\122\1\101\3\uffff\1\122\1\117\2\105\1\117\2\uffff\2\0\1\52\2\uffff\1\162\1\uffff\1\164\1\141\1\157\1\164\1\143\1\155\1\157\1\155\1\105\1\102\3\uffff\1\111\1\122\1\106\1\131\1\124\1\114\5\uffff\1\143\1\60\1\162\1\154\1\145\1\151\1\145\1\141\1\145\1\101\1\114\1\115\2\105\2\60\1\114\1\150\1\uffff\1\141\1\145\1\60\1\155\1\60\1\164\1\162\1\124\1\105\1\101\1\111\1\122\2\uffff\1\60\1\141\1\143\1\141\1\uffff\1\141\1\uffff\1\60\1\151\1\105\1\60\1\122\1\107\1\105\1\uffff\1\162\1\164\1\156\1\154\1\uffff\1\143\1\60\1\uffff\1\131\2\116\1\50\1\145\3\60\1\uffff\2\60\1\103\2\uffff\1\162\5\uffff\1\105\1\60\1\123\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\156\1\150\1\157\1\145\1\151\1\154\1\165\1\122\1\101\3\uffff\1\122\1\117\2\105\1\125\2\uffff\2\uffff\1\57\2\uffff\1\162\1\uffff\1\164\1\141\1\157\1\164\1\143\1\155\1\157\1\155\1\105\1\102\3\uffff\1\111\1\122\1\106\1\131\1\124\1\114\5\uffff\1\143\1\172\1\162\1\154\1\145\1\151\1\145\1\141\1\145\1\101\1\114\1\115\2\105\2\172\1\114\1\150\1\uffff\1\141\1\145\1\172\1\155\1\172\1\164\1\162\1\124\1\105\1\101\1\111\1\122\2\uffff\1\172\1\141\1\143\1\141\1\uffff\1\141\1\uffff\1\172\1\151\1\105\1\172\1\122\1\107\1\105\1\uffff\1\162\1\164\1\156\1\154\1\uffff\1\143\1\172\1\uffff\1\131\2\116\1\172\1\145\3\172\1\uffff\2\172\1\103\2\uffff\1\162\5\uffff\1\105\1\172\1\123\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\13\uffff\1\15\1\16\1\17\5\uffff\1\26\1\27\3\uffff\1\33\1\34\1\uffff\1\26\12\uffff\1\15\1\16\1\17\6\uffff\1\27\1\30\1\31\1\32\1\33\22\uffff\1\3\14\uffff\1\23\1\24\4\uffff\1\6\1\uffff\1\7\7\uffff\1\25\4\uffff\1\10\2\uffff\1\14\10\uffff\1\13\3\uffff\1\1\1\2\1\uffff\1\5\1\11\1\12\1\20\1\21\3\uffff\1\4\1\uffff\1\22";
    static final String DFA12_specialS =
        "\1\1\24\uffff\1\2\1\0\157\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\1\13\1\14\2\31\1\15\2\31\1\27\12\24\7\31\2\23\1\11\2\23\1\17\4\23\1\21\2\23\1\22\1\23\1\16\1\23\1\20\1\23\1\12\6\23\6\31\1\23\1\4\1\3\1\5\1\23\1\7\2\23\1\2\4\23\1\10\5\23\1\6\1\23\1\1\4\23\uff85\31",
            "\1\32",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37\3\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\5\uffff\1\56",
            "",
            "",
            "\0\60",
            "\0\60",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\132",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\151",
            "\1\152",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\7\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\172",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\u0080",
            "",
            "",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\u0084",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
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
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_CREATE | RULE_TABLA | RULE_LPAREN | RULE_RPAREN | RULE_COMA | RULE_PRIMARY | RULE_FOREIGN | RULE_REFERENCES | RULE_KEY | RULE_NOT | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 48;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='v') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0=='b') ) {s = 4;}

                        else if ( (LA12_0=='d') ) {s = 5;}

                        else if ( (LA12_0=='t') ) {s = 6;}

                        else if ( (LA12_0=='f') ) {s = 7;}

                        else if ( (LA12_0=='n') ) {s = 8;}

                        else if ( (LA12_0=='C') ) {s = 9;}

                        else if ( (LA12_0=='T') ) {s = 10;}

                        else if ( (LA12_0=='(') ) {s = 11;}

                        else if ( (LA12_0==')') ) {s = 12;}

                        else if ( (LA12_0==',') ) {s = 13;}

                        else if ( (LA12_0=='P') ) {s = 14;}

                        else if ( (LA12_0=='F') ) {s = 15;}

                        else if ( (LA12_0=='R') ) {s = 16;}

                        else if ( (LA12_0=='K') ) {s = 17;}

                        else if ( (LA12_0=='N') ) {s = 18;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='J')||(LA12_0>='L' && LA12_0<='M')||LA12_0=='O'||LA12_0=='Q'||LA12_0=='S'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='a'||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='s')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( (LA12_0=='\"') ) {s = 21;}

                        else if ( (LA12_0=='\'') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<='`')||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 48;}

                        else s = 25;

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