package org.example;
import java.util.*;

public class DepositRegister {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Deposit[] deposits = new Deposit[100];
        int index = 0;

        String flag;

        do {
            deposits[index] = collectDeposit();
            index++;

            System.out.print("Do you want to deposit more (Y/N): ");
            flag = sc.next();
            sc.nextLine();

        } while (flag.toLowerCase().equals("y"));

        displayAll(deposits, index);
    }


    public static Deposit collectDeposit() {

        Deposit d = new Deposit();

        System.out.print("Enter Name : ");
        d.name = sc.nextLine();

        System.out.print("Date of Deposit: ");
        d.date = sc.nextLine();

        System.out.print("Reason : ");
        d.reason = sc.nextLine();

        System.out.print("Amount : ");
        d.amount = sc.nextInt();
        sc.nextLine();

        Deposit.totalAmount += d.amount;

        return d;
    }

    public static void displayAll(Deposit[] arr, int count) {

        for (int i = 0; i < count; i++) {
            Deposit d = arr[i];
            System.out.println("Name: " + d.name + "  Date: " + d.date + "  Reason: " + d.reason + "  Amount: " + d.amount + "  Total Amount: " + Deposit.totalAmount);
        }
    }
}
