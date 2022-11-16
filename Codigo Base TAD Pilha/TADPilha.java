package Pilhaaa;

public class TADPilha
{
    //Cria os atributos que receberão seus devidos valores
    int capacidade;
    int topo;
    int dados[];
    
    //Identifica se a Pilha está cheia
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
    
    //Define a capacidade, o topo e os dados
    TADPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int[c];
    }

}
