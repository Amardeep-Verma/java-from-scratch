import java.util.*;

public class function_01 {
    public static void printhelloworld() {
        System.out.println("Hello world!");
    }

    public static void calculateSum(int a, int b) {

        int sum = a + b;
        System.out.println("Sum is : " + sum);

    }

    public static void main(String[] args) {
        printhelloworld(); // function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);

    }
}
