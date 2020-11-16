package lista2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int idade, ia,ib,ja,jb, adulto;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite a Idade:");
		idade =ler.nextInt();
		
		if(idade >= 5 && idade<= 7) {
		System.out.println("Você pertence a categoria Infantil A");
		
	} else if (idade >= 8 && idade<= 11) {
		System.out.println("Você pertence a categoria Infantil B");
		
	} else if (idade >= 12 && idade<= 13) {
		System.out.println("Você pertence a categoria Juvenil A");
	}else if (idade >= 14 && idade<= 17) {
		System.out.println("Você pertence a categoria Juvenil B");
	} else if (idade >= 18){
		System.out.println("Você pertence a categoria Adulto");
	}
		
	
	}
}
