//Esse programa executa 2 threads simultaneamente

public class TestaConcorrencia {
	
	public static void main(String[] args) throws InterruptedException{
/*
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1              = new Thread(barra); //Criando uma Thread e passando um objeto para o construtor
		t1.start();                    //Iniciando a thread
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2                   = new Thread(copiador); //Criando uma Thread e passando um objeto para o construtor
		t2.start();                       //Iniciando a thread
*/
		
		Conta c1 = new Conta(500.0);
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}//main
}//class
