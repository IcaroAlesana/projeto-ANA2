import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controler implements ActionListener{
	
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
	private static int op;
	
	static JFrame TELA_INICIAL;
	static JLabel  NOME;
	
	static JButton ANOTAR;
	static JButton CRIARDISCIPLINA;
	static JButton CRIARATIVIDADE;
	static JButton CRIARCONTEUDO;
	
	static JButton VERANOTA;
	static JButton VERADISCIPLINAS;
	static JButton VERAATIVIDADES;
	static JButton VERACONTEUDO;
	

	
	static JFrame TELA_CRIA;
	static JTextField NOMED;
	static JTextField DATA;
	static JTextArea AREAA;
	static JButton CRIAR;

	
	
	static JFrame TELA_MOSTRA;
	static JLabel NOMA;
	static JLabel DETA;
	static JTextArea AREA;
	static JButton PROXIMO;
	static JButton VOLTA;
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	public Controler()
	{
		TELA_INICIAL = new JFrame();
		TELA_INICIAL.setVisible(false);
        TELA_INICIAL.setTitle("Controle de Disciplinas");
        TELA_INICIAL.setSize(450,450);
        TELA_INICIAL.setLocation((int)(dim.getWidth()-420)/2,(int)(dim.getHeight()-450)/2);
        TELA_INICIAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TELA_INICIAL.getContentPane().setLayout(null);
         
        NOME = new JLabel("Controle de Disciplinas");
        NOME.setBounds(52,15,300,50);
        TELA_INICIAL.getContentPane().add(NOME);
        
        
         
        CRIARDISCIPLINA = new JButton("CRIAR DISCIPLINA");
        CRIARDISCIPLINA.setBounds(52,80,300,40);
 		TELA_INICIAL.getContentPane().add(CRIARDISCIPLINA);
 		
 		CRIARATIVIDADE = new JButton("CRIAR ATIVIDADE");
 		CRIARATIVIDADE.setBounds(52,140,300,40);
 		TELA_INICIAL.getContentPane().add(CRIARATIVIDADE);
 		
 		CRIARCONTEUDO = new JButton("CRIAR CONTEUDO");
 		CRIARCONTEUDO.setBounds(52,200,300, 40);
 		TELA_INICIAL.getContentPane().add(CRIARCONTEUDO);
 		
 		ANOTAR = new JButton("ANOTAR");
 		ANOTAR.setBounds(52, 260,300, 40);
 		TELA_INICIAL.getContentPane().add(ANOTAR);
 		
 		
 		
 		
 		VERANOTA = new JButton("ANOTA");
 		VERANOTA.setBounds(50, 310,150, 40);
 		TELA_INICIAL.getContentPane().add(VERANOTA);
 		
 		VERADISCIPLINAS = new JButton("DISCIPLINAS");
 		VERADISCIPLINAS.setBounds(200, 310,150, 40);
 		TELA_INICIAL.getContentPane().add(VERADISCIPLINAS);
 		
 		VERAATIVIDADES = new JButton("ATIVIDADES");
 		VERAATIVIDADES.setBounds(50, 350, 150, 40);
 		TELA_INICIAL.getContentPane().add(VERAATIVIDADES);
 		
 		VERACONTEUDO = new JButton("CONTEUDO");
 		VERACONTEUDO.setBounds(200, 350, 150, 40);
 		TELA_INICIAL.getContentPane().add(VERACONTEUDO);
 		

		ANOTAR.addActionListener(this);//Adicionando um ActionListener nos botões para poder usa-los depois
		CRIARDISCIPLINA.addActionListener(this);
		CRIARATIVIDADE.addActionListener(this);
		CRIARCONTEUDO.addActionListener(this);
		
		VERANOTA.addActionListener(this);
		VERADISCIPLINAS.addActionListener(this);
		VERAATIVIDADES.addActionListener(this);
		VERACONTEUDO.addActionListener(this);
		
		TELA_CRIA = new JFrame();
		TELA_CRIA.setVisible(false);
		TELA_CRIA.setTitle("Controle de Disciplinas");
		TELA_CRIA.setSize(450,450);
		TELA_CRIA.setLocation((int)(dim.getWidth()-420)/2,(int)(dim.getHeight()-450)/2);
		TELA_CRIA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TELA_CRIA.getContentPane().setLayout(null);
		
		AREAA = new JTextArea("");
		AREAA.setBounds(50, 50, 350, 300);
 		TELA_CRIA.getContentPane().add(AREAA);
 		AREAA.setEditable(false);
 		
 		CRIAR = new JButton("CRIAR");
 		CRIAR.setBounds(50, 370,150, 40);
 		TELA_CRIA.getContentPane().add(CRIAR);
 		
 		NOMED = new JTextField ("");
 		NOMED.setBounds(52,15,150,25);
        TELA_CRIA.getContentPane().add(NOMED);
 		NOMED.setEditable(false);
 		
 		DATA = new JTextField ("");
 		DATA.setBounds(202,15,150,25);
        TELA_CRIA.getContentPane().add(DATA);
        DATA.setEditable(false);
        
        CRIAR.addActionListener(this);
        
        TELA_MOSTRA = new JFrame();
		TELA_MOSTRA.setVisible(false);
        TELA_MOSTRA.setTitle("Jogo do Milhao");
        TELA_MOSTRA.setSize(450,450);
        TELA_MOSTRA.setLocation((int)(dim.getWidth()-420)/2,(int)(dim.getHeight()-450)/2);
        TELA_MOSTRA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TELA_MOSTRA.getContentPane().setLayout(null);
        
        AREA = new JTextArea("");
        AREA.setBounds(50, 50, 350, 300);
        TELA_MOSTRA.getContentPane().add(AREA);
 		AREA.setEditable(false);
 		
 		PROXIMO = new JButton("PROXIMO");
 		PROXIMO.setBounds(50, 370,150, 40);
 		TELA_MOSTRA.getContentPane().add(PROXIMO);
 		
 		VOLTA = new JButton("VOLTA");
 		VOLTA.setBounds(200, 370,150, 40);
 		TELA_MOSTRA.getContentPane().add(VOLTA);
 		
 		DETA = new JLabel ("xxxxxxxxx");
 		DETA.setBounds(52,15,150,25);
 		TELA_MOSTRA.getContentPane().add(DETA);
 		
        NOMA = new JLabel ("xxxxxxxxx");
        NOMA.setBounds(202,15,150,25);
        TELA_MOSTRA.getContentPane().add(NOMA);
        
        PROXIMO.addActionListener(this);
        VOLTA.addActionListener(this);
	}
	
	
	private void Criad() {
		TELA_INICIAL.setVisible(false);
		TELA_CRIA.setVisible(true);
		NOMED.setEditable(true);
		op = 1;
	}
	private void CriaA() {
		TELA_INICIAL.setVisible(false);
		TELA_CRIA.setVisible(true);
		NOMED.setEditable(true);
		DATA.setEditable(true);
		AREAA.setEditable(true);
		op = 2;
	}
	private void CriaC() {
		TELA_INICIAL.setVisible(false);
		TELA_CRIA.setVisible(true);
		NOMED.setEditable(true);
		AREAA.setEditable(true);
		op = 3;
	}
	
	private void CRIAR(int op){
		
		switch(op){
		case 1:
			Disciplina d = new Disciplina(NOMED.getText());
			disciplina.add(d);
			break;
		case 2:
			Atividade a = new Atividade(NOMED.getText(), AREAA.getText(), DATA.getText());
			disciplina.get(0).addAtividade(a);
			break;

		case 3:
			Conteudo c = new Conteudo(NOMED.getText(), AREAA.getText());
			disciplina.get(0).addConteudo(c);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Acertou", "Parabens!", JOptionPane.INFORMATION_MESSAGE);
			break;
		}	
		
		TELA_INICIAL.setVisible(true);
		TELA_CRIA.setVisible(false);
		NOMED.setEditable(true);
		DATA.setEditable(true);
		AREAA.setEditable(true);
	}
	


	private void VerA() {
		NOMA.setText(disciplina.get(0).carregaAtividade().get(0).Retornanome());
		DETA.setText(disciplina.get(0).carregaAtividade().get(0).RetornadataEntrega());
		AREA.setText(disciplina.get(0).carregaAtividade().get(0).Retornadescrição());
		
		TELA_INICIAL.setVisible(false);
		TELA_MOSTRA.setVisible(true);
		op = 1;
	}
	private void VerD(){
		NOMA.setText(disciplina.get(0).nome());
		
		TELA_INICIAL.setVisible(false);
		TELA_MOSTRA.setVisible(true);
		op = 2;
		
	}
	private void VerC(){
		NOMA.setText(disciplina.get(0).carregaEmenta().get(0).Retornanome());
		AREA.setText(disciplina.get(0).carregaEmenta().get(0).Retornadescricao());
		
		TELA_INICIAL.setVisible(false);
		TELA_MOSTRA.setVisible(true);
		op = 3;
	}
	private void VOLTA() {
		TELA_MOSTRA.setVisible(false);
		TELA_INICIAL.setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == CRIARDISCIPLINA) 
		{
			Criad();
		}
		if (e.getSource() == CRIARATIVIDADE) 
		{
			CriaA();
		}
		
		if (e.getSource() == CRIARCONTEUDO)
		{
			 CriaC();
		}
		if (e.getSource() == ANOTAR)
		{
			 
		}
		
		
		if (e.getSource() == VERANOTA)
		{
			 
		}
		if (e.getSource() == VERADISCIPLINAS)
		{
			 VerD();
		}
		if (e.getSource() == VERAATIVIDADES)
		{
			 VerA();
		}
		if (e.getSource() == VERACONTEUDO)
		{
			 VerC();
		}
		
		if (e.getSource() == CRIAR)
		{
			 CRIAR(op);
		}
		if (e.getSource() == VOLTA)
		{
			 VOLTA();
		}
		if (e.getSource() == PROXIMO)
		{
			 CRIAR(op);
		}
	}
}
