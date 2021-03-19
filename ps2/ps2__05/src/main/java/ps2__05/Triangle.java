/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__05;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class Triangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sides of a triangle: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Invalid data");
            return;
        }
        float s = (a + b + c) / 2;
        double area = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        System.out.println("Area of the triangle is " + area);
    }
}
