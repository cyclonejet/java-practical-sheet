/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__09;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class DecimalToOctal {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        System.out.println("Octal equivalent of " + decimal + " is " + Integer.toOctalString(decimal));
    }
}
