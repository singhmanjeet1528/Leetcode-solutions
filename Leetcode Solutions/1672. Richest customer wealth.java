class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] arr : accounts) {
            int sum = 0;
            for(int num : arr) {
                sum += num;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
