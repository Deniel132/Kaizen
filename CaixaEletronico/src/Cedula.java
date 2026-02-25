public class Cedula {
	private String 	Descricao;
	private Integer Valor;
	private Integer Quantidade;
	private Integer TotalNoCaixa;


	public Cedula(String Descricao,Integer Valor,Integer Quantidade,Integer TotalNoCaixa){
		this.Descricao = Descricao;
		this.Valor = Valor;
		this.Quantidade = Quantidade;
		this.TotalNoCaixa = TotalNoCaixa;
	}

	public Integer getValor() {
		return Valor;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setValor(Integer valor) {
		this.Valor = valor;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
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
