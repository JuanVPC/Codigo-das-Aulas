package TADFila1;

public class TADFilaPessoa {

    // Atributos	
       int capacidade;
       int inicio;
       int fim;
       Pessoa dados[];
     
       //Construtor
       public TADFilaPessoa(int t) {
         capacidade = t;
         inicio = -1;
         fim = -1;
         dados = new Pessoa [capacidade];
       }      
    
       //Enfileira
       public boolean enfileira (Pessoa p) {
         fim++;
         dados[fim] = p;
         return true;
       }

       //Imprime
       public void imprime () {
           for (int i=inicio+1; i<=fim; i++)
               dados[i].imprime();
       }
     
 }