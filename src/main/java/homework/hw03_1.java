package homework;

import assignment.Product;

import java.util.Scanner;

public class hw03_1 {

    public static void main(String[] args) {
        Product[] products = new Product[100];
        Scanner sc = new Scanner(System.in);
        String flag = null; //"" so yin yaw ya lrr
        int count = 0;
        do {
            Product product = new Product();
            System.out.print("Enter name: ");
            product.name = sc.nextLine();
            System.out.print("enter price: ");
            product.price = sc.nextInt();sc.nextLine();
            System.out.print("enter quantity: ");
            product.quantity = sc.nextInt();sc.nextLine();
            System.out.print("enter product details: ");
            product.desc = sc.nextLine();
            System.out.print("enter phone number: ");
            product.phone = sc.nextInt();sc.nextLine();
            System.out.print("enter y/n to continue: ");
            products[count] = product;
            flag = sc.nextLine().toLowerCase();
            count++;
        }while(flag.equals("y"));
        System.out.println("Thank you for shopping with us!");
        for(int i=0; i<count; i++) {
            System.out.println(products[i].name + products[i].price + products[i].quantity + products[i].desc + products[i].phone);
        }

    }
}
