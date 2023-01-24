public class Fibonacci {
    
    /**
     * The method returns the nth term in the Fibonacci sequence.
     *
     * @param n the position of the term in the Fibonacci sequence to be returned
     * @author Mohamed Mohamed
     * @return the nth term of the Fibonacci sequence
     */

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int y = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is: " + y);
    }
}
