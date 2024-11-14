
package ufc;


public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
           this.categoria = "Inválido"; 
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
        
    public void apresentar(){
        System.out.println("Com vocês o lutador, " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("que tem " + this.getIdade() + ", " + this.getAltura() + "m de altura");
        System.out.println("pesando " + this.getPeso());
        System.out.println("Com " + this.getVitorias()+" vitórias, " + this.getDerrotas() + " derrotas, e " + this.getEmpates() + " empates.");
        
    }
    public void status(){
        System.out.println(this.getNome() + " é peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias()+ " vezes");
        System.out.println("Perdeu " + this.getDerrotas()+ " vezes");
        System.out.println("Empatou " + this.getEmpates()+ " vezes");
    }
    public void ganharLuta(){
        this.vitorias++;       
    }
    public void perderLuta(){
        this.derrotas++;
    }
    public void empatarLuta(){
        this.empates++;
    }
}
