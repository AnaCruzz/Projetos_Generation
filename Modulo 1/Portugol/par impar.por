programa
{
	
	funcao inicio()
	{
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares

		inteiro i, num,  par =0, imp =0
		
	
		
		para (i =1 ; i <= 10 ; i++){
		 escreva("Digite um numero  ", i )
		 leia(num)
		  
		  se (num % 2 == 0) {	   
		  par++ 
		  }

			se 	
                    (num % 2 != 0) {
                    imp ++

                     } 

                  
		}
                     escreva("\n Pares : " , par) 
                      escreva (" \n Impares : " , imp )     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */