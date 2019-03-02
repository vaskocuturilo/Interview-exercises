package factorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void getSimpleFactorial() {
        int numbers = 5;
        assertEquals(120, Factorial.getFactorial(numbers));
    }

    @Test
    public void getZeroFactorial() {
        int numbers = 0;
        assertEquals(1, Factorial.getFactorial(numbers));
    }

    @Test
    public void getLessZeroFactorial() {
        int numbers = -100;
        assertEquals(-1, Factorial.getFactorial(numbers));
    }
}