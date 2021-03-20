/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__12;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class SeriesX {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter term value: ");
        int n = input.nextInt();
        System.out.println("Enter x: ");
        int x = input.nextInt();
        
        System.out.print("1  ");
        
        for (int i = 1; i < n; i++) {
            System.out.print(Math.pow(x, i) + "  ");
        }
    }
}
