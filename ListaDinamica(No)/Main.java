package No;

public class Main {
    
    public static void main (String arg[]) {
        No n;
        Lista l = new Lista();
        
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

        l.imprime();
    }
    
    
}
