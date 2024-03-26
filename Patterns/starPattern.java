public class starPattern {
    public static void main(String[] args) {
        // for (int i = 1; i <= 4; i++) {
        // for (int star = 1; star <= i; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted star pattern
        int n = 7;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
