package aula70;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class Main3 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
		 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		 * ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
		 * para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
		 * resolver este problema.
		 * 
		 * Exemplo:
		 * 
		 * Entrada
		 * 
		 * Alex Green
		 * 27.00
		 * 31.00
		 * 32.00
		 * 
		 * Sa�da
		 * 
		 * FINAL GRADE = 90.00
		 * PASS
		 * 
		 * Entrada
		 * 
		 * Alex Green
		 * 17.00
		 * 20.00
		 * 15.00
		 * 
		 * Sa�da
		 * 
		 * FINAL GRADE = 52.00
		 * FAILED
		 * MISSING 8.00 POINTS
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.primeiroTrimestre = sc.nextDouble();
		aluno.segundoTrimestre = sc.nextDouble();
		aluno.terceiroTrimestre = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();
	}
}