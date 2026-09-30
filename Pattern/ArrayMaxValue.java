public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 32,28};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
