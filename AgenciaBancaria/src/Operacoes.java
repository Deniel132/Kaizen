import java.math.BigDecimal;


public class Operacoes {

	private boolean saqueRealizado;
	private final Banco NovoBanco = new Banco();


	public void Saque(String numeroDaConta,String numeroDaAgencia,BigDecimal Valor){

		saqueRealizado = false;
		Contas contaParaSaque = NovoBanco.acharConta(numeroDaConta,numeroDaAgencia);

		if (NovoBanco.validaContaAchada(contaParaSaque)){
			if (contaParaSaque.getSaldo().compareTo(Valor) >= 0 && contaParaSaque.getStatus().equals("Ativo")) {
				contaParaSaque.setSaldo(contaParaSaque.getSaldo().subtract(Valor));
				System.out.println("Saque Feito");
				contaParaSaque.exibirRelatorio();
				saqueRealizado = true;
			}else {
				System.out.println("Saldo Insulficiente");
			}
		}else{
			System.out.println("Conta Nao Encontrada");
		}

	}

	public void Deposito(String numeroDaConta,String numeroDaAgencia,BigDecimal Valor){
		Contas contaParaDeposito = NovoBanco.acharConta(numeroDaConta,numeroDaAgencia);

		if (NovoBanco.validaContaAchada(contaParaDeposito)){
			contaParaDeposito.setSaldo(contaParaDeposito.getSaldo().subtract(Valor));
				System.out.println("Deposito Feito");
				contaParaDeposito.exibirRelatorio();
		}else{
			System.out.println("Conta Nao Encontrada");
		}

	}

	public void Transferir(String numeroContaAtranferir,String numeroAgAtransferir,String numeroContaAReceber,String numeroAgAReceber,BigDecimal valor){

		if (NovoBanco.validaContaAchada(NovoBanco.acharConta(numeroContaAReceber,numeroContaAReceber))) {
			Saque(numeroContaAtranferir, numeroAgAtransferir, valor);
		}
		if (saqueRealizado){
			Deposito(numeroContaAReceber,numeroAgAReceber,valor);
		}

	}



}
