/*
Consider an array arr of length n. The the cost of the array is defined as the sum of the number of distinct elements over all prefixes of the array. For example, the cost of [1, 2, 1] is equal to distinct elements in [1] + distinct elements in [1, 2] +
distinct elements in [1, 2, 1] = 1 + 2 + 2 = 5.
Find the minimum cost among all possible permutations of arr.
Note: A permutation is a rearrangement of elements of an array into a new array. For example, there are 24 permutations of array [1, 2, 3, 41. Some of them are [2, 1, 4, 3], [4, 1, 2, 3] and [1, 4, 2, 3].
Example
n = 5
arr = [2,2,3, 1,11
Consider the permutation [2, 2, 1, 1, 3]
• The numbers of distinct elements in prefix [2], [2,2], [2,2,11, [2,2,1,1] and [2,2,1,1,3] are 1, 1, 2, 2, and 3 respectively.
• The cost of [2,2,1,1,3] = 1+1+2+2+3 = 9.

There are multiple permutations to arrive at a cost of 9, but 9 is the minimum cost among all permutations. Return 9.
Function Description
Complete the function getMinimumCost in the editor below.
getMinimumCost has the following parameter:
int arr[n]: the array to analyze
Returns
long int: the minimum cost among all possible permutations
*/

import java.util.*;

public class MinimumCostArray {
    public static long getMinimumCost(List<Integer> arr) {
        // Step 1: Count frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort elements by frequency (descending), then by value (ascending)
        List<Integer> sortedElements = new ArrayList<>(freqMap.keySet());
        sortedElements.sort((a, b) -> {
            int freqCompare = Integer.compare(freqMap.get(b), freqMap.get(a));
            return (freqCompare != 0) ? freqCompare : Integer.compare(a, b);
        });

        // Step 3: Construct the optimal permutation
        List<Integer> permutedArr = new ArrayList<>();
        for (int num : sortedElements) {
            for (int i = 0; i < freqMap.get(num); i++) {
                permutedArr.add(num);
            }
        }

        // Step 4: Calculate the cost
        Set<Integer> seen = new HashSet<>();
        long cost = 0;
        for (int num : permutedArr) {
            seen.add(num);
            cost += seen.size();
        }

        return cost;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 2, 3, 1, 1);
        System.out.println(getMinimumCost(arr)); // Output: 9
    }
}

/*
Approach:
The goal is to minimize the sum of distinct elements over all prefixes.
To achieve this, we should arrange the elements in a way that minimizes the introduction of new distinct elements in prefixes.
The best way to do this is by grouping duplicate elements together so that they contribute to the prefix cost as late as possible.
Thus, we should sort elements by frequency in descending order and then place the most frequent elements first.
Implementation Steps:
1.Count the frequency of each element using a HashMap.
2.Sort the elements first by frequency (descending) and then by value (ascending) in case of a tie.
3.Compute the cost by iterating over the sorted array while keeping track of distinct elements.
  */
