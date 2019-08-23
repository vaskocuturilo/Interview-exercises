package fizbuzz;

import java.io.PrintStream;


/**
 * The class FizzBuzz.
 */
public class FizzBuzz {

    /**
     * Method getFizzBuzz.
     */
    public static void getFizzBuzz() {
        PrintStream printStream = System.out;
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                printStream.println(" Fizz Buzz " + i);
            } else if (i % 3 == 0) {
                printStream.println(" Fizz " + i);
            } else if (i % 5 == 0) {
                printStream.println(" Buzz " + i);
            } else {
                printStream.println(" " + i);
            }
        }
    }
}
