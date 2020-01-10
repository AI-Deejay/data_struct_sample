/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jamie
 */
public class Lecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br;
        StringBuilder sb;
        String line;
        try {
            // TODO code application logic here
            String name = JOptionPane.showInputDialog("input");
            fw = new FileWriter("file.txt");

            fw.write(name);
            System.out.println("Writed successfulty");

            fw.close();

            fr = new FileReader("file.txt");
            br = new BufferedReader(fr);
            sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                //  System.out.println(line);
                sb.append(line);
            }

            // System.out.println(sb.toString());
            line = sb.toString();
            System.out.println(line);
            fr.close();
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(Lecture.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Lecture.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
