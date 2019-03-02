package fibanocci;

/**
 * The type Fibonacci.
 */
public class Fibonacci {

    /**
     * The constant executions.
     */
    public static int executions = 0;

    /**
     * Fibonacci int.
     *
     * @param n the n
     * @return the int
     */
    public static int fibonacci(int n) {
        executions++;
        System.out.println(executions + " fibonacci=" + n);

        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args) {

        fibonacci(6);
    }
}
