package lista4;

import java.util.Scanner;
//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero)

public class exercicio4 {

public static void main(String[] args) {
		
		int numeros, mediaDosNumerosMultiplosDeTres =0, i,somaNumerosMultiplos =0, contadorNumeros=0;
		Scanner ler = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println(" Digite um numero ");
		numeros= ler.nextInt();
		 	if (numeros %3 ==0 && numeros!=0) {
		 		somaNumerosMultiplos= somaNumerosMultiplos+numeros;
		 		contadorNumeros++;
		 	}
		 		 
		 		
		} while (numeros!= 0);
		
		 	
		 	 mediaDosNumerosMultiplosDeTres = somaNumerosMultiplos/contadorNumeros;
		 	 System.out.println("A media dos numeros m�ltiplos de 3 � " +  mediaDosNumerosMultiplosDeTres);
}
}