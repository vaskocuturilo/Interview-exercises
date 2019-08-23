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
     * Method Get count of digits int.
     *
     * @param number the number
     * @return the int
     */
    public static int getCountOfDigits(final long number) {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(number + 0.5));
    }

    /**
     * Method Get count of digits with String.
     *
     * @param inputNumber input number.
     * @return the int
     */
    public static int getCountOfDigitsWithString(final long inputNumber) {
        return String.valueOf(Math.abs(inputNumber)).length();
    }
}
