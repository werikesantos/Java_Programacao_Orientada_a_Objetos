package aula70;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Main2 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
		 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido).
		 * Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada 
		 * (somente o sal�rio bruto � afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. 
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
		 * Sa�da
		 * 
		 * Employee: Joao Silva, $ 5000.00
		 * 
		 * Entrada
		 * 
		 * Which percentage to increase salary? 10.0
		 * 
		 * Sa�da
		 * 
		 * Updated data: Joao Silva, $ 5600.00
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.print("Funcion�rio: " + funcionario + "\nQual percentual para aumentar o sal�rio?");
		Double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
	}
}