import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3]; // syntax of array

        marks[0] = sc.nextInt();// phy
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Physics marks : " + marks[0]);
        System.out.println("Chemistry marks : " + marks[1]);
        System.out.println("Maths marks : " + marks[2]);

        System.out.println("Percentage = " + percentage + "%");
    }
}
