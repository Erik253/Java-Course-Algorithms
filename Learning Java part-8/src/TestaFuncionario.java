
public class TestaFuncionario {
	
	public static void main(String[] args){
		
		Funcionario joao = new Funcionario();
		
		joao.setSalario(1000.0);
		System.out.println("Bônus Funcionario: " +joao.getBonus());
		
		
		Gerente joaquim = new Gerente(); 			//Criando um objeto de uma classe filha
		
		joaquim.setSalario(2000.0);
		System.out.println("Bônus Gerente: " +joaquim.getBonus());
		
		
		Desenvolvedor erik = new Desenvolvedor();  //Criando um objeto de uma classe filha
		
		erik.setSalario(9900.0);
		System.out.println("Bônus Desenvolvedor: " +erik.getBonus());
		
		
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		
		totalizador.adicionaBonus(joao);    //passando um objeto como parametro
		totalizador.adicionaBonus(joaquim); //passando um objeto como parametro
		totalizador.adicionaBonus(erik);    //passando um objeto como parametro
		System.out.println("Totalizador de bonus: " +totalizador.getTotal());
		
		
	}//main

}
