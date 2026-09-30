import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 43, 84, 9, 1};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swapIndices(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapIndices(int[] swap, int i, int j) {
        int temp = swap[i];
        swap[i] = swap[j];
        swap[j] = temp;
    }
}
