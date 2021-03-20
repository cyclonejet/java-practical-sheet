/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__11;

/**
 *
 * @author cyclonejet
 */
public class Fibonacci {
    public static void main (String[] args) {
        int n = 25, a = 1, b = 1;
        
        for (int i = 1; i < n; i ++) {
            System.out.print(a + "\t");
            
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
