/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__10;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class AB {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any two numbers a and b:");
        double a = input.nextFloat();
        double b = input.nextFloat();
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a x b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("Remainder of a / b = " + (a % b));
    }
}
