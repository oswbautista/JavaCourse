// Демонстрация использования операции %
public class ModDemo {
    public static void main(String args[]) {
 /*       int iresult, irem, x1, x2, y1, y2;
        double dresult, drem;
        iresult = 10 / 4;
        irem = 10 % 4;
        dresult = 10.0 / 2.4;
        drem = 10.0 % 2.4;
        x1 = 10;
        x2 = 10;
        y1 = ++x1;
        y2 = x2++;

        System.out.println("Peзyльтaт и остаток от деления 10 / 4: " +
                iresult + " " + irem);
        System.out.println("Peзyльтaт и остаток от деления 10.0 / 2.4: "
                + dresult + " " + drem);
        System.out.println(+ x1 + " " + x2 + " " + y1 + " " + y2);
    }
 */
 /*       int x = 5, y = 7, z = 10;
        System.out.println(x + " " + y);
        x = x ^ y; // стало 2
        System.out.println(x + " " + y);
        y = x ^ y; // стало 5
        System.out.println(x  + " " + y);
        x = x ^ y; //стало 7
        System.out.println(x + " " + y);
*/
/*        int month = 3; // март
        String season; // время года

        if(month == 1 || month == 2 || month == 12)
            season = "Зимушка-зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Вы с какой планеты?";

        System.out.println("Мартовские песни коты поют, когда на дворе " + season);
*/
/*        int counter = 10;
        do {
            //mInfoTextView.append("Осталось " + counter + " сек.\n");
            System.out.print("Осталось " + counter + " сек.\n");
        } while (--counter > 0);
*/
        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
    }
}