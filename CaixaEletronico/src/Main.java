import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite O Valor A ser Sacado: ");
		BigDecimal Valor = scanner.nextBigDecimal();

		scanner.nextLine();


		Saque saqueDinheiro = new Saque(Valor);

		System.out.println("\n=================\n");
		saqueDinheiro.MostrarValores();
		System.out.println("\n=================\n");




	}
}