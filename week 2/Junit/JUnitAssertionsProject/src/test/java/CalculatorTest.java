import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals("2 + 3 should equal 5", 5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals("10 - 4 should equal 6", 6, calc.subtract(10, 4));
    }

    @Test
    public void testTrueCondition() {
        assertTrue("5 is greater than 3", 5 > 3);
    }

    @Test
    public void testFalseCondition() {
        assertFalse("5 is not less than 3", 5 < 3);
    }

    @Test
    public void testNull() {
        Calculator calc = new Calculator();
        assertNull("Expected null object", calc.getNullObject());
    }

    @Test
    public void testNotNull() {
        assertNotNull("Expected non-null object", new Object());
    }
}
