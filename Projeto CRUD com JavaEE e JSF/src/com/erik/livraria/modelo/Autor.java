package com.erik.livraria.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Autor {

	@Id                
	@GeneratedValue
	private Integer id;
	private String nome;
	private String email;
	
	
	//----------------------------------Getters and Setters--------------------------------//
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nomeRecebido) {
		
		nome = nomeRecebido;
	}

	
	public Integer getId() {

		return id;
	}

	
	public void setId(Integer idRecebido) {

		id = idRecebido;
	}

	
	public String getEmail() {
		
		return email;
	}

	
	public void setEmail(String emailRecebido) {
		email = emailRecebido;
	}

	
}
