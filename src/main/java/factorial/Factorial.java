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

    /**
     * Gets recursion factorial.
     *
     * @param inputNumber the input number.
     * @return the recursion factorial
     */
    public long getRecursionFactorial(int inputNumber) {
        if (inputNumber > 20) throw new IllegalArgumentException(inputNumber + " is out of range");
        return (1 > inputNumber) ? 1 : inputNumber * getRecursionFactorial(inputNumber - 1);
    }
}
