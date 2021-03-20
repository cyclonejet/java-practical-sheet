/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__10;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class GenerateSeries {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = input.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int b = (4 + (3 * (i - 1)));
            System.out.print(i + " x " + b + ", ");
            sum += (i * b);
        }
        
        System.out.println("\nSum of the series is " + sum);
    }
}
