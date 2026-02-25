import java.util.ArrayList;

public class Moedas {

	private Integer ParteDecimal;
	private int MoedasDe1NoCaixa;
	private Integer ValorNoCaixa = 0;

	private ArrayList<Moeda> moedas = new ArrayList<>();

	public Moedas(Integer ParteDecimal,int MoedasDe1){

		this.ParteDecimal = ParteDecimal;
		moedas.add(new Moeda("Moeda De 0,50.: ",50,0,20));
		moedas.add(new Moeda("Moeda De 0,25.: ",25,0,20));
		moedas.add(new Moeda("Moeda De 0,10.: ",10,0,20));
		moedas.add(new Moeda("Moeda De 0,05.: ",5,0,20));
		moedas.add(new Moeda("Moeda De 0,01.: ",1,0,20));
		for (int i = 0; i < 5; i++) {
			ValorNoCaixa += moedas.get(i).getTotalNoCaixa() * moedas.get(i).getValor();
		}
	}

	public boolean ValidaSaque(){
		if (ParteDecimal > ValorNoCaixa){
			return false;
		}else {
			return true;
		}

	}

	public void ContaMoedas(){
		int index;

		if (ValidaSaque()){
			do {
				if (ParteDecimal >= 50) {
					index = 1;
					ParteDecimal -= 50;
				} else if (ParteDecimal >= 25) {
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
				} else {
					break;
				}
				moedas.get(index).setQuantidade(moedas.get(index).getQuantidade() + 1);
				moedas.get(index).setTotalNoCaixa(moedas.get(index).getTotalNoCaixa() - 1);
				setMoedasDe1NoCaixa(moedas.getFirst().getTotalNoCaixa());

			} while (ParteDecimal > 0);
		}else{
			System.out.println("Saldo Em Caixa Insulficiente Para Sacar Moedas");
		}
	}

	public void MostrarMoedas(){
		if (ValidaSaque()) {
			for (int i = 0; i < 5; i++) {
				System.out.println(moedas.get(i).getDescricao() + moedas.get(i).getQuantidade());
			}
		}
	}

	public int getMoedasDe1NoCaixa() {
		return MoedasDe1NoCaixa;
	}

	public void setMoedasDe1NoCaixa(int moedasDe1NoCaixa) {
		MoedasDe1NoCaixa = moedasDe1NoCaixa;
	}
}
