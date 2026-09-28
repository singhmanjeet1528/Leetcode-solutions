import java.util.Scanner;

public class NumberReverse {
    public static void numberReverse(int num) {
        int reverse = 0;
        while(num!=0) {
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Reverse: ");
        int number = sc.nextInt();
        numberReverse(number);
    }
}
