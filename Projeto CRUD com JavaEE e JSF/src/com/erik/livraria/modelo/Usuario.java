package com.erik.livraria.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Integer id;
	private String email;
	private String senha;	

	
	//---------------------------Getters and Setters-----------------------//

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
	

	public String getSenha() {
		
		return senha;
	}

	
	public void setSenha(String senhaRecebida) {
		

		senha = senhaRecebida;
	}
	
	
}
