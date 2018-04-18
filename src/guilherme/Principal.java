[10:55, 18/4/2018] Guilherme Unipe: import java.util.Scanner;
/**
 * @author Guilherme de Lima Marinho
 * 
 */
public class Principal {
	
	private static void main(String[] args) {
		Menu menu = new Menu();
		ManipulaVetores manipulaVetores = new ManipulaVetores();
		int opcao =0;
		
		while (true){
			menu.menu();
			opcao = manipulaVetores.obterValor();
		
			switch(opcao) {
		
			case 1:
				vetor = manipulaVetores.inicializarVetor();
				break;
		
			case 2:
				menu.menuImpressao();
				int tipo = manipulaVetores.obterValor();
				manipulaVetores.imprimirVetor(vetor, tipo);
				break;
		
			case 9;
				System.exit(0);
		
			default:
			
				break;
		}
	}

	}
}
[10:55, 18/4/2018] Guilherme Unipe: import java.util.Arrays;//API para manipulação de Arrays

/**
 * @author Guilherme de Lima Marinho.
 * Questões:
 *1.Crie um array de inteiros com 300 posições e preencha todos com o valor 45.
 *2.Imprima todos os valores da questão anterior de 3 formas diferentes.
 */
public class Questão01e02 {
	public static void main(String[] args) {
		/**
		 * Função onde será realizado
		 * todos os processos referentes a questão
		 */
		
		int [] meuArray;
		int i;
		meuArray = new int[300];
		
		Arrays.fill(meuArray, 45);//
		/**
		 * Questão número 1 feita
		 * Array de tamanho 300 preenchido com o número 45
		 */
		System.out.println("Primeira Impressão");
		for(i=0; i < 300; i++){
			System.out.print(meuArray[i] + " ");
		}
		System.out.println(" ");
		
		System.out.println("Segunda Impressão: ");
		for(i=0; i < 300; i++){
			System.out.print(meuArray[i] + "///");
		}
		System.out.println(" ");

		System.out.println("Terceira Impressão: ");
		i = 0;
		while (i < 300){
			System.out.print(meuArray[i] + "-");
			i++;
		}
		/**
		 * Questão número 2 feita
		 * Impressão de Array de 3 formas distintas
		 */
	}
}