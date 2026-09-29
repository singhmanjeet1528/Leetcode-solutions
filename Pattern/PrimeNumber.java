import java.lang.Math;

public class PrimeNumber {
    static boolean isPrime(int num) {
        int k = (int) Math.sqrt(num);
        if(num<=1) {
            return false;
        }
        for (int i = 2; i <=k ; i++) {
            if(num%i==0) {
                return false;
            }
        }
      return true;
    }
    public static void main(String[] args) {
        int n = 20;
        boolean ans = isPrime(n);
        if(ans) {
            System.out.println("Prime Number...");
        } else{
            System.out.println("Not a Prime Number...");
        }
    }
}
