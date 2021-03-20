/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__18;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Percentage {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        float sub1, sub2, sub3;
        
        while (true) {
            System.out.println("Enter the marks of three subjects: ");
            sub1 = input.nextFloat();
            sub2 = input.nextFloat();
            sub3 = input.nextFloat();
            
            float total = sub1 + sub2 + sub3;
            float percent = total / 3;
            
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percent + "%");
            
            System.out.println("\n\nDo you want to continue? (Y/N)");
            char ans = input.next().charAt(0);
            
            if (ans == 'n' || ans == 'N') {
                break;
            }
        }
    }
}
