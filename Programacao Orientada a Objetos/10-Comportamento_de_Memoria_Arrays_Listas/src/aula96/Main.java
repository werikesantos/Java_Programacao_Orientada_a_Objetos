package aula96;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
		 * N funcion�rios. N�o deve haver repeti��o de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
		 * mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
		 * conforme exemplos.
		 * 
		 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
		 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
		 * aumento por porcentagem dada.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.print("\nFuncion�rio #" + (i + 1) + ":\n");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(new Funcionario().temId(funcionario, id)) {
				System.out.print("Id j� existente. Tente novamente!\nId: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();
			
			funcionario.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("\nDigite a identifica��o do funcion�rio que ter� aumento de sal�rio: ");
		int idFuncionario = sc.nextInt();
		
		Funcionario buscar = funcionario.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		if (buscar == null) {
			System.out.println("Este id n�o existe!");
		}else {
			System.out.print("\nInsira a porcentagem: ");
			double porcentagem = sc.nextDouble();
			new Funcionario().aumentarSalario(funcionario, idFuncionario, porcentagem);
		}
		
		System.out.println("\nLista de Funcion�rios:");
		for(Funcionario funcionarios : funcionario) {
			System.out.println(funcionarios);
		}
		
		sc.close();
	}
}