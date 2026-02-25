import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Saque {

	private BigDecimal Valor;
	private BigDecimal ValorNoCaixa = BigDecimal.valueOf(0);

	private final HashMap<BigDecimal,Integer> ValoresDisponiveis = new LinkedHashMap<>();

	HashMap<BigDecimal,Integer> saqueDoDinheiro = new LinkedHashMap<>();

	public Saque(BigDecimal saqueDinheiro){

		this.Valor = saqueDinheiro;
		ValoresDisponiveis.put(BigDecimal.valueOf(200),2);
		ValoresDisponiveis.put(BigDecimal.valueOf(100),2);
		ValoresDisponiveis.put(BigDecimal.valueOf(50),5);
		ValoresDisponiveis.put(BigDecimal.valueOf(20),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(10),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(5),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(2),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(1),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(0.50),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(0.25),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(0.10),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(0.05),20);
		ValoresDisponiveis.put(BigDecimal.valueOf(0.01),20);


		for (BigDecimal b : ValoresDisponiveis.keySet()){
			saqueDoDinheiro.put(b,0);
			ValorNoCaixa = ValorNoCaixa.add(BigDecimal.valueOf(ValoresDisponiveis.get(b)).multiply(b));
		}
	}

	private boolean ValidaSaque(){
		return ValorNoCaixa.compareTo(Valor) > 0;
	}



	private HashMap<BigDecimal,Integer> calculaDinheiro(){



			int NotasDisponivel;


			for (Map.Entry<BigDecimal, Integer> m : ValoresDisponiveis.entrySet()) {
				NotasDisponivel = m.getValue();
				if (m.getValue() > 0) {
					while (Valor.compareTo(m.getKey()) >= 0 && NotasDisponivel > 0) {
						saqueDoDinheiro.put(m.getKey(), saqueDoDinheiro.get(m.getKey()) + 1);
						Valor = Valor.subtract(m.getKey());
						NotasDisponivel--;
					}
				} else {
					break;
				}
			}
			return saqueDoDinheiro;

	}

	public void MostrarValores(){

		if(ValidaSaque()) {
			for (Map.Entry<BigDecimal,Integer> Saida : calculaDinheiro().entrySet()){
				if (Saida.getValue() > 0){
					System.out.println("Valor: " + Saida.getKey().toString().trim() + "\tQuant: " + Saida.getValue());
				}
			}
		}else{
			System.out.println("Valor de saque superior ao disponivel");
		}

	}


}
