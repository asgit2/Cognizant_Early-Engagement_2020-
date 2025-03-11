// output : Pivot Index: 3

public class PivotIndex {
    public static void main(String[] args) {
        Long[] arr = {1L, 7L, 3L, 6L, 5L, 6L}; // Example array
        int pivot = findPivotIndex(arr);
        System.out.println("Pivot Index: " + pivot);
    }

    private static int findPivotIndex(Long[] nums) {
        long totalSum = 0;
        long leftSum = 0;

        // Calculate the total sum of the array
        for (Long num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Check if left sum equals right sum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            // Update left sum
            leftSum += nums[i];
        }

        return -1; // Return -1 if no pivot index is found
    }
}
