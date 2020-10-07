// Write a program to print all the unique characters in a given sentence. 
// The sentence should have only alphabets .
// If the sentence is not valid display the message "Invalid Sentence".
// If unique characters are not found print "No unique characters".
// If unique characters are found print those characters as shown in sample output.
// Sample Input 1:
// Enter the sentence:
// java is an object oriented programming language
// Sample Output 1:
// Unique characters:
// v
// s
// b
// c
// d
// p
// l
// u

import java.util.Arrays; 
import java.util.*;

public class UniqueChar { 
	static final int MAX_CHAR = 256; 
	static void printDistinct(String str) 
	{ 
		int n = str.length(); 	
		int[] count = new int[MAX_CHAR]; 
		int[] index = new int[MAX_CHAR]; 
		for (int i = 0; i < MAX_CHAR; i++) 
		{ 
			count[i] = 0; 
			index[i] = n;  
		} 
		for (int i = 0; i < n; i++) 
		{ 
			char x = str.charAt(i); 
			++count[x]; 
			if (count[x] == 1 && x !=' ') 
				index[x] = i; 
			if (count[x] == 2) 
				index[x] = n; 
		} 
		Arrays.sort(index); 
        System.out.println("Unique characters:");
        for (int i = 0; i < MAX_CHAR && index[i] != n; i++){
                
                System.out.println(str.charAt(index[i]));
        }
        
	} 
    // public static boolean isuniqueCharacters(String str) { 
    //     for (int i = 0; i < str.length(); i++) 
    //         for (int j = i + 1; j < str.length(); j++) 
    //             if (str.charAt(i) == str.charAt(j)) 
    //                 return false; 
  
    //     return true; 
    // } 
	
	public static void main(String args[]) 
	{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
		String str = sc.nextLine(); 

        char ch[] = str.toCharArray();
    
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='0') {
                System.out.println("Invalid Sentence");
                return;
            }
        }
        // boolean isuniq = isuniqueCharacters(str);
        // if(isuniq == false){
        //     System.out.println("No unique characters");
        //     return;
        // }
        // if(isuniq == true){
        //     printDistinct(str);
                
        // }

        printDistinct(str);
	} 
} 
