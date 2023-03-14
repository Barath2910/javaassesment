public class PrintPattern {
    public static void main(String[] args) {
        int rows = 5; // Change this to adjust the number of rows
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
