package findduplicates;

import java.io.PrintStream;

public class FindDuplicates {

    public void findDuplicates(int... inputNumber) {
        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = i + 1; j < inputNumber.length - 1; j++) {
                if (inputNumber[i] == inputNumber[j] && i != j) {
                    PrintStream printStream = System.out;
                    printStream.println(" Duplicates : " + inputNumber[j]);
                }
            }
        }
    }
}
