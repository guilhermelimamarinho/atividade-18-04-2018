package guilherme;

/**
 * @author Guilherme de Lima Marinho
 * @param <Guilherme>
 * 
 */
public class Principal{
	
	@SuppressWarnings("unused")
	private static void main(final String[] args) {
		Menu menu = new Menu();
		ManipulaVetores manipulaVetores = new ManipulaVetores();
		int opcao =0;
		
		while (true){
			menu.menu();
			opcao = manipulaVetores.obterValor();
		
			int[] vetor = null;
			switch(opcao) {
		
			case 1:
				vetor = manipulaVetores.inicializarVetor();
				break;
		
			case 2:
				menu.menuImpressao();
				int tipo = manipulaVetores.obterValor();
				manipulaVetores.imprimirVetor(vetor, tipo);
				break;
		
			case 9:
				System.exit(0);
		
			default:
			
				break;
		}
	}

	}
}
