import java.util.Scanner;

public class Kvadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Введіть координати точки (x, y):");
            System.out.print("x: ");
            double x = getValidDouble(scanner);
            System.out.print("y: ");
            double y = getValidDouble(scanner);

            int quadrant;

            if (x > 0 && y > 0) {
                quadrant = 1;
            } else if (x < 0 && y > 0) {
                quadrant = 2;
            } else if (x < 0 && y < 0) {
                quadrant = 3;
            } else if (x > 0 && y < 0) {
                quadrant = 4;
            } else {
                System.out.println("Точка лежить на вісі або в початку координат.");
                continue; // Перейти до наступної ітерації циклу
            }

            System.out.println("Точка знаходиться в " + quadrant + " квадранті.");

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
