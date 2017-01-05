
public class TestaFuncionario {
	
	public static void main(String[] args){
		
		int senhaDoSistema =123;
		
		
		Desenvolvedor erik = new Desenvolvedor();  //Criando um objeto de uma classe filha
		erik.setSalario(30000.0);
		System.out.println("Bônus Desenvolvedor: R$" +erik.getBonus());


			
		DBA joao = new DBA();  //Criando um objeto de uma classe filha
		joao.setSalario(30000.0);
		System.out.println("Bônus DBA: R$" +joao.getBonus());

		
		
		Gerente joaquim = new Gerente(); 			//Criando um objeto de uma classe filha
		joaquim.setSalario(2000.0);
		System.out.println("Bônus Gerente: R$" +joaquim.getBonus());
		//*Teste de acesso ao sistema		
		System.out.println("\nJoaquim (Gerente) Tentativa de acesso ao sistema: ");
		joaquim.validarSenha(senhaDoSistema);    //Verificando a senha do sistema. Obs: Esse metodo veio da interface "InterfaceDeAutenticacao"


		
		Cliente rosa = new Cliente(); 			//Criando um objeto de uma classe filha
		rosa.setNome("Rosa");
		//*Teste de acesso ao sistema		
		System.out.println("\nJoaquim (Gerente) Tentativa de acesso ao sistema: ");
		rosa.validarSenha(senhaDoSistema);    //Verificando a senha do sistema. Obs: Esse metodo veio da interface "InterfaceDeAutenticacao"
		
		
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		

		totalizador.adicionaBonus(joaquim); //passando um objeto como parametro
		totalizador.adicionaBonus(joao);    //passando um objeto como parametro
		totalizador.adicionaBonus(erik);    //passando um objeto como parametro
		System.out.println("\nTotalizador de bonus: R$" +totalizador.getTotal());
		
		
	}//main

}
