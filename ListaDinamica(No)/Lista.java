package No;

public class Lista {
    
    //Cria o Nó do início
    No inicio;
    
    //Faz o valor do inicio ser vázio
    public Lista(){
        inicio=null;
    }
    
    //Faz o inicio ser vázio
    public boolean vazia(){
        return(inicio==null);
    }
    
    //Imprime os Nós
    public void imprime(){
        No atual;
            atual = inicio;
            while (atual != null){
                atual.imprime();
                atual =atual.proximo;
            }
    }
    
    //Insere um Nó no final de outro Nó
    public void insereNoFinal (No aux){
        if (vazia()) {
            inicio = aux; //o aux passa a ser o primeiro
        }
        else { //tem que buscar o ultimo
            No atual;
            atual = inicio;
            while (atual.proximo != null){
                atual =atual.proximo;
            }

            atual.proximo = aux; //conecta o aux no ultimo
        }  
    }
    
}
