import java.util.*;

public class sumFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); // here a and b are arguments or actual parameters
    }

    public static void calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }
}
