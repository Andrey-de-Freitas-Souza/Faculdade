public class MoldeCarros2 {
    
    private String nomeDoCarro;
    private String quantidadePortas;
    
    public void ligar(){
        System.out.printf("%s com %s portas ligado \n",nomeDoCarro, quantidadePortas);
    }
    public void desligar(){
        System.out.printf("%s com %s portas desligado \n",nomeDoCarro,quantidadePortas);
    }
    
    public String getnomeDoCarro(){
        return nomeDoCarro;
    }
    public void setnomeDoCarro(String nomeDoCarro){
        this.nomeDoCarro = nomeDoCarro;
    }
    
    public String getquantidadePortas(){
       return quantidadePortas;
    }
    public void setquantidadePortas(String quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }
    
}
