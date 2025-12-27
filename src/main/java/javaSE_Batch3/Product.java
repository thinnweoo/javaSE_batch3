package javaSE_Batch3;

public class Product {
    public String productName;
    public int productID;
    public double basePrice;
    public String productType;

//    Product(String productName, int productID, double basePrice, String productType) {
//        this.productName = productName;
//        this.productID = productID;
//        this.basePrice = basePrice;
//        this.productType = productType;
//    }

    public Product() {

    }

    public void display() {
        System.out.println("Product Name: " + productName + " Product ID: " + productID + " Base Price: " + basePrice + " Product Type: " + productType);
    }
}
