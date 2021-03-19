/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__6;

import java.util.Scanner;

/**
 *
 * @author phoenix
 */
public class CelsiusFahrenheit {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter temperature in Celsius: ");
        double tempInCelsius = input.nextFloat();
                
        double tempInFahrenheit = (tempInCelsius * 9/5) + 32;
        
        System.out.println("Temperature in Fahrenheit is " + tempInFahrenheit + "°F");
    }
}
