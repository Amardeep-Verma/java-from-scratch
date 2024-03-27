import java.util.Scanner;

public class prac {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = myMethod(sc.nextInt(), sc.nextInt());
        System.out.println("Sum is : " + z);
    }
}
