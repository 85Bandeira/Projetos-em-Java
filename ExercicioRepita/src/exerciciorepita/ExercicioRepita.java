/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null,"Olá mundo!");
        int s, n, v, vp, vi, cem;
        double m;
        v = 0;
        vp = 0;
        vi = 0;
        m = 0;
        cem = 0;
        n = 0;
        s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
             "<html>Informe um numero:<br><em> (Valor 0 interrompe.)</em></html>"));
            v++;
            s = s + n;
            m = s / v;
        if ( % 2 = 0){
            vp ++;
        } else {
            vi ++;
        }
        if (n > 100){
            cem ++;
        }
        } while (n != 0);
        JOptionPane.showMessageDialog(null,
                "<html>Resultado<br>-----------------------" 
                        + "<br>Total de Valores: " + v 
                        + "<html>" + "<br>Total de Pares: " + vp 
                        + "<br>Total de Impares: " + vi 
                        + "<br>Acima de 100: " + cem 
                        + "<br>Média dos Valores: " + m 
                        +" </html>",
                    "Resultado Final", JOptionPane.WARNING_MESSAGE);

    //JOptionPane.showMessageDialog(null, "Você digitou " + n);  
    }
