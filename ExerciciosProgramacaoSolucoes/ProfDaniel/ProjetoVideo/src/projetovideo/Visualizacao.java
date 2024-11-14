
package projetovideo;

public class Visualizacao {
    private User espectador;
    private Video filme;

    public Visualizacao(User espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews()+ 1 );
    }

    public User getEspectador() {
        return espectador;
    }

    public void setEspectador(User espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
