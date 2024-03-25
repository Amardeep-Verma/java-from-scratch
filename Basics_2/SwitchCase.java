import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        System.out.println("Enter day no");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            default:
                break;
        }
    }
}
