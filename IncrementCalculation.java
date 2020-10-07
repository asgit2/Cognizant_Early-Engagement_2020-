



import java.util.*;
public class IncrementCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        float sal = sc.nextFloat();
        System.out.println("Enter the Performance appraisal rating");
        double pef = sc.nextDouble();
        if(sal <= 0 ){
            System.out.println("Invalid Input");
            return;
        }
        if( pef==0 ||pef<1.0 || pef >5.0){
            System.out.println("Invalid Input");
            return;
        }

        double inc = 0;
        if(pef>=1.0 && pef<=3.0){
            inc = sal * 0.1;
        }
        if(pef>=3.1 && pef<=4.0){
            inc = sal * 0.25;
        }
        if(pef>=4.1 && pef<=5.0){
            inc = sal * 0.3;
        }
        
        System.out.println((int)(sal+inc));

    }
}

