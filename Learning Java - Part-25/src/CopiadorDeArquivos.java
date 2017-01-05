//Para usar Threads eh necessario implementar a interface Runnable


public class CopiadorDeArquivos implements Runnable{

	public void run(){    //A palavra 'run' faz com que esse metodo seja iniciado 
                          //--ao startar a thread
		
		
		for(int i = 0; i <10000; i++)
			{
				System.out.println("copiador");
			}//for
		
		}//executa
	}
