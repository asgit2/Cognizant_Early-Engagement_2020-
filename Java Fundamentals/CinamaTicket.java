// In a multiplex theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the king class ticket is Rs.75 and queen class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.
// Hint: k-king and q-queen and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display "Minimum of 5 and Maximum of 40 Tickets".  If circle is given a value other than 'k' or 'q' the output should be "Invalid Input".



import java.util.Scanner;
import java.text.DecimalFormat;

public class CinemaTicket {
    public static void main(String[] args) {
        int no, refe, total = 0;
        double cost, sum, sum1, sum2, sum3;
        String ref, co, circle;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of ticket: ");
        no = s.nextInt();
        
        if (no < 5 || no > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            return;
        }
        
        System.out.print("Do you want refreshment: ");
        ref = s.next();
        System.out.print("Do you have coupon code: ");
        co = s.next();
        System.out.print("Enter the circle: ");
        circle = s.next();
        
        if (circle.equals("k")) {
            total = no * 75;
        } else if (circle.equals("q")) {
            total = no * 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }
        
        if (no > 20) {
            sum = ((0.1) * total);
            sum1 = total - sum;
            if (co.equals("y")) {
                sum2 = ((0.2) * total);
                sum3 = sum1 - sum2;
                if (ref.equals("y")) {
                    refe = no * 150;
                    cost = sum3 + refe;
                } else {
                    cost = sum3;
                }
            } else {
                cost = sum1;
            }
        } else {
            cost = total;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Ticket cost:" + df.format(cost));
    }
} 