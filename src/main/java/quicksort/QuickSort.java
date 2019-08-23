package quicksort;


/**
 * The class QuickSort.
 */
class QuickSort {

    /**
     * The method quick sort int [ ].
     *
     * @param inputNumber the input number
     * @param begin       the begin
     * @param end         the end
     * @return the int [ ]
     * <p>
     * example:
     * int[] inputNumber={22,2,1,3};
     * quickSort(inputNumber, 0, inputNumber.length-1);
     */
    public static int[] quickSort(int[] inputNumber, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(inputNumber, begin, end);

            quickSort(inputNumber, begin, partitionIndex - 1);
            quickSort(inputNumber, partitionIndex + 1, end);
        }
        return inputNumber;
    }


    /**
     * The method partition.
     *
     * @param inputNumber input array number.
     * @param begin       begin number.
     * @param end         end number.
     */
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
