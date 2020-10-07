// William planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by  3 or 5 or 7.
// Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 

// Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.


import java.util.*;
public class Luckynum{
    
    public static int Count(int n){
    if( n==0){
        return 0;
    }
    int sa = Count(n/10);
    return sa + 1;
}

public static int Sum(int n){
    if(n==0){
        return 0;    
    }
    return n%10 + Sum(n/10);
} 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car no:");
        int n = sc.nextInt();
        if(n<= 0){
            System.out.println(n+ " is not a valid car number");
            return;
        }
       
        
        int noofdigits = Count(n);
        int sumofdigirs = Sum(n);
        if(noofdigits != 4){
            System.out.println(n+ " is not a valid car number");
            return;
        }
        else{
            if(sumofdigirs%3 == 0 || sumofdigirs%5 == 0 || sumofdigirs%7 == 0){
                System.out.println("Lucky Number");
            }
            else{
                System.out.println("Sorry its not my lucky number");
            }
        }
    }
}