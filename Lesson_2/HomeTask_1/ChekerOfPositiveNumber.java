package Lesson_2.HomeTask_1;

import java.util.Scanner;

public class ChekerOfPositiveNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            try {
                checkPositiveNumber(number);
                System.out.println("Число корректно");
            } catch (InvalidNumberException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void checkPositiveNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}
