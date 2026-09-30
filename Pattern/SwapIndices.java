import java.util.Arrays;

public class SwapIndices {
    public static void main(String[] args) {
        int[] arr = {2, 43, 84, 9, 1};
        swapIndices(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

     static void swapIndices(int[] swap, int i, int j) {
        int temp = swap[i];
        swap[i] = swap[j];
        swap[j] = temp;
    }
}
