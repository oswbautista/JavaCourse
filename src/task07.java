import java.util.Scanner;
public class task07 {
    public static void main(String[] args) {
        String val;
        double X = 5, Y = 10, Z = 15, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        val = sc.nextLine();
        number = Double.parseDouble(val);

        if (number == X | number == Y | number == Z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}