public class DrawImage {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle
        
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
