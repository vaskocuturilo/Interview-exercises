package mergearrays;

import org.junit.Assert;
import org.junit.Test;

public class ConcatArraysTest {

    @Test
    public void mergeArrays() {
        String[] firstStringArray = {"A", "B"};
        String[] secondStringArray = {"C"};
        String[] mergedArrays = {"A", "B", "C"};
        ConcatArrays concatArrays = new ConcatArrays();
        Assert.assertArrayEquals(mergedArrays, concatArrays.mergeArrays(firstStringArray, secondStringArray));
    }
}