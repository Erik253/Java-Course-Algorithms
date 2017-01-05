
public class TotalizadorDeBonus {
	
	private double total = 0;
	
	
	
	public void adicionaBonus(Funcionario funcionario){//recebendo um objeto como parametro
		
		total += funcionario.getBonus(); //Adicionando o valor do bonus do funcionario que chamar
		
	}//adicionaBonus
	
	
	
	public double getTotal(){
		
		return this.total;
		
	}//getTotal
	
	
}//
