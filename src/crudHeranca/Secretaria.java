package crudHeranca;

public class Secretaria extends Funcionarios{
	
	private String ramal;

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public Secretaria(String nome, double salario, String ramal) {
		super (nome, salario);
		this.ramal = ramal;
		
	}
	
	

}
