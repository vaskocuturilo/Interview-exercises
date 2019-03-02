package fliparray;

import static org.junit.Assert.*;

public class FlipArrayTest {

    @org.junit.Test
    public void testEvenLengthOfArrayNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        FlipArray.addedNumber(numbers);
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, numbers);
    }

    @org.junit.Test
    public void testOddLengthOfArrayNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        FlipArray.addedNumber(numbers);
        assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, numbers);
    }

    @org.junit.Test
    public void testEmptyArrayNumber() {
        int[] numbers = {};
        FlipArray.addedNumber(numbers);
        assertArrayEquals(new int[]{}, numbers);
    }

    @org.junit.Test
    public void testNullArrayNumber() {
        int[] numbers = null;
        FlipArray.addedNumber(numbers);
        assertArrayEquals(null, numbers);
    }

}