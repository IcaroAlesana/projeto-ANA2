import java.time.LocalDate;
import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private ArrayList<Conteudo> ementa = new ArrayList<Conteudo>();
	private ArrayList<Atividade> atividades = new ArrayList<Atividade>();
	
	public Disciplina (String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Conteudo> getEmenta() {
		return ementa;
	}

	public boolean addConteudo(String nomeConteudo, String descricaoConteudo) {
		Conteudo c = new Conteudo(nomeConteudo, descricaoConteudo);
		ementa.add(c);
		return true;
	}

	/*private String carregaEmenta() {
		
		return null;		
	}*/
	
	public void addAtividade(String nome, String descricao, LocalDate dataEntrega) {
		Atividade a = new Atividade(nome, descricao, dataEntrega);
		atividades.add(a);
		
	}
	
	public void imprimirDisciplina() {		
		System.out.println("Nome: "+nome+"\nConteudos"/*+apenas nomes dos conteudos+"\nAtividades: "+Atividades e prazos*/);
	}
	
	public void imprimirEmenta() {
		System.out.println(ementa);
						
	}
	
	public void imprimirAtividades() {
		
	}
}
