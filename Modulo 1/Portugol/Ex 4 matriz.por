programa
{
	//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores 
	//da primeira diagonal, ou seja, diagonal principal.
	funcao inicio()
	{
		inteiro diagonal =0, soma =0, l, c , mat[3][3]

		

		para(l=0; l<3;l++){
		para (c=0;c<3;c++){
			escreva(" Valor : " ) 
			leia(mat[l][c]) 
			soma+=mat[l][c]
			se (l==c){
				diagonal+= mat[l][c]
			}
			
		}
	}
			limpa()
	        	escreva(" \n Soma dos Valores : " , soma , "\n") 
	        	escreva ("\n Valor da diagonal principal é : " , diagonal, "\n") 
}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */