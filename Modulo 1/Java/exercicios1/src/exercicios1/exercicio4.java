package exercicios1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int DuracaoDoEventoDaFabrica, segundos, minutos, horas;
		Scanner ler = new Scanner(System.in);
				
				System.out.println(" Digite a dura��o do evento: ");
				 DuracaoDoEventoDaFabrica = ler.nextInt();

				 horas = (DuracaoDoEventoDaFabrica / 3600);
				 minutos = (DuracaoDoEventoDaFabrica -(horas * 3600))/60;
				 segundos = (DuracaoDoEventoDaFabrica % 60);

				System.out.println(" O tem de dura��o do evento �: " + horas + " : " + minutos + " : " + segundos);
				ler.close();
	}
		
}
