package exercicios1;

import java.util.Scanner;

public class exercicio1 {
		/*1.	Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * 		Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
		 */
	public static void main(String[] args) {
	 float mediaFinal, nota1, nota2, nota3;
	 Scanner ler = new Scanner (System.in);
	 
	 System.out.println("Entre com a Nota: ");
	 nota1 =ler.nextFloat();
	 
	 System.out.println("Entre com a Nota: ");
	 nota2 =ler.nextFloat();
	 
	 System.out.println("Entre com a Nota: ");
	 nota3 =ler.nextFloat();
	 
	 mediaFinal=((nota1*2)+(nota2*3)+(nota3*5))/10;
	 System.out.println(" A m�dia final do aluno � :" + mediaFinal);
	  		 ler.close();
	}
		
}
