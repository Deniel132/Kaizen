import java.math.BigDecimal;

public class Video implements AcoesVideo{

	private String titulo;
	private Integer avaliacoes;
	private Integer views;
	private Integer curtidas;
	private boolean reproduzindo;


	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pouse() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas ++;
	}

	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacoes = 0;
		this.views = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Integer avaliacoes) {
		BigDecimal nota = BigDecimal.valueOf(this.avaliacoes).add(BigDecimal.valueOf(avaliacoes)).divide(BigDecimal.valueOf(getViews()));

		this.avaliacoes = nota.intValue();
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video{" +
				"titulo='" + titulo + '\'' +
				", avaliacoes=" + avaliacoes +
				", views=" + views +
				", curtidas=" + curtidas +
				", reproduzindo=" + reproduzindo +
				'}';
	}
}
