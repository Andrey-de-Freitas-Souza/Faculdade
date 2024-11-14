package livrodenot;

import javax.swing.JOptionPane;

public class teste {
   public static void main (String[] args){
       String primeiroCurso = JOptionPane.showInputDialog("Prof, qual o nome do primeiro curso? ");
       String segundoCurso = JOptionPane.showInputDialog("Prof. qual o segundo curso? ");
       
        LivroDeNot livroDeNotas1 = new LivroDeNot(primeiroCurso);
        LivroDeNot livroDeNotas2 = new LivroDeNot(segundoCurso);
        livroDeNotas1.exibirMensagem();
        livroDeNotas2.exibirMensagem();
    } 
}
