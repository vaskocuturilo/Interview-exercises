package binarysearch;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputNumber = {10, 20, 30, 40};
        binarySearch.binarySearch(inputNumber, 0, inputNumber.length - 1, 20);
        assertEquals(2, binarySearch.binarySearch(inputNumber, 0, inputNumber.length - 1, 20));
    }

    @Test
    public void recursionBinarySearch() {
    }
}