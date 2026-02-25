import java.util.ArrayList;

public class Moedas {

	private Integer ParteDecimal;
	private int MoedasDe1NoCaixa;

	private ArrayList<Moeda> moedas = new ArrayList<>();

	public Moedas(Integer ParteDecimal,int MoedasDe1){

		this.ParteDecimal = ParteDecimal;
		moedas.add(new Moeda("Moeda De 1....: ",MoedasDe1,20));
		moedas.add(new Moeda("Moeda De 0,50.: ",0,20));
		moedas.add(new Moeda("Moeda De 0,25.: ",0,20));
		moedas.add(new Moeda("Moeda De 0,10.: ",0,20));
		moedas.add(new Moeda("Moeda De 0,05.: ",0,20));
		moedas.add(new Moeda("Moeda De 0,01.: ",0,20));
	}
	public void ContaMoedas(){
		int index = 0;

		do {
			if (ParteDecimal >= 50){
				index = 1;
				ParteDecimal -= 50;
			} else if (ParteDecimal >=25) {
				index = 2;
				ParteDecimal -= 25;
			} else if (ParteDecimal >= 10) {
				index = 3;
				ParteDecimal -= 10;
			} else if (ParteDecimal >= 5) {
				index = 4;
				ParteDecimal -= 5;
			} else if (ParteDecimal > 0) {
				index = 5;
				ParteDecimal -= 1;
			}else{
				break;
			}
			moedas.get(index).setQuantidade(moedas.get(index).getQuantidade() + 1);
			moedas.get(index).setTotalNoCaixa(moedas.get(index).getTotalNoCaixa() - 1);

		}while (ParteDecimal > 0);

	}

	public void MostrarMoedas(){
		for (int i = 0; i < 6; i++) {
			System.out.println(moedas.get(i).getValor() + moedas.get(i).getQuantidade());
		}
	}

	public int getMoedasDe1NoCaixa() {
		return MoedasDe1NoCaixa;
	}

	public void setMoedasDe1NoCaixa(int moedasDe1NoCaixa) {
		MoedasDe1NoCaixa = moedasDe1NoCaixa;
	}
}
