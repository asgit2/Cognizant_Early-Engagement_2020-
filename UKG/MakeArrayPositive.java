/* Given an array arr of n integers, make the array positive with the following operation: In one
operation, select integers / (0 ≤ i < n) and x (-1018 ≤ x≤ 1018) and change arr[i] to x.
An array is positive when the sum of each subarray of length greater than 1 is non-negative. More formally, 
after the operations, 

Determine the minimum number of operations required to make the array positive.
  */

import java.util.*;

public class MakeArrayPositive {
    
    public static int getMinOperation(List<Integer> arr) {
        int n = arr.size();
        long[] prefixSum = new long[n];
        prefixSum[0] = arr.get(0);
        
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr.get(i);
        }
        
        int operations = 0;
        long minPrefixSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] < 0) {
                long diff = -prefixSum[i];
                arr.set(i, arr.get(i) + (int) diff);
                operations++;
                
                for (int j = i; j < n; j++) {
                    prefixSum[j] += diff;
                }
            }
        }
        
        return operations;
    }
    
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-3, -2, -1, 4, 5);
        System.out.println(getMinOperation(new ArrayList<>(arr))); // Example test case
    }
}
