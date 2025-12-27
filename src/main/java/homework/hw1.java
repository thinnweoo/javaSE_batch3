package homework;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
//        Part 1
        String name;
        int age;
        double height;
        char grade;
        boolean isActive;

        name = "Thin Nwe Oo";
        age = 23;
        height = 1.5;
        grade = 'A';
        isActive = true;
        System.out.println("Student's name is " + name + ". Their age is " + age + ". Their height is " + height + ". Their grade is " + grade + ". Their status is " + isActive + ".");

        byte a = 127;
        short b = 1;
        int c = 100;
        long d = 1000L;
        float e = 100.5f;
        double f = 100.5;
        boolean g = false;
        char h = 'A';

        System.out.println("byte value is " + a + "short value is " + b);
        System.out.println("int value is " + c + "long value is " + d);
        System.out.println("float value is " + e + "double value is " + f);
        System.out.println("boolean value is " + g + "char value is " + h);

//        Part 3
        int num1 = 100;
        int num2 = 200;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num2 / num1;
        int remainder = num1 % num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("difference is " + diff);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is " + remainder);

        int x = 10;
        int y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x / y = " + (x / y));
        System .out.println("x % y = " + (x % y));
        System.out.println("x * y = " + (x * y));
        int i = x++;
        System.out.println("x++ = " + (i));
        int j = --y;
        System.out.println("--y = " + (j));
        int n = 49;
        System.out.println(n > 50);
        System.out.println(n%2 == 1);

//        Part 4
        String word = "Hello Java";
        System.out.println("Length of string is " + word.length());
        System.out.println("Character at index 1 is " + word.charAt(1));
        System.out.println("Word in uppercase is " + word.toUpperCase());
        System.out.println("Word in lowercase is " + word.toLowerCase());
        System.out.println("Does the word contain 'Java'? " + word.contains("Java"));

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: " + scanner.nextLine());
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

//        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter another string: ");

        String str1 = scanner.nextLine();
        System.out.println("Compare: " + input.equals(str1));

        System.out.println("Are they the same length? " + (input.length() == str1.length()));

        System.out.println("Concatenate the string: " + input.concat("-").concat(str1));

        scanner.close();



    }
}
