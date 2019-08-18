package binarysearch;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public void binarySearch(int[] inputArray, int key, int left, int right) {
        PrintStream printStream = System.out;
        int middle = 0;

        while (right >= left) {
            if (inputArray[middle] < key)
                left = middle + 1;
            else if (inputArray[middle] == key) {
                printStream.println(key + " found at location " + (middle + 1) + ".");
                break;
            } else
                right = middle - 1;

            middle = (left + right) / 2;
        }
        if (left > right)
            printStream.println(key + " isn't present in the list.\n");
    }

    public int recursionBinarySearch(int[] inputNumber, int left, int right, int searchElement) {

        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (inputNumber[middle] == searchElement) {
                return middle;

            }

            if (inputNumber[middle] > searchElement) {
                return recursionBinarySearch(inputNumber, 1, middle - 1, searchElement);
            } else {

                return recursionBinarySearch(inputNumber, middle + 1, right, searchElement);
            }

        }

        return -1;
    }
}
