public class Contas {
	private Float Saldo;
	private String Nome;
	private String Tipo;
	private boolean Status;

	public Contas(String Tipo, Float Saldo){
		setTipo(Tipo);
		setSaldo(Saldo);
	}

	public void AbrirConta(){
		this.Status = true;
		if (getTipo().equals("corrente")){
			Saldo += 50;
		} else if (getTipo().equals("polpanca")) {
			Saldo += 150;
		}
	}

	public void FecharConta(){
		this.Status = false;

	}

	public void Depositar(Float Valor){
		setSaldo(getSaldo() + Valor);
	}

	public void Sacar(Float Valor){
		if (getTipo().equals("corrente")){
			if (getSaldo() - Valor < -1000){
				System.out.println("Operacao Invalida");
			}else{
				this.setSaldo(getSaldo() - Valor);
			}
		}else {
			if (getSaldo() - Valor <= 0){
				System.out.println("Operacao Invalida");
			}else{
				this.setSaldo(getSaldo() - Valor);
			}
		}


	}

	public void setSaldo(Float saldo) {
		Saldo = saldo;
	}

	public Float getSaldo() {
		return Saldo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public boolean VerificaConta() {
		return Status;
	}

	public void SaldoAtual(){
		System.out.println("Saldo Atual: " + this.Saldo);
	}

	public void PagamentoMensal(String Tipo){
		if(Status){
			if (Tipo.equals("corrente")) {
				System.out.println("Valor Mensal: 24.5");
			} else {
				System.out.println("Conta Isenta De Pagamentos mensais ");
			}
		}else{
			if (getSaldo() > 0) {
				System.out.println("Conta Desativada com " + getSaldo() + " A Receber");
			}else {
				System.out.println("Conta Desativada com " + getSaldo() + " A Pagar");
			}


		}
	}
}
