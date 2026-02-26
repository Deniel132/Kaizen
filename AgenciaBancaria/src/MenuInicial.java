import java.math.BigDecimal;
import java.util.Scanner;

public class MenuInicial {

	private int opcao;
	private String numeroDaContaASacar;
	private String numeroDaAgenciaASacar;
	private String numeroDaContaADepositar;
	private String numeroDaAgenciaADepositar;
	private String nomeDoTitular;
	private BigDecimal SaldoEmConta;
	private BigDecimal valor;


	Scanner scanner = new Scanner(System.in);

	Banco vincularAoBanco = new Banco();
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

			Escolhas escolhas = Escolhas.deint(opcao);

			switch (escolhas) {
				case SAQUE -> menuSaque();
				case DEPOSITO -> menuDeposito();
				case TRANSFERIR -> menuTransferir();
				case FECHARCONTA -> menuFecharConta();
				case ABRIRCONTA -> menuAbrirrConta();
				case LISTARCONTAS -> menuListarContas();
				case SAIR -> menuSair();
				case INVALIDA -> menuInvalida();

			}
		}while (opcao < 7 && opcao > 0);

	}

	public void menuSaque(){
		if (!vincularAoBanco.getContasNoBanco().isEmpty()) {
			System.out.println("\n============================");

			System.out.print("Digite o Numero Da Conta: ");
			numeroDaContaASacar = scanner.nextLine();

			System.out.print("Digite o Numero Da Agencia: ");
			numeroDaAgenciaASacar = scanner.nextLine();

			System.out.print("Digite o Valor A Sacar: ");
			valor = scanner.nextBigDecimal();

			System.out.println("============================\n");

			realaizarOperacoes.Saque(numeroDaContaASacar, numeroDaAgenciaASacar, valor);
		}else {
				System.out.println("Nenhuma Conta Cadastrada");
			}
	}



	public void menuDeposito(){
		if (!vincularAoBanco.getContasNoBanco().isEmpty()) {
			System.out.println("\n============================");

			System.out.print("Digite o Numero Da Conta: ");
			numeroDaContaADepositar = scanner.nextLine();

			System.out.print("Digite o Numero Da Agencia: ");
			numeroDaAgenciaADepositar = scanner.nextLine();

			System.out.print("Digite o Valor A Depositar: ");
			valor = scanner.nextBigDecimal();

			System.out.println("============================\n");

			realaizarOperacoes.Saque(numeroDaContaADepositar,numeroDaAgenciaADepositar,valor);

		}else {
			System.out.println("Nenhuma Conta Cadastrada");
		}
	}


	public void menuTransferir(){

		if (!vincularAoBanco.getContasNoBanco().isEmpty()) {
			System.out.println("\n============================");

			System.out.print("Digite o Numero Da Conta de Origem: ");
			numeroDaContaASacar = scanner.nextLine();

			System.out.print("Digite o Numero Da Agencia de Origem: ");
			numeroDaAgenciaASacar = scanner.nextLine();

			System.out.print("Digite o Numero Da Conta de Destino: ");
			numeroDaContaADepositar = scanner.nextLine();

			System.out.print("Digite o Numero Da Agencia de Destino: ");
			numeroDaContaADepositar = scanner.nextLine();

			System.out.print("Digite o Valor A Sacar: ");
			valor = scanner.nextBigDecimal();

			System.out.println("============================\n");

			realaizarOperacoes.Transferir(numeroDaContaASacar, numeroDaAgenciaASacar, numeroDaContaADepositar, numeroDaAgenciaADepositar, valor);
		}else {
			System.out.println("Nenhuma Conta Cadastrada");
		}
	}

	public void menuFecharConta(){

		if (!vincularAoBanco.getContasNoBanco().isEmpty()) {

			System.out.println("\n============================");

			System.out.print("Digite o Numero Da Conta A Fechar: ");
			numeroDaContaASacar = scanner.nextLine();

			System.out.print("Digite o Numero Da Agencia A Fechar: ");
			numeroDaAgenciaASacar = scanner.nextLine();

			System.out.println("============================\n");


			vincularAoBanco.removerConta(numeroDaContaASacar,numeroDaAgenciaASacar);

			System.out.println("\n============================");
			System.out.println("Conta Excluida!!!");
			System.out.println("============================\n");

		}else {
			System.out.println("Nenhuma Conta Cadastrada");
		}

	}

	public void menuAbrirrConta(){

		System.out.println("\n============================");

		System.out.print("Digite o Numero Da Conta: ");
		numeroDaContaASacar = scanner.nextLine();

		System.out.print("Digite o Numero Da Agencia: ");
		numeroDaAgenciaASacar = scanner.nextLine();


		System.out.print("Digite o Nome do Titular: ");
		nomeDoTitular = scanner.nextLine();

		System.out.print("Digite o Saldo da Conta: ");
		SaldoEmConta = scanner.nextBigDecimal();

		System.out.println("============================\n");

		vincularAoBanco.setContasNoBanco(new Contas(numeroDaContaASacar,numeroDaAgenciaASacar,nomeDoTitular,SaldoEmConta,""));

		System.out.println("\n============================");
		System.out.println("Conta Criada!!!");
		System.out.println("============================\n");
	}

	public void menuInvalida(){
		System.out.println("Opcao Invalida");
	}


	public void menuListarContas(){

		System.out.println("\n============================");
		vincularAoBanco.getContasNoBanco()
				.forEach(contas ->
						System.out.println("Nome: " + contas.getNomeDoTitular() + " | Saldo: " + contas.getSaldo() + " | Status:  " + contas.getStatus()));

		System.out.println("============================\n");
	}

	public void menuSair(){

		System.out.println("\n============================");
		System.out.println("Fechnado Programa");
		System.out.println("============================\n");
	}
}
