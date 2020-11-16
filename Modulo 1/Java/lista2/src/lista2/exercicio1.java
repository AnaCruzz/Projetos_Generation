package lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		double execesso, valorMulta, pesoTomates;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor do peso dos tomates: ");
		pesoTomates = ler.nextDouble();
		
		if (pesoTomates <= 50) {
			execesso = 0;
			valorMulta = 0;
			System.out.println(" O peso excedido é: " + execesso + " Valor da Multa: "+"R$"+ valorMulta);
		}
		
		else {
				execesso = pesoTomates - 50; 
				valorMulta = execesso*4.00;
				System.out.println(" O peso excedido é: " + execesso + " Valor da Multa: "+"R$"+ valorMulta);
			
		}

	}

}
