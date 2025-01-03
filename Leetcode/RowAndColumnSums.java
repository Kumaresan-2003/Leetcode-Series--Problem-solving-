public static void findRowAndColumnSums(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix.length;
    
    int[] rowSums = new int[rows];
    int[] colSums = new int[cols];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            rowSums[i] += matrix[i][j];  // Add element to row sum
            colSums[j] += matrix[i][j];  // Add element to column sum
        }
    }
    
    System.out.println("Row Sums:");
    for (int i = 0; i < rows; i++) {
        System.out.println("Row " + i + ": " + rowSums[i]);
    }
    
    System.out.println("\nColumn Sums:");
    for (int i = 0; i < cols; i++) {
        System.out.println("Column " + i + ": " + colSums[i]);
    }
}
