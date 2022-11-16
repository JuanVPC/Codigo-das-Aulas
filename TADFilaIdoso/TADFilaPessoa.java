package TADFila;

public class TADFilaPessoa{
    
    //Cria os atributos que receberão seus devidos valores
    int fim;
    int inicio;
    int capacidade = 7;
    Pessoa dados[];

    //
    public TADFilaPessoa(){
        this.fim = -1;
        this.inicio = -1;
        this.dados = new Pessoa[capacidade];
    }

    //Enfileira as pessoas
    public boolean enfila (Pessoa p) {
       if(!cheia()){
          fim++;
          dados[fim] = p;
       return true;
       }
       return false;
    }

    //Desenfileira as Pessoas
    public Pessoa desenfila (){
      Pessoa p = null;
      if(!vazia()){
        inicio++;
        p = dados[inicio];
        }
      return p;
    }

    //Imprime as pessoas 
    public void imprime () {
	    for (int i= inicio+1; i<=fim ; i++){
	        dados[i].imprime();
        }
	  }
    //Separa os idosos dos não idosos
    void desmembra(TADFilaPessoa idoso, TADFilaPessoa naoidoso){
    for (int i= inicio+1; i<=fim ; i++){
         if (dados[i].idade >= 60){
                idoso.enfila(desenfila());
         }
	 else{
                naoidoso.enfila(desenfila());
             }  
         }
    }
	
    //Fala o que fazer se a Fila estiver cheia
    public boolean cheia() {
       return (fim == capacidade);
    }

    //Fala o que fazer se a Fila estiver vazia
    public boolean vazia(){
        return (fim <= inicio);
    }

    //Define o valor de conta
    public int conta(){
       return (fim - inicio);
    }
	
}
