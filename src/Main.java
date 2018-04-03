import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 5, 4, 3, 2, 4, -9};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
            System.out.println();
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }

}


