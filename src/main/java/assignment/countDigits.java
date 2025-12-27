package assignment;

public class countDigits {
    public static int countNums(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countNums(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("count numbers: " + countNums(2025));
        System.out.println("count numbers: " + countNums(7));
        System.out.println("count numbers: " + countNums(153));
    }
}
