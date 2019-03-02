package bubblesort;

import java.io.PrintStream;

/**
 * Class Bubble sort.
 */
public final class CheckBubbleSort {

    /**
     * Constructor.
     */
    private CheckBubbleSort() {
    }

    /**
     * Gets sort.
     *
     * @param inputNumber the inputNumber.
     */
    public static void assertSort(int... inputNumber) {
        if (inputNumber == null || inputNumber.length <= 1) {
            return;
        }
        for (int i = 0; i < inputNumber.length; i++) {
            final int tempLine = inputNumber[i];
            for (int j = i - 1; j >= 0; j--) {
                final int leftNumber = inputNumber[j];
                if (tempLine < leftNumber) {
                    inputNumber[j + 1] = leftNumber;
                    inputNumber[j] = tempLine;
                } else {
                    break;
                }
            }
        }
        for (final int sortNumber : inputNumber) {
            final PrintStream printStream = System.out;
            printStream.print(sortNumber + " ");
        }
    }
}


