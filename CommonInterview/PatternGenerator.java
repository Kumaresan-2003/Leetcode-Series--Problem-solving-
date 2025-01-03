public class PatternGenerator {
    
    public static void main(String[] args) {
        int n = 4; // You can change this to 4 for the first example
        printPattern(n);
    }

    public static void printPattern(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Determine the value to print
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    // Print the outermost layer
                    System.out.print(n+" ");
                } 
                else if (i == j || i + j == n - 1) {
                    // Print the diagonal values
                    //.out.print(i+" "+j+" ");
                    System.out.print(n - Math.min(i, j)+" ");
                } 
                else {
                    // Print the inner values
                    System.out.print(n - 1+" ");
                }
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}