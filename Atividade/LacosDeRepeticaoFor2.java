package Atividade;

import java.util.Scanner;

public class LacosDeRepeticaoFor2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int num, quantPar=0, quantImpar=0, x;
			
			Scanner leia = new Scanner(System.in);
			
			for(x=1;x<=10;x++) {
				System.out.println("\nEntre com um número: ");
				num = leia.nextInt();
				
				if(num % 2 == 0) {
					quantPar++;
				}else {
					quantImpar++;
				}
			}
			
			System.out.println("\nSão: "+quantPar+" Números pares e "+quantImpar+" Números ímpar");

		}

	}