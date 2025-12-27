package homework;
import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 1;
        while(count <= 12) {
            System.out.println(n + "x" + count + "=" + n*count);
            count++;
        }




    }

//    public static void multiplication(int a, int b) {
//
//    }
}
