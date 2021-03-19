/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__04;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class AreaOfRoom {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter lenght and breadth of a room:");
        float length = input.nextFloat();
        float breadth = input.nextFloat();
        
        float area = length * breadth;
        
        if (area <= 150) {
            System.out.println("Small room");
        } else if (area < 500) {
            System.out.println("Big room");
        } else if (area >=500 && area <=2500) {
            System.out.println("Hall");
        } else {
            System.out.println("Audiotorium");
        }
    }
}
