public class Fibonacci {

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