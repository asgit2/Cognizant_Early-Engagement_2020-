// Find and Replace

// Polymens a famous news editor, has daily responsibility of deciding which news stories are printed in the paper. Before that he wants to verify all the words are spelled in a right way. Incase of any misspelled word found, he has to replace it throughout the document without any fail. Polymens needs an application to make his find and replace job easier. 
// Implement the given scenario and code accordingly. Refer the samples for read and display the data.
// [Search and replace should be case sensitive.  Input can contain words separated by space and full stop.]
// Sample Input 1:
// Enter the string:
// Have a good day
// Enter the word to be searched:
// good
// Enter the word to be replaced:
// nice
// Sample Output 1:
// Have a nice day


import java.util.*;

public class ReplaceWord{ 

static String censor(String text, String word, String repword){ 

	String[] word_list = text.split("\\s+"); 

	String result = ""; 

	String stars = repword; 
	// for (int i = 0; i < word.length(); i++) 
	// 	stars += '*'; 

	int index = 0; 
	for (String i : word_list) 
	{ 
		if (i.compareTo(word) == 0)  
			word_list[index] = stars; 
		index++; 
	}


	for (String i : word_list) 
		result += i + ' '; 

	return result; 
} 

    static void SearchStringEmp(String text, String word, String re) {
    	
    		String strOrig = text;
    		int intIndex = strOrig.indexOf(word);
    		if(intIndex == - 1) {
    			System.out.println("The word nice not found");
                return;
    		}
            else{
                System.out.println(censor(text, word, re)); 
            }
    	}
    

    public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String extract = sc.nextLine(); 
            System.out.println("Enter the word to be searched:");
            String cen = sc.nextLine(); 
            System.out.println("Enter the word to be replaced:");
            String re = sc.nextLine();
            SearchStringEmp(extract,cen,re);
            
        } 
}

