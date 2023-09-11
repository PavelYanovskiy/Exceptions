package Lesson_3.Hometask;

import java.util.Scanner;

public class OnlineShopUI {
        public static void main(String[] args) throws InsufficientQuantity, ProductNotFound {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ID продукта: ");
            int productId = scanner.nextInt();
            System.out.print("Введите количество: ");
            int quantity = scanner.nextInt();

            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Итоговая цена: $" + totalPrice);
        }
    }
}

