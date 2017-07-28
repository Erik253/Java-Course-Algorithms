package UI_Formularios;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import BLL_Regra_De_Negocio.EstadoBll;
import Modelo.Estado;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;




public class FormularioDeEstados extends JFrame {

	
    //----Atributos da classe----//
	private JPanel     contentPane;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfSigla;
	private JButton    btnSalvar;
	private JButton    btnNovo;
	private JButton    btnAtualizar;
	private JButton    btnDeletar;
	private JButton    btnSkipPrimeiro;
	private JButton    btnAnterior;
	private JButton    btnProximo;
	private JButton    btnSkipUltimo;
	
	//Criando um obj estadoBll que tem o metodo que se comunica com a classe Dao que por fim acessa o Banco de dados
	EstadoBll estadoBll = new EstadoBll();
    
    //Objeto para armazenar o conteudo da tabela "estados" 
	ArrayList<Estado> arrayDeEstados = new ArrayList<Estado>();


    
	//Construtor
	public FormularioDeEstados() {

		
		
		//----Definindo como sera a janela----/	
		setTitle("Formul\u00E1rio de Cadastro de Estados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 532, 322);
		
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
		
        setLocationRelativeTo(null);
		
		
        
		//----Definindo os componenetes da janela----/		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panelDoFormulario = new JPanel();
		panelDoFormulario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
		panelDoFormulario.setBounds(0, 50, 513, 214);
		panelDoFormulario.setLayout(null);
		contentPane.add(panelDoFormulario);
		
		
		
		JLabel lbCodigo = new JLabel("C\u00F3digo:");
		lbCodigo.setBounds(77, 31, 46, 14);
		panelDoFormulario.add(lbCodigo);
		
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(87, 57, 36, 14);
		panelDoFormulario.add(lbNome);
		
		
		JLabel lbSigla = new JLabel("Sigla:");
		lbSigla.setBounds(296, 44, 46, 14);
		panelDoFormulario.add(lbSigla);
		
		
		tfNome = new JTextField();
		tfNome.setToolTipText("Campo Nome");
		tfNome.setBounds(128, 54, 158, 20);
		panelDoFormulario.add(tfNome);
		tfNome.setColumns(10);
		
		
		tfSigla = new JTextField();
		tfSigla.setToolTipText("Campo Sigla");
		tfSigla.setBounds(330, 41, 86, 20);
		panelDoFormulario.add(tfSigla);
		tfSigla.setColumns(10);
		
		btnNovo = new JButton("");
		btnNovo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				botaoNovoEstado();
			}
		});
		
		btnNovo.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_adicionar_36_36.png")));
		btnNovo.setToolTipText("Novo");
		btnNovo.setBounds(115, 96, 67, 38);
		panelDoFormulario.add(btnNovo);
		
		
		
		btnSalvar = new JButton("");
		btnSalvar.setEnabled(false);
		btnSalvar.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_salvar_36x36.png")));
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.setBounds(192, 96, 67, 38);
		panelDoFormulario.add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			//Acao do botao Salvar
			public void actionPerformed(ActionEvent e) {
				
				//Realiza um insert na tabela "estados" pegando o conteudo os dados do formulario
				gravarNovoEstado();
				
			}		
		});//addActionListener
		
		

		
		
		
		btnAtualizar = new JButton("");
		btnAtualizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Realiza a atualizacao do estado
				botaoAtualizarEstado();
			}
		});
		btnAtualizar.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_atualizar_36x36.png")));
		btnAtualizar.setToolTipText("Atualizar");
		btnAtualizar.setBounds(269, 96, 67, 38);
		panelDoFormulario.add(btnAtualizar);
		
		
	
		btnDeletar = new JButton("");
		btnDeletar.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_deletar_36x36.png")));
		btnDeletar.setToolTipText("Deletar");
		btnDeletar.setBounds(346, 96, 67, 38);
		btnDeletar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				//Realiza delecao de uma linha na tabela "estados" pelo id do item
				realizaDelecao();
			
			
			}
		});
		panelDoFormulario.add(btnDeletar);
		
		tfCodigo = new JTextField();
		tfCodigo.setToolTipText("Campo C\u00F3digo");
		tfCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfCodigo.setBackground(SystemColor.controlDkShadow);
		tfCodigo.setForeground(SystemColor.desktop);
		tfCodigo.setEnabled(false);
		tfCodigo.setColumns(10);
		tfCodigo.setText("");
		tfCodigo.setBounds(128, 28, 158, 20);
		panelDoFormulario.add(tfCodigo);
		
		btnSkipPrimeiro = new JButton("");
		btnSkipPrimeiro.setToolTipText("Ir para o primeiro registro");
		btnSkipPrimeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botaoSkipPrimeiro();
				
			}
		});
		btnSkipPrimeiro.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_skipBack_24x24.png")));
		btnSkipPrimeiro.setBounds(64, 161, 89, 23);
		panelDoFormulario.add(btnSkipPrimeiro);
		
		btnAnterior = new JButton("");
		btnAnterior.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_back_24x24.png")));
		btnAnterior.setBounds(163, 161, 89, 23);
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botaoAnterior();
			}
		});
		
		panelDoFormulario.add(btnAnterior);
		
		btnProximo = new JButton("");
		btnProximo.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_next_24x24.png")));
		btnProximo.setBounds(269, 161, 89, 23);
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botaoProximo();
			}
		});

		panelDoFormulario.add(btnProximo);
		
		btnSkipUltimo = new JButton("");
		btnSkipUltimo.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_skipNext_24x24.png")));
		btnSkipUltimo.setBounds(368, 161, 89, 23);
		btnSkipUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botaoSkipUltimo();
			}
		});
		panelDoFormulario.add(btnSkipUltimo);
		
		
		JLabel lblNewLabel = new JLabel("Formul\u00E1rio de Cadastro de Estados");
		lblNewLabel.setBounds(116, 11, 284, 20);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		JButton btnFechar = new JButton("");
		btnFechar.setBounds(439, 11, 67, 38);
		btnFechar.setIcon(new ImageIcon(FormularioDeEstados.class.getResource("/Imagens/icon_btn_close_36x36.png")));
		btnFechar.setToolTipText("Fechar Janela");
		contentPane.add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Fecha o formulario
				fecharFormularioDeEstados();
				
			}
		});//addActionListener

		
		
		//Seleciona todos os itens da tabela "Estados"
		selecionarTudoDaTabelaEstados();
		
	
		
	}//Construtor

	
	
	public void fecharFormularioDeEstados() {
		
		//Fecha o formulario mas nao finaliza o programa inteiro
		dispose();
		
	}//fecharFormularioDeEstados
	
	
	//Limpando o conteudo dos campos do formulario
	public void limparCampos() {
		
		tfCodigo.setText("");
		tfNome.setText("");
		tfSigla.setText("");	
		
	}//limparCampos	

	
	public void selecionarTudoDaTabelaEstados(){
		


		try {
			
			//Chama o metodo para selecionar todos os itens da tabela "estados"
			arrayDeEstados = estadoBll.selecionarTudoDaTabelaEstadosPeloDao();
		
			
			//Exibindo uma mensagem de sucesso
			System.out.println("\nMetodo: 'selecionarTudoDaTabelaEstados()'\nSeleção de todos os itens da tabela 'estados' realizado com sucesso!");

						
			//Preenche o formulario com o primeiro item
			botaoSkipPrimeiro();
			
			
			
		} 
		catch (Exception erroOcorrido) {
			
			//Exibindo uma mensagem de erro
			JOptionPane.showMessageDialog(null,"Problema ocorrido.\nMetodo: 'selecionarTudoDaTabelaEstados()'\nSeleção de todos os itens da tabela 'estados' falhou.\nDetalhes do erro: "+erroOcorrido);
			System.out.println("\nProblema ocorrido.\nMetodo: 'selecionarTudoDaTabelaEstados()'\nSeleção de todos os itens da tabela 'estados' falhou.\nDetalhes do erro: "+erroOcorrido);

		}
		
	}//selecionarTudoDaTabelaEstados

	
	
	public void botaoSkipPrimeiro(){
		
 
			
	    	//Pegando o conteudo da primeira linha do resultado da query e colocando em um objeto do tipo Estado
			Estado objetoEstado = new Estado();
			objetoEstado.setId_estado   ( arrayDeEstados.get(0).getId_estado()    );
			objetoEstado.setNome_estado ( arrayDeEstados.get(0).getNome_estado()  );
			objetoEstado.setSigla_estado( arrayDeEstados.get(0).getSigla_estado() );
			tfNome.setText  ( objetoEstado.getNome_estado()  );
			tfSigla.setText ( objetoEstado.getSigla_estado() );
			tfCodigo.setText( String.valueOf( objetoEstado.getId_estado() )  );
			
			//Exibindo uma mensagem de sucesso
			System.out.println("\nMetodo: 'botaoSkipPrimeiro'\n Realizado com sucesso!");

		
	}//botaoSkipPrimeiro
	



	public void botaoAnterior(){
		
		/*A logica esta um pouco confusa, mas isso tudo eh so para voltar um item no formulario*/
		
		
		int tamanhoDoArray =  arrayDeEstados.size();
		
		int codigoAtualDoFormulario = Integer.parseInt( tfCodigo.getText() );
		
		int posicaoDoArrayComOCodigoAtual = 0;
		
		
		
		//Passar por todas as posicoes do arrayDeEstados
		for( int i=0; i < tamanhoDoArray; i++ ) {
			
			//Se o codigoAtualDoFormulario for o mesmo do campo "Id_estado" da posicao do Array, entao.
			if( codigoAtualDoFormulario == arrayDeEstados.get(i).getId_estado() ) {
				
				posicaoDoArrayComOCodigoAtual = i;
			}
			
		}//for
		
		
		
		//----Verificando se devo ou nao preencher o formulario da tela
		if( posicaoDoArrayComOCodigoAtual == 0 ) {
			
			/*Isso significa que o que esta sendo mostrado no formulario, eh  primeira posicao do Array
			 ou seja, a posicao "0" do array. Entao, basta nao fazer nada, pois nao ha posicao anterior a posicao "0".
			 Puts, ficou dificil de entender rsrs */
		}
		else {

			//Preenchendo os campos do formulario da tela o conteudo de uma posicao anterior a posicao que esta preenchendo o formulario da tela
			tfCodigo.setText( String.valueOf( arrayDeEstados.get( posicaoDoArrayComOCodigoAtual - 1).getId_estado()  ) );
			tfNome.setText  ( arrayDeEstados.get( posicaoDoArrayComOCodigoAtual - 1).getNome_estado()  );
			tfSigla.setText ( arrayDeEstados.get( posicaoDoArrayComOCodigoAtual - 1).getSigla_estado() );
			
		}//else

		
		
	}//botaoAnterior
	
	
	
	public void botaoProximo(){
		
		
		
		/*A logica esta um pouco confusa, mas isso tudo eh so para voltar um item no formulario*/
		
		
		int tamanhoDoArray =  arrayDeEstados.size();
		
		int codigoAtualDoFormulario = Integer.parseInt( tfCodigo.getText() );
		
		int posicaoDoArrayComOCodigoAtual = 0;
		
		
		
		//Passar por todas as posicoes do arrayDeEstados
		for( int i=0; i < tamanhoDoArray; i++ ) {
			
			//Se o codigoAtualDoFormulario for o mesmo do campo "Id_estado" da posicao do Array, entao.
			if( codigoAtualDoFormulario == arrayDeEstados.get(i).getId_estado() ) {
				
				posicaoDoArrayComOCodigoAtual = i;
			}
			
		}//for
		
		
		
		//----Verificando se devo ou nao preencher o formulario da tela
		if( posicaoDoArrayComOCodigoAtual == tamanhoDoArray - 1 ) {
			
			/*Isso significa que o que esta sendo mostrado no formulario, eh  ultima posicao do Array
			 ou seja, a posicao "tamanhoDoArray - 1" do array. Entao, basta nao fazer nada, pois nao ha posicao posterior a posicao "0".
			 Puts, ficou dificil de entender rsrs */
		}
		else {

			//Preenchendo os campos do formulario da tela o conteudo de uma posicao anterior a posicao que esta preenchendo o formulario da tela
			tfCodigo.setText( String.valueOf( arrayDeEstados.get( posicaoDoArrayComOCodigoAtual + 1).getId_estado()  ) );
			tfNome.setText  ( arrayDeEstados.get( posicaoDoArrayComOCodigoAtual + 1).getNome_estado()  );
			tfSigla.setText ( arrayDeEstados.get( posicaoDoArrayComOCodigoAtual + 1).getSigla_estado() );
			
		}//else

		
		
		
		
	}//botaoProximo
	
	
	public void botaoSkipUltimo(){
		

	    	//Pegando o conteudo da ultima linha do resultado da query e colocando em um objeto do tipo Estado
			Estado objetoEstado = new Estado();
			objetoEstado.setId_estado   ( arrayDeEstados.get( arrayDeEstados.size() -1 ).getId_estado()    );
			objetoEstado.setNome_estado ( arrayDeEstados.get( arrayDeEstados.size() -1 ).getNome_estado()  );
			objetoEstado.setSigla_estado( arrayDeEstados.get( arrayDeEstados.size() -1 ).getSigla_estado() );
			
			
			
			//Preenchendo os campos do formulario da tela
			tfCodigo.setText  ( String.valueOf( objetoEstado.getId_estado() )  );
			tfNome.setText  ( objetoEstado.getNome_estado()  );
			tfSigla.setText ( objetoEstado.getSigla_estado() );
			
			
			//Exibindo uma mensagem de sucesso
			System.out.println("\nMetodo: 'botaoSkipPrimeiro'\n Realizado com sucesso!");


		
		
	}//botaoSkipUltimo

	
	public void botaoNovoEstado() {
		
		
		limparCampos();
		
		
		//Desabilitando e habilitando componentes do formulario
		tfNome.setEnabled   (true);
		tfSigla.setEnabled  (true);
		btnSalvar.setEnabled(true);
		btnNovo.setEnabled  (false);
		btnAtualizar.setEnabled (false);
		btnDeletar.setEnabled (false);
		btnSkipPrimeiro.setEnabled (false);
		btnAnterior.setEnabled (false);
		btnProximo.setEnabled (false);
		btnSkipUltimo.setEnabled (false);
		
		
	}//botaoNovoEstado
	
	
	//Realiza um insert
	public void gravarNovoEstado() {
		
		
        //Criando um obj do tipo "Estado" e pegando o conteudo digitado no formulario
        Estado objEstado = new Estado();
        objEstado.setNome_estado ( tfNome.getText()  ); 
        objEstado.setSigla_estado( tfSigla.getText() );
		
        
		try {
			
			//Chama o metodo de insercao da camada BLL(Camada de negocio)
			estadoBll.gravarNovoEstadoPeloDao( objEstado );
			
			
			//Exibindo uma mensagem de sucesso
			JOptionPane.showMessageDialog(null,"Novo Estado salvo com sucesso!");
			
		} 
		catch (Exception erroOcorrido) {
			
			//Exibindo uma mensagem de sucesso
			JOptionPane.showMessageDialog(rootPane,"Erro ao salvar novo estado!\nErro ocorrido: " +erroOcorrido);
	
		}
		finally {
			
			//Limpando o conteudo dos campos do formulario
			limparCampos();
			
			//Desabilitando e habilitando componentes do formulario
			tfNome.setEnabled   (false);
			tfSigla.setEnabled  (false);
			btnSalvar.setEnabled(false);
			btnNovo.setEnabled  (true);
			btnAtualizar.setEnabled (true);
			btnDeletar.setEnabled (true);
			btnSkipPrimeiro.setEnabled (true);
			btnAnterior.setEnabled (true);
			btnProximo.setEnabled (true);
			btnSkipUltimo.setEnabled (true);
			
			//Atualixar - Seleciona todos os itens da tabela "Estados"
			selecionarTudoDaTabelaEstados();
		
		}//finally
		
		
		
		
	}//realizarInsert
	
	
	//Realiza delecao por id
	public void realizaDelecao() {
		
		
        //Criando um obj do tipo "Estado" e pegando o  conteudo digitado no campo "Codigo" do formulario
        Estado objEstado = new Estado();
        objEstado.setId_estado ( Integer.parseInt( tfCodigo.getText() )  );        

		
        
        //Acessando o metodo de delecao pelo objeto "estadoBll"
		try {
			
			//Chama o metodo de delecao da camada BLL(Camada de negocio)
			estadoBll.deletarUmEstadoPeloDao( objEstado );
			
			//Exibindo uma mensagem de sucesso
			JOptionPane.showMessageDialog(null,"Estado com o Id="+tfCodigo.getText()+ "deletado com sucesso!");
			
		} 
		catch (Exception erroOcorrido) {
			
			//Exibindo uma mensagem de sucesso
			JOptionPane.showMessageDialog(rootPane,"Erro ao deletar o estado com o id=" +tfCodigo.getText()+"\nErro ocorrido: " +erroOcorrido);

		}
		finally {
			
			//Limpando o conteudo dos campos do formulario
			limparCampos();
			
			//Seleciona todos os itens da tabela "Estados"
			selecionarTudoDaTabelaEstados();
			
		}//finally
		

	}//realizaDelecao
	
	

	
	//Realiza a atualizacao do estado
	public void botaoAtualizarEstado(){
		
		
        //Criando um obj do tipo "Estado" e pegando o  conteudo digitado no formulario
        Estado objEstado = new Estado();
        objEstado.setId_estado ( Integer.parseInt( tfCodigo.getText() )  );        
        objEstado.setNome_estado ( tfNome.getText()  ); 
        objEstado.setSigla_estado( tfSigla.getText() );
		
        
        //Acessando o metodo de atualizacao pelo objeto "estadoBll"
		try {
			
			//Chama o metodo de delecao da camada BLL(Camada de negocio)
			estadoBll.atualizaUmEstadoPeloDao( objEstado );
			
			//Exibindo uma mensagem de sucesso
			JOptionPane.showMessageDialog(null,"Estado com o Id= "+tfCodigo.getText()+ " Atualizado com sucesso!");
			
		} 
		catch (Exception erroOcorrido) {
			
			//Exibindo uma mensagem de sucesso
			JOptionPane.showMessageDialog(rootPane,"Erro ao tentar atualizar o estado com o id=" +tfCodigo.getText()+"\nErro ocorrido: " +erroOcorrido);

		}
		finally {
			
			//Limpando o conteudo dos campos do formulario
			limparCampos();
			
			//Seleciona todos os itens da tabela "Estados"
			selecionarTudoDaTabelaEstados();
			
		}//finally
		
		
	}//botaoAtualizarEstado
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}//class
