import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwingTela {
    public static void criartela(){
        
        JFrame tela = new JFrame("TELA OLÁ MUNDO");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel texto1 = new JLabel("OLÁ MUNDO!");
        
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(texto1);
        
        tela.pack();
        tela.setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criartela();
        });
        
    }
    
}
