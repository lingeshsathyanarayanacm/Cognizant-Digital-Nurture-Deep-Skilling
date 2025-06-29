import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator created");
    }
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator destroyed");
    }
    @Test
    public void testAddition() {
        int a = 10;
        int b = 5;
        int result = calculator.add(a, b);
        assertEquals("10 + 5 should be 15", 15, result);
    }

    @Test
    public void testMultiplication() {
        int a = 4;
        int b = 3;

        int result = calculator.multiply(a, b);

        assertEquals("4 * 3 should be 12", 12, result);
    }

    @Test
    public void testDivision() {
        int a = 20;
        int b = 5;

        int result = calculator.divide(a, b);
        assertEquals("20 / 5 should be 4", 4, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
        calculator.divide(a, b);
    }
}
