import java.util.Scanner;

public class Obchisl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть значення x: ");
            double x = getValidDouble(scanner);

            double result;

            if (x < -2) {
                result = 1 / Math.tan(x);
            } else if (x >= -2 && x <= 2) {
                result = 9 * Math.pow(x, 2);
            } else {
                result = Math.pow(Math.sin(x), 2);
            }

            System.out.println("f(x) = " + result);

            System.out.print("Бажаєте продовжити (Так або Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }

    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Будь ласка, введіть дійсне число.");
            scanner.next(); // Очистка буфера вводу
        }
        return scanner.nextDouble();
    }
}
