import java.util.Random;

public class Lutar {

	private Lutador Desafiante;
	private Lutador Desafiado;
	private boolean Aprovada = false;
	private int rounds;

	public Lutador getDesafiante() {
		return Desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		Desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return Desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		Desafiado = desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public void MarcarLuta(Lutador l,Lutador l2){
		if(l.getCategoria().equals(l2.getCategoria()) && !l.equals(l2)){
			setDesafiante(l);
			setDesafiado(l2);
			Aprovada = true;
		}else{
			System.out.println("Luta Invalida");
			Aprovada = false;
		}

	}

	public void RealizarLuta(int Rounds){
		setRounds(Rounds);
		Random aleatorio = new Random();
		int vitoria;

		if (Aprovada){
			do {
				vitoria = aleatorio.nextInt(20);


				if (vitoria >= 15){

					System.out.println("\nVitoria de : " + getDesafiante().getNome());
					getDesafiante().Ganhar();
					getDesafiado().Perder();
					break;
				}else if (vitoria >= 10){
					System.out.println("\nVitoria de : " + getDesafiado().getNome());
					getDesafiado().Ganhar();
					getDesafiante().Perder();
					break;
				} else{
					setRounds(getRounds() - 1);
				}


				if(getRounds() <= 0){
					System.out.println("\nEmpate ");
					getDesafiado().Empatar();
					getDesafiante().Empatar();

				}



			}while (getRounds() > 0);


		}else{
			System.out.println("\nLuta Nao Pode Acontecer");
		}

	}




}
