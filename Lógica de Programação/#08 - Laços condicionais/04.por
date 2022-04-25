programa
{
	
	funcao inicio()
	{
		inteiro num
		escreva ( "Insira um número\n")
		leia (num)
		se (num == 0 ){
			escreva ( "É nulo")
		}
		senao{
			se (num%2 == 0){
				escreva ("É par")
			}
			senao{
				escreva ("É impar")
			}
			se (num < 0 ){
				escreva ( " e negativo")
			}
			senao{
				escreva (" e positivo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */