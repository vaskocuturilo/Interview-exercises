package duplicate;

import java.util.Arrays;

/**
 * Class DuplicateElementsArray.
 */
public final class DuplicateElementsArray {

    /**
     * Constructor.
     */
    private DuplicateElementsArray() {

    }

    /**
     * Method removeDuplicateElements.
     *
     * @param inputElements the input elements.
     * @return the integer array elements.
     */
    public static Integer[] removeDuplicateElements(Integer... inputElements) {
        int dup = 0;
        if (inputElements == null || inputElements.length < 0)
            return new Integer[0];
        for (int i = 0; i < inputElements.length; i++) {
            for (int j = i + 1; j < inputElements.length - dup; j++) {
                if (inputElements[i].equals(inputElements[j])) {
                    while (j != inputElements.length - dup - 1
                            && inputElements[inputElements.length - dup - 1].equals(inputElements[j])) {
                        dup++;
                    }
                    final Integer tmp = inputElements[inputElements.length - dup - 1];
                    inputElements[inputElements.length - dup - 1] = inputElements[j];
                    inputElements[j] = tmp;
                    dup++;
                }
            }
        }
        return Arrays.copyOf(inputElements, inputElements.length - dup);
    }
}
