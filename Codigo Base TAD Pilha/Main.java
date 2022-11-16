package Pilhaaa;

public class Main
{
	public static void main(String[] args) {
                
		//Define o numero máximo de elementos na Pilha
		TADPilha p = new TADPilha(8);
		
		
		System.out.println("Valores Empilhados: \n");
		
		//Vai empilhar os números de 1 a 5
		p.empilha(1);
		p.empilha(2);
		p.empilha(3);
		p.empilha(4);
		p.empilha(5);
		
		//Vai imprimir os valores empilhados
		p.imprime();

	}
}
