
public class GuardadorDeObjetos {

	private Object[] contas;  //Object
	
	private int posicaoLivre;
	
	
	public GuardadorDeObjetos(){
		contas     = new Object[100];
		posicaoLivre = 0;
	}
	
	public void adiciona(Object nova){ //Object
		contas[posicaoLivre] = nova;
		posicaoLivre ++;	
	}
	
	
	public Object pega(int posicao){ //Object
		return contas[posicao];
	}//pega
	
}//GuardadorDeObjetos
