import javax.swing.JOptionPane;

public class SalarioMinimo {
	public static void main(String[] args){
		double salario;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário?"));
		
		if(salario >= 1320){
			JOptionPane.showMessageDialog(null, "O valor é MAIOR que o salário mínimo!");
		}
		else {
			JOptionPane.showMessageDialog(null, "O valor é MENOR que o salário mínimo!");
		}
	
	}
}