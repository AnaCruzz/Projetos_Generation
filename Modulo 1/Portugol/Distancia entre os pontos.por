programa
{
	inclua biblioteca Matematica-->mat
	
	
	funcao inicio()
	{
		inteiro = x1,y1,x2,y2,d
		

			escreva("Calcular a distancia entre dois pontos")

			escreva("Valor de x1")
			leia(x1)
			escreva("Valor de y1")
			leia(y1)
			escreva("Valor de x2")
			leia(x2)
			escreva("Valor de y2")
			leia(y2)

			d= mat.raiz( (x2-x1)^2+(y2-y1)^2 , 2)
			escreva("/n Adistancia entre os pontos é de: ", d)
			
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */