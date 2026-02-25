import java.util.ArrayList;
import java.util.List;

public class Cedulas {

	private Integer ParteInteira;
	private int MoedasDe1 = 0;
	Moedas moeda = new Moedas(0, 0);

	private ArrayList<Cedula> cedulas = new ArrayList<>();

	public Cedulas(Integer ParteInteira){

		this.ParteInteira = ParteInteira;
		cedulas.add(new Cedula("Cedula De 200: ",0,2));
		cedulas.add(new Cedula("Cedula De 100: ",0,2));
		cedulas.add(new Cedula("Cedula De 50.: ",0,3));
		cedulas.add(new Cedula("Cedula De 20.: ",0,20));
		cedulas.add(new Cedula("Cedula De 10.: ",0,20));
		cedulas.add(new Cedula("Cedula De 5..: ",0,20));
		cedulas.add(new Cedula("Cedula De 2..: ",0,20));



	}
	public void ContaCedulas(){
		int index = 0;

		do {
			if (ParteInteira >= 200 && cedulas.get(0).getTotalNoCaixa() > 0){
				index = 0;
				ParteInteira -= 200;
			} else if (ParteInteira >= 100 && cedulas.get(1).getTotalNoCaixa() > 0) {
				index = 1;
				ParteInteira -= 100;
			} else if (ParteInteira >= 50 && cedulas.get(2).getTotalNoCaixa() > 0) {
				index = 2;
				ParteInteira -= 50;
			} else if (ParteInteira >= 20 && cedulas.get(3).getTotalNoCaixa() > 0) {
				index = 3;
				ParteInteira -= 20;
			} else if (ParteInteira >= 10 && cedulas.get(4).getTotalNoCaixa() > 0) {
				index = 4;
				ParteInteira -= 10;
			} else if (ParteInteira >= 5 && cedulas.get(5).getTotalNoCaixa() > 0) {
				index = 5;
				ParteInteira -= 5;
			} else if (ParteInteira >= 2 && cedulas.get(6).getTotalNoCaixa() > 0) {
				index = 6;
				ParteInteira -= 2;
			} else if (ParteInteira == 1 && moeda.getMoedasDe1NoCaixa() > 0) {
				ParteInteira -= 1;
				setMoedasDe1(MoedasDe1 + 1);
			}else {
				break;
			}

			cedulas.get(index).setQuantidade(cedulas.get(index).getQuantidade() + 1);
			cedulas.get(index).setTotalNoCaixa(cedulas.get(index).getTotalNoCaixa() - 1);

		}while (ParteInteira > 0);

	}

	public void MostrarCedulas(){
		for (int i = 0; i < 7; i++) {
			System.out.println(cedulas.get(i).getValor() + cedulas.get(i).getQuantidade());
		}
	}

	public int getMoedasDe1() {
		return MoedasDe1;
	}

	public void setMoedasDe1(int moedasDe1) {
		this.MoedasDe1 = moedasDe1;
	}
}
