public abstract class Pessoa {

	protected String nome;
	protected Integer idade;
	protected String sexo;
	protected Integer XP;

	protected void ganharXp(){

	}


	public Pessoa(String nome, Integer idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.XP = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getXP() {
		return XP;
	}

	public void setXP(Integer XP) {
		this.XP = XP;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", sexo='" + sexo + '\'' +
				", XP=" + XP +
				'}';
	}
}
