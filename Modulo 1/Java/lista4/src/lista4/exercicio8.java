package lista4;

import java.util.Scanner;
//Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o total do somat�rio, a m�dia e o total de valores lidos.
//O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. 
//Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo
public class exercicio8 {

	public static void main(String[] args) {
		int numero, contador =0, soma=0, media, i=0; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Digite um numero ");
		numero=ler.nextInt();
		
		while (numero >=0) {
			soma=soma+numero;
			contador++;
			System.out.println("Digite um numero ");
			numero=ler.nextInt();
		}
		
		media = soma/contador;
		System.out.println("Somat�rio " +soma+ " \n Media " + media + " \n Total de valores lidos " + contador);
	}		
}