package factorial;

/**
 * Class Factorial.
 */
public final class Factorial {

    /**
     * Constructor.
     */
    private Factorial() {

    }

    /**
     * Gets getFactorial.
     *
     * @param number the number
     * @return temp.
     */
    public static int getFactorial(final int number) {
        if (number < 0) {
            return -1;
        }
        int temp = 1;
        for (int i = 2; i <= number; i++) {
            temp *= i;
        }
        return temp;
    }
}
