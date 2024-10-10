import java.util.HashMap;

public class Inventory {

    private final HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product item,int quantity) {
        if (products.containsKey(item.getProductCode())) {
            Product existingProduct = products.get(item.getProductCode());
            existingProduct.setQuantity(existingProduct.getQuantity() + quantity); // Увеличиваем количество
        } else {
            item.setQuantity(quantity);
            products.put(item.getProductCode(), item);
        }
    }

    public String getProduct(int productCode) {
        return products.get(productCode).getName();
    }

    public void removeProduct(int productCode,int quantity) {
        Product product = products.get(productCode);
        if (product != null && product.getQuantity() - quantity >= 0) {
            product.setQuantity(product.getQuantity() - quantity);
        } else {
            System.out.println("Продукт с кодом " + productCode + " не найден или недостаточное количесвто");
        }
    }

    public void displayAllProducts() {
        for (Integer code : products.keySet()) {
            System.out.println("Product Name: " + products.get(code).getName() + ", quantity: " +  products.get(code).getQuantity());
        }
    }
}
