package parsestring;

public class ParseString {

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
