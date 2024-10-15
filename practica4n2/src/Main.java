import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        int originalNumber = number; // Збереження оригінального числа для виведення

        // Змінна для зберігання реверсованого числа
        int reversedNumber = 0;

        // Цикл while для реверсу числа
        while (number != 0) {
            int digit = number % 10; // Отримуємо останню цифру
            reversedNumber = reversedNumber * 10 + digit; // Додаємо цифру до реверсованого числа
            number /= 10; // Оновлюємо число, видаляючи останню цифру
        }

        // Виведення результату з форматованим виведенням (наприклад, 10 символів, заповнених нулями)
        System.out.printf("Реверсоване число: %010d\n", reversedNumber);

        scanner.close();
    }
}
