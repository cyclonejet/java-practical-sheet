/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__11;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class CommissionRate {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter sales for item A and item B respectively:");
        float A = input.nextFloat();
        float B = input.nextFloat();
        
        double commissionA, commissionB;
        
        if (A < 2000) {
            commissionA = 0.05 * A;
        } else {
            commissionA = 0.05 * 2000 + 0.06 * (A - 2000);
        }
        
        if (B < 4000) {
            commissionB = 0.1 * B;
        } else {
            commissionB = 0.1 * 4000 + 0.12 * (B - 4000);
        }
        
        System.out.println("Total net commission is " + (commissionA + commissionB));
    }
}
