package binarysearch;

import java.io.PrintStream;


/**
 * The type Binary search.
 */
public class BinarySearch {

    /**
     * Method Binary search int.
     *
     * @param inputArray    the input array
     * @param left          the left
     * @param right         the right
     * @param searchElement the search element
     * @return the int
     */
    public int binarySearch(int[] inputArray, int left, int right, int searchElement) {
        PrintStream printStream = System.out;
        int middle = 0;

        while (right >= left) {
            if (inputArray[middle] < searchElement) {
                left = middle + 1;
            } else if (inputArray[middle] == searchElement) {
                printStream.println(searchElement + " Found in Array " + (middle + 1));
                break;
            } else
                right = middle - 1;
            middle = (left + right) / 2;
        }
        if (left > right)
            printStream.println(searchElement + " Not found in array. ");

        return middle + 1;
    }

    /**
     * Method Recursion binary search int.
     *
     * @param inputNumber   the input number
     * @param left          the left
     * @param right         the right
     * @param searchElement the search element
     * @return the int
     */
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
