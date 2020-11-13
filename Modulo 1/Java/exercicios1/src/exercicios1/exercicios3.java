package exercicios1;

import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		
		int a, b, c, s, r, d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		 a =ler.nextInt();
		 
		 System.out.println("Entre com o valor de B: ");
		 b =ler.nextInt();
		 
		 System.out.println("Entre com o valor de C: ");
		 c =ler.nextInt();
		 
		 r = (a + b)*2;
		 s = (b + c )*2;
		 
		 d= (r + s)/2;
		 
		 System.out.println(" O valor de D é: " + d);
		 ler.close();
	}
	
}
