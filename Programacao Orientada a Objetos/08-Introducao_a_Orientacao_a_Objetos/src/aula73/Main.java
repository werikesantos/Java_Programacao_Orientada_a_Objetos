package aula73;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoeda;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
		 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
		 * que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
		 * para ser respons�vel pelos c�lculos.
		 * 
		 * Exemplo:
		 * 
		 * Entrada
		 * 
		 * What is the dollar price? 3.10
		 * How many dollars will be bought? 200.00
		 * 
		 * Sa�da
		 * 
		 * Amount to be paid in reais = 657.20
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual � o pre�o em d�lar? ");
		double dollarPreco = sc.nextDouble();
		
		System.out.print("Quantos d�lares ser�o comprados? ");
		double resultar = sc.nextDouble();
		
		double result = ConversorDeMoeda.dollarParaReal(resultar, dollarPreco);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		sc.close();
		
	}
}