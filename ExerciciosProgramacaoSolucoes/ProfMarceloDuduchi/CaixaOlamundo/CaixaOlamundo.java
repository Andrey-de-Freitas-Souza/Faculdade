import javax.swing.JOptionPane;

public class CaixaOlamundo {
public static void main (String[] args) {
   System.out.println("ola mundo");
   JOptionPane.showMessageDialog(null,"ol� mundo");
   String nome = JOptionPane.showInputDialog("Digite seu nome: ");
   JOptionPane.showMessageDialog(null,"Seja bem-vindo, " + nome);
   
   }
}
