//Para usar Threads eh necessario implementar a interface Runnable

public class BarraDeProgresso implements Runnable{

	
	public void run(){              //A palavra 'run' faz com que esse metodo seja iniciado 
		                            //--ao startar a thread
		
		for(int i = 0; i <10000; i++)
			{
				System.out.println("Barra de progresso");
			}//for
		
		}//executa
	
	
}
