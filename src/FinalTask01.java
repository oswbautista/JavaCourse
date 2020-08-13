import java.util.Scanner;

public class FinalTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое двоичное число: ");
        String bin = sc.nextLine();
        bin = bin.trim();
        int lb = bin.length();
        char[] bb = bin.toCharArray();
        int[] numArr = new int[lb];
        int maxDigit = 0;
        try {
                for (int i = 0; i < lb; i++) {
                   numArr[i] = Integer.parseInt(String.valueOf(bb[i]));
                    if (numArr[i] > maxDigit) {
                    maxDigit = numArr[i];
                     }
                 }

                if (maxDigit < 2) {
                    int binNum = 0;
                    int aa = 1;
                    for (int i = 0; i < lb; i++) {
                        for (int j = 0; j < lb - i - 1; j++) {
                            aa = aa * 2;
                        }
                    binNum = binNum + numArr[i] * aa;
                    aa = 1;
                }

                System.out.println(bin + "(двоичное) = " + binNum + "(десятичное)");
                } else System.out.println("Введенное число не из двоичной системы счисления");
            } catch (NumberFormatException exc) {
            System.out.println("Неразрешенный знак в целом двоичном числе: " + exc.getMessage());
        }
    }
}