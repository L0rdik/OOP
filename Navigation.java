import java.io.IOException;
import java.util.Scanner;

public class Navigation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Оберіть завдання:");
            System.out.println("1. Записувати випадкові числа у файл");
            System.out.println("2. Вивести вміст файлу на екран");
            System.out.println("0. Вийти з програми");
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    task1.main(args);
                    break;
                case 2:
                    task2.main(args);
                    break;
                case 0:
                    System.out.println("Програма завершена.");
                    System.exit(0);
                default:
                    System.out.println("Некоректний вибір. Спробуйте ще раз.");
            }
        }
    }
}
