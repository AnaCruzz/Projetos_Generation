programa
{
	
	funcao inicio()
	{
		inteiro = idadeEmDias 
		inteiro = ano, mes, dia

		escreva("\n Digite Idade Em dias:")
		leia (idadeEmDias)

		ano = (idadeEmDias / 365)
		mes = ((idadeEmDias - ano * 365)/30)
		dia = ((idadeEmDias - ano *365) - mes * 30)

			escreva("\n A data de nascimento é:", dia," / ", mes," / " , ano)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */