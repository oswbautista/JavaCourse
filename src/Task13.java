import java.util.Scanner;

public class Task13 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s1 = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String s2 = in.nextLine();

        if (s1.length() > s2.length())
            System.out.println("Строка с наибольшей длиной: " + s1);
        else if (s2.length() > s1.length())
            System.out.println("Строка с наибольшей длиной: " + s2);
        else
            System.out.println("Введенные строки имеют одинаковуюю длину.");
    }
}