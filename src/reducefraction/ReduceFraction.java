/*
 * Evan Robertson
 * ReduceFraction.java
 * March 25th 2020
 * This program uses recursion to find the GCD of a fraction and reduces to lowest terms
 */

package reducefraction;
import javax.swing.*;

/**
 *
 * @author Evan
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get top
        int numerator = Integer.parseInt(JOptionPane.showInputDialog("What is the numerator?"));
        //Get bottom
        int denominator = Integer.parseInt(JOptionPane.showInputDialog("What is the denominator?"));
        //Find the GCD of the fraction
        int divisor = gcd(numerator, denominator);
        //create a new fraction in lowest terms
        int newNumerator = numerator/divisor;
        int newDenominator = denominator/divisor;
        //Output answer
        JOptionPane.showMessageDialog(null, numerator + "/" + denominator + " in lowest terms is: " + newNumerator + "/" + newDenominator + ". With a GCD of " + divisor + ".");
    }
    public static int gcd(int a, int b) {
        //If the denominator is equal to zero return a to prevent errors
        if (b==0) {
        return a;
        }
        //Otherwise, return GCD of the denominator and a modulus b, until b == 0
        //and returns a
        else {
            return gcd(b, a%b);
        }
    }
    
}

