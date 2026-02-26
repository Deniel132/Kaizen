import java.math.BigDecimal;
import java.util.ArrayList;

public class Banco {

	private static final ArrayList<Contas> contasNoBanco = new ArrayList<>();


	public ArrayList<Contas> getContasNoBanco(){
		return contasNoBanco;
	}

	public void setContasNoBanco(Contas c){
		c.setStatus("Ativo");
		contasNoBanco.add(c);
	}


	public void removerConta(String numeroDaConta, String numeroDaAgencia){
		Contas contaARemover = acharConta(numeroDaConta,numeroDaAgencia);
		if (contaARemover != null){
			if (contaARemover.getSaldo().compareTo(BigDecimal.ZERO) > 0){
				contaARemover.setStatus("Desativada");
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

		if (c != null) {
			if (c.getStatus().equals("Ativo")) {
				verificacao = true;
			}
		}
		return verificacao;
	}


}
