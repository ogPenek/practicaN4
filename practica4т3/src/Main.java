import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення кількості рядків для ромба
        System.out.print("Введіть кількість рядків для ромба: ");
        int n = scanner.nextInt();

        // Верхня частина ромба
        for (int i = 1; i <= n; i++) {
            // Виведення пробілів
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Виведення зірочок
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Нижня частина ромба
        for (int i = n - 1; i > 0; i--) {
            // Виведення пробілів
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Виведення зірочок
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
