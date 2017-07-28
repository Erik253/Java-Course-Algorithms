package com.erik.livraria.bean;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.erik.livraria.dao.DAO;
import com.erik.livraria.modelo.Autor;


@ManagedBean
@ViewScoped 
public class AutorBean {

	private Autor   autor = new Autor();
	private Integer autorId;
	
	

	public AutorBean() {
	}


	public String gravar() {
		
		DAO<Autor> dao = new DAO<Autor>(Autor.class) ;
		dao.adiciona( autor );
		
		System.out.println("Nome do autor gravado: " +autor.getNome()  );
		
		//Redirecionando para a pagina 'livro.xhtml'
		return "livro?faces-redirect=true";	
	}	
		

	public List<Autor> getAutores() {

		DAO<Autor> dao = new DAO<Autor>(Autor.class) ;
		List<Autor> listaDeAutoresARetornar = dao.listaTodos();
		
		  return listaDeAutoresARetornar; 
		}

	
	public void carregarOAutorASerAlterado(Autor autorRecebido) {
		
		autor = autorRecebido;		
	}
	
	
	public void remover(Autor autorRecebido) {

		DAO<Autor> dao = new DAO<Autor>(Autor.class) ;
		dao.remove( autorRecebido );
		
		System.out.println("*** Autor removido com sucesso do banco de dados ***");
	}

	
	public void carregarAutorPeloId() {
		
		DAO<Autor> dao = new DAO<Autor>(Autor.class) ;
		autor =  dao.buscaPorId( autorId );	
	}
	
	//---------------------Getters and Setters---------------------//
	
	public Autor getAutor() {
		return autor;
	}
	
	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}

		
}
