package subtractionarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingWithArraysTest {

    @Test
    public void subtractionFirstArrayFromSecond() {
        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, WorkingWithArrays.subtractionSecondArrayFromFirst(firstArray, secondArray));
    }
}