import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite O Valor A ser Sacado: ");
		BigDecimal Valor = scanner.nextBigDecimal();

		scanner.nextLine();


		Integer ParteInteira = Valor.intValue();
		Integer ParteDecimal = BigDecimal.valueOf(Valor.doubleValue() - Valor.intValue()).movePointRight(2).intValue();
		System.out.println(ParteDecimal);
		System.out.println(ParteInteira);


		Cedulas notas = new Cedulas(ParteInteira);
		Moedas moeda = new Moedas(ParteDecimal, notas.getMoedasDe1());

		notas.ContaCedulas();
		notas.MostrarCedulas();

		System.out.println("\n=================\n");
		moeda.ContaMoedas();
		moeda.MostrarMoedas();



	}
}