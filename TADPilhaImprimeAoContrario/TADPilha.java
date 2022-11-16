public class TADPilha
{
    //Cria os atributos que receberão seus devidos valores
    int capacidade;
    int topo;
    int dados[];
    
    //Fala o que fazer se a Pilha estiver cheia
    boolean cheia(){
        return (topo == capacidade - 1);
    }
    
    //Empilha os elementos
    void empilha (int d){
        cheia();
        topo++;
        dados[topo] = d;
    }
    
    //Imprime os elementos
    void imprime(){
        for (int i=0; i<=topo; i++)
            System.out.println(dados[i]);
    }
    
    //Imprime os elementos na ordem contrária
    void imprimeaocontrario(){
        for (int i=topo; i>=0; i--
        )
            System.out.println(dados[i]);
    }
    
    //Define os valores da capacidade, do topo e dos dados
    TADPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int[c];
    }
}
