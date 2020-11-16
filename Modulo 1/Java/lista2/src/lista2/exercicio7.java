package lista2;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		int base, altura, areaTriangulo;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura:");
		altura=ler.nextInt();
		System.out.println("Digite o valor da base:");
		base =ler.nextInt();
		
		if(altura > 0 && base > 0) {
			areaTriangulo = base*altura/2;
			System.out.println("A area do triangulo é: " + areaTriangulo);
		}
}
}