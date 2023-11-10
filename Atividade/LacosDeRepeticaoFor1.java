package Atividade;

import java.util.Scanner;

public class LacosDeRepeticaoFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		int numero1, numero2, x;
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("\nDigite o último número do intervalo: ");
		numero2 = leia.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("\n Intervalo invalido");
		}else {
			for(x=numero1; x<=numero2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println("\n " + x + " é multiplo de 3 e 5");
				}
			}

		}
		
	}

}
