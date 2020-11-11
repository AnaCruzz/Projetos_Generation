programa
{
	
	funcao inicio()
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (Enquanto)

	{
		inteiro idade, cont21=0, cont50=0

		escreva("\n Digite uma idade : ")
		leia (idade)

		enquanto (idade!= -99) {
			se (idade <21 )
			cont21++
			se (idade > 50)
			cont50++
			escreva("\n Digite uma idade :" )
			leia(idade)
			} 
              limpa()
		escreva("\n O total de menores de 21 é : ", cont21)
		escreva("\n o total de maoiores de 50 é : " , cont50)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */