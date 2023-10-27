import java.util.Scanner;

public class FibonacciRec {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}

