package interruptores;
// Crie um programa com laço for de 1 a 14, sendo que somente mútiplos de 
//2 sjam impressos. Entretant, quando o loop passar pelo 12, o mesmo deve ser abortado.
public class ExercicioWhile {

	public static void main(String[] args) {
		int[] vetor = new int[14];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (i+1);
		}
		
		for (int i : vetor) {
			if(i % 2 == 0) {
				if(i != 12)
					System.out.print(i + " ");
				else
					break;
			}
			
		}
		

	}

}
