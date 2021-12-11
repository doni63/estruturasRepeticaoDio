package array;

import java.util.Scanner;

//Criar um programa que lê um vetor de 6 caracteres e informe quantas consoantes foif(ram lidas e imprima essas consoantes.
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] consoantes = new String[6];
		int quantidadeConsoante = 0;
		
		int count = 0;
		do {
			System.out.println("Entre com as letras: ");
			String letra = sc.next();
			
			if(!(letra.equalsIgnoreCase("a") || 
					letra.equalsIgnoreCase("e") || 
					letra.equalsIgnoreCase("i") || 
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u"))) {
				consoantes[count] = letra;
				quantidadeConsoante ++;
			}
			count ++;
		}while(count < consoantes.length);
		
		for( String consoante: consoantes) {
			if(consoante != null)
				System.out.print(consoante + " ");
			
		}
		System.out.print("\nQuantidade de consoantes: " + quantidadeConsoante);
	}

}
