package javaSE_Batch3;

import java.util.Scanner;

public class ProductRegister {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Product[] products = new Product[100];
        int index = 0;
        int n;

        do {
            System.out.print("Enter the number: 1 for adding a product, 2 for displaying all products, 3 for exiting: ");
            n = sc.nextInt();
            sc.nextLine();

            if (n == 1) {
                char more;
                do {
                    products[index] = collectProduct();
                    index++;

                    System.out.print("Do you want to add more (Y/N)? ");
                    more = sc.next().charAt(0);
                    sc.nextLine();

                } while (more == 'Y' || more == 'y');
            }

            else if (n == 2) {
                System.out.println("\nID, Name, Base Price, Type");
                for (int i = 0; i < index; i++) {
                    products[i].display();
                }
            }

            else if (n == 3) {
                System.out.println("Exit");
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (n >= 1 && n <= 3);

        sc.close();
    }

    public static Product collectProduct() {

        Product p = new Product();

        System.out.print("Enter Product Name: ");
        p.productName = sc.nextLine();

        System.out.print("Enter Product ID: ");
        p.productID = sc.nextInt();

        System.out.print("Enter Base Price: ");
        p.basePrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Product Type: ");
        p.productType = sc.nextLine();

        return p;
    }
}