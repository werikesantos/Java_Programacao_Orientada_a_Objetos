package aula95;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		//LIST = � UMA INTERFACE. E A CLASSE QUE IMPLEMENTA ESSA INTERFACE � A CLASSE 'ArrayList'.
		List<String> lista = new ArrayList<>();
		
		//ADICIONANDO UM DADO DO TIPO STRING DENTRO DA LISTA
		lista.add("Werike");
		lista.add("Maria");
		lista.add("Carlos");
		lista.add("Cristiano");
		lista.add("Cristina");
		lista.add("Vanessa");
		lista.add("Margarida");
		
		//PERCORRENDO A LISTA USANDO A ESTRUTURA DE REPETI��O/LOOP FOR
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}		
		
		System.out.println();
		
		//PERCORRENDO A LISTA USANDO O FOR EACH
		for(String dados : lista) {
			System.out.println(dados);
		}
		
		System.out.println();
		
		//ADICIONANDO UM DADO NA LISTA EM UM LOCAL DETERMINADO
		lista.add(2, "--Novo--");
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println();
		
		//TAMANHO DA LISTA
		System.out.println("Tamanho da lista: " + lista.size());
		
		System.out.println();
		
		//REMOVENDO DADO DA LISTA PELO NOME
		lista.remove("--Novo--");
		for(String x : lista) {
			System.out.println(x);
		}
		System.out.println("Exclus�o: "+"--Novo--");
		
		System.out.println();
		
		//REMOVENDO DADO DA LISTA PELO N�MERO
		lista.remove(0);
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("Exclus�o: Posi��o '0' Werike");
		
		System.out.println();
		
		//REMOVENDO TODOS DA LISTA PELO CARACTER NA POSI��O 0 FOR IGUAL A 'M'
		lista.removeIf(x -> x.charAt(0) == 'M');
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("TODOS COM NOMES INICIALIZADO COM 'M', FORAM DELETADOS.");
		
		System.out.println();
		
		//PEGANDO O INDEX DO NOME "Vanessa" NA LISTA
		System.out.println("Index da 'Vanessa': "+lista.indexOf("Vanessa"));
		//N�O ENCONTRADO RETORNA -1
		System.out.println("Index da 'Werike': "+lista.indexOf("Werike"));
		
		System.out.println();
		
		
		//TRABALHANDO COM BUSCA POR LISTA SEM DELETAR OS DADOS:
		
		//RETORNANDO UMA LISTA SOMENTE COM DADOS INICIANDO COM A LETRA 'A'
		List<String> buscar = lista.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for (String resultado : buscar) {
			System.out.println(resultado);
		}
		
		System.out.println();
		
		//RETORNANDO UMA LISTA E SE N�O ENCONTRAR MOSTRA 'NULL'
		String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
	}
}