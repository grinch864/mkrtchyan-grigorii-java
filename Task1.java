import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение арифметических операций
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // Обработка деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + (a / (double) b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        System.out.println("a * b = " + (a * b));

        scanner.close();
    }
}