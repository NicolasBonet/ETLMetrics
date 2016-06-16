package co.edu.uniandes.tallerM2M.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlLexer extends Lexer {
    public static final int RULE_COMA=11;
    public static final int RULE_TPRIMARY=12;
    public static final int RULE_TCOLUMNAS=17;
    public static final int RULE_STRING=21;
    public static final int RULE_SL_COMMENT=23;
    public static final int RULE_TFOREIGN=14;
    public static final int RULE_TTABLE=8;
    public static final int EOF=-1;
    public static final int RULE_TNULL=19;
    public static final int RULE_TCREATE=7;
    public static final int RULE_ID=16;
    public static final int RULE_WS=24;
    public static final int RULE_TKEY=13;
    public static final int RULE_VVARCHAR255=6;
    public static final int RULE_TNOT=18;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_PARENTESISA=9;
    public static final int RULE_PARENTESISB=10;
    public static final int RULE_TREFERENCES=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_VINT=5;
    public static final int RULE_INT=20;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_VVARCHAR=4;

    // delegates
    // delegators

    public InternalSqlLexer() {;} 
    public InternalSqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSql.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:11:7: ( ' ' )
            // InternalSql.g:11:9: ' '
            {
            match(' '); 

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
            // InternalSql.g:12:7: ( ' NOT NULL' )
            // InternalSql.g:12:9: ' NOT NULL'
            {
            match(" NOT NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_TCREATE"
    public final void mRULE_TCREATE() throws RecognitionException {
        try {
            int _type = RULE_TCREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1628:14: ( 'CREATE' )
            // InternalSql.g:1628:16: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TCREATE"

    // $ANTLR start "RULE_TTABLE"
    public final void mRULE_TTABLE() throws RecognitionException {
        try {
            int _type = RULE_TTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1630:13: ( 'TABLE' )
            // InternalSql.g:1630:15: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TTABLE"

    // $ANTLR start "RULE_TPRIMARY"
    public final void mRULE_TPRIMARY() throws RecognitionException {
        try {
            int _type = RULE_TPRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1632:15: ( 'PRIMARY' )
            // InternalSql.g:1632:17: 'PRIMARY'
            {
            match("PRIMARY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TPRIMARY"

    // $ANTLR start "RULE_TKEY"
    public final void mRULE_TKEY() throws RecognitionException {
        try {
            int _type = RULE_TKEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1634:11: ( 'KEY' )
            // InternalSql.g:1634:13: 'KEY'
            {
            match("KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TKEY"

    // $ANTLR start "RULE_TFOREIGN"
    public final void mRULE_TFOREIGN() throws RecognitionException {
        try {
            int _type = RULE_TFOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1636:15: ( 'FOREIGN' )
            // InternalSql.g:1636:17: 'FOREIGN'
            {
            match("FOREIGN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TFOREIGN"

    // $ANTLR start "RULE_TCOLUMNAS"
    public final void mRULE_TCOLUMNAS() throws RecognitionException {
        try {
            int _type = RULE_TCOLUMNAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1638:16: ( 'COLUMNAS' )
            // InternalSql.g:1638:18: 'COLUMNAS'
            {
            match("COLUMNAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TCOLUMNAS"

    // $ANTLR start "RULE_TREFERENCES"
    public final void mRULE_TREFERENCES() throws RecognitionException {
        try {
            int _type = RULE_TREFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1640:18: ( 'REFERENCES' )
            // InternalSql.g:1640:20: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TREFERENCES"

    // $ANTLR start "RULE_TNOT"
    public final void mRULE_TNOT() throws RecognitionException {
        try {
            int _type = RULE_TNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1642:11: ( 'NOT' )
            // InternalSql.g:1642:13: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TNOT"

    // $ANTLR start "RULE_TNULL"
    public final void mRULE_TNULL() throws RecognitionException {
        try {
            int _type = RULE_TNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1644:12: ( 'NULL' )
            // InternalSql.g:1644:14: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TNULL"

    // $ANTLR start "RULE_PARENTESISA"
    public final void mRULE_PARENTESISA() throws RecognitionException {
        try {
            int _type = RULE_PARENTESISA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1646:18: ( '(' )
            // InternalSql.g:1646:20: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTESISA"

    // $ANTLR start "RULE_PARENTESISB"
    public final void mRULE_PARENTESISB() throws RecognitionException {
        try {
            int _type = RULE_PARENTESISB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1648:18: ( ')' )
            // InternalSql.g:1648:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTESISB"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1650:11: ( ',' )
            // InternalSql.g:1650:13: ','
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

    // $ANTLR start "RULE_VINT"
    public final void mRULE_VINT() throws RecognitionException {
        try {
            int _type = RULE_VINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1652:11: ( 'int' )
            // InternalSql.g:1652:13: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VINT"

    // $ANTLR start "RULE_VVARCHAR"
    public final void mRULE_VVARCHAR() throws RecognitionException {
        try {
            int _type = RULE_VVARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1654:15: ( 'varchar' )
            // InternalSql.g:1654:17: 'varchar'
            {
            match("varchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VVARCHAR"

    // $ANTLR start "RULE_VVARCHAR255"
    public final void mRULE_VVARCHAR255() throws RecognitionException {
        try {
            int _type = RULE_VVARCHAR255;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1656:18: ( 'varchar(255)' )
            // InternalSql.g:1656:20: 'varchar(255)'
            {
            match("varchar(255)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VVARCHAR255"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:1658:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSql.g:1658:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSql.g:1658:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSql.g:1658:11: '^'
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

            // InternalSql.g:1658:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql.g:
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
            // InternalSql.g:1660:10: ( ( '0' .. '9' )+ )
            // InternalSql.g:1660:12: ( '0' .. '9' )+
            {
            // InternalSql.g:1660:12: ( '0' .. '9' )+
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
            	    // InternalSql.g:1660:13: '0' .. '9'
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
            // InternalSql.g:1662:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSql.g:1662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSql.g:1662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSql.g:1662:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSql.g:1662:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSql.g:1662:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSql.g:1662:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSql.g:1662:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSql.g:1662:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSql.g:1662:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSql.g:1662:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSql.g:1664:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSql.g:1664:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSql.g:1664:24: ( options {greedy=false; } : . )*
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
            	    // InternalSql.g:1664:52: .
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
            // InternalSql.g:1666:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSql.g:1666:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSql.g:1666:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql.g:1666:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSql.g:1666:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSql.g:1666:41: ( '\\r' )? '\\n'
                    {
                    // InternalSql.g:1666:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSql.g:1666:41: '\\r'
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
            // InternalSql.g:1668:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSql.g:1668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSql.g:1668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalSql.g:
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
            // InternalSql.g:1670:16: ( . )
            // InternalSql.g:1670:18: .
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
        // InternalSql.g:1:8: ( T__26 | T__27 | RULE_TCREATE | RULE_TTABLE | RULE_TPRIMARY | RULE_TKEY | RULE_TFOREIGN | RULE_TCOLUMNAS | RULE_TREFERENCES | RULE_TNOT | RULE_TNULL | RULE_PARENTESISA | RULE_PARENTESISB | RULE_COMA | RULE_VINT | RULE_VVARCHAR | RULE_VVARCHAR255 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSql.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // InternalSql.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // InternalSql.g:1:22: RULE_TCREATE
                {
                mRULE_TCREATE(); 

                }
                break;
            case 4 :
                // InternalSql.g:1:35: RULE_TTABLE
                {
                mRULE_TTABLE(); 

                }
                break;
            case 5 :
                // InternalSql.g:1:47: RULE_TPRIMARY
                {
                mRULE_TPRIMARY(); 

                }
                break;
            case 6 :
                // InternalSql.g:1:61: RULE_TKEY
                {
                mRULE_TKEY(); 

                }
                break;
            case 7 :
                // InternalSql.g:1:71: RULE_TFOREIGN
                {
                mRULE_TFOREIGN(); 

                }
                break;
            case 8 :
                // InternalSql.g:1:85: RULE_TCOLUMNAS
                {
                mRULE_TCOLUMNAS(); 

                }
                break;
            case 9 :
                // InternalSql.g:1:100: RULE_TREFERENCES
                {
                mRULE_TREFERENCES(); 

                }
                break;
            case 10 :
                // InternalSql.g:1:117: RULE_TNOT
                {
                mRULE_TNOT(); 

                }
                break;
            case 11 :
                // InternalSql.g:1:127: RULE_TNULL
                {
                mRULE_TNULL(); 

                }
                break;
            case 12 :
                // InternalSql.g:1:138: RULE_PARENTESISA
                {
                mRULE_PARENTESISA(); 

                }
                break;
            case 13 :
                // InternalSql.g:1:155: RULE_PARENTESISB
                {
                mRULE_PARENTESISB(); 

                }
                break;
            case 14 :
                // InternalSql.g:1:172: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 15 :
                // InternalSql.g:1:182: RULE_VINT
                {
                mRULE_VINT(); 

                }
                break;
            case 16 :
                // InternalSql.g:1:192: RULE_VVARCHAR
                {
                mRULE_VVARCHAR(); 

                }
                break;
            case 17 :
                // InternalSql.g:1:206: RULE_VVARCHAR255
                {
                mRULE_VVARCHAR255(); 

                }
                break;
            case 18 :
                // InternalSql.g:1:223: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // InternalSql.g:1:231: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // InternalSql.g:1:240: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // InternalSql.g:1:252: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // InternalSql.g:1:268: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // InternalSql.g:1:284: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalSql.g:1:292: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\27\7\33\3\uffff\2\33\1\25\2\uffff\3\25\5\uffff\2\33\1\uffff\7\33\3\uffff\2\33\4\uffff\4\33\1\73\2\33\1\76\1\33\1\100\5\33\1\uffff\2\33\1\uffff\1\110\1\uffff\3\33\1\114\3\33\1\uffff\1\33\1\121\1\33\1\uffff\4\33\1\uffff\1\33\1\130\1\131\1\33\1\134\1\135\2\uffff\1\33\3\uffff\1\33\1\140\1\uffff";
    static final String DFA12_eofS =
        "\141\uffff";
    static final String DFA12_minS =
        "\1\0\1\11\1\117\1\101\1\122\1\105\1\117\1\105\1\117\3\uffff\1\156\1\141\1\101\2\uffff\2\0\1\52\5\uffff\1\105\1\114\1\uffff\1\102\1\111\1\131\1\122\1\106\1\124\1\114\3\uffff\1\164\1\162\4\uffff\1\101\1\125\1\114\1\115\1\60\2\105\1\60\1\114\1\60\1\143\1\124\1\115\1\105\1\101\1\uffff\1\111\1\122\1\uffff\1\60\1\uffff\1\150\1\105\1\116\1\60\1\122\1\107\1\105\1\uffff\1\141\1\60\1\101\1\uffff\1\131\2\116\1\162\1\uffff\1\123\2\60\1\103\1\50\1\60\2\uffff\1\105\3\uffff\1\123\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\116\1\122\1\101\1\122\1\105\1\117\1\105\1\125\3\uffff\1\156\1\141\1\172\2\uffff\2\uffff\1\57\5\uffff\1\105\1\114\1\uffff\1\102\1\111\1\131\1\122\1\106\1\124\1\114\3\uffff\1\164\1\162\4\uffff\1\101\1\125\1\114\1\115\1\172\2\105\1\172\1\114\1\172\1\143\1\124\1\115\1\105\1\101\1\uffff\1\111\1\122\1\uffff\1\172\1\uffff\1\150\1\105\1\116\1\172\1\122\1\107\1\105\1\uffff\1\141\1\172\1\101\1\uffff\1\131\2\116\1\162\1\uffff\1\123\2\172\1\103\2\172\2\uffff\1\105\3\uffff\1\123\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\14\1\15\1\16\3\uffff\1\22\1\23\3\uffff\1\27\1\30\1\2\1\1\1\27\2\uffff\1\22\7\uffff\1\14\1\15\1\16\2\uffff\1\23\1\24\1\25\1\26\17\uffff\1\6\2\uffff\1\12\1\uffff\1\17\7\uffff\1\13\3\uffff\1\4\4\uffff\1\3\6\uffff\1\5\1\7\1\uffff\1\21\1\20\1\10\2\uffff\1\11";
    static final String DFA12_specialS =
        "\1\0\20\uffff\1\2\1\1\116\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\1\1\25\1\21\4\25\1\22\1\11\1\12\2\25\1\13\2\25\1\23\12\20\7\25\2\17\1\2\2\17\1\6\4\17\1\5\2\17\1\10\1\17\1\4\1\17\1\7\1\17\1\3\6\17\3\25\1\16\1\17\1\25\10\17\1\14\14\17\1\15\4\17\uff85\25",
            "\2\30\2\uffff\1\30\22\uffff\1\30\55\uffff\1\26",
            "\1\32\2\uffff\1\31",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41\5\uffff\1\42",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\74",
            "\1\75",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\77",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\132",
            "\1\133\7\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\136",
            "",
            "",
            "",
            "\1\137",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( T__26 | T__27 | RULE_TCREATE | RULE_TTABLE | RULE_TPRIMARY | RULE_TKEY | RULE_TFOREIGN | RULE_TCOLUMNAS | RULE_TREFERENCES | RULE_TNOT | RULE_TNULL | RULE_PARENTESISA | RULE_PARENTESISB | RULE_COMA | RULE_VINT | RULE_VVARCHAR | RULE_VVARCHAR255 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0==' ') ) {s = 1;}

                        else if ( (LA12_0=='C') ) {s = 2;}

                        else if ( (LA12_0=='T') ) {s = 3;}

                        else if ( (LA12_0=='P') ) {s = 4;}

                        else if ( (LA12_0=='K') ) {s = 5;}

                        else if ( (LA12_0=='F') ) {s = 6;}

                        else if ( (LA12_0=='R') ) {s = 7;}

                        else if ( (LA12_0=='N') ) {s = 8;}

                        else if ( (LA12_0=='(') ) {s = 9;}

                        else if ( (LA12_0==')') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='v') ) {s = 13;}

                        else if ( (LA12_0=='^') ) {s = 14;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='J')||(LA12_0>='L' && LA12_0<='M')||LA12_0=='O'||LA12_0=='Q'||LA12_0=='S'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 15;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 41;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 41;}

                        else s = 21;

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