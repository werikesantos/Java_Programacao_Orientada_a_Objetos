package entidades118;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entidades118.enums118.TrabalhadorNivel;

public class Trabalhador {
	
	private String nome;
	private TrabalhadorNivel nivel;
	private Double baseSalario;
	
	//ASSOCIAÇÕES DE CLASSES 
	// TRABALHADOR TEM UM DEPARTAMENTO -- AND -- TRABALHADOR TEM VÁRIOS CONTRATOS
	private Departamento departamento;
	private List<ContratoHora> contrato = new ArrayList<>();
	
	public Trabalhador() {
	}
	
	/* NUNCA PODE USAR UMA LISTA EM UM PARAMETRO NO CONSTRUTOR!!!
		public Trabalhador(String nome, TrabalhadorNivel nivel, Double baseSalario, Departamento departamento, List<ContratoHora> contrato) {
			this.nome = nome;
			this.nivel = nivel;
			this.baseSalario = baseSalario;
			this.departamento = departamento;
			this.contrato = contrato;
		}
	*/
	
	public Trabalhador(String nome, TrabalhadorNivel nivel, Double baseSalario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public void addContrato(List<ContratoHora> contrato) {
		this.contrato = contrato;
	}
	
	public void removeContrato(ContratoHora contrato) {
		
	}
	
	public Double renda(Integer mes, Integer ano) {
		
		Calendar calendario = Calendar.getInstance();
		
		double resultado = 0.0;
		
		for(ContratoHora contratos : contrato) {
			
			Date data = contratos.getData();
			calendario.setTime(data);
			
			int pegarMes = 1 + calendario.get(Calendar.MONTH);
			int pegarAno = calendario.get(Calendar.YEAR);
			
			if((pegarMes == mes) && (pegarAno == ano)) {
				
				resultado = resultado + contratos.valorTotal();
			}
		}

		return resultado + this.baseSalario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TrabalhadorNivel getNivel() {
		return nivel;
	}

	public void setNivel(TrabalhadorNivel nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContrato() {
		return contrato;
	}

	/* ESSE PROCESSO NÃO É POSSIVEL REALIZAR, PARA ISSO FOI CRIADO OS MÉTODO 'addContrato' E 'removeContrato'
		
		public void setContratos(List<ContratoHora> contrato) {
			this.contrato = contrato;
		}
		
	*/
	
	@Override
	public String toString() {
		return "Trabalhador [Nome: " + nome + ", Nível: " + nivel + ", Base Salarial: R$" + String.format("%.2f", baseSalario) + ", Departamento: "
				+ departamento.getNome() + ", Contratos: " + contrato + "]";
	}
}