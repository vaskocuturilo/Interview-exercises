package reversestring;

import java.io.PrintStream;

/**
 * Class Reverse string.
 */
public final class ReverseString {

    /**
     * Constructor.
     */
    private ReverseString() {

    }

    /**
     * Reverse without builder string.
     *
     * @param text the text
     * @return the string
     */
    public static String reverseWithoutBuilder(final String text) {

        final char[] newString = text.toCharArray();
        char[] reverseString = new char[newString.length];

        for (int i = 0; i < newString.length; i++) {
            reverseString[(newString.length - 1) - i] = newString[i];
        }
        return new String(reverseString);
    }

    /**
     * Reverse with builder.
     *
     * @param text the text
     */
    public static String reverseWithBuilder(final String text) {
        final StringBuilder builder = new StringBuilder(text);
        return new String(builder.reverse());
    }
}
