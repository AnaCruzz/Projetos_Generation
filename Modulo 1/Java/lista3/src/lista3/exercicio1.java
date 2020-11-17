package lista3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int valor1, valor2;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite um valor");
		valor1= ler.nextInt();
		System.out.println("Digite um valor");
		valor2 = ler.nextInt();
		
		if(valor1==valor2) {
			System.out.println("Os valores digitados são iguais" + " \n Digite outro valor");
			valor2=ler.nextInt();
		
		} else if (valor1>valor2) {
			System.out.println("O maior valor é "+ valor1);
		} else if (valor2> valor1) {
			System.out.println("O maior valor é " + valor2);
		}
	}

}
