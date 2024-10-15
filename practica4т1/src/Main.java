import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення трьох сторін трикутника
        System.out.print("Введіть три сторони трикутника: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Перевірка можливості існування трикутника
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            // Якщо трикутник існує, визначаємо його тип
            if (a == b && b == c) {
                System.out.println("Це рівносторонній трикутник.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Це рівнобедрений трикутник.");
            } else {
                System.out.println("Це різносторонній трикутник.");
            }
        } else {
            System.out.println("Трикутник з такими сторонами не може існувати.");
        }

        scanner.close();
    }
}
