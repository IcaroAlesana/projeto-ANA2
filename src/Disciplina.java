import java.util.ArrayList;
import java.util.Date;

public class Disciplina {
	
	private String nome;
	private ArrayList<Conteudo> ementa;
	private ArrayList<Atividade> atividades;
	
	public Disciplina (String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Conteudo> getEmenta() {
		return ementa;
	}

	public void addConteudo(String nomeConteudo, String descricaoConteudo) {
		Conteudo c = new Conteudo(nomeConteudo, descricaoConteudo);
		ementa.add(c);
	}

	/*private String carregaEmenta() {
		
		return null;		
	}*/
	
	public void addAtividade(String nome, String descricao, Date dataEntrega) {
		Atividade a = new Atividade(nome, descricao, dataEntrega);
		atividades.add(a);
		
	}
	
	public void imprimirDisciplina() {		
		System.out.println("Nome: "+nome+"\nConteudos"/*+apenas nomes dos conteudos+"\nAtividades: "+Atividades e prazos*/);
	}
	public void imprimirEmenta() {
		
	}
	public void imprimirAtividades() {
		
	}
}
