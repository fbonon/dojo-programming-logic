package br.com.cit.dojo.ex2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Before
    public void setup() {
    }

    @Test
    public void shouldAddNumbers() {
        double result = Calculator.calculate('+', 400, 350);
        assertEquals(750, result, 0.001);
    }

    @Test
    public void shouldSubtractNumbers() {
        double result = Calculator.calculate('-', 400, 350);
        assertEquals(50, result, 0.001);
    }

    @Test
    public void shouldMultiplyNumbers() {
        double result = Calculator.calculate('*', 400, 350);
        assertEquals(140000, result, 0.001);
    }

    @Test
    public void shouldDivideNumbers() {
        double result = Calculator.calculate('/', 400, 350);
        assertEquals(1.142857143, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotDivideByZero() {
        Calculator.calculate('/', 400, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldNotCalculateDifferentOperators() {
        Calculator.calculate('z', 400, 350);
    }
}
