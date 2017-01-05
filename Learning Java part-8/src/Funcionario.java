
public class Funcionario {
	

	protected double salario; //As classes filhas podem acessar esse atributo
	
	
	
	public void setSalario(double salario){
		
		this.salario = salario;
	}//setSalario

	
	public double getBonus(){
		
		return this.salario * 0.2;
		
	}//getBonus
	
	
}
