package entidade;

public class Funcionario {
	
	public String nome;
	public Double salarioBruto, imposto;
	
	public Double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(Double porcentagem) {
		salarioBruto = salarioBruto + ((porcentagem / 100) * salarioBruto);
	}
	
	@Override
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}