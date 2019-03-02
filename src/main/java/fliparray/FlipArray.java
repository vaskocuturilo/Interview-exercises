package fliparray;

/**
 * Class Flip array.
 */
public class FlipArray {

    /**
     * Default constructor.
     */
    public FlipArray() {
        super();
        //default constructor
        return;
    }

    /**
     * Method Added number.
     *
     * @param inputNumber the input number
     */
    public static void addedNumber(final int... inputNumber) {
        if (inputNumber == null || inputNumber.length <= 1) {
            return;
        }
        for (int i = 0; i < inputNumber.length / 2; i++) {
            final int temp = inputNumber[i];
            inputNumber[i] = inputNumber[inputNumber.length - 1 - i];
            inputNumber[inputNumber.length - 1 - i] = temp;
        }
    }


}
