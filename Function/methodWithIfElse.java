import java.util.Scanner;

public class methodWithIfElse {
    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("You are an adult. You can vote.");
        } else {
            System.out.println("You are too young. You can't vote yet.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        checkAge(age); // Call the checkAge method with the entered age
        sc.close(); // Close the scanner to prevent resource leak
    }
}
