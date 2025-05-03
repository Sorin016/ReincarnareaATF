package Exercitii;

public class BubbleSortAsc {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 32,331,22,2,5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int n : arr) System.out.print(n + " ");
    }

}

