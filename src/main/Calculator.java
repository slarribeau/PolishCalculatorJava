package main;

import java.math.BigDecimal;
//import java.util.Stack;

public class Calculator {
    //private BigDecimal accumulator = BigDecimal.ZERO;
    //private Stack<BigDecimal> values = new Stack<>();
    private OperandStack values = new OperandStack();

    public BigDecimal getAccumulator() {
        //if (values.size() == 0)
            //return BigDecimal.ZERO;
        return values.peek();
    }

    public void setAccumulater(BigDecimal value) {
        values.replaceTop(value);

        //if (values.size() > 0)
            //values.pop();
        //values.push(value);
    }

    public void drop() {
        values.pop();
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void add() {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(value1.add(value2));
    }
}
