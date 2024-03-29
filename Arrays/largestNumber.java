import java.util.*;

public class largestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        // int samllest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 23, 55, 6, 53, 86, 12 };
        System.out.println("largest value is : " + getLargest(numbers));
    }
}
