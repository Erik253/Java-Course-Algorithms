
public class Conta {
	
	private double	saldo; //Só permite acesso via metodos
	private String  titular;

	
	public boolean saca(double valor){
			
		    if(this.saldo >= valor)
		    {
		    	this.saldo -= valor;
		    	System.out.println("------------------------");
		    	System.out.println("Saque de R$: " +valor);		
		    	return true;
		    }else
		    {
		    	throw new RuntimeException("Saldo Insuficiente"); //Exception de tempo de execucao
		    	 												  //Caso acontececa uma excecao, o programa sera parado
		    }
	
	}//saca
	
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("------------------------");
		System.out.println("Deposito de R$: " +valor);
	}//deposita
	
	
	public double getSaldo(){
		return this.saldo;
	}//pegaSaldo
	
	
	public String getTitular(){ 
		return this.titular;
	}//getString
	
		
	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	

	
	
	
}//Conta
