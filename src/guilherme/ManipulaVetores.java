package guilherme;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Guilherme de Lima Marinho
 * 
 */

public class ManipulaVetores {
	private Scanner leitor;


	public int[] inicializarVetor(){
		System.out.println("Incializarndo vetor");
		int valor = obterValor();
		int[] retorno = new int[valor];
		System.out.println("Vetor inicializado com " + valor + "elementos");
		return retorno;
		}
		
	public int[] preencherVetor(int[]vetor, int valor){
		/*for (int cont = 0; cont<vetor.length; cont ++{
		vetor[cont]= valor;
		}*/
		Arrays.fill (vetor, valor);
		return vetor;
		}
		/**
		* @param vetor
		* @param tipo 1 - For | 2 - While |3 - ArraysToString
		* 
		*/
		
	public void imprimirVetor(int[] vetor, int tipo){
		int i;
		if (tipo == 1) {
		
			for( i = 0; i < vetor.length; i++){
		
				System.out.println(vetor[i]);
		}
		} 
		
		if (tipo == 2) {
		i = 0;
		
		while(i < vetor.length){
		System.out.println(vetor[i]);
		i++;
		}
		}
		
		if (tipo == 3) System.out.println(Arrays.toString(vetor));
		}
		
	public int consultarElemento(int[] vetor, int elementoBusca){
		for (int i =0; i <vetor.length;){
		
			if(vetor[i]== elementoBusca);
		return i;
		}
		return -1;
		}


		public int obterValor(){
		
			int valor = -1;
		
			leitor = new Scanner(System.in);
		
			System.out.println("Informe um numero");
		
			while(true){
		
				valor = leitor.nextInt();
		
		if (valor>0)
			return valor;
		else
		System.out.println("informe um valor maior que zero");
		}

	}

}