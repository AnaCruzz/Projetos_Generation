package lista3;

import java.util.Scanner;

public class caseee {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int dia = 0;
		 
        System.out.println("Digite um numero para encontrar o seu dia: ");
        dia = ler.nextInt();
 
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter�a");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("N�mero digitado � inv�lido!!!");
                break;
        				}
}
}