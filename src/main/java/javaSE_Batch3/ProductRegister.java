package javaSE_Batch3;

import java.util.Scanner;

public class ProductRegister {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("--- User Register ---");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        User user = new User(username,email);
        System.out.println("\n--- Registration Successful ---");
        System.out.println("Username: " + user.getUserName());
        System.out.println("Email: " + user.getEmail());

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
        System.out.print("Enter product type: physical/digital type(p or d): ");
        char type = sc.nextLine().charAt(0);
        if (type == 'p') {
            Product pp = new PhysicalProduct();
            System.out.print("Enter shipping cost: ");
            int cost = sc.nextInt();
            pp.setShippingCost(cost);
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            pp.setProductName(sc.nextLine());

            System.out.print("Enter Product ID: ");
            pp.setProductID(sc.nextInt());

            System.out.print("Enter Base Price: ");
            pp.setBasePrice(sc.nextDouble());
            sc.nextLine();

            return pp;

        }else if (type == 'd') {
            Product dp = new DigitalProduct();
            System.out.print("Is license valid (true/false): ");
            dp.setLicenseValidation(sc.nextBoolean());
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            dp.setProductName(sc.nextLine());
            System.out.print("Enter Product ID: ");
            dp.setProductID(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter Base Price: ");
            dp.setBasePrice(sc.nextDouble()); sc.nextLine();


            return dp;

        }
        return null;
    }
}