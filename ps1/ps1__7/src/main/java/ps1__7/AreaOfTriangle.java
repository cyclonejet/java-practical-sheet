/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__7;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class AreaOfTriangle {
    public static void main (String[] args) {
        System.out.println("Enter base and altitude of triangle respectively: ");
        
        Scanner input = new Scanner(System.in);
        
        double base = input.nextFloat();
        double altitude = input.nextFloat();
        
        double area = 0.5 * base * altitude;
        
        System.out.println("The area of the triangle is " + area);
    }
    
}
