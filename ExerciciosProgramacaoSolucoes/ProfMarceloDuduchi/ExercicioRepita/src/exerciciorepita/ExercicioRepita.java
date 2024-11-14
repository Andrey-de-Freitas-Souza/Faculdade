/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: (valor 0 interrompe)"));
            s += n;
        
        }while (n != 0);
        JOptionPane.showMessageDialog(null, "a soma fooi de :" + s);
    }
    
}
