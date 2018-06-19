import java.time.LocalDate;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TesteDisciplina {
	
	Scanner leia = new Scanner(System.in);
	Disciplina math = new Disciplina("math");
	static LocalDate data = LocalDate.of(2018, 12, 11);	
	
	
	@Test
	void testeAddConteudo() {
		math.addConteudo("divisao", "realizar opera��es de divis�o");
		math.imprimirEmenta();	
	}
	
	@Test
	void testeAddAtividade() {
		math.addAtividade("Trabalho sobre Divis�o", "Quest�es dispon�veis na pagina 10 do livro", data);
	}

}
