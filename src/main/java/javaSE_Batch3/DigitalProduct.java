package javaSE_Batch3;

public class DigitalProduct extends Product {
    boolean licenseValidation;

    public void setLicenseValidation(boolean licenseValidation) {
        this.licenseValidation = licenseValidation;
    }

    public boolean isLicenseValidation() {
        return licenseValidation;
    }

    @Override
    public void display() {
        super.display();
        boolean licenseValidation1 = isLicenseValidation();
        System.out.print(licenseValidation1);
    }
}
