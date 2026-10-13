public class Main
{
    static int upperBound(int[] arr, int target) {
       // smallest index where arr[index] < target
       int index = -1;
       int start = 0;
       int end = arr.length - 1;
       while(start <= end) {
           int mid = start + (end - start) / 2;
           if(target < arr[mid]) {
               index = mid; // update index only when possible answer is found
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return index;
        
    }
    
    
    
    public static void main(String[] args) {
       int[] arr = {2, 6, 8, 9, 11, 12, 15};
      
       // To get the Upper bound of a target Element
       // we call a lowerBound method below
       int ans = upperBound(arr, 15);
       System.out.println(ans);
}
}
