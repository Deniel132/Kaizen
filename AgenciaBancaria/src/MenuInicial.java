
import java.util.Scanner;

public class MenuInicial {

	private int opcao;



	Scanner scanner = new Scanner(System.in);

	Operacoes realaizarOperacoes = new Operacoes();

	public void AbrirMenu(){

		do {


			System.out.println("================================================================================");
			System.out.print("Deseja: [ 1-Sacar | 2-Depositar | 3-Transferir | 4-FecharConta | 5-AbrirConta | 6-ListarContas | 7-Sair]: ");

			try {
				opcao = scanner.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("\n Digite uma Opcao valida");
			}

			scanner.nextLine();


			realaizarOperacoes.EscolhaDeOperacao(opcao);

		}while (opcao < 7 && opcao > 0);
		System.out.println("\n============================");
		System.out.println("Fechnado Programa");
		System.out.println("============================\n");
	}

}
