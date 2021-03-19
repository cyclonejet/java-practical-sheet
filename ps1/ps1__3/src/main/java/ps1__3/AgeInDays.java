/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1__3;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class AgeInDays {
    public static void main (String[] args) {
        int age;
        Scanner read_int = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = read_int.nextInt();
        int age_in_days = age * 365;
        System.out.println("Your age in days is: " + age_in_days);
    }
    
}
