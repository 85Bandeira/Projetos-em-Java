/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Miguel
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Miguel";
        String nome2 = "Miguel";
        String nome3 = new String("Miguel");
        String res;
        res = (nome1 == nome2)?"igual":"diferente";
        System.out.println(res);
    }
    
}