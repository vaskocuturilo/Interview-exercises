package findsumelements;

/**
 * The class CalculateElements.
 */
public class CalculateElements {

    /**
     * The default constructor.
     */
    public CalculateElements() {
        super();
        //empty
        return;
    }

    /**
     * The method findNumberOfPair.
     *
     * @param inputNumber this is array for search.
     * @param sumElements this is element which we are try to found.
     */
    public int findNumberOfPair(final int[] inputNumber, final int sumElements) {
        if (inputNumber.length < sumElements || inputNumber.length < 0) {
            return inputNumber.length;
        }
        int count = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = i + 1; j < inputNumber.length; j++) {
                if ((inputNumber[i] + inputNumber[j]) == sumElements) {
                    count++;
                }
            }
        }
        return count;
    }
}
