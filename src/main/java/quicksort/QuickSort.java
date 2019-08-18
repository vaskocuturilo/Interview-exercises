package quicksort;

class QuickSort {

    public static int[] quickSort(int[] inputNumber, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(inputNumber, begin, end);

            quickSort(inputNumber, begin, partitionIndex - 1);
            quickSort(inputNumber, partitionIndex + 1, end);
        }
        return inputNumber;
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
}
