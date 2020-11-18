package lista4;

import java.util.Scanner;

public class exercicio7 {
 //Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500
	public static void main(String[] args) {
		
		int numero, somaNumeros=0, mediaDosNumerosMultiplosDeTres=0, i;
		Scanner ler = new Scanner(System.in);
		
		for(i=1; i <= 500; i++);{
			if(i %2 !=0 && i %3 == 0) {
				somaNumeros= somaNumeros+i;
				System.out.println(" A soma dos números multiplos de 3 é: " +somaNumeros);
				
			}
		}
}
}
