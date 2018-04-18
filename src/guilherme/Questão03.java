package guilherme;

import java.util.Scanner;

/**
 * @author Guilherme de Lima Marinho
 *3.Crie um programa que receba 10 valores e depois permita 
 *que seja feita uma pesquisa por tal valor, ordene a lista e fa�a uma pesquisa Bin�ria 
 *de forma que ela retorne o indice se o mesmo existir no array.
 */
public class Quest�o03 {
private static Scanner leitor;
	
	public static void main(String[] args) {
		
		int [] meuArray;
		meuArray = new int[10];
		int contador;
		int valor;
		int aux = 0;
		
		
		leitor = new Scanner(System.in);
		System.out.println("Informe valores para preenchimento");
		
		for(contador = 10; contador > 0; contador--) {
			System.out.println("Faltam " + contador + " Valore(s)");
			System.out.println("Informe um valor:");
			valor = leitor.nextInt();
			meuArray[aux] = valor;
			aux++;
		}
		/**
		 * Recebe os 10 valores e posiciona 
		 * em posi��es diferentes do Array
		 * 
		 */
		
		valor = 0;
		contador = 0;
		while(contador == 0) {
			System.out.println("Digite um valor para procurar dentro do Array: ");
			valor = leitor.nextInt();
			
			for(aux = 0; aux < 10 ; aux++){
				if(meuArray[aux] == valor){
					System.out.println("O valor " + valor + " est� presente na lista, na posi��o: " + aux);
				}
			}
			
			
			System.out.println("Deseja procurar mais um valor na lista?");
			System.out.println("0 - Sim");
			System.out.println("1 - N�o");
			contador = leitor.nextInt();
		}
		
		System.out.println("Obrigado por utilizar nossos servi�os !");
	}
}