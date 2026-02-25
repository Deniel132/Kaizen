import java.math.BigDecimal;

public class Contas {

	private String 		numeroDaAgencia;
	private String 		numeroDaConta;
	private String 		nomeDoTitular;
	private BigDecimal 	saldo;
	private String 		Status;

	public Contas(String numeroDaAgencia, String numeroDaConta, String nomeDoTitular, BigDecimal saldo, String status) {
		this.numeroDaAgencia = numeroDaAgencia;
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
		this.Status = status;
	}

	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void setNumeroDaAgencia(String numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
