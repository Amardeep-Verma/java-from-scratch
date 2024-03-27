import java.util.Scanner;

public class name {
    static void myMethod(String fName) {
        System.out.println(fName + " Carter");
    }

    static void myAge(int age) {
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fName = sc.nextLine();
        myMethod(fName);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        myAge(age);
        System.out.println("Your name is " + fName + " and your age is " + age);
        sc.close(); // Close the scanner to prevent resource leak
    }
}
