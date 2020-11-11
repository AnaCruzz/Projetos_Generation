programa
{
	//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	
	funcao inicio()
	{
		real N1[l][c] , N2[l][c], M1[l][c] , M2[l][c] 
		inteiro l =4 , c =6  

		para(l=0; < l; l++){
			para(c=0; < c  ;c++){
				escreva(" Valor de N1" , (l+1) , (c+1))
				leia(N1[l][c])
		     }
		}

		para(l=0; < l; l++){
			para(c=0; < c ;c++){
				escreva(" Valor de N2" , (l+1) , (c+1))
				leia(M1[l][c])
			}		
		}
	

		// Matrizes soma e diferença

		para(l=0; < l; l++){
			para(c=0; < c;c++){
				escreva(" Valor de M" , (l+1) , (c+1))
				leia(M1[l][c])
				
				M1[l][c]=N1[l][c]+ N2[l][c]
				M2[l][c]=N2[l][c]- N2[l][c]
				
			}
			}
			escreva("Soma matriz M1: " , M1[l][c])
			escreva("Diferença M2: " , M2 [l][c])
				
				
			
	
}

}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */