package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.Estado;




public class Dao {
    
	
	
    //Atributos para conexao com MySQL
    private String            caminho = "jdbc:mysql://";                                    //Endereco do banco de dados.
    private String            usuario = "root";                                             //Usuario do banco de dados
    private String            senha   = "breaks";                                           //Senha que criei para acesso ao banco
   
    public  Connection        conexao;                                                      //Objeto que realiza conexao com banco de dados
    public  PreparedStatement preparedStatement;                                            //Objeto para preparar e realizar queries no banco de dados
    public  ResultSet         resultSet;                                                    //Objeto para armazenar o resultado de queries   
    
   
    
    //Realiza a conexao com o banco
    public void realizarConexao(){
               
        try {
        	
        	
            
            //Usando o metodo "getConnection()" da classe "DriverManager" que retorna uma conexao feita com o banco.
        	conexao = DriverManager.getConnection(caminho, usuario, senha );

    
        	System.out.println("Conexão com o MySQL realizada com sucesso!");
        } 
        catch (SQLException erroOcorrido) {
            

            System.out.println("Problema ao realizar a conexão com o MySQL.\nErro ocorrido: "+erroOcorrido);
            
        }//catch
 
    }//realizarConexao
    
    
    
    public void desconectarDoBanco(){
    
        try {
            
            //Fecha a conexao com o banco de dados
        	conexao.close();
            
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados finalizada com sucesso" );

        } 
        catch (SQLException erroOcorrido) {
            
            JOptionPane.showMessageDialog(null, "Problema ao fechar a conexão.\nErro ocorrido: " +erroOcorrido);
            
        }//catch
    
    
    }//desconectarDoBanco
    
       
    
    //Se der algum erro, entao sera jogado uma Exception para quem chamou essa funcao
    public void gravarNovoEstadoNoBanco(Estado estadoRecebido) throws SQLException {
    	
    	realizarConexao();
	    	
    	
		//Preparando a query que vou executar
		preparedStatement = conexao.prepareStatement("insert into estados (nome_estado, sigla_estado) values (?,?);");
		
		//Passando os paramentros  da query (que sao o conteudo dos campos do formulario)
		preparedStatement.setString( 1, estadoRecebido.getNome_estado()  );
		preparedStatement.setString( 2, estadoRecebido.getSigla_estado() );		
		
		
		//Executar de fato o comando de insercao
		preparedStatement.executeUpdate();
			
    	//Fechando
		preparedStatement.close();
		
		desconectarDoBanco();
		
    }//gravarNovoEstadoNoBanco
    
    
    
    //Se der algum erro, entao sera jogado uma Exception para quem chamou essa funcao   
	public void deletarUmEstadoNoBanco( Estado estadoRecebido ) throws SQLException  {

		
    	realizarConexao();
    	
    	
		//Preparando a query que vou executar
		preparedStatement = conexao.prepareStatement("delete from estados where id_estado = ?;");
    	
		
		//Passando os paramentros  da query (que nesse caso eh so o Id que o usuario digitou la no formulario)
		preparedStatement.setInt( 1, estadoRecebido.getId_estado()  );
    	
    	
		//Executar de fato o comando de delecao
		preparedStatement.executeUpdate();
    	
    	//Fechando
		preparedStatement.close();
		
		desconectarDoBanco();
		
		
	}//deletarUmEstadoNoBanco

	

	public ArrayList<Estado> selecionarTudoDaTabelaEstadosNoBanco() throws SQLException {

		
    	realizarConexao();
	    
	    
		//Preparando a query que vou executar
		preparedStatement = conexao.prepareStatement("select * from estados order by id_estado;");
    	
		
		//Executar de fato o que faz a query 
		resultSet = preparedStatement.executeQuery();
		
	    //Objeto para armazenar o conteudo da tabela "estados" 
		ArrayList<Estado> arrayDeEstadosASerRetornado = new ArrayList<Estado>();
	    

	    
		
		//Mover para o primeiro registro
		//Enquanto houver linhas no resultSet
		while( resultSet.next() ) {
			
		    //Auxiliar
		    Estado auxObjetoEstado = new Estado();
			auxObjetoEstado.setId_estado   ( resultSet.getInt(1)    );
			auxObjetoEstado.setNome_estado ( resultSet.getString(2) );
			auxObjetoEstado.setSigla_estado( resultSet.getString(3) );
			

			//Adicionando um objeto do tipo "Estado" no array
			arrayDeEstadosASerRetornado.add(auxObjetoEstado);

			
		}//while
		
		
		//Liberando o resultSet da memoria
		resultSet.close();
		
    	//Fechando
		preparedStatement.close();
		
		
		desconectarDoBanco();
		
		
		return arrayDeEstadosASerRetornado;
		
	}//selecionarTudoDaTabelaEstadosNoBanco

	

	public void atualizaUmEstadoNoBanco(Estado estadoRecebido) throws SQLException  {
		
		
    	realizarConexao();
    	
    	
		//Preparando a query que vou executar
		preparedStatement = conexao.prepareStatement("update estados set nome_estado= ?, sigla_estado = ? where id_estado = ?;");
    	
		
		//Passando os paramentros  da query (que nesse caso eh so o Id que o usuario digitou la no formulario)
		preparedStatement.setString( 1, estadoRecebido.getNome_estado()  );
		preparedStatement.setString( 2, estadoRecebido.getSigla_estado() ); 	
		preparedStatement.setInt( 3, estadoRecebido.getId_estado() ); 
		
		//Executar de fato o comando de delecao
		preparedStatement.executeUpdate();
    	
    	//Fechando
		preparedStatement.close();
    	
		desconectarDoBanco();
		
		
	}//atualizaUmEstadoNoBanco
    
    
    
	
 
    
    
}//class
