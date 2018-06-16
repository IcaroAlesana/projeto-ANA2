import java.util.ArrayList;

public class Model_Aluno {
	private String nome;
	private ArrayList<String> anotacoes;
	
	public Model_Aluno(String nome) {
		this.nome = nome;
	}

	/*public void aplicarAnotacao() {
	
	}*/
	
	public String getAnotacao() {		
		return anotacoes.toString();		
	}
	
	public void criaAnotacao(String anotacao) {
		anotacoes.add(anotacao);
	}
	
	public void imprimeAnotacoes() {
		System.out.println("Nome: "+nome+"\nAnotacoes: "/*Listar anotações*/);
	}
}