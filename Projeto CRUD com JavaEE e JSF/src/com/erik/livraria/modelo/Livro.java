package com.erik.livraria.modelo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Livro {
	
	

	@Id
	@GeneratedValue
	private Integer id;
	
	private String  titulo;
	private String  isbn;
	private double  preco;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataLancamento = Calendar.getInstance();
                  
	@ManyToMany(fetch=FetchType.EAGER) 
	private List<Autor> autores = new ArrayList<Autor>();

	
	public Livro() {}
	
	
	public void adicionaAutor(Autor autorRecebido) {
		autores.add(autorRecebido);
	}
	
	
	public void removeAutor(Autor autorRecebido) {
		autores.remove(autorRecebido);
	}

	
	//------------------------Getters and Setters-------------------//
	
	public List<Autor> getAutores() {
		return autores;
	}

	
	public Integer getId() {		
		return id;
	}

	
	public void setId(Integer idRecebido) {

		id = idRecebido;
	}


	public String getTitulo() {

		return titulo;
	}

	
	public void setTitulo(String tituloRecebido) {

		titulo = tituloRecebido;
	}
	

	public String getIsbn() {
		
		return isbn;
	}

	
	public void setIsbn(String isbnRecebido) {
		
		System.out.println("\n***Livro.java***");
		System.out.println("Executando o metodo setTitulo()");	
		System.out.println("Parametro recebido: " +isbnRecebido);
		
		isbn = isbnRecebido;
	}
	

	public double getPreco() {
		
		return preco;
	}

	
	public void setPreco(double precoRecebido) {
		
		preco = precoRecebido;
	}
	

	public Calendar getDataLancamento() {
		
		return dataLancamento;
	}


	public void setDataLancamento(Calendar dataLancamentoRecebida) {

		this.dataLancamento = dataLancamentoRecebida;
	}

	
}