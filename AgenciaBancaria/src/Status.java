public enum Status {
		ATIVO(1),
		INATIVO(2),
		INVALIDA(3);

		private final int valor;

		Status(int opcoes){this.valor = opcoes;}

		public static Status deint(int opcoes){

			for (Status status : values()){
				if (status.valor == opcoes){
					return status;
				}
			}
			return INVALIDA;
		}



}
