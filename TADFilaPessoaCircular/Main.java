//  30/09/22 - Código para FilaCircular

public class Main {
	
  public static void main(String[] args) {
    TadFilaPessoaCircular f = new TadFilaPessoaCircular();
    TadFilaPessoaCircular idoso = new TadFilaPessoaCircular();
    TadFilaPessoaCircular naoidoso = new TadFilaPessoaCircular();
    
    Pessoa p = new Pessoa(18, 'F', "PESSOA 1 - MARIA");
    Pessoa p2 = new Pessoa(20, 'M', "PESSOA 2 - JOAO");
    Pessoa p3 = new Pessoa(28, 'F', "PESSOA 3 - VANIA");
    Pessoa p4 = new Pessoa(20, 'F', "PESSOA 4 - VITORIA");
    Pessoa p5 = new Pessoa(62, 'M', "PESSOA 5 - FABIO");

    f.enfileira(p);
    f.enfileira(p2);
    f.enfileira(p3);
    f.enfileira(p4);
    f.enfileira(p5);

    System.out.println("Total: "+f.conta() + "\n");
    f.imprime();
    
    System.out.println ("\nDepois de retirar 3 pessoas:\n");
    
    f.desenfileira();
    f.desenfileira();
    f.desenfileira();
    
    Pessoa p6 = new Pessoa(67, 'M', "PESSOA 6 - CARLOS");
    
    f.enfileira (p6);
    
    f.imprime();

  }
}
