package javaSE_Batch3;

public class PhysicalProduct extends Product {
    private int shippingCost;


    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getShippingCost(int i) {
        return shippingCost;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Shipping Cost: " + shippingCost);
    }
}
