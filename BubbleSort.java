import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5,8,2,5,9,1,2,9,0,3};
        bubbleSort(numbers);        
    }

    public static int[] bubbleSort(int[] arr) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
