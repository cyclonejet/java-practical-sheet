/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__02;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class QuadraticEquationRoots {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter coefficients a, b, c of quadratic"
                + " equation ax^2 + bx + c respectively:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        if ((b * b - 4 * a * c) < 0) {
            System.out.println("Their roots are not real.");
            return;
        }
        
        double r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5))
                / (2 * a);
        double r2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5))
                / (2 * a);
        
        System.out.println("The roots are " + r1 + " and " + r2);
    }
}
