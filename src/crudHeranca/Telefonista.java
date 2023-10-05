package crudHeranca;
	
	public class Telefonista extends Funcionarios {
		
		private String codigo;

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		public Telefonista(String nome, double salario, String codigo) {
			super(nome, salario);
			this.codigo = codigo;
	
			
		}

}
	
