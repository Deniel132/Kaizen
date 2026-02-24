public class Lutador {

	private String Nome;
	private String Nacionalidade;
	private int idade;
	private float Altura;
	private float Peso;
	private String Categoria;
	private int Vitorias;
	private Integer Derrotas;
	private int  Empates;

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, Integer derrotas, int empates) {
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return Altura;
	}

	public void setAltura(float altura) {
		Altura = altura;
	}

	public float getPeso() {
		return Peso;
	}

	public void setPeso(float peso) {
		Peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return Categoria;
	}

	private void setCategoria() {
		if (getPeso() <= 70.3f && getPeso() > 52.2f){
			Categoria = "Leve";
		} else if (getPeso() <= 83.9f) {
			Categoria = "Medio";
		} else if (getPeso() <= 102.2f) {
			Categoria = "Pesado";
		}else {
			Categoria = "Invalido";
		}
	}

	public int getVitorias() {
		return Vitorias;
	}

	public void setVitorias(int vitorias) {
		Vitorias = vitorias;
	}

	public Integer getDerrotas() {
		return Derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		Derrotas = derrotas;
	}

	public int getEmpates() {
		return Empates;
	}

	public void setEmpates(int empates) {
		Empates = empates;
	}

	public void Ganhar(){
		setVitorias(getVitorias() + 1);
	}
	public void Perder(){
		setDerrotas(getDerrotas() + 1);
	}
	public void Empatar(){
		setEmpates(getEmpates() + 1);
	}

	public void MostarLutador(){
		System.out.println("\n==================");
		System.out.println("Nome.........: "+ getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso.........: " + getPeso());
		System.out.println("Altura.......: " + getAltura());
		System.out.println("Categoria....: " + getCategoria());
		System.out.println("Vitorias.....: " +getVitorias());
		System.out.println("Derrotas.....: " + getDerrotas());
		System.out.println("Empates......: "+ getEmpates());
	}

	public void Resultados(){
		System.out.println("\n==================");
		System.out.println("Nome....: "+ getNome());
		System.out.println("Vitorias: " +getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empates.: "+ getEmpates());
	}



}
