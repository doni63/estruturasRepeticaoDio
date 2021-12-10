package fatorial;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Numero numero = new Numero();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("FATORIAL");
		System.out.println("Entre com valor: ");
		int num = sc.nextInt();
		
		while(num < 0) {
			System.out.println("Valor inválido! \nEntre com valor maior que zero!");
			num = sc.nextInt();
		}
		numero.setFatorial(num);
		numero.calculaFatorial();
		
		System.out.println(num + "! = " + numero.getFatorial());

	}

}
