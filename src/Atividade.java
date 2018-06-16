import java.time.LocalDate;

public class Atividade {

	private String nome;
	private String descricao;
	LocalDate dataEntrega;
	private boolean situacao;
	//private String dataNotifica; (data de notifica��o a ser implementada)

	public Atividade(String nome, String descricao, LocalDate dataEntrega) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataEntrega = dataEntrega;
		situacao = false;
	}

	public void realizarAtividade() {
		situacao = true;		
	}

	public Atividade retornaAtividade() {

		return null;
	}
	//funcao de notifica��o a ser implantada no futuro
	/*public void notificar() {

	}*/

	public void imprimeAtividade() {
		if(situacao == true) {
			System.out.println("Atividade: "+nome+"\nDescri��o: "+descricao+"\nData de Entrega: "+dataEntrega+"\nRealizado: Sim");
		}
		else {
			System.out.println("Atividade: "+nome+"\nDescri��o: "+descricao+"\nData de Entrega: "+dataEntrega+"\nRealizado: N�o");
		}
	}
}
