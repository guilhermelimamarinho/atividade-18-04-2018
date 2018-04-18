package guilherme;

import java.util.Arrays;//API para manipula��o de Arrays

/**
 * @author Guilherme de Lima Marinho.
 * Quest�es:
 *1.Crie um array de inteiros com 300 posi��es e preencha todos com o valor 45.
 *2.Imprima todos os valores da quest�o anterior de 3 formas diferentes.
 */
public class Quest�o01e02 {
	public static void main(String[] args) {
		/**
		 * Fun��o onde ser� realizado
		 * todos os processos referentes a quest�o
		 */
		
		int [] meuArray;
		int i;
		meuArray = new int[300];
		
		Arrays.fill(meuArray, 45);//
		/**
		 * Quest�o n�mero 1 feita
		 * Array de tamanho 300 preenchido com o n�mero 45
		 */
		System.out.println("Primeira Impress�o");
		for(i=0; i < 300; i++){
			System.out.print(meuArray[i] + " ");
		}
		System.out.println(" ");
		
		System.out.println("Segunda Impress�o: ");
		for(i=0; i < 300; i++){
			System.out.print(meuArray[i] + "///");
		}
		System.out.println(" ");

		System.out.println("Terceira Impress�o: ");
		i = 0;
		while (i < 300){
			System.out.print(meuArray[i] + "-");
			i++;
		}
		/**
		 * Quest�o n�mero 2 feita
		 * Impress�o de Array de 3 formas distintas
		 */
	}
}