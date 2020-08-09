import java.util.Scanner;

public class Task15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int a = in.nextInt();

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Введите элемент матрицы[" + i + "]:");
            arr[i] = in.nextInt();
        }

        bubbleSort(arr);
        for (int j = 0; j < a; j++){
            System.out.println(arr[j]);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}