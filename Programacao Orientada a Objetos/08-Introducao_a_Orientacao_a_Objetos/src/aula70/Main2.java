package aula70;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Main2 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
		 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
		 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
		 * Use a classe projetada abaixo.
		 * 
		 * Exemplo:
		 * 
		 * Entrada
		 * 
		 * Name: Joao Silva
		 * Gross salary: 6000.00
		 * Tax: 1000.00
		 * 
		 * Saída
		 * 
		 * Employee: Joao Silva, $ 5000.00
		 * 
		 * Entrada
		 * 
		 * Which percentage to increase salary? 10.0
		 * 
		 * Saída
		 * 
		 * Updated data: Joao Silva, $ 5600.00
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.print("Funcionário: " + funcionario + "\nQual percentual para aumentar o salário?");
		Double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
	}
}