public class Fibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please input a non-negative integer along with your command");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
