import javax.swing.JOptionPane;

public class IdadeEmAnos {
	public static void main (String[] args) { 
		double anos , dias ;
		anos = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos voc� t�m?")) ;
		dias = anos * 365 ;
	
	JOptionPane.showMessageDialog(null, anos + " s�o " + dias + " dias" );
	
	}
}