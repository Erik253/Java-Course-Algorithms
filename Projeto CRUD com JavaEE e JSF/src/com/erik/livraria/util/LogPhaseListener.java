package com.erik.livraria.util;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


public class LogPhaseListener implements PhaseListener {


	@Override
	public PhaseId getPhaseId() {
		
		return PhaseId.ANY_PHASE;
		
	}
	
	
	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Fase: " +event.getPhaseId() );
	}
	
	
	@Override 
	public void afterPhase(PhaseEvent event) {}

}
