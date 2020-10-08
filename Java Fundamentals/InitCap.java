// InitCap


// Write a program to convert the first character of each word in a sentence to uppercase.
// If the first character of each word in the given sentence is already in upper case, then print "First character of each word is already in uppercase".
// Sample Input 1: 
// Enter the String:
// Work hard to get what you like
// Sample Output 1:
// Work Hard To Get What You Like


 import java.util.*;
 public class InitCap
 {
     static void convert(String str)
     {
         int count=0;
         char []ch=str.toCharArray();
         for(int i=0;i<str.length();i++)
         {
             if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
             {
                 if(ch[i]>='a'&& ch[i]<='z')
                 {
                     ch[i]=(char)(ch[i]-'a'+'A');
                     count++;
                 }
             }
             else if(ch[i]>='A'&&ch[i]<='Z')
             ch[i]=(char)(ch[i]+'a'-'A');
         }
         if(count==0)
         System.out.println("First character of each word is already in uppercase");
         else
         {
             String st=new String(ch);
             System.out.println(st);
         }
     }
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String:");
         String str=sc.nextLine();
         convert(str);
     }
 }