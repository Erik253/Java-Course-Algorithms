//Usando metodos getters and setters
//Usando "private" em um atributo
//Usando um metodo com "return"

public class Conta {
	
	private double	 saldo; //Só permite acesso via metodos
	private int 	numero; //Só permite acesso via metodos
	double 			limite;
	int 			agencia;
	Cliente 		titular;
	
	
	
	public double getSaldo(){
		System.out.println("------------------------");
		System.out.println("Pega Saldo");
		return this.saldo;
	}//pegaSaldo
	
	
	
	public void saca(double valor){
		if( valor > (this.saldo + this.limite) ){
			System.out.println("------------------------");
			System.out.println("Saque");
			System.out.println("Saldo insuficiente");			
		}else{
			this.saldo -= valor;
			System.out.println("------------------------");
			System.out.println("Saque");
		}//else
			
	}//saca
		
	
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("------------------------");
		System.out.println("Deposito");
	}//deposita
	
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
		System.out.println("------------------------");
		System.out.println("Alteração de numero");
		
		
	}//mudaNumero
	

	
	
	
	
}//Conta
