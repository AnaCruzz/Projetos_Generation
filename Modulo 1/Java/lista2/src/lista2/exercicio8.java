package lista2;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		int n;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n =ler.nextInt();
		
		if(n >=100) {
			System.out.println(" n vale: "+ n);
		} else if (n <100) {
			n=0;
			System.out.println("n vale:" + n);
		}
	}

}
