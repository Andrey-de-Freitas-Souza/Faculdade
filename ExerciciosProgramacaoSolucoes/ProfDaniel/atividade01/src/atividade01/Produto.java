package atividade01;

import javax.swing.JOptionPane;

public class Produto {
    private String nomeProduto ;
    private String descricao;
    private double preco;
    
    public Produto(String nomeProduto, String descricao){
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = 100;
        
    }
    
    public void setnomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    public String getnomeProduto(){
        return nomeProduto;
    }
    
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getdescricao(){
        return descricao;
    }
    
    public void setpreco(double preco){
        this.preco = preco;
    }
    
    public double getpreco(){
        return preco;
    }
    
    public void aumentaPreco(double porcentagem){
        double novoPreco = preco + (((preco/100) * porcentagem));
        this.preco = novoPreco;
    }
    
    public void mostrarDados(){
        JOptionPane.showMessageDialog(null,"Dados: \n" + 
                                                        "Nome: " + this.getnomeProduto()+
                                                        "\nDescrição: " + this.getdescricao()+ 
                                                        "\nPreço: " + this.getpreco());
    }
    
        
    public static void main(String[] args) {
       String nomeProduto =  JOptionPane.showInputDialog("Qual o nome do produto? ");
       String descricao =  JOptionPane.showInputDialog("Qual a descrição do produto? ");
       
       Produto p1 = new Produto(nomeProduto,descricao);
       
       double resp = 1;
       
       while(resp != 0){
            
           resp = Double.parseDouble(JOptionPane.showInputDialog("Qual preço desse produto você viu sendo praticado?"));  
            
            if(resp == 0){
                break;
            }
            if(resp < p1.getpreco()){
                p1.setpreco(resp);
            }
       }
       
       p1.aumentaPreco(2);
       p1.mostrarDados();
       
    }
    


}
