import java.io.*;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла .txt для обработки данных (имя без расширения): ");
        String nm = in.nextLine() + ".txt";
        String s;
        int i = 0;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(nm)))
        {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                i++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }

        writeNewText(nm, i);
    }
    public static void writeNewText (String fileName, int j){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Внесите построчно новые данные ***");
        try (FileWriter fw = new FileWriter(fileName))
        {
            String str1;
            do {
                System.out.print(": ");
                str1 = br.readLine();
                if (--j > 0) {
                    str1 = str1 + "\r\n";
                }
                fw.write(str1);
            } while (j > 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}