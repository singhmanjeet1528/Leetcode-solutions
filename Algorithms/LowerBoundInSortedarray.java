// Lower Bound ===> Smallest indext at which arr[index] >= target 

public class Main
{
    
static int lowerBound(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int index = -1; // default indext if requied index is not found

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] >= target) {
            index = mid;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return index;
}
    
    
    
    public static void main(String[] args) {
       int[] arr = {2, 6, 8, 9, 11, 12, 15};
      
       // To get the Lower bound of a target Element
       // we call a lowerBound method below
       int ans = lowerBound(arr, 8);
       System.out.println(ans);
}
}
