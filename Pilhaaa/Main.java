package Pilhaaa;

public class Main
{
	public static void main(String[] args) {

		TADPilha p = new TADPilha(8);
		
		System.out.println("Valores Empilhados: \n");
		p.empilha(1);
		p.empilha(2);
		p.empilha(3);
		p.empilha(4);
		p.empilha(5);
		p.imprime();

	}
}
