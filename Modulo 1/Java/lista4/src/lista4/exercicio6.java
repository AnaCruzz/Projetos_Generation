package lista4;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		int habitantes=20, filhos, filhosTotal=0, i =0, p=1;
		float salario, salarioTotal=0, mediaSalario, mediaFilhos, percentualDePessoasComSalarios =0, maiorSalario =0;
		Scanner ler = new Scanner(System.in);
		
		for (i=1; i<=habitantes; i++) {
			System.out.println(" Digite o seu salario: ");
			salario=ler.nextFloat();
			System.out.println("Digite quantos filhos voc� tem: ");
			filhos=ler.nextInt();
			
			salarioTotal = salarioTotal+ salario;
			filhosTotal = filhosTotal+ filhos;
			
			if (maiorSalario < salario) {
				maiorSalario= salario;
				
			}
			if (salario <= 100) {
				percentualDePessoasComSalarios= (p *100)/habitantes;
				p++;
				
			}
		}
		mediaSalario = salarioTotal/habitantes;
		mediaFilhos = filhosTotal/habitantes;
		
		System.out.println(" A m�dia do sal�rio da popula��o � R$" + mediaSalario);
		System.out.println(" A m�dia do n�mero de filhos �:  " + mediaFilhos);
		System.out.println(" O maior sal�rio � R$" + maiorSalario);
		System.out.println(" O percentual de pessoas com sal�rio at� R$100,00 � de:  " + percentualDePessoasComSalarios);
		
}
}