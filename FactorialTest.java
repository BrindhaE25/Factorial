import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void shouldReturnOneWhenNumberIsZero() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(0);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldReturnZeroWhenNumberIsNegative() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(-7);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldReturnFactorialWhenNumberIsGreaterThanZero() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(4);
        int expected = 24;
        assertEquals(actual,expected);
    }
}
