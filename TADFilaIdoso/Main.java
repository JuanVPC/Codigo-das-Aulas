package TADFila;

public class Main {
	
  public static void main(String[] args) {
    
    //Faz com que seja posssivel fazer o envileiramento através de "f" e o separamento de idoso e não idoso
    TADFilaPessoa f = new TADFilaPessoa();
    TADFilaPessoa idoso = new TADFilaPessoa();
    TADFilaPessoa naoidoso = new TADFilaPessoa();
	  
    //Cria as pessoas
    Pessoa p = new Pessoa(29, 'M', "Aiden");
    Pessoa p2 = new Pessoa(52, 'M', "Marvin");
    Pessoa p3 = new Pessoa(55, 'F', "Tanya");
    Pessoa p4 = new Pessoa(20, 'M', "Leo");
    Pessoa p5 = new Pessoa(27, 'M', "Alfred ");
    Pessoa p6 = new Pessoa(64, 'M', "Elmer ");
    
    //Enfileira as pessoas
    f.enfila(p);
    f.enfila(p2);
    f.enfila(p3);
    f.enfila(p4);
    f.enfila(p5);
    f.enfila(p6);
	  
    //Imprime o total de pessoas
    System.out.println("\nTotal : "+f.conta());
    f.imprime();

    //Separa os idosos dos não idosos
    f.desmembra(idoso,naoidoso);
    
    //Imprime os idosos
    System.out.println("\nIdosos: "+idoso.conta());
    idoso.imprime();
    
    //Imprime os não idosos
    System.out.println("\nNão idosos: "+naoidoso.conta());
    naoidoso.imprime();

    }
}
