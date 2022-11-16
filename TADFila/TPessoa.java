package TADFila;

class Pessoa{
    int idade;
    char sexo;
    String nome;

    public Pessoa(int i, char s, String n){
        idade = i;
        sexo = s;
        nome = n;
    
    }

    void imprime(){
        System.out.println("Nome: " + nome +", Idade: "+ idade + ", anos" + ", Sexo: "+ sexo);
    
    }

}
