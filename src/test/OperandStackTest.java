package test;

import main.OperandStack;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperandStackTest {
    private OperandStack stack;

    @Before
    public void createStack() {
        stack = new OperandStack();
    }

    @Test
    public void testNewOperandStackPeekReturnsZero() {
        OperandStack stack = new OperandStack();
        assertEquals(BigDecimal.ZERO, stack.peek());
    }

    @Test
    public void testPushingValueOntoStack() {
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingTopOfSack() {
        stack.push(new BigDecimal(22));
        BigDecimal value = new BigDecimal(66);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingWithEmptyStack() {
        BigDecimal value = new BigDecimal(66);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }



    @Test
    public void testPoppingValuesFromStack() {
        BigDecimal value = new BigDecimal(45);
        stack.push(value);
        stack.push(new BigDecimal(55));
        stack.pop();
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingEmptyStack() {
        stack.pop();
        assertEquals(BigDecimal.ZERO, stack.peek());
    }
}