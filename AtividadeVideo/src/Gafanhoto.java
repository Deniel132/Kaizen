public class Gafanhoto extends Pessoa{

	private String login;
	private Integer totAssistido;

	public Gafanhoto(String nome, Integer idade, String sexo,String login) {
		super(nome, idade, sexo);
		this.login = login;
		totAssistido = 0;
	}


	public void viuMaisUm(){

	}

	@Override
	public String toString() {
		return "Gafanhoto{" +
				"login='" + login + '\'' +
				", totAssistido=" + totAssistido +
				", nome='" + nome + '\'' +
				", idade=" + idade +
				", sexo='" + sexo + '\'' +
				", XP=" + XP +
				'}';
	}

	public Integer getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(Integer totAssistido) {
		this.totAssistido = totAssistido;
	}
}
