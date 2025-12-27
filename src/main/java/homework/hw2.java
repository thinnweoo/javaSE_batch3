package homework;
import java.util.Scanner;

public class hw2 {
//    Q1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for grades: ");
        int n = sc.nextInt();
        if (n>= 80 && n<=100) {
            System.out.println("A");
        }else if (n>=70 && n<=79){
            System.out.println("B");
        }else if (n>=60 && n<=69){
            System.out.println("C");
        }else if (n>=50 && n<=59){
            System.out.println("D");
        }else if (n<50){
            System.out.println("F");
        }else{
            System.out.println("Invalid score");
        }

//        Q2
        System.out.print("Enter a number for positive, negative or zero: ");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("Positive");
        }else if (num<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

//        Q3
        System.out.print("Enter a number for even or odd: ");
        int num1 = sc.nextInt();
        if (num1%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

//        Q4
        System.out.print("Enter a number a while loop: ");
        int num2 = sc.nextInt();
        int count = 1;
        while (count <= num2) {
            System.out.println(count);
            count++;
        }

        System.out.print("Enter number of multiplication table: ");
        int num3 = sc.nextInt();
        int count1 = 1;
        while (count1 <= 10) {
            System.out.println(num3 + " x " + count1 + " = " + num2 * count1);
            count1++;
        }

        System.out.print("Enter a number for count digits: ");
        int num4 = sc.nextInt();
        int count2 = 0;
        if (num4 == 0) {
            count2 = 1;
        }
        while (num4 > 0) {
            count2++;
        }





        sc.close();


    }
}
