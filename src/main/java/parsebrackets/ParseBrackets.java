package parsebrackets;

/**
 * The class Parse brackets.
 */
public class ParseBrackets {

    /**
     * The method parsingString.
     *
     * @param inputString This is string.
     */
    public boolean parsingString(final String inputString) {
        int check = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (check < 0) {
                return false;
            }
            final String symbol = inputString.substring(i, i + 1);
            if ("(".equals(symbol) || "{".equals(symbol) || "[".equals(symbol)) {
                check++;
            }
            if (")".equals(symbol) || "}".equals(symbol) || "]".equals(symbol)) {
                check--;
            }
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }
}
