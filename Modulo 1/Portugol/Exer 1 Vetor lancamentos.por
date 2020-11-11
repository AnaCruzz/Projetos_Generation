programa
{
	//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.

	funcao inicio()
	{
		inteiro maior =0, lancamentos[10], x , media = 0 , contmaior =0, soma =0
		

		para(x=0; x<10; x++){
		 escreva("Valor do dado : ")
		 leia(lancamentos[x])
		 soma += lancamentos[x]
		  se (lancamentos[x]>maior){
		  	maior= lancamentos[x]
		  }
		}
		limpa()
		   media= soma/10
		   escreva("\n A média aritmética dos lançamentos é : " , media)
		   
		   escreva("\n")

		   para(x=0; x<10; x++){
		   	se( maior == lancamentos[x]){
		   		contmaior++ 
		   	}
		   }
		   escreva("\n")
		   
		   escreva(" As ocorrencias de maior valor foram  : " , contmaior)
		   escreva("\n")
		}
		
		 
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */