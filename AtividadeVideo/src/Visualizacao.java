import java.math.BigDecimal;

public class Visualizacao {

	private Video videoAssistido;
	private Gafanhoto Espectador;

		public void avaliar(){
			videoAssistido.setAvaliacoes(5);
		}

		public void avaliar(Integer nota){
			videoAssistido.setAvaliacoes(nota);
		}

		public void avaliar(BigDecimal porcentagem){
			int nota;

			if (porcentagem.compareTo(BigDecimal.valueOf(20)) <= 0){
				nota = 3;
			} else if (porcentagem.compareTo(BigDecimal.valueOf(50)) <= 0) {
				nota = 5;
			} else if (porcentagem.compareTo(BigDecimal.valueOf(90)) <= 0) {
				nota = 8;
			}else{
				nota = 10;
			}

			this.videoAssistido.setAvaliacoes(nota);

		}


	public Visualizacao(Video videoAssistido, Gafanhoto espectador) {
		this.videoAssistido = videoAssistido;
		Espectador = espectador;
		this.Espectador.setTotAssistido(Espectador.getTotAssistido() + 1);
		this.videoAssistido.setViews(videoAssistido.getViews() + 1);
	}

	public Video getVideoAssistido() {
		return videoAssistido;
	}

	public void setVideoAssistido(Video videoAssistido) {
		this.videoAssistido = videoAssistido;
	}

	public Gafanhoto getEspectador() {
		return Espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		Espectador = espectador;
	}

	@Override
	public String toString() {
		return "Visualizacao{" +
				"videoAssistido=" + videoAssistido +
				", Espectador=" + Espectador +
				'}';
	}
}
