/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__13;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class XNSeriesSUm {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x and n respectively: ");
        int x = input.nextInt();
        int n = input.nextInt();
        
        double sum = x;
        
        System.out.print("\n\nSeries:\n" + x);        
        
        for (int i = 2; i < n; i++) {
            double term = Math.pow(-1, i) * (i / Math.pow(x, i));
            System.out.print(" + " + term);
            sum += term;
        }
        
        System.out.println("\nSum is " + sum);
    }
}
