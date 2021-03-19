/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__9;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class Percentage {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any four numbers:");
        double a = input.nextFloat();
        double b = input.nextFloat();
        double c = input.nextFloat();
        double d = input.nextFloat();
        
        double sum = a + b + c + d;
        
        System.out.println("First number " + a + " is " + (a * 100 / sum) + "% of the total");
        System.out.println("Second number " + b + " is " + (b * 100 / sum) + "% of the total");
        System.out.println("Third number "  + c + " is " + (c * 100 / sum) + "% of the total");
        System.out.println("Fourth number " + d + " is " + (d * 100 / sum) + "% of the total");
    }
}
