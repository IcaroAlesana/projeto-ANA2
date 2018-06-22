

class Atividade {

	private String nome;
	private String descricao;
	private String dataEntrega;
	private boolean situacao;
	

	public Atividade(String nome, String descricao, String dataEntrega) {
		this.nome = nome;
		this.descricao = descricao;
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//LocalDate date = LocalDate.parse(dataEntrega,formatter);
		this.dataEntrega = dataEntrega;
		situacao = false;
	}

	public void realizarAtividade() {
		situacao = true;		
	}
	
	public String Retornanome(){
		return this.nome;
	}
	public String Retornadescri��o(){
		return this.descricao;
	}
	public String RetornadataEntrega(){
		return this.dataEntrega;
	}
	public boolean Retornasitua��o(){
		return this.situacao;
	}
	
	//funcao de notifica��o a ser implantada no futuro
	/*public void notificar() {

	}*/
}
