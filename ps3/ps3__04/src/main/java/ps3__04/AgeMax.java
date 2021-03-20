/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__04;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class AgeMax {
    public static void main (String[] args) {
        int[] age = new int[15];
        Scanner input = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        
        System.out.println("Enter 15 ages: ");
        for (int i = 0; i < 15; i++) {
            age[i] = input.nextInt();
            if (age[i] < minimum) {
                minimum = age[i];
            } else if (age[i] > maximum) {
                maximum = age[i];
            }
            sum += age[i];
        }
        
        System.out.println("Maximum age is " + maximum);
        System.out.println("Minimum age is " + minimum);
        System.out.println("Average age is " + (sum / 15));
    }
}
