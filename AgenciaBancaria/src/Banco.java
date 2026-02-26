import java.math.BigDecimal;
import java.util.ArrayList;

public class Banco {

	private static final ArrayList<Contas> contasNoBanco = new ArrayList<>();
	private final ColetaDeInformacoes pegarInfo = new ColetaDeInformacoes();
	Status status = Status.deint(3);


	public ArrayList<Contas> getContasNoBanco(){
		return contasNoBanco;
	}

	public void setContasNoBanco(){
		pegarInfo.ColetaInclusaoExclusao(5);
		status = Status.deint(1);

		Contas c = new Contas(pegarInfo.getNumeroDaConta(), pegarInfo.getNumeroDaAgencia(),pegarInfo.getNomeDoTitular(),pegarInfo.getSaldoEmConta(),status);
		if (acharConta(pegarInfo.getNumeroDaConta(), pegarInfo.getNumeroDaAgencia()) != null){
			System.out.println("Conta ja Cadastrada");
		}else{
			contasNoBanco.add(c);
		}

	}


	public void removerConta(){
		pegarInfo.ColetaInclusaoExclusao(4);
		status = Status.deint(2);

		Contas contaARemover = acharConta(pegarInfo.getNumeroDaConta(), pegarInfo.getNumeroDaAgencia());
		if (contaARemover != null){
			if (contaARemover.getSaldo().compareTo(BigDecimal.ZERO) > 0){
				contaARemover.setStatus(status);
			}else {
				contasNoBanco.remove(contaARemover);
			}
		}
	}

	public Contas acharConta(String numeroDaConta, String numeroDaAgencia){
		Contas conta;
			conta = contasNoBanco.stream()
					.filter(contas -> contas.getNumeroDaConta().equals(numeroDaConta) && contas.getNumeroDaAgencia().equals(numeroDaAgencia))
					.findFirst().orElse(null);
			return conta;
	}

	public boolean validaContaAchada(Contas c) {
		boolean verificacao = false;
		status = Status.deint(1);

		if (c != null) {
			if (c.getStatus().equals(status)) {
				verificacao = true;
			}
		}
		return verificacao;
	}

	public boolean verificaContasNaLista(){
		return contasNoBanco.isEmpty();
	}

	public void ListarContas(){

		System.out.println("\n============================");
		contasNoBanco
				.forEach(contas ->
						System.out.println("Nome: " + contas.getNomeDoTitular() + " | Banco: " + contas.getNumeroDaConta()  + " | Agencia: " + contas.getNumeroDaAgencia() + " | Saldo: " + contas.getSaldo() + " | Status:  " + contas.getStatus()));

		System.out.println("============================\n");
	}

}
