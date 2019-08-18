package fibanocci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacciEven() {
        assertEquals(3, Fibonacci.fibonacci(4));

    }

    @Test
    public void fibonacciNotEven() {
        assertEquals(2, Fibonacci.fibonacci(3));

    }
}