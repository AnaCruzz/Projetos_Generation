package lista4;

import java.util.Scanner;

public class exercicio7 {
 //Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500
	public static void main(String[] args) {
		
		int numero, somaNumeros=0, mediaDosNumerosMultiplosDeTres=0, i;
		Scanner ler = new Scanner(System.in);
		
		for(i=1; i <= 500; i++);{
			if(i %2 !=0 && i %3 == 0) {
				somaNumeros= somaNumeros+i;
				System.out.println(" A soma dos n�meros multiplos de 3 �: " +somaNumeros);
				
			}
		}
}
}
