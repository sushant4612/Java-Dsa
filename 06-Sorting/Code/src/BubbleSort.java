import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
