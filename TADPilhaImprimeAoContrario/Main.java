public class Main
{
	public static void main(String[] args) {
		
		//Define o numero máximo de elementos na Pilha
		TADPilha p = new TADPilha(100);
		
		//Da um valor para "abc"
		int abc = 100;
		
		//Define o que deverá ocorrer se o valor de abc for maior do que 0
		while(abc>0){
		    p.empilha (abc%2);
		    abc=abc/2;
		}
		
		//Imprime os elementos
		p.imprime();
		System.out.println();
		
		//Inverte a ordem de impressão dos elementos
		p.imprimeaocontrario();
	}
}
