import java.util.Scanner;

public class Dvoznach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть число: ");
            int number = getValidInt(scanner);

            if (number >= 10 && number <= 99) {
                if (number % 2 == 0) {
                    System.out.println("Число " + number + " є двозначним і парним.");
                } else {
                    System.out.println("Число " + number + " є двозначним, але непарним.");
                }
            } else {
                System.out.println("Введене число не є двозначним.");
            }

            System.out.print("Бажаєте продовжити (Так або Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }

    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Будь ласка, введіть ціле число.");
            scanner.next(); // Очистка буфера вводу
        }
        return scanner.nextInt();
    }
}
