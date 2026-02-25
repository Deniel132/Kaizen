public class Moeda {

	private String Valor;
	private Integer Quantidade;
	private Integer TotalNoCaixa;

	public Moeda(String valor, Integer quantidade,Integer TotalNoCaixa) {
		this.Valor = valor;
		this.Quantidade = quantidade;
		this.TotalNoCaixa = TotalNoCaixa;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
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
		TotalNoCaixa = totalNoCaixa;
	}
}
