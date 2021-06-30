package aula64;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class SemOrientacaoAObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//NOVO MODO E COM ORIENTAÇÃO A OBJETO
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Insira as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}
		else{
			System.out.println("Maior área: Y");
		}
		
		
		/*
		 * MODO ANTIGO E SEM ORIENTAÇÃO A OBJETO

			double xA, xB, xC, yA, yB, yC;
			System.out.println("Insira as medidas do triângulo X: ");
			xA = sc.nextDouble();
			xB = sc.nextDouble();
			xC = sc.nextDouble();
			
			System.out.println("Insira as medidas do triângulo Y: ");
			yA = sc.nextDouble();
			yB = sc.nextDouble();
			yC = sc.nextDouble();
			
			double p = (xA + xB + xC) / 2.0;
			double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
			p = (yA + yB + yC) / 2.0;
			double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
			
			System.out.printf("Triângulo X área: %.4f%n", areaX);
			System.out.printf("Triângulo Y área: %.4f%n", areaY);
			
			if(areaX > areaY) {
				System.out.println("Maior área: X");
			}
			else{
				System.out.println("Maior área: Y");
			}
		*/
		
		//3.00 4.00 5.00
		//7.50 4.50 4.02
		
		sc.close();
	}
}