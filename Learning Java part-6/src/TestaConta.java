//Usando metodos getters and setters
//Usando "private" em um atributo
//Usando um metodo com "return"


public class TestaConta {
	
	public static void main(String[] args){
		
		Conta joao  = new Conta(); //Criar o objeto
		joao.setNumero(123);		
		
		Cliente dadosDoJoao = new Cliente(); // Criando objeto não primitivo que esta dentro de outra classe
		dadosDoJoao.nome	= "Joao da silva";
		joao.titular 		= dadosDoJoao;
		joao.limite 		= 100.0;
		
		//Fazendo um deposito
		joao.deposita(200.0);
		System.out.println( joao.getSaldo() ); //Chamando umm metodo com return
		
		joao.saca(500.0);
		System.out.println( joao.getSaldo() ); //Chamando umm metodo com return

		
		
		
	}//main
	
}//TestaConta
