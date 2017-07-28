package com.erik.livraria.util;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import com.erik.livraria.modelo.Usuario;


public class Autorizador implements PhaseListener {

	
	@Override 
	public PhaseId getPhaseId() {
		
		//Dizendo que os metodos beforePhase e o afterPhase vao ser chamados somente na fase "1-RESTORE_VIEW" do JSF
		return PhaseId.RESTORE_VIEW;
	}
	
	
	@Override
	public void beforePhase(PhaseEvent event) {

		System.out.println("Fase: " +event.getPhaseId() );
	}
	
	
	@Override
	public void afterPhase(PhaseEvent evento) {

		FacesContext context = evento.getFacesContext();

		String nomeDapagina = context.getViewRoot().getViewId();
		
	
		if( "/login.xhtml".equals(nomeDapagina)) {
			
			//Finalizo o metodo aqui. E o fluxo continua para enviar a pagina "login.xhtml" para o cliente
			return;		
		}
		
		
		Usuario usuarioLogadoExtraido = (Usuario)context.getExternalContext().getSessionMap().get("usuarioLogado");
				
		
		//Se "usuarioLogadoExtraido" nao for nulo, sinifica que o usuario esta logado no sistema, entao eu mando a pagina que ele solicitou
		if( usuarioLogadoExtraido != null ){
		
			return;		
		}
		else {
		
			NavigationHandler handler = context.getApplication().getNavigationHandler();
			handler.handleNavigation(context, null, "/login?faces-redirect=true");

			context.getRenderResponse();
		}
			
	}


}
