import java.util.Scanner;

public class loops {
    public static void main(String args[]) {
        // while loop
        // int counter = 0;
        // while (counter < 10) {
        // System.out.println("hello world");
        // counter++;
        // }

        // print 1 to 10 using while loop
        // int counter = 1;
        // while (counter <= 10) {
        // System.out.println(counter);
        // counter++;

        // print 1 to n using while loop
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number upto which you want to print: ");
        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        // System.out.println(counter + " ");
        // counter++;
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        // sum = sum + i;
        // i++;
        // System.out.println(sum);
        // }

        // square * pattern

        // for (int line = 1; line <= 4; line++) {
        // System.out.println("****");
        // }

        // using while loop

        // int line = 1;
        // while (line <= 4) {
        // System.out.println("****");
        // line++;
        // }

        // reverse a number

        // int n = 10293;
        // while (n > 0) {
        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10;
        // }

        // do while loop
        // int counter = 1;
        // do {
        // System.out.println("Hello world");
        // counter++;

        // } while (counter <= 10);

        // break statement -- exit loop
        // for (int i = 1; i <= 5; i++) {
        // if (i == 4) {
        // break;
        // }
        // System.out.println(i);
        // }

        // keep entering a number till user enters a multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do {

        // System.out.print("Enter your number : 2");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // System.out.println("Thanks");
        // break;
        // }
        // System.out.println(n);
        // } while (true);

        // continue statement -- > to skip an iteration
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // display all number entered by user except multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was : " + n);
        } while (true);
    }
}
