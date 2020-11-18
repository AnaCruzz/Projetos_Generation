package lista4;

import java.util.Scanner;

public class exercicio3 {

public static void main(String[] args) {
		
		int idade, contador21 =0, contador50 =0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a idade ou digite -99 para encerrar o programa ");
		idade= ler.nextInt();
		
		while (idade!= -99) {
			if (idade <21 )
			contador21++;
			if (idade > 50)
			contador50++;
			System.out.println(" Entre com a idade ");
			idade=ler.nextInt();
		}		
		
		
		System.out.println(  );
		System.out.println(" A quantidade de menores de 21 é: " + contador21+ " \n A quantidade de maiores de 50 é: "+ contador50);
}		
}