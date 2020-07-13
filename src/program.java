import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        /*
        int x=5;
        int y=6;
        //System.out.println("x=" + x + "; y=" + y);
        System.out.printf("x=%d; y=%d \n", x, y);
        */
        /*
            String name = "Tom";
            int age = 30;
            float height = 1.7f;
            System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
         */
         /*
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            System.out.printf("Your number: %d \n", num);
          */
            Scanner in = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = in.nextLine();
            System.out.print("Input age: ");
            int age = in.nextInt();
            System.out.print("Input height: ");
            float height = in.nextFloat();
            System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
    }
}
