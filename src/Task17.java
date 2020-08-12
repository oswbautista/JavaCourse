import java.io.*;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла .txt для сохранения данных (без расширения): ");
        String path = "src/" + in.nextLine() + ".txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");
        try (FileWriter fw = new FileWriter(path))
        {
            String str;
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}