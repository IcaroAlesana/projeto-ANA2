import java.util.ArrayList;

public class Model_Aluno {
	private String nome;
	private ArrayList<String> anotacoes;
	
	public Model_Aluno(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> RetornaAnotacao(){		
		return this.anotacoes;		
	}
	public String RetornaNome(){
		return this.nome;
	}
	
	public void criaAnotacao(String anotacao){
		anotacoes.add(anotacao);
	}
}