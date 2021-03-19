/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2_09;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class DayTemperature {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter average temperature of a day in Fahrenheit:");
        float temp = input.nextFloat();
        
        if (temp > 80) {
            System.out.println("Hot day");
        } else if (temp > 60) {
            System.out.println("Nice day");
        } else {
            System.out.println("Cold day");
        }
    }
}
