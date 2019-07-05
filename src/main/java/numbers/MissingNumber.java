package numbers;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Class Missing Number.
 */
public final class MissingNumber {

    /**
     * Default constructor.
     */
    private MissingNumber() {

    }

    /**
     * Gets missing number in array.
     *
     * @param inputNumbers the nums
     * @return the missing number in array
     */
    public static int[] getMissingNumberInArray(final int... inputNumbers) {
        if (inputNumbers == null || inputNumbers.length < 0) {
            return new int[]{0};
        }
        Arrays.sort(inputNumbers);

        if (inputNumbers[inputNumbers.length - 1] != inputNumbers.length) {
            return new int[]{inputNumbers.length};
        } else if (inputNumbers[0] != 0) {
            return new int[]{0};
        }
        for (int i = 1; i < inputNumbers.length; i++) {
            final int expectedNum = inputNumbers[i - 1] + 1;
            if (inputNumbers[i] != expectedNum) {
                return new int[]{expectedNum};
            }
        }
        return new int[]{-1};
    }
}
