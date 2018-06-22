
public class Conteudo {

	private String nome;
	private String descricao;
	private boolean estudado;
	
	public Conteudo(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		estudado = false;
	}
	
	public void estudar() {
		estudado = true;
	}
	public String Retornanome() {
		return this.nome;
	}
	public String Retornadescricao(){
		return this.descricao;
	}
	public boolean Retornaestudado(){
		return this.estudado;
	}
	
	public void imprimeConteudo() {
		if (estudado == true) {
			System.out.println("Conteudo: "+nome+"\nDescrição: "+descricao+"\nEstudado: Sim");
		}
		else {
			System.out.println("Conteudo: "+nome+"\nDescrição: "+descricao+"\nEstudado: Não");
		}
	}
}
