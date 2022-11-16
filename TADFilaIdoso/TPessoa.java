package TADFila;


class Pessoa{
    
   //Atributos das Pessoas
   int idade;
   char sexo;
   String nome;

   //Construtor dos atributos das pessoas
   public Pessoa(int i, char s, String n){
      idade = i;
      sexo = s;
      nome = n;
   }
   
   ////Define o que será impresso
   void imprime(){
       System.out.println("Nome: " + nome +", Idade: "+ idade + ", anos" + ", Sexo: "+ sexo); 
   }

}
