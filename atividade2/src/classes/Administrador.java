package classes;

public class Administrador extends Empregado {

	private double ajudaCusto;

	public Administrador(String p_nome, String p_endereco, String p_telefone, double e_salario, double a_ajudaCusto) {
		super(p_nome, p_endereco, p_telefone, e_salario);
		ajudaCusto = a_ajudaCusto;
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	//calcular salario do administrador
	public double calcularSalarioAdm() {
		return ajudaCusto + getSalario();
	}

	@Override
	public String toString() {
		return "Salario do administrador: " + calcularSalarioAdm();
	}

}
