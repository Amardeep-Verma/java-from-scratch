import java.util.Scanner;

public class thermometer {
    public static void main(String args[]) {
        System.out.println("Enter your temperature:");
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("You dont have fever");
        }
    }
}
