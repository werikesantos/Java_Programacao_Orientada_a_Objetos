package entidade;

public class Aluno {
	
	public String nome;
	public Double primeiroTrimestre, segundoTrimestre, terceiroTrimestre;
	
	public Double nota() {
		return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
	}

	public String resultado() {
		if(nota() > 60.00) {
			return "PASSOU";
		}else {
			Double resultado = 60.00 - nota();
			return "REPROVADO\nFALTA " + String.format("%.2f", resultado) + " PONTOS";
		}
	}
	
	@Override
	public String toString() {
		return "NOTA FINAL = " + String.format("%.2f", nota()) + "\n" + resultado();
	}
}