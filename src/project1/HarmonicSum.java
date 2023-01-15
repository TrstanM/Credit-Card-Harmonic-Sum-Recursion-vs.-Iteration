/* Project #1
 * Source code file: Project1.java
 * Programmer: Tristan Miller
 * Due: 03/08/22
 * Description: 
 * Write a recursive method and accompanying main method to compute and display 
 * the nth Harmonic number. 
 */
package project1;

import java.util.Scanner;

public class HarmonicSum {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and I will determine it's harmonic sum:");
        int n = input.nextInt();
        System.out.println("The harmonic sum of " + n + " is " + harmonicSum(n));
    }
    
    public static double harmonicSum(double n) {
        if (n == 1) {
            return 1;
        }
        else {
            return 1.0/n + harmonicSum(n - 1);
        }
    }
}
