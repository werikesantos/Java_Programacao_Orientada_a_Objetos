package entidades120;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String mensagem;
	private Integer likes;
	
	//COMPOSIÇÃO - UM POST PODE TER VÁRIOS COMENTÁRIOS
	List<Comentario> comentario = new ArrayList<>();

	public Post() {

	}

	public Post(Date momento, String titulo, String mensagem, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.likes = likes;
	}

	public void addComentario(Comentario comentario) {
		this.comentario.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		this.comentario.remove(comentario);
	}
	
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public List<Comentario> getComentario() {
		return comentario;
	}

	@Override
	public String toString() {
		
		//UTILIZANDO O 'STRINGBUILDER' PARA ORGANIZAR MELHOR AS STRINGS
		StringBuilder sb = new StringBuilder();
		sb.append("\n"+"Histórico:\n"+ sdf.format(momento) + "\n");
		sb.append("Título: " + titulo + "\n");
		sb.append("Mensagem: " + mensagem + "\n");
		sb.append("Likes: " + likes + "\n");

		for(Comentario comentarios : comentario) {
			sb.append("Comentário: " + comentarios.getTexto() + "\n");
		}
		
		return sb.toString();
	}
}