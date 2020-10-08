// Search a Course
// IIHT institution is offering a variety of courses to students.
// Students have a facility to check whether a particular course is available in the institution.
// Write a program to help the institution accomplish this task.
// If the number is less than or equal to zero display "Invalid Range".
// Assume maximum number of courses is 20.
 
// Sample Input 1:
// Enter no of course:
// 5
// Enter course names:
// Java
// Oracle
// C++
// Mysql
// Dotnet
// Enter the course to be searched:
// C++

// Sample Output 1:
// C++ course is available

import java.util.*;
import java.util.Arrays;
public class Course {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of course:");
        int n= sc.nextInt();

        if(n<=0){
            System.out.println("Invalid Range");
            return;
        }
        else if(n>=1 && n<=20){
            System.out.println("Enter course names:");
            String[] course = new String[n+1];
            for(int i=0; i<n+1 ; i++){
                course[i] = sc.nextLine();
                
            }
            System.out.println("Enter the course to be searched:");
            String toFind = sc.nextLine();

            boolean found = Arrays.stream(course).anyMatch(t -> t.equals(toFind));


            if(found)
                System.out.println(toFind + " course is available");
            else
                System.out.println(toFind + " course is not available");
        }
        
    }
}
