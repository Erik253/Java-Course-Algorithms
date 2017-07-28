package BLL_Regra_De_Negocio;
import java.util.ArrayList;
import Dao.Dao;
import Modelo.Estado;


//Camada de negocios
public class EstadoBll {
	
	
	//Criando um objeto do tipo "ConectaBanco" que criei
    Dao dao = new Dao();

	
	
    //Se der algum erro, entao sera jogado uma Exception para quem chamou essa funcao
	public void gravarNovoEstadoPeloDao( Estado estadoRecebido ) throws Exception {
		
		//Aqui eu faco a regra de negocio e tals....

		dao.gravarNovoEstadoNoBanco( estadoRecebido );

		
	}//gravarNovoEstadoPeloDao


	
    //Se der algum erro, entao sera jogado uma Exception para quem chamou essa funcao
	public void deletarUmEstadoPeloDao( Estado estadoRecebido ) throws Exception  {
		
		
		//Aqui eu faco a regra de negocio e tals....

		dao.deletarUmEstadoNoBanco( estadoRecebido );

		
	}//deletarUmEstadoPeloDao


	
    //Se der algum erro, entao sera jogado uma Exception para quem chamou essa funcao
	public ArrayList<Estado> selecionarTudoDaTabelaEstadosPeloDao() throws Exception {
		
		
		//Aqui eu faco a regra de negocio e tals....
		

		
	    //Objeto para armazenar o conteudo da tabela "estados" 
		ArrayList<Estado> arrayDeEstadosASerRetornado = new ArrayList<Estado>();
		
		
	    arrayDeEstadosASerRetornado = dao.selecionarTudoDaTabelaEstadosNoBanco();
		
		
		return arrayDeEstadosASerRetornado;
		
		
		
	}//selecionarTudoDaTabelaEstadosPeloDao



    //Se der algum erro, entao sera jogado uma Exception para quem chamou essa funcao
	public void atualizaUmEstadoPeloDao(Estado estadoRecebido)  throws Exception {

		
		//Aqui eu faco a regra de negocio e tals....

		dao.atualizaUmEstadoNoBanco( estadoRecebido );
		
		
	}//atualizaUmEstadoPeloDao
    
	
	
	
	
    
}//class
