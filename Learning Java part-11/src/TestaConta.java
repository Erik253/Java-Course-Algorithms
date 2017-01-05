
public class TestaConta {
	
	public static void main(String[] args){
		
		Conta joao = new Conta();
		joao.deposita(50.0);
		
		
		if( joao.saca(100.0) == true  ){
		
			System.out.println("Saque efetuado com sucesso");	
			System.out.println("Saldo atual: R$ " +joao.getSaldo() );
		}

		
	}//main
	
}//TestaConta
