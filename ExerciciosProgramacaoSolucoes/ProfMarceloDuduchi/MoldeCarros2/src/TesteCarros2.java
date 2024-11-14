import javax.swing.JOptionPane;
public class TesteCarros2 {
   public static void main(String[] args){
       
       MoldeCarros2 carro1 = new MoldeCarros2();
       MoldeCarros2 carro2 = new MoldeCarros2();
       
       String nomeDoCarro = JOptionPane.showInputDialog("Qual o nome do primeiro carro?");
       carro1.setnomeDoCarro(nomeDoCarro);
       String quantidadePortas = JOptionPane.showInputDialog("Quantas portas o primeiro carro têm?");
       carro1.setquantidadePortas(quantidadePortas);
       
       String nomeDoCarro2 = JOptionPane.showInputDialog("Qual o nome do segundo carro?");
       carro2.setnomeDoCarro(nomeDoCarro2);
       String quantidadePortas2 = JOptionPane.showInputDialog("Quantas portas o segundo carro têm?");
       carro2.setquantidadePortas(quantidadePortas2);
       
       carro1.ligar();
       carro1.desligar();
       carro2.ligar();
       carro2.desligar();
       
   } 
}
