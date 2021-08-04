package aula96;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
		 * N funcionários. Não deve haver repetição de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
		 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
		 * conforme exemplos.
		 * 
		 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
		 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
		 * aumento por porcentagem dada.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.print("\nFuncionário #" + (i + 1) + ":\n");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(new Funcionario().temId(funcionario, id)) {
				System.out.print("Id já existente. Tente novamente!\nId: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			funcionario.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("\nDigite a identificação do funcionário que terá aumento de salário: ");
		int idFuncionario = sc.nextInt();
		
		Funcionario buscar = funcionario.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		if (buscar == null) {
			System.out.println("Este id não existe!");
		}else {
			System.out.print("\nInsira a porcentagem: ");
			double porcentagem = sc.nextDouble();
			new Funcionario().aumentarSalario(funcionario, idFuncionario, porcentagem);
		}
		
		System.out.println("\nLista de Funcionários:");
		for(Funcionario funcionarios : funcionario) {
			System.out.println(funcionarios);
		}
		
		sc.close();
	}
}