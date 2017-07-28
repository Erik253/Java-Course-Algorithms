package com.erik.livraria.bean;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import com.erik.livraria.dao.DAO;
import com.erik.livraria.modelo.Autor;
import com.erik.livraria.modelo.Livro;



@ManagedBean   
@ViewScoped
public class LivroBean {
	
	private Livro   livro = new Livro();
	private Integer autorId; 
	
	
	public void gravar() {
	
		if ( livro.getAutores().isEmpty()  ) {

			FacesContext.getCurrentInstance().addMessage( "mensagemValidacaoSeTemAutor", new FacesMessage("O livro deve ter pelo menos 1 autor") );
			return;
		}

	
		if( livro .getId() == null) {

			DAO<Livro> dao = new DAO<Livro>(Livro.class) ;
			dao.adiciona( livro );	
		}
		else {

			DAO<Livro> dao = new DAO<Livro>(Livro.class) ;
			dao.atualiza( livro );	
		}
		
		livro = new Livro();
		
	}

	
	public void remover(Livro livroRecebido) {
		
		DAO<Livro> dao = new DAO<Livro>(Livro.class) ;
		dao.remove( livroRecebido );
		
		System.out.println("*** Livro removido com sucesso do banco de dados ***");	
	}

	
	public void carregarOLivroASerAlterado(Livro livroRecebido) {
		
		livro = livroRecebido;
				
	}

	
	public void gravarAutor() {

		DAO<Autor> dao = new DAO<Autor>(Autor.class) ;
		Autor autorSelecionado = dao.buscaPorId( autorId );
		
		livro.adicionaAutor( autorSelecionado );
	
		System.out.println("Nome do Autor associado ao livro: " +autorSelecionado.getNome() );	
	}
	
	
	public void removerAutorDoLivro( Autor autorRecebido) {
		
		livro.removeAutor(autorRecebido);
	}

	
	public List<Autor>getAutoresDoLivro(){
		
		return livro.getAutores();	
	}
	
	
	public List<Autor> getAutores(){

		DAO<Autor> dao = new DAO<Autor>(Autor.class) ;
		List<Autor> listaDeAutoresARetornar = dao.listaTodos();
		
		return listaDeAutoresARetornar;		
	}

	
	public List<Livro> getLivros() {

		DAO<Livro> dao = new DAO<Livro>(Livro.class) ;
		List<Livro> listaDeLivrosARetornar = dao.listaTodos();

     	return listaDeLivrosARetornar;
		  
		  
		}
	
	
	public String formAutor() {
		
		return "autor?faces-redirect=true";	
	}
	
	
	//----------------------Metodos validadores--------------------------------//
	
	public void comecaComDigitoUm( FacesContext fc, UIComponent component, Object value) throws ValidatorException {

		String valor = value.toString();
		
		if( !valor.startsWith("1") ) {

			throw new ValidatorException ( new FacesMessage("O campo ISBN deve começar com o caracter '1'") );
			
		}	
	}
	
	
	//-------------------Getters and Setters----------------------------------//

	public Livro getLivro() {
		
		return livro;
	}


	public Integer getAutorId() {
		
		return autorId;
	}


	public void setAutorId( Integer autorIdRecebido ) {
		
		autorId = autorIdRecebido;
	}

	
	
	
}//class
