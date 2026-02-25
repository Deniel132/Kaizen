public class Moeda {

	private String Descricao;
	private Integer Valor;
	private Integer Quantidade;
	private Integer TotalNoCaixa;

	public Moeda(String Descricao,Integer valor, Integer quantidade,Integer TotalNoCaixa) {
		this.Descricao = Descricao;
		this.Valor = valor;
		this.Quantidade = quantidade;
		this.TotalNoCaixa = TotalNoCaixa;
	}

	public Integer getValor() {
		return Valor;
	}

	public void setValor(Integer valor) {
		this.Valor = valor;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.Quantidade = quantidade;
	}

	public Integer getTotalNoCaixa() {
		return TotalNoCaixa;
	}

	public void setTotalNoCaixa(Integer totalNoCaixa) {
		this.TotalNoCaixa = totalNoCaixa;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
}
