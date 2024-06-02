import java.util.Scanner;

public class Misyac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть номер місяця: ");
            int month = getValidMonth(scanner);

            int days;
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                    break;
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                case 2:
                    days = 28; // для простороків
                    break;
                default:
                    days = -1; // невірний номер місяця
            }

            if (days != -1) {
                System.out.println("Кількість днів у місяці: " + days);
            } else {
                System.out.println("Невірний номер місяця. Будь ласка, введіть число від 1 до 12.");
            }

            System.out.print("Бажаєте продовжити (Так або Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }
