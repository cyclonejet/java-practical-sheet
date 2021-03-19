/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__8;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class SimpleInterest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter deposit amount: ");
        double principal = input.nextFloat();
        
        System.out.println("Enter the rate: ");
        double rate = input.nextFloat();
        
        System.out.println("Enter number of years:");
        double time = input.nextFloat();
        
        double si = principal * time * rate / 100;
        System.out.println("Simple interest is " + si);
    }
    
}
