import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Lutador> Lutadores = new ArrayList<>();


		Lutadores.add(new Lutador("Teste1","BR",30,1.90f,100.2f,4,5,1));
		Lutadores.add(new Lutador("Teste2","US",31,1.85f,80.9f,9,6,3));
		Lutadores.add(new Lutador("Teste3","GR",40,1.50f,91.9f,7,9,5));
		Lutadores.add(new Lutador("Teste4","BR",35,1.20f,76.9f,5,1,4));
		Lutadores.add(new Lutador("Teste5","WW",28,1.82f,90.9f,1,2,1));
		Lutadores.add(new Lutador("Teste6","BR",27,1.81f,101.9f,12,9,12));



		Lutadores.get(0).MostarLutador();
		Lutadores.get(5).MostarLutador();

		Lutar lutas = new Lutar();
		lutas.MarcarLuta(Lutadores.get(5),Lutadores.get(0));
		lutas.Lutar(2);

		Lutadores.get(0).Resultados();
		Lutadores.get(5).Resultados();


	}
}