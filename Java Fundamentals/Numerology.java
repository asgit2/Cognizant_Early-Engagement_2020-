// Numerology


// Write a program to find the numerological value for a given name.
// Note: Store the numerological number and the corresponding character in a 2-D array(2*26). Always the given  name should be in capital case ,else the name is not valid. Check for the valid name,if the name is invalid print the message "Invalid name".There should not be any space in the name provided.
// For example:
// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
// 1 2 3 4 5 8 3 5 1 1 2 3 4 5 7 8 1 2 3 4 6 6 6 5 1 7

// Sample Input 1:
// Enter your name:
// SUDHA

// Sample Output 1:

// Your numerology no is:19

import java.util.*;
import java.lang.*;
import java.io.*;

public class Numerology
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner (System.in);
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        hmap.put('A',1);
        hmap.put('B',2);
        hmap.put('C',3);
        hmap.put('D',4);
        hmap.put('E',5);
        hmap.put('F',8);
        hmap.put('G',3);
        hmap.put('H',5);
        hmap.put('I',1);
        hmap.put('J',1);
        hmap.put('K',2);
        hmap.put('L',3);
        hmap.put('M',4);
        hmap.put('N',5);
        hmap.put('O',7);
        hmap.put('P',8);
        hmap.put('Q',1);
        hmap.put('R',2);
        hmap.put('S',3);
        hmap.put('T',4);
        hmap.put('U',6);
        hmap.put('V',6);
        hmap.put('W',6);
        hmap.put('X',5);
        hmap.put('Y',1);
        hmap.put('Z',7);
        
        System.out.println("Enter your name:");
        String str = sc.next();
        
         if(isStringUpperCase(str) == false)
         {
           System.out.println("Invalid name");
            System.exit(0);
         }
        
         
        //str=str.toUpperCase();
        long sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            sum+=hmap.get(ch);
        }
        System.out.println("Your numerology no is:"+sum);
    }

    private static boolean isStringUpperCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        
        return true;
    }
    
}