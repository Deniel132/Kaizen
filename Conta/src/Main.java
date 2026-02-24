import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String Tipo;

		do {
			System.out.print("Digite O Tipo Da Conta: [ Corrente | Polpanca]: ");
			Tipo    = scanner.nextLine().toLowerCase();

			if (!(Tipo.equals("corrente") || Tipo.equals("polpanca"))){

				System.out.println("Tipo De Conat Invalido ");
			}

		}while (!(Tipo.equals("corrente") || Tipo.equals("polpanca")));

		System.out.print("Digite O Nome Do Proprietario Da Conta: ");
		String Nome   = scanner.nextLine();

		System.out.print("Digite O Saldo Da Conta: ");
		Float Saldo    = scanner.nextFloat();
		scanner.nextLine();

		Contas conta = new Contas(Tipo,Saldo);
		conta.setNome(Nome);
		conta.AbrirConta();
		conta.SaldoAtual();

		String Escolha;
		String Sair;
		float Valor;


		System.out.println("\n===========================");

		do {

			System.out.print("Deseja: ( 1 - Sacar  | 2 - Depositar | 3 - FeharConta | 4 - AbrirConta): ");
			Escolha = scanner.nextLine().toLowerCase();

			switch (Escolha){
				case "1":
				case "sacar":
					if (conta.VerificaConta()) {
						System.out.print("Digite O Valor A Sacar: ");
						Valor = scanner.nextFloat();


						conta.Sacar(Valor);
						conta.SaldoAtual();
					}else {
						System.out.println("Conta Desativada");
					}

					scanner.nextLine();
					break;

				case "2":
				case "depositar":

					if (conta.VerificaConta()) {
						System.out.print("Digite O Valor A Depositar: ");
						Valor = scanner.nextFloat();


						conta.Depositar(Valor);
						conta.SaldoAtual();

						scanner.nextLine();
					}else {
						System.out.println("Conta Desativada");
					}


					break;

				case "3":
				case "fecharconta":

					if (conta.VerificaConta()) {
						conta.FecharConta();
						System.out.println("Conta De " + conta.getNome() + " Desativada");
					}else {
						System.out.println("Conta Ja Desativada");
					}
					break;

				case "4":
				case "abirconta":

					if (!conta.VerificaConta()) {
						conta.AbrirConta();
						System.out.println("Conta  De " + conta.getNome() + " Reativada" );
					}else {
						System.out.println("Conta Ja Ativa");
					}

					break;

				default:
					System.out.println("Opcao Invalida");
					break;
			}


			System.out.println("\n============================");
			System.out.print("Deseja Faser Nova Operacao: [ 1-SIM | 2-NAO]:  ");
			Sair = scanner.nextLine().toUpperCase();

			System.out.println("\n============================");

		}while (Sair.equals("SIM") || Sair.equals("1"));

		conta.PagamentoMensal(Tipo);
	}
}