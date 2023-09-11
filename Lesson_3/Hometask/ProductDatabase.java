package Lesson_3.Hometask;

public class ProductDatabase {
    public static Product getProduct(int productId) {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId == 1) {
            return new Product("Товар №1", 10, 5.99);
        }
        return null;
    }
}
