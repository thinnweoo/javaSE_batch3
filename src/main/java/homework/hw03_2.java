package homework;
import java.util.Scanner;

public class hw03_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();sc.nextLine();
        printPattern1(num);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();sc.nextLine();
        for (int i = num1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void printPattern1(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
