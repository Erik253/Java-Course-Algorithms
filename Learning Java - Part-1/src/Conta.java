//Object used in "Programa_9
//Using Attributes
//Using a Method
//

public class Conta {
	
	//Attributes
	int 	numero;
	String 	titular;
	double 	saldo;
	int 	agencia;

	
	//Methods
	public void deposita(double valorASerDepositado){ //A palavra void � usado quando o metodo n�o retorna nada!
		this.saldo += valorASerDepositado;     //O "this � usado para indicar que a variavel "saldo" � referente o saldo do objeo que chamou o metodo, e n�o uma variavel nova criada dentro da classe.	
	}
	
	
	public void sacar(double valorASerSacado){
		if (this.saldo >= valorASerSacado){ //Se valor do saldo for maior que o de saque, entao faz saque!
				this.saldo -= valorASerSacado;
		}//if		
	}//void
	
	
	public void transfere(double valor, Conta destino){
		this.saldo    -=valor; //Debita do saldo do objeto que esta chamando o metodo
		destino.saldo +=valor;
		
		
	}//transfere
	
}