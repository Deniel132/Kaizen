import java.math.BigDecimal;
import java.util.Scanner;

public class ColetaDeInformacoes {
	Scanner scanner = new Scanner(System.in);


	private String numeroDaConta;
	private String numeroDaAgencia;
	private String nomeDoTitular;
	private BigDecimal SaldoEmConta;
	private BigDecimal valor;



	public void ColetaSaqueDeposito(){

			System.out.println("\n============================");

			System.out.print("Digite o Numero Da Conta...: ");
			setNumeroDaConta(scanner.nextLine());

			System.out.print("Digite o Numero Da Agencia.: ");
			setNumeroDaAgencia(scanner.nextLine());

			System.out.print("Digite o Valor Da Operacao: ");
			valor = scanner.nextBigDecimal();

			System.out.println("============================\n");
			scanner.nextLine();

	}
	public void ColetaInclusaoExclusao(int opcao){


		System.out.println("\n============================");
		System.out.print("Digite o Numero Da Conta....: ");
		setNumeroDaConta(scanner.nextLine());

		System.out.print("Digite o Numero Da Agencia..: ");
		setNumeroDaAgencia(scanner.nextLine());


		if (opcao == 5) {
			System.out.print("Digite o Nome do Titular....: ");
			nomeDoTitular = scanner.nextLine();

			System.out.print("Digite o Saldo da Conta.....: ");
			SaldoEmConta = scanner.nextBigDecimal();
		}
		System.out.println("============================\n");

		scanner.nextLine();

	}







	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void setNumeroDaAgencia(String numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}


	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public BigDecimal getSaldoEmConta() {
		return SaldoEmConta;
	}

	public void setSaldoEmConta(BigDecimal saldoEmConta) {
		SaldoEmConta = saldoEmConta;
	}
}
