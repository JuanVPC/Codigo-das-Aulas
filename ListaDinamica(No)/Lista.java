package No;

public class Lista {
    
    No inicio;
    
    public Lista(){
        inicio=null;
    }
    
    public boolean vazia(){
        return(inicio==null);
    }
    
    public void imprime(){
        No atual;
            atual = inicio;
            while (atual != null){
                atual.imprime();
                atual =atual.proximo;
            }
    }
    
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
