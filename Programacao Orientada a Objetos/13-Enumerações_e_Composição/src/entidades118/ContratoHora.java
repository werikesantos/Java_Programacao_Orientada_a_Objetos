package entidades118;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContratoHora {
	
	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	public ContratoHora() {
	}
	
	public ContratoHora(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Double valorTotal() {
		//RESPONSÁVEL PELO RETORNO DO RESULTADO DO 'VALOR POR HORA' * 'HORAS'
		return valorPorHora * horas;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		return " [Data: " + sdf1.format(data) + ", Valor por hora: " + String.format("%.2f", valorPorHora) + ", Horas: " + horas + "] ";
	}
}