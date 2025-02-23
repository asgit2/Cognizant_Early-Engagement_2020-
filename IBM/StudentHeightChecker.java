/*
Students in a class are asked to stand in ascending order according to their heights for the annual class photograph. Determine the number of students not currently standing in their correct positions.
Example
height = [1, 1, 3, 3, 4, 1]
The 3 students indicated in red at indices 2, 4 and 5, are not in the right positions. The correct positions are [1, 1, 1, 3, 3, 4]. Return 3.
Function Description
Complete the function countStudents in the editor below.
countStudents has the following parameterS):
int height[n]: an array of heights in the order the students are standing
Returns:
int: the number of students not standing in the correct positions.
*/
import java.util.*;

public class StudentHeightChecker {
    public static int countStudents(List<Integer> height) {
        List<Integer> sortedHeight = new ArrayList<>(height);
        Collections.sort(sortedHeight);

        int count = 0;
        for (int i = 0; i < height.size(); i++) {
            if (!height.get(i).equals(sortedHeight.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> height = Arrays.asList(1, 1, 3, 3, 4, 1);
        System.out.println(countStudents(height));  // Output: 3
    }
}

/*
Explanation:
1.Create a copy of the original height list and sort it in ascending order.
2.Compare each student's position in the original list with the sorted list.
3.Count how many students are not in their correct positions.
This implementation has a time complexity of O(n log n) due to sorting and O(n) for comparison, making it efficient.
  */
