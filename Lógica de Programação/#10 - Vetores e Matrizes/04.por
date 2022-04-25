programa {
	
	funcao inicio(){

		inteiro mat[3][3], soma = 0, diagonal = 0
		
		para (inteiro x=0; x<=2; x++){
			para (inteiro y=0; y<=2; y++){
				escreva("Digite um número: ")
				leia(mat[x][y])
				soma = soma + (mat[x][y])
					se(x == y){
					diagonal = diagonal + (mat[x][y])
				}
			}
		}	
		escreva("\nSoma da diagonal principal ", diagonal," \n")
		escreva("\nA soma dos números é ", soma, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */