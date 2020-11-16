package lista2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		float indiceDePoluicao;
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.UK);
		
		System.out.println("Digite o Indice de Poluição");
		indiceDePoluicao =ler.nextFloat();
		
		if(indiceDePoluicao>= 0.05 && indiceDePoluicao <=0.25) {
			System.out.println("Os indices estão dentro dos níveis aceitáveis");
		} else if (indiceDePoluicao >= 0.3 && indiceDePoluicao <= 0.4) {
			System.out.println("As industrias do Grupo 1 deveram encerram as atividades");
		} else if (indiceDePoluicao >= 0.4 && indiceDePoluicao < 0.5) {
			System.out.println(" As idustrias do Grupo 1 e 2 deveram encerram as atividades");
		} else if (indiceDePoluicao >= 0.5) {
			System.out.println("Todos os grupos deveram encerram suas atividades");
		}else {
			System.out.println("Número inválido");
		}
		
		
}		
}	
		
		