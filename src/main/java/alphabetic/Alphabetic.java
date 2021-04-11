package alphabetic;

import java.util.concurrent.ConcurrentHashMap;

/**
 * The class Alphabetic.
 */
public class Alphabetic {

    /**
     * The default constructor.
     */
    public Alphabetic() {
        super();
        //empty
        return;
    }

    /**
     * Count of number character elements.
     *
     * @param inputString the input string
     */
    public ConcurrentHashMap<Character, Integer> countOfNumberCharacterElements(final String inputString) {
        final ConcurrentHashMap<Character, Integer> charMap = new ConcurrentHashMap<>();
        final char[] newArray = inputString.toCharArray();

        for (final char elements : newArray) {

            if (Character.isAlphabetic(elements)) {
                if (charMap.containsKey(elements)) {
                    charMap.put(elements, charMap.get(elements) + 1);

                } else {
                    charMap.put(elements, 1);
                }
            }
        }

        return charMap;
    }
}
