import java.util.Scanner;

/**
 * Created by User on 04.08.2017.
 */
public class even {
    public static void main(String[] args) {
        System.out.print("Введите число элементов ");
        Scanner scan = new Scanner(System.in);

        int numb = scan.nextInt();
        int arr[] = new int[numb];
        array_enter(arr, numb);
        bubble_sort(arr,arr.length);
    }

    public static void array_enter(int[] arr, int i) {
        for (int i1 = 0 ; i1 < i; i1 = i1 + 1) {
            System.out.print("Введите " + i1 + "-ый элемент массива: ");
            Scanner scan = new Scanner(System.in);
            int numb = scan.nextInt();
            arr[i1] = numb;
        }
        System.out.println("Первоначальный массив :");
        for (int i1 = 0; i1 < i; i1 = i1 + 1) {
            System.out.print(arr[i1]);
        }
        System.out.println("");

    }

    public static void bubble_sort(int[] arr,int i){
        for (int j=0 ; j< arr.length-1;j = j+1){
        for (int i1 = 1; i1 < arr.length-j; i1 = i1 + 1) {
            if (arr[i1] < arr[i1 - 1]) {
                int temp = arr[i1];
                arr[i1] = arr[i1 - 1];
                arr[i1 - 1] = temp;
            }

        }
        }
            System.out.println("Конечный массив :");
            for ( int i1 = 0; i1 < i; i1 = i1 + 1) {
                System.out.print(" ",arr[i1]);
            }


    }
}