package parImpar;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux, n, numeroPar = 0, numeroImpar = 0;

		System.out.println("Quantidade de numeros: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com valor: ");
			aux = sc.nextInt();
			if (aux % 2 == 0)
				numeroPar += 1;
			else
				numeroImpar += 1;
		}

		Numero numero = new Numero();
		numero.setNumeroPar(numeroPar);
		numero.setNumeroImpar(numeroImpar);

		System.out.println(numero.exibir());
		sc.close();
	}

}
