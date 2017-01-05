//Using array

public class Programa_11 {
	
		public static void main(String[] args){
			
			int[] notas = new int[10]; //Declaring an array
			
			int j=0;
			
			
			//Fill with values
			for (int i =0; i<10; i++){				
				notas[i] = j+1;	
				j++;
			}//for			
			
			
			//Show values
			for (int i =0; i<10; i++){
				
				System.out.println("Array position " +i+ " : " +notas[i]);			
				
			}//for

		}//main
	}



