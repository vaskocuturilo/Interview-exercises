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
                for (int a : firstArray) {
                    add(a);
                }
            }
        };
        final List<Integer> secondIntList = new ArrayList<Integer>() {
            {
                for (int a : secondArray) {
                    add(a);
                }
            }
        };
        firstIntList.removeAll(secondIntList);
        final PrintStream printStream = System.out;
        for (final int a : firstIntList) {
            printStream.println(a);
        }

        return firstArray;
    }

    public static void main(String[] args) {
        WorkingWithArrays.subtractionSecondArrayFromFirst(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5});
    }
}
