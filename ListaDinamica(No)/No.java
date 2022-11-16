package No;

public class No {

    //Cria os atributos que receberão seus devidos valores
    int dado;
    No proximo;
    
    //Construtor dos Nós
    public No (int i) {
        dado = i;
        proximo = null;
    }
    
    //Define o que será impresso
    public void imprime() {
        System.out.println("Valor Nó: " + dado);
        }
       
}
