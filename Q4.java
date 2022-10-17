package Atividade.java;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.printf("Qual o primeiro numero?");
		a = ler.nextInt();
		System.out.printf("Qual o segundo numero?");
		b = ler.nextInt();
		System.out.printf("Qual o terceiro numero?");
		c = ler.nextInt();
		
		if(a>b&&a>c) 
		{
			System.out.printf(" O primeiro é o maior  ",a);
		}
		else 
		{
			if(b>a&&b>c) 
			{
				System.out.printf("O segundo é o maior  ",b);
			}		
			else 
			{	
				if(c>a&&c>b) 
				{
					System.out.printf("O terceiro é o maior  ",c);
				}
			}
		}
	}

}
