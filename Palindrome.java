// Number Palindrome
// George and  Tintin plays  by  telling numbers.  George says a number to Tintin.
//  Tintin should first reverse the number and check if it is same as the original.
//  If yes,  Tintin should say “Palindrome”.  If not, he should say “Not a Palindrome”.
//  If the number is negative, print “Invalid Input”.  Help Tintin by writing a program.

import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
         int r,sum=0,temp;
         temp=n;    
          while(n>0){    
           r=n%10;  
           sum=(sum*10)+r;    
           n=n/10;    
          }    
          if(temp==sum)    
           System.out.println("Palindrome");    
          else    
           System.out.println("Not a Palindrome");    
            }
}