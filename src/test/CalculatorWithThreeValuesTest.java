/*
 * From Udemy Course: Learn Test Driven Development in Java
 */

package test;

import main.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorWithThreeValuesTest {
    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;

    @Before
    public void createCalculatorWithThreeValues() {
        calculator = new Calculator();
        value1 = new BigDecimal(12);
        value2 = new BigDecimal(22);
        value3 = new BigDecimal(52);

        calculator.setAccumulater(value1);
        calculator.enter();

        calculator.setAccumulater(value2);
        calculator.enter();

        calculator.setAccumulater(value3);
    }

    @Test
    public void testAccumulatorAfterPushingThreeValues() {
        assertEquals(value3, calculator.getAccumulator());

    }

    @Test
    public void testAccumulatorAfterSingleDrop() {
        calculator.drop();
        assertEquals(value2, calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorAfterTwoDrops() {
        calculator.drop();
        calculator.drop();
        assertEquals(value1, calculator.getAccumulator());
    }
}
