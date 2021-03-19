/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__11;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class SumOfDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a five digit integer:");
        int number = input.nextInt();
        int sum = 0;
        
        while (true) {
            int count = 0;
            int temp = number;
            
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
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            sum += digit;
        }
        System.out.println("The sum of all digits in the given number is "
                + sum);
    }
}
