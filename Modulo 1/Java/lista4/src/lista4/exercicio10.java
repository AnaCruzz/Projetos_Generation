package lista4;

import java.util.Scanner;

public class exercicio10 {
public static void main(String[] args) {
		
		int contador=233;
		Scanner ler = new Scanner(System.in);
		
		do {
			if (contador >= 233 && contador <=299 ) {
				contador+=5;
				System.out.println(contador);
			}
			else if (contador >= 300 && contador <= 400) {
				 contador+=3;
				System.out.println(contador);
			}
			else if (contador >=401 && contador>=456){
				contador+=5;
				System.out.println(contador);
			}
		} while (contador <456);
		

}
}