package exercicios1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
			
		
		int idadeEmDias, ano, mes, dias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Digite a idade em Dias: ");
		idadeEmDias =ler.nextInt();
		
		ano= idadeEmDias /365;
		mes = (idadeEmDias - ano * 360)/30;
		dias = (idadeEmDias - ano * 365) - mes - 30;
		
		System.out.println("A data de nascimento da pessoa é: " + dias + "/" + mes + "/" + ano);
				ler.close();
		
		

	}

}
