import java.util.Scanner;

public class Rivn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Введіть коефіцієнти квадратного рівняння ax^2 + bx + c = 0:");
            System.out.print("a: ");
            double a = getValidDouble(scanner);
            System.out.print("b: ");
            double b = getValidDouble(scanner);
            System.out.print("c: ");
            double c = getValidDouble(scanner);

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Рівняння має два розв'язки:");
                System.out.println("x1 = " + root1);
                System.out.println("x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Рівняння має один подвійний розв'язок:");
                System.out.println("x = " + root);
            } else {
                System.out.println("Рівняння не має розв'язків у дійсних числах.");
            }

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
            System.out.println("Будь ласка, введіть коректне число.");
            scanner.next(); // Очистка буфера вводу
        }
        return scanner.nextDouble();
    }
}
