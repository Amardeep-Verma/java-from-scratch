import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n ){
        int sumOfDigits  = 0;
        while(n > 0){
            int lastDigits = n % 10 ;
            sumOfDigits += lastDigits
        }
    }
}
