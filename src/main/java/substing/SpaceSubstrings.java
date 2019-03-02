package substing;

/**
 * Class Space substrings.
 */
public final class SpaceSubstrings {

    /**
     * Constant EMPTY.
     */
    private static final Character EMPTY = ' ';

    /**
     * Default constructor.
     */
    private SpaceSubstrings() {

    }

    /**
     * Gets space substrings.
     *
     * @param inputText the input text
     * @return the space substrings
     */
    public static int getSpaceSubstrings(final String inputText) {
        /**
         * counts the number of multiple contiguous
         * space substrings in a given string.
         *
         * @param String - the string to process
         * @return how many space substrings.
         */
        boolean foundSpace = false;
        boolean multiple = false;
        int resultSubstrings = 0;

        for (int i = 0; i < inputText.length(); i++) {

            if (inputText.charAt(i) == EMPTY) {
                if (foundSpace) {
                    multiple = true;
                }
                foundSpace = true;
            } else {
                if (foundSpace && multiple) {
                    resultSubstrings++;
                }
                foundSpace = false;
                multiple = false;
            }
        }

        return resultSubstrings;
    }
}
