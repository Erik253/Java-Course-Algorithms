package com.erik.livraria.dao;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import com.erik.livraria.modelo.Usuario;

public class UsuarioDao {

	public boolean existe( Usuario usuario) {


	    EntityManager em = new JPAUtil().getEntityManager();
	    
	    //Selecione todas as linhas da tabela "Usuario" onde a coluna "email" seja igual ao parametro que passei e a coluna "senha" seja igual ao parametro que passei
	    TypedQuery<Usuario> query = em.createQuery( "select linha from Usuario linha where linha.email = :parametroEmail and linha.senha = :parametroSenha", Usuario.class );

	    query.setParameter( "parametroEmail", usuario.getEmail() );
	    query.setParameter( "parametroSenha", usuario.getSenha() );

	    
	    try {
	    	
	    	//Executa a query
	        Usuario resultado = query.getSingleResult();
	    } 
	    catch ( NoResultException ex ) {
	    	
	    	//Se a query nao retornar resultados
	        return false;
	    }
	    
	    
	    em.close();

	    return true;
	    
	    
	}
	

}
