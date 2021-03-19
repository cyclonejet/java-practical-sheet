/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__4;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class AreaAndPerimeter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter length: ");
        float length = input.nextFloat();
        
        System.out.println("Enter breadth: ");
        float breadth = input.nextFloat();
        
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        
        System.out.println("Area is " + area);
        System.out.println("Perimieter is " + perimeter);
    }
}
