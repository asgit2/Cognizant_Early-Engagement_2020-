// Bill Generation


// Tom went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

//     Rs.100/pizza
//     Rs.20/puffs
//     Rs.10/cooldrink

// Generate a bill for What Tom has bought.

import java.util.*;

public class SnacksDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
        int piz = sc.nextInt();
        System.out.print("Enter the no of puffs bought:");
        int puffs = sc.nextInt();
        System.out.print("Enter the no of cool drinks bought:");
        int cd = sc.nextInt();
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas: "+ piz);
        System.out.println("No of puffs: "+ puffs);
        System.out.println("No of cooldrinks: "+ cd);
        int tp = (piz*100)+(puffs*20)+(cd*10);
        System.out.println("Total price="+ tp);
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}