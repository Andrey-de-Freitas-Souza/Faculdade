class No{
    int dado;
    No anterior;
    No proximo;

    public No(int dado){
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}

public class ListaDuplamenteLigada {
    private No cabeca;
    private No cauda;

    public void InserirInicio(int dado){
        No novoNovo = new No(dado);
        novoNovo.proximo = cabeca;
        if(cabeca != null){
            cabeca.anterior = novoNovo;

        }
        cabeca = novoNovo;
        if(cauda == null){
            cauda = novoNovo;
        }
    }

    public void inserirFim(int dado){
        No novoNo = new No(dado);
        if(cauda == null){
            cabeca = novoNo;
            cauda = novoNo;
        }else{
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    
    }
    public boolean remover(int dado){
        No atual = this.cabeca;
        while(atual != null){
            if (atual.dado == dado) {
                if (atual.anterior != null) {
                    atual.anterior.proximo= atual.proximo;
                }else{
                    cabeca = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                }else {
                    cauda = atual.anterior;
                }
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    public No buscar(int dado){
        No atual = this.cabeca;
        while(atual != null){
            if(atual.dado == dado){
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }
    public void imprimirDoPrimeiro(){
        No atual = this.cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.InserirInicio(3);
        lista.InserirInicio(2);
        lista.InserirInicio(1);

        System.out.println("impressao do primeiro");
        lista.imprimirDoPrimeiro();
        if(lista.remover(2)){
            System.out.println("No removido");
        }else{
            System.out.println("No não encontrado");
        }
        lista.imprimirDoPrimeiro();
        No noEncotrado = lista.buscar(1);
        if(noEncotrado != null){
            System.out.println("No encotrado");
        }else{
            System.out.println("No não encotrado");
        }
    }

}


