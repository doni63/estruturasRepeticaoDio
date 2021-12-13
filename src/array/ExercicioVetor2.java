package array;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		// Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima consoantes
		Scanner sc = new Scanner(System.in);
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		
		int count = 0;
		do {
			String letra = sc.next();
			if(!(letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u") ||
					letra.equalsIgnoreCase("A") ||
					letra.equalsIgnoreCase("E") ||
					letra.equalsIgnoreCase("I") ||
					letra.equalsIgnoreCase("O") ||
					letra.equalsIgnoreCase("U"))) {
				consoantes[count] = letra;
				quantidadeConsoantes ++;
			}
			
			count++;
		}while(count < consoantes.length);
		
		System.out.print("\nConsoantes digitados: ");
		for (String string : consoantes) {
			if(string != null)
			System.out.print(string + " ");
		}
		System.out.print("\nQuantidade de consoantes digitadas: " + quantidadeConsoantes);
	}

}
