package matrixexp.parser;// Generated from MatrixExp.g4 by ANTLR 4.7// Generated from MatrixExp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixExpParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
            T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
            T__17=18, T__18=19, T__19=20, MATRIXNAME=21, ID=22, NUMBER=23, WS=24,
            NL=25;
    public static final int
            RULE_exp = 0, RULE_matrix = 1, RULE_prop = 2, RULE_propList = 3;
    public static final String[] ruleNames = {
            "exp", "matrix", "prop", "propList"
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

    @Override
    public String getGrammarFileName() { return "MatrixExp.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public MatrixExpParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }
    public static class ExpContext extends ParserRuleContext {
        public ExpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_exp; }

        public ExpContext() { }
        public void copyFrom(ExpContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class ADDContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public ADDContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterADD(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitADD(this);
        }
    }
    public static class SUBContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public SUBContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterSUB(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitSUB(this);
        }
    }
    public static class NUMBERContext extends ExpContext {
        public TerminalNode NUMBER() { return getToken(MatrixExpParser.NUMBER, 0); }
        public NUMBERContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterNUMBER(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitNUMBER(this);
        }
    }
    public static class ORContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public ORContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterOR(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitOR(this);
        }
    }
    public static class MULContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public MULContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterMUL(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitMUL(this);
        }
    }
    public static class EQUALContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public EQUALContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterEQUAL(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitEQUAL(this);
        }
    }
    public static class MODEContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public MODEContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterMODE(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitMODE(this);
        }
    }
    public static class NOTEQUEALContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public NOTEQUEALContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterNOTEQUEAL(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitNOTEQUEAL(this);
        }
    }
    public static class MTRXContext extends ExpContext {
        public MatrixContext matrix() {
            return getRuleContext(MatrixContext.class,0);
        }
        public MTRXContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterMTRX(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitMTRX(this);
        }
    }
    public static class POWERContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public POWERContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterPOWER(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitPOWER(this);
        }
    }
    public static class DIVContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public DIVContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterDIV(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitDIV(this);
        }
    }
    public static class NOTContext extends ExpContext {
        public ExpContext exp() {
            return getRuleContext(ExpContext.class,0);
        }
        public NOTContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterNOT(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitNOT(this);
        }
    }
    public static class GREATEOREQUEALContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public GREATEOREQUEALContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterGREATEOREQUEAL(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitGREATEOREQUEAL(this);
        }
    }
    public static class COMBINEContext extends ExpContext {
        public ExpContext exp() {
            return getRuleContext(ExpContext.class,0);
        }
        public COMBINEContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterCOMBINE(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitCOMBINE(this);
        }
    }
    public static class GREATEContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public GREATEContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterGREATE(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitGREATE(this);
        }
    }
    public static class ANDContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public ANDContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterAND(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitAND(this);
        }
    }
    public static class NEGATIVEContext extends ExpContext {
        public ExpContext exp() {
            return getRuleContext(ExpContext.class,0);
        }
        public NEGATIVEContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterNEGATIVE(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitNEGATIVE(this);
        }
    }
    public static class LESSContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public LESSContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterLESS(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitLESS(this);
        }
    }
    public static class LESSOREQUEALContext extends ExpContext {
        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }
        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class,i);
        }
        public LESSOREQUEALContext(ExpContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterLESSOREQUEAL(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitLESSOREQUEAL(this);
        }
    }

    public final ExpContext exp() throws RecognitionException {
        return exp(0);
    }

    private ExpContext exp(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpContext _localctx = new ExpContext(_ctx, _parentState);
        ExpContext _prevctx = _localctx;
        int _startState = 0;
        enterRecursionRule(_localctx, 0, RULE_exp, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(19);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__0:
                    {
                        _localctx = new COMBINEContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(9);
                        match(T__0);
                        setState(10);
                        exp(0);
                        setState(11);
                        match(T__1);
                    }
                    break;
                    case T__2:
                    {
                        _localctx = new NEGATIVEContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(13);
                        match(T__2);
                        setState(14);
                        exp(18);
                    }
                    break;
                    case T__3:
                    {
                        _localctx = new NOTContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(15);
                        match(T__3);
                        setState(16);
                        exp(17);
                    }
                    break;
                    case MATRIXNAME:
                    {
                        _localctx = new MTRXContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(17);
                        matrix();
                    }
                    break;
                    case NUMBER:
                    {
                        _localctx = new NUMBERContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(18);
                        match(NUMBER);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(65);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
                while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(63);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new POWERContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(21);
                                    if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(22);
                                    match(T__4);
                                    setState(23);
                                    exp(17);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new MULContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(24);
                                    if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(25);
                                    match(T__5);
                                    setState(26);
                                    exp(16);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new DIVContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(27);
                                    if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(28);
                                    match(T__6);
                                    setState(29);
                                    exp(15);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new MODEContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(30);
                                    if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(31);
                                    match(T__7);
                                    setState(32);
                                    exp(14);
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new ADDContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(33);
                                    if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(34);
                                    match(T__8);
                                    setState(35);
                                    exp(13);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new SUBContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(36);
                                    if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(37);
                                    match(T__2);
                                    setState(38);
                                    exp(12);
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new GREATEContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(39);
                                    if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(40);
                                    match(T__9);
                                    setState(41);
                                    exp(11);
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new GREATEOREQUEALContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(42);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(43);
                                    match(T__10);
                                    setState(44);
                                    exp(10);
                                }
                                break;
                                case 9:
                                {
                                    _localctx = new EQUALContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(45);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(46);
                                    match(T__11);
                                    setState(47);
                                    exp(9);
                                }
                                break;
                                case 10:
                                {
                                    _localctx = new LESSContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(48);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(49);
                                    match(T__12);
                                    setState(50);
                                    exp(8);
                                }
                                break;
                                case 11:
                                {
                                    _localctx = new LESSOREQUEALContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(51);
                                    if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(52);
                                    match(T__13);
                                    setState(53);
                                    exp(7);
                                }
                                break;
                                case 12:
                                {
                                    _localctx = new NOTEQUEALContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(54);
                                    if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(55);
                                    match(T__14);
                                    setState(56);
                                    exp(6);
                                }
                                break;
                                case 13:
                                {
                                    _localctx = new ANDContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(57);
                                    if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(58);
                                    match(T__15);
                                    setState(59);
                                    exp(5);
                                }
                                break;
                                case 14:
                                {
                                    _localctx = new ORContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(60);
                                    if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(61);
                                    match(T__16);
                                    setState(62);
                                    exp(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class MatrixContext extends ParserRuleContext {
        public TerminalNode MATRIXNAME() { return getToken(MatrixExpParser.MATRIXNAME, 0); }
        public PropListContext propList() {
            return getRuleContext(PropListContext.class,0);
        }
        public MatrixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_matrix; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterMatrix(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitMatrix(this);
        }
    }

    public final MatrixContext matrix() throws RecognitionException {
        MatrixContext _localctx = new MatrixContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_matrix);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                match(MATRIXNAME);
                setState(69);
                match(T__17);
                setState(70);
                propList();
                setState(71);
                match(T__18);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PropContext extends ParserRuleContext {
        public TerminalNode ID() { return getToken(MatrixExpParser.ID, 0); }
        public PropContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_prop; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterProp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitProp(this);
        }
    }

    public final PropContext prop() throws RecognitionException {
        PropContext _localctx = new PropContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_prop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(ID);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PropListContext extends ParserRuleContext {
        public List<PropContext> prop() {
            return getRuleContexts(PropContext.class);
        }
        public PropContext prop(int i) {
            return getRuleContext(PropContext.class,i);
        }
        public PropListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_propList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).enterPropList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof MatrixExpListener ) ((MatrixExpListener)listener).exitPropList(this);
        }
    }

    public final PropListContext propList() throws RecognitionException {
        PropListContext _localctx = new PropListContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_propList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                prop();
                setState(80);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==T__19) {
                    {
                        {
                            setState(76);
                            match(T__19);
                            setState(77);
                            prop();
                        }
                    }
                    setState(82);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 0:
                return exp_sempred((ExpContext)_localctx, predIndex);
        }
        return true;
    }
    private boolean exp_sempred(ExpContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 16);
            case 1:
                return precpred(_ctx, 15);
            case 2:
                return precpred(_ctx, 14);
            case 3:
                return precpred(_ctx, 13);
            case 4:
                return precpred(_ctx, 12);
            case 5:
                return precpred(_ctx, 11);
            case 6:
                return precpred(_ctx, 10);
            case 7:
                return precpred(_ctx, 9);
            case 8:
                return precpred(_ctx, 8);
            case 9:
                return precpred(_ctx, 7);
            case 10:
                return precpred(_ctx, 6);
            case 11:
                return precpred(_ctx, 5);
            case 12:
                return precpred(_ctx, 4);
            case 13:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33V\4\2\t\2\4\3\t"+
                    "\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\26"+
                    "\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
                    "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
                    "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\3"+
                    "\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\5\2\3\2\6\2\4\6\b"+
                    "\2\2\2d\2\25\3\2\2\2\4F\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\n\13\b\2\1\2\13"+
                    "\f\7\3\2\2\f\r\5\2\2\2\r\16\7\4\2\2\16\26\3\2\2\2\17\20\7\5\2\2\20\26"+
                    "\5\2\2\24\21\22\7\6\2\2\22\26\5\2\2\23\23\26\5\4\3\2\24\26\7\31\2\2\25"+
                    "\n\3\2\2\2\25\17\3\2\2\2\25\21\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26"+
                    "C\3\2\2\2\27\30\f\22\2\2\30\31\7\7\2\2\31B\5\2\2\23\32\33\f\21\2\2\33"+
                    "\34\7\b\2\2\34B\5\2\2\22\35\36\f\20\2\2\36\37\7\t\2\2\37B\5\2\2\21 !\f"+
                    "\17\2\2!\"\7\n\2\2\"B\5\2\2\20#$\f\16\2\2$%\7\13\2\2%B\5\2\2\17&\'\f\r"+
                    "\2\2\'(\7\5\2\2(B\5\2\2\16)*\f\f\2\2*+\7\f\2\2+B\5\2\2\r,-\f\13\2\2-."+
                    "\7\r\2\2.B\5\2\2\f/\60\f\n\2\2\60\61\7\16\2\2\61B\5\2\2\13\62\63\f\t\2"+
                    "\2\63\64\7\17\2\2\64B\5\2\2\n\65\66\f\b\2\2\66\67\7\20\2\2\67B\5\2\2\t"+
                    "89\f\7\2\29:\7\21\2\2:B\5\2\2\b;<\f\6\2\2<=\7\22\2\2=B\5\2\2\7>?\f\5\2"+
                    "\2?@\7\23\2\2@B\5\2\2\6A\27\3\2\2\2A\32\3\2\2\2A\35\3\2\2\2A \3\2\2\2"+
                    "A#\3\2\2\2A&\3\2\2\2A)\3\2\2\2A,\3\2\2\2A/\3\2\2\2A\62\3\2\2\2A\65\3\2"+
                    "\2\2A8\3\2\2\2A;\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3"+
                    "\2\2\2EC\3\2\2\2FG\7\27\2\2GH\7\24\2\2HI\5\b\5\2IJ\7\25\2\2J\5\3\2\2\2"+
                    "KL\7\30\2\2L\7\3\2\2\2MR\5\6\4\2NO\7\26\2\2OQ\5\6\4\2PN\3\2\2\2QT\3\2"+
                    "\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2\2\6\25ACR";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}