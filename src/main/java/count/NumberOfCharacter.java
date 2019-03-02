package count;

/**
 * Class NumberOfCharacter.
 */
public final class NumberOfCharacter {

    /**
     * Constructor.
     */
    private NumberOfCharacter() {

    }

    /**
     * Get count of digits int.
     *
     * @param number the number
     * @return the int
     */
    public static int getCountOfDigits(final long number) {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(number + 0.5));
    }
}
