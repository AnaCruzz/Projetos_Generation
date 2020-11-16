package lista2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int numero, par =0, impar =0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		numero=ler.nextInt();
		
		if(numero % 2 ==0) {
		System.out.println("Numero PAR");
		}		
		else if (numero % 2 != 0){
			System.out.println("Numero IMPAR");	
			}
		
		if(numero > 0) {
			System.out.println("Numero POSITIVO");
			
		} else if (numero < 0) {
			System.out.println("Numero NEGATIVO");
				
			}
		}
}
	
