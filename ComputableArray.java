// Array Compatiblilty

// Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i elements.If the array size is zero or lesser then display the message "Invalid array size".Write a Java program to find whether 2 arrays are compatible or not.If the arrays are compatible display the message as "Arrays are Compatible" ,if not then display the message as "Arrays are Not Compatible".
// Sample Input 1:
// Enter the size for First array:
// 5
// Enter the elements for First array:
// 5 14 17 19 15
// Enter the size for Second array:
// 5
// Enter the elements for Second array:
// 2 5 9 15 7
// Sample Output 1:
// Arrays are Compatible

import java.util.*;

class CompaibleArrays {
    public static void main(String []args){
        int n1=0;
        int n2=0;
        int flag=0;
        int []a1 = new int[20];
        int []a2 = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for First array:");
        n1 = sc.nextInt();
        if(n1<1){
            System.out.println("Invalid array size");
            return;
        }
        else{
            System.out.println("Enter the elements for First array:");
            for(int i=0 ; i<n1 ; i++){
                a1[i] = sc.nextInt();
            }

            System.out.println("Enter the size for Second array:");
            n2 = sc.nextInt();
            if(n2<1){
                System.out.println("Invalid array size");
                return;
            }
            else{
                System.out.println("Enter the elements for Second array:");
                for(int j=0 ; j<n2 ; j++){
                    a2[j] = sc.nextInt();
                }
            }
        }
        if(n1 < n2){
                System.out.println("Arrays are Not Compatible");
                return;
            }
        if(n1==n2){
           
            for(int x=0 ; x<n1 ; x++){
                if(a1[x]>=a2[x]){
                    flag++;
                }
            }
            if(flag==n1){
                System.out.println("Arrays are Compatible");
            }
            else{
                System.out.println("Arrays are Not Compatible");
            }
        }

    }
} 