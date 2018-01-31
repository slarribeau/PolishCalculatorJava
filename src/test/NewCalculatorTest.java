package test;

import main.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Formatter;

import static org.junit.Assert.assertEquals;

public class NewCalculatorTest {
    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
   public void testNewCalculatorHasAnAccumulatorOfZero() {
       assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
   }

   @Test
    public void testSettingAccumulatorValue() {
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulater(value);
        assertEquals(value, calculator.getAccumulator());
   }
}
