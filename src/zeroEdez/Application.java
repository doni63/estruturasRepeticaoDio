package zeroEdez;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Nota nota = new Nota();
		int nta;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nota: ");
		nta = scaner.nextInt();
		
		while(nta < 0 || nta > 10) {
			System.out.println("Nota inválido \nNota : ");
			nta = scaner.nextInt();
			
		}
		nota.setNota(nta);
		System.out.println(nota.exibir());
		scaner.close();
	}

}
