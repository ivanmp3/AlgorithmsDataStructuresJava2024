public class Main {
    public static void main(String[] args) {
        Inventory invent = new Inventory();

        // Создаем продукты
        Product product1 = new Product(101, "T-shirt", 10);
        Product product2 = new Product(102, "Jeans", 5);
        Product product3 = new Product(103, "Sneakers", 15);

        // Добавляем продукты в инвентарь
        invent.addProduct(product1, product1.getQuantity());
        invent.addProduct(product2, product2.getQuantity());
        invent.addProduct(product3, product3.getQuantity());

        // Отображаем все продукты в инвентаре
        System.out.println("Продукты в инвентаре:");
        invent.displayAllProducts();

        // Удаляем некоторые продукты
        invent.removeProduct(101, 3); // Удаляем 3 T-shirt
        invent.removeProduct(102, 1); // Удаляем 1 Jeans

        // Отображаем все продукты после удаления
        System.out.println("\nОбновленные продукты в инвентаре :");
        invent.displayAllProducts();

        // Пытаемся удалить больше, чем доступно
        invent.removeProduct(103, 20);

        String getProductName102 = invent.getProduct(102);
        System.out.println(getProductName102);
    }
}
