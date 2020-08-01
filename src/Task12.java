import java.util.Scanner;

public class Task12 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s1 = in.nextLine();

        System.out.println("Вы ввели строку: " + s1);
        String s2 = s1.replaceAll("\\s","");
        System.out.println("Строка без пробелов: " + s2);
    }
}