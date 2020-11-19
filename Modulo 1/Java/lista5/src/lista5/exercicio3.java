package lista5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.UK);

		int maior =0,  x , media = 0 , contmaior =0, soma =0;
		int [] arrayLancamentos = new int [10];
		

		for (x=0; x<10; x++){
		 System.out.println("Valor do dado : ");
		 arrayLancamentos[x]= ler.nextInt();
		 soma += arrayLancamentos[x];
		  if (arrayLancamentos[x]>maior){
		  	maior= arrayLancamentos[x];
		  }
		}
	
		   media= soma/10;
		   System.out.println("\n A média aritmética dos lançamentos é : " + media);
		   
		   System.out.println(   );

		   for (x=0; x<10; x++){
		   	if ( maior == arrayLancamentos[x]){
		   		contmaior++; 
		   	}
		   }
		   System.out.println("  ");
		   
		   System.out.println(" As ocorrencias de maior valor foram  : " + contmaior);
		   
}
}