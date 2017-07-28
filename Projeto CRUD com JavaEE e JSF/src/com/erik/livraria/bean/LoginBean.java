package com.erik.livraria.bean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import com.erik.livraria.dao.UsuarioDao;
import com.erik.livraria.modelo.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean {

	private Usuario usuario = new Usuario();

	public LoginBean() {}
	
	public String efetuarLogin() {
		
		UsuarioDao dao = new UsuarioDao();

		boolean usuarioExisteNoBanco = dao.existe( usuario );

		FacesContext context = FacesContext.getCurrentInstance();
		

		if( usuarioExisteNoBanco ) {

			context.getExternalContext().getSessionMap().put("usuarioLogado", this.usuario);

		    return "livro?faces-redirect=true";
		
		}
		else {
			
			context.getExternalContext().getFlash().setKeepMessages(true);    
			context.addMessage( null, new FacesMessage("Usuario ou senha invalida") );

			return "login?faces-redirect=true";	
		}	
	}
	
	public String deslogar() {

		FacesContext context = FacesContext.getCurrentInstance();
		
		context.getExternalContext().getSessionMap().remove("usuarioLogado");

		return "login?faces-redirect=true";
	}
	
	
	//---------------------Getters and Setters---------------------//
	
	public Usuario getUsuario() {
		
		return usuario;
	}
	
}
