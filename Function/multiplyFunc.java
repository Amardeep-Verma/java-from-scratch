import java.util.Scanner;

public class multiplyFunc {
    public static int mulFunc(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2 ");
        int num2 = sc.nextInt();
        System.out.println(mulFunc(num1, num2));
    }
}
