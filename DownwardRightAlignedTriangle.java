public class DownwardRightAlignedTriangle {

    public static void main(String[] args) {

        int n = 4;  // Number of rows

        for (int i = n; i >= 1; i--) {

            // Print spaces first
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();  // Next line
        }
    }
}