package aplicacao118;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades118.ContratoHora;
import entidades118.Departamento;
import entidades118.Trabalhador;
import entidades118.enums118.TrabalhadorNivel;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ContratoHora> contrato = new ArrayList<>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o nome do departamento: "); 
		String departamento = sc.next();
		System.out.println("\nInsira os dados do trabalhados: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Nível: ");
		String pegarNivel = sc.next();
		TrabalhadorNivel nivel = TrabalhadorNivel.valueOf(pegarNivel);
		System.out.print("Salário Base: ");
		Double baseSalario = sc.nextDouble();
		
		System.out.print("\nQuantos contratos para este trabalhador? ");
		int qtdContratos = sc.nextInt();
		
		for(int i=0; qtdContratos>i; i++) {
			System.out.println("Insira os dados do contrato #" + (i+1) + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			String pegarData = sc.next();
			Date data = sdf1.parse(pegarData);
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = sc.nextInt();
			
			contrato.add(new ContratoHora(data, valorPorHora, horas));
		}
		
		Trabalhador trabalhador = new Trabalhador(nome, nivel, baseSalario, new Departamento(departamento));
		
		trabalhador.addContrato(contrato);
		
		System.out.print("\nInsira o mês e o ano para calcular a renda (MM/AAAA): ");
		String renda = sc.next();
		String[] vetorRenda = renda.split("/");
		int mes = Integer.parseInt(vetorRenda[0]);
		int ano = Integer.parseInt(vetorRenda[1]);
		
		Double resultado = trabalhador.renda(mes, ano);
		
		System.out.println("Nome: "+trabalhador.getNome()
			+"\nDepartamento: "+trabalhador.getDepartamento().getNome()
			+"\nRendimento para "+renda+": " + String.format("%.2f",resultado));
		
		sc.close();
	}
}