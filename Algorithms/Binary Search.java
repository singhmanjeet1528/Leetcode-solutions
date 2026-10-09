public class Main {
    public static void main(String[] args) {

       int[] arr = {-16, -12, -4, 0, 4, 7, 23, 45, 78};
       int target = 7;
       int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {
        
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        
      return -1;
    }
  
 }



