package matrixexp.parser;// Generated from MatrixExp.g4 by ANTLR 4.7// Generated from MatrixExp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixExpLexer extends Lexer {
    static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
            T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
            T__17=18, T__18=19, T__19=20, MATRIXNAME=21, ID=22, NUMBER=23, WS=24,
            NL=25;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
            "T__17", "T__18", "T__19", "MATRIXNAME", "ID", "LETTER", "NameChar", "NameStartChar",
            "NUMBER", "INT", "EXP", "WS", "NL"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'('", "')'", "'-'", "'!'", "'^'", "'*'", "'/'", "'%'", "'+'", "'>'",
            "'>='", "'='", "'<'", "'<='", "'!='", "'&&'", "'||'", "'['", "']'", "','"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, "MATRIXNAME", "ID",
            "NUMBER", "WS", "NL"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public MatrixExpLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    @Override
    public String getGrammarFileName() { return "MatrixExp.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public String[] getChannelNames() { return channelNames; }

    @Override
    public String[] getModeNames() { return modeNames; }

    @Override
    public ATN getATN() { return _ATN; }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a5\b\1\4\2"+
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
                    "\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
                    "\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
                    "\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
                    "\27\3\27\7\27q\n\27\f\27\16\27t\13\27\3\30\3\30\3\31\3\31\5\31z\n\31\3"+
                    "\32\3\32\3\33\3\33\3\33\3\33\5\33\u0082\n\33\3\33\3\33\3\33\3\33\5\33"+
                    "\u0088\n\33\3\34\3\34\3\34\7\34\u008d\n\34\f\34\16\34\u0090\13\34\5\34"+
                    "\u0092\n\34\3\35\3\35\5\35\u0096\n\35\3\35\3\35\3\36\6\36\u009b\n\36\r"+
                    "\36\16\36\u009c\3\36\3\36\3\37\5\37\u00a2\n\37\3\37\3\37\2\2 \3\3\5\4"+
                    "\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
                    "#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\31\67\29\2;\32=\33\3\2\b\4\2"+
                    "C\\c|\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8"+
                    "\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191"+
                    "\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2GGgg\4\2--//\5\2\13"+
                    "\f\17\17\"\"\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
                    "\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
                    "\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
                    "\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
                    "\2-\3\2\2\2\2\65\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7"+
                    "C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23"+
                    "O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2"+
                    "\37]\3\2\2\2!`\3\2\2\2#c\3\2\2\2%f\3\2\2\2\'h\3\2\2\2)j\3\2\2\2+l\3\2"+
                    "\2\2-n\3\2\2\2/u\3\2\2\2\61y\3\2\2\2\63{\3\2\2\2\65\u0087\3\2\2\2\67\u0091"+
                    "\3\2\2\29\u0093\3\2\2\2;\u009a\3\2\2\2=\u00a1\3\2\2\2?@\7*\2\2@\4\3\2"+
                    "\2\2AB\7+\2\2B\6\3\2\2\2CD\7/\2\2D\b\3\2\2\2EF\7#\2\2F\n\3\2\2\2GH\7`"+
                    "\2\2H\f\3\2\2\2IJ\7,\2\2J\16\3\2\2\2KL\7\61\2\2L\20\3\2\2\2MN\7\'\2\2"+
                    "N\22\3\2\2\2OP\7-\2\2P\24\3\2\2\2QR\7@\2\2R\26\3\2\2\2ST\7@\2\2TU\7?\2"+
                    "\2U\30\3\2\2\2VW\7?\2\2W\32\3\2\2\2XY\7>\2\2Y\34\3\2\2\2Z[\7>\2\2[\\\7"+
                    "?\2\2\\\36\3\2\2\2]^\7#\2\2^_\7?\2\2_ \3\2\2\2`a\7(\2\2ab\7(\2\2b\"\3"+
                    "\2\2\2cd\7~\2\2de\7~\2\2e$\3\2\2\2fg\7]\2\2g&\3\2\2\2hi\7_\2\2i(\3\2\2"+
                    "\2jk\7.\2\2k*\3\2\2\2lm\4C\\\2m,\3\2\2\2nr\5\63\32\2oq\5\61\31\2po\3\2"+
                    "\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s.\3\2\2\2tr\3\2\2\2uv\t\2\2\2v\60\3"+
                    "\2\2\2wz\5\63\32\2xz\t\3\2\2yw\3\2\2\2yx\3\2\2\2z\62\3\2\2\2{|\t\4\2\2"+
                    "|\64\3\2\2\2}~\5\67\34\2~\177\7\60\2\2\177\u0081\5\67\34\2\u0080\u0082"+
                    "\59\35\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0088\3\2\2\2\u0083"+
                    "\u0084\5\67\34\2\u0084\u0085\59\35\2\u0085\u0088\3\2\2\2\u0086\u0088\5"+
                    "\67\34\2\u0087}\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
                    "\66\3\2\2\2\u0089\u0092\7\62\2\2\u008a\u008e\4\63;\2\u008b\u008d\4\62"+
                    ";\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
                    "\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2"+
                    "\2\2\u0091\u008a\3\2\2\2\u00928\3\2\2\2\u0093\u0095\t\5\2\2\u0094\u0096"+
                    "\t\6\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
                    "\u0098\5\67\34\2\u0098:\3\2\2\2\u0099\u009b\t\7\2\2\u009a\u0099\3\2\2"+
                    "\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
                    "\3\2\2\2\u009e\u009f\b\36\2\2\u009f<\3\2\2\2\u00a0\u00a2\7\17\2\2\u00a1"+
                    "\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\f"+
                    "\2\2\u00a4>\3\2\2\2\f\2ry\u0081\u0087\u008e\u0091\u0095\u009c\u00a1\3"+
                    "\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}