//Usando metodos getters and setters
//Usando "private" em um atributo
//Usando um metodo com "return"
//Usando um metodo "construtor" para criação de objeto

public class Conta {
	
	private double	 saldo; //Só permite acesso via metodos
	private int 	numero; //Só permite acesso via metodos
	double 			limite;
	int 			agencia;
	Cliente 		titular;
	
	static int totalDeContas = 0; //è global para todos os objetos já criados e que serão criados
	                              //Essa variavel não vai perder o valor aculado
	
	
	public Conta(Cliente titular){  //O metodo construtor é utilizado para quando eu
		this.titular = titular;     //-for criar um objeto, eu possa passar parametros e já preencher os valores de atributos

		totalDeContas ++;           //Cada vez que criar uma conta, ela recebera um novo numero automaticamente
		this.numero = totalDeContas;
	
	}//Construtor
	
	
	public double getSaldo(){
		System.out.println("------------------------");
		System.out.println("Pega Saldo");
		return this.saldo;
	}//pegaSaldo
	
	
	public int getNumero(){ //Metodo para retornar o numero da conta
		return this.numero;
	}//getNumero
	
	
	
	public void saca(double valor){
		if( valor > (this.saldo + this.limite) ){
			System.out.println("------------------------");
			System.out.println("Saque");
			System.out.println("Saldo insuficiente");			
		}else{
			this.saldo -= valor;
			System.out.println("------------------------");
			System.out.println("Saque de: " +valor);
		}//else
			
	}//saca
		
	
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("------------------------");
		System.out.println("Deposito de: " +valor);
	}//deposita
	
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
		System.out.println("------------------------");
		System.out.println("Alteração de numero");
		
		
	}//mudaNumero
	

	
	
	
	
}//Conta
