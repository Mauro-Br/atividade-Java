package Atividade.java;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que receba do aluno o valor de 3 provas, calcule a média aritmética entreelas e exiba na tela se o aluno foi aprovado ou reprovado. Obs: um aluno é aprovado se sua notafor maior ou igual a 6.
		
		
		int nota1,nota2,nota3;
		float media;
		
		Scanner ler= new Scanner(System.in);
		
		
		System.out.printf("qual a sua 1ª nota em Matematica ");
		
		nota1 = ler.nextInt();
		
		System.out.printf("qual a sua 2ª nota em Matematica ");
		
		nota2 = ler.nextInt();
		
		System.out.printf("qual a sua 3ª nota em Matematica ");
	
		nota3 = ler.nextInt();
		
		media= (nota1 + nota2 + nota3) / 3;
		
		
		if (media >= 6) 
		{
			System.out.printf("O aluno PASSOU de ano");
		}
		else 
		{
			System.out.printf("O aluno REPROVOU de ano");
		}
		
	}

}
