package array;

public class Application {

	public static void main(String[] args) {
		int[] vetor = { 0, -5, 8, 4 };
		
		//exibindo na ordem inversa
		for (int i = vetor.length - 1; i >= 0; i--)
			System.out.println(vetor[i]);
	}
	
	
}
