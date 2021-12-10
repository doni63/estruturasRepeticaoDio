package nomeIdade;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nome: ");
			nome = sc.next();
			aluno.setNome(nome);
			if(nome.equals("0")) break;
			System.out.println("Idade: ");
			idade = sc.nextInt();
			aluno.setIdade(idade);
			
		}
		
		
		System.out.println(aluno.exibir());
		
		sc.close();

	}

}
