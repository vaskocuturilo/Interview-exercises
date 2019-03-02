package numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void getMissingNumberInEvenArray() {
        int[] inputNumbers = {1, 2, 3, 5};
        assertArrayEquals(new int[]{4}, MissingNumber.getMissingNumberInArray(inputNumbers));
    }

    @Test
    public void getMissingNumberInNotEvenArray() {
        int[] inputNumbers = {1, 2, 3, 4, 6};
        assertArrayEquals(new int[]{5}, MissingNumber.getMissingNumberInArray(inputNumbers));
    }

    @Test
    public void getMissingNumberInZeroArray() {
        int[] inputNumbers = {0};
        assertArrayEquals(new int[]{1}, MissingNumber.getMissingNumberInArray(inputNumbers));
    }

    @Test
    public void getMissingNumberInNullArray() {
        int[] inputNumbers = null;
        assertArrayEquals(new int[]{0}, MissingNumber.getMissingNumberInArray(inputNumbers));
    }

    @Test
    public void getMissingNumberInLessZeroArray() {
        int[] inputNumbers = {-1};
        assertArrayEquals(new int[]{1}, MissingNumber.getMissingNumberInArray(inputNumbers));
    }
}