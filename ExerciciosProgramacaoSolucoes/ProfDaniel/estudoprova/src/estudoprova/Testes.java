
package estudoprova;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Testes {   
    public static void main(String[] args) {
       /* System.out.println("alo mundo");   
        int num = 2;
        if(num == 1 && num < 3){
            System.out.println("sim");
        }
        else{
            System.out.println(num);
        }*/
               
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digiteo primeiro numero: "));  
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int resultado = num1 + num2;
        JOptionPane.showMessageDialog(null,resultado );        
        
        if(resultado % 2 == 1){
            JOptionPane.showMessageDialog(null,"o resultado é impar");
        }
        else{
            JOptionPane.showMessageDialog(null,"o resultado é par");
        }
        
        if (resultado > 1) { 
            if (num1> 1){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
        else{
            System.out.println("o resultado é menor que 1");
        }
        for (int contador =0; contador<10; contador++) {
            
        }
        if (num1 <5){
            System.out.println("blabla");
        }  
        else {
            System.out.println("Ola Mundo!");
        }
        for (int contador =10; contador<100; contador+=3){
            System.out.println(contador);
        }
        
        
        
    }    
}
