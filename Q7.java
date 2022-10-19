package Atividade.java;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que receba do usuário seu peso e altura, calcular o IMC (Índice de Massa Corporal). Exiba na tela qual a classificação da pessoa de acordo com a seguinte tabela:
		
		float peso, altura, imc;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.printf("qual o seu Peso? ");
		
		peso = ler.nextFloat();
		
		System.out.printf("qual a sua Altura?");
		
		altura = ler.nextFloat();
		
		imc=peso/(altura*altura);
		
		System.out.printf("O IMC será %f \n", imc);
		
		if (imc<18.5) 
		{
			System.out.printf("MAGREZA");
		}
		else 
		{
			if (imc>=18.5 && imc<25 )
			{
				System.out.printf("NORMAL");
			}
			else 
			{
				if ( imc>=25 && imc<30 )
				{
					System.out.printf("SOBREPESO");
				}
				else 
				{
					if( imc>=30 && imc<40 )
					{
						System.out.printf("OBESO");
					}
					else
					{	
						System.out.printf("OBESIDADE GRAVE");
					}	
				}
			}
		}
		
		
		
			
			
			
			
	}

}
