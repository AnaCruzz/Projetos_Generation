package lista3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int medida, lado;
		double area= 0;
		Scanner ler= new Scanner(System.in);
		
		System.out.println(" Digite a quantidade de lados do Poligono ");
		lado=ler.nextInt();
		System.out.println(" Digite a medida do Poligono ");
		medida = ler.nextInt();
		
		if(lado == 3) {
			area = medida*2/2;
			System.out.println(" TRIANGULO DE AREA "+ area);
		} else if (lado == 4) {
			area= medida*medida;
				System.out.println("QUADRADO DE AREA " + area);
		} else if (lado == 5) {
			System.out.println("PENTÁGONO");
			
		} else if (lado <3) {
			System.out.println("NÃO É UM POLÍGONO");
		} else if (lado > 5) {
			System.out.println(" POLÍGONO NÃO IDENTIFICADO");
		}
		
}
}