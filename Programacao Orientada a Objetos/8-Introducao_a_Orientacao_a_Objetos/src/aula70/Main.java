package aula70;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os valores da largura e altura
		 * de um retângulo. Em seguida, mostrar na tela o valor de
		 * sua área, perímetro e diagonal. Usar uma classe como
		 * mostrado no projeto ao lado.
		 * 
		 * Exemplo:
		 * 
		 * Entrada
		 * 
		 * Enter rectangle width and height:
		 * 3.00 4.00
		 * 
		 * Saída
		 * 
		 * AREA = 12.00
		 * PERIMETER = 14.00
		 * DIAGONAL = 5.00
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("ÁREA = "+String.format("%.2f", retangulo.area()));
		System.out.println("PERÍMETRO = "+String.format("%.2f", retangulo.perimetro()));
		System.out.println("DIAGONAL = "+String.format("%.2f", retangulo.diagonal()));
		
		sc.close();
	}
}