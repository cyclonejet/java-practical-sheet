/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__14;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Factorial {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        
        int factorial = n;
        
        while (n != 1) {
            n -= 1;
            factorial *= n;
        }
        
        System.out.println("Factorial of the given number is " + factorial);
    }
}
