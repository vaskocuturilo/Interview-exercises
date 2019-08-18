package parsestring;

public class ParseString {

    public int[] parseString(String inputText) {

        String strArr[] = inputText.split("[^\\d]+");

        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);

        }
        return numArr;
    }
}
