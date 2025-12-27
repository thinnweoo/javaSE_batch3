package assignment;

public class RecursionSum {
    public static int sumToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumToN(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("sumToN(" + n + "): " + sumToN(n));
    }
}
