
package atividade01b;

import javax.swing.JOptionPane;

public class Vendedor {
    
private String nome;
private double comissao; 
private double venda;


public Vendedor(String nome){
    
    this.nome = nome;
    this.comissao = 0;
    this.venda = 0;


}
 public void setnome(String nomeCandidato){
     this.nome = nome;

 }
    public String getNome(){
        return nome;

    }

     public void setcomissao(double comissao){
     this.comissao = comissao;

 }
    public double getcomissao(){
        return comissao;

    }

    public void setvenda(double venda){
     this.venda = venda;

 }
    public double getvenda(){
        return venda;

    }
    public void aumentaVenda(double valor){       
        double novoValor = this.venda + valor;
        this.venda = novoValor;
    }
    
    public double dapremio(){
        if(this.getvenda() > 10000){
            return 500;
        }
        else if(this.getvenda()> 5000 && this.getvenda()< 10000){
            return 100;
        }
        else{
            return 0;
        }
        
    }
    public double indicaComissao(){
        return (this.getvenda()/100) * comissao;
    }
    public void mostrarDados(){
        JOptionPane.showMessageDialog(null,"Dados: \n" + 
                                                        "Nome: " + this.getNome()+
                                                        "\nComissão: " + this.getcomissao()+ 
                                                        "\nVenda: " + this.getvenda());
    }
    
    
    
    
    public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog("Digite o nome do vendedor: ");
      Vendedor v1 = new Vendedor(nome);
      double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão "));
      v1.setcomissao(comissao);
      
      double resp = 1;
       
       while(resp != 0){
            
           resp = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do item vendido? "));  
            
            if(resp == 0){
                break;
            }
            if(resp != 0){
                v1.aumentaVenda(resp);
            }
       }
       
       JOptionPane.showMessageDialog(null,"o valor a ser pago é de: " +  (v1.indicaComissao()+ v1.dapremio()));
       
       
       
    }

}
