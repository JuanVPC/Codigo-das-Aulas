package TADFila1;

public class Pessoa {
    
    // Atributos
       int idade;
       char sexo;
       String nome;
       
    // Construtor
       public Pessoa (int i, char s, String n){
           idade = i;
           sexo  = s;
           nome  = n;
       }
    
    // Imprime
    void imprime() {
        System.out.println ("Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo);
    } 
    
}
