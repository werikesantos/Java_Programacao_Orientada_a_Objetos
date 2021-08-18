package aplicacao120;

import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entidades120.Comentario;
import entidades120.Post;

public class Programa {

	public static void main(String[] args) {

		Random numeroAleatorio = new Random();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//INICIO - PRIMEIRO POST
			System.out.print("Título: "); 
			String titulo1 = sc.nextLine();
			System.out.print("Mensagem: "); 
			String mensagem1 = sc.nextLine();
			int likes1 = numeroAleatorio.nextInt(1000);
			Date momento1 = new Date();
			
			Post post1 = new Post(momento1, titulo1, mensagem1, likes1);
			
			Comentario comentario1 = new Comentario();
			comentario1.setTexto("Boa viajem!");
			
			Comentario comentario2 = new Comentario();
			comentario2.setTexto("Nossa amiga, que legal!");
			
			post1.addComentario(comentario1);
			post1.addComentario(comentario2);
			
			System.out.println(post1);
		//FIM - PRIMEIRO POST
		
		//INICIO - SEGUNDO POST
			System.out.print("\n" + "Título: "); 
			String titulo2 = sc.nextLine();
			System.out.print("Mensagem: "); 
			String mensagem2 = sc.nextLine();
			int likes2 = numeroAleatorio.nextInt(1000);
			Date momento2 = new Date();
			
			Post post2 = new Post(momento2, titulo2, mensagem2, likes2);
			
			Comentario comentario3 = new Comentario();
			comentario3.setTexto("Parabéns cara!!!");
			
			Comentario comentario4 = new Comentario();
			comentario4.setTexto("Muitos anos de vida!!!");
			
			post2.addComentario(comentario3);
			post2.addComentario(comentario4);
			
			System.out.println(post2);
		//FIM - SEGUNDO POST

		sc.close();
	}
}