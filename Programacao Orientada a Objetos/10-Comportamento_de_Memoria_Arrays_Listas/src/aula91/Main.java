package aula91;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes,
		 * sendo esses quartos identificados pelos números 0 a 9.
		 * 
		 * Fazer um programa que inicie com todos os dez quartos vazios, e depois
		 * leia uma quantidade N representando o número de estudantes que vão
		 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		 * N estudantes. Para cada registro de aluguel, informar o nome e email do
		 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		 * um relatório de todas ocupações do pensionato, por ordem de quarto,
		 * conforme exemplo.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados? ");
		int N = sc.nextInt();

		Alugar[] quartosAlugar = new Alugar[10];
		
		for(int i =1; i<=N;i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Sala: ");
			int sala = sc.nextInt();
			
			quartosAlugar[sala] = new Alugar(nome, email, sala);
		}
		
		System.out.println("\nSalas ocupadas: ");
		for(int i=0; i<quartosAlugar.length;i++) {
			if(quartosAlugar[i] != null) {
				System.out.println(quartosAlugar[i].getQuarto()+": "
				+quartosAlugar[i].getNome()+", "
				+quartosAlugar[i].getEmail());
			}
		}
		
		sc.close();
	}
}