import java.util.Scanner;

/**
 * This class demonstrates the reversal of an array using recursion.
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Read elements into the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reverse the array using recursion
        reverseArray(arr, 0, n - 1);

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    /**
     * Recursively reverses the given array.
     *
     * @param arr   The array to be reversed.
     * @param start The starting index of the subarray.
     * @param end   The ending index of the subarray.
     */
    private static void reverseArray(int[] arr, int start, int end) {
        // Base case: if start is less than end, swap the elements at start and end indices
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Recursively call reverseArray with updated start and end indices
            reverseArray(arr, start + 1, end - 1);
        }
    }
}
