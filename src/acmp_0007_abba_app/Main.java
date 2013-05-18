/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmp_0007_abba_app;

import org.me.abbalib.Abba;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstHeap = "189285";
        String secondHeap = "283";
        String thirdHeap = "4958439238923098349024";

        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);

        System.out.println("firstHeap = " + firstHeap);
        System.out.println("secondHeap = " + secondHeap);
        System.out.println("thirdHeap = " + thirdHeap);
        System.out.println();
        System.out.println("result = " + result);
    }
}
