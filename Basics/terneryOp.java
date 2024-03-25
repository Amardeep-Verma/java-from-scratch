package Basics;

public class terneryOp {
    public static void main(String args[]) {
        int number = 3;

        // ternery operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
