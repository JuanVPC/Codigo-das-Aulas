package No;

public class Main {
    
    public static void main (String arg[]) {
        
        //Possibilita a criação de Nós
        No n;
        
        //Cria uma Lista
        Lista l = new Lista();
        
        //Cria os Nós
        n = new No (22);
        l.insereNoFinal (n);
        
        n = new No (47);
        l.insereNoFinal (n);

        n = new No (55);
        l.insereNoFinal (n);

        n = new No (24);
        l.insereNoFinal (n);

        n = new No (97);
        l.insereNoFinal (n);
        
        //Imprime os elementos da Lista
        l.imprime();
    }
    
    
}
