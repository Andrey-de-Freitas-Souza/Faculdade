import javax.swing.JOptionPane;

public class Soma {
public static void main (String[] args) {
      String n1 = JOptionPane.showInputDialog("Digite um n�mero ");
      int num1 = Integer.parseInt(n1);
      String n2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
      int num2 = Integer.parseInt(n2);
      int total = num1 + num2;
      JOptionPane.showMessageDialog(null,"A soma entre " + num1 + " e " + num2 + " � igual a " + total);
      
   
   }
}
