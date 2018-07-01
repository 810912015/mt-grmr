package matrixexp.parser;// Generated from MatrixExp.g4 by ANTLR 4.7// Generated from MatrixExp.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatrixExpParser}.
 */
public interface MatrixExpListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by the {@code ADD}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterADD(MatrixExpParser.ADDContext ctx);

    /**
     * Exit a parse tree produced by the {@code ADD}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitADD(MatrixExpParser.ADDContext ctx);

    /**
     * Enter a parse tree produced by the {@code SUB}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterSUB(MatrixExpParser.SUBContext ctx);

    /**
     * Exit a parse tree produced by the {@code SUB}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitSUB(MatrixExpParser.SUBContext ctx);

    /**
     * Enter a parse tree produced by the {@code NUMBER}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNUMBER(MatrixExpParser.NUMBERContext ctx);

    /**
     * Exit a parse tree produced by the {@code NUMBER}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNUMBER(MatrixExpParser.NUMBERContext ctx);

    /**
     * Enter a parse tree produced by the {@code OR}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterOR(MatrixExpParser.ORContext ctx);

    /**
     * Exit a parse tree produced by the {@code OR}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitOR(MatrixExpParser.ORContext ctx);

    /**
     * Enter a parse tree produced by the {@code MUL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMUL(MatrixExpParser.MULContext ctx);

    /**
     * Exit a parse tree produced by the {@code MUL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMUL(MatrixExpParser.MULContext ctx);

    /**
     * Enter a parse tree produced by the {@code EQUAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterEQUAL(MatrixExpParser.EQUALContext ctx);

    /**
     * Exit a parse tree produced by the {@code EQUAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitEQUAL(MatrixExpParser.EQUALContext ctx);

    /**
     * Enter a parse tree produced by the {@code MODE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMODE(MatrixExpParser.MODEContext ctx);

    /**
     * Exit a parse tree produced by the {@code MODE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMODE(MatrixExpParser.MODEContext ctx);

    /**
     * Enter a parse tree produced by the {@code NOTEQUEAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNOTEQUEAL(MatrixExpParser.NOTEQUEALContext ctx);

    /**
     * Exit a parse tree produced by the {@code NOTEQUEAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNOTEQUEAL(MatrixExpParser.NOTEQUEALContext ctx);

    /**
     * Enter a parse tree produced by the {@code MTRX}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMTRX(MatrixExpParser.MTRXContext ctx);

    /**
     * Exit a parse tree produced by the {@code MTRX}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMTRX(MatrixExpParser.MTRXContext ctx);

    /**
     * Enter a parse tree produced by the {@code POWER}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterPOWER(MatrixExpParser.POWERContext ctx);

    /**
     * Exit a parse tree produced by the {@code POWER}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitPOWER(MatrixExpParser.POWERContext ctx);

    /**
     * Enter a parse tree produced by the {@code DIV}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterDIV(MatrixExpParser.DIVContext ctx);

    /**
     * Exit a parse tree produced by the {@code DIV}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitDIV(MatrixExpParser.DIVContext ctx);

    /**
     * Enter a parse tree produced by the {@code NOT}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNOT(MatrixExpParser.NOTContext ctx);

    /**
     * Exit a parse tree produced by the {@code NOT}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNOT(MatrixExpParser.NOTContext ctx);

    /**
     * Enter a parse tree produced by the {@code GREATEOREQUEAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterGREATEOREQUEAL(MatrixExpParser.GREATEOREQUEALContext ctx);

    /**
     * Exit a parse tree produced by the {@code GREATEOREQUEAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitGREATEOREQUEAL(MatrixExpParser.GREATEOREQUEALContext ctx);

    /**
     * Enter a parse tree produced by the {@code COMBINE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterCOMBINE(MatrixExpParser.COMBINEContext ctx);

    /**
     * Exit a parse tree produced by the {@code COMBINE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitCOMBINE(MatrixExpParser.COMBINEContext ctx);

    /**
     * Enter a parse tree produced by the {@code GREATE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterGREATE(MatrixExpParser.GREATEContext ctx);

    /**
     * Exit a parse tree produced by the {@code GREATE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitGREATE(MatrixExpParser.GREATEContext ctx);

    /**
     * Enter a parse tree produced by the {@code AND}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterAND(MatrixExpParser.ANDContext ctx);

    /**
     * Exit a parse tree produced by the {@code AND}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitAND(MatrixExpParser.ANDContext ctx);

    /**
     * Enter a parse tree produced by the {@code NEGATIVE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNEGATIVE(MatrixExpParser.NEGATIVEContext ctx);

    /**
     * Exit a parse tree produced by the {@code NEGATIVE}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNEGATIVE(MatrixExpParser.NEGATIVEContext ctx);

    /**
     * Enter a parse tree produced by the {@code LESS}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterLESS(MatrixExpParser.LESSContext ctx);

    /**
     * Exit a parse tree produced by the {@code LESS}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitLESS(MatrixExpParser.LESSContext ctx);

    /**
     * Enter a parse tree produced by the {@code LESSOREQUEAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterLESSOREQUEAL(MatrixExpParser.LESSOREQUEALContext ctx);

    /**
     * Exit a parse tree produced by the {@code LESSOREQUEAL}
     * labeled alternative in {@link MatrixExpParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitLESSOREQUEAL(MatrixExpParser.LESSOREQUEALContext ctx);

    /**
     * Enter a parse tree produced by {@link MatrixExpParser#matrix}.
     *
     * @param ctx the parse tree
     */
    void enterMatrix(MatrixExpParser.MatrixContext ctx);

    /**
     * Exit a parse tree produced by {@link MatrixExpParser#matrix}.
     *
     * @param ctx the parse tree
     */
    void exitMatrix(MatrixExpParser.MatrixContext ctx);

    /**
     * Enter a parse tree produced by {@link MatrixExpParser#prop}.
     *
     * @param ctx the parse tree
     */
    void enterProp(MatrixExpParser.PropContext ctx);

    /**
     * Exit a parse tree produced by {@link MatrixExpParser#prop}.
     *
     * @param ctx the parse tree
     */
    void exitProp(MatrixExpParser.PropContext ctx);

    /**
     * Enter a parse tree produced by {@link MatrixExpParser#propList}.
     *
     * @param ctx the parse tree
     */
    void enterPropList(MatrixExpParser.PropListContext ctx);

    /**
     * Exit a parse tree produced by {@link MatrixExpParser#propList}.
     *
     * @param ctx the parse tree
     */
    void exitPropList(MatrixExpParser.PropListContext ctx);
}