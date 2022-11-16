package TADFila1;

public class Main {

    public static void main (String arg[]) {

       TADFilaPessoa f = new TADFilaPessoa (100);
       Pessoa p;
       
       p = new Pessoa (19, 'M', "Guilherme");
       f.enfileira (p);
        
       p = new Pessoa (84, 'F', "Aliete");
       f.enfileira (p);

       p = new Pessoa (75, 'F', "Gloria");
       f.enfileira (p);
       
    
       f.imprime();
        
        
    }
}
