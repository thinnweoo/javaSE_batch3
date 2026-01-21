package javaSE_Batch3;

public class Product {
    private String productName;
    private int productID;
    private double basePrice;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Product() {

    }

    public void display() {
        System.out.println("Product Name: " + productName + " Product ID: " + productID + " Base Price: " + basePrice);
    }

    public void setShippingCost(int cost) {

    }

    public void setLicenseValidation(boolean b) {
    }
}
