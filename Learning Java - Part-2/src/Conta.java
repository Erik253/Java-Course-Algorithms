//Object used in "Programa_10
//Using Attributes
//Using a Method
//

public class Conta {
	
	//Attributes
	int 	numero;
	double 	saldo;
	int 	agencia;
	Pessoa  titular; //Variavel da classe "Pessoa"
	                 //Ela possui todos os atributos de um objeto "Pessoa"
	
	
	//Methods
	void deposita(double valorASerDepositado){ //A palavra void � usado quando o metodo n�o retorna nada!
		this.saldo += valorASerDepositado;     //O "this � usado para indicar que a variavel "saldo" � referente a classe, e n�o uma variavel nova criada.	
	}
	
	
	void sacar(double valorASerSacado){
		if (this.saldo >= valorASerSacado){ //Se valor do saldo for maior que o de saque, entao faz saque!
				this.saldo -= valorASerSacado;
		}//if		
	}//void
	
	
	void transfere(double valor, Conta destino){
		this.saldo    -=valor; //Debita do saldo do objeto que esta chamando o metodo
		destino.saldo +=valor;
		
		
	}//transfere
	
}