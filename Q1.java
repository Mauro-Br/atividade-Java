package Atividade.java;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner ler= new Scanner(System.in);
		
			System.out.printf("Qual o numero?");
			
			num = ler.nextInt();
			
			if (num<0) 
			{
				System.out.printf("o seu numero será %d", num*-1);
			}
			else
			{
				System.out.printf("o seu numero será %d",num*1);
			}
		
		
		
	}

}
