/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__5;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class VolumeSphere {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double radius = input.nextFloat();
        
        double surface_area = 4 * Math.PI * Math.pow(radius, 2);
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        
        System.out.println("Surface area of the sphere is " + surface_area);
        System.out.println("Volume of the sphere is " + Math.round(volume * 1.00)/1.00);
    }
    
}
