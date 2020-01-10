/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg011020selectsort;

import java.util.Arrays;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author DS-Demabildo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size, h = 0, t = 0, min = 0, index = 0;
        int selectestck[];
        boolean check = false;

        size = Integer.parseInt(JOptionPane.showInputDialog(null, "size?"));

        selectestck = new int[size];

        for (int i = 0; i < size; i++) {
            selectestck[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "pick for slot" + i));
        }
        System.out.println("input = " + Arrays.toString(selectestck));

        for (int k = 0; k < size - 1; k++) {
            for (int i = 0; i < size-1; i++) {
                // System.out.println(Arrays.toString(selectestck));
                h = selectestck[i];
                t = selectestck[i + 1];
                if (h > t) {
                    min = t;
                    index = (i + 1);
                    System.out.println("min1"+min);
                } else {
                    min = h;
                    System.out.println("min2"+min);
                }
            }
            System.out.println("min=" + min + "||index=" + index);
            selectestck[index] = selectestck[k];
            selectestck[k] = min;
            System.out.println(Arrays.toString(selectestck));
        }
    }
}
