programa
{
	
	funcao inicio()
	{
		//RESOLVA O PROBLEMA ABAIXO: Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
		//trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 
		//50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho
		//vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.

		real = codigoTrabalhador, horasTrabalhadas, valorHorasTrabalhadas, valorHoraExtra, salarioParcial, horasExtras, salarioTotal
		
		valorHorasTrabalhadas = 10.00 
		valorHoraExtra = 20.00
		
		escreva("\nDigite o código do trabalhador: ,")
		leia(codigoTrabalhador)
		escreva("/n Digite a quantidade de horas trabalhadas:  ")
		leia(horasTrabalhadas)

		salarioParcial = (horasTrabalhadas * valorHorasTrabalhadas)
		horasExtras = ((horasTrabalhadas - 50) * valorHoraExtra)
		salarioTotal =(salarioParcial + horasExtras)
		


		se (salarioParcial <=50) {
			escreva("Salario Total:", salarioTotal, " SEM HORAS EXTRAS")
			
				} senao se (salarioParcial >=60 e horasExtras>=1) {
			escreva("Valor a receber de horas extras: " , horasExtras, " Salario Total: ", salarioTotal) 
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1034; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */