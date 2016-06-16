package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLLexer extends Lexer {
    public static final int RULE_TNUMERIC=25;
    public static final int RULE_TBOOLEAN=19;
    public static final int RULE_PRIMARY_KEY=11;
    public static final int RULE_TTIMESTAMP=29;
    public static final int RULE_STRING=31;
    public static final int RULE_TVARBINARY=20;
    public static final int RULE_DATA_TYPE=9;
    public static final int RULE_FOREIGN_KEY=12;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_CREATE_TABLE=4;
    public static final int RULE_TTIME=28;
    public static final int EOF=-1;
    public static final int RULE_NOT_NULL=10;
    public static final int RULE_TFLOAT=26;
    public static final int RULE_REFERENCES=13;
    public static final int RULE_ID=5;
    public static final int RULE_PRECISION=23;
    public static final int RULE_COMMA=7;
    public static final int RULE_MAX_LENGTH=14;
    public static final int RULE_TDECIMAL=24;
    public static final int RULE_WS=34;
    public static final int RULE_TCHARACTER=17;
    public static final int RULE_TBINARY=18;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_TBIGINT=22;
    public static final int RULE_INT=30;
    public static final int RULE_TINT=15;
    public static final int RULE_TSMALLINT=21;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_RPAR=8;
    public static final int RULE_LPAR=6;
    public static final int RULE_TDATE=27;
    public static final int RULE_TVARCHAR=16;

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

    // $ANTLR start "RULE_CREATE_TABLE"
    public final void mRULE_CREATE_TABLE() throws RecognitionException {
        try {
            int _type = RULE_CREATE_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:503:19: ( 'CREATE TABLE' )
            // InternalSQL.g:503:21: 'CREATE TABLE'
            {
            match("CREATE TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CREATE_TABLE"

    // $ANTLR start "RULE_NOT_NULL"
    public final void mRULE_NOT_NULL() throws RecognitionException {
        try {
            int _type = RULE_NOT_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:505:15: ( 'NOT NULL' )
            // InternalSQL.g:505:17: 'NOT NULL'
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

    // $ANTLR start "RULE_PRIMARY_KEY"
    public final void mRULE_PRIMARY_KEY() throws RecognitionException {
        try {
            int _type = RULE_PRIMARY_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:507:18: ( 'PRIMARY KEY' )
            // InternalSQL.g:507:20: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRIMARY_KEY"

    // $ANTLR start "RULE_FOREIGN_KEY"
    public final void mRULE_FOREIGN_KEY() throws RecognitionException {
        try {
            int _type = RULE_FOREIGN_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:509:18: ( 'FOREIGN KEY' )
            // InternalSQL.g:509:20: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOREIGN_KEY"

    // $ANTLR start "RULE_REFERENCES"
    public final void mRULE_REFERENCES() throws RecognitionException {
        try {
            int _type = RULE_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:511:17: ( 'REFERENCES' )
            // InternalSQL.g:511:19: 'REFERENCES'
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

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:513:12: ( ',' )
            // InternalSQL.g:513:14: ','
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

    // $ANTLR start "RULE_LPAR"
    public final void mRULE_LPAR() throws RecognitionException {
        try {
            int _type = RULE_LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:515:11: ( '(' )
            // InternalSQL.g:515:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAR"

    // $ANTLR start "RULE_RPAR"
    public final void mRULE_RPAR() throws RecognitionException {
        try {
            int _type = RULE_RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:517:11: ( ')' )
            // InternalSQL.g:517:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAR"

    // $ANTLR start "RULE_TINT"
    public final void mRULE_TINT() throws RecognitionException {
        try {
            // InternalSQL.g:519:20: ( 'int' ( RULE_MAX_LENGTH )? )
            // InternalSQL.g:519:22: 'int' ( RULE_MAX_LENGTH )?
            {
            match("int"); 

            // InternalSQL.g:519:28: ( RULE_MAX_LENGTH )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='(') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSQL.g:519:28: RULE_MAX_LENGTH
                    {
                    mRULE_MAX_LENGTH(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TINT"

    // $ANTLR start "RULE_TVARCHAR"
    public final void mRULE_TVARCHAR() throws RecognitionException {
        try {
            // InternalSQL.g:521:24: ( 'varchar' RULE_MAX_LENGTH )
            // InternalSQL.g:521:26: 'varchar' RULE_MAX_LENGTH
            {
            match("varchar"); 

            mRULE_MAX_LENGTH(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TVARCHAR"

    // $ANTLR start "RULE_TCHARACTER"
    public final void mRULE_TCHARACTER() throws RecognitionException {
        try {
            // InternalSQL.g:523:26: ( 'char' RULE_MAX_LENGTH )
            // InternalSQL.g:523:28: 'char' RULE_MAX_LENGTH
            {
            match("char"); 

            mRULE_MAX_LENGTH(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TCHARACTER"

    // $ANTLR start "RULE_TBINARY"
    public final void mRULE_TBINARY() throws RecognitionException {
        try {
            // InternalSQL.g:525:23: ( 'binary' RULE_MAX_LENGTH )
            // InternalSQL.g:525:25: 'binary' RULE_MAX_LENGTH
            {
            match("binary"); 

            mRULE_MAX_LENGTH(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TBINARY"

    // $ANTLR start "RULE_TBOOLEAN"
    public final void mRULE_TBOOLEAN() throws RecognitionException {
        try {
            // InternalSQL.g:527:24: ( 'boolean' )
            // InternalSQL.g:527:26: 'boolean'
            {
            match("boolean"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TBOOLEAN"

    // $ANTLR start "RULE_TVARBINARY"
    public final void mRULE_TVARBINARY() throws RecognitionException {
        try {
            // InternalSQL.g:529:26: ( 'varbinary' RULE_MAX_LENGTH )
            // InternalSQL.g:529:28: 'varbinary' RULE_MAX_LENGTH
            {
            match("varbinary"); 

            mRULE_MAX_LENGTH(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TVARBINARY"

    // $ANTLR start "RULE_TSMALLINT"
    public final void mRULE_TSMALLINT() throws RecognitionException {
        try {
            // InternalSQL.g:531:25: ( 'smallint' )
            // InternalSQL.g:531:27: 'smallint'
            {
            match("smallint"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TSMALLINT"

    // $ANTLR start "RULE_TBIGINT"
    public final void mRULE_TBIGINT() throws RecognitionException {
        try {
            // InternalSQL.g:533:23: ( 'bigint' )
            // InternalSQL.g:533:25: 'bigint'
            {
            match("bigint"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TBIGINT"

    // $ANTLR start "RULE_TDECIMAL"
    public final void mRULE_TDECIMAL() throws RecognitionException {
        try {
            // InternalSQL.g:535:24: ( 'decimal' RULE_PRECISION )
            // InternalSQL.g:535:26: 'decimal' RULE_PRECISION
            {
            match("decimal"); 

            mRULE_PRECISION(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TDECIMAL"

    // $ANTLR start "RULE_TNUMERIC"
    public final void mRULE_TNUMERIC() throws RecognitionException {
        try {
            // InternalSQL.g:537:24: ( 'numeric' RULE_PRECISION )
            // InternalSQL.g:537:26: 'numeric' RULE_PRECISION
            {
            match("numeric"); 

            mRULE_PRECISION(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TNUMERIC"

    // $ANTLR start "RULE_TFLOAT"
    public final void mRULE_TFLOAT() throws RecognitionException {
        try {
            // InternalSQL.g:539:22: ( 'float' )
            // InternalSQL.g:539:24: 'float'
            {
            match("float"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TFLOAT"

    // $ANTLR start "RULE_TDATE"
    public final void mRULE_TDATE() throws RecognitionException {
        try {
            // InternalSQL.g:541:21: ( 'date' )
            // InternalSQL.g:541:23: 'date'
            {
            match("date"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TDATE"

    // $ANTLR start "RULE_TTIME"
    public final void mRULE_TTIME() throws RecognitionException {
        try {
            // InternalSQL.g:543:21: ( 'time' )
            // InternalSQL.g:543:23: 'time'
            {
            match("time"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TTIME"

    // $ANTLR start "RULE_TTIMESTAMP"
    public final void mRULE_TTIMESTAMP() throws RecognitionException {
        try {
            // InternalSQL.g:545:26: ( 'timestamp' )
            // InternalSQL.g:545:28: 'timestamp'
            {
            match("timestamp"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TTIMESTAMP"

    // $ANTLR start "RULE_DATA_TYPE"
    public final void mRULE_DATA_TYPE() throws RecognitionException {
        try {
            int _type = RULE_DATA_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:547:16: ( ( RULE_TINT | RULE_TVARCHAR | RULE_TCHARACTER | RULE_TBINARY | RULE_TBOOLEAN | RULE_TVARBINARY | RULE_TSMALLINT | RULE_TBIGINT | RULE_TDECIMAL | RULE_TNUMERIC | RULE_TFLOAT | RULE_TDATE | RULE_TTIME | RULE_TTIMESTAMP ) )
            // InternalSQL.g:547:18: ( RULE_TINT | RULE_TVARCHAR | RULE_TCHARACTER | RULE_TBINARY | RULE_TBOOLEAN | RULE_TVARBINARY | RULE_TSMALLINT | RULE_TBIGINT | RULE_TDECIMAL | RULE_TNUMERIC | RULE_TFLOAT | RULE_TDATE | RULE_TTIME | RULE_TTIMESTAMP )
            {
            // InternalSQL.g:547:18: ( RULE_TINT | RULE_TVARCHAR | RULE_TCHARACTER | RULE_TBINARY | RULE_TBOOLEAN | RULE_TVARBINARY | RULE_TSMALLINT | RULE_TBIGINT | RULE_TDECIMAL | RULE_TNUMERIC | RULE_TFLOAT | RULE_TDATE | RULE_TTIME | RULE_TTIMESTAMP )
            int alt2=14;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSQL.g:547:19: RULE_TINT
                    {
                    mRULE_TINT(); 

                    }
                    break;
                case 2 :
                    // InternalSQL.g:547:29: RULE_TVARCHAR
                    {
                    mRULE_TVARCHAR(); 

                    }
                    break;
                case 3 :
                    // InternalSQL.g:547:43: RULE_TCHARACTER
                    {
                    mRULE_TCHARACTER(); 

                    }
                    break;
                case 4 :
                    // InternalSQL.g:547:59: RULE_TBINARY
                    {
                    mRULE_TBINARY(); 

                    }
                    break;
                case 5 :
                    // InternalSQL.g:547:72: RULE_TBOOLEAN
                    {
                    mRULE_TBOOLEAN(); 

                    }
                    break;
                case 6 :
                    // InternalSQL.g:547:86: RULE_TVARBINARY
                    {
                    mRULE_TVARBINARY(); 

                    }
                    break;
                case 7 :
                    // InternalSQL.g:547:102: RULE_TSMALLINT
                    {
                    mRULE_TSMALLINT(); 

                    }
                    break;
                case 8 :
                    // InternalSQL.g:547:117: RULE_TBIGINT
                    {
                    mRULE_TBIGINT(); 

                    }
                    break;
                case 9 :
                    // InternalSQL.g:547:130: RULE_TDECIMAL
                    {
                    mRULE_TDECIMAL(); 

                    }
                    break;
                case 10 :
                    // InternalSQL.g:547:144: RULE_TNUMERIC
                    {
                    mRULE_TNUMERIC(); 

                    }
                    break;
                case 11 :
                    // InternalSQL.g:547:158: RULE_TFLOAT
                    {
                    mRULE_TFLOAT(); 

                    }
                    break;
                case 12 :
                    // InternalSQL.g:547:170: RULE_TDATE
                    {
                    mRULE_TDATE(); 

                    }
                    break;
                case 13 :
                    // InternalSQL.g:547:181: RULE_TTIME
                    {
                    mRULE_TTIME(); 

                    }
                    break;
                case 14 :
                    // InternalSQL.g:547:192: RULE_TTIMESTAMP
                    {
                    mRULE_TTIMESTAMP(); 

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
    // $ANTLR end "RULE_DATA_TYPE"

    // $ANTLR start "RULE_MAX_LENGTH"
    public final void mRULE_MAX_LENGTH() throws RecognitionException {
        try {
            // InternalSQL.g:549:26: ( RULE_LPAR RULE_INT RULE_RPAR )
            // InternalSQL.g:549:28: RULE_LPAR RULE_INT RULE_RPAR
            {
            mRULE_LPAR(); 
            mRULE_INT(); 
            mRULE_RPAR(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAX_LENGTH"

    // $ANTLR start "RULE_PRECISION"
    public final void mRULE_PRECISION() throws RecognitionException {
        try {
            // InternalSQL.g:551:25: ( RULE_LPAR RULE_INT RULE_COMMA RULE_INT RULE_RPAR )
            // InternalSQL.g:551:27: RULE_LPAR RULE_INT RULE_COMMA RULE_INT RULE_RPAR
            {
            mRULE_LPAR(); 
            mRULE_INT(); 
            mRULE_COMMA(); 
            mRULE_INT(); 
            mRULE_RPAR(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRECISION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSQL.g:553:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSQL.g:553:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSQL.g:553:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSQL.g:553:11: '^'
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

            // InternalSQL.g:553:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSQL.g:
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
            	    break loop4;
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
            // InternalSQL.g:555:19: ( ( '0' .. '9' )+ )
            // InternalSQL.g:555:21: ( '0' .. '9' )+
            {
            // InternalSQL.g:555:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSQL.g:555:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

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
            // InternalSQL.g:557:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSQL.g:557:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSQL.g:557:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQL.g:557:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSQL.g:557:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSQL.g:557:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSQL.g:557:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSQL.g:557:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSQL.g:557:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSQL.g:557:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSQL.g:557:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalSQL.g:559:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSQL.g:559:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSQL.g:559:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSQL.g:559:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalSQL.g:561:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSQL.g:561:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSQL.g:561:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSQL.g:561:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalSQL.g:561:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSQL.g:561:41: ( '\\r' )? '\\n'
                    {
                    // InternalSQL.g:561:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSQL.g:561:41: '\\r'
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
            // InternalSQL.g:563:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSQL.g:563:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSQL.g:563:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalSQL.g:565:16: ( . )
            // InternalSQL.g:565:18: .
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
        // InternalSQL.g:1:8: ( RULE_CREATE_TABLE | RULE_NOT_NULL | RULE_PRIMARY_KEY | RULE_FOREIGN_KEY | RULE_REFERENCES | RULE_COMMA | RULE_LPAR | RULE_RPAR | RULE_DATA_TYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=15;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalSQL.g:1:10: RULE_CREATE_TABLE
                {
                mRULE_CREATE_TABLE(); 

                }
                break;
            case 2 :
                // InternalSQL.g:1:28: RULE_NOT_NULL
                {
                mRULE_NOT_NULL(); 

                }
                break;
            case 3 :
                // InternalSQL.g:1:42: RULE_PRIMARY_KEY
                {
                mRULE_PRIMARY_KEY(); 

                }
                break;
            case 4 :
                // InternalSQL.g:1:59: RULE_FOREIGN_KEY
                {
                mRULE_FOREIGN_KEY(); 

                }
                break;
            case 5 :
                // InternalSQL.g:1:76: RULE_REFERENCES
                {
                mRULE_REFERENCES(); 

                }
                break;
            case 6 :
                // InternalSQL.g:1:92: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 7 :
                // InternalSQL.g:1:103: RULE_LPAR
                {
                mRULE_LPAR(); 

                }
                break;
            case 8 :
                // InternalSQL.g:1:113: RULE_RPAR
                {
                mRULE_RPAR(); 

                }
                break;
            case 9 :
                // InternalSQL.g:1:123: RULE_DATA_TYPE
                {
                mRULE_DATA_TYPE(); 

                }
                break;
            case 10 :
                // InternalSQL.g:1:138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalSQL.g:1:146: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // InternalSQL.g:1:158: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // InternalSQL.g:1:174: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // InternalSQL.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalSQL.g:1:198: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\26\uffff\1\30\2\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\142\1\uffff\1\141\1\uffff\1\151\1\uffff\1\141\2\uffff\1\151\1\162\1\147\3\uffff\1\155\1\142\2\uffff\1\145\2\uffff\1\163\2\uffff";
    static final String DFA2_maxS =
        "\1\166\1\uffff\1\141\1\uffff\1\157\1\uffff\1\145\2\uffff\1\151\1\162\1\156\3\uffff\1\155\1\143\2\uffff\1\145\2\uffff\1\163\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\7\1\uffff\1\12\1\13\3\uffff\1\5\1\11\1\14\2\uffff\1\4\1\10\1\uffff\1\2\1\6\1\uffff\1\16\1\15";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\1\3\1\6\1\uffff\1\10\2\uffff\1\1\4\uffff\1\7\4\uffff\1\5\1\11\1\uffff\1\2",
            "",
            "\1\12",
            "",
            "\1\13\5\uffff\1\14",
            "",
            "\1\16\3\uffff\1\15",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\22\6\uffff\1\21",
            "",
            "",
            "",
            "\1\23",
            "\1\25\1\24",
            "",
            "",
            "\1\26",
            "",
            "",
            "\1\27",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "547:18: ( RULE_TINT | RULE_TVARCHAR | RULE_TCHARACTER | RULE_TBINARY | RULE_TBOOLEAN | RULE_TVARBINARY | RULE_TSMALLINT | RULE_TBIGINT | RULE_TDECIMAL | RULE_TNUMERIC | RULE_TFLOAT | RULE_TDATE | RULE_TTIME | RULE_TTIMESTAMP )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\5\32\3\uffff\11\32\1\30\1\uffff\3\30\2\uffff\1\32\1\uffff\4\32\3\uffff\13\32\4\uffff\5\32\1\107\14\32\1\uffff\3\32\1\uffff\10\32\1\107\2\32\1\107\14\32\1\107\10\32\1\107\5\32\1\uffff\5\32\1\107\4\32\2\uffff\2\32\1\107\3\32\1\107\1\u0084\1\uffff";
    static final String DFA14_eofS =
        "\u0085\uffff";
    static final String DFA14_minS =
        "\1\0\1\122\1\117\1\122\1\117\1\105\3\uffff\1\156\1\141\1\150\1\151\1\155\1\141\1\165\1\154\1\151\1\101\1\uffff\2\0\1\52\2\uffff\1\105\1\uffff\1\124\1\111\1\122\1\106\3\uffff\1\164\1\162\1\141\1\147\1\157\1\141\1\143\1\164\1\155\1\157\1\155\4\uffff\1\101\1\40\1\115\2\105\1\60\1\142\1\162\1\141\1\151\2\154\1\151\2\145\1\141\1\145\1\124\1\uffff\1\101\1\111\1\122\1\uffff\1\150\1\151\1\50\1\162\1\156\1\145\1\154\1\155\1\60\1\162\1\164\1\60\1\105\1\122\1\107\1\105\1\141\1\156\1\171\1\164\1\141\1\151\1\141\1\151\1\60\1\164\1\40\1\131\2\116\1\162\1\141\1\50\1\60\2\156\1\154\1\143\1\141\1\uffff\2\40\1\103\1\50\1\162\1\60\1\164\2\50\1\155\2\uffff\1\105\1\171\1\60\1\160\1\123\1\50\2\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\122\1\117\1\122\1\117\1\105\3\uffff\1\156\1\141\1\150\1\157\1\155\1\145\1\165\1\154\1\151\1\172\1\uffff\2\uffff\1\57\2\uffff\1\105\1\uffff\1\124\1\111\1\122\1\106\3\uffff\1\164\1\162\1\141\1\156\1\157\1\141\1\143\1\164\1\155\1\157\1\155\4\uffff\1\101\1\40\1\115\2\105\1\172\1\143\1\162\1\141\1\151\2\154\1\151\2\145\1\141\1\145\1\124\1\uffff\1\101\1\111\1\122\1\uffff\1\150\1\151\1\50\1\162\1\156\1\145\1\154\1\155\1\172\1\162\1\164\1\172\1\105\1\122\1\107\1\105\1\141\1\156\1\171\1\164\1\141\1\151\1\141\1\151\1\172\1\164\1\40\1\131\2\116\1\162\1\141\1\50\1\172\2\156\1\154\1\143\1\141\1\uffff\2\40\1\103\1\50\1\162\1\172\1\164\2\50\1\155\2\uffff\1\105\1\171\1\172\1\160\1\123\1\50\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\6\1\7\1\10\12\uffff\1\12\3\uffff\1\16\1\17\1\uffff\1\12\4\uffff\1\6\1\7\1\10\13\uffff\1\13\1\14\1\15\1\16\22\uffff\1\2\3\uffff\1\11\47\uffff\1\1\12\uffff\1\3\1\4\10\uffff\1\5";
    static final String DFA14_specialS =
        "\1\1\23\uffff\1\2\1\0\157\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\1\7\1\10\2\30\1\6\2\30\1\26\21\30\2\23\1\1\2\23\1\4\7\23\1\2\1\23\1\3\1\23\1\5\10\23\3\30\1\22\1\23\1\30\1\23\1\14\1\13\1\16\1\23\1\20\2\23\1\11\4\23\1\17\4\23\1\15\1\21\1\23\1\12\4\23\uff85\30",
            "\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45\5\uffff\1\46",
            "\1\47",
            "\1\51\3\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\6\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\111\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\1\107",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\137",
            "\1\140",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\141\7\32",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\107",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\107",
            "\1\175",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\176",
            "\1\107",
            "\1\107",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0082",
            "\1\u0083",
            "\1\107",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_CREATE_TABLE | RULE_NOT_NULL | RULE_PRIMARY_KEY | RULE_FOREIGN_KEY | RULE_REFERENCES | RULE_COMMA | RULE_LPAR | RULE_RPAR | RULE_DATA_TYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_21 = input.LA(1);

                        s = -1;
                        if ( ((LA14_21>='\u0000' && LA14_21<='\uFFFF')) ) {s = 45;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='C') ) {s = 1;}

                        else if ( (LA14_0=='N') ) {s = 2;}

                        else if ( (LA14_0=='P') ) {s = 3;}

                        else if ( (LA14_0=='F') ) {s = 4;}

                        else if ( (LA14_0=='R') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0=='(') ) {s = 7;}

                        else if ( (LA14_0==')') ) {s = 8;}

                        else if ( (LA14_0=='i') ) {s = 9;}

                        else if ( (LA14_0=='v') ) {s = 10;}

                        else if ( (LA14_0=='c') ) {s = 11;}

                        else if ( (LA14_0=='b') ) {s = 12;}

                        else if ( (LA14_0=='s') ) {s = 13;}

                        else if ( (LA14_0=='d') ) {s = 14;}

                        else if ( (LA14_0=='n') ) {s = 15;}

                        else if ( (LA14_0=='f') ) {s = 16;}

                        else if ( (LA14_0=='t') ) {s = 17;}

                        else if ( (LA14_0=='^') ) {s = 18;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='M')||LA14_0=='O'||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||LA14_0=='e'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='r')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 19;}

                        else if ( (LA14_0=='\"') ) {s = 20;}

                        else if ( (LA14_0=='\'') ) {s = 21;}

                        else if ( (LA14_0=='/') ) {s = 22;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 23;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>='0' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFF')) ) {s = 45;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}