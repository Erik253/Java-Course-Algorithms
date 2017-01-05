//

public class Conta {

	private double saldo; // Só permite acesso via metodos
	Cliente titular;


	public Conta(double SaldoInicial) {
		this.saldo = SaldoInicial;
	}// Construtor 1

	public double getSaldo() {
		System.out.println("------------------------");
		System.out.println("Pega Saldo");
		return this.saldo;
	}// pegaSaldo


	@Override
	public String toString() { // Metodo Herdado da classe mae "Object"
								// Sobreescrevendo o metodo
		return "Conta com saldo " + this.saldo;
	}// toString

	
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Conta)) { //Se o objeto passado nao for conta
			return false;
		} else {                    //Se for compra o saldo

			Conta outra = (Conta) obj;
			return outra.saldo == this.saldo;
		}
	}// equals

}// Conta
