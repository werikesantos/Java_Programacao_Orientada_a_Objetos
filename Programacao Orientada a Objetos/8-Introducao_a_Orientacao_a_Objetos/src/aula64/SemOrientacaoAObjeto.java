package aula64;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class SemOrientacaoAObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//NOVO MODO E COM ORIENTA��O A OBJETO
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Insira as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		if(areaX > areaY) {
			System.out.println("Maior �rea: X");
		}
		else{
			System.out.println("Maior �rea: Y");
		}
		
		
		/*
		 * MODO ANTIGO E SEM ORIENTA��O A OBJETO

			double xA, xB, xC, yA, yB, yC;
			System.out.println("Insira as medidas do tri�ngulo X: ");
			xA = sc.nextDouble();
			xB = sc.nextDouble();
			xC = sc.nextDouble();
			
			System.out.println("Insira as medidas do tri�ngulo Y: ");
			yA = sc.nextDouble();
			yB = sc.nextDouble();
			yC = sc.nextDouble();
			
			double p = (xA + xB + xC) / 2.0;
			double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
			p = (yA + yB + yC) / 2.0;
			double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
			
			System.out.printf("Tri�ngulo X �rea: %.4f%n", areaX);
			System.out.printf("Tri�ngulo Y �rea: %.4f%n", areaY);
			
			if(areaX > areaY) {
				System.out.println("Maior �rea: X");
			}
			else{
				System.out.println("Maior �rea: Y");
			}
		*/
		
		//3.00 4.00 5.00
		//7.50 4.50 4.02
		
		sc.close();
	}
}