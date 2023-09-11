package Lesson_3.Hometask;

public class ShopManager {
    private String name;
    private int availableQuantity;
    private double price;

    public ShopManager(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    public static double purchaseProduct(int productId, int quantity) {
        return 0;
    }
}