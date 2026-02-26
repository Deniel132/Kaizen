public enum Escolhas {
	SAQUE(1),
	DEPOSITO(2),
	TRANSFERIR(3),
	FECHARCONTA(4),
	ABRIRCONTA(5),
	LISTARCONTAS(6),
	SAIR(7),
	INVALIDA(8);

	private final int valor;

	Escolhas(int escolha){this.valor = escolha;}

	public static Escolhas deint(int opcoes){

		for (Escolhas escolhas : values()){
			if (escolhas.valor == opcoes){
				return escolhas;
			}
		}
		return INVALIDA;
	}

}
