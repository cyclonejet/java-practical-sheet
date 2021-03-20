/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__17;

import java.util.Scanner;

/**
 *
 * @author cyclonejet
 */
public class VowelsAndConsonants {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int vowelCount = 0, consonantCount = 0, spaceCount = 0;
        
        System.out.println("Enter any sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();
        
        System.out.println(sentence);
        
        for (char c : sentence.toCharArray()) {
            System.out.println(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                consonantCount++;
            }
        }
        
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("Space count: " + spaceCount);
    }
}
