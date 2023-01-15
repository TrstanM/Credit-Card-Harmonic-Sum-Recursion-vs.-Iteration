/*
 * Project #1
 * Source code file: Project1.java
 * Programmer: Tristan Miller
 * Due: 03/08/22
 * Description: 
 * a. Write an iterative method power1 to compute x^n for n ≥0.
 * b. Write a recursive method power2 to compute x^n by using the following recursive
 *    formulation: x^0 = 1
 *                 x^n = x * x ^n-1 if n > 0
 */
package project1;


public class IterativeAndRecursive {

    public static void main(String[] args) {
       power1();
    }
    
    public static void power1() {
        for(double n = 0; n <= 10; n++) {
           double x = Math.pow(2.0, n);
           System.out.println("2.0" + "^" + n + " = " + x + " computed iteratively.");
           System.out.println("2.0" + "^" + n + " = " +power2(n) + " computed recursively");
        }
    }
    
    public static double power2(double n) {
        if (n == 0) {
            return 1;
        }
        else {
            return 2 * power2(n-1);
        }
    }       
}
