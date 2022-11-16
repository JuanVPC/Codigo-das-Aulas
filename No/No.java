package No;

public class No {

    //Atributos
    int dado;
    No proximo;
    
    //Construtor
    
    public No (int i) {
        dado = i;
        proximo = null;
    }
    
    public void imprime() {
    
    System.out.println("Valor Nó: " + dado);
    
    }
       
    }
