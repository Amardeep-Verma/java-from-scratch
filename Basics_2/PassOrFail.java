import java.util.Scanner;

public class PassOrFail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        // if (marks >= 33) {
        // System.out.println("Congratulations you are pass");
        // } else {
        // System.out.println("You are fail");
        // }

        // using ternary operator
        String reportCard = marks >= 33 ? "Pass " : "Fail";
        System.out.println(reportCard);
    }
}