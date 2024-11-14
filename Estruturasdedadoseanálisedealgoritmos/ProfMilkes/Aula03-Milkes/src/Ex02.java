import javax.swing.JOptionPane;
import java.util.ArrayList; 
import java.util.Collections;
public class Ex02 {
    public static class Gatos {
    public int codigo;
    public String nome;
    public String raca ;
    public int idade;
    public String doenca;
    public float valor;
        public Gatos() {
        
        }
        public Gatos(int codigo, String nome, String raca, int idade, String doenca, float valor) {
            this.codigo = codigo;
            this.nome = nome;
            this.raca = raca;
            this.idade = idade;
            this.doenca = doenca;
            this.valor = valor;
        }
        public int getCodigo(){
            return this.codigo;
        }
        public String getName(){
            return this.nome;
        }
        public String getRaca(){
            return this.raca;
        }
        public int getIdade(){
            return this.codigo;
        }
        public String getDoenca(){
            return this.doenca;
        }
        public float getValor(){
            return this.valor;
        }
        public void InfoCats(Gatos gato){
            JOptionPane.showMessageDialog(null, "Gato encontrado: \n Código: " + gato.getCodigo() + "\nNome: " + gato.getName() + 
            "\nRaça: "+ gato.getRaca() + "\nIdade: " + gato.getIdade() + "\nDoença: " + gato.getDoenca() + "\nValor do Atendimento: "+ gato.getValor());    
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Gatos> listaGatos = new ArrayList<Gatos>();
        ArrayList<String> listaNomeGatos = new ArrayList<String>();
            for(int j = 0; j < 7; j++){
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do gato:"));
                String nome = JOptionPane.showInputDialog("nome do gato:");
                String raca = JOptionPane.showInputDialog("Raça do gato:");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do gato:"));
                String doenca = JOptionPane.showInputDialog("Qual a doença do gato?");
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do atendimento:"));
                
                Gatos gato = new Gatos(codigo,nome,raca,idade,doenca,valor);
                listaGatos.add(gato);
                listaNomeGatos.add(nome);
                
            } 
        Boolean Continue = true;
        while(Continue){
            int resp = Integer.parseInt(JOptionPane.showInputDialog("Oque você deseja fazer? \n[0] Pesquisar gato por nome\n" + 
            "[1] Pesquisar gato por código\n" + "[2] Ordenar os gatos por ordem alfabética\n[3] Apagar dados de um gato\n" + 
            "[4] Localizar a posição de um gato na listagem\n[5] Levantar quantos gatos possuem uma idade específica.\n" + 
            "[6] Somar o valor total dos atendimentos.\n [999] Sair"));

            if(resp == 0){
                String nomePesquisa = JOptionPane.showInputDialog("Digite o nome do gato que você deseja buscar:"); 
                int found = 0;
                for(int i = 0; i < listaGatos.size(); i++) {
                    if(nomePesquisa.equals(listaGatos.get(i).getName())){
                        listaGatos.get(i).InfoCats(listaGatos.get(i)); 
                        found++;   
                    } 
                }
                if(found == 0){
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum gato com esse nome.\n Tente novamente");
                }
            }
            else if(resp == 1){
               int CodPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do gato que você deseja buscar:")); 
                int found = 0;
                for(int i = 0; i < listaGatos.size(); i++) {
                    if(CodPesquisa == listaGatos.get(i).getCodigo()){
                        listaGatos.get(i).InfoCats(listaGatos.get(i)); 
                        found++;   
                    } 
                }
                if(found == 0){
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum gato com esse código.\n Tente novamente");
                }
            }
            else if(resp == 2){
                Collections.sort(listaNomeGatos);
                String nomesOrdenados = "";
                for (String elemento : listaNomeGatos) {
                    nomesOrdenados = nomesOrdenados + elemento + "\n";
                }
                JOptionPane.showMessageDialog(null, "Gatos em ordem alfabética: \n" + nomesOrdenados);
            }
            else if(resp == 3){
                int CodPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do gato que você deseja apagar os dados:"));
                int found = 0;
                for(int i = 0; i < listaGatos.size(); i++) {
                    if(CodPesquisa == listaGatos.get(i).getCodigo()){
                        JOptionPane.showMessageDialog(null, "Os dados do gato " + listaGatos.get(i).getName() + " foram apagados");
                        listaGatos.remove(i);
                        found++;   
                    } 
                }
                if(found == 0){
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum gato com esse código.\n Tente novamente");
                }
            }
            else if(resp == 4){
                String nomePesquisa = JOptionPane.showInputDialog("Digite o nome do gato que você deseja buscar:"); 
                int found = 0;
                for(int i = 0; i < listaGatos.size(); i++) {
                    if(nomePesquisa.equals(listaGatos.get(i).getName())){
                        JOptionPane.showMessageDialog(null, "O gato " + nomePesquisa + " é o " + (i+1) + "° na listagem"); 
                        found++;   
                    } 
                }
                if(found == 0){
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum gato com esse nome.\n Tente novamente");
                }

            }
            else if(resp == 5){
                int idadePesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade que você deseja saber a "+ 
                "quantidade de vezes que ela se repete?:"));
                int found = 0;
                for(int i = 0; i < listaGatos.size(); i++) {
                    if(idadePesquisa == listaGatos.get(i).getIdade()){
                        found++;   
                    } 
                }
                if(found == 0){
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum gato com essa idade.\n Tente novamente");
                }
                if(found > 0){
                    JOptionPane.showMessageDialog(null, "A idade " + idadePesquisa + " apareceu " + found +" vez(es) na listagem");
                }
            }
            else if(resp == 6){
                float valorTotal = 0;
                for(int i = 0; i < listaGatos.size(); i++) {
                     valorTotal = valorTotal +listaGatos.get(i).getValor();
                }
                JOptionPane.showMessageDialog(null, "O valor total dos atendimentos é de: " + valorTotal );
                
            }
            else if(resp == 999){
                Continue = false;
            }

        }
     
    }
    
}
