/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__12;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Reverse {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a five digit integer:");
        int number = input.nextInt();
        int temp, reverse = 0;
        
        while (true) {
            int count = 0;
            temp = number;
            
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            
            if (count == 5) {
                break;
            }
            
            System.out.println("The number you entered is not five digit,"
                    + "please enter a five digit integer:");
            number = input.nextInt();
        }
        
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse of " + number + " is " + reverse);
    }
}
