// ****AMAZON INTERVIEW QUESTIION**** 
/**Q. Find position of an element in a sorted array
       of infinite numbers?

       Note:- Here infinite array just means that you cannot take length of the array i.e arr.length
              That's why we traverse in chunks(or boxes) until we reach the full size of the array (box * 2)
              total time complexity = 2 * O(logN)
              when we divide the array untill single ---> O(logN)
              when we multiply the array by 2 untill N ---> O(logN) vice-versa will also remain true.
       
    Link--> https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
**/
public class Main {
    public static void main(String[] args) {
      int[] arr = {2, 8, 10, 13, 17, 19, 25, 56, 67, 88, 92, 95, 99};
      int target = 11;
      int ans = findAnswer(arr, target);
      System.out.println(ans);
}
 static int findAnswer(int[] arr, int target) {
     //intialization of box
     int start = 0;
     int end = 1;
     // updating start and end to get the new box
     while(arr[end] < target) {
         int temp = end; // storing end in the temp before updating end
         // doubling the previous box(newEnd = previousEnd + (sizeOfPreviousBox + 1) );
         end = end + (end - start + 1) * 2;
         start = temp + 1;
     }
     return binarySearch(arr, target, start, end); // Apply binary Search only when the desired box is found
 }
 static int binarySearch(int[] arr, int target, int start, int end) {
     while(start <= end) {
         int mid = start + (end - start) / 2;
         if(arr[mid] == target) {
             return mid;
         } else if(arr[mid] < target) {
             start = mid + 1;
         } else {
             end = mid - 1;
         }
     }
     return -1;
 }
}
