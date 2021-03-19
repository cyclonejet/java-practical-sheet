/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__06;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Max {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any four integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        if (a > b && a > c && a > d) {
            System.out.println(a + " is the maximum number");
        } else if (b > c && b > d) {
            System.out.println(b + " is the maximum number");
        } else if ( c > d) {
            System.out.println(c + " is the maximum number");
        } else {
            System.out.println(d + " is the maximum number");
        }
    }
}
