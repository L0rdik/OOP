import java.io.*;
import java.util.*;


public class task1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String f = s.nextLine();

        int a;
        File file = new File(f);
        if (file.exists()) {
            System.out.print("Введіть межі [x, y]. \nx = ");
            int x = s.nextInt();
            System.out.print("y = ");
            int y = s.nextInt();
            FileWriter writer = new FileWriter(f, false);
            for (int i = 0; i < 10; i++) {
                a = new Random().nextInt(y - x + 1) + x;
                String text = String.valueOf(a);
                writer.write(text + '\n');
            }
            writer.close();
        }
        else {
            try{
                boolean created = file.createNewFile();
                if (created) {
                    System.out.print("Введіть межі [x, y]. \nx = ");
                    int x = s.nextInt();
                    System.out.print("y = ");
                    int y = s.nextInt();
                    FileWriter writer = new FileWriter(f, false);
                    for (int i = 0; i < 10; i++) {
                        a = new Random().nextInt(y - x + 1) + x;
                        String text = String.valueOf(a);
                        writer.write(text + '\n');
                    }
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Помилка! ");
            }
        }}}

