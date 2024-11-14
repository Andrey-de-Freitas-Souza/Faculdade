/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oracle;
import java.util.Random;
/**
 *
 * @author andre
 */
public class Oracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String Name = new String('java');
        //System.out.println(Name);
        Random sorteio = new Random();
        int num = sorteio.nextInt(9)+2;
        System.out.println(num);
    }
    
}
