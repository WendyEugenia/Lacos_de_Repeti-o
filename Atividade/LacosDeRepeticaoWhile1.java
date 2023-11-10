package Atividade;

import java.util.Scanner;

public class LacosDeRepeticaoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int idade,quantMenor21=0,quantMaior50=0;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("\nEntre com a sua idade: ");
			idade = ler.nextInt();
			
			while(idade>=0) {
				if(idade<21) {
					quantMenor21++;
				}
				if(idade>50) {
					quantMaior50++;
				}
				
				System.out.println("\nEntre com a sua idade: ");
				idade = ler.nextInt();
			}
			
			System.out.println("\nTemos: "+quantMenor21+" pessoas com menos de 21 anos");
			System.out.println("\nTemos: "+quantMaior50+" pessoas com mais de 50 anos");

		}

	}