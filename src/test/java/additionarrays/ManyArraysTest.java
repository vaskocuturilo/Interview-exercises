package additionarrays;

import org.junit.Test;

public class ManyArraysTest {

    @Test
    public void additionOfArrays() {
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {1, 2, 3, 5};
        ManyArrays.additionOfArrays(firstArray, secondArray);
    }
}