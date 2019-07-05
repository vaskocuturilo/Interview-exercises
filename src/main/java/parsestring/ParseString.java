package parsestring;

import java.io.PrintStream;
import java.util.Arrays;

public class ParseString {

    public int[] parseString(String inputText) {

        String strArr[] = inputText.split("[^\\d]+");

        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);

        }
        return numArr;
    }

    public static void main(String[] args) {

        String str = "44fdvvsd94.;h36s67.45c56";
        ParseString parseString = new ParseString();
        PrintStream printStream = System.out;
        printStream.print(" " + Arrays.toString(parseString.parseString(str)));
    }
}
