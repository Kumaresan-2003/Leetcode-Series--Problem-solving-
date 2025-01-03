public class SwapConsecutiveIntegers {
    public static void swapConsecutive(int[] array) {
        int n = array.length;
        
        // Iterate over the array, swapping pairs of elements
        for (int i = 0; i < n - 1; i += 2) {
            // Swap elements at index i and i+1
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Input array
        swapConsecutive(array);

        // Print the result
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
