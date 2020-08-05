import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double z = Double.parseDouble(sc.nextLine());
        double avg = (x + y + z) / 3;
        double dresult = (avg - avg%2) / 2;

        System.out.println("Средное арифметическое чисел (" + x + ", " + y + ", " + z + ") = " + avg);
        System.out.println("Деление среднего арифметического на 2 без остатка = " + dresult);
        if (dresult > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}