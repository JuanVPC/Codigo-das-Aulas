public class Main
{
	public static void main(String[] args) {
		TADPilha p = new TADPilha(100);
		
		int abc = 100;
		
		while(abc>0){
		    p.empilha (abc%2);
		    abc=abc/2;
		}
		
		p.imprime();
		System.out.println();
		p.imprimeaocontrario();
	}
}
