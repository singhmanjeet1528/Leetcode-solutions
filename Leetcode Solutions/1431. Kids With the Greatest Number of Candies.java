// time complexity of O(n^2) -- 1st Submission
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();

        for(int candy : candies) {
            list.add(isGreatest(candies, candy + extraCandies));
        }
        return list;
    }
    public boolean isGreatest(int[] arr, int totalCandy) {

            for(int each : arr) {
                if(totalCandy < each) {
                    return false;
                }
            }
        return true;
    }
}

// More Optimised approach with time complexity of O(n) -- 2nd Submission
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for(int candy : candies) {
            max = Math.max(max, candy);
        }
        for(int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }
}
