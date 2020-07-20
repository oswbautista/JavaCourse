import java.util.Scanner;
public class task04 {
        public static void main(String[] args) {
            int binNum;
            String bin;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите двоичное число: ");
            bin = sc.nextLine();
            binNum = Integer.parseInt(bin, 2);

            System.out.println(bin + "(двоичное) = " + binNum + "(десятичное)");
        }
    }
