import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        double x, y, z, avg, dresult;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        String val = sc.nextLine();
        x = Double.parseDouble(val);
        val = sc.nextLine();
        y = Double.parseDouble(val);
        val = sc.nextLine();
        z = Double.parseDouble(val);
        avg = (x + y + z) / 3;
        dresult = (avg - avg%2) / 2;

        System.out.println("Средное арифметическое чисел (" + x + ", " + y + ", " + z + ") = " + avg);
        System.out.println("Деление среднего арифметического на 2 без остатка = " + dresult);
        if (dresult > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}