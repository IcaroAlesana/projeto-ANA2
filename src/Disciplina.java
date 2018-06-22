import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private ArrayList<Conteudo> ementa = new ArrayList<Conteudo>();
	private ArrayList<Atividade> atividades = new ArrayList<Atividade>();
	
	public Disciplina(String nome){
		this.nome = nome;
	}
	
	
	public ArrayList<Conteudo> carregaEmenta() {
		return ementa;
	}
	public ArrayList<Atividade> carregaAtividade() {
		return atividades;
	}
	public String nome() {
		return this.nome;
	}
	
	
	public void addConteudo(Conteudo c) {
		ementa.add(c);
	}
	
	public void addAtividade(Atividade a) {
		atividades.add(a);
	}
}
