package lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int codigoTrabalhador;
		double horasTrabalhadas, valorHorasTrabalhadas, valorHoraExtra, salarioParcial, horasExtras, salarioTotal;
		Scanner ler = new Scanner(System.in);
		
		valorHorasTrabalhadas = 10.00; 
		valorHoraExtra = 20.00;
		System.out.println("Digite o codigo do trabalhador:");
		codigoTrabalhador= ler.nextInt();
		System.out.println("Digite a quantidade de horas trabalhas: ");
		horasTrabalhadas =ler.nextDouble();
		
				salarioParcial = (horasTrabalhadas * valorHorasTrabalhadas);
				horasExtras = ((horasTrabalhadas - 50) * valorHoraExtra);
				salarioTotal =(salarioParcial + horasExtras);
				
				if (salarioParcial <= 50) {
					horasExtras =0;
					System.out.println(" O salario do trabalhador codigo " + codigoTrabalhador + " É R$:"+ salarioParcial+" SEM HORAS EXTRAS"+ "R$" + horasExtras);
					
				}
				else if (salarioParcial > 50 && horasExtras >=1); {
				System.out.println(" O salario do trabalhador codigo " + codigoTrabalhador + " É R$:"+ salarioParcial+ " + HORAS EXTRAS " + horasExtras+ " Salario Total: "
				+ salarioTotal );
				}
				
				
		
	}

}
