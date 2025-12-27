package org.example;

public class Deposit {
    public static int totalAmount = 0;
    public String name;
    public String date;
    public String reason;
    public int amount;

    public Deposit(String name, String date, String reason, int amount) {
        this.name = name;
        this.date = date;
        this.reason = reason;
        this.amount = amount;
    }
    public Deposit() {

    }
    public void display() {
        System.out.println("Name: " + name + "  Date: " + date + "  Reason: " + reason + "  Amount: " + amount);
    }
}


