package aula67;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Main {

	public static void main(String[] args) {
		
	/*  
	 	Enter product data:
		Name: TV
		Price: 900.00
		Quantity in stock: 10
		
		Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
		Enter the number of products to be added in stock: 5
		Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
		Enter the number of products to be removed from stock: 3
		Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00
	*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Insira os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.next();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Informações do produto: "+produto+"\n");
		
		System.out.println("Insira o número de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: "+produto+"\n");
		
		System.out.println("Insira o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: "+produto+"\n");
	}
}