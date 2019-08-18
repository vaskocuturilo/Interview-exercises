package binarysearch;

import java.io.PrintStream;

public class BinarySearch {

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

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputNumber = {10, 20, 30, 40};
        binarySearch.binarySearch(inputNumber, 0, inputNumber.length - 1, 20);

    }
}
