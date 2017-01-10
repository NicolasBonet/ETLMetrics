package co.edu.uniandes.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenSqlLexer extends Lexer {
    public static final int RULE_CTABLE=7;
    public static final int RULE_KEY=14;
    public static final int RULE_STRING=22;
    public static final int RULE_NOT=11;
    public static final int RULE_NULL=12;
    public static final int RULE_LONGITUD=19;
    public static final int RULE_LPARENT=8;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_CREATE=6;
    public static final int RULE_FIN=5;
    public static final int RULE_RPARENT=9;
    public static final int EOF=-1;
    public static final int RULE_REFERENCES=16;
    public static final int RULE_ID=17;
    public static final int RULE_COMMA=10;
    public static final int RULE_WS=25;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_NUMBER=20;
    public static final int RULE_PRIMARY=13;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SEMICOLON=4;
    public static final int RULE_FOREIGN=15;
    public static final int RULE_TIPO=18;

    // delegates
    // delegators

    public InternalGenSqlLexer() {;} 
    public InternalGenSqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGenSqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGenSql.g"; }

    // $ANTLR start "RULE_LONGITUD"
    public final void mRULE_LONGITUD() throws RecognitionException {
        try {
            int _type = RULE_LONGITUD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1674:15: ( RULE_LPARENT RULE_NUMBER RULE_RPARENT )
            // InternalGenSql.g:1674:17: RULE_LPARENT RULE_NUMBER RULE_RPARENT
            {
            mRULE_LPARENT(); 
            mRULE_NUMBER(); 
            mRULE_RPARENT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONGITUD"

    // $ANTLR start "RULE_CREATE"
    public final void mRULE_CREATE() throws RecognitionException {
        try {
            int _type = RULE_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1676:13: ( 'CREATE' )
            // InternalGenSql.g:1676:15: 'CREATE'
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
            // InternalGenSql.g:1678:13: ( 'TABLE' )
            // InternalGenSql.g:1678:15: 'TABLE'
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
            // InternalGenSql.g:1680:14: ( '(' )
            // InternalGenSql.g:1680:16: '('
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
            // InternalGenSql.g:1682:14: ( ')' )
            // InternalGenSql.g:1682:16: ')'
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

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1684:16: ( ';' )
            // InternalGenSql.g:1684:18: ';'
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

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1686:12: ( ',' )
            // InternalGenSql.g:1686:14: ','
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
            // InternalGenSql.g:1688:14: ( 'FOREIGN' )
            // InternalGenSql.g:1688:16: 'FOREIGN'
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
            // InternalGenSql.g:1690:14: ( 'PRIMARY' )
            // InternalGenSql.g:1690:16: 'PRIMARY'
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
            // InternalGenSql.g:1692:10: ( 'KEY' )
            // InternalGenSql.g:1692:12: 'KEY'
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

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1694:11: ( 'NULL' )
            // InternalGenSql.g:1694:13: 'NULL'
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

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1696:10: ( 'NOT' )
            // InternalGenSql.g:1696:12: 'NOT'
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

    // $ANTLR start "RULE_REFERENCES"
    public final void mRULE_REFERENCES() throws RecognitionException {
        try {
            int _type = RULE_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1698:17: ( 'REFERENCES' )
            // InternalGenSql.g:1698:19: 'REFERENCES'
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

    // $ANTLR start "RULE_TIPO"
    public final void mRULE_TIPO() throws RecognitionException {
        try {
            int _type = RULE_TIPO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1700:11: ( ( 'varchar' | 'int' | 'String' | 'boolean' | 'date' | 'number' ) )
            // InternalGenSql.g:1700:13: ( 'varchar' | 'int' | 'String' | 'boolean' | 'date' | 'number' )
            {
            // InternalGenSql.g:1700:13: ( 'varchar' | 'int' | 'String' | 'boolean' | 'date' | 'number' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'v':
                {
                alt1=1;
                }
                break;
            case 'i':
                {
                alt1=2;
                }
                break;
            case 'S':
                {
                alt1=3;
                }
                break;
            case 'b':
                {
                alt1=4;
                }
                break;
            case 'd':
                {
                alt1=5;
                }
                break;
            case 'n':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGenSql.g:1700:14: 'varchar'
                    {
                    match("varchar"); 


                    }
                    break;
                case 2 :
                    // InternalGenSql.g:1700:24: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 3 :
                    // InternalGenSql.g:1700:30: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 4 :
                    // InternalGenSql.g:1700:39: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 5 :
                    // InternalGenSql.g:1700:49: 'date'
                    {
                    match("date"); 


                    }
                    break;
                case 6 :
                    // InternalGenSql.g:1700:56: 'number'
                    {
                    match("number"); 


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
    // $ANTLR end "RULE_TIPO"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1702:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )* )
            // InternalGenSql.g:1702:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGenSql.g:1702:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGenSql.g:
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // InternalGenSql.g:1704:22: ( ( '0' .. '9' )* )
            // InternalGenSql.g:1704:24: ( '0' .. '9' )*
            {
            // InternalGenSql.g:1704:24: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGenSql.g:1704:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_FIN"
    public final void mRULE_FIN() throws RecognitionException {
        try {
            int _type = RULE_FIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1706:10: ( EOF )
            // InternalGenSql.g:1706:12: EOF
            {
            match(EOF); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIN"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGenSql.g:1708:10: ( ( '0' .. '9' )+ )
            // InternalGenSql.g:1708:12: ( '0' .. '9' )+
            {
            // InternalGenSql.g:1708:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGenSql.g:1708:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalGenSql.g:1710:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGenSql.g:1710:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGenSql.g:1710:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenSql.g:1710:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGenSql.g:1710:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGenSql.g:1710:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGenSql.g:1710:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGenSql.g:1710:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGenSql.g:1710:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGenSql.g:1710:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGenSql.g:1710:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalGenSql.g:1712:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGenSql.g:1712:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGenSql.g:1712:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGenSql.g:1712:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalGenSql.g:1714:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGenSql.g:1714:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGenSql.g:1714:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGenSql.g:1714:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalGenSql.g:1714:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGenSql.g:1714:41: ( '\\r' )? '\\n'
                    {
                    // InternalGenSql.g:1714:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGenSql.g:1714:41: '\\r'
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
            // InternalGenSql.g:1716:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGenSql.g:1716:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGenSql.g:1716:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGenSql.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalGenSql.g:1718:16: ( . )
            // InternalGenSql.g:1718:18: .
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
        // InternalGenSql.g:1:8: ( RULE_LONGITUD | RULE_CREATE | RULE_CTABLE | RULE_LPARENT | RULE_RPARENT | RULE_SEMICOLON | RULE_COMMA | RULE_FOREIGN | RULE_PRIMARY | RULE_KEY | RULE_NULL | RULE_NOT | RULE_REFERENCES | RULE_TIPO | RULE_ID | RULE_FIN | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=22;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGenSql.g:1:10: RULE_LONGITUD
                {
                mRULE_LONGITUD(); 

                }
                break;
            case 2 :
                // InternalGenSql.g:1:24: RULE_CREATE
                {
                mRULE_CREATE(); 

                }
                break;
            case 3 :
                // InternalGenSql.g:1:36: RULE_CTABLE
                {
                mRULE_CTABLE(); 

                }
                break;
            case 4 :
                // InternalGenSql.g:1:48: RULE_LPARENT
                {
                mRULE_LPARENT(); 

                }
                break;
            case 5 :
                // InternalGenSql.g:1:61: RULE_RPARENT
                {
                mRULE_RPARENT(); 

                }
                break;
            case 6 :
                // InternalGenSql.g:1:74: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 7 :
                // InternalGenSql.g:1:89: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 8 :
                // InternalGenSql.g:1:100: RULE_FOREIGN
                {
                mRULE_FOREIGN(); 

                }
                break;
            case 9 :
                // InternalGenSql.g:1:113: RULE_PRIMARY
                {
                mRULE_PRIMARY(); 

                }
                break;
            case 10 :
                // InternalGenSql.g:1:126: RULE_KEY
                {
                mRULE_KEY(); 

                }
                break;
            case 11 :
                // InternalGenSql.g:1:135: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 12 :
                // InternalGenSql.g:1:145: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 13 :
                // InternalGenSql.g:1:154: RULE_REFERENCES
                {
                mRULE_REFERENCES(); 

                }
                break;
            case 14 :
                // InternalGenSql.g:1:170: RULE_TIPO
                {
                mRULE_TIPO(); 

                }
                break;
            case 15 :
                // InternalGenSql.g:1:180: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalGenSql.g:1:188: RULE_FIN
                {
                mRULE_FIN(); 

                }
                break;
            case 17 :
                // InternalGenSql.g:1:197: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalGenSql.g:1:206: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalGenSql.g:1:218: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalGenSql.g:1:234: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalGenSql.g:1:250: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalGenSql.g:1:258: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\23\1\32\2\35\3\uffff\13\35\3\uffff\3\31\4\uffff\1\35\1\uffff\1\35\3\uffff\14\35\5\uffff\4\35\1\105\1\35\1\107\2\35\1\112\10\35\1\uffff\1\123\1\uffff\2\35\1\uffff\2\35\1\112\2\35\1\132\2\35\1\uffff\5\35\1\142\1\uffff\4\35\1\112\1\35\1\112\1\uffff\1\150\1\151\1\35\2\112\2\uffff\2\35\1\155\1\uffff";
    static final String DFA13_eofS =
        "\156\uffff";
    static final String DFA13_minS =
        "\1\0\1\51\1\122\1\101\3\uffff\1\117\1\122\1\105\1\117\1\105\1\141\1\156\1\164\1\157\1\141\1\165\3\uffff\2\0\1\52\4\uffff\1\105\1\uffff\1\102\3\uffff\1\122\1\111\1\131\1\114\1\124\1\106\1\162\1\164\1\162\1\157\1\164\1\155\5\uffff\1\101\1\114\1\105\1\115\1\60\1\114\1\60\1\105\1\143\1\60\1\151\1\154\1\145\1\142\1\124\1\105\1\111\1\101\1\uffff\1\60\1\uffff\1\122\1\150\1\uffff\1\156\1\145\1\60\1\145\1\105\1\60\1\107\1\122\1\uffff\1\105\1\141\1\147\1\141\1\162\1\60\1\uffff\1\116\1\131\1\116\1\162\1\60\1\156\1\60\1\uffff\2\60\1\103\2\60\2\uffff\1\105\1\123\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\71\1\122\1\101\3\uffff\1\117\1\122\1\105\1\125\1\105\1\141\1\156\1\164\1\157\1\141\1\165\3\uffff\2\uffff\1\57\4\uffff\1\105\1\uffff\1\102\3\uffff\1\122\1\111\1\131\1\114\1\124\1\106\1\162\1\164\1\162\1\157\1\164\1\155\5\uffff\1\101\1\114\1\105\1\115\1\172\1\114\1\172\1\105\1\143\1\172\1\151\1\154\1\145\1\142\1\124\1\105\1\111\1\101\1\uffff\1\172\1\uffff\1\122\1\150\1\uffff\1\156\1\145\1\172\1\145\1\105\1\172\1\107\1\122\1\uffff\1\105\1\141\1\147\1\141\1\162\1\172\1\uffff\1\116\1\131\1\116\1\162\1\172\1\156\1\172\1\uffff\2\172\1\103\2\172\2\uffff\1\105\1\123\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\5\1\6\1\7\13\uffff\1\17\1\20\1\21\3\uffff\1\25\1\26\1\4\1\1\1\uffff\1\17\1\uffff\1\5\1\6\1\7\14\uffff\1\21\1\22\1\23\1\24\1\25\22\uffff\1\12\1\uffff\1\14\2\uffff\1\16\10\uffff\1\13\6\uffff\1\3\7\uffff\1\2\5\uffff\1\10\1\11\3\uffff\1\15";
    static final String DFA13_specialS =
        "\1\0\24\uffff\1\2\1\1\127\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\1\1\1\4\2\31\1\6\2\31\1\27\12\24\1\31\1\5\5\31\2\22\1\2\2\22\1\7\4\22\1\11\2\22\1\12\1\22\1\10\1\22\1\13\1\16\1\3\6\22\6\31\1\22\1\17\1\22\1\20\4\22\1\15\4\22\1\21\7\22\1\14\4\22\uff85\31",
            "\1\33\6\uffff\12\33",
            "\1\34",
            "\1\36",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\46\5\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "",
            "",
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
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\106",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\110",
            "\1\111",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\130",
            "\1\131",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\147",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\152",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "\1\153",
            "\1\154",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_LONGITUD | RULE_CREATE | RULE_CTABLE | RULE_LPARENT | RULE_RPARENT | RULE_SEMICOLON | RULE_COMMA | RULE_FOREIGN | RULE_PRIMARY | RULE_KEY | RULE_NULL | RULE_NOT | RULE_REFERENCES | RULE_TIPO | RULE_ID | RULE_FIN | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='(') ) {s = 1;}

                        else if ( (LA13_0=='C') ) {s = 2;}

                        else if ( (LA13_0=='T') ) {s = 3;}

                        else if ( (LA13_0==')') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0==',') ) {s = 6;}

                        else if ( (LA13_0=='F') ) {s = 7;}

                        else if ( (LA13_0=='P') ) {s = 8;}

                        else if ( (LA13_0=='K') ) {s = 9;}

                        else if ( (LA13_0=='N') ) {s = 10;}

                        else if ( (LA13_0=='R') ) {s = 11;}

                        else if ( (LA13_0=='v') ) {s = 12;}

                        else if ( (LA13_0=='i') ) {s = 13;}

                        else if ( (LA13_0=='S') ) {s = 14;}

                        else if ( (LA13_0=='b') ) {s = 15;}

                        else if ( (LA13_0=='d') ) {s = 16;}

                        else if ( (LA13_0=='n') ) {s = 17;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='D' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='J')||(LA13_0>='L' && LA13_0<='M')||LA13_0=='O'||LA13_0=='Q'||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='a'||LA13_0=='c'||(LA13_0>='e' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='u')||(LA13_0>='w' && LA13_0<='z')) ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 20;}

                        else if ( (LA13_0=='\"') ) {s = 21;}

                        else if ( (LA13_0=='\'') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 24;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<='`')||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 25;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}