// Factors of a Number
// Betsy  teaches her daughter  to find the factors of a given number.  When she provides a number to her daughter, she should tell the factors of that number.  Help her to do this, by writing a program.

// Write a class FindFactor.java and write the main method in it.



// Sample Input 1 :
// 54
// Sample Output 1 :
// 1, 2, 3, 6, 9, 18, 27, 54

import java.util.*;
public class FindFactor {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number == 0){
        System.out.println("No Factors");
        return;
    }
    //System.out.println(number);
    if(number < 0){
      number =  Math.abs(number);
    }
    //System.out.println(number);

    
    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}