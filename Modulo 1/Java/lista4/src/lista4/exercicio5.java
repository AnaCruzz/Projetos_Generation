package lista4;

import java.util.Scanner;
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados
public class exercicio5 {
		public static void main(String[] args) {
	
			int numero, somaNumeros=0;
			Scanner ler = new Scanner(System.in);
			
			do {
				System.out.println(" Digite um Numero");
				numero =ler.nextInt();
				 if (numero>=1 && numero<=9) {
					 somaNumeros=somaNumeros+numero;
					 
				 } else {
					 System.out.println(" N�mero invalido");
				 }
			} while (numero!=0);
			
			System.out.println("A soma dos numeros �: " + somaNumeros);
			
			
			
}
}