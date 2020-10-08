// Fuel Consumption Calculator

// Write a program to calculate the fuel consumption of your vehicle.
// The program should ask the user to enter the quantity of petrol to fill up the tank and the distance covered till the tank goes dry.
// Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
// Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display "<respective_input> is an Invalid Input".
// [Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]

// The result should be with two decimal place.
// To get two decimal place refer the below-mentioned print statement :
// float cost=670.23;
// System.out.printf("You need a sum of Rs.%.2f to cover the trip",cost);


import java.util.Scanner;

public class Fuelcon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of liters to fill the tank");
        int liters = sc.nextInt();
        
        if(liters <=0){
            System.out.println(liters+ " is an Invalid Input");
            return;
        }
        System.out.println("Enter the distance covered");
        int dist = sc.nextInt();
        
        
        if(dist <0 || dist ==0 ){
            System.out.println(dist+ " is an Invalid Input");
            return;
        }
        
        double fuelc = ((double)liters/(double)dist)*100;
        
        double distinkm = (dist * 0.6214);
        
        double g = liters* 0.2642;
        
        double milespergal = (distinkm/g);
        
        System.out.println("Liters/100KM");
        System.out.println(String.format("%.2f", fuelc));
        
        System.out.println("Miles/gallons");
        System.out.println(String.format("%.2f" ,milespergal));
    }
    
}