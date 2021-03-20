/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__08;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class OctalToDecimal {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number in octal: ");
        String num = input.nextLine();
        
        int decimal = Integer.parseInt(num, 8);
        
        System.out.println("Decimal equivalent of " + num + " is " + decimal);
    }
}
