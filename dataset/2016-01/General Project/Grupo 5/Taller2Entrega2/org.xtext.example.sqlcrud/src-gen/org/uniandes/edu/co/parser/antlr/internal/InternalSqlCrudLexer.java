package org.uniandes.edu.co.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlCrudLexer extends Lexer {
    public static final int RULE_NOMBRE=6;
    public static final int RULE_PK=9;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_CREATE=4;
    public static final int RULE_TIPOINT=14;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_REFERENCES=12;
    public static final int RULE_ID=17;
    public static final int RULE_COMMA=10;
    public static final int RULE_WS=22;
    public static final int RULE_TABLA=5;
    public static final int RULE_NOTNULL=13;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_FK=11;
    public static final int T__26=26;
    public static final int RULE_VARCH=15;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__24=24;
    public static final int RULE_RPAR=8;
    public static final int T__25=25;
    public static final int RULE_ENTERO=16;
    public static final int RULE_LPAR=7;

    // delegates
    // delegators

    public InternalSqlCrudLexer() {;} 
    public InternalSqlCrudLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSqlCrudLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSqlCrud.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:11:7: ( ' ' )
            // InternalSqlCrud.g:11:9: ' '
            {
            match(' '); 

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
            // InternalSqlCrud.g:12:7: ( 'SMALLINT' )
            // InternalSqlCrud.g:12:9: 'SMALLINT'
            {
            match("SMALLINT"); 


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
            // InternalSqlCrud.g:13:7: ( 'BIGINT' )
            // InternalSqlCrud.g:13:9: 'BIGINT'
            {
            match("BIGINT"); 


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
            // InternalSqlCrud.g:14:7: ( 'BOOLEAN' )
            // InternalSqlCrud.g:14:9: 'BOOLEAN'
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
            // InternalSqlCrud.g:15:7: ( 'REAL' )
            // InternalSqlCrud.g:15:9: 'REAL'
            {
            match("REAL"); 


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
            // InternalSqlCrud.g:16:7: ( 'FLOAT' )
            // InternalSqlCrud.g:16:9: 'FLOAT'
            {
            match("FLOAT"); 


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
            // InternalSqlCrud.g:17:7: ( 'DATE' )
            // InternalSqlCrud.g:17:9: 'DATE'
            {
            match("DATE"); 


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
            // InternalSqlCrud.g:18:7: ( 'TIMESTAMP' )
            // InternalSqlCrud.g:18:9: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


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
            // InternalSqlCrud.g:19:7: ( 'MULTISET' )
            // InternalSqlCrud.g:19:9: 'MULTISET'
            {
            match("MULTISET"); 


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
            // InternalSqlCrud.g:20:7: ( 'XML' )
            // InternalSqlCrud.g:20:9: 'XML'
            {
            match("XML"); 


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
            // InternalSqlCrud.g:21:7: ( 'BINARY' )
            // InternalSqlCrud.g:21:9: 'BINARY'
            {
            match("BINARY"); 


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
            // InternalSqlCrud.g:22:7: ( 'VARBINARY' )
            // InternalSqlCrud.g:22:9: 'VARBINARY'
            {
            match("VARBINARY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_CREATE"
    public final void mRULE_CREATE() throws RecognitionException {
        try {
            int _type = RULE_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:937:13: ( 'CREATE' )
            // InternalSqlCrud.g:937:15: 'CREATE'
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
            // InternalSqlCrud.g:939:12: ( 'TABLE' )
            // InternalSqlCrud.g:939:14: 'TABLE'
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

    // $ANTLR start "RULE_LPAR"
    public final void mRULE_LPAR() throws RecognitionException {
        try {
            int _type = RULE_LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:941:11: ( '(' )
            // InternalSqlCrud.g:941:13: '('
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
            // InternalSqlCrud.g:943:11: ( ')' )
            // InternalSqlCrud.g:943:13: ')'
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

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:945:12: ( ',' )
            // InternalSqlCrud.g:945:14: ','
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

    // $ANTLR start "RULE_PK"
    public final void mRULE_PK() throws RecognitionException {
        try {
            int _type = RULE_PK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:947:9: ( 'PRIMARY KEY' )
            // InternalSqlCrud.g:947:11: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PK"

    // $ANTLR start "RULE_FK"
    public final void mRULE_FK() throws RecognitionException {
        try {
            int _type = RULE_FK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:949:9: ( 'FOREIGN KEY' )
            // InternalSqlCrud.g:949:11: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FK"

    // $ANTLR start "RULE_REFERENCES"
    public final void mRULE_REFERENCES() throws RecognitionException {
        try {
            int _type = RULE_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:951:17: ( 'REFERENCES' )
            // InternalSqlCrud.g:951:19: 'REFERENCES'
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

    // $ANTLR start "RULE_NOTNULL"
    public final void mRULE_NOTNULL() throws RecognitionException {
        try {
            int _type = RULE_NOTNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:953:14: ( 'NOT NULL' )
            // InternalSqlCrud.g:953:16: 'NOT NULL'
            {
            match("NOT NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTNULL"

    // $ANTLR start "RULE_VARCH"
    public final void mRULE_VARCH() throws RecognitionException {
        try {
            int _type = RULE_VARCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:955:12: ( ( 'VARCHAR' | 'varchar' ) )
            // InternalSqlCrud.g:955:14: ( 'VARCHAR' | 'varchar' )
            {
            // InternalSqlCrud.g:955:14: ( 'VARCHAR' | 'varchar' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='V') ) {
                alt1=1;
            }
            else if ( (LA1_0=='v') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSqlCrud.g:955:15: 'VARCHAR'
                    {
                    match("VARCHAR"); 


                    }
                    break;
                case 2 :
                    // InternalSqlCrud.g:955:25: 'varchar'
                    {
                    match("varchar"); 


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
    // $ANTLR end "RULE_VARCH"

    // $ANTLR start "RULE_TIPOINT"
    public final void mRULE_TIPOINT() throws RecognitionException {
        try {
            int _type = RULE_TIPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:957:14: ( ( 'INT' | 'int' ) )
            // InternalSqlCrud.g:957:16: ( 'INT' | 'int' )
            {
            // InternalSqlCrud.g:957:16: ( 'INT' | 'int' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='I') ) {
                alt2=1;
            }
            else if ( (LA2_0=='i') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlCrud.g:957:17: 'INT'
                    {
                    match("INT"); 


                    }
                    break;
                case 2 :
                    // InternalSqlCrud.g:957:23: 'int'
                    {
                    match("int"); 


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
    // $ANTLR end "RULE_TIPOINT"

    // $ANTLR start "RULE_ENTERO"
    public final void mRULE_ENTERO() throws RecognitionException {
        try {
            int _type = RULE_ENTERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:959:13: ( ( '0' .. '9' )+ )
            // InternalSqlCrud.g:959:15: ( '0' .. '9' )+
            {
            // InternalSqlCrud.g:959:15: ( '0' .. '9' )+
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
            	    // InternalSqlCrud.g:959:16: '0' .. '9'
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
    // $ANTLR end "RULE_ENTERO"

    // $ANTLR start "RULE_NOMBRE"
    public final void mRULE_NOMBRE() throws RecognitionException {
        try {
            int _type = RULE_NOMBRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:961:13: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* )
            // InternalSqlCrud.g:961:15: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            {
            // InternalSqlCrud.g:961:15: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSqlCrud.g:
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
    // $ANTLR end "RULE_NOMBRE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSqlCrud.g:963:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSqlCrud.g:963:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSqlCrud.g:963:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSqlCrud.g:963:11: '^'
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

            // InternalSqlCrud.g:963:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSqlCrud.g:
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
            	    break loop6;
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
            // InternalSqlCrud.g:965:10: ( ( '0' .. '9' )+ )
            // InternalSqlCrud.g:965:12: ( '0' .. '9' )+
            {
            // InternalSqlCrud.g:965:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSqlCrud.g:965:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalSqlCrud.g:967:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSqlCrud.g:967:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSqlCrud.g:967:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlCrud.g:967:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSqlCrud.g:967:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSqlCrud.g:967:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSqlCrud.g:967:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSqlCrud.g:967:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSqlCrud.g:967:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSqlCrud.g:967:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSqlCrud.g:967:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalSqlCrud.g:969:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSqlCrud.g:969:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSqlCrud.g:969:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSqlCrud.g:969:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalSqlCrud.g:971:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSqlCrud.g:971:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSqlCrud.g:971:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSqlCrud.g:971:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalSqlCrud.g:971:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSqlCrud.g:971:41: ( '\\r' )? '\\n'
                    {
                    // InternalSqlCrud.g:971:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSqlCrud.g:971:41: '\\r'
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
            // InternalSqlCrud.g:973:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSqlCrud.g:973:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSqlCrud.g:973:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSqlCrud.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalSqlCrud.g:975:16: ( . )
            // InternalSqlCrud.g:975:18: .
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
        // InternalSqlCrud.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_CREATE | RULE_TABLA | RULE_LPAR | RULE_RPAR | RULE_COMMA | RULE_PK | RULE_FK | RULE_REFERENCES | RULE_NOTNULL | RULE_VARCH | RULE_TIPOINT | RULE_ENTERO | RULE_NOMBRE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=32;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalSqlCrud.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // InternalSqlCrud.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // InternalSqlCrud.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // InternalSqlCrud.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // InternalSqlCrud.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // InternalSqlCrud.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // InternalSqlCrud.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // InternalSqlCrud.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // InternalSqlCrud.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // InternalSqlCrud.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // InternalSqlCrud.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // InternalSqlCrud.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // InternalSqlCrud.g:1:82: RULE_CREATE
                {
                mRULE_CREATE(); 

                }
                break;
            case 14 :
                // InternalSqlCrud.g:1:94: RULE_TABLA
                {
                mRULE_TABLA(); 

                }
                break;
            case 15 :
                // InternalSqlCrud.g:1:105: RULE_LPAR
                {
                mRULE_LPAR(); 

                }
                break;
            case 16 :
                // InternalSqlCrud.g:1:115: RULE_RPAR
                {
                mRULE_RPAR(); 

                }
                break;
            case 17 :
                // InternalSqlCrud.g:1:125: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 18 :
                // InternalSqlCrud.g:1:136: RULE_PK
                {
                mRULE_PK(); 

                }
                break;
            case 19 :
                // InternalSqlCrud.g:1:144: RULE_FK
                {
                mRULE_FK(); 

                }
                break;
            case 20 :
                // InternalSqlCrud.g:1:152: RULE_REFERENCES
                {
                mRULE_REFERENCES(); 

                }
                break;
            case 21 :
                // InternalSqlCrud.g:1:168: RULE_NOTNULL
                {
                mRULE_NOTNULL(); 

                }
                break;
            case 22 :
                // InternalSqlCrud.g:1:181: RULE_VARCH
                {
                mRULE_VARCH(); 

                }
                break;
            case 23 :
                // InternalSqlCrud.g:1:192: RULE_TIPOINT
                {
                mRULE_TIPOINT(); 

                }
                break;
            case 24 :
                // InternalSqlCrud.g:1:205: RULE_ENTERO
                {
                mRULE_ENTERO(); 

                }
                break;
            case 25 :
                // InternalSqlCrud.g:1:217: RULE_NOMBRE
                {
                mRULE_NOMBRE(); 

                }
                break;
            case 26 :
                // InternalSqlCrud.g:1:229: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalSqlCrud.g:1:237: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalSqlCrud.g:1:246: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalSqlCrud.g:1:258: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalSqlCrud.g:1:274: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalSqlCrud.g:1:290: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalSqlCrud.g:1:298: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\26\1\36\12\26\3\uffff\5\26\1\67\1\26\1\uffff\1\35\1\uffff\3\35\4\uffff\2\26\1\uffff\14\26\3\uffff\5\26\1\uffff\1\67\3\uffff\14\26\1\134\5\26\2\143\4\26\1\150\3\26\1\154\3\26\1\uffff\4\26\1\uffff\1\26\1\uffff\4\26\1\uffff\1\26\1\172\1\26\1\uffff\1\26\1\175\7\26\1\u0085\1\u0086\2\26\1\uffff\2\26\1\uffff\3\26\1\u008e\3\26\2\uffff\1\u0092\5\26\1\u0098\1\uffff\1\26\1\u0098\1\u009a\1\uffff\1\26\1\uffff\1\26\1\u009d\1\26\3\uffff\1\26\1\u00a0\1\uffff\1\u00a1\1\u00a2\3\uffff";
    static final String DFA16_eofS =
        "\u00a3\uffff";
    static final String DFA16_minS =
        "\1\0\1\11\12\60\3\uffff\7\60\1\uffff\1\101\1\uffff\2\0\1\52\4\uffff\2\60\1\uffff\14\60\3\uffff\5\60\1\uffff\1\60\3\uffff\20\60\1\40\17\60\1\uffff\4\60\1\uffff\1\60\1\uffff\4\60\1\uffff\3\60\1\uffff\15\60\1\uffff\2\60\1\uffff\7\60\2\uffff\2\60\1\40\4\60\1\uffff\1\40\2\60\1\uffff\1\60\1\uffff\3\60\3\uffff\2\60\1\uffff\2\60\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\40\12\172\3\uffff\7\172\1\uffff\1\172\1\uffff\2\uffff\1\57\4\uffff\2\172\1\uffff\14\172\3\uffff\5\172\1\uffff\1\172\3\uffff\40\172\1\uffff\4\172\1\uffff\1\172\1\uffff\4\172\1\uffff\3\172\1\uffff\15\172\1\uffff\2\172\1\uffff\7\172\2\uffff\7\172\1\uffff\3\172\1\uffff\1\172\1\uffff\3\172\3\uffff\2\172\1\uffff\2\172\3\uffff";
    static final String DFA16_acceptS =
        "\14\uffff\1\17\1\20\1\21\7\uffff\1\31\1\uffff\1\32\3\uffff\1\37\1\40\1\1\1\37\2\uffff\1\32\14\uffff\1\17\1\20\1\21\5\uffff\1\30\1\uffff\1\34\1\35\1\36\40\uffff\1\12\4\uffff\1\25\1\uffff\1\27\4\uffff\1\5\3\uffff\1\7\15\uffff\1\6\2\uffff\1\16\7\uffff\1\3\1\13\7\uffff\1\15\3\uffff\1\4\1\uffff\1\23\3\uffff\1\26\1\22\1\2\2\uffff\1\11\2\uffff\1\10\1\14\1\24";
    static final String DFA16_specialS =
        "\1\2\30\uffff\1\1\1\0\u0088\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\1\1\35\1\31\4\35\1\32\1\14\1\15\2\35\1\16\2\35\1\33\12\24\7\35\1\25\1\3\1\13\1\6\1\25\1\5\2\25\1\22\3\25\1\10\1\20\1\25\1\17\1\25\1\4\1\2\1\7\1\25\1\12\1\25\1\11\2\25\3\35\1\27\1\30\1\35\10\25\1\23\14\25\1\21\4\25\uff85\35",
            "\2\37\2\uffff\1\37\22\uffff\1\37",
            "\12\41\7\uffff\14\41\1\40\15\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\10\41\1\43\5\41\1\44\13\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\45\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\46\2\41\1\47\13\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\50\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\52\7\41\1\51\21\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\24\41\1\53\5\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\14\41\1\54\15\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\55\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\56\10\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\21\41\1\62\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\16\41\1\63\13\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\1\64\31\41",
            "\12\41\7\uffff\15\41\1\65\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\15\41\1\66\14\41",
            "\12\70\7\uffff\32\26\6\uffff\32\26",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\1\74\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\6\41\1\75\6\41\1\76\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\16\41\1\77\13\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\100\4\41\1\101\24\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\16\41\1\102\13\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\103\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\104\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\14\41\1\105\15\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\41\1\106\30\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\107\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\110\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\111\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\112\25\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\10\41\1\113\21\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\114\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\21\41\1\115\10\41",
            "\12\41\7\uffff\23\41\1\116\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\23\41\1\117\6\41",
            "",
            "\12\70\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "\12\41\7\uffff\13\41\1\120\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\10\41\1\121\21\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\122\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\123\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\124\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\125\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\126\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\127\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\130\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\131\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\132\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\133\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\41\1\135\1\136\27\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\137\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\14\41\1\140\15\41\4\uffff\1\42\1\uffff\32\41",
            "\1\141\17\uffff\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\2\41\1\142\27\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\13\41\1\144\16\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\15\41\1\145\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\146\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\147\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\151\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\152\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\10\41\1\153\21\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\22\41\1\155\7\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\156\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\10\41\1\157\21\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\10\41\1\160\21\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\7\41\1\161\22\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\162\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\163\31\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\7\41\1\164\22\41",
            "",
            "\12\41\7\uffff\10\41\1\165\21\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\166\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\30\41\1\167\1\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\170\31\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\4\41\1\171\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\6\41\1\173\23\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\23\41\1\174\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\22\41\1\176\7\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\15\41\1\177\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\u0080\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\4\41\1\u0081\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\u0082\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\1\u0083\31\41",
            "\12\41\7\uffff\15\41\1\u0084\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\15\41\1\u0087\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\15\41\1\u0088\14\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\15\41\1\u0089\14\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\u008a\31\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\4\41\1\u008b\25\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\1\u008c\31\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\u008d\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\30\41\1\u008f\1\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\21\41\1\u0090\10\41",
            "\12\41\7\uffff\23\41\1\u0091\6\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\2\41\1\u0093\27\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u0094\17\uffff\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\14\41\1\u0095\15\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\23\41\1\u0096\6\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\21\41\1\u0097\10\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\1\u0099\17\uffff\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\4\41\1\u009b\25\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\17\41\1\u009c\12\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\30\41\1\u009e\1\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\22\41\1\u009f\7\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_CREATE | RULE_TABLA | RULE_LPAR | RULE_RPAR | RULE_COMMA | RULE_PK | RULE_FK | RULE_REFERENCES | RULE_NOTNULL | RULE_VARCH | RULE_TIPOINT | RULE_ENTERO | RULE_NOMBRE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_26 = input.LA(1);

                        s = -1;
                        if ( ((LA16_26>='\u0000' && LA16_26<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_25 = input.LA(1);

                        s = -1;
                        if ( ((LA16_25>='\u0000' && LA16_25<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0==' ') ) {s = 1;}

                        else if ( (LA16_0=='S') ) {s = 2;}

                        else if ( (LA16_0=='B') ) {s = 3;}

                        else if ( (LA16_0=='R') ) {s = 4;}

                        else if ( (LA16_0=='F') ) {s = 5;}

                        else if ( (LA16_0=='D') ) {s = 6;}

                        else if ( (LA16_0=='T') ) {s = 7;}

                        else if ( (LA16_0=='M') ) {s = 8;}

                        else if ( (LA16_0=='X') ) {s = 9;}

                        else if ( (LA16_0=='V') ) {s = 10;}

                        else if ( (LA16_0=='C') ) {s = 11;}

                        else if ( (LA16_0=='(') ) {s = 12;}

                        else if ( (LA16_0==')') ) {s = 13;}

                        else if ( (LA16_0==',') ) {s = 14;}

                        else if ( (LA16_0=='P') ) {s = 15;}

                        else if ( (LA16_0=='N') ) {s = 16;}

                        else if ( (LA16_0=='v') ) {s = 17;}

                        else if ( (LA16_0=='I') ) {s = 18;}

                        else if ( (LA16_0=='i') ) {s = 19;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 20;}

                        else if ( (LA16_0=='A'||LA16_0=='E'||(LA16_0>='G' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='L')||LA16_0=='O'||LA16_0=='Q'||LA16_0=='U'||LA16_0=='W'||(LA16_0>='Y' && LA16_0<='Z')||(LA16_0>='a' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='u')||(LA16_0>='w' && LA16_0<='z')) ) {s = 21;}

                        else if ( (LA16_0=='^') ) {s = 23;}

                        else if ( (LA16_0=='_') ) {s = 24;}

                        else if ( (LA16_0=='\"') ) {s = 25;}

                        else if ( (LA16_0=='\'') ) {s = 26;}

                        else if ( (LA16_0=='/') ) {s = 27;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r') ) {s = 28;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||(LA16_0>=':' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 29;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}