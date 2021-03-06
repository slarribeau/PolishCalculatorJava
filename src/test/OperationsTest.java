package test;
import main.Calculator;

import java.math.BigDecimal;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class OperationsTest {
    private Calculator calculator;


    @Before
    public void createCalcualtorWithTwoValues() {
        calculator = new Calculator();
        calculator.setAccumulater(new BigDecimal(20));
        calculator.enter();
        calculator.setAccumulater(new BigDecimal(4));
    }

    @Test
    public void testAddExecution() {
        calculator.execute("+");
        assertEquals(new BigDecimal(24), calculator.getAccumulator());

    }

    @Test
    public void testSubtractExecution() {
        calculator.execute("-");
        assertEquals(new BigDecimal(16), calculator.getAccumulator());

    }
}
