import java.util.Scanner;

public class Task10 {
    public static void main (String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        b = in.nextInt();

        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Введите элемент матрицы[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println();
        System.out.println("Первая строка матрицы * 3:");
        for (int j = 0; j < b; j++) {
            System.out.print(3 * arr[1][j] + "\t");
            }
         System.out.println();
        }
    }