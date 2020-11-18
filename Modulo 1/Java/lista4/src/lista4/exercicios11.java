package lista4;

import java.util.Scanner;

public class exercicios11 {
public static void main(String[] args) {
		
		int numero=0, soma=0, i=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero ");
		numero=ler.nextInt();
		do {
			soma=soma+i;
			i++;
		} while (i <= numero);
		System.out.println("O Numero digitado foi : " + numero + " a soma é : "  +soma);
		
}
}