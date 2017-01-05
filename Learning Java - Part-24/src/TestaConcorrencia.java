//Esse programa executa 2 threads simultaneamente

public class TestaConcorrencia {
	
	public static void main(String[] args){

		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1              = new Thread(barra); //Criando uma Thread e passando um objeto para o construtor
		t1.start();                    //Iniciando a thread
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2                   = new Thread(copiador); //Criando uma Thread e passando um objeto para o construtor
		t2.start();                       //Iniciando a thread
		
	}//main
}//class
