import java.time.LocalDate;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TesteDisciplina {
	
	Scanner leia = new Scanner(System.in);
	Disciplina math = new Disciplina("math");
	static LocalDate data = LocalDate.of(2018, 12, 11);	
	
	
	@Test
	void testeAddConteudo() {
		math.addConteudo("divisao", "realizar operações de divisão");
		math.imprimirEmenta();	
	}
	
	@Test
	void testeAddAtividade() {
		math.addAtividade("Trabalho sobre Divisão", "Questões disponíveis na pagina 10 do livro", data);
	}

}
