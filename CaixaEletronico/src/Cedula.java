public class Cedula {
	private String 	Valor;
	private Integer Quantidade;
	private Integer TotalNoCaixa;


	public Cedula(String Valor,Integer Quantidade,Integer TotalNoCaixa){
		this.Valor = Valor;
		this.Quantidade = Quantidade;
		this.TotalNoCaixa = TotalNoCaixa;
	}

	public String getValor() {
		return Valor;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}

	public Integer getTotalNoCaixa() {
		return TotalNoCaixa;
	}

	public void setTotalNoCaixa(Integer totalNoCaixa) {
		TotalNoCaixa = totalNoCaixa;
	}
}
