/* There are n processes to be executed, and the ith process has a size of processSizeli], where 1 ≤ i ≤ n. Also, there are m processors of different size capacity. The capacity of the th processor is capacityli] (1 ≤ i ≤.m). A processor can process a task of size less than or equal to its capacity in 1 second, but it cannot execute processes whose size is greater than its capacity.
A processor can execute multiple processes one after the other, but needs to pause for 1 second after completing its current one. Multiple processors can work on different processes simultaneously.

Find the minimum time to execute all the processes or return -1 if there is no way to execute all the processes.
Example
It is given that n. = 3, processSize = [2, 5,
3], m = 3 and capacity = [6, 2, 4].
The optimal way to assign processes is to give the first processor the second process, the second processor the first process, and the third processor the third process. All of them complete their processes in 1 second.
Therefore, the minimum time required is 1 second.
*/

import java.util.*;

public class ProcessAllocation {
    public static int getMinimumTime(List<Integer> processSize, List<Integer> capacity) {
        // Sort process sizes and processor capacities in descending order
        Collections.sort(processSize, Collections.reverseOrder());
        Collections.sort(capacity, Collections.reverseOrder());

        // If the largest process cannot be handled by any processor, return -1
        if (processSize.get(0) > capacity.get(0)) {
            return -1;
        }

        // Min heap to track when each processor is free
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Assign processes to processors greedily
        int time = 0;
        for (int i = 0; i < processSize.size(); ) {
            int assigned = 0;
            for (int j = 0; j < capacity.size() && i < processSize.size(); j++) {
                if (capacity.get(j) >= processSize.get(i)) {
                    assigned++;
                    i++;
                }
            }
            time++;  // One second to execute the batch
            if (i < processSize.size()) {
                time++;  // Idle second before next batch
            }
        }

        return time;
    }

    public static void main(String[] args) {
        List<Integer> processSize = Arrays.asList(2, 5, 3);
        List<Integer> capacity = Arrays.asList(6, 2, 4);
        System.out.println(getMinimumTime(processSize, capacity));  // Output: 1
    }
}
