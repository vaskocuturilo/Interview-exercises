package parsestring;


/**
 * The class ParseString.
 */
public class ParseString {

    /**
     * Parse string int [ ].
     *
     * @param inputText the input text
     * @return the int [ ]
     */
    public int[] parseString(String inputText) {
        if (inputText.length() == 0 || inputText.length() <= 1) {
            return null;
        }

        String strArr[] = inputText.split("[^\\d]+");

        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);

        }
        return numArr;
    }
}
