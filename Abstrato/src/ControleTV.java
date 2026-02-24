public class ControleTV implements Controler{


	private boolean Ligada;
	private int 	volume;
	private int 	volumeAntesDeMutar;
	private boolean Reprodusindo;

	public ControleTV(){
		this.Ligada = false;
		this.volume = 20;
		this.Reprodusindo = false;
		this.volumeAntesDeMutar = 20;
	}



	@Override
	public void LigarTV() {
		if (Ligada){
			System.out.println("TV Ja esta Ligada");
		}
		else {
			System.out.println("Ligando TV");
			setLigada(true);
		}
	}

	@Override
	public void DesligarTV() {
		if (!Ligada){
			System.out.println("TV Ja esta Desligada");
		}
		else {
			System.out.println("Desligando TV");
			setLigada(false);
		}

	}

	@Override
	public void MostrarMenu() {
		System.out.println("\n==========================");
		System.out.println("Ligada: " + getLigada() );
		System.out.println("Reprodusindo:  " + getReprodusindo());
		System.out.println("Volume: " + getVolume());
	}

	@Override
	public void AlmentarSom() {
		if (getLigada() && getVolume() + 5 <= 100) {
			setVolume(getVolume() + 5);
			System.out.println("Volume Almentado");
		}else{
			System.out.println("Volume nao almetado pois TV esta Desligada ou Volume esta em 100");
		}
	}

	@Override
	public void DiminuirSom() {
		if (getLigada() && getVolume() - 5 >= 0){
			setVolume(getVolume() - 5);
			System.out.println("Volume Diminuido");
		}else{
			System.out.println("Volume nao almetado pois TV esta Desligada ou Volume esta em 0");
		}
	}

	@Override
	public void Mutar() {
		if(getVolume() == 0 && getLigada()){
			System.out.println("TV Ja Mutada");
		}else if (getVolume() > 0 && getLigada()){
			System.out.println("Mutando TV");
			setVolumeAntesDeMutar(getVolume());
			setVolume(0);
		}
	}

	@Override
	public void Desmutar() {
		if(getVolume() == 0 && getLigada()){
			System.out.println("Desmutando TV");
			setVolume(getVolumeAntesDeMutar());
		}else if (getVolume() > 0 && getLigada()){
			System.out.println("TV Ja Desmutada");

		}
	}

	@Override
	public void Reprodusir() {
		if(!getReprodusindo() && getLigada()){
			setReprodusindo(true);
			System.out.println("TV Reprodusindo");
		}else if (getReprodusindo()){
			System.out.println("TV Ja Reprodusindo");
		}
	}

	@Override
	public void Pausar() {
		if(getReprodusindo() && getLigada()){
			setReprodusindo(false);
			System.out.println("TV pausada");
		}else if (!getReprodusindo()){
			System.out.println("TV Ja pausada");
		}
	}


	public boolean getLigada() {
		return Ligada;
	}

	public void setLigada(boolean ligada) {
		this.Ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getReprodusindo() {
		return Reprodusindo;
	}

	public void setReprodusindo(boolean reprodusindo) {
		Reprodusindo = reprodusindo;
	}

	public int getVolumeAntesDeMutar() {
		return volumeAntesDeMutar;
	}

	public void setVolumeAntesDeMutar(int volumeAntesDeMutar) {
		this.volumeAntesDeMutar = volumeAntesDeMutar;
	}
}
