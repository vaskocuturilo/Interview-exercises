package minmaxvalueinarray;


/**
 * The type Values in array.
 */
public class ValuesInArray {

    /**
     * Default constructor.
     */
    public ValuesInArray() {
        super();
        //empty
        return;
    }

    /**
     * Method getMinValueInArray.
     *
     * @param inputNumber the input number.
     * @return the min value in array.
     */
    public int getMinValueInArray(final int... inputNumber) {
        if (inputNumber == null || inputNumber.length <= 1) {
            return 1;
        }

        int minValueInArray = inputNumber[0];

        for (int i = 1; i < inputNumber.length; i++) {

            if (minValueInArray > inputNumber[i]) {
                minValueInArray = inputNumber[i];
            }
        }

        return minValueInArray;
    }

    /**
     * Method getMaxValueInArray.
     *
     * @param inputNumber the input number.
     * @return the max value in array.
     */
    public int getMaxValueInArray(final int... inputNumber) {
        if (inputNumber == null || inputNumber.length <= 1) {
            return 1;
        }

        int maxValueInArray = inputNumber[0];

        for (int i = 1; i < inputNumber.length; i++) {

            if (maxValueInArray < inputNumber[i]) {
                maxValueInArray = inputNumber[i];
            }
        }

        return maxValueInArray;
    }
}
