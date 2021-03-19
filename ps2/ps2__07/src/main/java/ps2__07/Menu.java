/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__07;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Menu {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any three numbers:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        System.out.println("\nChoose an operation:");
        System.out.println("\t1. Summation");
        System.out.println("\t2. Sum of squares");
        System.out.println("\t3. Sum of cubes");
        System.out.println("\t4. Product");        
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println(a + b + c);
                break;
            case 2:
                System.out.println(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c ,2));
                break;
            case 3:
                System.out.println(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                break;
            case 4:
                System.out.println(a * b * c);
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}
