package additionarrays;

import java.util.Arrays;
import java.util.stream.IntStream;


/**
 * Class Many arrays.
 */
public final class ManyArrays {

    /**
     * Constructor.
     */
    private ManyArrays() {

    }

    /**
     * Addition of arrays.
     *
     * @param firstArray  the first array
     * @param secondArray the second array
     */
    public static void additionOfArrays(final int[] firstArray, final int[] secondArray) {
        IntStream
                .concat(Arrays.stream(firstArray), Arrays.stream(secondArray))
                .distinct()
                .sorted()
                .forEach(System.out::print);
    }
}
