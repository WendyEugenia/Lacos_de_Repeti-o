package Atividade;

import java.util.Scanner;

public class LacosDeRepeticaoDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(System.in);
			int numero,resultado = 0;
			
			do {
				System.out.println("\nDigite um número inteiro: ");
		        numero = leia.nextInt();
				
		        if(numero > 0) {
		        	resultado += numero;
		        }
		        
			}while (numero !=0);
			
			System.out.println("\nO resultado da soma é: " + resultado);
		}
}