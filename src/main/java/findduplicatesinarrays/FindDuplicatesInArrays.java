package findduplicatesinarrays;

import java.io.PrintStream;
import java.util.HashSet;

public class FindDuplicatesInArrays {

    public void findDuplicatesInArraysWithHash(int[] firstArray, int[] secondArray) {
        PrintStream printStream = System.out;
        if ((firstArray == null || firstArray.length <= 1) && (secondArray == null || secondArray.length <= 1)) {
            return;
        }

        HashSet<Integer> duplicates = new HashSet<>();

        for (int i : firstArray)
            duplicates.add(i);
        for (int i : secondArray) {
            if (duplicates.contains(i)) {
                printStream.println("Duplicates : " + i);
            }
        }
    }


    public void findDuplicatesInArraysWithoutHash(int[] firstArray, int[] secondArray) {
        PrintStream printStream = System.out;

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    printStream.println("Duplicates : " + secondArray[j]);
                }
            }
        }
    }
}
