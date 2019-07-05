package quicksort;

import java.io.PrintStream;
import java.util.Arrays;

class QuickSort {

    public static void quickSort(int[] inputNumber, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(inputNumber, begin, end);

            quickSort(inputNumber, begin, partitionIndex - 1);
            quickSort(inputNumber, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] inputNumber, int begin, int end) {
        int pivot = inputNumber[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (inputNumber[j] <= pivot) {
                i++;

                int swapTemp = inputNumber[i];
                inputNumber[i] = inputNumber[j];
                inputNumber[j] = swapTemp;
            }
        }

        int swapTemp = inputNumber[i + 1];
        inputNumber[i + 1] = inputNumber[end];
        inputNumber[end] = swapTemp;

        return i + 1;
    }

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        int[] inputArray = {6, 3, 2, 1, 0, 8, 99, 33, 22};
        int left = 0;
        int right = inputArray.length - 1;
        QuickSort.quickSort(inputArray, left, right);
        printStream.println(Arrays.toString(inputArray));
    }

}
