// Cumulative sum in an array

// Raghavi wants to write Java program to find the cumulative sum of the array with a given set of values.
//Input consist of integers .
//If the size of an array is zero or lesser then display the message as "Invalid Range".
// Print the output in the format which is provided in sample output .
// Assume maximum size of array is 20,
// Sample Input 1:
// Enter number of elements
// 5
// Enter the elements
// 2
// 3
// 5
// 7
// 1
// Sample Output 1:
// 2 5 10 17 18


import java.util.*;
public class CummalativeSum{

    public static void makeCumul(int[] in) {
    int[] out = new int[in.length];
    int sum = 0;
    for(int i = 0; i < in.length; i++){
        sum += in[i];
        out[i] = sum;
    }
    for( int i=0; i < in.length; i++){
           System.out.print(out[i] +" ");
        }

}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Range");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0 ;i<n;i++){
           arr[i] = sc.nextInt();
        }
        
        makeCumul(arr); 
        return;

    }

}