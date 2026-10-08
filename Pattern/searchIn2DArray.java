import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {12, 5, 76},
                {1, 5, 23, 13},
                {2, 8, 83}
        };
        int target = 23;
        int[] ans = searchIn2DArray(arr2D, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2DArray(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

}
