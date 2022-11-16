package TADFila;

public class TADFilaPessoa{
    
    int fim;
    int inicio;
    int capacidade = 7;
    Pessoa dados[];

     
    public TADFilaPessoa(){
        this.fim = -1;
        this.inicio = -1;
        this.dados = new Pessoa[capacidade];
    }


	  public boolean enfila (Pessoa p) {
      if(!cheia()){
        fim++;
	      dados[fim] = p;
        return true;
      }
      return false;
	   }

   
    public Pessoa desenfila (){
      Pessoa p = null;
      if(!vazia()){
        inicio++;
        p = dados[inicio];
        }
      return p;
    }


    public void imprime () {
	    for (int i= inicio+1; i<=fim ; i++){
	        dados[i].imprime();
        }
	  }
      
    void desmembra(TADFilaPessoa idoso, TADFilaPessoa naoidoso){
        for (int i= inicio+1; i<=fim ; i++){
            if (dados[i].idade >= 60){
                idoso.enfila(desenfila());
            }else{
                
                naoidoso.enfila(desenfila());
            }  
        }
    }
      
    
	   public boolean cheia() {
	       return (fim == capacidade);
	   }

    
     public boolean vazia(){
       return (fim <= inicio);
     }

    
    public int conta(){
      return (fim - inicio);
    }
	
}
