import java.util.Scanner;
import java.util.Locale;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinalTask03 {
    public static void main(String[] args) throws ArithmeticException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите текущий курс доллара: ");
            double curr = Double.parseDouble(in.nextLine());
            System.out.print("Введите количество рублей к обмену: ");
            double qty = Double.parseDouble(in.nextLine());

            String qty1 = String.format(Locale.ROOT,"%.2f", qty);
            String curr1 = String.format(Locale.ROOT,"%f", curr);
            double result0 = round(qty/curr, 2);
            String result1 = String.format(Locale.ROOT, "%.2f", result0);
            System.out.println("Количество рублей к обмену:" + qty1);
            System.out.println("текущий курс доллара: " + curr1);
            System.out.print("Итого (в долларах): " + result1);

        } catch (NumberFormatException ex) {
            System.out.println("Неправильный курс или разделитель дробной части. " + ex);
        }
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}