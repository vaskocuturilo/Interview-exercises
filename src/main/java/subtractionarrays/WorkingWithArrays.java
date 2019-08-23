package subtractionarrays;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Class WorkingWithArrays.
 */
public final class WorkingWithArrays {

    /**
     * Constructor.
     */
    private WorkingWithArrays() {

    }

    /**
     * Subtraction first array from second.
     *
     * @param firstArray  the first array
     * @param secondArray the second array
     */
    public static int[] subtractionSecondArrayFromFirst(final int[] firstArray, final int... secondArray) {
        final List<Integer> firstIntList = new ArrayList<Integer>() {
            {
                for (int i : firstArray) {
                    add(i);
                }
            }
        };
        final List<Integer> secondIntList = new ArrayList<Integer>() {
            {
                for (int i : secondArray) {
                    add(i);
                }
            }
        };
        firstIntList.removeAll(secondIntList);
        final PrintStream printStream = System.out;
        for (final int i : firstIntList) {
            printStream.println(i);
        }

        return firstArray;
    }
}
