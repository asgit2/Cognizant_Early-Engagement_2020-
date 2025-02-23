/* THIS IS NOT THE RIGHT SOLUTION. Feel free to modify & update my code*/

/* PROBLEM STATEMENT
Beauty of arrays
You are given two arrays, X and Y, of size N each, and two integers A and B such that A ≤ B. You can perform the following operation on X and Y any number of. times (you can choose not to perform any operation).
• Select two indices / and j such That 1 ≤ i, J≤ N
• Assign X; = X; + A
• Assign Yj= Yj- B
We define the Beauty of arrays A and B as min(X,+ Y;) for all 1 ≤ i ≤ N.
Task
Determine the maximum possible Beauty you can achieve.
Function description
Complete the function solvel provided in the editor.
This function takes the following parameters and returns the required answer:
• N: Represents the size of the arrays X and Y
• A: Represents the number A
• B: Represents the number B
• X: Represents the array X
• Y: Represents the array Y
Input format for custom testing
Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide boilerplate code.
• The first line contains N, denoting the size of arrays X and Y.
• The second line contains the number A.
• The third line contains the number B
• The fourth line contains the elements separated by a space denoting the elements of array X.
• The fourth line contains the elements separated
by a space denoting the elements of array X.
• The fourth line contains the elements separated by a space denoting the elements of array Y
Output format For each test case, output the maximum possible Beauty you can achieve on a new line.

  */
// Method BeautyOfArrays need to complete 
static int BeautyOfArrays(int n, int a, int b, int[] x, int[] y) {
    int maxBeauty = Integer.MIN_VALUE;
    
    for (int i = 0; i < n; i++) {
        
        int minVal = x[i] + y[i];
        
        int minX = x[i];
        int maxY = y[i];
        
        while (minX + a <= maxY - b) {
            minX += a;
            maxY -= b;
        }
        
        
        maxBeauty = Math.max(maxBeauty, minX + maxY);
    }
    
    return maxBeauty;
}
