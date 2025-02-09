/*
The set s contains of the lcm of each pair of adjacent elements. However, adjacent elements cannot wrap around the end of the array arr,
Find the largest element in set S. Arays contain position integer
*/



import java.util.*;

public class LargestAdjacentLCM {
    public static int largestAdjacentLCM(int n, List<Integer> arr) {
        if (n < 2) return 0; // If there are fewer than 2 elements, no adjacent pairs exist

        int maxLCM = 0;
        for (int i = 0; i < n - 1; i++) {
            int lcm = lcm(arr.get(i), arr.get(i + 1));
            maxLCM = Math.max(maxLCM, lcm);
        }
        return maxLCM;
    }

    // Helper function to compute GCD (Greatest Common Divisor)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute LCM using GCD
    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b; // Prevents integer overflow
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6, 10, 15, 20);
        int result = largestAdjacentLCM(arr.size(), arr);
        System.out.println("Largest Adjacent LCM: " + result); // Expected output: 60
    }
}
