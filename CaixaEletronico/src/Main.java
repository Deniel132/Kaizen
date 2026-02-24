import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int NotaDe200 	= 0;
		int NotaDe100 	= 0;
		int NotaDe50 	= 0;
		int NotaDe20 	= 0;
		int NotaDe10 	= 0;
		int NotaDe5 	= 0;
		int NotaDe2 	= 0;

		int MoedasDe1 	= 0;
		int MoedasDe05	= 0;
		int MoedasDe025 = 0;
		int MoedasDe01  = 0;
		int MoedasDe005 = 0;
		int MoedasDe001 = 0;





		System.out.print("Digite O Valor A ser Sacado: ");
		double Valor = scanner.nextDouble();
		scanner.nextLine();


		System.out.println(Valor);
		System.out.println((int)Valor);

		int ParteInteira = (int)Valor;

		Valor -= ParteInteira;

		do {
			if (ParteInteira >= 200){
				NotaDe200 += 1;
				ParteInteira -= 200;
			} else if (ParteInteira >= 100) {
				NotaDe100 += 1;
				ParteInteira -= 100;
			} else if (ParteInteira >= 50) {
				NotaDe50 += 1;
				ParteInteira -= 50;
			} else if (ParteInteira >= 20) {
				NotaDe20 += 1;
				ParteInteira -= 20;
			} else if (ParteInteira >= 10) {
				NotaDe10 += 1;
				ParteInteira -= 10;
			} else if (ParteInteira >= 5) {
				NotaDe5 += 1;
				ParteInteira -= 5;
			} else if (ParteInteira >= 2) {
				NotaDe2 += 1;
				ParteInteira -= 2;
			} else if (ParteInteira == 1) {
				MoedasDe1 += 1;
				ParteInteira -= 1;
			}


			System.out.println(ParteInteira);
		}while (ParteInteira > 0);

		System.out.println();

		do {
			if (Valor >= 0.5){
				MoedasDe05 += 1;
				Valor -= 0.50;
			}else if (Valor >= 0.25){
				MoedasDe025 += 1;
				Valor -= 0.25;
			}
			else if (Valor >= 0.10){
				MoedasDe01 += 1;
				Valor -= 0.10;
			}else if (Valor >= 0.05){
				MoedasDe005 += 1;
				Valor -= 0.05;
			}else if (Valor >= 0.01){
				MoedasDe001 += 1;
				Valor -= 0.01;
			}


			System.out.println(Valor);
		}while (Valor > 0);


		System.out.println();
		System.out.println("Nota De 200: " +NotaDe200);
		System.out.println("Nota De 100: " +NotaDe100);
		System.out.println("Nota De 50.: " +NotaDe50);
		System.out.println("Nota De 20.: " +NotaDe20);
		System.out.println("Nota De 10.: " +NotaDe10);
		System.out.println("Nota De 5..: " +NotaDe5);
		System.out.println("Nota De 2..: " +NotaDe2);

		System.out.println("=====================");
		System.out.println("Moedas De 1...: " +MoedasDe1);
		System.out.println("Moedas De 0.50: " +MoedasDe05);
		System.out.println("Moedas De 0.25: " +MoedasDe025);
		System.out.println("Moedas De 0.10: " +MoedasDe01);
		System.out.println("Moedas De 0.05: " +MoedasDe005);
		System.out.println("Moedas De 0.01: " +MoedasDe001);


	}
}