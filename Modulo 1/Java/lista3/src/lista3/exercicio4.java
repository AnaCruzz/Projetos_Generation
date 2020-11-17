package lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite um valor");
		numero1= ler.nextInt();
		System.out.println("Digite um valor");
		numero2 = ler.nextInt();
		System.out.println("Digite um valor");
		numero3 = ler.nextInt();
		
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior valor é "+ numero1);
		
		} else if (numero2> numero1 && numero2 > numero3) {
			System.out.println("O maior valor é "+ numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior valor é " + numero3);
		}
}
}