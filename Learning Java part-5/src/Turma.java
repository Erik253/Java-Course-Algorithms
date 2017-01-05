//Using the command "length"

public class Turma {
	
	Aluno[] alunos;
	
	
	/**
	 * Esse metodo mostra o nome de cada aluno e sua respectiva nota
	 */
	void showValues() {
		
		for(int i =0; i <this.alunos.length; i++){ // O comando lengh serve para dizer o tamanho do vetor
			System.out.println("Nome do aluno: " +this.alunos[i].nome);
			System.out.println("Nota do aluno: " +this.alunos[i].nota);			
			System.out.println("-------------------------");				
			
		}//for
		
	
		
		
	}//showvalues
	
}//class




