public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {  // Outer loop for rows
            // Printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");  // Print space
            }
            // Printing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");  // Print number with space
            }
            System.out.println(); // Move to the next line
        }
    }
}
