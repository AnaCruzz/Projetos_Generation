package lista4;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		int i, numero,  par =0, impar =0;
		Scanner ler = new Scanner(System.in);
				
		for (i= 1; i <=10; i++) {
			System.out.println("Digite um número: ");
			numero= ler.nextInt();
			
			if (numero % 2 == 0) {	   
				  par++;
			  }
			
			if (numero % 2 != 0) {
                impar ++;

            } 
		}
		System.out.println(" Numeros pares: " + par + "Números impares" + impar);
	}
}
