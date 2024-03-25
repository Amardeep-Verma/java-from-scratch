import java.util.Scanner;

public class questions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number == 0) {
            System.out.println(number + " is neutral");
        } else {
            System.out.println(number + " is negative");
        }
    }
}
