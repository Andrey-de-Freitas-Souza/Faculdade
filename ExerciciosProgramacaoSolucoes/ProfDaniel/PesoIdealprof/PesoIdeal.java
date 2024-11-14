import javax.swing.JOptionPane;

public class PesoIdeal {
	public static void main (String[] args) {
		char genero;
		float altura;
		//Obtem a entrada do usuário e converte para inteiro
		genero = (JOptionPane.showInputDialog("Qual é o sexo? 'm' ou 'f'")).charAt(0);
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da pessoa"));
		//Verificar se é homem ou mulher
		if (genero == 'f' || genero == 'F'){
			JOptionPane.showMessageDialog(null, "O peso ideal para esta mulher é : " + String.format("%.2f",((62.1*altura) - 44.7))+ " Kg.");	
			JOptionPane.showMessageDialog(null, "O peso ideal para esta mulher é : " + String.format("%.2f",((62.1*altura) - 44.7))+ " Kg.");				
			
		}
		else if(genero == "m" || genero == "M"){
			JOptionPane.showMessageDialog(null, "O peso ideal para este homem é : " + String.format("%.2f", ((72.7*altura) - 58)) + " Kg.");			
		}		
	}
}