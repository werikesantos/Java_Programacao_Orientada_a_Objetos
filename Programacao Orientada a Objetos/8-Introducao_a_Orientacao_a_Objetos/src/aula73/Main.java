package aula73;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoeda;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
		 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
		 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
		 * para ser responsável pelos cálculos.
		 * 
		 * Exemplo:
		 * 
		 * Entrada
		 * 
		 * What is the dollar price? 3.10
		 * How many dollars will be bought? 200.00
		 * 
		 * Saída
		 * 
		 * Amount to be paid in reais = 657.20
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço em dólar? ");
		double dollarPreco = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double resultar = sc.nextDouble();
		
		double result = ConversorDeMoeda.dollarParaReal(resultar, dollarPreco);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		sc.close();
		
	}
}