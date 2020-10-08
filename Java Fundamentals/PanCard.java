// Validate PAN

// Write a program to check  the  PAN card no is valid or not. Generally a PAN no is a mix of both numbers and alphabets.
// It should have exactly 10 characters, in which, the first 5 characters should be upper case, the next 4 should be numbers, 
//and last one should be an upper case character. If the PAN no doesn't match the pattern print "Invalid PAN no".

// Sample Input 1:
// Enter the PAN no:
// ASDFG7896K

// Sample Output 1:

// Valid PAN no


import java.util.regex.*; 
import java.util.*;
  
class PanCard { 
  
    public static boolean isValidPanCardNo( 
        String panCardNo) 
    { 

        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}"; 

        Pattern p = Pattern.compile(regex); 
        if (panCardNo == null) { 
            return false; 
        } 
        Matcher m = p.matcher(panCardNo); 
        return m.matches(); 
    } 

public static void main(String args[]) 
    { 
  
        // Test Case 1: 
        //String str1 = "BNZAA2318J";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        String str1= sc.nextLine();
        if(!isValidPanCardNo(str1)){
            System.out.println("Invalid PAN no");
        }
        else{
            System.out.println("Valid PAN no");
        }
        //System.out.println(isValidPanCardNo(str1)); 
  
        
    } 
} 