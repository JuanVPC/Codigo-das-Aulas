public class Main {
	
  public static void main(String[] args) {
    
    //Faz com que seja posssivel fazer o enfileiramento através de "f" e o separamento de idoso e não idoso
    TadFilaPessoaCircular f = new TadFilaPessoaCircular();
    TadFilaPessoaCircular idoso = new TadFilaPessoaCircular();
    TadFilaPessoaCircular naoidoso = new TadFilaPessoaCircular();
    
    //Cria as pessoas
    Pessoa p = new Pessoa(18, 'F', "PESSOA 1 - MARIA");
    Pessoa p2 = new Pessoa(20, 'M', "PESSOA 2 - JOAO");
    Pessoa p3 = new Pessoa(28, 'F', "PESSOA 3 - VANIA");
    Pessoa p4 = new Pessoa(20, 'F', "PESSOA 4 - VITORIA");
    Pessoa p5 = new Pessoa(62, 'M', "PESSOA 5 - FABIO");
    
    //Enfileira as pessoas
    f.enfileira(p);
    f.enfileira(p2);
    f.enfileira(p3);
    f.enfileira(p4);
    f.enfileira(p5);
    
    //Imprime o total de pessoas
    System.out.println("Total: "+f.conta() + "\n");
    f.imprime();
    
    //Imprime o total de pessoas depois de desenfileirar 3
    System.out.println ("\nDepois de retirar 3 pessoas:\n");
    f.desenfileira();
    f.desenfileira();
    f.desenfileira();
    
    //Cria uma nova pessoa
    Pessoa p6 = new Pessoa(67, 'M', "PESSOA 6 - CARLOS");
    
    //Enfileira a nova pessoa
    f.enfileira (p6);
    
    //Imprime o total depois das mudanças
    f.imprime();

  }
}
