

package Banco;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        String menu = "[1] Cadastrar\n[2] Atualizar\n[3] apagar\n[4] Listar\n[0] Sair";
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao){
                case 1:{
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String fone = JOptionPane.showInputDialog("Telefone:");
                    String email= JOptionPane.showInputDialog("Email:");
                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.inserir();                    
                    break;}
                
                case 2:{
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String fone = JOptionPane.showInputDialog("Telefone:");
                    String email= JOptionPane.showInputDialog("Email:");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.setCodigo(codigo);
                    p.atualizar();      
                    break;}
                
                case 3:{
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
                    Pessoa p = new Pessoa();
                    p.setCodigo(codigo);
                    p.apagar();                                   
                    break;}
                    
                case 4:{
                    Pessoa p = new Pessoa();
                    p.listar();
                    break;}
                
                case 0:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                
            }
        }while(opcao != 0);
    }
}

