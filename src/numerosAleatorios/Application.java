package numerosAleatorios;

import java.util.Random;

// Faça um programa que leia 20 numeros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final mostre os números e seus sucessores
public class Application {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = aleatorio.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("Numeros aleatorios: ");
		for (int i : numerosAleatorios) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nSucessores numeros aleatorios: ");
		for(int i : numerosAleatorios) {
			System.out.print((i+1) + " ");
		}
	}

}
