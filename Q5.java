package Atividade.java;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que verifica se a letra digitada pelo usuário é vogal ou consoante.
		
		char letra;
		
		Scanner ler= new Scanner(System.in);
		System.out.println("digite uma letra \n");
		letra=ler.next().charAt(0);
			if(letra =='a'||letra =='e'||letra=='i'||letra=='o'||letra=='u') 
			{
				System.out.printf("a letra é uma vogal");
			}
			else
			{
				System.out.printf("a letra é uma consoante");
			}
	}

}
