import java.math.BigDecimal;

public class Operacoes {

	private boolean saqueRealizado;
	private boolean depositoRealizado;
	private boolean transassaoRealizada;

	private BigDecimal valorDoSaqueDaTransferencia;
	private BigDecimal valorDoDepositoDaTransferencia;
	private Contas contaDoSaque;
	private Contas contaDoDeposito;

	private final Banco NovoBanco = new Banco();
	private final ColetaDeInformacoes pegarInfo = new ColetaDeInformacoes();




	public void EscolhaDeOperacao(int opcao){

		if (NovoBanco.verificaContasNaLista()){
			System.out.println("Lista Vasia, Obrigatorio Cadastro Primeiro");
			opcao = 5;
		}

		Escolhas escolhas = Escolhas.deint(opcao);

		switch (escolhas) {
			case SAQUE:
					Saque();
				if (saqueRealizado){
					System.out.println("Saque Feito");
					contaDoSaque.exibirRelatorio();
				}
				break;
			case DEPOSITO :
				Deposito();
				if (depositoRealizado){
					System.out.println("Deposito Feito");
					contaDoDeposito.exibirRelatorio();
				}
				break;
			case TRANSFERIR :
				Transferir();
				if (transassaoRealizada){
					System.out.println("Transferencia realisada");
					contaDoSaque.exibirRelatorio();
					contaDoDeposito.exibirRelatorio();
				}
				break;
			case FECHARCONTA :
				NovoBanco.removerConta();
				break;
			case ABRIRCONTA :
				NovoBanco.setContasNoBanco();
				break;
			case LISTARCONTAS :
				NovoBanco.ListarContas();
				break;
		}
	}



	public void Saque(){



		pegarInfo.ColetaSaqueDeposito();

		valorDoSaqueDaTransferencia = pegarInfo.getValor();
		saqueRealizado = false;
		Contas contaParaSaque = NovoBanco.acharConta(pegarInfo.getNumeroDaConta(), pegarInfo.getNumeroDaAgencia());

		if (NovoBanco.validaContaAchada(contaParaSaque)){
			if (contaParaSaque.getSaldo().compareTo(pegarInfo.getValor()) >= 0) {
					contaParaSaque.setSaldo(contaParaSaque.getSaldo().subtract(pegarInfo.getValor()));
					contaDoSaque = contaParaSaque;
					saqueRealizado = true;
			}else {
				System.out.println("Saldo Insulficiente");
			}
		}else{
			System.out.println("Conta Nao Encontrada");
		}

	}

	public void Deposito(){


		pegarInfo.ColetaSaqueDeposito();

		valorDoDepositoDaTransferencia = pegarInfo.getValor();
		depositoRealizado = false;
		Contas contaParaDeposito = NovoBanco.acharConta(pegarInfo.getNumeroDaConta(), pegarInfo.getNumeroDaAgencia());

		if (NovoBanco.validaContaAchada(contaParaDeposito)){
			contaParaDeposito.setSaldo(contaParaDeposito.getSaldo().add(pegarInfo.getValor()));
				contaDoDeposito = contaParaDeposito;
				depositoRealizado = true;
		}else{
			System.out.println("Conta Nao Encontrada");
		}

	}

	public void Transferir(){

		transassaoRealizada = false;

		Saque();
		Deposito();

		if (saqueRealizado && depositoRealizado && valorDoSaqueDaTransferencia.compareTo(valorDoDepositoDaTransferencia) == 0 && contaDoSaque != contaDoDeposito){
			transassaoRealizada = true;
		}else {
			System.out.println("Transferencia nao Autorisada");
			if (saqueRealizado) {
				contaDoSaque.setSaldo(contaDoSaque.getSaldo().add(valorDoSaqueDaTransferencia));
			} else if (depositoRealizado) {
				contaDoDeposito.setSaldo(contaDoDeposito.getSaldo().subtract(valorDoDepositoDaTransferencia));
			}

		}

	}





}
