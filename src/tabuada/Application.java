package tabuada;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Numero tabuada = new Numero();
		Scanner sc = new Scanner(System.in);
		String aux;
		char opcao = 's';
		
		System.out.println("TABUADA");
		while(opcao == 's' || opcao == 'S') {
			System.out.println("Digite um valor entre 1 e 10");
			int numero = sc.nextInt();
			while(numero < 1 || numero > 10) {
				System.out.println("Valor inválido!!\nDigiete um valor entre 1 e 10: ");
				numero = sc.nextInt();
			}
			tabuada.setTabuada(numero);
			tabuada.calculaTabuada();
			System.out.println("Calcular nova tabuada [S]-Sim [N]-Não");
			aux = sc.next();
			opcao = aux.charAt(0);
		}
		
		sc.close();

	}

}
