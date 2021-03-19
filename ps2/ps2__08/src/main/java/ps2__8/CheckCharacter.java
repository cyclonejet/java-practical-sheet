/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2__8;

import java.util.Scanner;
/**
 *
 * @author cyclonejet
 */
public class CheckCharacter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char chara = input.next().charAt(0);
        
        if((chara >= 'a' && chara <= 'z') || (chara >= 'A' && chara <= 'Z')) {
            System.out.println(chara + " is an alphabet");
        } else if (chara >= '1' && chara <='9') {
            System.out.println(chara + " is a number");
        } else {
            System.out.println(chara + " is a special character");
        }
    }
}
