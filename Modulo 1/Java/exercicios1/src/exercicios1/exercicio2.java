package exercicios1;

import java.util.Scanner;

public class exercicio2 {
		/*2.	O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
		 * 		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
		 */
	public static void main(String[] args) {
		double custoConsumidor, custoFabrica, porcetamgemDistribuidorEImpostos;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o custo de f�brica do Veiculo: ");
		custoFabrica = ler.nextDouble();
		
		porcetamgemDistribuidorEImpostos = (custoFabrica * 0.28) + (custoFabrica * 0.45);
		custoConsumidor = custoFabrica + porcetamgemDistribuidorEImpostos;
		
		System.out.println("O custo final ao consumidor ser� de : " + custoConsumidor);
		ler.close();
		
		
		
		
		
		
		
		

	}

}
