package aula96;

import java.util.List;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
		
	public Funcionario() {
	}
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public boolean temId(List<Funcionario> funcionario, int id) {
		Funcionario resultado = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return resultado != null;
	}
	
	public String aumentarSalario(List<Funcionario> funcionario, int idFuncionario, double porcentagem){
		Funcionario buscar = funcionario.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		String resultado = String.format("%.2f", (((porcentagem/100) * buscar.getSalario()) + buscar.getSalario()));
		buscar.setSalario(Double.parseDouble(resultado));
		return resultado;
	}
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f",salario);
	}
}