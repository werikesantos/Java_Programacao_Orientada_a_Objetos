package aula90;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e os dados (nome e
		 * preço) de N Produtos. Armazene os N produtos em um vetor. Em
		 * seguida, mostrar o preço médio dos produtos.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade: ");
		int N = sc.nextInt();
		
		Produto[] vetorProduto = new Produto[N];
		
		/* EXEMPLO PREENCHENDO TODOS OS CAMPOS DA CLASSE
		 * 
		 * for(int i=0; i<N;i++) {
		 *	 System.out.println("Digite o seu nome: ");
		 *	 String nome = sc.next();
		 *	 System.out.println("Digite o preço: ");
		 *	 int preco = sc.nextInt();
		 *	 vetorProduto[i] = new Produto(nome, preco);
		 * }
		*/
		
		//EXEMPLO PREENCHENDO SOMENTE UM CAMPO DA CLASSE
		for(int i=0; i<N;i++) {
			System.out.println("Digite o seu nome: ");
			String nome = sc.next();
			vetorProduto[i] = new Produto(nome);
		}
		
		for(int i=0; i<vetorProduto.length;i++) {
			System.out.println(vetorProduto[i].getNome());
		}
		
		sc.close();
	}
}