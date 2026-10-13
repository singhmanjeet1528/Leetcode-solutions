class Solution {
    public int[] searchRange(int[] nums, int target) {
    return new int[] {firstOrLastOccurrence(nums, target, true), firstOrLastOccurrence(nums, target, false)};
        
    }
    public int firstOrLastOccurrence(int[] arr, int target, boolean isFirstIndexSearch) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
           while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                index = mid;
                if(isFirstIndexSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
