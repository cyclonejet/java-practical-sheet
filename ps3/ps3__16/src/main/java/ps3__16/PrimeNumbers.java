/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__16;

/**
 *
 * @author cyclonejet
 */
public class PrimeNumbers {
    public static void main (String[] args) {
        int primeCount = 0;
        int start = 2;
        
        System.out.print(start + " ");
        start++;
        
        while (primeCount <= 50) {
            int count = 0;
            for (int i = 2; i < start; i++) {
                if (start % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(start + " ");
                primeCount++;
            }
            start += 2;
        }
    }
}
