
package contabanco;

import javax.swing.JOptionPane;

public class ContaBanco {
   // Atributos
   private int numero;
   private String nome;
   private double saldo;
   private double limite;
   // Construtor
   public ContaBanco (int numero, String nome) {
       this.numero = numero;
       this.nome = nome;
       this.saldo = 0;  
       this.limite = 0;
   }
   // Setters e Getters
   public int getNumero() {
      return numero;
   }
   public void setNumero(int numero) {
      this.numero = numero;
   }
   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public double getSaldo() {
      return saldo;
   }
   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }
   public double getLimite() {
      return limite;
   }
   public void setLimite(double limite) {
      this.limite = limite;
   }
   // Métodos
   public void mostraDados(){
      JOptionPane.showMessageDialog(null, "Dados:  \n"
                                           + "Numero: " + getNumero() + "\n"
                                           + "Nome: " + getNome() + "\n"
                                           + "Saldo: " + getSaldo() + "\n"
                                           + "Limite: " + getLimite());  
   }
   public void deposito(double valor) {
      saldo = saldo + valor;
   }
   public double saque(double valor) {
      double novoSaldo = this.saldo - valor;
      if (this.limite + novoSaldo < 0) {
        JOptionPane.showMessageDialog(null,"Não há limite para transação!");
        return 0;
      }
      else {
        JOptionPane.showMessageDialog(null,"Saque realizado!");
        if (novoSaldo < 0)
           JOptionPane.showMessageDialog(null,"Seu saldo ficou negativo!");
        this.saldo = novoSaldo;  
        return valor;
      }        
   }        

   public static void main(String[] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta a criar?"));
      String nome = JOptionPane.showInputDialog("Qual o nome do titular?");
      ContaBanco cb1  = new ContaBanco(numero,nome);
      JOptionPane.showMessageDialog(null,"Saldo: "+cb1.getSaldo());
      JOptionPane.showMessageDialog(null,"Limite: "+cb1.getLimite());
      double valorLimite = Double.parseDouble(JOptionPane.showInputDialog("Qual limite dar ao cliente?"));
      cb1.setLimite(valorLimite);
      JOptionPane.showMessageDialog(null,"Limite: "+cb1.getLimite());
      cb1.mostraDados();
      double valor;  
      // fazendo quantidade determinada de depósitos
      JOptionPane.showMessageDialog(null,"Depósitos com quantidade determinada usando for!");
      int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos depósitos vai fazer?"));
      for(int i = 0;i<qtd;i++) {
         valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do depósito?"));
         cb1.deposito(valor);          
      }      
      cb1.mostraDados();
      // fazendo saques até digitar zero com do/while
      JOptionPane.showMessageDialog(null,"Saques até digitar 0 com do/while!");
      do {
         valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque (0 para sair)?"));
         if (valor > 0) {
            double valorSaque = cb1.saque(valor);
            JOptionPane.showMessageDialog(null,"Valor do saque: "+valorSaque);
            JOptionPane.showMessageDialog(null,"Saldo: "+cb1.getSaldo());
         }  
      } while (valor > 0);  
      cb1.mostraDados();
      // fazendo saques até digitar zero com while
      JOptionPane.showMessageDialog(null,"Saques até digitar 0 com while!");
      valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque (0 para sair)?"));
      while(valor > 0) {
         double valorSaque = cb1.saque(valor);
         JOptionPane.showMessageDialog(null,"Valor do saque: "+valorSaque);
         JOptionPane.showMessageDialog(null,"Saldo: "+cb1.getSaldo());
         valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque (0 para sair)?"));
      }  
      cb1.mostraDados();
      JOptionPane.showMessageDialog(null,"Saldo final: "+cb1.getSaldo());
   }
}
 