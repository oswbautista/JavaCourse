import java.util.Scanner;
public class Task04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите двоичное число: ");
            String bin = sc.nextLine();
            int binNum = Integer.parseInt(bin, 2);

            System.out.println(bin + "(двоичное) = " + binNum + "(десятичное)");
        }
    }