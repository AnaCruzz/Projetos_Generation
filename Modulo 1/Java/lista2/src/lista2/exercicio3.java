package lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, quadrado1, quadrado2, quadrado3, quadrado4;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite em numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite em numero: ");
		num2 = ler.nextInt();
		System.out.println("Digite em numero: ");
		num3 = ler.nextInt();
		System.out.println("Digite em numero: ");
		num4 = ler.nextInt();
		
		        quadrado1 = (num1*num1);
				quadrado2 =(num2*num2);  
			    quadrado3 = (num3*num3);
			    quadrado4 = (num4 *num4); 
		
		if(quadrado3 >= 1000) {
			System.out.println(" O quadrado da variavel num3 é maior igual a 1000");
			
		} else if (quadrado3 < 1000) {
			System.out.println("Primeiro numero "  +num1 + " Quadrado: " + quadrado1);
			System.out.println("Segundo numero "  +num2 + " Quadrado: " + quadrado2 );
			System.out.println("Treceiro numero "  +num3 + " Quadrado: " + quadrado3 );
			System.out.println("Quarto numero "  +num4 + " Quadrado: " + quadrado4 );
			
		}
}
}