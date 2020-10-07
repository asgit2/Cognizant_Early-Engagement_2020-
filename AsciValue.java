// Display Characters


// Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application. 

// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.

import java.util.*;
public class AsciValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        
        System.out.println(c1+"-"+(char)c1);
        System.out.println(c2+"-"+(char)c2);
        System.out.println(c3+"-"+(char)c3);
        System.out.println(c4+"-"+(char)c4);
        
    }
}