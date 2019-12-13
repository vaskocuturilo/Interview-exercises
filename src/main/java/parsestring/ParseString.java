package parsestring;


import java.io.PrintStream;
import java.util.Arrays;

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
        String strArr[] = inputText.split("[^\\d]+");

        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);

        }
        int[] firstArray = Arrays.copyOfRange(numArr, 0, numArr.length / 2);

        int[] secondArray = Arrays.copyOfRange(numArr, numArr.length / 2, numArr.length);

        upArray(firstArray);
        downArray(secondArray);
        return numArr;
    }

    private void upArray(int[] inputArray) {
        PrintStream printStream = System.out;
        for (int i = 0; i < inputArray.length; i++) {
            int tempNumber = inputArray[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = inputArray[j];
                if (tempNumber < leftNumber) {
                    inputArray[j + 1] = leftNumber;
                    inputArray[j] = tempNumber;
                }
            }
        }
        for (int sortNumber : inputArray) {
            printStream.print(" " + sortNumber);
        }
    }

    private void downArray(int[] inputArray) {
        PrintStream printStream = System.out;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] < inputArray[j]) {
                    int tempNumber = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = tempNumber;

                }
            }
        }

        printStream.print(" " + Arrays.toString(inputArray));
    }
}
