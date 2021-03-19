/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__10;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Armstrong {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a three digit number: ");
        int number = input.nextInt();
        
        while (true) {
            int count = 0;
            int temp = number;
            
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            
            if (count == 3) {
                break;
            }
            
            System.out.println("The number you entered is not three digit,"
                    + "please enter a three digit number:");
            number = input.nextInt();
        }
        
        double result = 0;
        int temp = number;
        
        while (temp != 0) {
            double rem = temp % 10;
            result = result + Math.pow(rem, 3);
            temp /= 10;
        }
        
        if (result == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
