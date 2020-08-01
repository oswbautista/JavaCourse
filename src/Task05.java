import java.util.Locale;
import java.util.Scanner;
    public class Task05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите любое число: ");
            String val = sc.nextLine();
            double getVal = Double.parseDouble(val);
            int i = 1;

            System.out.printf(Locale.ROOT,"Таблица умножения числа %f %n", getVal);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x  %d = %f %n", getVal, i, getVal * i++);
            System.out.printf(Locale.ROOT,"%f x %d = %f %n", getVal, i, getVal * i);
        }
    }