public class TADPilha
{
    int capacidade;
    int topo;
    int dados[];
    
    boolean cheia(){
        return (topo == capacidade - 1);
    }
    
    void empilha (int d){
        cheia();
        topo++;
        dados[topo] = d;
    }
    
    void imprime(){
        for (int i=0; i<=topo; i++)
            System.out.println(dados[i]);
    }
    
    void imprimeaocontrario(){
        for (int i=topo; i>=0; i--
        )
            System.out.println(dados[i]);
    }
    
    TADPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int[c];
    }
}
