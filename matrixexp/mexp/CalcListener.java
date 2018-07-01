package matrixexp.mexp;
import matrixexp.mexp.matrix.Matrices;
import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Result;
import matrixexp.mexp.matrix.Step;
import matrixexp.mexp.matrix.op.Operator;
import matrixexp.mexp.matrix.op.math.*;
import matrixexp.mexp.matrix.op.math.relation.*;
import matrixexp.mexp.matrix.op.unary.*;
import matrixexp.mexp.matrix.op.logic.*;
import matrixexp.parser.MatrixExpBaseListener;
import matrixexp.parser.MatrixExpParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public class CalcListener extends MatrixExpBaseListener {
    StepTree values = new StepTree();
    Matrices ms;

    public CalcListener(Matrices m) {
        this.ms = m;
    }

    public void setValue(ParseTree node, Matrix value) {
        values.put(node, new Step(value));
    }

    public void setValue(ParseTree node, Matrix value, String[] cols) {
        values.put(node, new Step(value, cols));
    }

    public void setValue(ParseTree node, Float f) {
        values.put(node, new Step(f));
    }

    public void setValue(ParseTree node, Step s) {
        values.put(node, s);
    }

    public Step getValue(ParseTree node) {
        return values.get(node);
    }

    public StepTree getValueTree() {
        return values;
    }

    public String getSteps() {
        return values.toReadable();
    }

    @Override
    public void enterNUMBER(MatrixExpParser.NUMBERContext ctx) {
        String s = ctx.NUMBER().getText();
        Float f = Float.valueOf(s);
        setValue(ctx, f);
    }

    @Override
    public void exitNEGATIVE(MatrixExpParser.NEGATIVEContext ctx) {
        Step s = getValue(ctx.children.get(1));
        Negative un = new Negative();
        Step r = un.calc(s);
        setValue(ctx, r);
    }

    @Override
    public void exitNOT(MatrixExpParser.NOTContext ctx) {
        Step s = getValue(ctx.children.get(1));
        UnaryNot un = new UnaryNot();
        Step r = un.calc(s);
        setValue(ctx, r);
    }

    @Override
    public void enterMatrix(MatrixExpParser.MatrixContext ctx) {
        String s = ctx.MATRIXNAME().getText();
        Matrix m = ms.get(s);
        setValue(ctx.parent, m);
    }

    @Override
    public void exitProp(MatrixExpParser.PropContext ctx) {
        String s = ctx.getText();
        getValue(ctx.parent.parent.parent).addCol(s);
    }

    @Override
    public void exitADD(MatrixExpParser.ADDContext ctx) {
        caculate(ctx, new Adder());
    }

    @Override
    public void exitSUB(MatrixExpParser.SUBContext ctx) {
        caculate(ctx, new Subber());
    }

    @Override
    public void exitMUL(MatrixExpParser.MULContext ctx) {
        caculate(ctx, new Muller());
    }

    @Override
    public void exitMODE(MatrixExpParser.MODEContext ctx) {
        caculate(ctx, new Moder());
    }

    @Override
    public void exitPOWER(MatrixExpParser.POWERContext ctx) {
        caculate(ctx, new Power());
    }

    @Override
    public void exitDIV(MatrixExpParser.DIVContext ctx) {
        caculate(ctx, new Diver());
    }

    @Override
    public void exitEQUAL(MatrixExpParser.EQUALContext ctx) {
        caculate(ctx, new Equaller());
    }

    @Override
    public void exitNOTEQUEAL(MatrixExpParser.NOTEQUEALContext ctx) {
        caculate(ctx, new NotEq());
    }

    @Override
    public void exitGREATEOREQUEAL(MatrixExpParser.GREATEOREQUEALContext ctx) {
        caculate(ctx, new GoEer());
    }

    @Override
    public void exitGREATE(MatrixExpParser.GREATEContext ctx) {
        caculate(ctx, new Greer());
    }

    @Override
    public void exitLESS(MatrixExpParser.LESSContext ctx) {
        caculate(ctx, new Lesser());
    }

    @Override
    public void exitLESSOREQUEAL(MatrixExpParser.LESSOREQUEALContext ctx) {
        caculate(ctx, new LoEer());
    }

    @Override
    public void exitOR(MatrixExpParser.ORContext ctx) {
        caculate(ctx, new Orer());
    }

    @Override
    public void exitAND(MatrixExpParser.ANDContext ctx) {
        caculate(ctx, new Ander());
    }

    @Override
    public void exitCOMBINE(MatrixExpParser.COMBINEContext ctx) {
        // 当前为:(exp),因此当前值为exp的值
        Step s = getValue(ctx.exp());
        setValue(ctx, s);
    }

    void caculate(MatrixExpParser.ExpContext ctx, Operator oper) {
        ParseTree left = ctx.getChild(MatrixExpParser.ExpContext.class, 0);
        ParseTree right = ctx.getChild(MatrixExpParser.ExpContext.class, 1);
        Step lv = getValue(left);
        if (lv == null) {
            return;
        }
        if (oper instanceof BaseMathRelation) {
            lv.setRelationLeftValue(true);
        }
        Step rv = getValue(right);


        Result<? extends Matrix> r = null;
        Result<Float> rf = null;
        if (lv.getMatrix() != null) {
            if (rv.getMatrix() != null) {
                r = oper.op(lv.getMatrix(), lv.getCols(), rv.getMatrix(), rv.getCols());
                setValue(ctx, r.getData(), lv.getCols());
            } else {
                r = oper.op(lv.getMatrix(), lv.getCols(), rv.getValue());
                setValue(ctx, r.getData(), lv.getCols());
            }

        } else {
            if (rv.getMatrix() != null) {
                r = oper.op(lv.getValue(), rv.getMatrix(), rv.getCols());
                setValue(ctx, r.getData(), rv.getCols());
            } else {
                rf = oper.op(lv.getValue(), rv.getValue());
                setValue(ctx, rf.getData());
            }
        }
    }
}