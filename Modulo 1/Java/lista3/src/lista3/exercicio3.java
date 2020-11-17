package lista3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		double fruta, soma;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maças ");
		fruta = ler.nextDouble();
		
		if (fruta<12) {
			soma= fruta * 0.30;
			System.out.println(" O valor a ser pago é de R$"+soma);
		} else {
			soma= fruta * 0.25;
			System.out.println("O valor a ser pago é de R$"+soma);
		}
}
	
}