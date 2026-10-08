class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums) {
            int digitCount = digits(num);
            if(digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    static int digits(int num) {
        return (int) Math.log10(num) +1;
    }
}
