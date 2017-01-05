
public class TestaFuncionario {
	
	public static void main(String[] args){
		

		
		
		Gerente joaquim = new Gerente(); 			//Criando um objeto de uma classe filha
		
		joaquim.setSalario(2000.0);
		joaquim.setNome("Erik");
		
		System.out.println("Bônus Gerente: " +joaquim.getBonus());
		
		
		Desenvolvedor erik = new Desenvolvedor();  //Criando um objeto de uma classe filha
		
		erik.setSalario(30000.0);
		System.out.println("Bônus Desenvolvedor: " +erik.getBonus());
		
		
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		

		totalizador.adicionaBonus(joaquim); //passando um objeto como parametro
		totalizador.adicionaBonus(erik);    //passando um objeto como parametro
		System.out.println("Totalizador de bonus: " +totalizador.getTotal());
		
		
	}//main

}
