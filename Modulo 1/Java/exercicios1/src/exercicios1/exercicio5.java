package exercicios1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		int  ano, mes, dia , idadeEmDias;
				Scanner ler = new Scanner(System.in);
				
				System.out.println("Digite o ano: ");
		 		ano = ler.nextInt();
		 		System.out.println(" Digite o mês: ");
		 		mes = ler.nextInt();
		 		System.out.println("Digite o dia: ");
		 		dia = ler.nextInt();
		 		
		 		
				idadeEmDias = (ano * 365 + mes * 30 + dia);

				System.out.println(" Idade em dias é : " + idadeEmDias);
			
				ler.close();

					
	
}	
}
