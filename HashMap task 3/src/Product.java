public class Product {

    final int productCode;
    final String name;
    int quantity;


    public Product(int productCode, String name, int quantity) {
        this.productCode = productCode;
        this.name = name;
        this.quantity = quantity;
    }

    public int getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
