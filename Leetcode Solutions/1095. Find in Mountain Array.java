
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int ans = binarySearchOA(mountainArr, target, 0, peak);
        if(ans != -1) {
            return ans;
        } else {
            return binarySearchOA(mountainArr, target, peak + 1, mountainArr.length() - 1);
        }
    }
    static int findPeak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int binarySearchOA(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) == target) {
                return mid;
            } 
            if(isAsc) {
                 if(mountainArr.get(mid) > target) {
                  end = mid - 1;
                } else {
                  start = mid + 1;
                }
            } else {
                if(mountainArr.get(mid) > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
