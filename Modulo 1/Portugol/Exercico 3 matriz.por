programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6] , N2[4][6] , x , y , M1[4][6] , M2[4][6] 


		// N1
		para(x=0; x<4; x++){
			para(y=0; y<6; y++){
				
				escreva("Valor para Matriz N1 " )
				leia(N1[x][y])
				
			}
		}
		limpa()
		// N2 
		para(x=0; x<4; x++){
			para(y=0; y<6;y++){
				
				escreva("Valor para Matriz N2 " )
				leia(N2[x][y])
			}
		}
		limpa()	
				escreva("\n A Soma das Matrizes N1 e N2 é: " )
		para(x=0; x<4; x++){
			 para(y=0; y<6;y++){
		              M1[x][y] = N1[x][y] + N2[x][y]
			 escreva(" [ " , M1[x][y] , " ] ")
			 
			 escreva("\n")
				
			 }
		}

		escreva(" \n A diferença entre as matrizes N1 - N2 é ")
		para(x=0; x<4; x++){
			  para(y=0; y<6;y++){
		             M2[x][y] = N2 [x][y] - N2[x][y]
			 escreva(" [ " , M2[x][y] , " ] ")
			 
			 escreva("\n")
				
			  }
		}
		}	
		
		
         
		
				
				
				
			
	}
	         


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */