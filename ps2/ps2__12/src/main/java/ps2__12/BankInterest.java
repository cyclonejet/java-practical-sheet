/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__12;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class BankInterest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter prinicpal amount and time in years:");
        double principal = input.nextFloat();
        double time = input.nextFloat();
        double rate;
        
        if (principal < 1000 && time >= 2) {
            rate = 0.05;
        } else if (principal >= 1000 && principal < 5000 && time >= 2) {
            rate = 0.07;
        } else if (principal > 5000 && time >= 1) {
            rate = 0.08;
        } else if (time >= 5) {
            rate = 0.1;
        } else {
            rate = 0.03;
        }
        
        double interest = principal * Math.pow(1 + rate, time);
        System.out.println("Interest is " + interest);
        System.out.println("Total amount is " + (principal + interest));
    }
}
