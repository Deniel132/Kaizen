import java.util.ArrayList;

public class Banco {

	private static  ArrayList<Contas> contasNoBanco = new ArrayList<>();


	public ArrayList<Contas> getContasNoBanco(){
		return contasNoBanco;
	}

	public void setContasNoBanco(ArrayList<Contas> c){
		contasNoBanco = c;
	}


	public void removerConta(String numeroDaConta){
		for (Contas c : contasNoBanco){
			if (c.getNumeroDaConta().equals(numeroDaConta)){
				contasNoBanco.remove(c);
			}
		}

	}

}
