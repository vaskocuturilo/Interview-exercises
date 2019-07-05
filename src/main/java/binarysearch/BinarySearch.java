package binarysearch;

import java.io.PrintStream;
import java.util.Arrays;

public class BinarySearch {

    public int binarySearch(int[] inputNumber, int left, int right, int searchElement) {

        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (inputNumber[middle] == searchElement) {
                return middle;

            }

            if (inputNumber[middle] > searchElement) {
                return binarySearch(inputNumber, 1, middle - 1, searchElement);
            } else {

                return binarySearch(inputNumber, middle + 1, right, searchElement);
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        BinarySearch binarySearch = new BinarySearch();
        int[] inputNumber = {2, 3, 4, 10, 40};

        int left = 0;
        int right = inputNumber.length - 1;
        int result = binarySearch.binarySearch(inputNumber, left, right, 40);
        printStream.println(Arrays.toString(inputNumber));
        printStream.println("Index is : " + result);
    }
}
