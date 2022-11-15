public class TadFilaPessoaCircular {
    
    int fim;
    int inicio;
    int capacidade = 6;
    Pessoa dados[];

    public TadFilaPessoaCircular(){
        this.fim = 0;
        this.inicio = 0;
        this.dados = new Pessoa[capacidade];
    }

    public boolean enfileira (Pessoa p) {
      if(!cheia()){
        fim = (fim+1)%capacidade;
        dados[fim] = p;
        return true;
      }
      return false;
	}

    public Pessoa desenfileira (){
      Pessoa p = null;
      if(!vazia()){
        inicio = ((inicio + 1) % capacidade);
        p = dados[inicio];
      }
      return p;
    }

    public void imprime () {
        int posicao;
	    for (int i= 1; i<=conta() ; i++){
	        posicao = (inicio+i) % capacidade;
	        dados[posicao].imprime();
        }
    }
      
  /*  void desmembra(TadFilaPessoa idoso, TadFilaPessoa naoidoso){
        for (int i= inicio+1; i<=fim ; i++){
            if (dados[i].idade >= 60) idoso.enfileira(desenfileira());
            else                   naoidoso.enfileira(desenfileira());
        }
    }
  */
  
    public boolean cheia() {
        return (inicio == (fim+1)%capacidade);
    }

    public boolean vazia(){
       return (fim == inicio);
    }
 
    public int conta(){
        int ret;
        if (inicio < fim) 
            ret = fim - inicio;
        else
            ret = capacidade - inicio + fim;
        return (ret);
    }
}