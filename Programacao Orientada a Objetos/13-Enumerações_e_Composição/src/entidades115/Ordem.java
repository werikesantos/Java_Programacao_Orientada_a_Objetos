package entidades115;

import java.util.Date;

import entidades115.enums115.OrdemStatus;

public class Ordem {
	
	private Integer id;
	private Date data;
	private OrdemStatus status;
	
	public Ordem() {
		
	}
	
	public Ordem(Integer id, Date data, OrdemStatus status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public OrdemStatus getStatus() {
		return status;
	}
	public void setStatus(OrdemStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "PEDIDO [ID: Nº " + id + ", DATA: " + data + ", STATUS: " + status + "]";
	}
}