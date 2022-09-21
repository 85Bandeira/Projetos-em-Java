/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author Miguel
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String s = "CURSOEMVIDEO";
      char [] r = new char [12];
      for (int c=s.length()-1; c>=0; c--); {
         r[c] = s.charAt(c);
    }
    for (char l: r ){
            System.out.print(l);
        }
        
        
    }
    
}
