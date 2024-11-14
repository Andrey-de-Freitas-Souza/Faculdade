import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ex1 {
    public static class Arestas{
        public String nome;
        public int vertice1;
        public int vertice2;
        
        Arestas(String nome, int vertice1, int vertice2){
            this.nome = nome;
            this.vertice1 = vertice1;
            this.vertice2 = vertice2;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> Vertices = new ArrayList<>();
        ArrayList<Arestas> ListaArestas = new ArrayList<>();
        int parada = 0;
        int[][] MatrizIncidencia;
        
        for(int i = 0; parada != 999 ; i++){
            int vert = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) +"° vértice: (999 para parar de adicionar)"));
            Vertices.add(vert);
            if(vert == 999){
                parada = 999;
            }
        }
        
        int paradaAresta = Integer.parseInt(JOptionPane.showInputDialog("Quantas arestas o grafo possui?"));
        for(int i = 0; i < paradaAresta ; i++){
            String nome = JOptionPane.showInputDialog("Digite o nome da " + (i+1) +"ª aresta:");
            int vertice1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número do par ordenado da aresta:"));
            int vertice2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número do par ordenado da aresta:"));
    
            Arestas ares = new Arestas(nome,vertice1,vertice2);
            ListaArestas.add(ares);
            System.out.println(ares.nome );
            System.out.println(ares.vertice1);
            System.out.println(ares.vertice2);
        }
        
        
    }

}