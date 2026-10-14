// IF THERE ARE MULTIPLE PEAK IN AN ARRAY AND YOU ARE TOLD TO RETURN INDEX OF ANY OF THE PEAK (LEETCODE 162)
// ---> THEN THIS MOUNTAIN ARRAY CODE WILL GIVE YOU THE INDEX OF THE ANY OF THE PEAK
// SO BASICALLY IT WILL WORK IN THE MULTIPLE PEAK QUESTION ALSO WHERE WE ARE TOLD TO RETURN ANY PEAK INDEX

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                /* you are at the decending part of the array
                   and arr[mid] might be the possible answer
                   so that's why look at the left and end != mid - 1; */
                end = mid;
            } else {
              /* you are in the ascending part of the array
                 and if you have checked that the next element arr[mid + 1] to mid is greater than 
                 that is is better possible answer than the arr[mid]
                 that's why start = mid + 1; and not start = mid;
              */
                start = mid + 1;
            }
        }
        return start; // or return end ---> as both will point to the peak index at last
    }
}
