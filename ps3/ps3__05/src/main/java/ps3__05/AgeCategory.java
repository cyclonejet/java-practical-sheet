/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__05;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class AgeCategory {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int age[] = new int[15];
        int babyAge = 0, schoolAge = 0, adultAge = 0;
        
        System.out.println("Enter 15 ages: ");
        for (int i = 0; i < 15; i++) {
            age[i] = input.nextInt();
            if (age[i] < 6) {
                babyAge++;
            } else if (age[i] < 18){
                schoolAge++;
            } else {
                adultAge++;
            }
        }
        System.out.println("Still a baby age: " + babyAge);
        System.out.println("Attending school: " + schoolAge);
        System.out.println("Adult life: " + adultAge);
    }
}
