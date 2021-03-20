/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__07;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class SumOfDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        
        int temp = n, sum = 0;
        
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Sum of digit of given number is " + sum);
    }
}
