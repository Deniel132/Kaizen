import java.util.Scanner;

public class MenuInicial {

	String Escolha;

	Scanner scanner = new Scanner(System.in);


	public void AbrirMenu(){



		System.out.println("============");
		System.out.print("Deseja: [ 1-Sacar | 2-Depositar | 3-Transferir | 4-FecharConta | 5-AbrirConta]: ");
		Escolha = scanner.nextLine();

	}


}
