
package projetovideo;


public class ProjetoVideo {

    
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("10 curiosidades do planeta terra");
        v[1] = new Video("Como programar em java");
        v[2] = new Video("The Chainsmokers - Closer (Lyric) ft. Halsey");
        
        User u[] = new User[2];
        u[0] = new User("Marcos", 22,"M","SiriusBlack");
        u[1] = new User("Marcia", 19,"F","Hermione");
        
        System.out.println(v[0].toString());
        System.out.println(u[0].toString()); 
        Visualizacao view [] = new Visualizacao[5];
        view[0] = new Visualizacao(u[0],v[2]);
        System.out.println(view[0].toString());
        view[0] = new Visualizacao(u[0],v[1]);
        System.out.println(view[0].toString());
    }
    
}
