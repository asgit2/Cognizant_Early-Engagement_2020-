// List of prime numbers
// To speed up his composition of generating unpredictable rhythms, A.R.Rahman wants the list of prime numbers available in a range of numbers.Can you help him out?
// Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
// Note
//     Input 1 should be lesser than Input 2. Both the inputs should be positive. 
//     Range must always be greater than zero.
//     If any of the condition mentioned above fails, then display "Provide valid input"
//     Use a minimum of one for loop and one while loop


import java.util.*;
public class PrimeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        int n = sc.nextInt();
        int count;
        
        if(i>n || i<=0 || n<=0 || i==n){
            System.out.println("Provide valid input");
            return;
        }
        
        for(int j=i;j<=n;j++)
	{
	count=0;
	for(int k=1;k<=j;k++)
	{
	   if(j%k==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(j+"  ");     
	}
	}
        
    
}