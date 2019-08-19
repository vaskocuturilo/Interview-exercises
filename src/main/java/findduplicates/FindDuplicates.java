package findduplicates;

import java.io.PrintStream;
import java.util.HashSet;

public class FindDuplicates {

    public void findDuplicatesWithoutHash(int... inputNumber) {
        PrintStream printStream = System.out;
        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = i + 1; j < inputNumber.length - 1; j++) {
                if (inputNumber[i] == inputNumber[j] && i != j) {

                    printStream.println(" Duplicates : " + inputNumber[j]);
                }
            }
        }
    }


    public void findDuplicatesWithHash(int... inputNumber) {
        PrintStream printStream = System.out;
        if (inputNumber == null || inputNumber.length <= 1) {
            return;
        }

        HashSet<Integer> duplicates = new HashSet<>();

        for (int elements : inputNumber) {
            if (!duplicates.add(elements)) {
                printStream.println(" Duplicates : " + elements);
            }
        }
    }
}
