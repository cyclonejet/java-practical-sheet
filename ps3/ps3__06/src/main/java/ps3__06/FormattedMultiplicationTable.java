/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps3__06;

/**
 *
 * @author cyclonejet
 */
public class FormattedMultiplicationTable {
    public static void main (String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <=12; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
