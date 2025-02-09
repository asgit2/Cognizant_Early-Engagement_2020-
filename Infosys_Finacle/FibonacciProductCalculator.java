/*
Given 2 non negative no A & B. Find the product of the fibonacci no. From Ath position to Bth position. 
Both inclusive
  */

import java.math.BigInteger;

public class FibonacciProductCalculator {
    public static int fibonacciProduct(int a, int b) {
        if (a > b) return 1; // If invalid range, return neutral product value (1).
        
        BigInteger product = BigInteger.ONE;
        BigInteger[] fib = new BigInteger[b + 1];
        
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        
        for (int i = 2; i <= b; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]); // Fibonacci formula: F(n) = F(n-1) + F(n-2)
        }
        
        for (int i = a; i <= b; i++) {
            product = product.multiply(fib[i]);
        }
        
        return product.mod(BigInteger.valueOf(1_000_000_007)).intValue(); // Return result modulo 10^9 + 7
    }

    public static void main(String[] args) {
        System.out.println(fibonacciProduct(2, 5)); // Example: Fibonacci(2) to Fibonacci(5) = 1*1*2*3*5 = 30
    }
}
