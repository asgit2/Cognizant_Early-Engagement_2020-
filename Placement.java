// SRV college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

// Note : If any input is negative, the output should be "Input is Invalid".  If all department has equal number of placements, the output should be "None of the department has got the highest placement".

import java.util.*;
public class Placement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE: ");
        int cse = sc.nextInt();
        System.out.print("Enter the no of students placed in ECE: ");
        int ece = sc.nextInt();
        System.out.print("Enter the no of students placed in MECH: ");
        int mech = sc.nextInt();
        
        if(cse == ece && ece ==mech ){
            System.out.println("None of the department has got the highest placement");
            return;
        }
        
        if(cse < 0 || ece < 0 || mech < 0){
            System.out.println("Input is Invalid");
            return;
        }
        
        System.out.println("Highest placement");
        if(cse >=ece && cse >=mech){
            
            if(cse == ece){
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else if(cse == mech){
                System.out.println("CSE");
                System.out.println("MECH");
            }
            else{
                System.out.println("CSE");    
            }
            
        }
        else if(ece >=cse && ece >=mech){
            if(ece == cse){
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else if(ece == mech){
                System.out.println("ECE");
                System.out.println("MECH");
            }
            else{
                System.out.println("ECE");
            }
            
        }
        else if(mech >=cse && mech >=ece){
            if(mech == cse){
                System.out.println("CSE");
                System.out.println("MECH");
            }
            else if(mech == ece){
                System.out.println("ECE");
                System.out.println("MECH");
            }
            else{
                System.out.println("MECH");
            }
            
        }
        
    }
}