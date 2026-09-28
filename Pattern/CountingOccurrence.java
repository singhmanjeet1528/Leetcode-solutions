import java.util.Scanner;

public class CountingOccurrence {

    public static void countingOccurrence(int num, int target) {
        int count = 0;
        while(num!=0) {
            if(num%10==target) {
                count++;
            }
            num = num/10;
        }
        System.out.println("Target Occurred: " + count + " times");
    }

    public static void main(String[] args) {
        int n = 167574287;
        int target = 1;
        countingOccurrence(n,target);
    }

}
