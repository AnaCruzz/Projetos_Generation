package lista4;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero ");
		numero=ler.nextInt();
		
		while (numero<= 100) {
			
			numero=numero*3;
			System.out.println("Numeros " + numero);
		}
}
}