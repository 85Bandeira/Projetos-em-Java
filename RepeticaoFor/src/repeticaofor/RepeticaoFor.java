/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author Miguel
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 0;
        for (int i = 0; i <= 15; i+=2){
            if (i%3==0)continue;    
            System.out.println (i);
        } 
    }   
}
