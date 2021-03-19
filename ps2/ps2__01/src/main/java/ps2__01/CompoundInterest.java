/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__01;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class CompoundInterest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter principal amount:");
        double principal = input.nextFloat();
        
        System.out.println("Enter rate in decimal (e.g. 0.15):");
        double rate = input.nextFloat();
        
        System.out.println("Enter the number of years: ");
        double time = input.nextFloat();
        
        double compoundInterest = principal * Math.pow(1 + rate, time);
        
        System.out.println("The coumpound interest after " + time +
                " years is " + compoundInterest);
    }
}
