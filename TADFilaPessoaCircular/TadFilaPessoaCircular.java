public class TadFilaPessoaCircular {
    
    //Cria os atributos que receberão seus devidos valores
    int fim;
    int inicio;
    int capacidade = 6;
    Pessoa dados[];
    
    //Define os valores de fim, inicio e dados
    public TadFilaPessoaCircular(){
        this.fim = 0;
        this.inicio = 0;
        this.dados = new Pessoa[capacidade];
    }
 
    //Enfileira as pessoas
    public boolean enfileira (Pessoa p) {
      if(!cheia()){
        fim = (fim+1)%capacidade;
        dados[fim] = p;
        return true;
      }
      return false;
	}

    //Desenfileira as Pessoas
    public Pessoa desenfileira (){
      Pessoa p = null;
      if(!vazia()){
        inicio = ((inicio + 1) % capacidade);
        p = dados[inicio];
      }
      return p;
    }

    //Imprime as pessoas
    public void imprime () {
        int posicao;
	    for (int i= 1; i<=conta() ; i++){
	        posicao = (inicio+i) % capacidade;
	        dados[posicao].imprime();
        }
    }
  
    //Fala o que fazer se a Fila estiver cheia
    public boolean cheia() {
        return (inicio == (fim+1)%capacidade);
    }

    //Fala o que fazer se a Fila estiver vazia
    public boolean vazia(){
       return (fim == inicio);
    }
 
    //Define o valor de conta
    public int conta(){
        int ret;
        if (inicio < fim) 
            ret = fim - inicio;
        else
            ret = capacidade - inicio + fim;
        return (ret);
    }
}
