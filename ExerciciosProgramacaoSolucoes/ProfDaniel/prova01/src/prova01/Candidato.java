package prova01;

import javax.swing.JOptionPane;

public class Candidato {
private String nomeCandidato;
private int numero; 
private int votos;
public Candidato (String nomeCandidato, int numero){

    this.nomeCandidato = nomeCandidato;
    this.numero = numero;
    this.votos = 0;


}
 public void setnomeCandidato(String nomeCandidato){
     this.nomeCandidato = nomeCandidato;

 }
    public String getNomeCandidato(){
        return nomeCandidato;

    }

     public void setnumero(int numero){
     this.numero = numero;

 }
    public int getnumero(){
        return numero;

    }

    public void setvotos(int votos){
     this.votos = votos;

 }
    public int getvotos(){
        return votos;

    }
    public void aumentaVotos(){       
        this.votos = this.votos + 1;
    }

    public void mostrarDados(){
        JOptionPane.showMessageDialog(null, "Dados: \n" + 
                                                        "Nome: " + this.getNomeCandidato()+
                                                        "\nNumero: " + this.getnumero() +
                                                        "\nVotos: " + this.getvotos());
    }
    
    
    
    public static void main(String[] args) {
      String nomeCandidato1 = JOptionPane.showInputDialog("Digite o nome: ");
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
      
      String nomeCandidato2 = JOptionPane.showInputDialog("Digite o nome: ");
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
   
    Candidato c1 = new Candidato(nomeCandidato1, numero1);
    Candidato c2 = new Candidato (nomeCandidato2, numero2);
    
    for (int contador=1; contador<=10; contador ++){
       int voto = Integer.parseInt( JOptionPane.showInputDialog("Qual numero do candidato que voce deseja votar?"));
      if (voto == c1.getnumero()){
          c1.aumentaVotos();
          
      } 
      else if (voto == c2.getnumero()){
          c2.aumentaVotos();
          
      }
    }
    c1.mostrarDados();
    c2.mostrarDados();
    
    
   }
}
﻿
