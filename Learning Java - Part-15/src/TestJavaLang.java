
public class TestJavaLang {

	public static void main(String[] agrs){
		
		Conta c1 = new Conta(500.00);
		Conta c2 = new Conta(500.00);		
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Cliente joao = new Cliente();
		armario.adiciona(joao);
		
		Conta c1NoArmario   = (Conta)  armario.pega(0); //Object
		System.out.println("x"  +c1NoArmario);
		System.out.println("xx" +c1NoArmario);	

		
		System.out.println(  c1.toString()  );	//Metodo Herdado da classe object que esta no pacote java.lang
												//Porém sobreecrevi esse metodo
		
		if( c1.equals (c2) ){ 	//Metodo Herdado da classe object que esta no pacote java.lang
			                    //Porém sobreecrevi esse metodo
			System.out.println("C1 e C2 são Iguais");
		}else{
			System.out.println("C1 e C2 são diferentes");
			
		}
		
		
		
	}//main
	
	
}//class
