package Atividade.java;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que verifica se a letra digitada pelo usu�rio � vogal ou consoante.
		
		char letra;
		
		Scanner ler= new Scanner(System.in);
		System.out.println("digite uma letra \n");
		letra=ler.next().charAt(0);
			if(letra =='a'||letra =='e'||letra=='i'||letra=='o'||letra=='u') 
			{
				System.out.printf("a letra � uma vogal");
			}
			else
			{
				System.out.printf("a letra � uma consoante");
			}
	}

}
