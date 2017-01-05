//Usando metodos getters and setters
//Usando "private" em um atributo
//Usando um metodo com "return"


public class TestaConta {
	
	public static void main(String[] args){
	
		//Criando contas
		Cliente dadosDoJoao  = new Cliente(); // Criando objeto não primitivo que esta dentro de outra classe
		dadosDoJoao.nome	 = "Joao da silva";
		dadosDoJoao.endereco = "Philadelphia street"; 
		Conta joao  = new Conta(dadosDoJoao); //Criando um objeto e passando um variavel para preencher os atributos do objeto criado
		
		Cliente dadosDoJose  = new Cliente(); // Criando objeto não primitivo que esta dentro de outra classe
		dadosDoJose.nome	 = "Jose";
		dadosDoJose.endereco = "Ny street"; 
		Conta jose  = new Conta(dadosDoJose); //Criando um objeto e passando um variavel para preencher os atributos do objeto criado	
		
		Cliente dadosDoErik  = new Cliente(); // Criando objeto não primitivo que esta dentro de outra classe
		dadosDoErik.nome	 = "Erik";
		dadosDoErik.endereco = "Manitoba street"; 		
		Conta erik  = new Conta(dadosDoErik); //Criando um objeto e passando um variavel para preencher os atributos do objeto criado	
				
		
		//verificando os dados da conta
		System.out.println("-------------------------");
		System.out.println("Numero da conta: " +joao.getNumero());
		System.out.println("Nome do titular: " +joao.titular.nome);
		System.out.println("Endereço       : " +joao.titular.endereco);

		System.out.println("-------------------------");
		System.out.println("Numero da conta: " +jose.getNumero());
		System.out.println("Nome do titular: " +jose.titular.nome);
		System.out.println("Endereço       : " +jose.titular.endereco);
		
		System.out.println("-------------------------");
		System.out.println("Numero da conta: " +erik.getNumero());
		System.out.println("Nome do titular: " +erik.titular.nome);
		System.out.println("Endereço       : " +erik.titular.endereco);

		
		//Criando valor limite para cada conta
		joao.limite 		= 100.0;
		jose.limite 		= 100.0;
		erik.limite 		= 100.0;
		
		
		//Fazendo depositos
		joao.deposita(200.0);
		System.out.println("Saldo do João: " +joao.getSaldo() ); //Chamando umm metodo com return

		jose.deposita(300.0);
		System.out.println("Saldo do Jose: " +jose.getSaldo() ); //Chamando umm metodo com return
		
		erik.deposita(400.0);
		System.out.println("Saldo do Erik: " +erik.getSaldo() ); //Chamando umm metodo com return

		
			
		
		//Fazendo saques
		joao.saca(500.0);
		System.out.println("Saldo do João: " +joao.getSaldo() ); //Chamando umm metodo com return

		jose.saca(200.0);
		System.out.println("Saldo do João: " +jose.getSaldo() ); //Chamando umm metodo com return
		
		erik.saca(1500.0);
		System.out.println("Saldo do João: " +erik.getSaldo() ); //Chamando umm metodo com return
		
		
	}//main
	
}//TestaConta
