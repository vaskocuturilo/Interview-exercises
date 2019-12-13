package mergearrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The class Concat arrays.
 */
public class ConcatArrays {

    /**
     * The default constructor.
     */
    public ConcatArrays() {
        super();
        //empty
        return;
    }

    /**
     * Method Merge arrays. This method do it concat two string arrays.
     *
     * @param first  the first string array.
     * @param second the second string array.
     */
    public String[] mergeArrays(final String[] first, final String... second) {

        final List<String> mergeArrays = new ArrayList<String>(first.length + second.length);
        Collections.addAll(mergeArrays, first);
        Collections.addAll(mergeArrays, second);
        return mergeArrays.toArray(new String[0]);
    }
}
