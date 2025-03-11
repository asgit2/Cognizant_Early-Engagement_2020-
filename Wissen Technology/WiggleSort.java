import java.util.Arrays;

public class WiggleSort {
    public static void rearrangeArray(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        
        // Step 2: Swap adjacent elements to satisfy the condition
        for (int i = 1; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 5, 6, 4};
        rearrangeArray(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}
// output : Rearranged array: [1, 3, 2, 5, 4, 7, 6]
