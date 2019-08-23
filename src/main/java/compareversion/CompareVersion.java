package compareversion;


/**
 * The class Compare version.
 */
public class CompareVersion {

    /**
     * Method Find compare version int.
     *
     * @param firstString  the first string
     * @param secondString the second string
     * @return the int
     */
    public int findCompareVersion(String firstString, String secondString) {
        String[] firstArray = firstString.split("\\.");
        String[] secondArray = secondString.split("\\.");
        if (firstString.length() == 0 && secondString.length() == 0) {
            return 0;
        }
        int i = 0;
        while (i < firstArray.length || i < secondArray.length) {
            if (i < firstArray.length && i < secondArray.length) {
                if (Integer.parseInt(firstArray[i]) < Integer.parseInt(secondArray[i])) {
                    return -1;
                } else if (Integer.parseInt(firstArray[i]) > Integer.parseInt(secondArray[i])) {
                    return 1;
                }
            } else if (i < firstArray.length) {
                if (Integer.parseInt(firstArray[i]) != 0) {
                    return 1;
                }
            } else if (i < secondArray.length) {
                if (Integer.parseInt(secondArray[i]) != 0) {
                    return -1;
                }
            }

            i++;
        }

        return 0;
    }
}
