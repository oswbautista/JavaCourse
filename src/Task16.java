import java.io.*;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Для вывода на экран данных из файла .txt введите его имя (без расширения): ");
        String path = "src/" + in.nextLine() + ".txt";
        String s;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path)))
        {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}