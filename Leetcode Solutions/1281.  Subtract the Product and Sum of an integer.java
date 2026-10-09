class Solution {
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    } 

    static int product(int num) {
        int mul = 1;
        while(num>0) {
            mul = mul * (num % 10);
            num = num / 10;
        }
        return mul;
    }

    static int sum(int num) {
        int sum = 0;
        while(num>0) {
           sum = sum + (num % 10);
           num = num/10;
        }
        return sum;
    }
}
